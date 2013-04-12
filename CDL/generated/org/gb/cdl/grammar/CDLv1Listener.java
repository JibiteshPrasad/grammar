package org.gb.cdl.grammar;
// Generated from CDLv1.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CDLv1Listener extends ParseTreeListener {
	void enterExpression(CDLv1Parser.ExpressionContext ctx);
	void exitExpression(CDLv1Parser.ExpressionContext ctx);

	void enterFileLocation(CDLv1Parser.FileLocationContext ctx);
	void exitFileLocation(CDLv1Parser.FileLocationContext ctx);

	void enterModel(CDLv1Parser.ModelContext ctx);
	void exitModel(CDLv1Parser.ModelContext ctx);

	void enterElementValue(CDLv1Parser.ElementValueContext ctx);
	void exitElementValue(CDLv1Parser.ElementValueContext ctx);

	void enterExpressionList(CDLv1Parser.ExpressionListContext ctx);
	void exitExpressionList(CDLv1Parser.ExpressionListContext ctx);

	void enterElementValuePairs(CDLv1Parser.ElementValuePairsContext ctx);
	void exitElementValuePairs(CDLv1Parser.ElementValuePairsContext ctx);

	void enterElementValuePair(CDLv1Parser.ElementValuePairContext ctx);
	void exitElementValuePair(CDLv1Parser.ElementValuePairContext ctx);

	void enterFieldDeclarationList(CDLv1Parser.FieldDeclarationListContext ctx);
	void exitFieldDeclarationList(CDLv1Parser.FieldDeclarationListContext ctx);

	void enterModelBody(CDLv1Parser.ModelBodyContext ctx);
	void exitModelBody(CDLv1Parser.ModelBodyContext ctx);

	void enterAnnotation(CDLv1Parser.AnnotationContext ctx);
	void exitAnnotation(CDLv1Parser.AnnotationContext ctx);

	void enterElementValueArrayInitializer(CDLv1Parser.ElementValueArrayInitializerContext ctx);
	void exitElementValueArrayInitializer(CDLv1Parser.ElementValueArrayInitializerContext ctx);

	void enterAnnotationName(CDLv1Parser.AnnotationNameContext ctx);
	void exitAnnotationName(CDLv1Parser.AnnotationNameContext ctx);

	void enterModelType(CDLv1Parser.ModelTypeContext ctx);
	void exitModelType(CDLv1Parser.ModelTypeContext ctx);

	void enterPrimitiveType(CDLv1Parser.PrimitiveTypeContext ctx);
	void exitPrimitiveType(CDLv1Parser.PrimitiveTypeContext ctx);

	void enterFieldDeclaration(CDLv1Parser.FieldDeclarationContext ctx);
	void exitFieldDeclaration(CDLv1Parser.FieldDeclarationContext ctx);

	void enterModelDeclaration(CDLv1Parser.ModelDeclarationContext ctx);
	void exitModelDeclaration(CDLv1Parser.ModelDeclarationContext ctx);

	void enterDefaultValue(CDLv1Parser.DefaultValueContext ctx);
	void exitDefaultValue(CDLv1Parser.DefaultValueContext ctx);

	void enterLiteral(CDLv1Parser.LiteralContext ctx);
	void exitLiteral(CDLv1Parser.LiteralContext ctx);
}