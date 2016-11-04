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
    else if (t == METHOD) {
      r = METHOD(b, 0);
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
    else if (t == RYTHM_BLOCK) {
      r = RYTHM_BLOCK(b, 0);
    }
    else if (t == RYTHM_ELSE) {
      r = RYTHM_ELSE(b, 0);
    }
    else if (t == RYTHM_EXTENDS) {
      r = RYTHM_EXTENDS(b, 0);
    }
    else if (t == RYTHM_FOR_STATEMENT) {
      r = RYTHM_FOR_Statement(b, 0);
    }
    else if (t == RYTHM_I_18_N) {
      r = RYTHM_I18N(b, 0);
    }
    else if (t == RYTHM_IF_KEY_FOR_STATEMENT) {
      r = RYTHM_IF_KEY_FOR_Statement(b, 0);
    }
    else if (t == RYTHM_IF_STATEMENT_OP) {
      r = RYTHM_IF_Statement_OP(b, 0);
    }
    else if (t == RYTHM_IF_STATEMENT_OP_TEST) {
      r = RYTHM_IF_Statement_OP_TEST(b, 0);
    }
    else if (t == RYTHM_IF_STATMENT) {
      r = RYTHM_IF_Statment(b, 0);
    }
    else if (t == RYTHM_IF_STATMENT_SHORT) {
      r = RYTHM_IF_Statment_Short(b, 0);
    }
    else if (t == RYTHM_IMPORT) {
      r = RYTHM_IMPORT(b, 0);
    }
    else if (t == RYTHM_KEY_BLOCKS) {
      r = RYTHM_KEY_BLOCKS(b, 0);
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
    else if (t == RYTHM_PARAM) {
      r = rythm_param(b, 0);
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
  // TEXT rythm_Key_Ident*  methodCall* methodCallExpr* TEXT* RYTHM_IF_Statment* RYTHM_I18N* RYTHM_ELSE* '}'*  TEXT* RYTHM_I18N* TEXT* rythm_method* TEXT* RYTHM_I18N* TEXT* rythm_method* TEXT* RYTHM_IF_Statment* TEXT* RYTHM_KEY_BLOCKS*  TEXT* '(' /*wurde hinzugefügt*/ TEXT*   '"' qualifiedName '"' ')' '{' TEXT rythm_method* TEXT RYTHM_PREFIX TEXT RYTHM_I18N TEXT rythm_method* TEXT RYTHM_I18N TEXT RYTHM_IF_Statment  (TEXT* RYTHM_PREFIX TEXT rythm_method* TEXT RYTHM_I18N TEXT)* RYTHM_IF_Statment*  /***/ rythm_method* RYTHM_IF_Statment*/**HIER WIRD EIN STERN HINZUGEFÜGT - 17:29 Uhr AN DIESER SCHEIßE LAG DAS PROBLEM!!!*/'}'* RYTHM_ELSE*
  public static boolean HTML_START_RYTHM_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HTML_START_RYTHM_BLOCK, null);
    r = consumeToken(b, TEXT);
    r = r && HTML_START_RYTHM_BLOCK_1(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_2(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_3(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_4(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_5(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_6(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_7(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_8(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_9(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_10(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_11(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_12(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_13(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_14(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_15(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_16(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_17(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_18(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_19(b, l + 1);
    r = r && HTML_START_RYTHM_BLOCK_20(b, l + 1);
    p = r; // pin = 21
    r = r && report_error_(b, HTML_START_RYTHM_BLOCK_21(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LPAREN)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_23(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, GF)) && r;
    r = p && report_error_(b, qualifiedName(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, GF)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && report_error_(b, consumeToken(b, LBRACE)) && r;
    r = p && report_error_(b, consumeToken(b, TEXT)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_30(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, TEXT, RYTHM_PREFIX, TEXT)) && r;
    r = p && report_error_(b, RYTHM_I18N(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, TEXT)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_36(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, TEXT)) && r;
    r = p && report_error_(b, RYTHM_I18N(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, TEXT)) && r;
    r = p && report_error_(b, RYTHM_IF_Statment(b, l + 1)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_41(b, l + 1)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_42(b, l + 1)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_43(b, l + 1)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_44(b, l + 1)) && r;
    r = p && report_error_(b, HTML_START_RYTHM_BLOCK_45(b, l + 1)) && r;
    r = p && HTML_START_RYTHM_BLOCK_46(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // rythm_Key_Ident*
  private static boolean HTML_START_RYTHM_BLOCK_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_Key_Ident(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean HTML_START_RYTHM_BLOCK_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCallExpr*
  private static boolean HTML_START_RYTHM_BLOCK_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCallExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean HTML_START_RYTHM_BLOCK_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean HTML_START_RYTHM_BLOCK_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_ELSE*
  private static boolean HTML_START_RYTHM_BLOCK_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_ELSE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean HTML_START_RYTHM_BLOCK_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean HTML_START_RYTHM_BLOCK_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean HTML_START_RYTHM_BLOCK_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean HTML_START_RYTHM_BLOCK_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean HTML_START_RYTHM_BLOCK_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_16", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_17")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_17", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean HTML_START_RYTHM_BLOCK_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_19")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_19", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_KEY_BLOCKS*
  private static boolean HTML_START_RYTHM_BLOCK_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_20")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KEY_BLOCKS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_20", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_21")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_21", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_23")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_23", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean HTML_START_RYTHM_BLOCK_30(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_30")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_30", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean HTML_START_RYTHM_BLOCK_36(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_36")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_36", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (TEXT* RYTHM_PREFIX TEXT rythm_method* TEXT RYTHM_I18N TEXT)*
  private static boolean HTML_START_RYTHM_BLOCK_41(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_41")) return false;
    int c = current_position_(b);
    while (true) {
      if (!HTML_START_RYTHM_BLOCK_41_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_41", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT* RYTHM_PREFIX TEXT rythm_method* TEXT RYTHM_I18N TEXT
  private static boolean HTML_START_RYTHM_BLOCK_41_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_41_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = HTML_START_RYTHM_BLOCK_41_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, RYTHM_PREFIX, TEXT);
    r = r && HTML_START_RYTHM_BLOCK_41_0_3(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_I18N(b, l + 1);
    r = r && consumeToken(b, TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEXT*
  private static boolean HTML_START_RYTHM_BLOCK_41_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_41_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_41_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean HTML_START_RYTHM_BLOCK_41_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_41_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_41_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean HTML_START_RYTHM_BLOCK_42(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_42")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_42", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean HTML_START_RYTHM_BLOCK_43(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_43")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_43", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean HTML_START_RYTHM_BLOCK_44(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_44")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_44", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean HTML_START_RYTHM_BLOCK_45(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_45")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_45", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_ELSE*
  private static boolean HTML_START_RYTHM_BLOCK_46(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_START_RYTHM_BLOCK_46")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_ELSE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_START_RYTHM_BLOCK_46", c)) break;
      c = current_position_(b);
    }
    return true;
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
  // '.' IDENTIFIER '('* /*'"'**/ ')'*
  public static boolean METHOD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METHOD")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && METHOD_2(b, l + 1);
    r = r && METHOD_3(b, l + 1);
    exit_section_(b, m, METHOD, r);
    return r;
  }

  // '('*
  private static boolean METHOD_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METHOD_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "METHOD_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean METHOD_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METHOD_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "METHOD_3", c)) break;
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
  // (IDENTIFIER ':' '"'* IDENTIFIER METHOD* '"'* ')'*)* TEXT* RYTHM_IF_Statement_OP* '{'* /***10:59 Uhr  { hingfgt****/RYTHM_FOR_Statement* RYTHM_KEY_BLOCKS* RYTHM_FOR_Statement* /****04.11.16 - 11:12 Urh****/ ',' TEXT*
  public static boolean RYTHM_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_BLOCK, "<rythm block>");
    r = RYTHM_BLOCK_0(b, l + 1);
    r = r && RYTHM_BLOCK_1(b, l + 1);
    r = r && RYTHM_BLOCK_2(b, l + 1);
    r = r && RYTHM_BLOCK_3(b, l + 1);
    r = r && RYTHM_BLOCK_4(b, l + 1);
    r = r && RYTHM_BLOCK_5(b, l + 1);
    r = r && RYTHM_BLOCK_6(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && RYTHM_BLOCK_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IDENTIFIER ':' '"'* IDENTIFIER METHOD* '"'* ')'*)*
  private static boolean RYTHM_BLOCK_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_BLOCK_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER ':' '"'* IDENTIFIER METHOD* '"'* ')'*
  private static boolean RYTHM_BLOCK_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, COLON);
    r = r && RYTHM_BLOCK_0_0_2(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && RYTHM_BLOCK_0_0_4(b, l + 1);
    r = r && RYTHM_BLOCK_0_0_5(b, l + 1);
    r = r && RYTHM_BLOCK_0_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '"'*
  private static boolean RYTHM_BLOCK_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_0_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_0_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // METHOD*
  private static boolean RYTHM_BLOCK_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_0_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!METHOD(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_0_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_BLOCK_0_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_0_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_0_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_BLOCK_0_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_0_0_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_0_0_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_BLOCK_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statement_OP*
  private static boolean RYTHM_BLOCK_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statement_OP(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '{'*
  private static boolean RYTHM_BLOCK_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_FOR_Statement*
  private static boolean RYTHM_BLOCK_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_FOR_Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_KEY_BLOCKS*
  private static boolean RYTHM_BLOCK_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KEY_BLOCKS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_FOR_Statement*
  private static boolean RYTHM_BLOCK_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_FOR_Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_BLOCK_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'else' '{' RYTHM_KEY_BLOCKS* TEXT* RYTHM_I18N* (TEXT rythm_method*)*
  public static boolean RYTHM_ELSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ELSE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_ELSE, "<rythm else>");
    r = consumeToken(b, "else");
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_ELSE_2(b, l + 1);
    r = r && RYTHM_ELSE_3(b, l + 1);
    r = r && RYTHM_ELSE_4(b, l + 1);
    r = r && RYTHM_ELSE_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RYTHM_KEY_BLOCKS*
  private static boolean RYTHM_ELSE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ELSE_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KEY_BLOCKS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ELSE_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_ELSE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ELSE_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ELSE_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean RYTHM_ELSE_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ELSE_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ELSE_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (TEXT rythm_method*)*
  private static boolean RYTHM_ELSE_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ELSE_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_ELSE_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ELSE_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT rythm_method*
  private static boolean RYTHM_ELSE_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ELSE_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT);
    r = r && RYTHM_ELSE_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // rythm_method*
  private static boolean RYTHM_ELSE_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ELSE_5_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ELSE_5_0_1", c)) break;
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
  // '@for' '(' IDENTIFIER+ ':'* IDENTIFIER* '.'* IDENTIFIER* /**qualifiedName**/ '.'* qualifiedName* ':'* IDENTIFIER* '('* ')'* '{' TEXT*  rythm_method TEXT RYTHM_IF_Statment_Short TEXT rythm_method TEXT '}'*
  public static boolean RYTHM_FOR_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_FOR_STATEMENT, "<rythm for statement>");
    r = consumeToken(b, "@for");
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_FOR_Statement_2(b, l + 1);
    r = r && RYTHM_FOR_Statement_3(b, l + 1);
    r = r && RYTHM_FOR_Statement_4(b, l + 1);
    r = r && RYTHM_FOR_Statement_5(b, l + 1);
    r = r && RYTHM_FOR_Statement_6(b, l + 1);
    r = r && RYTHM_FOR_Statement_7(b, l + 1);
    r = r && RYTHM_FOR_Statement_8(b, l + 1);
    r = r && RYTHM_FOR_Statement_9(b, l + 1);
    r = r && RYTHM_FOR_Statement_10(b, l + 1);
    r = r && RYTHM_FOR_Statement_11(b, l + 1);
    r = r && RYTHM_FOR_Statement_12(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_FOR_Statement_14(b, l + 1);
    r = r && rythm_method(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_IF_Statment_Short(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && rythm_method(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_FOR_Statement_21(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER+
  private static boolean RYTHM_FOR_Statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ':'*
  private static boolean RYTHM_FOR_Statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_FOR_Statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_FOR_Statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_FOR_Statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_FOR_Statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // qualifiedName*
  private static boolean RYTHM_FOR_Statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qualifiedName(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean RYTHM_FOR_Statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_FOR_Statement_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean RYTHM_FOR_Statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_FOR_Statement_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_FOR_Statement_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean RYTHM_FOR_Statement_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_Statement_21")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_Statement_21", c)) break;
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
  // '@if' STATEMENT '{' RYTHM_KEY_BLOCKS* RYTHM_FOR_Statement*
  public static boolean RYTHM_IF_KEY_FOR_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_KEY_FOR_Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF_KEY_FOR_STATEMENT, "<rythm if key for statement>");
    r = consumeToken(b, "@if");
    r = r && STATEMENT(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_IF_KEY_FOR_Statement_3(b, l + 1);
    r = r && RYTHM_IF_KEY_FOR_Statement_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RYTHM_KEY_BLOCKS*
  private static boolean RYTHM_IF_KEY_FOR_Statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_KEY_FOR_Statement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KEY_BLOCKS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_KEY_FOR_Statement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_FOR_Statement*
  private static boolean RYTHM_IF_KEY_FOR_Statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_KEY_FOR_Statement_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_FOR_Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_KEY_FOR_Statement_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@if' '(' '!'* /*!*/ IDENTIFIER '.' IDENTIFIER '(' /***13:31 UHR***/ IDENTIFIER* '.'* IDENTIFIER* '('* /**Stern wurde bei ) hinzugefügt 13:34**/')'* RYTHM_IF_Statement_OP_TEST* '{' TEXT* RYTHM_KEY_BLOCKS* '{'* RYTHM_FOR_Statement* '}'* TEXT*
  public static boolean RYTHM_IF_Statement_OP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF_STATEMENT_OP, "<rythm if statement op>");
    r = consumeToken(b, "@if");
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_IF_Statement_OP_2(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_IF_Statement_OP_7(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_8(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_9(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_10(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_11(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_12(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_IF_Statement_OP_14(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_15(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_16(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_17(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_18(b, l + 1);
    r = r && RYTHM_IF_Statement_OP_19(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '!'*
  private static boolean RYTHM_IF_Statement_OP_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, AUSRF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statement_OP_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_IF_Statement_OP_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statement_OP_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean RYTHM_IF_Statement_OP_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_Statement_OP_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statement_OP_TEST*
  private static boolean RYTHM_IF_Statement_OP_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statement_OP_TEST(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statement_OP_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_KEY_BLOCKS*
  private static boolean RYTHM_IF_Statement_OP_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KEY_BLOCKS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '{'*
  private static boolean RYTHM_IF_Statement_OP_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_16", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_FOR_Statement*
  private static boolean RYTHM_IF_Statement_OP_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_17")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_FOR_Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_17", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean RYTHM_IF_Statement_OP_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statement_OP_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_19")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statement_OP_19", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '<' IDENTIFIER ')'
  public static boolean RYTHM_IF_Statement_OP_TEST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statement_OP_TEST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF_STATEMENT_OP_TEST, "<rythm if statement op test>");
    r = consumeToken(b, "<");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@if' '(' STATEMENT '&&'* '=='* GREATER* '"'* IDENTIFIER* '"'* '.'* methodCallExpr* '>'* IDENTIFIER* ')'* '||'* IDENTIFIER* methodCall* '!='*  IDENTIFIER* ')'* '{' TEXT* /**stern hinzgfgt 09:13*/ '}'* rythm_method* TEXT* rythm_method* rythm_Key_Ident* RYTHM_PREFIX* TEXT* rythm_method* METHOD* TEXT* rythm_method* methodCall* RYTHM_I18N* /**10:32 Uhr } **/'}'* TEXT RYTHM_FOR_Statement* rythm_method* TEXT* RYTHM_I18N* TEXT* /*IF STATEMENT hinzugefügt*/ RYTHM_IF_Statment* TEXT* RYTHM_I18N* TEXT* RYTHM_IF_Statment* TEXT*  '}' RYTHM_ELSE*
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
    r = r && RYTHM_IF_Statment_10(b, l + 1);
    r = r && RYTHM_IF_Statment_11(b, l + 1);
    r = r && RYTHM_IF_Statment_12(b, l + 1);
    r = r && RYTHM_IF_Statment_13(b, l + 1);
    r = r && RYTHM_IF_Statment_14(b, l + 1);
    r = r && RYTHM_IF_Statment_15(b, l + 1);
    r = r && RYTHM_IF_Statment_16(b, l + 1);
    r = r && RYTHM_IF_Statment_17(b, l + 1);
    r = r && RYTHM_IF_Statment_18(b, l + 1);
    r = r && RYTHM_IF_Statment_19(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_IF_Statment_21(b, l + 1);
    r = r && RYTHM_IF_Statment_22(b, l + 1);
    r = r && RYTHM_IF_Statment_23(b, l + 1);
    r = r && RYTHM_IF_Statment_24(b, l + 1);
    r = r && RYTHM_IF_Statment_25(b, l + 1);
    r = r && RYTHM_IF_Statment_26(b, l + 1);
    r = r && RYTHM_IF_Statment_27(b, l + 1);
    r = r && RYTHM_IF_Statment_28(b, l + 1);
    r = r && RYTHM_IF_Statment_29(b, l + 1);
    r = r && RYTHM_IF_Statment_30(b, l + 1);
    r = r && RYTHM_IF_Statment_31(b, l + 1);
    r = r && RYTHM_IF_Statment_32(b, l + 1);
    r = r && RYTHM_IF_Statment_33(b, l + 1);
    r = r && RYTHM_IF_Statment_34(b, l + 1);
    r = r && RYTHM_IF_Statment_35(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_IF_Statment_37(b, l + 1);
    r = r && RYTHM_IF_Statment_38(b, l + 1);
    r = r && RYTHM_IF_Statment_39(b, l + 1);
    r = r && RYTHM_IF_Statment_40(b, l + 1);
    r = r && RYTHM_IF_Statment_41(b, l + 1);
    r = r && RYTHM_IF_Statment_42(b, l + 1);
    r = r && RYTHM_IF_Statment_43(b, l + 1);
    r = r && RYTHM_IF_Statment_44(b, l + 1);
    r = r && RYTHM_IF_Statment_45(b, l + 1);
    r = r && RYTHM_IF_Statment_46(b, l + 1);
    r = r && RYTHM_IF_Statment_47(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && RYTHM_IF_Statment_49(b, l + 1);
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

  // '=='*
  private static boolean RYTHM_IF_Statment_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "==")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // GREATER*
  private static boolean RYTHM_IF_Statment_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GREATER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_IF_Statment_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_IF_Statment_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_IF_Statment_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCallExpr*
  private static boolean RYTHM_IF_Statment_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCallExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '>'*
  private static boolean RYTHM_IF_Statment_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, ">")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_Statment_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '||'*
  private static boolean RYTHM_IF_Statment_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "||")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean RYTHM_IF_Statment_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_16", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '!='*
  private static boolean RYTHM_IF_Statment_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_17")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "!=")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_17", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_Statment_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_19")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_19", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_21")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_21", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean RYTHM_IF_Statment_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_22")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_22", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_23")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_23", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_24")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_24", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_25")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_25", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_Key_Ident*
  private static boolean RYTHM_IF_Statment_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_26")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_Key_Ident(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_26", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_PREFIX*
  private static boolean RYTHM_IF_Statment_27(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_27")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RYTHM_PREFIX)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_27", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_28(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_28")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_28", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_29(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_29")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_29", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // METHOD*
  private static boolean RYTHM_IF_Statment_30(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_30")) return false;
    int c = current_position_(b);
    while (true) {
      if (!METHOD(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_30", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_31(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_31")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_31", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_32(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_32")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_32", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean RYTHM_IF_Statment_33(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_33")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_33", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean RYTHM_IF_Statment_34(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_34")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_34", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean RYTHM_IF_Statment_35(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_35")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_35", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_FOR_Statement*
  private static boolean RYTHM_IF_Statment_37(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_37")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_FOR_Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_37", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_method*
  private static boolean RYTHM_IF_Statment_38(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_38")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_38", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_39(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_39")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_39", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean RYTHM_IF_Statment_40(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_40")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_40", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_41(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_41")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_41", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean RYTHM_IF_Statment_42(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_42")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_42", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_43(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_43")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_43", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_I18N*
  private static boolean RYTHM_IF_Statment_44(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_44")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_I18N(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_44", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_45(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_45")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_45", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean RYTHM_IF_Statment_46(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_46")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_46", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_IF_Statment_47(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_47")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_47", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_ELSE*
  private static boolean RYTHM_IF_Statment_49(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_49")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_ELSE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_49", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@if' '('* IDENTIFIER '=='* IDENTIFIER* '.'* IDENTIFIER* '('* /**************/IDENTIFIER* '.'* IDENTIFIER* '('*/***********/')'*/*PUNKT und methodCallEXPR 14:15**/ '.'* IDENTIFIER* methodCallExpr* '{'* TEXT '}'
  public static boolean RYTHM_IF_Statment_Short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF_STATMENT_SHORT, "<rythm if statment short>");
    r = consumeToken(b, "@if");
    r = r && RYTHM_IF_Statment_Short_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && RYTHM_IF_Statment_Short_3(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_4(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_5(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_6(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_7(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_8(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_9(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_10(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_11(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_12(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_13(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_14(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_15(b, l + 1);
    r = r && RYTHM_IF_Statment_Short_16(b, l + 1);
    r = r && consumeToken(b, TEXT);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '('*
  private static boolean RYTHM_IF_Statment_Short_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '=='*
  private static boolean RYTHM_IF_Statment_Short_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "==")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_Short_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_IF_Statment_Short_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_Short_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean RYTHM_IF_Statment_Short_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_Short_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_IF_Statment_Short_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_Short_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean RYTHM_IF_Statment_Short_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_Statment_Short_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_IF_Statment_Short_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_IF_Statment_Short_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCallExpr*
  private static boolean RYTHM_IF_Statment_Short_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCallExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '{'*
  private static boolean RYTHM_IF_Statment_Short_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_Statment_Short_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_Statment_Short_16", c)) break;
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
  // rythm_Key_Ident methodCall* /**13:43 UHR**/TEXT* '}'* TEXT* rythm_param* RYTHM_IF_Statment*  '(' (IDENTIFIER ':' '"'* IDENTIFIER '"'* '.'* ','* IDENTIFIER* '.'* ':'* '"'* IDENTIFIER*/**method muss hier rein methodCall**/'.'* '/'* IDENTIFIER* '"'* '('* ')'* /****03.11.16 - 17:41 Uhr LETZTER STAND ZEILE 205*****/ '{'* RYTHM_IF_Statment* '}'* /**10:01 Uhr**IF_KEY_FOR*****/ RYTHM_IF_KEY_FOR_Statement*  TEXT* RYTHM_KEY_BLOCKS* '"'* ','*)* '"'* ')'* '}'*
  public static boolean RYTHM_KEY_BLOCKS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rythm_Key_Ident(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_1(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_2(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_3(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_4(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_5(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_6(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_KEY_BLOCKS_8(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_9(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_10(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_11(b, l + 1);
    exit_section_(b, m, RYTHM_KEY_BLOCKS, r);
    return r;
  }

  // methodCall*
  private static boolean RYTHM_KEY_BLOCKS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_KEY_BLOCKS_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean RYTHM_KEY_BLOCKS_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_KEY_BLOCKS_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // rythm_param*
  private static boolean RYTHM_KEY_BLOCKS_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rythm_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean RYTHM_KEY_BLOCKS_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (IDENTIFIER ':' '"'* IDENTIFIER '"'* '.'* ','* IDENTIFIER* '.'* ':'* '"'* IDENTIFIER*/**method muss hier rein methodCall**/'.'* '/'* IDENTIFIER* '"'* '('* ')'* /****03.11.16 - 17:41 Uhr LETZTER STAND ZEILE 205*****/ '{'* RYTHM_IF_Statment* '}'* /**10:01 Uhr**IF_KEY_FOR*****/ RYTHM_IF_KEY_FOR_Statement*  TEXT* RYTHM_KEY_BLOCKS* '"'* ','*)*
  private static boolean RYTHM_KEY_BLOCKS_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KEY_BLOCKS_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER ':' '"'* IDENTIFIER '"'* '.'* ','* IDENTIFIER* '.'* ':'* '"'* IDENTIFIER*/**method muss hier rein methodCall**/'.'* '/'* IDENTIFIER* '"'* '('* ')'* /****03.11.16 - 17:41 Uhr LETZTER STAND ZEILE 205*****/ '{'* RYTHM_IF_Statment* '}'* /**10:01 Uhr**IF_KEY_FOR*****/ RYTHM_IF_KEY_FOR_Statement*  TEXT* RYTHM_KEY_BLOCKS* '"'* ','*
  private static boolean RYTHM_KEY_BLOCKS_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, COLON);
    r = r && RYTHM_KEY_BLOCKS_8_0_2(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && RYTHM_KEY_BLOCKS_8_0_4(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_5(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_6(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_7(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_8(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_9(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_10(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_11(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_12(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_13(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_14(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_15(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_16(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_17(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_18(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_19(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_20(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_21(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_22(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_23(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_24(b, l + 1);
    r = r && RYTHM_KEY_BLOCKS_8_0_25(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '"'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean RYTHM_KEY_BLOCKS_8_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_KEY_BLOCKS_8_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_KEY_BLOCKS_8_0_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '/'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SLASH)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_KEY_BLOCKS_8_0_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean RYTHM_KEY_BLOCKS_8_0_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_16", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_17")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_17", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '{'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_Statment*
  private static boolean RYTHM_KEY_BLOCKS_8_0_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_19")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_Statment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_19", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_20")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_20", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_KEY_FOR_Statement*
  private static boolean RYTHM_KEY_BLOCKS_8_0_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_21")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_KEY_FOR_Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_21", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean RYTHM_KEY_BLOCKS_8_0_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_22")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_22", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_KEY_BLOCKS*
  private static boolean RYTHM_KEY_BLOCKS_8_0_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_23")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_KEY_BLOCKS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_23", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_KEY_BLOCKS_8_0_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_24")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_24", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean RYTHM_KEY_BLOCKS_8_0_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_8_0_25")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_8_0_25", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean RYTHM_KEY_BLOCKS_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_KEY_BLOCKS_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '}'*
  private static boolean RYTHM_KEY_BLOCKS_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_BLOCKS_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_KEY_BLOCKS_11", c)) break;
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
  // '@section' PARAM '{' TEXT RYTHM_I18N TEXT rythm_Key_Ident '.' methodCallExpr TEXT*  rythm_Key_Ident '.' methodCallExpr ':' rythm_Key_Ident '.' methodCallExpr TEXT '}'
  public static boolean RYTHM_SECTION_WR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_WR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SECTION_WR, "<rythm section wr>");
    r = consumeToken(b, "@section");
    r = r && PARAM(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, TEXT);
    r = r && RYTHM_I18N(b, l + 1);
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
  // '('* EXCL* IDENTIFIER ('.' methodCallExpr+)* ')'*
  public static boolean STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = STATEMENT_0(b, l + 1);
    r = r && STATEMENT_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && STATEMENT_3(b, l + 1);
    r = r && STATEMENT_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '('*
  private static boolean STATEMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EXCL*
  private static boolean STATEMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EXCL)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ('.' methodCallExpr+)*
  private static boolean STATEMENT_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!STATEMENT_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' methodCallExpr+
  private static boolean STATEMENT_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && STATEMENT_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodCallExpr+
  private static boolean STATEMENT_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodCallExpr(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!methodCallExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_3_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ')'*
  private static boolean STATEMENT_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_4", c)) break;
      c = current_position_(b);
    }
    return true;
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
  // '.'IDENTIFIER LPAREN IDENTIFIER* '.'* IDENTIFIER*  '('* ')'* RPAREN*
  public static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && consumeTokens(b, 0, IDENTIFIER, LPAREN);
    r = r && methodCall_3(b, l + 1);
    r = r && methodCall_4(b, l + 1);
    r = r && methodCall_5(b, l + 1);
    r = r && methodCall_6(b, l + 1);
    r = r && methodCall_7(b, l + 1);
    r = r && methodCall_8(b, l + 1);
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean methodCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean methodCall_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean methodCall_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean methodCall_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean methodCall_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RPAREN*
  private static boolean methodCall_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN* '"'* IDENTIFIER '/'* '"'*  '+'* IDENTIFIER* methodCall* RPAREN* '{'* HTML_START_RYTHM_BLOCK*  LPAREN+ '"'* IDENTIFIER*'/'* '"'* RPAREN+
  public static boolean methodCallExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, METHOD_CALL_EXPR, "<method call expr>");
    r = methodCallExpr_0(b, l + 1);
    r = r && methodCallExpr_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && methodCallExpr_3(b, l + 1);
    r = r && methodCallExpr_4(b, l + 1);
    r = r && methodCallExpr_5(b, l + 1);
    r = r && methodCallExpr_6(b, l + 1);
    r = r && methodCallExpr_7(b, l + 1);
    r = r && methodCallExpr_8(b, l + 1);
    r = r && methodCallExpr_9(b, l + 1);
    r = r && methodCallExpr_10(b, l + 1);
    r = r && methodCallExpr_11(b, l + 1);
    p = r; // pin = 12
    r = r && report_error_(b, methodCallExpr_12(b, l + 1));
    r = p && report_error_(b, methodCallExpr_13(b, l + 1)) && r;
    r = p && report_error_(b, methodCallExpr_14(b, l + 1)) && r;
    r = p && report_error_(b, methodCallExpr_15(b, l + 1)) && r;
    r = p && methodCallExpr_16(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LPAREN*
  private static boolean methodCallExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean methodCallExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '/'*
  private static boolean methodCallExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SLASH)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean methodCallExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+'*
  private static boolean methodCallExpr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PLUS)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean methodCallExpr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean methodCallExpr_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RPAREN*
  private static boolean methodCallExpr_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '{'*
  private static boolean methodCallExpr_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LBRACE)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML_START_RYTHM_BLOCK*
  private static boolean methodCallExpr_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!HTML_START_RYTHM_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LPAREN+
  private static boolean methodCallExpr_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_11", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '"'*
  private static boolean methodCallExpr_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean methodCallExpr_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '/'*
  private static boolean methodCallExpr_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SLASH)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean methodCallExpr_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RPAREN+
  private static boolean methodCallExpr_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCallExpr_16", c)) break;
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
  // BLOCK_COMMENT? (initialDeclaration) RYTHM_SECTION RYTHM_KeyBlock HTML_START_RYTHM_BLOCK* /*RYTHM_IF_Statment**/ |  (TEXT) | (RYTHM)| (GENERICS?)
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
  // RYTHM_KEY '('* IDENTIFIER* ':'* '"'* IDENTIFIER* '"'* ','* RYTHM_BLOCK* TEXT* /**TEXT wurde hinzugefügt**/'.'* methodCallExpr*
  public static boolean rythm_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    r = r && rythm_method_1(b, l + 1);
    r = r && rythm_method_2(b, l + 1);
    r = r && rythm_method_3(b, l + 1);
    r = r && rythm_method_4(b, l + 1);
    r = r && rythm_method_5(b, l + 1);
    r = r && rythm_method_6(b, l + 1);
    r = r && rythm_method_7(b, l + 1);
    r = r && rythm_method_8(b, l + 1);
    r = r && rythm_method_9(b, l + 1);
    r = r && rythm_method_10(b, l + 1);
    r = r && rythm_method_11(b, l + 1);
    exit_section_(b, m, RYTHM_METHOD, r);
    return r;
  }

  // '('*
  private static boolean rythm_method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean rythm_method_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean rythm_method_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean rythm_method_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean rythm_method_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '"'*
  private static boolean rythm_method_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean rythm_method_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_BLOCK*
  private static boolean rythm_method_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TEXT*
  private static boolean rythm_method_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean rythm_method_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCallExpr*
  private static boolean rythm_method_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_method_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCallExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rythm_method_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // rythm_Key_Ident '(' IDENTIFIER* ')'
  public static boolean rythm_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_param")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rythm_Key_Ident(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && rythm_param_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, RYTHM_PARAM, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean rythm_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_param_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "rythm_param_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
