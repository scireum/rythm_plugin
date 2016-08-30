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
//FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{CRLF} | "\\".
//VALUE_CHARACTER=[^\n\r\f\\] | "\\"{CRLF} | "\\".
//END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
//KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\ "

/*
HTML_PART = {HTML_HREF}|{HTML_LI}|{HTML_DIV}|{HTML_CANVAS}|{HTML_UL}|{HTML_TAG}|{HTML_BODY}|{TAG_CLOSE_TAG_START}|{HTML_COMMENT}
HTML_HREF = "<a href=".*?.*?>|"<a".*[^@].|"</a>"
HTML_LI = "<li".*?>|"<\/li>"|"<li"|<\/li>
HTML_DIV = "<div".*?>|"</div>"
HTML_CANVAS = "<canvas".*?>|"</canvas>"
HTML_UL = "<ul".*?>|"</ul>"
HTML_LINK = "<link".*?
HTML_TAG = "<html".*?|"</html>"
HTML_BODY = "<body>"|"</body>"
HTML_HEAD = "<head>"|"</head>"
HTML_COMMENT = "<!--"| "-->"

TAG_CLOSE_TAG_START = "><".*
*/
/*
JS_PART = {J_SCRIPT}
J_SCRIPT = "<script".*?>|"</script>"//|[[:lower:]]*
*/


SCRIPT = <script.*?>.*?>
//RYTHM = "@".*[^\s]*[^<|>]|"*".*[^\s]*[^<|>]|{RYTHM_ELSE}|"*".*[^\s]*[^[|]]|{RYTHM_IF}|"@*".*[^\s]*[^<|>]


//RYTHM = 24.08.16 - 09:20 Uhr @[^<>]*|else|}|\{|> \d.*|< \d.*


//@[^<>]*|else|}|\{|> \d.*|< \d.*
//@.*?\{|@.*\)|@.*?[::lower::]* // @.*?\)|"@".*{TEST}[^<|>]|{RYTHM_ELSE}|"*".*[^[|]]|{RYTHM_IF}|{RYTHM_SECTION}|{RYTHM_ARGS}|{RYTHM_EXTENDS}|{RYTHM_IMPORT}

/*@.*{TEST}[^<][^>]|[^#]*/

//TEST = (.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*)*|(.*{WHITE_SPACE}|[^<][^>])*

//RYTHM = @.[a-zA-Z]*\.*[a-zA-Z]*.\)|@.[a-zA-Z]*.*?\)
//RYTHM_SYN = @[a-zA-Z]*

RYTHM_KEY = @.[(?!for|invoke|render|if|i18n|prefix|args|import)][a-zA-Z0-9]*|@[A-Z]+|@[a-zA-Z]*
//@[a-zA-Z0-9]+|@(?!for|invoke|render)[a-zA-Z0-9]
//@(?!scireum\.de)+.


//RYTHM_ARGS = @args.*|@args
//RYTHM_SECTION = @section.*?\)|@section
//RYTHM_EXTENDS = @extends.*\)|@extends
//RYTHM_IMPORT = @import.*|@import
//RYTHM_RENDER = @render.*?\)|@render
//RYTHM_INVOKE = @invoke.*?\)|@invoke


RYTHM_METHOD = \.[a-zA-Z]\(+[a-zA-Z]*\)|\.[a-zA-Z]+\_*[A-Z]*\(*\)|\.equals|\.get[a-zA-Z]+\(\)|\.get[a-zA-Z]+\(*[a-zA-Z]*\)*
//\.[a-zA-Z]\(+[a-zA-Z]*\)|\.(?!pdf|js|html)+[a-zA-Z]+\_*[A-Z]*\(*\)|\.equals\(*
//\.[a-zA-Z]+\(+[a-zA-Z]*\)|\.[a-zA-Z]+\_*[A-Z]*(?!)|\.[a-z]+[A-Z]+[a-z]+\.*[a-zA-Z]*|\.(equals)
//\.[a-zA-Z]+\(+[a-zA-Z]*\)|\.[a-zA-Z]+\_*[A-Z]*
//URSPRUENGLICH 29.08.16 15:24 Uhr \.*[a-zA-Z]*\(*\!*\(*[a-zA-Z]*\(*\.[a-zA-Z]+\(\)*?\)\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*.*?\&+|\.*[a-zA-Z]*\(*\!*\(*[a-zA-Z]*\(*\.[a-zA-Z]+\(\)*?\)\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*|\.*[a-zA-Z]*\([a-zA-Z]+\s*(=)*\s*[a-zA-Z]*.?\)


RYTHM_LOST = [a-zA-Z]+\=\"[a-zA-Z]+.+\li>|[a-zA-Z]+.*[a-zA-Z]+[a-zA-Z]+\=\"[a-zA-Z]+.+li>

//RYTHM_METHOD = @.[a-zA-Z]*\.*[a-zA-Z]*\(\)\.*[a-zA-Z]*([a-zA-Z]*)\(\)|@.[a-zA-Z]*\.*[a-zA-Z]*\(\)\.*[a-zA-Z]*([a-zA-Z]*).\([a-zA-Z]*\.[a-zA-Z]*.*\)|@[a-zA-Z]*\.[a-zA-Z]*\(\)
//RYTHM_METHOD = \.[a-zA-Z]*\(\)*[a-zA-Z]*.*?\)
//@[a-zA-Z]*\..*?\)

RYTHM_BLOCK = [a-zA-Z]+\:\s*[a-zA-Z]*\.[a-zA-Z]+\(\)\,|[a-zA-Z]+\:\s*\"[a-zA-Z]+\.[a-zA-Z]+\"\,|[a-zA-Z]+:\s\"[a-zA-Z]+\.[a-zA-Z]+\.[a-zA-Z]+\"\)*\,*|[a-zA-Z]+\:[a-zA-Z]+\.[a-zA-Z]+\([a-zA-Z]+\.[a-zA-Z]+\(\)\)\,|[a-zA-Z]+:\"[a-zA-Z]+\.[a-zA-Z]+\"\)|[a-zA-Z]+:\"[a-zA-Z]+\"*,*\.*[a-zA-Z]*\.*[a-zA-Z]*\"\)*,*
// 14:49 Uhr .\,\n[a-zA-Z]+\:*[a-zA-Z]+\.*[a-zA-Z]*\(*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*\)*\,*\n.*?\,\n.*|\(*[a-zA-Z]+:.*?\,\n|[a-zA-Z]+\:\"[a-zA-Z]*\.[a-zA-Z]+\.[a-zA-Z]+\"*\)
//13:35 Uhr .\,\n[a-zA-Z]+\:*[a-zA-Z]+\.*[a-zA-Z]*\(*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*\)*\,*\n.*?\,\n.*|@*[a-zA-Z]*\(*[a-zA-Z]+:.*?\,.*
//@.*,\n*.*\n*[a-zA-Z]*\n[a-zA-Z]*.[^@><]*
//RYTHM_PART = @(?!for|invoke|render)[a-zA-Z]*\(.*\).*

//RYTHM_ELSE = else\s?\{
//RYTHM_IF = @if
//.*\{.[a-zA-Z]*.*}*|@if.*?\{
//@if.*?\{|@if
//RYTHM_FOR = @for.*\{|@for
//RYTHM_I_18_N = @(i18n)+.*?\<\/a><*\/*l*i*\>*
//RYTHM_PREFIX = @prefix
//RYTHM_NAVBOX = @navbox



//%state WAITING_VALUE

%%
//<YYINITIAL> {RYTHM_LOST}                                 {yybegin(YYINITIAL); return RythmTypes.RYTHM_LOST;}

//<YYINITIAL> {JS_PART}                                      {yybegin (YYINITIAL); return RythmTypes.JS_PART;}

//<YYINITIAL> {HTML_PART}                                      {yybegin (YYINITIAL); return RythmTypes.HTML_PART;}

//<YYINITIAL> {RYTHM}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM;}

//<YYINITIAL> {RYTHM_SYN}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_SYN;}

<YYINITIAL> {SCRIPT}                                                {yybegin(YYINITIAL); return RythmTypes.SCRIPT;}

<YYINITIAL> {RYTHM_KEY}                                            {yybegin(YYINITIAL); return RythmTypes.RYTHM_KEY;}

//<YYINITIAL> {RYTHM_PART}                                            {yybegin(YYINITIAL); return RythmTypes.RYTHM_PART;}

<YYINITIAL> {RYTHM_METHOD}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_METHOD;}

<YYINITIAL> {RYTHM_BLOCK}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_BLOCK;}

//<YYINITIAL> {RYTHM_ARGS}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_ARGS;}

//<YYINITIAL> {RYTHM_SECTION}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_SECTION;}

//<YYINITIAL> {RYTHM_RENDER}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_RENDER;}

//<YYINITIAL> {RYTHM_EXTENDS}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_EXTENDS;}

//<YYINITIAL> {RYTHM_IMPORT}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_IMPORT;}

//<YYINITIAL> {RYTHM_INVOKE}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_INVOKE;}

//<YYINITIAL> {RYTHM_ELSE}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_ELSE;}

//<YYINITIAL> {RYTHM_IF}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_IF;}

//<YYINITIAL> {RYTHM_FOR}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_FOR;}

//<YYINITIAL> {RYTHM_I_18_N}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_I_18_N;}

//<YYINITIAL> {RYTHM_PREFIX}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_PREFIX;}

//<YYINITIAL> {RYTHM_NAVBOX}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_NAVBOX;}

//<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return RythmTypes.COMMENT; }

//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return RythmTypes.KEY; }

//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return RythmTypes.SEPARATOR; }

//<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

//<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }


//<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return RythmTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
