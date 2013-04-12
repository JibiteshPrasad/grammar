package org.gb.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gb.cdl.grammar.CDLv1Lexer;
import org.gb.cdl.grammar.CDLv1Parser;
import org.gb.cdl.listeners.ModelListener;

public class MyTestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFile = "E:/workspace/antlr/CDL/input/model.rg";
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

}
