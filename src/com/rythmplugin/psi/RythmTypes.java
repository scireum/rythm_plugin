// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.rythmplugin.lexer.RythmElementType;
import com.rythmplugin.parser.RythmTokenType;
import com.rythmplugin.psi.impl.*;

public interface RythmTypes {

  IElementType HTML_START_RYTHM_BLOCK = new RythmElementType("HTML_START_RYTHM_BLOCK");
  IElementType HTML_WR = new RythmElementType("HTML_WR");
  IElementType INITIAL_DECLARATION = new RythmElementType("INITIAL_DECLARATION");
  IElementType JAVA_CODE = new RythmElementType("JAVA_CODE");
  IElementType METHOD_CALL = new RythmElementType("METHOD_CALL");
  IElementType METHOD_CALL_EXPR = new RythmElementType("METHOD_CALL_EXPR");
  IElementType PARAM = new RythmElementType("PARAM");
  IElementType QUALIFIED_NAME = new RythmElementType("QUALIFIED_NAME");
  IElementType RYTHM = new RythmElementType("RYTHM");
  IElementType RYTHM_ARGS = new RythmElementType("RYTHM_ARGS");
  IElementType RYTHM_EXTENDS = new RythmElementType("RYTHM_EXTENDS");
  IElementType RYTHM_IF_STATMENT = new RythmElementType("RYTHM_IF_STATMENT");
  IElementType RYTHM_IMPORT = new RythmElementType("RYTHM_IMPORT");
  IElementType RYTHM_I_18_N = new RythmElementType("RYTHM_I_18_N");
  IElementType RYTHM_KEY_BLOCK = new RythmElementType("RYTHM_KEY_BLOCK");
  IElementType RYTHM_KEY_BLOCK_EXP = new RythmElementType("RYTHM_KEY_BLOCK_EXP");
  IElementType RYTHM_KEY_IDENT = new RythmElementType("RYTHM_KEY_IDENT");
  IElementType RYTHM_METHOD = new RythmElementType("RYTHM_METHOD");
  IElementType RYTHM_SECTION = new RythmElementType("RYTHM_SECTION");
  IElementType RYTHM_SECTION_WOR = new RythmElementType("RYTHM_SECTION_WOR");
  IElementType RYTHM_SECTION_WR = new RythmElementType("RYTHM_SECTION_WR");
  IElementType STATEMENT = new RythmElementType("STATEMENT");

  IElementType AT = new RythmTokenType("@");
  IElementType AUSRF = new RythmTokenType("!");
  IElementType BAR = new RythmTokenType("|");
  IElementType BLOCK_COMMENT = new RythmTokenType("BLOCK_COMMENT");
  IElementType BRCSL = new RythmTokenType("[");
  IElementType BRCSR = new RythmTokenType("]");
  IElementType CLASS = new RythmTokenType("class");
  IElementType COLON = new RythmTokenType(":");
  IElementType COMMA = new RythmTokenType(",");
  IElementType DOLLAR = new RythmTokenType("$");
  IElementType DOT = new RythmTokenType(".");
  IElementType EQ = new RythmTokenType("=");
  IElementType EXCL = new RythmTokenType("EXCL");
  IElementType EXTENDS = new RythmTokenType("extends");
  IElementType GENERICS = new RythmTokenType("GENERICS");
  IElementType GF = new RythmTokenType("\"");
  IElementType HSHTG = new RythmTokenType("#");
  IElementType IDENTIFIER = new RythmTokenType("IDENTIFIER");
  IElementType IMPORT = new RythmTokenType("import");
  IElementType JAVA = new RythmTokenType("JAVA");
  IElementType LBRACE = new RythmTokenType("{");
  IElementType LEFTBRACES = new RythmTokenType("{:");
  IElementType LPAREN = new RythmTokenType("(");
  IElementType MUL = new RythmTokenType("*");
  IElementType PACKAGE = new RythmTokenType("package");
  IElementType PLUS = new RythmTokenType("+");
  IElementType RBRACE = new RythmTokenType("}");
  IElementType RIGHTBRACES = new RythmTokenType(":}");
  IElementType RPAREN = new RythmTokenType(")");
  IElementType RYTHM_FOR = new RythmTokenType("RYTHM_FOR");
  IElementType RYTHM_IF = new RythmTokenType("RYTHM_IF");
  IElementType RYTHM_INVOKE = new RythmTokenType("RYTHM_INVOKE");
  IElementType RYTHM_KEY = new RythmTokenType("RYTHM_KEY");
  IElementType RYTHM_PREFIX = new RythmTokenType("RYTHM_PREFIX");
  IElementType RYTHM_RENDER = new RythmTokenType("RYTHM_RENDER");
  IElementType SEMICOLON = new RythmTokenType(";");
  IElementType SLASH = new RythmTokenType("/");
  IElementType STATIC = new RythmTokenType("static");
  IElementType SUPER = new RythmTokenType("super");
  IElementType TEXT = new RythmTokenType("TEXT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == HTML_START_RYTHM_BLOCK) {
        return new RythmHtmlStartRythmBlockImpl(node);
      }
      else if (type == HTML_WR) {
        return new RythmHtmlWrImpl(node);
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
      else if (type == METHOD_CALL_EXPR) {
        return new RythmMethodCallExprImpl(node);
      }
      else if (type == PARAM) {
        return new RythmParamImpl(node);
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
      else if (type == RYTHM_EXTENDS) {
        return new RythmRythmExtendsImpl(node);
      }
      else if (type == RYTHM_IF_STATMENT) {
        return new RythmRYTHMIFStatmentImpl(node);
      }
      else if (type == RYTHM_IMPORT) {
        return new RythmRythmImportImpl(node);
      }
      else if (type == RYTHM_I_18_N) {
        return new RythmRythmI18NImpl(node);
      }
      else if (type == RYTHM_KEY_BLOCK) {
        return new RythmRYTHMKeyBlockImpl(node);
      }
      else if (type == RYTHM_KEY_BLOCK_EXP) {
        return new RythmRYTHMKeyBlockEXPImpl(node);
      }
      else if (type == RYTHM_KEY_IDENT) {
        return new RythmRythmKeyIdentImpl(node);
      }
      else if (type == RYTHM_METHOD) {
        return new RythmRythmMethodImpl(node);
      }
      else if (type == RYTHM_SECTION) {
        return new RythmRythmSectionImpl(node);
      }
      else if (type == RYTHM_SECTION_WOR) {
        return new RythmRythmSectionWorImpl(node);
      }
      else if (type == RYTHM_SECTION_WR) {
        return new RythmRythmSectionWrImpl(node);
      }
      else if (type == STATEMENT) {
        return new RythmStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
