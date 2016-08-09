package com.rythmplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.psi.RythmTypes;
import com.intellij.psi.TokenType;

%%

%class RythmLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\r\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
//KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\ "



AT = {AT_CHAR_WS}|{AT_DOT_AAT_WS}|{AT_AAT_CRLF}|{AT_AAT_LP_L_RP_WS_LB}|{AT_EXAN}

//Block für AT
AT_CHAR_WS ="@"{AFTER_AT}{WHITE_SPACE}
AT_DOT_AAT_WS = "@"{AFTER_AT}{DOT}{AFTER_AT}{WHITE_SPACE}
AT_AAT_CRLF = "@"{AFTER_AT}{CRLF}
AT_AAT_LP_L_RP_WS_LB = "@"{AFTER_AT}{LP}{LETTER}*{RP}{WHITE_SPACE}{LEFT_BRACE}
AT_EXAN = "@"{ALPHA_NUMERIC}*{LP}*{DQ}{ALPHA_NUMERIC}*{DQ}{RP}{WHITE_SPACE}{RIGHT_BRACE}

//Block für AT_IF
AT_IF = {AT_IF_WS_STMT}|

AT_IF_WS = "@if"{WHITE_SPACE}{STMT}

AT_IF_WS_STMT = "@if"{WHITE_SPACE}{STMT}{WHITE_SPACE}{LEFT_BRACE}{WHITE_SPACE}{AT_EXAN}


AT_FOR = "@for"{WHITE_SPACE}{STMT}|"@for"{WHITE_SPACE}{STMT}{AT_EXAN}
AT_WHILE = "@while"{WHITE_SPACE}{STMT}
AT_COMMENT = "/"

STMT = {LP}{AFTER_AT}{RP}{LEFT_BRACE}|{LP}{AFTER_AT}{RP}{WHITE_SPACE}{LEFT_BRACE}


LEFT_BRACE = "{"
RIGHT_BRACE = "}"
LP = "("
RP = ")"
DOT = "."

AFTER_AT = {ALPHA_NUMERIC}+|{ALPHA_NUMERIC}*{DOT}*{LP}*{RP}*|{ALPHA_NUMERIC}*{DOT}*{ALPHA_NUMERIC}*{LP}*{RP}*

ALPHA_NUMERIC = [A-Za-z0-9]
LETTER = [A-Za-z]



SL = "/"
BSL = "\\"
ANYCHAR = .*

DQ = "\""
ANYCHAREXAN =[^[A-Za-z0-9]]*

HTML = {HTML_TAG_OPEN}|{HTML_TAG_CLOSE}
HTML_TAG_OPEN = "<"{SL}{AFTER_AT}">"
HTML_TAG_CLOSE = "<"{BSL}{AFTER_AT}">"




%state WAITING_VALUE

%%

<WAITING_VALUE> {HTML}                                      {yybegin (YYINITIAL); return RythmTypes.HTML;}

<WAITING_VALUE> {AT}                                        {yybegin(YYINITIAL); return RythmTypes.AT;}

<WAITING_VALUE> {AT_FOR}                                        {yybegin(YYINITIAL); return RythmTypes.AT_FOR;}

<WAITING_VALUE> {AT_WHILE}                                        {yybegin(YYINITIAL); return RythmTypes.AT_WHILE;}

<WAITING_VALUE> {AT_IF}                                        {yybegin(YYINITIAL); return RythmTypes.AT_IF;}

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return RythmTypes.COMMENT; }

//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return RythmTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return RythmTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }


<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return RythmTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
