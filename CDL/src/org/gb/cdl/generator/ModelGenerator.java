package org.gb.cdl.generator;

import java.io.File;
import java.io.IOException;

import org.gb.cdl.generator.beans.FieldBean;
import org.gb.cdl.generator.beans.ModelBean;
import org.gb.cdl.source.Column;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JFieldRef;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;

public class ModelGenerator {
	
	private static final Logger logger = LoggerFactory.getLogger(ModelGenerator.class);

	public static void generateCode( ModelBean model){
		JCodeModel jcm = new JCodeModel();
		try {
			JPackage jp = jcm._package("org.gb.cdl.source");
			JDefinedClass jc = jp._class(model.getModelname());
			JDocComment jdoccomment = jc.javadoc();
			jdoccomment.add("Warning: Generated File. Should not be played with!");
			for ( FieldBean bean : model.getFields() ){
				addField( jc, bean );
				addGetterSetter( jc, bean );
			}

			jcm.build(new File("E:/antlr/dsl/capone/grammar/CDL/output"));
		} catch (JClassAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void addField(JDefinedClass jc, FieldBean fb){
		Class<?> clazz = getClass(fb.getType());
		String fieldname = fb.getName();
		int modifier = fb.getModifier() == null ? JMod.PRIVATE : getModifier(fb.getModifier());
		JFieldVar field = jc.field(modifier, clazz, fieldname);
		field.annotate(Column.class).param("Number", Integer.parseInt(fb.getColnumber()));
	}

	private static void addGetterSetter(JDefinedClass jc, FieldBean fb ){
		String name = fb.getName();
		String setter = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
		String getter = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
		
		JMethod setmethod = jc.method(JMod.PUBLIC, void.class, setter);
		setmethod.param(getClass(fb.getType()), name);
		JBlock setblock = setmethod.body();
		setblock.directStatement("this." + name + " = " + name + ";");
		
		JMethod getmethod = jc.method(JMod.PUBLIC, getClass(fb.getType()), getter);
		JBlock getblock = getmethod.body();
		getblock.directStatement("return this." + name + ";");
	}
	
	private static int getModifier( String name){
		if (name.equalsIgnoreCase("private"))
			return JMod.PRIVATE;
		if (name.equalsIgnoreCase("public"))
			return JMod.PUBLIC;
		if (name.equalsIgnoreCase("protected"))
			return JMod.PROTECTED;
		return 0;
	}
	
	private static Class<?> getClass( String type ){
		switch(type){
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
