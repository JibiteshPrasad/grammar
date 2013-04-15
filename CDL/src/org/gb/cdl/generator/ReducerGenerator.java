package org.gb.cdl.generator;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.gb.cdl.generator.beans.ReducerBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JForEach;
import com.sun.codemodel.JForLoop;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

public class ReducerGenerator {
	

	private static final Logger logger = LoggerFactory.getLogger(ReducerGenerator.class);

	public static void generateCode( ReducerBean reducer){
		JCodeModel jcm = new JCodeModel();
		try {
			JPackage jp = jcm._package("org.gb.cdl.source");
			JDefinedClass jc = jp._class(reducer.getName());
			JDocComment jdoccomment = jc.javadoc();
			jdoccomment.add("Warning: Generated File. Should not be played with!");

			classDeclaration( jcm, jc);
			
			JMethod reducemethod = jc.method(JMod.PUBLIC, void.class, "reduce");
			reducemethod._throws(IOException.class);
			reducemethod._throws(InterruptedException.class);
			JClass iterablevalue = jcm.ref(Iterable.class);
			JClass narrowediterable = iterablevalue.narrow( getIterableValues(jcm, reducer) );
			JVar key = reducemethod.param( getKey(jcm, reducer), "key" );
			JVar valuelist = reducemethod.param ( narrowediterable, "values" );
			JVar context = reducemethod.param( Context.class, "context" );
			
			
			JBlock block = reducemethod.body();
			JType jint = jcm._ref(int.class);
			jcm.ref(Integer.class);
			JVar mvalue = null;
			String methodinvoke = "";
			if( reducer.getSFunction().contains("max") ){
				mvalue = block.decl( jint, "mvalue");
				mvalue.init(JExpr.direct("Integer.MIN_VALUE"));
				methodinvoke = "max";
			}
			if( reducer.getSFunction().contains("min") ){
				mvalue = block.decl( jint, "mvalue");
				mvalue.init(JExpr.direct("Integer.MAX_VALUE"));
				methodinvoke = "min";
			}
			JForEach jforeach = block.forEach(getIterableValues(jcm, reducer), "value", valuelist);
			JBlock foreachblock = jforeach.body();
			
			JClass jmathclass = jcm.ref(Math.class);
			JInvocation invoker = jmathclass.staticInvoke( methodinvoke ).arg(mvalue).arg(JExpr.direct("value.get()"));
			
			foreachblock.assign( mvalue, invoker);
			
			String contextwrite = "context.write( key, new " + getIterableValuesType( reducer ) + "(mvalue));";
			block.directStatement(contextwrite);
			jcm.build(new File("E:/antlr/dsl/capone/grammar/CDL/output"));
		} catch (JClassAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static JClass getKey( JCodeModel jcm, ReducerBean reducer){
		List<String> inputlist = reducer.getInput();
		String input = inputlist.get(0).replace("\"", "");
		String inputtype = input.split("<")[1].replace(">", "");
		String classname = "org.apache.hadoop.io." + inputtype;
		logger.debug("Key type is: " + classname);
		JClass jclass = null;
		try {
			jclass = jcm.ref(Class.forName( classname ));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return jclass;
	}
	
	private static String getIterableValuesType( ReducerBean reducer ){
		List<String> inputlist = reducer.getInput();
		String input = inputlist.get(1).replace("\"", "");
		String inputtype = input.split("<")[1].replace(">", "");
		return inputtype;
	}
	
	private static JClass getIterableValues( JCodeModel jcm, ReducerBean reducer){
		List<String> inputlist = reducer.getInput();
		String input = inputlist.get(1).replace("\"", "");
		String inputtype = input.split("<")[1].replace(">", "");
		String classname = "org.apache.hadoop.io." + inputtype;
		logger.debug("Iterable type is: " + classname);
		JClass jclass = null;
		try {
			jclass = jcm.ref(Class.forName( classname ));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return jclass;
	}

	private static void classDeclaration( JCodeModel jcm, JDefinedClass jc){
		JClass ecl= jcm.ref(Mapper.class);
		JClass gclass1 = jcm.ref(Text.class);
		JClass gclass2 = jcm.ref(Text.class);
		JClass gclass3 = jcm.ref(IntWritable.class);
		JClass fclass1 = ecl.narrow(gclass1);
		JClass fclass2 = fclass1.narrow(gclass3);
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
