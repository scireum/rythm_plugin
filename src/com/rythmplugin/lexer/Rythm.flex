package com.rythmplugin.lexer;

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

%state OPT_JAVA_CODE

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
BLOCK_COMMENT = \@\*|\*\@|\*(\s*\w+.*)+|\*\s

IDENTIFIER = {LETTER}+|{DIGIT}+
LETTER = [a-zA-Z_]
DIGIT = [0-9]
GF = \"
STRING_LITERAL = \"[a-zA-Z0-9]+\.*\w*\"
RYTHM_ESCAPED = @@\w+

RYTHM_KEY = \@\w+
GENERICS = \<[a-zA-Z]+\,.*?\>|\<([a-zA-Z]+\.[a-zA-Z]+)+\>|\<[A-Z].+\>
TEXT = \<[^@}{,I]+\>|\<\w[^@}{,12346789I]+|\"\>|\/[^@}{]+\/.\>|\".*\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\/*>|\-\-\>|\/\w+\/|\/\w+\"\s*class\=|selected\=\"selected\"|\(\'

//11.11.16 - 11:33 Uhr
//\<[^@}{,I]+\>|\<[^@}{,12346789I]+|\"\>|\/[^@}{]+\/.\>|\".*\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\/*>|\-\-\>|\/\w+\/|\/\w+\"\s*class\=|selected\=\"selected\"|\(\'

//14:10 Uhr
//\<[^@}{,I]+\>|\<[^@}{,12346789I.]+\"|\"\>|\/[^@}{]+\/[^@]+\>|\".*\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\/+>|\-\-\>|\/\w+\/|\/\w+\"\s*class\=|selected\=\"selected\"|\(\'

//13:54 Uhr
//\<[^@}{,I]+\>|\<[^@}{,12346789I]+|\"\>|\/[^@}{]+\/[^@]+\>|\".*\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\/+>|\-\-\>|\/\w+\/|\/\w+\"\s*class\=|selected\=\"selected\"|\(\'

//\<[^@}{,I]+\>|\<[^@}{,12346789I]+|\"\>|\/[^@}{]+\/.\>|\".*\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\/*>|\-\-\>|\/\w+\/|\/\w+\"\s*class\=|selected\=\"selected\"|\(\'

//\<[^@}{,]+\>|\<.[^@}{,12346789]+|\"\>|\/[^@}{]+\/.\>|\".*\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\>|\-\-\>|\/\w+\/|\/\w+\"\s*class\=|selected\=\"selected\"|\(\'




//\<[^@}{,]+\>|\<.[^@}{,12346789()]+|\"\>|\/[^@}{]+\/.\>|\"[@]+\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\>|\-\-\>|\/\w+\/|\/\w+\"\s*class.\=|selected\=\"selected\"
//
%%
<YYINITIAL>{
"@"                             {return RythmTypes.AT;}
"{:"                            {yybegin(OPT_JAVA_CODE); return  RythmTypes.LEFTBRACES; }
":}"                            {return RythmTypes.RIGHTBRACES; }
"."                             {return RythmTypes.DOT; }
"{"                             {return RythmTypes.LBRACE;}
"}"                             {return RythmTypes.RBRACE;}
"("                             {return RythmTypes.LPAREN;}
")"                             {return RythmTypes.RPAREN;}
"["                             {return RythmTypes.BRCSL;}
"]"                             {return RythmTypes.BRCSR;}
"*"                             {return RythmTypes.MUL;}
":"                             {return RythmTypes.COLON; }
","                             {return RythmTypes.COMMA; }
";"                             {return RythmTypes.SEMICOLON;}
"|"                             {return RythmTypes.BAR; }
"+"                             {return RythmTypes.PLUS;}
"!"                             {return RythmTypes.EXCL;}
"/"                             {return RythmTypes.SLASH;}
"=="                            {return RythmTypes.EQ;}
"="                             {return RythmTypes.G;}
"<"                             {return RythmTypes.GREATER;}
{GF}                            {return RythmTypes.GF;}
"else"                          {return RythmTypes.RYTHM_ELSE;}
"@if"                           {return RythmTypes.RYTHM_IF;}
"@for"                          {return RythmTypes.RYTHM_FOR;}
"@extends"                      {return RythmTypes.RYTHM_EXTENDS;}
"@import"                       {return RythmTypes.RYTHM_IMPORT;}
"@args"                         {return RythmTypes.RYTHM_ARGS;}
"@section"                      {return RythmTypes.RYTHM_SECTION;}
"@i18n"                         {return RythmTypes.RYTHM_I_18_N;}
"@prefix"                       {return RythmTypes.RYTHM_PREFIX;}
"@render"                       {return RythmTypes.RYTHM_RENDER;}
"@invoke"                       {return RythmTypes.RYTHM_INVOKE;}
"JAVA_CODE"                     {return RythmTypes.JAVA_CODE; }

{RYTHM_ESCAPED}                 {return RythmTypes.RYTHM_ESCAPED;}
{STRING_LITERAL}                {return RythmTypes.STRING_LITERAL;}
{RYTHM_KEY}                     {return RythmTypes.RYTHM_KEY;}
{GENERICS}                      {return RythmTypes.GENERICS;}
{IDENTIFIER}                    {yybegin (YYINITIAL);return RythmTypes.IDENTIFIER; }
{BLOCK_COMMENT}                 {yybegin (YYINITIAL);return RythmTypes.BLOCK_COMMENT; }
{TEXT}                          {yybegin (YYINITIAL);return RythmTypes.TEXT; }
}

<OPT_JAVA_CODE>{
":}"                            {yybegin(YYINITIAL); yypushback(yylength());}
[^]                             {yybegin(OPT_JAVA_CODE); return RythmTypes.JAVA;}
}


<YYINITIAL>{
({CRLF}|{WHITE_SPACE})+         {yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                  {yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                               {return TokenType.BAD_CHARACTER; }
}