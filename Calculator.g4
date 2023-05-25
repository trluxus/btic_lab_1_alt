grammar Calculator;

/*
 * Parser rules
 */
equation:
	variable ASSIGN expression
	| expression relop expression EOF
	| expression;

expression:
	SQRT OP_PAREN expression CL_PAREN # Sqrt
	| SIN OP_PAREN expression CL_PAREN # Sin
	| COS OP_PAREN expression CL_PAREN # Cos
	| TAN OP_PAREN expression CL_PAREN # Tan
	| LOG OP_PAREN expression CL_PAREN # Log
	| multiplyingExpression ((PLUS | MINUS) multiplyingExpression)* #default;

multiplyingExpression:
	powExpression ((MULT | DIV) powExpression)*;

powExpression: signedAtom (POW signedAtom)*;

signedAtom: PLUS signedAtom | MINUS signedAtom | func_ | atom;

func_:
	funcname OP_PAREN expression (COMMA expression)* CL_PAREN;

atom: number | variable | OP_PAREN expression CL_PAREN;

number: decimal | binary | octal | hex;
decimal: DECIMAL;
binary: BINARY;
octal: OCTAL;
hex: HEX;
variable: VAR;

funcname: COS | TAN | SIN | ACOS | ATAN | ASIN | LOG | SQRT;

relop: EQ | GT | LT;

/*
 * Lexer rules
 */
fragment MANTISSA: [eE][+-]?;
fragment MANTISSA_HEX: [mM][+-]?;

DECIMAL: ([0] | [1-9][0-9]*) ('.' [0-9]+)? (
		MANTISSA [1-9][0-9]*
	)?;
BINARY: ('0' 'b') ([0] | [1][0-1]*) ('.' [0-1]+)? (
		MANTISSA [1][0-1]*
	)?;
OCTAL: ('0' 'o') ([0] | [1-7][0-7]*) ('.' [0-7]+)? (
		MANTISSA [1-7][0-7]*
	)?;
HEX: ('0' 'h') ([0] | [1-9a-fA-F][0-9a-fA-F]*) ('.' [0-9a-fA-F]+)? (
		MANTISSA_HEX [1-9a-fA-F][0-9a-fA-F]*
	)?;

VAR: VALID_ID_START VALID_ID_CHAR*;

fragment VALID_ID_START: ('a' .. 'z') | ('A' .. 'Z') | '_';

fragment VALID_ID_CHAR: VALID_ID_START | ('0' .. '9');

WS: [ \r\n\t]+ -> skip;

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
GT: '>';
LT: '<';
EQ: '==';
ASSIGN: '=';
POW: '^';

OP_PAREN: '(';
CL_PAREN: ')';

COMMA: ',';
SIN         : [$][Ss][Ii][Nn]                    ;
COS         : [$][Cc][Oo][Ss]                    ;
TAN         : [$][Tt][Aa][Nn]                    ;
ACOS		: [$][Aa][Cc][Oo][Ss]                ;					
ASIN		: [$][Aa][Ss][Ii][Nn]                ;
ATAN		: [$][Aa][Tt][Aa][Nn]                ;
LOG			: [$][Ll][Oo][Gg]                    ;
SQRT        : [$][Ss][Qq][Rr][Tt]				 ;
CTD			: [$][Cc][Tt][Dd]					 ;
CTH			: [$][Cc][Tt][Hh]					 ;
CTB			: [$][Cc][Tt][Bb]					 ;
FN: '$';
