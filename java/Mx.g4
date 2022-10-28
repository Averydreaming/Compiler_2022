grammar Mx;

programs: programsimple* EOF;
programsimple: varDef|funcDef|classDef;

varDef: type varDefsimple (',' varDefsimple)* ';';
varDefsimple: ID ('=' expr)?;
funcDef: returntype ID '(' paraList? ')' part;
paraList: para (',' para)*;
para: type ID;
classDef: Class ID '{' (varDef|funcDef|classDefstruct)* '}' ';';
classDefstruct: ID '(' ')' part;

//构造语句   If 在词法中相当于 'if'
stmt
    : part #partstmt
    | varDef #varDefstmt
    | If '(' expr ')' st1=stmt (Else st2=stmt)? #ifstmt
    | For '(' expr1=expr? ';' expr2=expr? ';' expr3=expr? ')' stmt #forstmt
    | While '(' expr ')' stmt #whilestmt
    | Return expr? ';' #returnstmt
    | Continue ';' #continuestmt
    | Break ';' #breakstmt
    | expr ';' #exprstmt
    | ';' #nullstmt
    ;
part:'{' stmt* '}';
//表达式语法
expr
    : '(' expr ')' #subexpr
    | ID #idexpr
    | constant #constexpr
    | This #thisexpr
    | expr '(' exprList? ')' #funcexpr
    | expr1=expr '[' expr2=expr ']' #arrexpr
    | expr '.' ID #classexpr
    | expr op=('++'|'--') #suffixexpr
    | <assoc=right> op=('++'|'--') expr #prefixexpr
    | <assoc=right> op=('+'|'-') expr #prefixexpr
    | <assoc=right> op=('!'|'~') expr #prefixexpr
    | <assoc=right> New newformat #newexpr
    | src1=expr op=('*'|'/'|'%'|'+'|'-') src2=expr #binaryexpr
    | src1=expr op=('<<'|'>>') src2=expr #binaryexpr
    | src1=expr op=('<'|'>'|'<='|'>=') src2=expr #binaryexpr
    | src1=expr op=('=='|'!=') src2=expr #binaryexpr
    | src1=expr op=('&'|'^'|'|'|'&&'|'||') src2=expr #binaryexpr
    | <assoc=right> src1=expr op='=' src2=expr #binaryexpr
    ;
exprList: expr(',' expr)*;
newformat
    : basictype ('[' expr ']')+ ('[' ']')+ ('[' expr ']')+ #errornewformat
    | basictype ('[' expr ']')+ ('[' ']')* #arraynewformat
    | basictype '(' ')' #classnewformat
    | basictype #basicnewformat
    ;
//词法分析
//2.keyword
Void: 'void';
Bool: 'bool';
Int: 'int';
String: 'string';

New: 'new';
Class: 'class';

Null: 'null';
True: 'true';
False: 'false';
This: 'this';

If: 'if';
Else: 'else';
For: 'for';
While: 'while';
Break: 'break';
Continue: 'continue';
Return: 'return';
//6.constant
constant: Integers|Strings|Bools|Null;
Integers: [1-9] [0-9]* | '0';
Strings: '"' ('\\"'|'\\n'|'\\\\'|.)*? '"';
Bools: True | False;
//7.type
basictype: ID|Bool|Int|String;
type: basictype ('[' ']')*;
returntype: type | Void;
//5.identifier
ID: [a-zA-Z] [a-zA-Z_0-9]*;
//3.whitespace
Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
//4.comment
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~[\r\n]* -> skip;