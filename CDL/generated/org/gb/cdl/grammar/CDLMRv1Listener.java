// Generated from CDLMRv1.g4 by ANTLR 4.0
package org.gb.cdl.grammar;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CDLMRv1Listener extends ParseTreeListener {
	void enterExpression(CDLMRv1Parser.ExpressionContext ctx);
	void exitExpression(CDLMRv1Parser.ExpressionContext ctx);

	void enterFunctionParamList(CDLMRv1Parser.FunctionParamListContext ctx);
	void exitFunctionParamList(CDLMRv1Parser.FunctionParamListContext ctx);

	void enterParExpression(CDLMRv1Parser.ParExpressionContext ctx);
	void exitParExpression(CDLMRv1Parser.ParExpressionContext ctx);

	void enterElementValue(CDLMRv1Parser.ElementValueContext ctx);
	void exitElementValue(CDLMRv1Parser.ElementValueContext ctx);

	void enterExpressionList(CDLMRv1Parser.ExpressionListContext ctx);
	void exitExpressionList(CDLMRv1Parser.ExpressionListContext ctx);

	void enterReturnStatement(CDLMRv1Parser.ReturnStatementContext ctx);
	void exitReturnStatement(CDLMRv1Parser.ReturnStatementContext ctx);

	void enterBlock(CDLMRv1Parser.BlockContext ctx);
	void exitBlock(CDLMRv1Parser.BlockContext ctx);

	void enterFunctionBody(CDLMRv1Parser.FunctionBodyContext ctx);
	void exitFunctionBody(CDLMRv1Parser.FunctionBodyContext ctx);

	void enterBlockStatement(CDLMRv1Parser.BlockStatementContext ctx);
	void exitBlockStatement(CDLMRv1Parser.BlockStatementContext ctx);

	void enterElementValuePairs(CDLMRv1Parser.ElementValuePairsContext ctx);
	void exitElementValuePairs(CDLMRv1Parser.ElementValuePairsContext ctx);

	void enterElementValuePair(CDLMRv1Parser.ElementValuePairContext ctx);
	void exitElementValuePair(CDLMRv1Parser.ElementValuePairContext ctx);

	void enterParamlist(CDLMRv1Parser.ParamlistContext ctx);
	void exitParamlist(CDLMRv1Parser.ParamlistContext ctx);

	void enterFunctionParam(CDLMRv1Parser.FunctionParamContext ctx);
	void exitFunctionParam(CDLMRv1Parser.FunctionParamContext ctx);

	void enterReturnType(CDLMRv1Parser.ReturnTypeContext ctx);
	void exitReturnType(CDLMRv1Parser.ReturnTypeContext ctx);

	void enterIfStatement(CDLMRv1Parser.IfStatementContext ctx);
	void exitIfStatement(CDLMRv1Parser.IfStatementContext ctx);

	void enterMapreduce(CDLMRv1Parser.MapreduceContext ctx);
	void exitMapreduce(CDLMRv1Parser.MapreduceContext ctx);

	void enterStatement(CDLMRv1Parser.StatementContext ctx);
	void exitStatement(CDLMRv1Parser.StatementContext ctx);

	void enterAnnotation(CDLMRv1Parser.AnnotationContext ctx);
	void exitAnnotation(CDLMRv1Parser.AnnotationContext ctx);

	void enterElementValueArrayInitializer(CDLMRv1Parser.ElementValueArrayInitializerContext ctx);
	void exitElementValueArrayInitializer(CDLMRv1Parser.ElementValueArrayInitializerContext ctx);

	void enterFunctionCall(CDLMRv1Parser.FunctionCallContext ctx);
	void exitFunctionCall(CDLMRv1Parser.FunctionCallContext ctx);

	void enterAnnotationName(CDLMRv1Parser.AnnotationNameContext ctx);
	void exitAnnotationName(CDLMRv1Parser.AnnotationNameContext ctx);

	void enterPrimitiveType(CDLMRv1Parser.PrimitiveTypeContext ctx);
	void exitPrimitiveType(CDLMRv1Parser.PrimitiveTypeContext ctx);

	void enterMaporreduce(CDLMRv1Parser.MaporreduceContext ctx);
	void exitMaporreduce(CDLMRv1Parser.MaporreduceContext ctx);

	void enterReturnThis(CDLMRv1Parser.ReturnThisContext ctx);
	void exitReturnThis(CDLMRv1Parser.ReturnThisContext ctx);

	void enterFunctionDeclaration(CDLMRv1Parser.FunctionDeclarationContext ctx);
	void exitFunctionDeclaration(CDLMRv1Parser.FunctionDeclarationContext ctx);

	void enterDefaultValue(CDLMRv1Parser.DefaultValueContext ctx);
	void exitDefaultValue(CDLMRv1Parser.DefaultValueContext ctx);

	void enterLiteral(CDLMRv1Parser.LiteralContext ctx);
	void exitLiteral(CDLMRv1Parser.LiteralContext ctx);
}