/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar CDLv1;

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
  | annotation
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
  : Letter (Letter|DomainIDDigit)*
  ;

// LEXER =====================================================

DecimalLiteral
  : Digit (DigitList)?
  ;

DigitList
    : Digit (Digit)*
    ;

fragment
BinaryDigit : ('0'|'1') ;

fragment
HexDigits : HexDigit ('_'* HexDigit)* ;

fragment
HexDigit : (Digit|'a'..'f'|'A'..'F') ;

fragment
Digit : '0'..'9' ;


CharacterLiteral
  : '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
  ;

StringLiteral 
  : '"' ( EscapeSequence | ~('\\'|'"') )* '"'
  ;

fragment EscapeSequence
  : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
  | UnicodeEscape
  | OctalEscape
  ;

fragment OctalEscape
  : '\\' ('0'..'3') ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7')
  ;

fragment UnicodeEscape
  : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
  ;

fragment FloatTypeSuffix : ('f'|'F'|'d'|'D') ;


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
