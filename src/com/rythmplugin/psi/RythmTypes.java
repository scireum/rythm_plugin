// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.rythmplugin.lexer.RythmElementType;
import com.rythmplugin.parser.RythmTokenType;
import com.rythmplugin.psi.impl.*;

public interface RythmTypes {

  IElementType AND_AND = new RythmElementType("AND_AND");
  IElementType AS = new RythmElementType("AS");
  IElementType AT = new RythmElementType("AT");
  IElementType BIT_AND = new RythmElementType("BIT_AND");
  IElementType BIT_NOT = new RythmElementType("BIT_NOT");
  IElementType BIT_OR = new RythmElementType("BIT_OR");
  IElementType BIT_XOR = new RythmElementType("BIT_XOR");
  IElementType CLASS_ATTR_END = new RythmElementType("CLASS_ATTR_END");
  IElementType CLASS_ATTR_START = new RythmElementType("CLASS_ATTR_START");
  IElementType CMP = new RythmElementType("CMP");
  IElementType COLON = new RythmElementType("COLON");
  IElementType COMMA = new RythmElementType("COMMA");
  IElementType COMMENT = new RythmElementType("COMMENT");
  IElementType DIGITS = new RythmElementType("DIGITS");
  IElementType DIV = new RythmElementType("DIV");
  IElementType DIV_EQ = new RythmElementType("DIV_EQ");
  IElementType DOT = new RythmElementType("DOT");
  IElementType DOUBLE_COLON = new RythmElementType("DOUBLE_COLON");
  IElementType EQ = new RythmElementType("EQ");
  IElementType EQ_EQ = new RythmElementType("EQ_EQ");
  IElementType GREATER = new RythmElementType("GREATER");
  IElementType GREATER_OR_EQ = new RythmElementType("GREATER_OR_EQ");
  IElementType HASHTAG = new RythmElementType("HASHTAG");
  IElementType LBRACE = new RythmElementType("LBRACE");
  IElementType LBRACKET = new RythmElementType("LBRACKET");
  IElementType LESS = new RythmElementType("LESS");
  IElementType LESS_OR_EQ = new RythmElementType("LESS_OR_EQ");
  IElementType LETTER = new RythmElementType("LETTER");
  IElementType LPAREN = new RythmElementType("LPAREN");
  IElementType MINUS = new RythmElementType("MINUS");
  IElementType MINUS_EQ = new RythmElementType("MINUS_EQ");
  IElementType MINUS_MINUS = new RythmElementType("MINUS_MINUS");
  IElementType MUL = new RythmElementType("MUL");
  IElementType MULTI_ARGS = new RythmElementType("MULTI_ARGS");
  IElementType MUL_EQ = new RythmElementType("MUL_EQ");
  IElementType NOT = new RythmElementType("NOT");
  IElementType NOT_EQ = new RythmElementType("NOT_EQ");
  IElementType OR_OR = new RythmElementType("OR_OR");
  IElementType PLUS = new RythmElementType("PLUS");
  IElementType PLUS_EQ = new RythmElementType("PLUS_EQ");
  IElementType PLUS_PLUS = new RythmElementType("PLUS_PLUS");
  IElementType PROPERTY = new RythmElementType("PROPERTY");
  IElementType QM = new RythmElementType("QM");
  IElementType QUESTION = new RythmElementType("QUESTION");
  IElementType RBRACE = new RythmElementType("RBRACE");
  IElementType RBRACKET = new RythmElementType("RBRACKET");
  IElementType REMAINDER = new RythmElementType("REMAINDER");
  IElementType REMAINDER_EQ = new RythmElementType("REMAINDER_EQ");
  IElementType RPAREN = new RythmElementType("RPAREN");
  IElementType RYTHM = new RythmElementType("RYTHM");
  IElementType SEMICOLON = new RythmElementType("SEMICOLON");
  IElementType SEND_CHANNEL = new RythmElementType("SEND_CHANNEL");
  IElementType SHIFT_LEFT = new RythmElementType("SHIFT_LEFT");
  IElementType SHIFT_RIGHT = new RythmElementType("SHIFT_RIGHT");
  IElementType TOKENS = new RythmElementType("TOKENS");
  IElementType UNSIGNED_SHIFT_RIGHT = new RythmElementType("UNSIGNED_SHIFT_RIGHT");

  IElementType CRLF = new RythmTokenType("CRLF");
  IElementType FUNCTION = new RythmTokenType("FUNCTION");
  IElementType NUMBER = new RythmTokenType("NUMBER");
  IElementType PARAM = new RythmTokenType("PARAM");
  IElementType RYTHM_ARGS = new RythmTokenType("RYTHM_ARGS");
  IElementType RYTHM_COMMENT = new RythmTokenType("RYTHM_COMMENT");
  IElementType RYTHM_EXTENDS = new RythmTokenType("RYTHM_EXTENDS");
  IElementType RYTHM_FOR = new RythmTokenType("RYTHM_FOR");
  IElementType RYTHM_IF = new RythmTokenType("RYTHM_IF");
  IElementType RYTHM_IMPORT = new RythmTokenType("RYTHM_IMPORT");
  IElementType RYTHM_INVOKE = new RythmTokenType("RYTHM_INVOKE");
  IElementType RYTHM_I_18_N = new RythmTokenType("RYTHM_I_18_N");
  IElementType RYTHM_KEY = new RythmTokenType("RYTHM_KEY");
  IElementType RYTHM_METHOD = new RythmTokenType("RYTHM_METHOD");
  IElementType RYTHM_PREFIX = new RythmTokenType("RYTHM_PREFIX");
  IElementType RYTHM_RENDER = new RythmTokenType("RYTHM_RENDER");
  IElementType RYTHM_SECTION = new RythmTokenType("RYTHM_SECTION");
  IElementType SEPARATOR = new RythmTokenType("SEPARATOR");
  IElementType TAG = new RythmTokenType("TAG");
  IElementType TEXT = new RythmTokenType("TEXT");
  IElementType TOKENS_49_0 = new RythmTokenType("tokens_49_0");
  IElementType WS = new RythmTokenType("WS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AND_AND) {
        return new RythmAndAndImpl(node);
      }
      else if (type == AS) {
        return new RythmAsImpl(node);
      }
      else if (type == AT) {
        return new RythmAtImpl(node);
      }
      else if (type == BIT_AND) {
        return new RythmBitAndImpl(node);
      }
      else if (type == BIT_NOT) {
        return new RythmBitNotImpl(node);
      }
      else if (type == BIT_OR) {
        return new RythmBitOrImpl(node);
      }
      else if (type == BIT_XOR) {
        return new RythmBitXorImpl(node);
      }
      else if (type == CLASS_ATTR_END) {
        return new RythmClassAttrEndImpl(node);
      }
      else if (type == CLASS_ATTR_START) {
        return new RythmClassAttrStartImpl(node);
      }
      else if (type == CMP) {
        return new RythmCmpImpl(node);
      }
      else if (type == COLON) {
        return new RythmColonImpl(node);
      }
      else if (type == COMMA) {
        return new RythmCommaImpl(node);
      }
      else if (type == COMMENT) {
        return new RythmCommentImpl(node);
      }
      else if (type == DIGITS) {
        return new RythmDigitsImpl(node);
      }
      else if (type == DIV) {
        return new RythmDivImpl(node);
      }
      else if (type == DIV_EQ) {
        return new RythmDivEqImpl(node);
      }
      else if (type == DOT) {
        return new RythmDotImpl(node);
      }
      else if (type == DOUBLE_COLON) {
        return new RythmDoubleColonImpl(node);
      }
      else if (type == EQ) {
        return new RythmEqImpl(node);
      }
      else if (type == EQ_EQ) {
        return new RythmEqEqImpl(node);
      }
      else if (type == GREATER) {
        return new RythmGreaterImpl(node);
      }
      else if (type == GREATER_OR_EQ) {
        return new RythmGreaterOrEqImpl(node);
      }
      else if (type == HASHTAG) {
        return new RythmHashtagImpl(node);
      }
      else if (type == LBRACE) {
        return new RythmLbraceImpl(node);
      }
      else if (type == LBRACKET) {
        return new RythmLbracketImpl(node);
      }
      else if (type == LESS) {
        return new RythmLessImpl(node);
      }
      else if (type == LESS_OR_EQ) {
        return new RythmLessOrEqImpl(node);
      }
      else if (type == LETTER) {
        return new RythmLetterImpl(node);
      }
      else if (type == LPAREN) {
        return new RythmLparenImpl(node);
      }
      else if (type == MINUS) {
        return new RythmMinusImpl(node);
      }
      else if (type == MINUS_EQ) {
        return new RythmMinusEqImpl(node);
      }
      else if (type == MINUS_MINUS) {
        return new RythmMinusMinusImpl(node);
      }
      else if (type == MUL) {
        return new RythmMulImpl(node);
      }
      else if (type == MULTI_ARGS) {
        return new RythmMultiArgsImpl(node);
      }
      else if (type == MUL_EQ) {
        return new RythmMulEqImpl(node);
      }
      else if (type == NOT) {
        return new RythmNotImpl(node);
      }
      else if (type == NOT_EQ) {
        return new RythmNotEqImpl(node);
      }
      else if (type == OR_OR) {
        return new RythmOrOrImpl(node);
      }
      else if (type == PLUS) {
        return new RythmPlusImpl(node);
      }
      else if (type == PLUS_EQ) {
        return new RythmPlusEqImpl(node);
      }
      else if (type == PLUS_PLUS) {
        return new RythmPlusPlusImpl(node);
      }
      else if (type == PROPERTY) {
        return new RythmPropertyImpl(node);
      }
      else if (type == QM) {
        return new RythmQmImpl(node);
      }
      else if (type == QUESTION) {
        return new RythmQuestionImpl(node);
      }
      else if (type == RBRACE) {
        return new RythmRbraceImpl(node);
      }
      else if (type == RBRACKET) {
        return new RythmRbracketImpl(node);
      }
      else if (type == REMAINDER) {
        return new RythmRemainderImpl(node);
      }
      else if (type == REMAINDER_EQ) {
        return new RythmRemainderEqImpl(node);
      }
      else if (type == RPAREN) {
        return new RythmRparenImpl(node);
      }
      else if (type == RYTHM) {
        return new RythmRythmImpl(node);
      }
      else if (type == SEMICOLON) {
        return new RythmSemicolonImpl(node);
      }
      else if (type == SEND_CHANNEL) {
        return new RythmSendChannelImpl(node);
      }
      else if (type == SHIFT_LEFT) {
        return new RythmShiftLeftImpl(node);
      }
      else if (type == SHIFT_RIGHT) {
        return new RythmShiftRightImpl(node);
      }
      else if (type == TOKENS) {
        return new RythmTokensImpl(node);
      }
      else if (type == UNSIGNED_SHIFT_RIGHT) {
        return new RythmUnsignedShiftRightImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
