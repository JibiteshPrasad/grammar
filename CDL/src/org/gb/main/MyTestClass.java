package org.gb.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gb.cdl.generator.CDLPortal;
import org.gb.cdl.generator.ModelGenerator;
import org.gb.cdl.generator.beans.MapperBean;
import org.gb.cdl.generator.beans.ModelBean;
import org.gb.cdl.generator.beans.ReducerBean;
import org.gb.cdl.grammar.CDLv1Lexer;
import org.gb.cdl.grammar.CDLv1Parser;
import org.gb.cdl.listeners.ModelListener;

public class MyTestClass {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ModelTest.testModelListener();
		ModelBean model = CDLPortal.getModelBean();
//		ModelTest.testModelGenerator(mb);
//		
//		MapperTest.testMapperListener();
//		MapperBean mb1 = CDLPortal.getMapperBean();
//		MapperTest.testMapperGenerator(mb1 ,model);
		
		ReducerTest.testReducerListener();
		ReducerBean reducer = CDLPortal.getReducerBean();
		ReducerTest.testReducerGenerator(reducer, model);
	}

}
