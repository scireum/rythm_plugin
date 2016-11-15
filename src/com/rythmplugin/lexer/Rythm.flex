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
BLOCK_COMMENT = \@\*|\*\@|\*(\s*\w+.*)+|\*\s|\<\!\-\-(\n.+)+\-\>

IDENTIFIER = {LETTER}+|{DIGIT}+
LETTER = [a-zA-Z_]
DIGIT = [0-9]+
GF = \"
STRING_LITERAL = \"\#*([a-zA-Z0-9]+\.*\w*)+\"|\"(\/\w+)+\"|\"(\w+\/\w+)+\"|\"\s*\:\s*\"


RYTHM_ESCAPED = @@\w+

Q_RYTHM = \"@[^itp].*\"
RYTHM_KEY = \@\w+
GENERICS = \<[a-zA-Z]+\,.*?\>|\<([a-zA-Z]+\.[a-zA-Z]+)+\>|\<[A-Z].+\>
TEXT = \<[^@}{,I]+\>|\<[a-z]+[^I]\w*[^@}{,12346789I]+|\"\>|\/[^@}{]+\/\w*.\>|\".*\"\>|\'[^@}{]+|\"[^@}{)]+?\>|\"\s|\/*>|\-\-\>|\w*\/((\w+\/*\-*\.*)+\w+)+\/|\/\w+\"\s*class\=[^@]+|selected\=\"selected\"|\(\'

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
"-"                             {return RythmTypes.MINUS;}
"~"                             {return RythmTypes.TILDE;}
{GF}                            {return RythmTypes.GF;}
"else"                          {return RythmTypes.RYTHM_ELSE;}
"@if"|"if"                      {return RythmTypes.RYTHM_IF;}
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

"null"                          {return RythmTypes.NULL;}
"var"                           {return RythmTypes.VAR;}
"function"                      {return RythmTypes.FUNCTION;}
"this"                          {return RythmTypes.THIS;}
"new"                           {return RythmTypes.NEW;}
{DIGIT}                         {return RythmTypes.DIGIT;}

{Q_RYTHM}                       {return RythmTypes.Q_RYTHM;}
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