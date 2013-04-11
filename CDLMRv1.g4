/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar CDLMRv1;

mapreduce
    : (annotation functionDeclaration)? (functionDeclaration)* EOF
    ;

/* For Annotations */
annotation
  : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
  ;

annotationName
  : Identifier ('.' Identifier)*
  ;

elementValuePairs
  : elementValuePair (',' elementValuePair)*
  ;

elementValuePair
  : Identifier '=' elementValue
  ;

elementValue
  : expression
  | literal
  | elementValueArrayInitializer
  ;

elementValueArrayInitializer
  : '{' (elementValue (',' elementValue)*)? (',')? '}'
  ;

defaultValue
  : 'default' elementValue
  ;
/* For Annotation Ends*/

/* For MapReduce */
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
      | 'if' parExpression block ('else' block)?
      | 'return' expression? ';'
      | ';'
      | expression ';'
      //| functionCall ( MUL | DIV | '%' ) functionCall
      //| functionCall ( ADD | SUB ) functionCall
      //| functionCall
      | 'return' literal
      | 'return this'
      ;

functionCall
    : 'function.' Identifier '(' paramlist ')'
    ;

paramlist
    : Identifier? (',' Identifier)*
    ;

parExpression
  : '(' expression ')'
  ;

returnType
    : 'void'
    | literal
    | primitiveType
    ;

expression
  : '(' expression ')'
  | functionCall
  | expression '.' Identifier              // Should be invoked as Context.FunctionName
  | expression '[' expression ']'
  | expression '(' expressionList? ')'
  | ('~'|'!') expression
  | expression ('*'|'/'|'%') expression
  | expression ('+'|'-') expression
  | expression ('<' '=' | '>' '=' | '>' | '<') expression
  | expression ('==' | '!=') expression
  | expression 'and' expression
  | expression 'or' expression
  ;

expressionList
  : expression (',' expression)*
  ;

literal
  : IntegerLiteral
  | CharacterLiteral
  | StringLiteral
  | BooleanLiteral
  | 'null'
  ;

IntegerLiteral
  : DecimalLiteral
  ;

BooleanLiteral
  : 'true'
  | 'false'
  ;

Identifier
  : [a-zA-Z]+
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

MUL 
    : '*';
DIV 
    : '/';
ADD 
    : '+';
SUB 
    : '-';

// LEXER =====================================================

DecimalLiteral
  : Digit (DigitList)?
  ;

DigitList
    : Digit (Digit)*
    ;

CharacterLiteral
  : '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
  ;

StringLiteral 
  : '"' ( EscapeSequence | ~('\\'|'"') )* '"'
  ;

fragment Digit 
    : '0'..'9' ;

fragment EscapeSequence
  : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
  ;

fragment Letter
    : [a-zA-Z]+
    ;

fragment DomainIDDigit
    : '\u0030'..'\u0039'
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