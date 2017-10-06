grammar HEN;
program    : 'function {' statement+ '}';

/* Parser rules are all small characters */

statement        : gets | add | print | divide | multiply | subtract | loop_statement ;
loop_statement   : for_loop | do_while_loop | while_loop ;

print            : 'print' (CHAR | STRING | INTEGER | FLOAT | ARRAY) ; 
gets             : (STRING | CHAR) 'gets' (STRING | CHAR | INTEGER | FLOAT) ;
add              : (INTEGER | FLOAT) 'add' (INTEGER | FLOAT) ;
divide           : (INTEGER | FLOAT) 'div' (INTEGER | FLOAT) ;
multiply         : (INTEGER | FLOAT) 'mult' (INTEGER | FLOAT) ;
subtract         : (INTEGER | FLOAT) 'sub' (INTEGER | FLOAT) ;

for_loop         : 'DAMN' ;
do_while_loop    : 'FUCK' ;
while_loop       : 'SHITE' ;

/* Lexer rules are all caps */

NUMBERS          : [0-9]+ ;

CHAR             : [a-zA-Z0-9]+ ;
STRING           : [a-zA-Z0-9 \n\t]+ ;
INTEGER          : [0-9]+ ;
FLOAT            : [0-9]+ ;
ARRAY            : 'SHIT' ;

WS               : [ \n\t]+ -> skip;