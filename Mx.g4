grammar Mx;

programs: programsimple* EOF;
programsimple: varDef|funcDef|classDef;

varDef: type varDefsimple (',' varDefsimple)* ';';
varDefsimple: Identifier ('=' expression)?;
funcDef: returntype Identifier '(' paraList? ')' part;
paraList: para (',' para)*;
para: type Identifier;
classDef: Class Identifier '{' (varDef|funcDef|classDefstruct)* '}' ';';
classDefstruct: Identifier '(' ')' part;

statement
    : part #partstate
    | varDef #varDefstate
    | If '(' expression ')' st1=statement (Else st2=statement)? #ifstate
    | For '(' expr1=expression? ';' expr2=expression? ';' expr3=expression? ')' statement #forstate
    | While '(' expression ')' statement #whilestate
    | Return expression? ';' #returnstate
    | Continue ';' #continuestate
    | Break ';' #breakstate
    | expression ';' #exprstate
    | ';' #nullstate
    ;
part:'{' statement* '}';
creator
    : basictype ('[' expression ']')+ ('[' ']')+ ('[' expression ']')+ #errorcreator
    | basictype ('[' expression ']')+ ('[' ']')* #arraycreator
    | basictype '(' ')' #classcreator
    | basictype #basiccreator
    ;
expression
    : '(' expression ')' #subexpression
    | Identifier #idexpression
    | constant #constexpression
    | This #thisexpression
    | expression '(' expressionList? ')' #funcexpression
    | expr1=expression '[' expr2=expression ']' #arrexpression
    | expression '.' Identifier #classexpression
    | expression op=('++'|'--') #suffixexpression
    | <assoc=right> op=('++'|'--') expression #prefixexpression
    | <assoc=right> op=('+'|'-') expression #prefixexpression
    | <assoc=right> op=('!'|'~') expression #prefixexpression
    | <assoc=right> New creator #newexpression
    | src1=expression op=('*'|'/'|'%') src2=expression #binaryexpression
    | src1=expression op=('+'|'-') src2=expression #binaryexpression
    | src1=expression op=('<<'|'>>') src2=expression #binaryexpression
    | src1=expression op=('<'|'>'|'<='|'>=') src2=expression #binaryexpression
    | src1=expression op=('=='|'!=') src2=expression #binaryexpression
    | src1=expression op='&' src2=expression #binaryexpression
    | src1=expression op='^' src2=expression #binaryexpression
    | src1=expression op='|' src2=expression #binaryexpression
    | src1=expression op='&&' src2=expression #binaryexpression
    | src1=expression op='||' src2=expression #binaryexpression
    | <assoc=right> src1=expression op='=' src2=expression #binaryexpression
    ;
expressionList: expression(',' expression)*;

basictype: Identifier|Bool|Int|String;
type: basictype ('[' ']')*;
returntype: type | Void;

constant: Integers|Strings|Bools|Null;
Integers: [1-9] [0-9]* | '0';
Strings: '"' ('\\"'|'\\n'|'\\\\'|.)*? '"';
Bools: True | False;

Int: 'int';
Bool: 'bool';
String: 'string';
Null: 'null';
Void: 'void';
True: 'true';
False: 'false';
If: 'if';
Else: 'else';
For: 'for';
While: 'while';
Break: 'break';
Continue: 'continue';
Return: 'return';
New: 'new';
Class: 'class';
This: 'this';

Identifier: [a-zA-Z] [a-zA-Z_0-9]*;
Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~[\r\n]* -> skip;
