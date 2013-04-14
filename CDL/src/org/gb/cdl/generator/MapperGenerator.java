package org.gb.cdl.generator;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.gb.cdl.generator.beans.FieldBean;
import org.gb.cdl.generator.beans.FunctionBean;
import org.gb.cdl.generator.beans.IfCondition;
import org.gb.cdl.generator.beans.MapperBean;
import org.gb.cdl.generator.beans.ModelBean;
import org.gb.cdl.grammar.CDLMRv1Parser.FunctionBodyContext;
import org.gb.cdl.source.Column;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JConditional;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JVar;

public class MapperGenerator {

	private static final Logger logger = LoggerFactory.getLogger(ModelGenerator.class);

	public static void generateCode( MapperBean mapper, ModelBean model){
		JCodeModel jcm = new JCodeModel();
		try {
			JPackage jp = jcm._package("org.gb.cdl.source");
			JDefinedClass jc = jp._class(mapper.getName());
			JDocComment jdoccomment = jc.javadoc();
			jdoccomment.add("Warning: Generated File. Should not be played with!");

			//			Reference to the model
			String modelname = "org.gb.cdl.source." + mapper.getModel().replaceAll("\"", "");
			Class<?> clazz = null;
			try {
				clazz = Class.forName(modelname);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			JClass modelclass = jcm.ref(clazz);

			//			With version change this is to be modified
			classDeclaration( jcm, jc);

			// A private method to read a line
			//			JType returntype = JType.parse(jcm, "org.gb.cdl.source." + mapper.getModel());



			//			Field[] fields = clazz.getDeclaredFields();
			//			for( Field field : fields ){
			//				Column col = field.getAnnotation(Column.class);
			//				int columnnumber = col.Number();
			//				String setmethod = "set" + field.getName().substring(0,1).toUpperCase() + field.getName().substring(1);
			//				block.directStatement("model." + setmethod + "(Integer.columns[" + columnnumber + "]);");
			//				logger.debug("Column number specified: " + field.getName() + " \t" + columnnumber);
			//			}
			generateReadModel( jc, mapper, model, modelclass);

			generateMap( jcm, jc, mapper, model, modelclass);

			jcm.build(new File("E:/antlr/dsl/capone/grammar/CDL/output"));
		} catch (JClassAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void generateMap( JCodeModel jcm, JDefinedClass jc, MapperBean mapper, ModelBean model, JClass modelclass){

		JMethod mapmethod = jc.method(JMod.PUBLIC, void.class, "map");
		mapmethod._throws(IOException.class);
		mapmethod._throws(InterruptedException.class);
		JVar key = mapmethod.param(LongWritable.class, "key");
		JVar value = mapmethod.param(Text.class, "value");
		JVar context = mapmethod.param(Context.class, "context");
		JBlock block = mapmethod.body();
		JVar line = block.decl(jcm.ref(String.class), "line");
		line.init(value.invoke("toString"));
		JVar modeldecl = block.decl(modelclass, "model");
		modeldecl.init(JExpr._this().invoke("readIntoBean").arg(line));

		logger.debug("Mapper statment: " + mapper.getStatement());
		for( FunctionBean fb : mapper.getFunctionBean() ){
			writeFunctionBody( jcm, jc, fb, modelclass);
		}

		writeMapperBody(jcm, mapmethod, mapper.getRoot(), modelclass, mapper);
	}

	private static void writeMapperBody( JCodeModel jcm, JMethod method, FunctionBean fbean, JClass modelclass, MapperBean mapper){
		JBlock block = method.body();
		List<IfCondition> conditionlist = fbean.getconditions();
		for( IfCondition condition : conditionlist ){
			String cond = condition.getExpression();
			String join = "";
			String[] splitstring = cond.split("and");
			if( splitstring.length > 1){
				join = "&&";
			} else {
				splitstring = cond.split("or");
				join = "||";
			}
			StringBuilder statement = new StringBuilder("");
			for( String clause : splitstring ){
				String cltemp = clause.replace("function", "this");
				String cl = cltemp.replace("()", "(model)");
				statement.append(cl);
				statement.append(" " + join + " ");
			}

			String fstmt = statement.toString().substring(0, statement.toString().length() - 4); 

			//			Getting the return clause
			List<String> returnlist = mapper.getOutput();
			StringBuilder rstmtb = new StringBuilder();
			for( String returnstr : returnlist ){
				String returnstring = returnstr.replace("\"", "");
				String name = returnstring.split("<")[0].trim();
				String type = returnstring.split("<")[1].substring(0, returnstring.split("<")[1].length()-1).trim();
				rstmtb.append("new " + type + "(model.get" + name.substring(0,1).toUpperCase()+ name.substring(1) + "()), ");
			}
			String rstmt = rstmtb.toString().substring(0, rstmtb.toString().length()-2);
			JConditional jcondition = block._if(JExpr.direct(fstmt));
			JBlock tblock = jcondition._then();
			tblock.directStatement("context.write(" + rstmt + ");");

			//			System.out.println(lhs);
			//			System.out.println(rhs);
		}
	}

	private static void writeConditionFunctionExpression(JBlock block, JDefinedClass jc, FunctionBean fbean, JClass modelclass, IfCondition cond, JVar modelref){
		String condition = cond.getExpression();
		String ireturnvalue = cond.getThenclause().replaceAll("\"", "").trim();
		String join = "";
		String[] splitstring = condition.split("and");
		if( splitstring.length > 1){
			join = "&&";
		} else {
			splitstring = condition.split("or");
			join = "||";
		}
		StringBuilder statement = new StringBuilder("");
		for( String clause : splitstring ){
			String cltemp = clause.replace("function", "this");
			String cl = cltemp.replace("()", "(model)");
			statement.append(cl);
			statement.append(" " + join + " ");
		}

		String fstmt = statement.toString().substring(0, statement.toString().length() - 4);
		JConditional jcondition = block._if(JExpr.direct(fstmt));
		JBlock tblock = jcondition._then();

		if( ireturnvalue.contains("true")){
			tblock._return(JExpr.TRUE);
			JBlock eblock = jcondition._else();
			eblock._return(JExpr.FALSE);
		}else{
			String varname = ireturnvalue.split(" ")[1];
			String stmt = "model.get" + varname.substring(0, 1).toUpperCase() + varname.substring(1);
			tblock._return(JExpr.direct(stmt));
		}
	}

	private static void writeConditionExpression(JBlock block, JDefinedClass jc, FunctionBean fbean, JClass modelclass, IfCondition cond, JVar modelref){
		String condition = cond.getExpression();
		String ireturnvalue = cond.getThenclause().replaceAll("\"", "").trim();
		String[] splitstring = condition.split("[>,+,-,<,>=,<=,==]");
		String first = splitstring[0];
		String second = null;
		if (splitstring[1].isEmpty() ){
			second = splitstring[2];
		}else{
			second = splitstring[1];
		}

		String key = first.split("[\\.]")[1];

		String lhs = modelref.name() + ".get" + key.substring(0,1).toUpperCase() + key.substring(1) + "()";
		String rhs =  second.split("[\\)]")[0];

		JConditional jcondition = block._if(JExpr.direct(lhs + " == " + rhs));
		JBlock tblock = jcondition._then();
		if( ireturnvalue.contains("true")){
			tblock._return(JExpr.TRUE);
			JBlock eblock = jcondition._else();
			eblock._return(JExpr.FALSE);
		}else{
			String varname = ireturnvalue.split(" ")[1];
			String stmt = "model.get" + varname.substring(0, 1).toUpperCase() + varname.substring(1);
			tblock._return(JExpr.direct(stmt));
		}

		System.out.println(lhs);
		System.out.println(rhs);
	}

	private static void writeFunctionBody( JCodeModel jcm, JDefinedClass jc, FunctionBean fbean, JClass modelclass){
		String returntype = fbean.getReturntype();
		String funcname = fbean.getName();
		List<IfCondition> conditionlist = fbean.getconditions();
		Class<?> returntypeclass = getClass(returntype);
		JMethod method = jc.method(JMod.PRIVATE, returntypeclass, funcname);
		JVar modelref = method.param(modelclass, "model");
		logger.debug("Generating code for function: " + fbean.getName());
		JBlock block = method.body();
		for( IfCondition condition : conditionlist ){
			logger.debug("Parsing condition: " + condition.getExpression());
			if( !condition.getExpression().contains("function")){
				writeConditionExpression(block, jc, fbean, modelclass, condition, modelref);
			}else{
				writeConditionFunctionExpression(block, jc, fbean, modelclass, condition, modelref);
			}
		}
		List<String> statementlist = fbean.getStatement();
		for( String statement : statementlist){
			if( statement.contains("return")){
				String varname = statement.split(" ")[1];
				String stmt = "model.get" + varname.substring(0, 1).toUpperCase() + varname.substring(1);
				block._return(JExpr.direct(stmt));
			}
		}

	}

	private static void generateReadModel( JDefinedClass jc, MapperBean mapper, ModelBean model, JClass modelclass){

		JMethod readmethod = jc.method(JMod.PRIVATE, modelclass, "readIntoBean");
		readmethod.param(String.class, "line");
		JBlock block = readmethod.body();
		block.directStatement("String[] columns = line.split(\",\");");
		JVar modeldecl = block.decl(modelclass, "model");
		modeldecl.init(JExpr._new(modelclass));

		for ( FieldBean fb : model.getFields()){
			String number = fb.getColnumber();
			String type = fb.getType();
			String name = fb.getName();
			String setmethod = "model.set" + name.substring(0,1).toUpperCase() + name.substring(1) + "(REPLACE);";
			String stmt = getReplaceString(type).replace("COLUMN", "columns[" + number + "]");
			String finalstmt = setmethod.replace("REPLACE", stmt);
			logger.debug("Statement: " + finalstmt);
			block.directStatement(finalstmt);
		}

		block.directStatement("return model;");
	}

	private static String getReplaceString( String type){
		String returnstring = "";
		switch(type){
		case "char":
			returnstring = "COLUMN.toCharArray()[0]";
			break;
		case "int":
			returnstring = "Integer.parseInt(COLUMN)";
			break;
		case "float":
			returnstring = "Float.parseFloat(COLUMN)";
			break;
		default:
			returnstring = "COLUMN";
		}
		return returnstring;
	}

	private static void classDeclaration( JCodeModel jcm, JDefinedClass jc){
		JClass ecl= jcm.ref(Mapper.class);
		JClass gclass1 = jcm.ref(LongWritable.class);
		JClass gclass2 = jcm.ref(Text.class);
		JClass gclass3 = jcm.ref(IntWritable.class);
		JClass fclass1 = ecl.narrow(gclass1);
		JClass fclass2 = fclass1.narrow(gclass2);
		JClass fclass3 = fclass2.narrow(gclass2);
		JClass fclass4 = fclass3.narrow(gclass3);
		jc._extends(fclass4);
	}

	private static Class<?> getClass( String type ){
		switch(type){
		case "boolean": 
			logger.debug("Type is int");
			return boolean.class;
		case "int": 
			logger.debug("Type is int");
			return int.class;
		case "float":
			logger.debug("Type is float");
			return float.class;
		case "long":
			logger.debug("Type is long");
			return long.class;
		case "double":
			logger.debug("Type is double");
			return double.class;
		case "String":
			logger.debug("Type is String");
			return String.class;
		case "char":
			logger.debug("Type is char");
			return char.class;
		default:
			logger.debug("Type is null. Careful!");
			return null;
		}
	}


}
