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
    if (t == HTML_BLOCK) {
      r = HTML_BLOCK(b, 0);
    }
    else if (t == OPERATOR) {
      r = OPERATOR(b, 0);
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
    else if (t == RYTHM_EXTENDS) {
      r = RYTHM_EXTENDS(b, 0);
    }
    else if (t == RYTHM_FOR) {
      r = RYTHM_FOR(b, 0);
    }
    else if (t == RYTHM_I_18_N) {
      r = RYTHM_I18N(b, 0);
    }
    else if (t == RYTHM_IF) {
      r = RYTHM_IF(b, 0);
    }
    else if (t == RYTHM_IF_ELSE) {
      r = RYTHM_IF_ELSE(b, 0);
    }
    else if (t == RYTHM_IMPORT) {
      r = RYTHM_IMPORT(b, 0);
    }
    else if (t == RYTHM_KEY_IDENT) {
      r = RYTHM_KEY_IDENT(b, 0);
    }
    else if (t == RYTHM_PREFIX) {
      r = RYTHM_PREFIX(b, 0);
    }
    else if (t == RYTHM_SECTION) {
      r = RYTHM_SECTION(b, 0);
    }
    else if (t == RYTHM_SYN) {
      r = RYTHM_SYN(b, 0);
    }
    else if (t == SCRIPT_BLOCK) {
      r = SCRIPT_BLOCK(b, 0);
    }
    else if (t == STATEMENT) {
      r = STATEMENT(b, 0);
    }
    else if (t == UNDEFINED_IDENT) {
      r = UNDEFINED_IDENT(b, 0);
    }
    else if (t == UNDEFINED_IDENT_BLOCK) {
      r = UNDEFINED_IDENT_BLOCK(b, 0);
    }
    else if (t == FIX) {
      r = fix(b, 0);
    }
    else if (t == IDENT_METHOD_CALL) {
      r = identMethodCall(b, 0);
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
    else if (t == QUALIFIED_NAME) {
      r = qualifiedName(b, 0);
    }
    else if (t == RYTHM_FILE) {
      r = rythmFile(b, 0);
    }
    else if (t == RYTHM_METHOD_CALL) {
      r = rythmMethodCall(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return templateFile(b, l + 1);
  }

  /* ********************************************************** */
  // HTML RYTHM_BLOCK (HTML* RYTHM_SYN HTML* RYTHM_IF_ELSE*) (HTML RYTHM_SYN)+'{' HTML*
  public static boolean HTML_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK")) return false;
    if (!nextTokenIs(b, HTML)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HTML_BLOCK, null);
    r = consumeToken(b, HTML);
    r = r && RYTHM_BLOCK(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, HTML_BLOCK_2(b, l + 1));
    r = p && report_error_(b, HTML_BLOCK_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LBRACE)) && r;
    r = p && HTML_BLOCK_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // HTML* RYTHM_SYN HTML* RYTHM_IF_ELSE*
  private static boolean HTML_BLOCK_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = HTML_BLOCK_2_0(b, l + 1);
    r = r && RYTHM_SYN(b, l + 1);
    r = r && HTML_BLOCK_2_2(b, l + 1);
    r = r && HTML_BLOCK_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HTML*
  private static boolean HTML_BLOCK_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK_2_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "HTML_BLOCK_2_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean HTML_BLOCK_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK_2_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "HTML_BLOCK_2_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF_ELSE*
  private static boolean HTML_BLOCK_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_ELSE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_BLOCK_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (HTML RYTHM_SYN)+
  private static boolean HTML_BLOCK_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = HTML_BLOCK_3_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!HTML_BLOCK_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HTML_BLOCK_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // HTML RYTHM_SYN
  private static boolean HTML_BLOCK_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HTML);
    r = r && RYTHM_SYN(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HTML*
  private static boolean HTML_BLOCK_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HTML_BLOCK_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "HTML_BLOCK_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '=='|'>'|'<'|'||'|'&&'|'<='|'>='|'!='|'==='|'!'
  public static boolean OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "||");
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "!=");
    if (!r) r = consumeToken(b, "===");
    if (!r) r = consumeToken(b, AUSRF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_SYN|RYTHM_INVOKE|RYTHM_RENDER|RYTHM_ELSE
  public static boolean RYTHM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM, "<rythm>");
    r = RYTHM_SYN(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM_INVOKE);
    if (!r) r = consumeToken(b, RYTHM_RENDER);
    if (!r) r = consumeToken(b, RYTHM_ELSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@args' (qualifiedName ','*)+
  public static boolean RYTHM_ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_ARGS, "<rythm args>");
    r = consumeToken(b, "@args");
    r = r && RYTHM_ARGS_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (qualifiedName ','*)+
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

  // qualifiedName ','*
  private static boolean RYTHM_ARGS_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    r = r && RYTHM_ARGS_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','*
  private static boolean RYTHM_ARGS_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_ARGS_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RYTHM_KEY_IDENT '('+ '"'* UNDEFINED_IDENT* ':'* '/'* HTML*'+'* identMethodCall* STRING_LITERAL* ','* /* ( TEST ***/'('* UNDEFINED_IDENT_BLOCK* HTML* RYTHM_BLOCK* (RYTHM_SYN* HTML+)*')'+ '{' HTML* RYTHM_SYN* ':'* RYTHM_SYN* HTML* RYTHM_IF* RYTHM_SYN* (HTML RYTHM_SYN*)* '}'
  public static boolean RYTHM_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_KEY_IDENT(b, l + 1);
    r = r && RYTHM_BLOCK_1(b, l + 1);
    r = r && RYTHM_BLOCK_2(b, l + 1);
    r = r && RYTHM_BLOCK_3(b, l + 1);
    r = r && RYTHM_BLOCK_4(b, l + 1);
    r = r && RYTHM_BLOCK_5(b, l + 1);
    r = r && RYTHM_BLOCK_6(b, l + 1);
    r = r && RYTHM_BLOCK_7(b, l + 1);
    r = r && RYTHM_BLOCK_8(b, l + 1);
    r = r && RYTHM_BLOCK_9(b, l + 1);
    r = r && RYTHM_BLOCK_10(b, l + 1);
    r = r && RYTHM_BLOCK_11(b, l + 1);
    r = r && RYTHM_BLOCK_12(b, l + 1);
    r = r && RYTHM_BLOCK_13(b, l + 1);
    r = r && RYTHM_BLOCK_14(b, l + 1);
    r = r && RYTHM_BLOCK_15(b, l + 1);
    r = r && RYTHM_BLOCK_16(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_BLOCK_18(b, l + 1);
    r = r && RYTHM_BLOCK_19(b, l + 1);
    r = r && RYTHM_BLOCK_20(b, l + 1);
    r = r && RYTHM_BLOCK_21(b, l + 1);
    r = r && RYTHM_BLOCK_22(b, l + 1);
    r = r && RYTHM_BLOCK_23(b, l + 1);
    r = r && RYTHM_BLOCK_24(b, l + 1);
    r = r && RYTHM_BLOCK_25(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, RYTHM_BLOCK, r);
    return r;
  }

  // '('+
  private static boolean RYTHM_BLOCK_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '"'*
  private static boolean RYTHM_BLOCK_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean RYTHM_BLOCK_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean RYTHM_BLOCK_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '/'*
  private static boolean RYTHM_BLOCK_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SLASH)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_BLOCK_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+'*
  private static boolean RYTHM_BLOCK_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PLUS)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // identMethodCall*
  private static boolean RYTHM_BLOCK_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!identMethodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING_LITERAL*
  private static boolean RYTHM_BLOCK_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING_LITERAL)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean RYTHM_BLOCK_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean RYTHM_BLOCK_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT_BLOCK*
  private static boolean RYTHM_BLOCK_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_BLOCK_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_BLOCK*
  private static boolean RYTHM_BLOCK_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (RYTHM_SYN* HTML+)*
  private static boolean RYTHM_BLOCK_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_BLOCK_15_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN* HTML+
  private static boolean RYTHM_BLOCK_15_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_15_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_BLOCK_15_0_0(b, l + 1);
    r = r && RYTHM_BLOCK_15_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_BLOCK_15_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_15_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_15_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML+
  private static boolean RYTHM_BLOCK_15_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_15_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HTML);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_15_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ')'+
  private static boolean RYTHM_BLOCK_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_16", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // HTML*
  private static boolean RYTHM_BLOCK_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_BLOCK_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_19")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_19", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean RYTHM_BLOCK_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_20")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_20", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_BLOCK_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_21")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_21", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_BLOCK_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_22")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_22", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_IF*
  private static boolean RYTHM_BLOCK_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_23")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_23", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_BLOCK_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_24")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_24", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (HTML RYTHM_SYN*)*
  private static boolean RYTHM_BLOCK_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_25")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_BLOCK_25_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_25", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML RYTHM_SYN*
  private static boolean RYTHM_BLOCK_25_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_25_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HTML);
    r = r && RYTHM_BLOCK_25_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_BLOCK_25_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_BLOCK_25_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_BLOCK_25_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@extends' '('+ qualifiedName ','* 'title'':' '('+ (IDENTIFIER methodCall* '+'* STRING_LITERAL* '+'* IDENTIFIER* methodCall*|qualifiedName)? ')'*
  public static boolean RYTHM_EXTENDS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_EXTENDS, "<rythm extends>");
    r = consumeToken(b, "@extends");
    r = r && RYTHM_EXTENDS_1(b, l + 1);
    r = r && qualifiedName(b, l + 1);
    r = r && RYTHM_EXTENDS_3(b, l + 1);
    r = r && consumeToken(b, "title");
    r = r && consumeToken(b, COLON);
    r = r && RYTHM_EXTENDS_6(b, l + 1);
    r = r && RYTHM_EXTENDS_7(b, l + 1);
    r = r && RYTHM_EXTENDS_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '('+
  private static boolean RYTHM_EXTENDS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ','*
  private static boolean RYTHM_EXTENDS_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('+
  private static boolean RYTHM_EXTENDS_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_6", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (IDENTIFIER methodCall* '+'* STRING_LITERAL* '+'* IDENTIFIER* methodCall*|qualifiedName)?
  private static boolean RYTHM_EXTENDS_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7")) return false;
    RYTHM_EXTENDS_7_0(b, l + 1);
    return true;
  }

  // IDENTIFIER methodCall* '+'* STRING_LITERAL* '+'* IDENTIFIER* methodCall*|qualifiedName
  private static boolean RYTHM_EXTENDS_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_EXTENDS_7_0_0(b, l + 1);
    if (!r) r = qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER methodCall* '+'* STRING_LITERAL* '+'* IDENTIFIER* methodCall*
  private static boolean RYTHM_EXTENDS_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && RYTHM_EXTENDS_7_0_0_1(b, l + 1);
    r = r && RYTHM_EXTENDS_7_0_0_2(b, l + 1);
    r = r && RYTHM_EXTENDS_7_0_0_3(b, l + 1);
    r = r && RYTHM_EXTENDS_7_0_0_4(b, l + 1);
    r = r && RYTHM_EXTENDS_7_0_0_5(b, l + 1);
    r = r && RYTHM_EXTENDS_7_0_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodCall*
  private static boolean RYTHM_EXTENDS_7_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_7_0_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+'*
  private static boolean RYTHM_EXTENDS_7_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PLUS)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_7_0_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING_LITERAL*
  private static boolean RYTHM_EXTENDS_7_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING_LITERAL)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_7_0_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+'*
  private static boolean RYTHM_EXTENDS_7_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PLUS)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_7_0_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_EXTENDS_7_0_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_7_0_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean RYTHM_EXTENDS_7_0_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_7_0_0_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_7_0_0_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_EXTENDS_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@for' '(' qualifiedName* UNDEFINED_IDENT* ':'* UNDEFINED_IDENT* methodCall* ')' '{'
  public static boolean RYTHM_FOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_FOR, "<rythm for>");
    r = consumeToken(b, "@for");
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_FOR_2(b, l + 1);
    r = r && RYTHM_FOR_3(b, l + 1);
    r = r && RYTHM_FOR_4(b, l + 1);
    r = r && RYTHM_FOR_5(b, l + 1);
    r = r && RYTHM_FOR_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && consumeToken(b, LBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualifiedName*
  private static boolean RYTHM_FOR_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qualifiedName(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean RYTHM_FOR_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean RYTHM_FOR_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean RYTHM_FOR_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean RYTHM_FOR_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_FOR_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_FOR_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@i18n' '('+ STRING_LITERAL ('+' IDENTIFIER)* ')'+
  public static boolean RYTHM_I18N(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_I_18_N, "<rythm i 18 n>");
    r = consumeToken(b, "@i18n");
    r = r && RYTHM_I18N_1(b, l + 1);
    r = r && consumeToken(b, STRING_LITERAL);
    r = r && RYTHM_I18N_3(b, l + 1);
    r = r && RYTHM_I18N_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '('+
  private static boolean RYTHM_I18N_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_I18N_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ('+' IDENTIFIER)*
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

  // '+' IDENTIFIER
  private static boolean RYTHM_I18N_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ')'+
  private static boolean RYTHM_I18N_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_I18N_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_I18N_4", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@if' '(' EXCL* '!'* IDENTIFIER '=='* ')'*  methodCall* '||'* '&&'* UNDEFINED_IDENT* methodCall* '>'* UNDEFINED_IDENT* DIGIT* ')'* '!='*  '{' RYTHM_SYN* HTML* (RYTHM_SYN* HTML)* UNDEFINED_IDENT* ')'* '{'* '-'* UNDEFINED_IDENT_BLOCK* HTML* SCRIPT_BLOCK* HTML* UNDEFINED_IDENT_BLOCK* '}' ('else' '{' HTML '}')*
  public static boolean RYTHM_IF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF, "<rythm if>");
    r = consumeToken(b, "@if");
    r = r && consumeToken(b, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, RYTHM_IF_2(b, l + 1));
    r = p && report_error_(b, RYTHM_IF_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && report_error_(b, RYTHM_IF_5(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_6(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_7(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_8(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_9(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_10(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_11(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_12(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_13(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_14(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_15(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_16(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LBRACE)) && r;
    r = p && report_error_(b, RYTHM_IF_18(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_19(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_20(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_21(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_22(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_23(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_24(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_25(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_26(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_27(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_28(b, l + 1)) && r;
    r = p && report_error_(b, RYTHM_IF_29(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RBRACE)) && r;
    r = p && RYTHM_IF_31(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // EXCL*
  private static boolean RYTHM_IF_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EXCL)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '!'*
  private static boolean RYTHM_IF_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, AUSRF)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '=='*
  private static boolean RYTHM_IF_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "==")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean RYTHM_IF_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '||'*
  private static boolean RYTHM_IF_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "||")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '&&'*
  private static boolean RYTHM_IF_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, AND)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean RYTHM_IF_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean RYTHM_IF_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '>'*
  private static boolean RYTHM_IF_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, ">")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean RYTHM_IF_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DIGIT*
  private static boolean RYTHM_IF_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DIGIT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '!='*
  private static boolean RYTHM_IF_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "!=")) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_16", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_IF_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_IF_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_19")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_19", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (RYTHM_SYN* HTML)*
  private static boolean RYTHM_IF_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_20")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_20_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_20", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN* HTML
  private static boolean RYTHM_IF_20_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_20_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_IF_20_0_0(b, l + 1);
    r = r && consumeToken(b, HTML);
    exit_section_(b, m, null, r);
    return r;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_IF_20_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_20_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_20_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean RYTHM_IF_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_21")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_21", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_IF_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_22")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_22", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '{'*
  private static boolean RYTHM_IF_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_23")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LBRACE)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_23", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '-'*
  private static boolean RYTHM_IF_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_24")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, MINUS)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_24", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT_BLOCK*
  private static boolean RYTHM_IF_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_25")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_25", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_IF_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_26")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_26", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SCRIPT_BLOCK*
  private static boolean RYTHM_IF_27(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_27")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SCRIPT_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_27", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_IF_28(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_28")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_28", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT_BLOCK*
  private static boolean RYTHM_IF_29(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_29")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT_BLOCK(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_29", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ('else' '{' HTML '}')*
  private static boolean RYTHM_IF_31(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_31")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IF_31_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_31", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // 'else' '{' HTML '}'
  private static boolean RYTHM_IF_31_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_31_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, HTML);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'else' '{' (HTML RYTHM_SYN HTML RYTHM_SYN*) HTML* (RYTHM_SYN* HTML)+ '}'
  public static boolean RYTHM_IF_ELSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_ELSE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IF_ELSE, "<rythm if else>");
    r = consumeToken(b, "else");
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_IF_ELSE_2(b, l + 1);
    r = r && RYTHM_IF_ELSE_3(b, l + 1);
    r = r && RYTHM_IF_ELSE_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // HTML RYTHM_SYN HTML RYTHM_SYN*
  private static boolean RYTHM_IF_ELSE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_ELSE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HTML);
    r = r && RYTHM_SYN(b, l + 1);
    r = r && consumeToken(b, HTML);
    r = r && RYTHM_IF_ELSE_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_IF_ELSE_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_ELSE_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_ELSE_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_IF_ELSE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_ELSE_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_ELSE_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (RYTHM_SYN* HTML)+
  private static boolean RYTHM_IF_ELSE_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_ELSE_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_IF_ELSE_4_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!RYTHM_IF_ELSE_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_ELSE_4", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // RYTHM_SYN* HTML
  private static boolean RYTHM_IF_ELSE_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_ELSE_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_IF_ELSE_4_0_0(b, l + 1);
    r = r && consumeToken(b, HTML);
    exit_section_(b, m, null, r);
    return r;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_IF_ELSE_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IF_ELSE_4_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IF_ELSE_4_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '@import' qualifiedName+
  public static boolean RYTHM_IMPORT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IMPORT, "<rythm import>");
    r = consumeToken(b, "@import");
    r = r && RYTHM_IMPORT_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualifiedName+
  private static boolean RYTHM_IMPORT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!qualifiedName(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_IMPORT_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_KEY
  public static boolean RYTHM_KEY_IDENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_KEY_IDENT")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    exit_section_(b, m, RYTHM_KEY_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // '@prefix'
  public static boolean RYTHM_PREFIX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_PREFIX")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_PREFIX, "<rythm prefix>");
    r = consumeToken(b, "@prefix");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@section''(' IDENTIFIER* ')' '{' HTML RYTHM_SYN* HTML* RYTHM_SYN* HTML* RYTHM_SYN* ':'* RYTHM_SYN* HTML* '}'
  public static boolean RYTHM_SECTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SECTION, "<rythm section>");
    r = consumeToken(b, "@section");
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_SECTION_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && consumeToken(b, LBRACE);
    r = r && consumeToken(b, HTML);
    r = r && RYTHM_SECTION_6(b, l + 1);
    r = r && RYTHM_SECTION_7(b, l + 1);
    r = r && RYTHM_SECTION_8(b, l + 1);
    r = r && RYTHM_SECTION_9(b, l + 1);
    r = r && RYTHM_SECTION_10(b, l + 1);
    r = r && RYTHM_SECTION_11(b, l + 1);
    r = r && RYTHM_SECTION_12(b, l + 1);
    r = r && RYTHM_SECTION_13(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER*
  private static boolean RYTHM_SECTION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_SECTION_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_SECTION_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_SECTION_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_SECTION_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_SECTION_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean RYTHM_SECTION_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_SYN*
  private static boolean RYTHM_SECTION_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_SYN(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML*
  private static boolean RYTHM_SECTION_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, HTML)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RYTHM_I18N |RYTHM_FOR| RYTHM_IF| RYTHM_PREFIX |RYTHM_BLOCK|rythmMethodCall|RYTHM_KEY_IDENT
  public static boolean RYTHM_SYN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SYN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SYN, "<rythm syn>");
    r = RYTHM_I18N(b, l + 1);
    if (!r) r = RYTHM_FOR(b, l + 1);
    if (!r) r = RYTHM_IF(b, l + 1);
    if (!r) r = RYTHM_PREFIX(b, l + 1);
    if (!r) r = RYTHM_BLOCK(b, l + 1);
    if (!r) r = rythmMethodCall(b, l + 1);
    if (!r) r = RYTHM_KEY_IDENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (STRING_LITERAL ':'* IDENTIFIER)','*
  public static boolean SCRIPT_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCRIPT_BLOCK")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SCRIPT_BLOCK_0(b, l + 1);
    r = r && SCRIPT_BLOCK_1(b, l + 1);
    exit_section_(b, m, SCRIPT_BLOCK, r);
    return r;
  }

  // STRING_LITERAL ':'* IDENTIFIER
  private static boolean SCRIPT_BLOCK_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCRIPT_BLOCK_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    r = r && SCRIPT_BLOCK_0_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':'*
  private static boolean SCRIPT_BLOCK_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCRIPT_BLOCK_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "SCRIPT_BLOCK_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean SCRIPT_BLOCK_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCRIPT_BLOCK_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "SCRIPT_BLOCK_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EXCL* '!'* IDENTIFIER OPERATOR methodCall* OPERATOR* UNDEFINED_IDENT* methodCall* UNDEFINED_IDENT* DIGIT* OPERATOR
  public static boolean STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = STATEMENT_0(b, l + 1);
    r = r && STATEMENT_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && OPERATOR(b, l + 1);
    r = r && STATEMENT_4(b, l + 1);
    r = r && STATEMENT_5(b, l + 1);
    r = r && STATEMENT_6(b, l + 1);
    r = r && STATEMENT_7(b, l + 1);
    r = r && STATEMENT_8(b, l + 1);
    r = r && STATEMENT_9(b, l + 1);
    r = r && OPERATOR(b, l + 1);
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

  // '!'*
  private static boolean STATEMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, AUSRF)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean STATEMENT_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPERATOR*
  private static boolean STATEMENT_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OPERATOR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean STATEMENT_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // methodCall*
  private static boolean STATEMENT_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!methodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean STATEMENT_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DIGIT*
  private static boolean STATEMENT_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DIGIT)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean UNDEFINED_IDENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, UNDEFINED_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // UNDEFINED_IDENT '.'* ':'* '['* RYTHM_FOR* identMethodCall* UNDEFINED_IDENT* STRING_LITERAL* ','* '='* '<'* '('*');'* '+'* ')'* (UNDEFINED_IDENT  ';'* ':'* identMethodCall','*)*
  public static boolean UNDEFINED_IDENT_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UNDEFINED_IDENT(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_1(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_2(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_3(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_4(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_5(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_6(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_7(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_8(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_9(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_10(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_11(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_12(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_13(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_14(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_15(b, l + 1);
    exit_section_(b, m, UNDEFINED_IDENT_BLOCK, r);
    return r;
  }

  // '.'*
  private static boolean UNDEFINED_IDENT_BLOCK_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean UNDEFINED_IDENT_BLOCK_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '['*
  private static boolean UNDEFINED_IDENT_BLOCK_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, BRCSL)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RYTHM_FOR*
  private static boolean UNDEFINED_IDENT_BLOCK_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_FOR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // identMethodCall*
  private static boolean UNDEFINED_IDENT_BLOCK_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!identMethodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT*
  private static boolean UNDEFINED_IDENT_BLOCK_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING_LITERAL*
  private static boolean UNDEFINED_IDENT_BLOCK_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING_LITERAL)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean UNDEFINED_IDENT_BLOCK_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '='*
  private static boolean UNDEFINED_IDENT_BLOCK_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EQ)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '<'*
  private static boolean UNDEFINED_IDENT_BLOCK_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "<")) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean UNDEFINED_IDENT_BLOCK_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ');'*
  private static boolean UNDEFINED_IDENT_BLOCK_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_12")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, ");")) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_12", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+'*
  private static boolean UNDEFINED_IDENT_BLOCK_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PLUS)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean UNDEFINED_IDENT_BLOCK_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (UNDEFINED_IDENT  ';'* ':'* identMethodCall','*)*
  private static boolean UNDEFINED_IDENT_BLOCK_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UNDEFINED_IDENT_BLOCK_15_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UNDEFINED_IDENT  ';'* ':'* identMethodCall','*
  private static boolean UNDEFINED_IDENT_BLOCK_15_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_15_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UNDEFINED_IDENT(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_15_0_1(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_15_0_2(b, l + 1);
    r = r && identMethodCall(b, l + 1);
    r = r && UNDEFINED_IDENT_BLOCK_15_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'*
  private static boolean UNDEFINED_IDENT_BLOCK_15_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_15_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SEMICOLON)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_15_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ':'*
  private static boolean UNDEFINED_IDENT_BLOCK_15_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_15_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COLON)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_15_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean UNDEFINED_IDENT_BLOCK_15_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNDEFINED_IDENT_BLOCK_15_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "UNDEFINED_IDENT_BLOCK_15_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // GENERICS RYTHM_ESCAPED G VAR FUNCTION THIS NEW DIGIT Q_RYTHM STRING_LITERAL NULL MINUS TILDE AND OR HTML BLOCK_COMMENT GREATER EXCL
  public static boolean fix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fix")) return false;
    if (!nextTokenIs(b, GENERICS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERICS, RYTHM_ESCAPED, G, VAR, FUNCTION, THIS, NEW, DIGIT, Q_RYTHM, STRING_LITERAL, NULL, MINUS, TILDE, AND, OR, HTML, BLOCK_COMMENT, GREATER, EXCL);
    exit_section_(b, m, FIX, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER methodCall
  public static boolean identMethodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identMethodCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && methodCall(b, l + 1);
    exit_section_(b, m, IDENT_METHOD_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_ARGS RYTHM_IMPORT* RYTHM_EXTENDS
  public static boolean initialDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIAL_DECLARATION, "<initial declaration>");
    r = RYTHM_ARGS(b, l + 1);
    r = r && initialDeclaration_1(b, l + 1);
    r = r && RYTHM_EXTENDS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RYTHM_IMPORT*
  private static boolean initialDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialDeclaration_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RYTHM_IMPORT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "initialDeclaration_1", c)) break;
      c = current_position_(b);
    }
    return true;
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
  // '.'IDENTIFIER'('+ identMethodCall* STRING_LITERAL* ')'
  public static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && methodCall_2(b, l + 1);
    r = r && methodCall_3(b, l + 1);
    r = r && methodCall_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  // '('+
  private static boolean methodCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // identMethodCall*
  private static boolean methodCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!identMethodCall(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING_LITERAL*
  private static boolean methodCall_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING_LITERAL)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_4", c)) break;
      c = current_position_(b);
    }
    return true;
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
  // initialDeclaration RYTHM_SECTION+ RYTHM_BLOCK HTML_BLOCK RYTHM_SYN
  public static boolean rythmFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_FILE, "<rythm file>");
    r = initialDeclaration(b, l + 1);
    r = r && rythmFile_1(b, l + 1);
    r = r && RYTHM_BLOCK(b, l + 1);
    r = r && HTML_BLOCK(b, l + 1);
    p = r; // pin = HTML_BLOCK
    r = r && RYTHM_SYN(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RYTHM_SECTION+
  private static boolean rythmFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_SECTION(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!RYTHM_SECTION(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rythmFile_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_KEY_IDENT methodCall
  public static boolean rythmMethodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmMethodCall")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM_KEY_IDENT(b, l + 1);
    r = r && methodCall(b, l + 1);
    exit_section_(b, m, RYTHM_METHOD_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // rythmFile
  static boolean templateFile(PsiBuilder b, int l) {
    return rythmFile(b, l + 1);
  }

}
