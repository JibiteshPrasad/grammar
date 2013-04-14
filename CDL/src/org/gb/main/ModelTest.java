package org.gb.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gb.cdl.generator.ModelGenerator;
import org.gb.cdl.generator.beans.ModelBean;
import org.gb.cdl.grammar.CDLv1Lexer;
import org.gb.cdl.grammar.CDLv1Parser;
import org.gb.cdl.listeners.ModelListener;

public class ModelTest {
	
	public static void testModelListener(){
		String inputFile = "E:/antlr/dsl/capone/grammar/CDL/input/model.rg";
		try {
			InputStream is = new FileInputStream(inputFile);
			ANTLRInputStream ais = new ANTLRInputStream(is);
			CDLv1Lexer lexer = new CDLv1Lexer(ais);
			CommonTokenStream cts = new CommonTokenStream(lexer);
			CDLv1Parser parser = new CDLv1Parser(cts);
			ParseTree ptree = parser.model();
			
			ParseTreeWalker ptw = new ParseTreeWalker();
			ModelListener ml = new ModelListener(parser);
			ptw.walk(ml, ptree);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void testModelGenerator(ModelBean mb){
//		ModelBean mb = new ModelBean();
//		mb.setModelname("MyModel");
//		FieldBean fb = new FieldBean();
//		fb.setModifier("private");
//		fb.setName("field1");
//		fb.setType("int");
//		mb.addField(fb);
		ModelGenerator.generateCode(mb);
	}

}
