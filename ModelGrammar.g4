/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar ModelGrammar;

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