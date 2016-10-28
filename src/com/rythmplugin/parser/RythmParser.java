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
    if (t == PARAM) {
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
    else if (t == RYTHM_IMPORT) {
      r = RYTHM_IMPORT(b, 0);
    }
    else if (t == RYTHM_SECTION) {
      r = RYTHM_SECTION(b, 0);
    }
    else if (t == INITIAL_DECLARATION) {
      r = initialDeclaration(b, 0);
    }
    else if (t == JAVA_CODE) {
      r = java_code(b, 0);
    }
    else if (t == QUALIFIED_NAME) {
      r = qualifiedName(b, 0);
    }
    else if (t == RYTHM_KEYY) {
      r = rythm_keyy(b, 0);
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
  // '('IDENTIFIER+ ')'
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

  // IDENTIFIER+
  private static boolean PARAM_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PARAM_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "PARAM_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_PREFIX|RYTHM_IF|RYTHM_I18N|RYTHM_EXTENDS|RYTHM_FOR|RYTHM_INVOKE|RYTHM_SECTION|RYTHM_RENDER|BLOCK_COMMENT
  public static boolean RYTHM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM, "<rythm>");
    r = consumeToken(b, RYTHM_PREFIX);
    if (!r) r = consumeToken(b, RYTHM_IF);
    if (!r) r = consumeToken(b, RYTHM_I18N);
    if (!r) r = RYTHM_EXTENDS(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM_FOR);
    if (!r) r = consumeToken(b, RYTHM_INVOKE);
    if (!r) r = RYTHM_SECTION(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM_RENDER);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@args' qualifiedName
  public static boolean RYTHM_ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_ARGS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_ARGS, "<rythm args>");
    r = consumeToken(b, "@args");
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@extends' '('qualifiedName'.'IDENTIFIER+',' 'title'':' '('IDENTIFIER+'.'IDENTIFIER+'('IDENTIFIER* '.'* IDENTIFIER*'('*')'')'*'+''"'':''"''+'IDENTIFIER+'.'IDENTIFIER*'('')'')'')'
  public static boolean RYTHM_EXTENDS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_EXTENDS, "<rythm extends>");
    r = consumeToken(b, "@extends");
    r = r && consumeToken(b, LPAREN);
    r = r && qualifiedName(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && RYTHM_EXTENDS_4(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && consumeToken(b, "title");
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_EXTENDS_9(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && RYTHM_EXTENDS_11(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && RYTHM_EXTENDS_13(b, l + 1);
    r = r && RYTHM_EXTENDS_14(b, l + 1);
    r = r && RYTHM_EXTENDS_15(b, l + 1);
    r = r && RYTHM_EXTENDS_16(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && RYTHM_EXTENDS_18(b, l + 1);
    r = r && consumeToken(b, PLUS);
    r = r && consumeToken(b, GF);
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, GF);
    r = r && consumeToken(b, PLUS);
    r = r && RYTHM_EXTENDS_24(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && RYTHM_EXTENDS_26(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && consumeToken(b, RPAREN);
    r = r && consumeToken(b, RPAREN);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER+
  private static boolean RYTHM_EXTENDS_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_4", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean RYTHM_EXTENDS_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_9", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean RYTHM_EXTENDS_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_11", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean RYTHM_EXTENDS_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'*
  private static boolean RYTHM_EXTENDS_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean RYTHM_EXTENDS_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '('*
  private static boolean RYTHM_EXTENDS_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_16")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_16", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ')'*
  private static boolean RYTHM_EXTENDS_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_18")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, RPAREN)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_18", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER+
  private static boolean RYTHM_EXTENDS_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_24")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_24", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean RYTHM_EXTENDS_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_EXTENDS_26")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_EXTENDS_26", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ('@import' qualifiedName) RYTHM_IMPORT
  public static boolean RYTHM_IMPORT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_IMPORT, "<rythm import>");
    r = RYTHM_IMPORT_0(b, l + 1);
    r = r && RYTHM_IMPORT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@import' qualifiedName
  private static boolean RYTHM_IMPORT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_IMPORT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@import");
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@section' PARAM '{' TEXT* '}'
  public static boolean RYTHM_SECTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RYTHM_SECTION, "<rythm section>");
    r = consumeToken(b, "@section");
    r = r && PARAM(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RYTHM_SECTION_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TEXT*
  private static boolean RYTHM_SECTION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RYTHM_SECTION_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "RYTHM_SECTION_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RYTHM_ARGS RYTHM_IMPORT RYTHM_EXTENDS
  public static boolean initialDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INITIAL_DECLARATION, "<initial declaration>");
    r = RYTHM_ARGS(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, RYTHM_IMPORT(b, l + 1));
    r = p && RYTHM_EXTENDS(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // IDENTIFIER+ ('.'* ','* IDENTIFIER+)* (GENERICS* IDENTIFIER* ','* IDENTIFIER* GENERICS)* IDENTIFIER*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName_0(b, l + 1);
    r = r && qualifiedName_1(b, l + 1);
    r = r && qualifiedName_2(b, l + 1);
    r = r && qualifiedName_3(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean qualifiedName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.'* ','* IDENTIFIER+)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.'* ','* IDENTIFIER+
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName_1_0_0(b, l + 1);
    r = r && qualifiedName_1_0_1(b, l + 1);
    r = r && qualifiedName_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.'*
  private static boolean qualifiedName_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, DOT)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean qualifiedName_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER+
  private static boolean qualifiedName_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1_0_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (GENERICS* IDENTIFIER* ','* IDENTIFIER* GENERICS)*
  private static boolean qualifiedName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qualifiedName_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // GENERICS* IDENTIFIER* ','* IDENTIFIER* GENERICS
  private static boolean qualifiedName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName_2_0_0(b, l + 1);
    r = r && qualifiedName_2_0_1(b, l + 1);
    r = r && qualifiedName_2_0_2(b, l + 1);
    r = r && qualifiedName_2_0_3(b, l + 1);
    r = r && consumeToken(b, GENERICS);
    exit_section_(b, m, null, r);
    return r;
  }

  // GENERICS*
  private static boolean qualifiedName_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_2_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, GENERICS)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_2_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean qualifiedName_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','*
  private static boolean qualifiedName_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean qualifiedName_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_2_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_2_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER*
  private static boolean qualifiedName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (initialDeclaration)|(BLOCK_COMMENT)*|  (TEXT) | (RYTHM)| (GENERICS?)
  static boolean rythmFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rythmFile_0(b, l + 1);
    if (!r) r = rythmFile_1(b, l + 1);
    if (!r) r = consumeToken(b, TEXT);
    if (!r) r = rythmFile_3(b, l + 1);
    if (!r) r = rythmFile_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (initialDeclaration)
  private static boolean rythmFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initialDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BLOCK_COMMENT)*
  private static boolean rythmFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, BLOCK_COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "rythmFile_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (RYTHM)
  private static boolean rythmFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RYTHM(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // GENERICS?
  private static boolean rythmFile_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythmFile_4")) return false;
    consumeToken(b, GENERICS);
    return true;
  }

  /* ********************************************************** */
  // RYTHM_KEY'('')''{'*
  public static boolean rythm_keyy(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_keyy")) return false;
    if (!nextTokenIs(b, RYTHM_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_KEY);
    r = r && consumeToken(b, LPAREN);
    r = r && consumeToken(b, RPAREN);
    r = r && rythm_keyy_3(b, l + 1);
    exit_section_(b, m, RYTHM_KEYY, r);
    return r;
  }

  // '{'*
  private static boolean rythm_keyy_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rythm_keyy_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LBRACE)) break;
      if (!empty_element_parsed_guard_(b, "rythm_keyy_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
