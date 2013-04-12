package org.gb.cdl.listeners;

import org.antlr.v4.runtime.TokenStream;
import org.gb.cdl.generator.CDLPortal;
import org.gb.cdl.generator.beans.FieldBean;
import org.gb.cdl.generator.beans.ModelBean;
import org.gb.cdl.grammar.CDLv1BaseListener;
import org.gb.cdl.grammar.CDLv1Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelListener extends CDLv1BaseListener{


	private CDLv1Parser parser;
	private ModelBean model = CDLPortal.getModelBean();
	private static final Logger logger = LoggerFactory.getLogger(ModelListener.class);

	private String annotationname;

	public ModelListener( CDLv1Parser parser) {
		this.parser = parser;
	}

	@Override
	public void enterModel( CDLv1Parser.ModelContext ctx){
		logger.debug("Entered into the Model");
	}

	@Override 
	public void enterAnnotationName(CDLv1Parser.AnnotationNameContext ctx){
		this.annotationname = ctx.getText();
		logger.debug("Annotation Name: " + annotationname);
	}

	@Override 
	public void enterElementValuePair(CDLv1Parser.ElementValuePairContext ctx) {
		String text = ctx.getText();
		if ( this.annotationname.equals("File")){
			String[] kv = text.split("=");
			if ( kv[0].equals("Name") ) {
				logger.debug("Setting filepath to: " + kv[1]);
				model.getAnnotations().setFilename(kv[1]);
			}
			if ( kv[0].equals("Delimiter")){
				logger.debug( "Setting delimiter to: " + kv[1]);
				model.getAnnotations().setDelimiter(kv[1]);
			}
		}
		logger.debug("Annotation Value: " + text);
	}
	
	@Override 
	public void enterFieldDeclaration(CDLv1Parser.FieldDeclarationContext ctx) { 
		TokenStream ts = parser.getTokenStream();
		String fieldtype = ts.getText(ctx.primitiveType());
		String fieldname = ctx.Identifier().toString();
		
		FieldBean field = new FieldBean();
		field.setModifier("private");
		field.setName(fieldname);
		field.setType(fieldtype);
		
		model.addField(field);
		logger.debug("Type: " + fieldtype);
		logger.debug("Identifier: " + fieldname);
	}
	
	@Override 
	public void enterModelDeclaration(CDLv1Parser.ModelDeclarationContext ctx) { 
		
	}

}
