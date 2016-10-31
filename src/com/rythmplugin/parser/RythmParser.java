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
    if (t == HTML_START_RYTHM_BLOCK) {
      r = HTML_START_RYTHM_BLOCK(b, 0);
    }
    else if (t == HTML_WR) {
      r = HTML_WR(b, 0);
    }
    else if (t == PARAM) {
      r = PARAM(b, 0);
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
    else if (t == RYTHM_I_18_N) {
      r = RYTHM_I18N(b, 0);
    }
    else if (t == RYTHM_IF_STATMENT) {
      r = RYTHM_IF_Statment(b, 0);
    }
    else if (t == RYTHM_IMPORT) {
      r = RYTHM_IMPORT(b, 0);
    }
    else if (t == RYTHM_KEY_BLOCK) {
      r = RYTHM_KeyBlock(b, 0);
    }
    else if (t == RYTHM_KEY_BLOCK_EXP) {
      r = RYTHM_KeyBlock_EXP(b, 0);
    }
    else if (t == RYTHM_SECTION) {
      r = RYTHM_SECTION(b, 0);
    }
    else if (t == RYTHM_SECTION_WOR) {
      r = RYTHM_SECTION_WOR(b, 0);
    }
    else if (t == RYTHM_SECTION_WR) {
      r = RYTHM_SECTION_WR(b, 0);
    }
    else if (t == STATEMENT) {
      r = STATEMENT(b, 0);
    }
    else if (t == INITIAL_DECLARATION) {
      r = initialDeclaration(b, 0);
    }
    else if (t == JAVA_CODE) {
      r = java_code(b, 0);
    }
    else if (t == METHOD_CALL) {
      r = methodCall(b, 0);
    }
    else if (t == METHOD_CALL_EXPR) {
      r = methodCallExpr(b, 0);
    }
    else if (t == QUALIFIED_NAME) {
      r = qualifiedName(b, 0);
    }
    else if (t == RYTHM_KEY_IDENT) {
      r = rythm_Key_Ident(b, 0);
    }
    else if (t == RYTHM_METHOD) {
      r = rythm_method(b, 0);
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
  // TEXT rythm_Key_Ident '(' '"' qualifiedName '"' ')' '{' TEXT rythm_method TEXT RYTHM_PREFIX TEXT RYTHM_I18N TEXT rythm_method TEXT RYTHM_I18N TEXT RYTHM_IF_Statment
  public static boolean HTML_START_RYTHM_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT);
    r = r && rythm_Key_Ident(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && consumeToken(b, GF);
    r = r && qualifiedName(b, l + 1);
    r = r && consumeToken(b, GF);
    r = r && consumeToken(b, RPAREN);
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, TEXT);
    r = r && rythm_method(b, l + 1);
    r = r && consumeTokens(b, 0, TEXT, RYTHM_PREFIX, TEXT);
    r = r && RYTHM_I18N(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && rythm_method(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_I18N(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_IF_Statment(b, l + 1);
    exit_section_(b, m, HTML_START_RYTHM_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // TEXT RYTHM_PREFIX TEXT rythm_method TEXT RYTHM_I18N TEXT* '}'*
  public static boolean HTML_WR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_WR")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEXT, RYTHM_PREFIX, TEXT);
    r = r && rythm_method(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_I18N(b, l + 1);
    r = r && HTML_WR_6(b, l + 1);
    r = r && HTML_WR_7(b, l + 1);
    exit_section_(b, m, HTML_WR, r);
    return r;
  }

  // TEXT*
  private static boolean HTML_WR_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_WR_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_WR_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean HTML_WR_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_WR_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "HTML_WR_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '('IDENTIFIER* ')'
  public static boolean PARAM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PARAM")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && PARAM_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PARAM, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean PARAM_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PARAM_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "PARAM_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RYTHM_PREFIX|RYTHM_IF|RYTHM_I18N/*|RYTHM_EXTENDS*/|RYTHM_FOR|RYTHM_INVOKE/*|RYTHM_SECTION*/|RYTHM_RENDER
  public static boolean RYTHM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM, "<rythm>");
    r = consumeToken(b, RYTHM_PREFIX);
    if (!r) r = consumeToken(b, RYTHM_IF);
    if (!r) r = RYTHM_I18N(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM_FOR);
    if (!r) r = consumeToken(b, RYTHM_INVOKE);
    if (!r) r = consumeToken(b, RYTHM_RENDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (('@args' qualifiedName)(','*qualifiedName)*) RYTHM_IMPORT* RYTHM_EXTENDS*
  public static boolean RYTHM_ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_ARGS, "<rythm args>");
    r = RYTHM_ARGS_0(b, l + 1);
    r = r && RYTHM_ARGS_1(b, l + 1);
    r = r && RYTHM_ARGS_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('@args' qualifiedName)(','*qualifiedName)*
  private static boolean RYTHM_ARGS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_ARGS_0_0(b, l + 1);
    r = r && RYTHM_ARGS_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '@args' qualifiedName
  private static boolean RYTHM_ARGS_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@args");
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','*qualifiedName)*
  private static boolean RYTHM_ARGS_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_ARGS_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ARGS_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*qualifiedName
  private static boolean RYTHM_ARGS_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_ARGS_0_1_0_0(b, l + 1);
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','*
  private static boolean RYTHM_ARGS_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_0_1_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ARGS_0_1_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IMPORT*
  private static boolean RYTHM_ARGS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IMPORT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ARGS_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_EXTENDS*
  private static boolean RYTHM_ARGS_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_EXTENDS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ARGS_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@extends' '('qualifiedName',' 'title' ':' '(' IDENTIFIER '.' methodCallExpr '+' '"' ':' '"' '+' IDENTIFIER '.' methodCallExpr LPAREN*
  public static boolean RYTHM_EXTENDS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_EXTENDS, "<rythm extends>");
    r = consumeToken(b, "@extends");
    r = r && consumeToken(b, LPAREN);
    r = r && qualifiedName(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && consumeToken(b, "title");
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, LPAREN);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, DOT);
    r = r && methodCallExpr(b, l + 1);
    r = r && consumeToken(b, PLUS);
    r = r && consumeToken(b, GF);
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, GF);
    r = r && consumeToken(b, PLUS);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, DOT);
    r = r && methodCallExpr(b, l + 1);
    r = r && RYTHM_EXTENDS_18(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN*
  private static boolean RYTHM_EXTENDS_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@i18n''(''"' (IDENTIFIER'.'*)* '"' ')'
  public static boolean RYTHM_I18N(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_I_18_N, "<rythm i 18 n>");
    r = consumeToken(b, "@i18n");
    r = r && consumeToken(b, LPAREN);
    r = r && consumeToken(b, GF);
    r = r && RYTHM_I18N_3(b, l + 1);
    r = r && consumeToken(b, GF);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IDENTIFIER'.'*)*
  private static boolean RYTHM_I18N_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_I18N_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER'.'*
  private static boolean RYTHM_I18N_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && RYTHM_I18N_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.'*
  private static boolean RYTHM_I18N_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N_3_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_I18N_3_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@if' '(' STATEMENT '&&'* IDENTIFIER* '.'* methodCallExpr* '>'* IDENTIFIER* ')'* '{' TEXT rythm_method* TEXT* rythm_method* rythm_Key_Ident* RYTHM_PREFIX* TEXT* rythm_method* TEXT* RYTHM_I18N TEXT rythm_method* TEXT* RYTHM_I18N* TEXT* '}'
  public static boolean RYTHM_IF_Statment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF_STATMENT, "<rythm if statment>");
    r = consumeToken(b, "@if");
    r = r && consumeToken(b, LPAREN);
    r = r && STATEMENT(b, l + 1);
    r = r && RYTHM_IF_Statment_3(b, l + 1);
    r = r && RYTHM_IF_Statment_4(b, l + 1);
    r = r && RYTHM_IF_Statment_5(b, l + 1);
    r = r && RYTHM_IF_Statment_6(b, l + 1);
    r = r && RYTHM_IF_Statment_7(b, l + 1);
    r = r && RYTHM_IF_Statment_8(b, l + 1);
    r = r && RYTHM_IF_Statment_9(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_IF_Statment_12(b, l + 1);
    r = r && RYTHM_IF_Statment_13(b, l + 1);
    r = r && RYTHM_IF_Statment_14(b, l + 1);
    r = r && RYTHM_IF_Statment_15(b, l + 1);
    r = r && RYTHM_IF_Statment_16(b, l + 1);
    r = r && RYTHM_IF_Statment_17(b, l + 1);
    r = r && RYTHM_IF_Statment_18(b, l + 1);
    r = r && RYTHM_IF_Statment_19(b, l + 1);
    r = r && RYTHM_I18N(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_IF_Statment_22(b, l + 1);
    r = r && RYTHM_IF_Statment_23(b, l + 1);
    r = r && RYTHM_IF_Statment_24(b, l + 1);
    r = r && RYTHM_IF_Statment_25(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '&&'*
  private static boolean RYTHM_IF_Statment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "&&")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_IF_Statment_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCallExpr*
  private static boolean RYTHM_IF_Statment_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCallExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '>'*
  private static boolean RYTHM_IF_Statment_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, ">")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_Statment_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_Key_Ident*
  private static boolean RYTHM_IF_Statment_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_Key_Ident(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_PREFIX*
  private static boolean RYTHM_IF_Statment_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RYTHM_PREFIX)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_16", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_17")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_17", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_19")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_19", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_22")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_22", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_23")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_23", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean RYTHM_IF_Statment_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_24")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_24", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_25")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_25", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (('@import' qualifiedName)+) RYTHM_EXTENDS*
  public static boolean RYTHM_IMPORT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IMPORT, "<rythm import>");
    r = RYTHM_IMPORT_0(b, l + 1);
    r = r && RYTHM_IMPORT_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('@import' qualifiedName)+
  private static boolean RYTHM_IMPORT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_IMPORT_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!RYTHM_IMPORT_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IMPORT_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '@import' qualifiedName
  private static boolean RYTHM_IMPORT_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@import");
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RYTHM_EXTENDS*
  private static boolean RYTHM_IMPORT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_EXTENDS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IMPORT_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RYTHM_KEY '(' ')' '{' TEXT rythm_method ':' rythm_method TEXT* (RYTHM_IF_Statment HTML_WR*)*
  public static boolean RYTHM_KeyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KeyBlock")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    r = r && consumeToken(b, LPAREN);
    r = r && consumeToken(b, RPAREN);
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, TEXT);
    r = r && rythm_method(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && rythm_method(b, l + 1);
    r = r && RYTHM_KeyBlock_8(b, l + 1);
    r = r && RYTHM_KeyBlock_9(b, l + 1);
    exit_section_(b, m, RYTHM_KEY_BLOCK, r);
    return r;
  }

  // TEXT*
  private static boolean RYTHM_KeyBlock_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KeyBlock_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KeyBlock_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (RYTHM_IF_Statment HTML_WR*)*
  private static boolean RYTHM_KeyBlock_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KeyBlock_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KeyBlock_9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KeyBlock_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment HTML_WR*
  private static boolean RYTHM_KeyBlock_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KeyBlock_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_IF_Statment(b, l + 1);
    r = r && RYTHM_KeyBlock_9_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HTML_WR*
  private static boolean RYTHM_KeyBlock_9_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KeyBlock_9_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!HTML_WR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KeyBlock_9_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RYTHM_KEY '(' '"' qualifiedName '"' ')'
  public static boolean RYTHM_KeyBlock_EXP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KeyBlock_EXP")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    r = r && consumeToken(b, LPAREN);
    r = r && consumeToken(b, GF);
    r = r && qualifiedName(b, l + 1);
    r = r && consumeToken(b, GF);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, RYTHM_KEY_BLOCK_EXP, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_SECTION_WOR  RYTHM_SECTION_WR
  public static boolean RYTHM_SECTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SECTION, "<rythm section>");
    r = RYTHM_SECTION_WOR(b, l + 1);
    r = r && RYTHM_SECTION_WR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@section' PARAM '{' TEXT '}'
  public static boolean RYTHM_SECTION_WOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_WOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SECTION_WOR, "<rythm section wor>");
    r = consumeToken(b, "@section");
    r = r && PARAM(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, TEXT);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@section' PARAM '{' TEXT RYTHM_I18N* TEXT rythm_Key_Ident '.' methodCallExpr TEXT*  rythm_Key_Ident '.' methodCallExpr ':' rythm_Key_Ident '.' methodCallExpr TEXT '}'
  public static boolean RYTHM_SECTION_WR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_WR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SECTION_WR, "<rythm section wr>");
    r = consumeToken(b, "@section");
    r = r && PARAM(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_SECTION_WR_4(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && rythm_Key_Ident(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && methodCallExpr(b, l + 1);
    r = r && RYTHM_SECTION_WR_9(b, l + 1);
    r = r && rythm_Key_Ident(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && methodCallExpr(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && rythm_Key_Ident(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && methodCallExpr(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RYTHM_I18N*
  private static boolean RYTHM_SECTION_WR_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_WR_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_WR_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_SECTION_WR_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_WR_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_WR_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EXCL* IDENTIFIER ('.' methodCallExpr+)*
  public static boolean STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT")) return false;
    if (!nextTokenIs(b, "<statement>", EXCL, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = STATEMENT_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && STATEMENT_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EXCL*
  private static boolean STATEMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EXCL)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ('.' methodCallExpr+)*
  private static boolean STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!STATEMENT_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' methodCallExpr+
  private static boolean STATEMENT_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && STATEMENT_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodCallExpr+
  private static boolean STATEMENT_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodCallExpr(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!methodCallExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_2_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_ARGS| RYTHM_IMPORT |RYTHM_EXTENDS
  public static boolean initialDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIAL_DECLARATION, "<initial declaration>");
    r = RYTHM_ARGS(b, l + 1);
    if (!r) r = RYTHM_IMPORT(b, l + 1);
    if (!r) r = RYTHM_EXTENDS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{:' JAVA* ':}'
  public static boolean java_code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "java_code")) return false;
    if (!nextTokenIs(b, LEFTBRACES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTBRACES);
    r = r && java_code_1(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACES);
    exit_section_(b, m, JAVA_CODE, r);
    return r;
  }

  // JAVA*
  private static boolean java_code_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "java_code_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, JAVA)) break;
      if (!empty_element_parsed_guard_(b, "java_code_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '.'IDENTIFIER LPAREN RPAREN
  public static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && consumeTokens(b, 0, IDENTIFIER, LPAREN, RPAREN);
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER LPAREN+ RPAREN+
  public static boolean methodCallExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, METHOD_CALL_EXPR, null);
    r = consumeToken(b, IDENTIFIER);
    r = r && methodCallExpr_1(b, l + 1);
    p = r; // pin = 2
    r = r && methodCallExpr_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LPAREN+
  private static boolean methodCallExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // RPAREN+
  private static boolean methodCallExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER+ '.'*)+|IDENTIFIER+
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName_0(b, l + 1);
    if (!r) r = qualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // (IDENTIFIER+ '.'*)+
  private static boolean qualifiedName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!qualifiedName_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER+ '.'*
  private static boolean qualifiedName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName_0_0_0(b, l + 1);
    r = r && qualifiedName_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean qualifiedName_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_0_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '.'*
  private static boolean qualifiedName_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_0_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_0_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER+
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BLOCK_COMMENT? (initialDeclaration) RYTHM_SECTION RYTHM_KeyBlock HTML_START_RYTHM_BLOCK*/*RYTHM_IF_Statment**/ |  (TEXT) | (RYTHM)| (GENERICS?)
  static boolean rythmFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rythmFile_0(b, l + 1);
    if (!r) r = consumeToken(b, TEXT);
    if (!r) r = rythmFile_2(b, l + 1);
    if (!r) r = rythmFile_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BLOCK_COMMENT? (initialDeclaration) RYTHM_SECTION RYTHM_KeyBlock HTML_START_RYTHM_BLOCK*
  private static boolean rythmFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rythmFile_0_0(b, l + 1);
    r = r && rythmFile_0_1(b, l + 1);
    r = r && RYTHM_SECTION(b, l + 1);
    r = r && RYTHM_KeyBlock(b, l + 1);
    r = r && rythmFile_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BLOCK_COMMENT?
  private static boolean rythmFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_0_0")) return false;
    consumeToken(b, BLOCK_COMMENT);
    return true;
  }

  // (initialDeclaration)
  private static boolean rythmFile_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initialDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HTML_START_RYTHM_BLOCK*
  private static boolean rythmFile_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!HTML_START_RYTHM_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rythmFile_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (RYTHM)
  private static boolean rythmFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // GENERICS?
  private static boolean rythmFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_3")) return false;
    consumeToken(b, GENERICS);
    return true;
  }

  /* ********************************************************** */
  // RYTHM_KEY
  public static boolean rythm_Key_Ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_Key_Ident")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    exit_section_(b, m, RYTHM_KEY_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_KEY '.' methodCallExpr
  public static boolean rythm_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    r = r && consumeToken(b, DOT);
    r = r && methodCallExpr(b, l + 1);
    exit_section_(b, m, RYTHM_METHOD, r);
    return r;
  }

}
