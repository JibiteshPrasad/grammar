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
import org.gb.cdl.generator.ReducerGenerator;
import org.gb.cdl.generator.beans.ModelBean;
import org.gb.cdl.generator.beans.ReducerBean;
import org.gb.cdl.grammar.CDLReducerv1Lexer;
import org.gb.cdl.grammar.CDLReducerv1Parser;
import org.gb.cdl.listeners.ReducerListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReducerTest {
	
private static final Logger logger = LoggerFactory.getLogger(ReducerTest.class);
	
	public static void testReducerListener(){
		String inputFile = "E:/antlr/dsl/capone/grammar/CDL/input/reducer.rg";
		try {
			InputStream is = new FileInputStream(inputFile);
			ANTLRInputStream ais = new ANTLRInputStream(is);
			CDLReducerv1Lexer lexer = new CDLReducerv1Lexer(ais);
			CommonTokenStream cts = new CommonTokenStream(lexer);
			CDLReducerv1Parser parser = new CDLReducerv1Parser(cts);
			ParseTree ptree = parser.reduce();
			
			ParseTreeWalker ptw = new ParseTreeWalker();
			ReducerListener ml = new ReducerListener(parser);
			ptw.walk(ml, ptree);
			
			ReducerBean rb = CDLPortal.getReducerBean();
			logger.debug("Reducer Model is populated.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void testReducerGenerator(ReducerBean reducer, ModelBean model){
		ReducerGenerator.generateCode( reducer );
	}

}
