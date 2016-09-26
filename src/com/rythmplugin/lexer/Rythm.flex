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

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]


RYTHM_ARGS = @args
RYTHM_SECTION = @section
RYTHM_EXTENDS = @extends
RYTHM_IMPORT = @import
RYTHM_RENDER = @render
RYTHM_INVOKE = @invoke
RYTHM_I_18_N = @i18n
//@i18n\(\"[a-zA-Z]+\.*[a-zA-Z]*\.*[a-zA-Z]*\"\)+|@i18n
RYTHM_PREFIX = @prefix

RYTHM_KEY = @[a-zA-Z]+|@[a-z]+[A-Z]+[a-z]+|@[a-z]+[A-Z]+[a-z]

RYTHM_METHOD = \.[a-zA-Z]+\(+[a-zA-Z]*?\)|\.get[a-zA-Z]+\(+[a-zA-Z]*
//\.[a-zA-Z]\(+[a-zA-Z]*\)|\.[a-zA-Z]+\_*[A-Z]*\(*\)+|\.equals|\.get[a-zA-Z]+\(\)|\.get[a-zA-Z]+\(*[a-zA-Z]*\)*|\.get
//\.[a-zA-Z]\(+[a-zA-Z]*\)|\.[a-zA-Z]+\_*[A-Z]*\(*\)|\.equals|\.get[a-zA-Z]+\(\)|\.get[a-zA-Z]+\(*[a-zA-Z]*\)*|\.get

//RYTHM_BLOCK = [a-zA-Z]+\:\s*[a-zA-Z]*\.[a-zA-Z]+\(\)\,|[a-zA-Z]+\:\s*\"[a-zA-Z]+\.[a-zA-Z]+\"\,|[a-zA-Z]+:\s\"[a-zA-Z]+\.[a-zA-Z]+\.[a-zA-Z]+\"\)*\,*|[a-zA-Z]+\:[a-zA-Z]+\.[a-zA-Z]+\([a-zA-Z]+\.[a-zA-Z]+\(\)\)\,|[a-zA-Z]+:\"[a-zA-Z]+\.[a-zA-Z]+\"\)|[a-zA-Z]+:\"[a-zA-Z]+\"*,*\.*[a-zA-Z]*\.*[a-zA-Z]*\"\)*,*

//RYTHM_ELSE = else

RYTHM_IF = @if \s*
//@if|@if\s*\(*\!*[a-zA-Z]*\.*[a-zA-Z]*\(*\"*[a-zA-Z]*\"*\)*\)*?\)*\.*[a-zA-Z]*\(*\)?\)\=*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\s*\&&*\s*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*.*\)\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*[a-zA-Z]*\(*\)*\s*\!*\=*\s*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(?\)*\.*[a-zA-Z]*\_*[a-zA-Z]*\(*\)*\>*\<*[a-zA-Z0-9]*\)*.*?\)\)*\.*[a-zA-Z]*\(*\)*.*\)|@if.*\)

//@if\s*\(*\!*[a-zA-Z]*\.*[a-zA-Z]*\(*\"*[a-zA-Z]*\"*\)+\)*?\)*\.*[a-zA-Z]*\(*\)?\)\=*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\s*\&&*\s*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\)\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*[a-zA-Z]*\(*\)*\s*\!*\=*\s*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(?\)*\.*[a-zA-Z]*\_*[a-zA-Z]*\(*\)*\>*\<*[a-zA-Z0-9]*\)*?\)\)*\.*[a-zA-Z]*\(*\)*\)
//@if\s*\(*\!*[a-zA-Z]*\.*[a-zA-Z]*\(*\"*[a-zA-Z]*\"*\).*\)*?\)*\.*[a-zA-Z]*\(*\)?\)\=*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\s*\&&*\s*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\)\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*[a-zA-Z]*\(*\)*\s*\!*\=*\s*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(?\)*\.*[a-zA-Z]*\_*[a-zA-Z]*\(*\)*\>*\<*[a-zA-Z0-9]*\)*?\)\)*\.*[a-zA-Z]*\(*\)*\)
RYTHM_COMMENT = @\*|\*.*

RYTHM_FOR = @for \s*
//\(+.*\)|@for

RYTHM = {RYTHM_FOR}|{RYTHM_IF}|{RYTHM_KEY}|{RYTHM_ARGS}|{RYTHM_SECTION}|{RYTHM_EXTENDS}|{RYTHM_IMPORT}|{RYTHM_RENDER}|{RYTHM_INVOKE}|{RYTHM_I_18_N}|{RYTHM_PREFIX}|{RYTHM_KEY}

TEXT = [^@\.\{\}\(\)\*]*

TAG = \<[a-zA-Z]+\>|\<\/[a-zA-Z]+\>|<[a-z]+|>

LBRACE = \{
RBRACE = \}

LPAREN = \(
RPAREN = \)

%state ST_ACTION
%%
<YYINITIAL>          {TEXT}                                       {yybegin (YYINITIAL);return RythmTypes.TEXT; }

<ST_ACTION>{
//<YYINITIAL>{RYTHM_METHOD}                                         {yybegin(YYINITIAL); return RythmTypes.RYTHM_METHOD;}

<YYINITIAL>{LBRACE}                                               {yybegin(YYINITIAL); return RythmTypes.LBRACE;}
<YYINITIAL>{RBRACE}                                               {yybegin(YYINITIAL); return RythmTypes.RBRACE;}

<YYINITIAL>{LPAREN}                                               {yybegin(YYINITIAL); return RythmTypes.LPAREN;}
<YYINITIAL>{RPAREN}                                               {yybegin(YYINITIAL); return RythmTypes.RPAREN;}

<YYINITIAL> {TAG}                                                 {yybegin(YYINITIAL); return RythmTypes.TAG;}

<YYINITIAL> {RYTHM_ARGS}                                          {yybegin(YYINITIAL); return RythmTypes.RYTHM_ARGS;}

<YYINITIAL> {RYTHM_SECTION}                                       {yybegin(YYINITIAL); return RythmTypes.RYTHM_SECTION;}

<YYINITIAL> {RYTHM_RENDER}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_RENDER;}

<YYINITIAL> {RYTHM_EXTENDS}                                       {yybegin(YYINITIAL); return RythmTypes.RYTHM_EXTENDS;}

<YYINITIAL> {RYTHM_IMPORT}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_IMPORT;}

<YYINITIAL> {RYTHM_INVOKE}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_INVOKE;}

<YYINITIAL>{RYTHM_IF}                                             {yybegin(YYINITIAL); return RythmTypes.RYTHM_IF;}

<YYINITIAL>{RYTHM_FOR}                                            {yybegin(YYINITIAL); return RythmTypes.RYTHM_FOR;}

<YYINITIAL> {RYTHM_I_18_N}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_I_18_N;}

<YYINITIAL> {RYTHM_PREFIX}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_PREFIX;}

<YYINITIAL> {RYTHM_COMMENT}                                       {yybegin(YYINITIAL); return RythmTypes.RYTHM_COMMENT;}

<YYINITIAL> {RYTHM_KEY}                                           {yybegin(YYINITIAL); return RythmTypes.RYTHM_KEY;}


}
<YYINITIAL, ST_ACTION>{
({CRLF}|{WHITE_SPACE})+                                           {yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                                    {yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                                 {return TokenType.BAD_CHARACTER; }
}