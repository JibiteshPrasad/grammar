package org.gb.cdl.listeners;

import org.antlr.v4.runtime.TokenStream;
import org.gb.cdl.generator.CDLPortal;
import org.gb.cdl.generator.beans.FunctionBean;
import org.gb.cdl.generator.beans.IfCondition;
import org.gb.cdl.generator.beans.MapperBean;
import org.gb.cdl.grammar.CDLMRv1BaseListener;
import org.gb.cdl.grammar.CDLMRv1Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapperListener extends CDLMRv1BaseListener{
	
	private CDLMRv1Parser parser;
	private MapperBean mapper = CDLPortal.getMapperBean();
	private static final Logger logger = LoggerFactory.getLogger(ModelListener.class);

	private String annotationname;
	private FunctionBean functionbean;
	private IfCondition condition;
	private boolean isifclause; 

	public MapperListener( CDLMRv1Parser parser) {
		this.parser = parser;
	}
	
	@Override 
	public void enterAnnotationName(CDLMRv1Parser.AnnotationNameContext ctx) { 
		this.annotationname = ctx.getText();
		logger.debug("Annotation Name: " + annotationname);
	}
	
	@Override 
	public void exitMaporreduce(CDLMRv1Parser.MaporreduceContext ctx) { 
		this.annotationname = ctx.getText();
		if ( this.annotationname != null ){
			this.annotationname = null;
		}
		logger.debug("Annotation Name: " + annotationname);
	}
	
	@Override 
	public void enterReturnType(CDLMRv1Parser.ReturnTypeContext ctx) { 
		functionbean.setReturntype(ctx.getText());
	}
	
	@Override 
	public void enterElementValuePair(CDLMRv1Parser.ElementValuePairContext ctx) {
		if( this.annotationname != null && this.annotationname.equals("Mapper") ){
			String text = ctx.getText();
			String[] kv = text.split("=");
			if ( kv[0].equals("Model") ) {
				logger.debug("Setting model to: " + kv[1]);
				mapper.setModel(kv[1]);
			}
			if ( kv[0].equals("Input")){
				for( String value : kv[1].split(",")){
					logger.debug( "Adding input parameters to: " + value);
					mapper.addInput(value);
				}
				
			}
			if ( kv[0].equals("Output")){
				for( String value : kv[1].split(",")){
					logger.debug( "Adding output parameters to: " + value);
					mapper.addOutput(value);
				}
				
			}
		}
	}
	
	@Override 
	public void enterFunctionDeclaration(CDLMRv1Parser.FunctionDeclarationContext ctx) {
		functionbean = new FunctionBean();
		TokenStream ts = parser.getTokenStream();
		String funcname = ctx.Identifier().getText();
		functionbean.setName(funcname);
		logger.debug("The function name: " + funcname);
		if( this.annotationname != null && this.annotationname.equals("Mapper") ){
			logger.debug("Parsing the mapper function.");
			mapper.setRoot(functionbean);
			mapper.setName(funcname);
			return;
		}else{
			mapper.addFunctionBean(functionbean);
		}		
	}
	
	
	@Override 
	public void enterIfStatement(CDLMRv1Parser.IfStatementContext ctx) { 
		condition = new IfCondition();
		isifclause = true;
		functionbean.addCondition(condition);
	}
	
	@Override 
	public void exitIfStatement(CDLMRv1Parser.IfStatementContext ctx) { 
		condition = null;
		isifclause = false;
	}
	
//	@Override 
//	public void enterStatement(CDLMRv1Parser.StatementContext ctx) { 
//		if( !isifclause ){
//			String stmt = ctx.getText();
//			functionbean.addStatement(stmt);
//			logger.debug("Adding statement to function: " + stmt);
//		}
//	}
	
	@Override 
	public void enterParExpression(CDLMRv1Parser.ParExpressionContext ctx) { 
		String expr = ctx.getText();
		condition.setExpression( expr);
		logger.debug("Setting Condition to: " + expr);
	}
	
	@Override 
	public void enterLiteral(CDLMRv1Parser.LiteralContext ctx) { 
		if( isifclause){
			String thenclause = ctx.getText();
			condition.setThenclause("return " + thenclause);
			logger.debug("Setting then clause: return " + thenclause);
		}
	}
	
	@Override 
	public void enterReturnThis(CDLMRv1Parser.ReturnThisContext ctx) { 
		if( isifclause){
			String thenclause = ctx.getText();
			condition.setThenclause(thenclause);
			logger.debug("Setting then clause: " + thenclause);
		}
	}
	
//	@Override 
//	public void enterFunctionCall(CDLMRv1Parser.FunctionCallContext ctx) { 
//		
//	}
}
