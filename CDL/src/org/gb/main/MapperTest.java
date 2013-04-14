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
import org.gb.cdl.generator.MapperGenerator;
import org.gb.cdl.generator.beans.MapperBean;
import org.gb.cdl.generator.beans.ModelBean;
import org.gb.cdl.grammar.CDLMRv1Lexer;
import org.gb.cdl.grammar.CDLMRv1Parser;
import org.gb.cdl.listeners.MapperListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapperTest {
	
	private static final Logger logger = LoggerFactory.getLogger(MapperTest.class);
	
	public static void testMapperListener(){
		String inputFile = "E:/antlr/dsl/capone/grammar/CDL/input/mapper.rg";
		try {
			InputStream is = new FileInputStream(inputFile);
			ANTLRInputStream ais = new ANTLRInputStream(is);
			CDLMRv1Lexer lexer = new CDLMRv1Lexer(ais);
			CommonTokenStream cts = new CommonTokenStream(lexer);
			CDLMRv1Parser parser = new CDLMRv1Parser(cts);
			ParseTree ptree = parser.mapreduce();
			
			ParseTreeWalker ptw = new ParseTreeWalker();
			MapperListener ml = new MapperListener(parser);
			ptw.walk(ml, ptree);
			
			MapperBean mb = CDLPortal.getMapperBean();
			logger.debug("Mapper Model is populated.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void testMapperGenerator(MapperBean mapper, ModelBean model){
		MapperGenerator.generateCode(mapper, model);
	}

}
