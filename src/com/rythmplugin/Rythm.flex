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
KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\ "

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



//RYTHM = "@".*[^\s]*[^<|>]|"*".*[^\s]*[^<|>]|{RYTHM_ELSE}|"*".*[^\s]*[^[|]]|{RYTHM_IF}|"@*".*[^\s]*[^<|>]


//RYTHM = 24.08.16 - 09:20 Uhr @[^<>]*|else|}|\{|> \d.*|< \d.*


//@[^<>]*|else|}|\{|> \d.*|< \d.*
//@.*?\{|@.*\)|@.*?[::lower::]* // @.*?\)|"@".*{TEST}[^<|>]|{RYTHM_ELSE}|"*".*[^[|]]|{RYTHM_IF}|{RYTHM_SECTION}|{RYTHM_ARGS}|{RYTHM_EXTENDS}|{RYTHM_IMPORT}

/*@.*{TEST}[^<][^>]|[^#]*/

//TEST = (.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*{CRLF}*.*)*|(.*{WHITE_SPACE}|[^<][^>])*

//RYTHM = @.[a-zA-Z]*\.*[a-zA-Z]*.\)|@.[a-zA-Z]*.*?\)
//RYTHM_SYN = @[a-zA-Z]*
RYTHM_ARGS = @args.*|@args
RYTHM_SECTION = @section.*?\)|@section
RYTHM_EXTENDS = @extends.*\)|@extends
RYTHM_IMPORT = @import.*|@import
RYTHM_RENDER = @render.*?\)|@render
RYTHM_INVOKE = @invoke.*?\)|@invoke

//RYTHM_METHOD = @.[a-zA-Z]*\.*[a-zA-Z]*\(\)\.*[a-zA-Z]*([a-zA-Z]*)\(\)|@.[a-zA-Z]*\.*[a-zA-Z]*\(\)\.*[a-zA-Z]*([a-zA-Z]*).\([a-zA-Z]*\.[a-zA-Z]*.*\)|@[a-zA-Z]*\.[a-zA-Z]*\(\)
RYTHM_METHOD = @[a-zA-Z]*\..*?\)

RYTHM_ELSE = else.*\{
RYTHM_IF = @if.*\{.[a-zA-Z]*.*}|@if.*?\{
//@if.*?\{|@if
RYTHM_FOR = @for.*\{|@for
RYTHM_I18N = @i18n|@i18n.*\"\)*
RYTHM_PREFIX = @prefix
RYTHM_NAVBOX = @navbox



%state WAITING_VALUE

%%
//<YYINITIAL> {JS_PART}                                      {yybegin (YYINITIAL); return RythmTypes.JS_PART;}

//<YYINITIAL> {HTML_PART}                                      {yybegin (YYINITIAL); return RythmTypes.HTML_PART;}

//<YYINITIAL> {RYTHM}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM;}

//<YYINITIAL> {RYTHM_SYN}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_SYN;}

<YYINITIAL> {RYTHM_METHOD}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_METHOD;}

<YYINITIAL> {RYTHM_ARGS}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_ARGS;}

<YYINITIAL> {RYTHM_SECTION}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_SECTION;}

<YYINITIAL> {RYTHM_RENDER}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_RENDER;}

<YYINITIAL> {RYTHM_EXTENDS}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_EXTENDS;}

<YYINITIAL> {RYTHM_IMPORT}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_IMPORT;}

<YYINITIAL> {RYTHM_INVOKE}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_INVOKE;}

<YYINITIAL> {RYTHM_ELSE}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_ELSE;}

<YYINITIAL> {RYTHM_IF}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_IF;}

<YYINITIAL> {RYTHM_FOR}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_FOR;}

<YYINITIAL> {RYTHM_I18N}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_I18N;}

<YYINITIAL> {RYTHM_PREFIX}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_PREFIX;}

<YYINITIAL> {RYTHM_NAVBOX}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_NAVBOX;}

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return RythmTypes.COMMENT; }

//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return RythmTypes.KEY; }

//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return RythmTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }


//<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return RythmTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
