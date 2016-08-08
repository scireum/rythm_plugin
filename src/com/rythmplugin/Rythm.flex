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

AT = "@"{AFTER_AT}{WHITE_SPACE}|"@"{AFTER_AT}{DOT}{AFTER_AT}{WHITE_SPACE}
AT_FOR = "@for"{WHITE_SPACE}{STMT}
AT_IF = "@if"{WHITE_SPACE}{STMT}
AT_WHILE = "@while"{WHITE_SPACE}{STMT}
LEFT_BRACE = "{"
RIGHT_BRACE = "}"
LP = "("
RP = ")"
DOT = "."
STMT = {LP}{AFTER_AT}{RP}{LEFT_BRACE}
AFTER_AT = [A-Za-z0-9]+




%state WAITING_VALUE

%%

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
