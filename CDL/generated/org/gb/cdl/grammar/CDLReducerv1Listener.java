// Generated from CDLReducerv1.g4 by ANTLR 4.0
package org.gb.cdl.grammar;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CDLReducerv1Listener extends ParseTreeListener {
	void enterExpression(CDLReducerv1Parser.ExpressionContext ctx);
	void exitExpression(CDLReducerv1Parser.ExpressionContext ctx);

	void enterStaticFunctionCall(CDLReducerv1Parser.StaticFunctionCallContext ctx);
	void exitStaticFunctionCall(CDLReducerv1Parser.StaticFunctionCallContext ctx);

	void enterElementValue(CDLReducerv1Parser.ElementValueContext ctx);
	void exitElementValue(CDLReducerv1Parser.ElementValueContext ctx);

	void enterExpressionList(CDLReducerv1Parser.ExpressionListContext ctx);
	void exitExpressionList(CDLReducerv1Parser.ExpressionListContext ctx);

	void enterReturnStatement(CDLReducerv1Parser.ReturnStatementContext ctx);
	void exitReturnStatement(CDLReducerv1Parser.ReturnStatementContext ctx);

	void enterBlock(CDLReducerv1Parser.BlockContext ctx);
	void exitBlock(CDLReducerv1Parser.BlockContext ctx);

	void enterBlockStatement(CDLReducerv1Parser.BlockStatementContext ctx);
	void exitBlockStatement(CDLReducerv1Parser.BlockStatementContext ctx);

	void enterParamlist(CDLReducerv1Parser.ParamlistContext ctx);
	void exitParamlist(CDLReducerv1Parser.ParamlistContext ctx);

	void enterFunctionParam(CDLReducerv1Parser.FunctionParamContext ctx);
	void exitFunctionParam(CDLReducerv1Parser.FunctionParamContext ctx);

	void enterElementValueArrayInitializer(CDLReducerv1Parser.ElementValueArrayInitializerContext ctx);
	void exitElementValueArrayInitializer(CDLReducerv1Parser.ElementValueArrayInitializerContext ctx);

	void enterAnnotation(CDLReducerv1Parser.AnnotationContext ctx);
	void exitAnnotation(CDLReducerv1Parser.AnnotationContext ctx);

	void enterAnnotationName(CDLReducerv1Parser.AnnotationNameContext ctx);
	void exitAnnotationName(CDLReducerv1Parser.AnnotationNameContext ctx);

	void enterFunctionCall(CDLReducerv1Parser.FunctionCallContext ctx);
	void exitFunctionCall(CDLReducerv1Parser.FunctionCallContext ctx);

	void enterMaporreduce(CDLReducerv1Parser.MaporreduceContext ctx);
	void exitMaporreduce(CDLReducerv1Parser.MaporreduceContext ctx);

	void enterReturnThis(CDLReducerv1Parser.ReturnThisContext ctx);
	void exitReturnThis(CDLReducerv1Parser.ReturnThisContext ctx);

	void enterDefaultValue(CDLReducerv1Parser.DefaultValueContext ctx);
	void exitDefaultValue(CDLReducerv1Parser.DefaultValueContext ctx);

	void enterFunctionParamList(CDLReducerv1Parser.FunctionParamListContext ctx);
	void exitFunctionParamList(CDLReducerv1Parser.FunctionParamListContext ctx);

	void enterParExpression(CDLReducerv1Parser.ParExpressionContext ctx);
	void exitParExpression(CDLReducerv1Parser.ParExpressionContext ctx);

	void enterFunctionBody(CDLReducerv1Parser.FunctionBodyContext ctx);
	void exitFunctionBody(CDLReducerv1Parser.FunctionBodyContext ctx);

	void enterElementValuePair(CDLReducerv1Parser.ElementValuePairContext ctx);
	void exitElementValuePair(CDLReducerv1Parser.ElementValuePairContext ctx);

	void enterElementValuePairs(CDLReducerv1Parser.ElementValuePairsContext ctx);
	void exitElementValuePairs(CDLReducerv1Parser.ElementValuePairsContext ctx);

	void enterReduce(CDLReducerv1Parser.ReduceContext ctx);
	void exitReduce(CDLReducerv1Parser.ReduceContext ctx);

	void enterReturnType(CDLReducerv1Parser.ReturnTypeContext ctx);
	void exitReturnType(CDLReducerv1Parser.ReturnTypeContext ctx);

	void enterIfStatement(CDLReducerv1Parser.IfStatementContext ctx);
	void exitIfStatement(CDLReducerv1Parser.IfStatementContext ctx);

	void enterStatement(CDLReducerv1Parser.StatementContext ctx);
	void exitStatement(CDLReducerv1Parser.StatementContext ctx);

	void enterPrimitiveType(CDLReducerv1Parser.PrimitiveTypeContext ctx);
	void exitPrimitiveType(CDLReducerv1Parser.PrimitiveTypeContext ctx);

	void enterFunctionDeclaration(CDLReducerv1Parser.FunctionDeclarationContext ctx);
	void exitFunctionDeclaration(CDLReducerv1Parser.FunctionDeclarationContext ctx);

	void enterLiteral(CDLReducerv1Parser.LiteralContext ctx);
	void exitLiteral(CDLReducerv1Parser.LiteralContext ctx);
}