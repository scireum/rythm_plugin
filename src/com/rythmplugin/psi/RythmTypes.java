// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.rythmplugin.lexer.RythmElementType;
import com.rythmplugin.parser.RythmTokenType;
import com.rythmplugin.psi.impl.*;

public interface RythmTypes {

  IElementType FIX = new RythmElementType("FIX");
  IElementType HTML_BLOCK = new RythmElementType("HTML_BLOCK");
  IElementType IDENT_METHOD_CALL = new RythmElementType("IDENT_METHOD_CALL");
  IElementType INITIAL_DECLARATION = new RythmElementType("INITIAL_DECLARATION");
  IElementType JAVA_CODE = new RythmElementType("JAVA_CODE");
  IElementType METHOD_CALL = new RythmElementType("METHOD_CALL");
  IElementType OPERATOR = new RythmElementType("OPERATOR");
  IElementType QUALIFIED_NAME = new RythmElementType("QUALIFIED_NAME");
  IElementType RYTHM = new RythmElementType("RYTHM");
  IElementType RYTHM_ARGS = new RythmElementType("RYTHM_ARGS");
  IElementType RYTHM_BLOCK = new RythmElementType("RYTHM_BLOCK");
  IElementType RYTHM_EXTENDS = new RythmElementType("RYTHM_EXTENDS");
  IElementType RYTHM_FILE = new RythmElementType("RYTHM_FILE");
  IElementType RYTHM_FOR = new RythmElementType("RYTHM_FOR");
  IElementType RYTHM_IF = new RythmElementType("RYTHM_IF");
  IElementType RYTHM_IF_ELSE = new RythmElementType("RYTHM_IF_ELSE");
  IElementType RYTHM_IMPORT = new RythmElementType("RYTHM_IMPORT");
  IElementType RYTHM_I_18_N = new RythmElementType("RYTHM_I_18_N");
  IElementType RYTHM_KEY_IDENT = new RythmElementType("RYTHM_KEY_IDENT");
  IElementType RYTHM_METHOD_CALL = new RythmElementType("RYTHM_METHOD_CALL");
  IElementType RYTHM_PREFIX = new RythmElementType("RYTHM_PREFIX");
  IElementType RYTHM_SECTION = new RythmElementType("RYTHM_SECTION");
  IElementType RYTHM_SYN = new RythmElementType("RYTHM_SYN");
  IElementType SCRIPT_BLOCK = new RythmElementType("SCRIPT_BLOCK");
  IElementType STATEMENT = new RythmElementType("STATEMENT");
  IElementType UNDEFINED_IDENT = new RythmElementType("UNDEFINED_IDENT");
  IElementType UNDEFINED_IDENT_BLOCK = new RythmElementType("UNDEFINED_IDENT_BLOCK");

  IElementType AND = new RythmTokenType("&&");
  IElementType AT = new RythmTokenType("@");
  IElementType AUSRF = new RythmTokenType("!");
  IElementType BAR = new RythmTokenType("|");
  IElementType BLOCK_COMMENT = new RythmTokenType("BLOCK_COMMENT");
  IElementType BRCSL = new RythmTokenType("[");
  IElementType BRCSR = new RythmTokenType("]");
  IElementType COLON = new RythmTokenType(":");
  IElementType COMMA = new RythmTokenType(",");
  IElementType DIGIT = new RythmTokenType("DIGIT");
  IElementType DOLLAR = new RythmTokenType("$");
  IElementType DOT = new RythmTokenType(".");
  IElementType EQ = new RythmTokenType("=");
  IElementType EXCL = new RythmTokenType("EXCL");
  IElementType FUNCTION = new RythmTokenType("FUNCTION");
  IElementType G = new RythmTokenType("G");
  IElementType GENERICS = new RythmTokenType("GENERICS");
  IElementType GF = new RythmTokenType("\"");
  IElementType GREATER = new RythmTokenType("GREATER");
  IElementType HSHTG = new RythmTokenType("#");
  IElementType HTML = new RythmTokenType("HTML");
  IElementType IDENTIFIER = new RythmTokenType("IDENTIFIER");
  IElementType JAVA = new RythmTokenType("JAVA");
  IElementType LBRACE = new RythmTokenType("{");
  IElementType LEFTBRACES = new RythmTokenType("{:");
  IElementType LPAREN = new RythmTokenType("(");
  IElementType MINUS = new RythmTokenType("-");
  IElementType MUL = new RythmTokenType("*");
  IElementType NEW = new RythmTokenType("NEW");
  IElementType NULL = new RythmTokenType("NULL");
  IElementType OR = new RythmTokenType("OR");
  IElementType PLUS = new RythmTokenType("+");
  IElementType Q_RYTHM = new RythmTokenType("Q_RYTHM");
  IElementType RBRACE = new RythmTokenType("}");
  IElementType RIGHTBRACES = new RythmTokenType(":}");
  IElementType RPAREN = new RythmTokenType(")");
  IElementType RYTHM_ELSE = new RythmTokenType("RYTHM_ELSE");
  IElementType RYTHM_ESCAPED = new RythmTokenType("RYTHM_ESCAPED");
  IElementType RYTHM_INVOKE = new RythmTokenType("RYTHM_INVOKE");
  IElementType RYTHM_KEY = new RythmTokenType("RYTHM_KEY");
  IElementType RYTHM_RENDER = new RythmTokenType("RYTHM_RENDER");
  IElementType SEMICOLON = new RythmTokenType(";");
  IElementType SLASH = new RythmTokenType("/");
  IElementType STRING_LITERAL = new RythmTokenType("STRING_LITERAL");
  IElementType THIS = new RythmTokenType("THIS");
  IElementType TILDE = new RythmTokenType("TILDE");
  IElementType VAR = new RythmTokenType("VAR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == FIX) {
        return new RythmFixImpl(node);
      }
      else if (type == HTML_BLOCK) {
        return new RythmHtmlBlockImpl(node);
      }
      else if (type == IDENT_METHOD_CALL) {
        return new RythmIdentMethodCallImpl(node);
      }
      else if (type == INITIAL_DECLARATION) {
        return new RythmInitialDeclarationImpl(node);
      }
      else if (type == JAVA_CODE) {
        return new RythmJavaCodeImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new RythmMethodCallImpl(node);
      }
      else if (type == OPERATOR) {
        return new RythmOperatorImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new RythmQualifiedNameImpl(node);
      }
      else if (type == RYTHM) {
        return new RythmRythmImpl(node);
      }
      else if (type == RYTHM_ARGS) {
        return new RythmRythmArgsImpl(node);
      }
      else if (type == RYTHM_BLOCK) {
        return new RythmRythmBlockImpl(node);
      }
      else if (type == RYTHM_EXTENDS) {
        return new RythmRythmExtendsImpl(node);
      }
      else if (type == RYTHM_FILE) {
        return new RythmRythmFileImpl(node);
      }
      else if (type == RYTHM_FOR) {
        return new RythmRythmForImpl(node);
      }
      else if (type == RYTHM_IF) {
        return new RythmRythmIfImpl(node);
      }
      else if (type == RYTHM_IF_ELSE) {
        return new RythmRythmIfElseImpl(node);
      }
      else if (type == RYTHM_IMPORT) {
        return new RythmRythmImportImpl(node);
      }
      else if (type == RYTHM_I_18_N) {
        return new RythmRythmI18NImpl(node);
      }
      else if (type == RYTHM_KEY_IDENT) {
        return new RythmRythmKeyIdentImpl(node);
      }
      else if (type == RYTHM_METHOD_CALL) {
        return new RythmRythmMethodCallImpl(node);
      }
      else if (type == RYTHM_PREFIX) {
        return new RythmRythmPrefixImpl(node);
      }
      else if (type == RYTHM_SECTION) {
        return new RythmRythmSectionImpl(node);
      }
      else if (type == RYTHM_SYN) {
        return new RythmRythmSynImpl(node);
      }
      else if (type == SCRIPT_BLOCK) {
        return new RythmScriptBlockImpl(node);
      }
      else if (type == STATEMENT) {
        return new RythmStatementImpl(node);
      }
      else if (type == UNDEFINED_IDENT) {
        return new RythmUndefinedIdentImpl(node);
      }
      else if (type == UNDEFINED_IDENT_BLOCK) {
        return new RythmUndefinedIdentBlockImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
