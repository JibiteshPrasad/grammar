/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar CDLv1;

model
    : (annotation modelDeclaration)* EOF
    ;

annotation
  : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
  ;

annotationName
  : Identifier ('.' Identifier)*
  ;

modelDeclaration
  : 'model' Identifier ('extends' modelType)? modelBody
  ;

modelType
    : Identifier
    ;

modelBody
    : '{' fieldDeclaration* '}'
    ;

fieldDeclaration
    : (primitiveType) Identifier LINE_TERMINATOR
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
  | fileLocation
  ;

fileLocation
    : ('/' elementValue) ('/' elementValue)*
    ;

defaultValue
  : 'default' elementValue
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
  : [a-zA-Z]+ ([a-zA-Z])*
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