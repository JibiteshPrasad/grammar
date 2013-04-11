/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar TestFunctionGrammar;

functionDeclaration
  : 'function' returnType Identifier '(' (functionParamList)? ')' functionBody
  ;

functionParamList
    : functionParam ( ',' functionParam)*
    ;

functionParam
    : primitiveType Identifier
    ;

functionBody
    : block
    ;

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : statement
    ;

statement
    : block
      | 'if' parExpression statement ('else' statement)?
      | 'return' expression? ';'
      | ';'
      | expression ';'
      | functionCall ( MUL | DIV | '%' ) functionCall
      | functionCall ( ADD | SUB ) functionCall
      | functionCall
      ;

functionCall
    : Identifier '(' paramlist ')'
    ;

paramlist
    : Identifier? (',' Identifier)*
    ;

expression
  : '(' expression ')'
  | expression '.' Identifier              // Should be invoked as Context.FunctionName
  | expression '[' expression ']'
  | expression '(' expressionList? ')'
  | ('~'|'!') expression
  | expression ('<' '=' | '>' '=' | '>' | '<') expression
  | expression ('==' | '!=') expression
  ;

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';

expressionList
  : expression (',' expression)*
  ;

parExpression
  : '(' expression ')'
  ;

returnType
    : 'void'
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

Identifier
    : [a-zA-Z]([a-zA-Z])*
    ;
