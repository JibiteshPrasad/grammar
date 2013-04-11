/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar FunctionGrammar;

functionDeclaration
  : 'function' returnType Identifier functionBody
  ;

functionBody
    : '{' functionblock '}'
    ;


functionblock
    : functionStatement*
    ;

functionStatement
    : statement
    ;

statement
    : statement
    | functionCall
    | 'if' parExpression functionStatement ('else' functionStatement)?
    | 'return' expression? ';'
    | ';'
    | statementExpression ';'
    ;

functionCall
    : Identifier
    ;

expression
  : '(' expression ')'
  | expression '.' Identifier              // Should be invoked as Context.FunctionName
  | expression '[' expression ']'
  | expression '(' expressionList? ')'
  | ('~'|'!') expression
  | expression ('*'|'/'|'%') expression
  | expression ('+'|'-') expression
  | expression ('<' '=' | '>' '=' | '>' | '<') expression
  | expression ('==' | '!=') expression
  ;

expressionList
  : expression (',' expression)*
  ;

parExpression
  : '(' expression ')'
  ;

statementExpression
    : expression
    ;

returnType
    : primitiveType
    ;

primitiveType
    : 'boolean'
    | 'char'
    | 'byte'
    | 'short'
    | 'int'
    | 'long'
    | 'float'
    | 'double'
    | 'String'
    ;

Identifier
    : [a-zA-Z]+
    ;

WS
  : [ \r\t\u000C\n]+ -> channel(HIDDEN)
  ;

COMMENT
  : '/*' .*? '*/' -> channel(HIDDEN)
  ;

LINE_COMMENT
  : '//' ~[\r\n]* -> channel(HIDDEN)
  ;

LINE_TERMINATOR
    : ';'
    ;