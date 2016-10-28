// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.rythmplugin.lexer.RythmElementType;
import com.rythmplugin.parser.RythmTokenType;
import com.rythmplugin.psi.impl.*;

public interface RythmTypes {

  IElementType INITIAL_DECLARATION = new RythmElementType("INITIAL_DECLARATION");
  IElementType JAVA_CODE = new RythmElementType("JAVA_CODE");
  IElementType PARAM = new RythmElementType("PARAM");
  IElementType QUALIFIED_NAME = new RythmElementType("QUALIFIED_NAME");
  IElementType RYTHM = new RythmElementType("RYTHM");
  IElementType RYTHM_ARGS = new RythmElementType("RYTHM_ARGS");
  IElementType RYTHM_EXTENDS = new RythmElementType("RYTHM_EXTENDS");
  IElementType RYTHM_IMPORT = new RythmElementType("RYTHM_IMPORT");
  IElementType RYTHM_KEYY = new RythmElementType("RYTHM_KEYY");
  IElementType RYTHM_SECTION = new RythmElementType("RYTHM_SECTION");

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
  IElementType RYTHM_I18N = new RythmTokenType("RYTHM_I18N");
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
       if (type == INITIAL_DECLARATION) {
        return new RythmInitialDeclarationImpl(node);
      }
      else if (type == JAVA_CODE) {
        return new RythmJavaCodeImpl(node);
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
      else if (type == RYTHM_IMPORT) {
        return new RythmRythmImportImpl(node);
      }
      else if (type == RYTHM_KEYY) {
        return new RythmRythmKeyyImpl(node);
      }
      else if (type == RYTHM_SECTION) {
        return new RythmRythmSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
