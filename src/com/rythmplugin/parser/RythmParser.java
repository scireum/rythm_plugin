// This is a generated file. Not intended for manual editing.
package com.rythmplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.rythmplugin.psi.RythmTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RythmParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AND_AND) {
      r = AND_AND(b, 0);
    }
    else if (t == AS) {
      r = AS(b, 0);
    }
    else if (t == AT) {
      r = AT(b, 0);
    }
    else if (t == BIT_AND) {
      r = BIT_AND(b, 0);
    }
    else if (t == BIT_NOT) {
      r = BIT_NOT(b, 0);
    }
    else if (t == BIT_OR) {
      r = BIT_OR(b, 0);
    }
    else if (t == BIT_XOR) {
      r = BIT_XOR(b, 0);
    }
    else if (t == CLASS_ATTR_END) {
      r = CLASS_ATTR_END(b, 0);
    }
    else if (t == CLASS_ATTR_START) {
      r = CLASS_ATTR_START(b, 0);
    }
    else if (t == CMP) {
      r = CMP(b, 0);
    }
    else if (t == COLON) {
      r = COLON(b, 0);
    }
    else if (t == COMMA) {
      r = COMMA(b, 0);
    }
    else if (t == COMMENT) {
      r = COMMENT(b, 0);
    }
    else if (t == DIGITS) {
      r = DIGITS(b, 0);
    }
    else if (t == DIV) {
      r = DIV(b, 0);
    }
    else if (t == DIV_EQ) {
      r = DIV_EQ(b, 0);
    }
    else if (t == DOT) {
      r = DOT(b, 0);
    }
    else if (t == DOUBLE_COLON) {
      r = DOUBLE_COLON(b, 0);
    }
    else if (t == EQ) {
      r = EQ(b, 0);
    }
    else if (t == EQ_EQ) {
      r = EQ_EQ(b, 0);
    }
    else if (t == EXPRESSION) {
      r = EXPRESSION(b, 0);
    }
    else if (t == GREATER) {
      r = GREATER(b, 0);
    }
    else if (t == GREATER_OR_EQ) {
      r = GREATER_OR_EQ(b, 0);
    }
    else if (t == HASHTAG) {
      r = HASHTAG(b, 0);
    }
    else if (t == JS_SNIP) {
      r = JS_SNIP(b, 0);
    }
    else if (t == LBRACE) {
      r = LBRACE(b, 0);
    }
    else if (t == LBRACKET) {
      r = LBRACKET(b, 0);
    }
    else if (t == LESS) {
      r = LESS(b, 0);
    }
    else if (t == LESS_OR_EQ) {
      r = LESS_OR_EQ(b, 0);
    }
    else if (t == LETTER) {
      r = LETTER(b, 0);
    }
    else if (t == LPAREN) {
      r = LPAREN(b, 0);
    }
    else if (t == MINUS) {
      r = MINUS(b, 0);
    }
    else if (t == MINUS_EQ) {
      r = MINUS_EQ(b, 0);
    }
    else if (t == MINUS_MINUS) {
      r = MINUS_MINUS(b, 0);
    }
    else if (t == MUL) {
      r = MUL(b, 0);
    }
    else if (t == MULTI_ARGS) {
      r = MULTI_ARGS(b, 0);
    }
    else if (t == MUL_EQ) {
      r = MUL_EQ(b, 0);
    }
    else if (t == NOT) {
      r = NOT(b, 0);
    }
    else if (t == NOT_EQ) {
      r = NOT_EQ(b, 0);
    }
    else if (t == OR_OR) {
      r = OR_OR(b, 0);
    }
    else if (t == PLUS) {
      r = PLUS(b, 0);
    }
    else if (t == PLUS_EQ) {
      r = PLUS_EQ(b, 0);
    }
    else if (t == PLUS_PLUS) {
      r = PLUS_PLUS(b, 0);
    }
    else if (t == QM) {
      r = QM(b, 0);
    }
    else if (t == QUESTION) {
      r = QUESTION(b, 0);
    }
    else if (t == RBRACE) {
      r = RBRACE(b, 0);
    }
    else if (t == RBRACKET) {
      r = RBRACKET(b, 0);
    }
    else if (t == REMAINDER) {
      r = REMAINDER(b, 0);
    }
    else if (t == REMAINDER_EQ) {
      r = REMAINDER_EQ(b, 0);
    }
    else if (t == RPAREN) {
      r = RPAREN(b, 0);
    }
    else if (t == RYTHM) {
      r = RYTHM(b, 0);
    }
    else if (t == RYTHM_ARGS) {
      r = RYTHM_ARGS(b, 0);
    }
    else if (t == RYTHM_EXTENDS) {
      r = RYTHM_EXTENDS(b, 0);
    }
    else if (t == RYTHM_FOR) {
      r = RYTHM_FOR(b, 0);
    }
    else if (t == RYTHM_IF) {
      r = RYTHM_IF(b, 0);
    }
    else if (t == RYTHM_IMPORT) {
      r = RYTHM_IMPORT(b, 0);
    }
    else if (t == RYTHM_I_18_N) {
      r = RYTHM_I_18_N(b, 0);
    }
    else if (t == RYTHM_KEYS) {
      r = RYTHM_KEYS(b, 0);
    }
    else if (t == RYTHM_SECTION) {
      r = RYTHM_SECTION(b, 0);
    }
    else if (t == SEMICOLON) {
      r = SEMICOLON(b, 0);
    }
    else if (t == SEND_CHANNEL) {
      r = SEND_CHANNEL(b, 0);
    }
    else if (t == SHIFT_LEFT) {
      r = SHIFT_LEFT(b, 0);
    }
    else if (t == SHIFT_RIGHT) {
      r = SHIFT_RIGHT(b, 0);
    }
    else if (t == TEST) {
      r = TEST(b, 0);
    }
    else if (t == UNSIGNED_SHIFT_RIGHT) {
      r = UNSIGNED_SHIFT_RIGHT(b, 0);
    }
    else if (t == WS) {
      r = WS(b, 0);
    }
    else if (t == CLASSS) {
      r = classs(b, 0);
    }
    else if (t == PACKAGEE) {
      r = packagee(b, 0);
    }
    else if (t == TOKENS) {
      r = tokens(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return rythmFile(b, l + 1);
  }

  /* ********************************************************** */
  // '&&'
  public static boolean AND_AND(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AND_AND")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_AND, "<and and>");
    r = consumeToken(b, "&&");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "'"
  public static boolean AS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS, "<as>");
    r = consumeToken(b, "'");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@'
  public static boolean AT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AT, "<at>");
    r = consumeToken(b, "@");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '&'
  public static boolean BIT_AND(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BIT_AND")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_AND, "<bit and>");
    r = consumeToken(b, "&");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '~'
  public static boolean BIT_NOT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BIT_NOT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_NOT, "<bit not>");
    r = consumeToken(b, "~");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '|'
  public static boolean BIT_OR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BIT_OR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_OR, "<bit or>");
    r = consumeToken(b, "|");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '^'
  public static boolean BIT_XOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BIT_XOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_XOR, "<bit xor>");
    r = consumeToken(b, "^");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '/>'
  public static boolean CLASS_ATTR_END(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_ATTR_END")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_ATTR_END, "<class attr end>");
    r = consumeToken(b, "/>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '</'
  public static boolean CLASS_ATTR_START(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_ATTR_START")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_ATTR_START, "<class attr start>");
    r = consumeToken(b, "</");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<=>'
  public static boolean CMP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CMP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMP, "<cmp>");
    r = consumeToken(b, "<=>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':'
  public static boolean COLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COLON")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON, "<colon>");
    r = consumeToken(b, ":");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ','
  public static boolean COMMA(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMA")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA, "<comma>");
    r = consumeToken(b, ",");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@' tokens |MUL tokens+  |MUL '@'
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = COMMENT_0(b, l + 1);
    if (!r) r = COMMENT_1(b, l + 1);
    if (!r) r = COMMENT_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@' tokens
  private static boolean COMMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@");
    r = r && tokens(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MUL tokens+
  private static boolean COMMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MUL(b, l + 1);
    r = r && COMMENT_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tokens+
  private static boolean COMMENT_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tokens(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!tokens(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "COMMENT_1_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // MUL '@'
  private static boolean COMMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MUL(b, l + 1);
    r = r && consumeToken(b, "@");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'|'9'|'0'
  public static boolean DIGITS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIGITS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIGITS, "<digits>");
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    if (!r) r = consumeToken(b, "9");
    if (!r) r = consumeToken(b, "0");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '/'
  public static boolean DIV(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIV")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIV, "<div>");
    r = consumeToken(b, "/");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '/='
  public static boolean DIV_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIV_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIV_EQ, "<div eq>");
    r = consumeToken(b, "/=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '.'
  public static boolean DOT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT, "<dot>");
    r = consumeToken(b, ".");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '::'
  public static boolean DOUBLE_COLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_COLON")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOUBLE_COLON, "<double colon>");
    r = consumeToken(b, "::");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '='
  public static boolean EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQ, "<eq>");
    r = consumeToken(b, "=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '=='
  public static boolean EQ_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EQ_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQ_EQ, "<eq eq>");
    r = consumeToken(b, "==");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' TEXT '}'
  public static boolean EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = consumeToken(b, "{");
    r = r && consumeToken(b, TEXT);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '>'
  public static boolean GREATER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GREATER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GREATER, "<greater>");
    r = consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '>='
  public static boolean GREATER_OR_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GREATER_OR_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GREATER_OR_EQ, "<greater or eq>");
    r = consumeToken(b, ">=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "#"
  public static boolean HASHTAG(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HASHTAG")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HASHTAG, "<hashtag>");
    r = consumeToken(b, "#");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '$'STATEMENT
  public static boolean JS_SNIP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JS_SNIP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JS_SNIP, "<js snip>");
    r = consumeToken(b, "$");
    r = r && consumeToken(b, STATEMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{'
  public static boolean LBRACE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LBRACE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LBRACE, "<lbrace>");
    r = consumeToken(b, "{");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '['
  public static boolean LBRACKET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LBRACKET")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LBRACKET, "<lbracket>");
    r = consumeToken(b, "[");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<'
  public static boolean LESS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LESS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LESS, "<less>");
    r = consumeToken(b, "<");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<='
  public static boolean LESS_OR_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LESS_OR_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LESS_OR_EQ, "<less or eq>");
    r = consumeToken(b, "<=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X'|'Y'|'Z'|'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z'
  public static boolean LETTER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LETTER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, "B");
    if (!r) r = consumeToken(b, "C");
    if (!r) r = consumeToken(b, "D");
    if (!r) r = consumeToken(b, "E");
    if (!r) r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "G");
    if (!r) r = consumeToken(b, "H");
    if (!r) r = consumeToken(b, "I");
    if (!r) r = consumeToken(b, "J");
    if (!r) r = consumeToken(b, "K");
    if (!r) r = consumeToken(b, "L");
    if (!r) r = consumeToken(b, "M");
    if (!r) r = consumeToken(b, "N");
    if (!r) r = consumeToken(b, "O");
    if (!r) r = consumeToken(b, "P");
    if (!r) r = consumeToken(b, "Q");
    if (!r) r = consumeToken(b, "R");
    if (!r) r = consumeToken(b, "S");
    if (!r) r = consumeToken(b, "T");
    if (!r) r = consumeToken(b, "U");
    if (!r) r = consumeToken(b, "V");
    if (!r) r = consumeToken(b, "W");
    if (!r) r = consumeToken(b, "X");
    if (!r) r = consumeToken(b, "Y");
    if (!r) r = consumeToken(b, "Z");
    if (!r) r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, "b");
    if (!r) r = consumeToken(b, "c");
    if (!r) r = consumeToken(b, "d");
    if (!r) r = consumeToken(b, "e");
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "g");
    if (!r) r = consumeToken(b, "h");
    if (!r) r = consumeToken(b, "i");
    if (!r) r = consumeToken(b, "j");
    if (!r) r = consumeToken(b, "k");
    if (!r) r = consumeToken(b, "l");
    if (!r) r = consumeToken(b, "m");
    if (!r) r = consumeToken(b, "n");
    if (!r) r = consumeToken(b, "o");
    if (!r) r = consumeToken(b, "p");
    if (!r) r = consumeToken(b, "q");
    if (!r) r = consumeToken(b, "r");
    if (!r) r = consumeToken(b, "s");
    if (!r) r = consumeToken(b, "t");
    if (!r) r = consumeToken(b, "u");
    if (!r) r = consumeToken(b, "v");
    if (!r) r = consumeToken(b, "w");
    if (!r) r = consumeToken(b, "x");
    if (!r) r = consumeToken(b, "y");
    if (!r) r = consumeToken(b, "z");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '('
  public static boolean LPAREN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LPAREN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LPAREN, "<lparen>");
    r = consumeToken(b, "(");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '-'
  public static boolean MINUS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MINUS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MINUS, "<minus>");
    r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '-='
  public static boolean MINUS_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MINUS_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MINUS_EQ, "<minus eq>");
    r = consumeToken(b, "-=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '--'
  public static boolean MINUS_MINUS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MINUS_MINUS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MINUS_MINUS, "<minus minus>");
    r = consumeToken(b, "--");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*'
  public static boolean MUL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MUL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL, "<mul>");
    r = consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '...'
  public static boolean MULTI_ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ARGS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_ARGS, "<multi args>");
    r = consumeToken(b, "...");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*='
  public static boolean MUL_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MUL_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL_EQ, "<mul eq>");
    r = consumeToken(b, "*=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '!'
  public static boolean NOT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOT, "<not>");
    r = consumeToken(b, "!");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '!='
  public static boolean NOT_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOT_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOT_EQ, "<not eq>");
    r = consumeToken(b, "!=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '||'
  public static boolean OR_OR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OR_OR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_OR, "<or or>");
    r = consumeToken(b, "||");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+'
  public static boolean PLUS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PLUS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS, "<plus>");
    r = consumeToken(b, "+");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+='
  public static boolean PLUS_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PLUS_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS_EQ, "<plus eq>");
    r = consumeToken(b, "+=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '++'
  public static boolean PLUS_PLUS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PLUS_PLUS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS_PLUS, "<plus plus>");
    r = consumeToken(b, "++");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '"'
  public static boolean QM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QM")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QM, "<qm>");
    r = consumeToken(b, "\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '?'
  public static boolean QUESTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUESTION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUESTION, "<question>");
    r = consumeToken(b, "?");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '}'
  public static boolean RBRACE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RBRACE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RBRACE, "<rbrace>");
    r = consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ']'
  public static boolean RBRACKET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RBRACKET")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RBRACKET, "<rbracket>");
    r = consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '%'
  public static boolean REMAINDER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REMAINDER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REMAINDER, "<remainder>");
    r = consumeToken(b, "%");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '%='
  public static boolean REMAINDER_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REMAINDER_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REMAINDER_EQ, "<remainder eq>");
    r = consumeToken(b, "%=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ')'
  public static boolean RPAREN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RPAREN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RPAREN, "<rparen>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_KEYS|RYTHM_I_18_N|RYTHM_METHOD|RYTHM_ARGS|RYTHM_SECTION|RYTHM_EXTENDS|RYTHM_IMPORT|RYTHM_RENDER|
  // RYTHM_INVOKE|RYTHM_IF|RYTHM_FOR|RYTHM_PREFIX|RYTHM_COMMENT|RYTHM_ELSE
  public static boolean RYTHM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM, "<rythm>");
    r = RYTHM_KEYS(b, l + 1);
    if (!r) r = RYTHM_I_18_N(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM_METHOD);
    if (!r) r = RYTHM_ARGS(b, l + 1);
    if (!r) r = RYTHM_SECTION(b, l + 1);
    if (!r) r = RYTHM_EXTENDS(b, l + 1);
    if (!r) r = RYTHM_IMPORT(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM_RENDER);
    if (!r) r = consumeToken(b, RYTHM_INVOKE);
    if (!r) r = RYTHM_IF(b, l + 1);
    if (!r) r = RYTHM_FOR(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM_PREFIX);
    if (!r) r = consumeToken(b, RYTHM_COMMENT);
    if (!r) r = consumeToken(b, RYTHM_ELSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@args' (TEXT DOT TEXT)+
  public static boolean RYTHM_ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_ARGS, "<rythm args>");
    r = consumeToken(b, "@args");
    r = r && RYTHM_ARGS_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TEXT DOT TEXT)+
  private static boolean RYTHM_ARGS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_ARGS_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!RYTHM_ARGS_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ARGS_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TEXT DOT TEXT
  private static boolean RYTHM_ARGS_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT);
    r = r && DOT(b, l + 1);
    r = r && consumeToken(b, TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@extends' STATEMENT
  public static boolean RYTHM_EXTENDS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_EXTENDS, "<rythm extends>");
    r = consumeToken(b, "@extends");
    r = r && consumeToken(b, STATEMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@for' TEXT* STATEMENT
  public static boolean RYTHM_FOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_FOR, "<rythm for>");
    r = consumeToken(b, "@for");
    r = r && RYTHM_FOR_1(b, l + 1);
    r = r && consumeToken(b, STATEMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TEXT*
  private static boolean RYTHM_FOR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@if' TEXT* STATEMENT|'@if' TEXT* LPAREN TEXT RYTHM_METHOD* TEXT RPAREN|'@if' TEXT* RYTHM_METHOD* TEXT*
  public static boolean RYTHM_IF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF, "<rythm if>");
    r = RYTHM_IF_0(b, l + 1);
    if (!r) r = RYTHM_IF_1(b, l + 1);
    if (!r) r = RYTHM_IF_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@if' TEXT* STATEMENT
  private static boolean RYTHM_IF_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@if");
    r = r && RYTHM_IF_0_1(b, l + 1);
    r = r && consumeToken(b, STATEMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEXT*
  private static boolean RYTHM_IF_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '@if' TEXT* LPAREN TEXT RYTHM_METHOD* TEXT RPAREN
  private static boolean RYTHM_IF_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@if");
    r = r && RYTHM_IF_1_1(b, l + 1);
    r = r && LPAREN(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_IF_1_4(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RPAREN(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEXT*
  private static boolean RYTHM_IF_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_METHOD*
  private static boolean RYTHM_IF_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_1_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RYTHM_METHOD)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_1_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '@if' TEXT* RYTHM_METHOD* TEXT*
  private static boolean RYTHM_IF_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@if");
    r = r && RYTHM_IF_2_1(b, l + 1);
    r = r && RYTHM_IF_2_2(b, l + 1);
    r = r && RYTHM_IF_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEXT*
  private static boolean RYTHM_IF_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_METHOD*
  private static boolean RYTHM_IF_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_2_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RYTHM_METHOD)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_2_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@import' TEXT DOT TEXT DOT TEXT
  public static boolean RYTHM_IMPORT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IMPORT, "<rythm import>");
    r = consumeToken(b, "@import");
    r = r && consumeToken(b, TEXT);
    r = r && DOT(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && DOT(b, l + 1);
    r = r && consumeToken(b, TEXT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@i18n' STATEMENT
  public static boolean RYTHM_I_18_N(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I_18_N")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_I_18_N, "<rythm i 18 n>");
    r = consumeToken(b, "@i18n");
    r = r && consumeToken(b, STATEMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_KEY STATEMENT*
  public static boolean RYTHM_KEYS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEYS")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    r = r && RYTHM_KEYS_1(b, l + 1);
    exit_section_(b, m, RYTHM_KEYS, r);
    return r;
  }

  // STATEMENT*
  private static boolean RYTHM_KEYS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEYS_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STATEMENT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEYS_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@section' STATEMENT*
  public static boolean RYTHM_SECTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SECTION, "<rythm section>");
    r = consumeToken(b, "@section");
    r = r && RYTHM_SECTION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STATEMENT*
  private static boolean RYTHM_SECTION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STATEMENT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ';'
  public static boolean SEMICOLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMICOLON")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMICOLON, "<semicolon>");
    r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<-'
  public static boolean SEND_CHANNEL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEND_CHANNEL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEND_CHANNEL, "<send channel>");
    r = consumeToken(b, "<-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<<'
  public static boolean SHIFT_LEFT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SHIFT_LEFT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_LEFT, "<shift left>");
    r = consumeToken(b, "<<");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '>>'
  public static boolean SHIFT_RIGHT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SHIFT_RIGHT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_RIGHT, "<shift right>");
    r = consumeToken(b, ">>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<a onclick=' TEXT LPAREN* tokens* RYTHM* tokens* RYTHM tokens* TEXT
  public static boolean TEST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST, "<test>");
    r = consumeToken(b, "<a onclick=");
    r = r && consumeToken(b, TEXT);
    r = r && TEST_2(b, l + 1);
    r = r && TEST_3(b, l + 1);
    r = r && TEST_4(b, l + 1);
    r = r && TEST_5(b, l + 1);
    r = r && RYTHM(b, l + 1);
    r = r && TEST_7(b, l + 1);
    r = r && consumeToken(b, TEXT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN*
  private static boolean TEST_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LPAREN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // tokens*
  private static boolean TEST_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!tokens(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM*
  private static boolean TEST_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // tokens*
  private static boolean TEST_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!tokens(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // tokens*
  private static boolean TEST_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!tokens(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '>>>'
  public static boolean UNSIGNED_SHIFT_RIGHT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNSIGNED_SHIFT_RIGHT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSIGNED_SHIFT_RIGHT, "<unsigned shift right>");
    r = consumeToken(b, ">>>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ' '
  public static boolean WS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WS, "<ws>");
    r = consumeToken(b, " ");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean classs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classs")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASSS, r);
    return r;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF|tokens|LETTER|NUMBER|
  // SEPARATOR|TAG|WS|RYTHM|FUNCTION|IDENTIFIER|TEXT|STATEMENT|DOT|TEST|JS_SNIP|EXPRESSION|DOLLAR
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROPERTY);
    if (!r) r = COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = tokens(b, l + 1);
    if (!r) r = LETTER(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, SEPARATOR);
    if (!r) r = consumeToken(b, TAG);
    if (!r) r = WS(b, l + 1);
    if (!r) r = RYTHM(b, l + 1);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, TEXT);
    if (!r) r = consumeToken(b, STATEMENT);
    if (!r) r = DOT(b, l + 1);
    if (!r) r = TEST(b, l + 1);
    if (!r) r = JS_SNIP(b, l + 1);
    if (!r) r = EXPRESSION(b, l + 1);
    if (!r) r = consumeToken(b, DOLLAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean packagee(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packagee")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PACKAGEE, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean rythmFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rythmFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RBRACE|RBRACKET|RPAREN|PLUS_PLUS|MINUS_MINUS|LBRACE|LBRACKET|LPAREN|DOUBLE_COLON|
  // COLON|SEMICOLON|COMMA|MULTI_ARGS|CLASS_ATTR_END|CLASS_ATTR_START|SHIFT_LEFT|SHIFT_RIGHT
  // |UNSIGNED_SHIFT_RIGHT|CMP|EQ_EQ|NOT_EQ|LESS_OR_EQ|GREATER_OR_EQ|SEND_CHANNEL|PLUS_EQ|
  // MINUS_EQ|MUL_EQ| DIV_EQ| REMAINDER_EQ|OR_OR|AND_AND|EQ|NOT|BIT_NOT|BIT_OR|BIT_AND|
  // PLUS|MINUS|MUL|DIV|REMAINDER|QUESTION|AT|LETTER|DIGITS|QM|AS|HASHTAG|
  public static boolean tokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tokens")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKENS, "<tokens>");
    r = RBRACE(b, l + 1);
    if (!r) r = RBRACKET(b, l + 1);
    if (!r) r = RPAREN(b, l + 1);
    if (!r) r = PLUS_PLUS(b, l + 1);
    if (!r) r = MINUS_MINUS(b, l + 1);
    if (!r) r = LBRACE(b, l + 1);
    if (!r) r = LBRACKET(b, l + 1);
    if (!r) r = LPAREN(b, l + 1);
    if (!r) r = DOUBLE_COLON(b, l + 1);
    if (!r) r = COLON(b, l + 1);
    if (!r) r = SEMICOLON(b, l + 1);
    if (!r) r = COMMA(b, l + 1);
    if (!r) r = MULTI_ARGS(b, l + 1);
    if (!r) r = CLASS_ATTR_END(b, l + 1);
    if (!r) r = CLASS_ATTR_START(b, l + 1);
    if (!r) r = SHIFT_LEFT(b, l + 1);
    if (!r) r = SHIFT_RIGHT(b, l + 1);
    if (!r) r = UNSIGNED_SHIFT_RIGHT(b, l + 1);
    if (!r) r = CMP(b, l + 1);
    if (!r) r = EQ_EQ(b, l + 1);
    if (!r) r = NOT_EQ(b, l + 1);
    if (!r) r = LESS_OR_EQ(b, l + 1);
    if (!r) r = GREATER_OR_EQ(b, l + 1);
    if (!r) r = SEND_CHANNEL(b, l + 1);
    if (!r) r = PLUS_EQ(b, l + 1);
    if (!r) r = MINUS_EQ(b, l + 1);
    if (!r) r = MUL_EQ(b, l + 1);
    if (!r) r = DIV_EQ(b, l + 1);
    if (!r) r = REMAINDER_EQ(b, l + 1);
    if (!r) r = OR_OR(b, l + 1);
    if (!r) r = AND_AND(b, l + 1);
    if (!r) r = EQ(b, l + 1);
    if (!r) r = NOT(b, l + 1);
    if (!r) r = BIT_NOT(b, l + 1);
    if (!r) r = BIT_OR(b, l + 1);
    if (!r) r = BIT_AND(b, l + 1);
    if (!r) r = PLUS(b, l + 1);
    if (!r) r = MINUS(b, l + 1);
    if (!r) r = MUL(b, l + 1);
    if (!r) r = DIV(b, l + 1);
    if (!r) r = REMAINDER(b, l + 1);
    if (!r) r = QUESTION(b, l + 1);
    if (!r) r = AT(b, l + 1);
    if (!r) r = LETTER(b, l + 1);
    if (!r) r = DIGITS(b, l + 1);
    if (!r) r = QM(b, l + 1);
    if (!r) r = AS(b, l + 1);
    if (!r) r = HASHTAG(b, l + 1);
    if (!r) r = consumeToken(b, TOKENS_48_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
