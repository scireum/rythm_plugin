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

//SCRIPT = <script.*?>.*?>

RYTHM_ARGS = @args.*|@args
RYTHM_SECTION = @section.*?\)|@section
RYTHM_EXTENDS = @extends.*\)|@extends
RYTHM_IMPORT = @import.*|@import
RYTHM_RENDER = @render.*?\)|@render
RYTHM_INVOKE = @invoke.*?\)|@invoke
RYTHM_I_18_N = @i18n\(\"[a-zA-Z]+\.*[a-zA-Z]*\.*[a-zA-Z]*\"\)+|@i18n
RYTHM_PREFIX = @prefix

RYTHM_KEY = @[a-zA-Z]+|@[a-z]+[A-Z]+[a-z]+

RYTHM_METHOD = \.[a-zA-Z]\(+[a-zA-Z]*\)|\.[a-zA-Z]+\_*[A-Z]*\(*\)|\.equals|\.get[a-zA-Z]+\(\)|\.get[a-zA-Z]+\(*[a-zA-Z]*\)*|\.get

RYTHM_BLOCK = [a-zA-Z]+\:\s*[a-zA-Z]*\.[a-zA-Z]+\(\)\,|[a-zA-Z]+\:\s*\"[a-zA-Z]+\.[a-zA-Z]+\"\,|[a-zA-Z]+:\s\"[a-zA-Z]+\.[a-zA-Z]+\.[a-zA-Z]+\"\)*\,*|[a-zA-Z]+\:[a-zA-Z]+\.[a-zA-Z]+\([a-zA-Z]+\.[a-zA-Z]+\(\)\)\,|[a-zA-Z]+:\"[a-zA-Z]+\.[a-zA-Z]+\"\)|[a-zA-Z]+:\"[a-zA-Z]+\"*,*\.*[a-zA-Z]*\.*[a-zA-Z]*\"\)*,*

RYTHM_ELSE = else\s?\{

RYTHM_IF = @if\s*\(*\!*[a-zA-Z]*\.*[a-zA-Z]*\(*\"*[a-zA-Z]*\"*\)*\)*?\)*\.*[a-zA-Z]*\(*\)?\)\=*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\s*\&&*\s*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*.*\)\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*[a-zA-Z]*\(*\)*\s*\!*\=*\s*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(?\)*\.*[a-zA-Z]*\_*[a-zA-Z]*\(*\)*\>*\<*[a-zA-Z0-9]*\)*.*?\)\)*\.*[a-zA-Z]*\(*\)*.*\)|@if.*\)
//@if\s*\(*\!*[a-zA-Z]*\.*[a-zA-Z]*\(*\"*[a-zA-Z]*\"*\)+\)*?\)*\.*[a-zA-Z]*\(*\)?\)\=*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\s*\&&*\s*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\)\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*[a-zA-Z]*\(*\)*\s*\!*\=*\s*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(?\)*\.*[a-zA-Z]*\_*[a-zA-Z]*\(*\)*\>*\<*[a-zA-Z0-9]*\)*?\)\)*\.*[a-zA-Z]*\(*\)*\)
//@if\s*\(*\!*[a-zA-Z]*\.*[a-zA-Z]*\(*\"*[a-zA-Z]*\"*\).*\)*?\)*\.*[a-zA-Z]*\(*\)?\)\=*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\s*\&&*\s*[a-zA-Z]*\.*[a-zA-Z]*\(*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\)*\)\.*[a-zA-Z]*\(*\)*|@if\s*\(*[a-zA-Z]*\.*[a-zA-Z]*\(*[a-zA-Z]*\(*\)*\s*\!*\=*\s*[a-zA-Z]*\)*\.*[a-zA-Z]*\(*[a-zA-Z]*\.*[a-zA-Z]*\(?\)*\.*[a-zA-Z]*\_*[a-zA-Z]*\(*\)*\>*\<*[a-zA-Z0-9]*\)*?\)\)*\.*[a-zA-Z]*\(*\)*\)
RYTHM_COMMENT = @\*|\*.*

RYTHM_FOR = @for.*\)|@for
RYTHM = {RYTHM_FOR}|{RYTHM_IF}|{RYTHM_KEY}|{RYTHM_ARGS}|{RYTHM_SECTION}|{RYTHM_EXTENDS}|{RYTHM_IMPORT}|{RYTHM_RENDER}|{RYTHM_INVOKE}|{RYTHM_I_18_N}|{RYTHM_PREFIX}|{RYTHM_KEY}

TEXT = [^@\.\{\}\(\)\*]*

//ESCAPES = [abfnrtv]
//STR =      "\""
TAG = \<[a-zA-Z]+\>|\<\/[a-zA-Z]+\>|<[a-z]+|>

HEX_DIGIT = [0-9A-Fa-f]
INT_DIGIT = [0-9]
OCT_DIGIT = [0-7]


NUM_INT = "0" | ([1-9] {INT_DIGIT}*)
NUM_HEX = ("0x" | "0X") {HEX_DIGIT}+
NUM_OCT = "0" {OCT_DIGIT}+


%state ST_ACTION
%%
<YYINITIAL>          {TEXT}                          {yybegin (YYINITIAL);return RythmTypes.TEXT; }

//<YYINITIAL> {SCRIPT}                                              {yybegin(YYINITIAL); return RythmTypes.SCRIPT;}
<ST_ACTION>{
<YYINITIAL>{RYTHM_METHOD}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_METHOD;}
//  "`" [^`]* "`"?                                                              { return RythmTypes.RAW_STRING; }
//  {STR} ( [^\"\\\n\r] | "\\" ("\\" | {STR} | {ESCAPES} | [0-8xuU] ) )* {STR}? { return RythmTypes.STRING; }


//<YYINITIAL> {RYTHM_BLOCK}                                       {yybegin(YYINITIAL); return RythmTypes.RYTHM_BLOCK;}

<YYINITIAL> {TAG}                                                 {yybegin(YYINITIAL); return RythmTypes.TAG;}

<YYINITIAL> {RYTHM_ARGS}                                          {yybegin(YYINITIAL); return RythmTypes.RYTHM_ARGS;}

<YYINITIAL> {RYTHM_SECTION}                                       {yybegin(YYINITIAL); return RythmTypes.RYTHM_SECTION;}

<YYINITIAL> {RYTHM_RENDER}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_RENDER;}

<YYINITIAL> {RYTHM_EXTENDS}                                       {yybegin(YYINITIAL); return RythmTypes.RYTHM_EXTENDS;}

<YYINITIAL> {RYTHM_IMPORT}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_IMPORT;}

<YYINITIAL> {RYTHM_INVOKE}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_INVOKE;}

<YYINITIAL>{RYTHM_ELSE}                                          {yybegin(YYINITIAL); return RythmTypes.RYTHM_ELSE;}

<YYINITIAL>{RYTHM_IF}                                            {yybegin(YYINITIAL); return RythmTypes.RYTHM_IF;}

<YYINITIAL>{RYTHM_FOR}                                           {yybegin(YYINITIAL); return RythmTypes.RYTHM_FOR;}

<YYINITIAL> {RYTHM_I_18_N}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_I_18_N;}

<YYINITIAL> {RYTHM_PREFIX}                                        {yybegin(YYINITIAL); return RythmTypes.RYTHM_PREFIX;}

<YYINITIAL> {RYTHM_COMMENT}                                       {yybegin(YYINITIAL); return RythmTypes.RYTHM_COMMENT;}

<YYINITIAL> {RYTHM_KEY}                                           {yybegin(YYINITIAL); return RythmTypes.RYTHM_KEY;}


  {NUM_OCT}                                {  return RythmTypes.NUMBER; }
  {NUM_HEX}                                {  return RythmTypes.NUMBER; }
  {NUM_INT}                                {  return RythmTypes.NUMBER; }
}
<YYINITIAL, ST_ACTION>{
({CRLF}|{WHITE_SPACE})+                                           {yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                                    {yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                                 {return TokenType.BAD_CHARACTER; }
}