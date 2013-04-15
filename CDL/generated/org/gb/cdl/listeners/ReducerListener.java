package org.gb.cdl.listeners;

import org.antlr.v4.runtime.TokenStream;
import org.gb.cdl.generator.CDLPortal;
import org.gb.cdl.generator.beans.ReducerBean;
import org.gb.cdl.grammar.CDLReducerv1BaseListener;
import org.gb.cdl.grammar.CDLReducerv1Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReducerListener extends CDLReducerv1BaseListener {
	
	private CDLReducerv1Parser parser;
	private ReducerBean reducer = CDLPortal.getReducerBean();
	private static final Logger logger = LoggerFactory.getLogger(ModelListener.class);

	private String annotationname;

	public ReducerListener( CDLReducerv1Parser parser) {
		this.parser = parser;
	}
	
	@Override 
	public void enterAnnotationName(CDLReducerv1Parser.AnnotationNameContext ctx) { 
		this.annotationname = ctx.getText();
		logger.debug("Annotation Name: " + annotationname);
	}
	
	@Override 
	public void exitMaporreduce(CDLReducerv1Parser.MaporreduceContext ctx) { 
		this.annotationname = ctx.getText();
		if ( this.annotationname != null ){
			this.annotationname = null;
		}
		logger.debug("Annotation Name: " + annotationname);
	}
	
	@Override 
	public void enterElementValuePair(CDLReducerv1Parser.ElementValuePairContext ctx) {
		if( this.annotationname != null && this.annotationname.equals("Reducer") ){
			String text = ctx.getText();
			String[] kv = text.split("=");
			if ( kv[0].equals("Input")){
				for( String value : kv[1].split(",")){
					logger.debug( "Adding input parameters to: " + value);
					reducer.addInput(value);
				}
				
			}
			if ( kv[0].equals("Output")){
				for( String value : kv[1].split(",")){
					logger.debug( "Adding output parameters to: " + value);
					reducer.addOutput(value);
				}
				
			}
		}
	}
	
	@Override 
	public void enterFunctionDeclaration(CDLReducerv1Parser.FunctionDeclarationContext ctx) {
		TokenStream ts = parser.getTokenStream();
		String funcname = ctx.Identifier().getText();
		logger.debug("The function name: " + funcname);
		if( this.annotationname != null && this.annotationname.equals("Reducer") ){
			logger.debug("Parsing the reducer function.");
			reducer.setName(funcname);
			logger.debug("Setting Reducer name to: " + funcname);
		}
	}
		
	@Override 
	public void enterStaticFunctionCall(CDLReducerv1Parser.StaticFunctionCallContext ctx) {
		String sfunction = "Math." + ctx.Identifier().getText();
		reducer.setSFunction(sfunction);
		logger.debug("Static function call: " + sfunction);
	}
	
}
