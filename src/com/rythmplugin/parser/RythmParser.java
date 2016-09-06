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
    else if (t == ADDITIVE_EXPR) {
      r = AdditiveExpr(b, 0);
    }
    else if (t == AND_EXPR) {
      r = AndExpr(b, 0);
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
    else if (t == CALL_EXPR) {
      r = CallExpr(b, 0);
    }
    else if (t == CONDITIONAL_EXPR) {
      r = ConditionalExpr(b, 0);
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
    else if (t == ELSE_IF_STATEMENT) {
      r = ElseIfStatement(b, 0);
    }
    else if (t == ELSE_STATEMENT) {
      r = ElseStatement(b, 0);
    }
    else if (t == END_STATEMENT) {
      r = EndStatement(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == EXTENDS_STATEMENT) {
      r = ExtendsStatement(b, 0);
    }
    else if (t == FIELD_CHAIN) {
      r = FieldChain(b, 0);
    }
    else if (t == FIELD_CHAIN_EXPR) {
      r = FieldChainExpr(b, 0);
    }
    else if (t == FIELD_EXPR) {
      r = FieldExpr(b, 0);
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
    else if (t == IDENTIFIER_EXPR) {
      r = IdentifierExpr(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == IMPORT_STATEMENT) {
      r = ImportStatement(b, 0);
    }
    else if (t == INDEX_EXPR) {
      r = IndexExpr(b, 0);
    }
    else if (t == ISSET_EXPR) {
      r = IssetExpr(b, 0);
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
    else if (t == MULTIPLICATIVE_EXPR) {
      r = MultiplicativeExpr(b, 0);
    }
    else if (t == NOT) {
      r = NOT(b, 0);
    }
    else if (t == NOT_EQ) {
      r = NOT_EQ(b, 0);
    }
    else if (t == NOT_EXPR) {
      r = NotExpr(b, 0);
    }
    else if (t == NUMBER_EXPR) {
      r = NumberExpr(b, 0);
    }
    else if (t == OR_OR) {
      r = OR_OR(b, 0);
    }
    else if (t == OR_EXPR) {
      r = OrExpr(b, 0);
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
    else if (t == PARENTHESES_EXPR) {
      r = ParenthesesExpr(b, 0);
    }
    else if (t == PIPE) {
      r = Pipe(b, 0);
    }
    else if (t == PIPELINE) {
      r = Pipeline(b, 0);
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
    else if (t == SLICE_EXPR) {
      r = SliceExpr(b, 0);
    }
    else if (t == STATEMENT_LIST) {
      r = StatementList(b, 0);
    }
    else if (t == STATEMENTS) {
      r = Statements(b, 0);
    }
    else if (t == STRING_EXPR) {
      r = StringExpr(b, 0);
    }
    else if (t == TERNARY_EXPR) {
      r = TernaryExpr(b, 0);
    }
    else if (t == UNSIGNED_SHIFT_RIGHT) {
      r = UNSIGNED_SHIFT_RIGHT(b, 0);
    }
    else if (t == WS) {
      r = WS(b, 0);
    }
    else if (t == PROPERTY) {
      r = property(b, 0);
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
  // Expression add_op Expression
  public static boolean AdditiveExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdditiveExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXPR, "<additive expr>");
    r = Expression(b, l + 1);
    r = r && add_op(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression '&&' Expression
  public static boolean AndExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPR, "<and expr>");
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "&&");
    r = r && Expression(b, l + 1);
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
  // Expression '(' expression_list')'
  public static boolean CallExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CALL_EXPR, "<call expr>");
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "(");
    p = r; // pin = 2
    r = r && report_error_(b, expression_list(b, l + 1));
    r = p && consumeToken(b, ")") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Expression rel_op Expression
  public static boolean ConditionalExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXPR, "<conditional expr>");
    r = Expression(b, l + 1);
    r = r && rel_op(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // 'else' 'if' (set_declaration ';')? Pipeline  StatementList (EndStatement|ElseIfStatement|ElseStatement)
  public static boolean ElseIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_IF_STATEMENT, "<else if statement>");
    r = consumeToken(b, "else");
    r = r && consumeToken(b, "if");
    r = r && ElseIfStatement_2(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, Pipeline(b, l + 1));
    r = p && report_error_(b, StatementList(b, l + 1)) && r;
    r = p && ElseIfStatement_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (set_declaration ';')?
  private static boolean ElseIfStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_2")) return false;
    ElseIfStatement_2_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean ElseIfStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // EndStatement|ElseIfStatement|ElseStatement
  private static boolean ElseIfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EndStatement(b, l + 1);
    if (!r) r = ElseIfStatement(b, l + 1);
    if (!r) r = ElseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'else'  StatementList EndStatement
  public static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE_STATEMENT, "<else statement>");
    r = consumeToken(b, "else");
    r = r && StatementList(b, l + 1);
    r = r && EndStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'end'
  public static boolean EndStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, END_STATEMENT, "<end statement>");
    r = consumeToken(b, "end");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OrExpr
  //                     | AndExpr
  //                     | ConditionalExpr
  //                     | MultiplicativeExpr
  //                     | AdditiveExpr
  //                     | CallExpr
  //                     | SliceExpr
  //                     | IndexExpr
  //                     | NotExpr
  //                     | TernaryExpr
  //                     | IssetExpr
  //                     | FieldGroup
  //                     | PrimaryGroup
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = OrExpr(b, l + 1);
    if (!r) r = AndExpr(b, l + 1);
    if (!r) r = ConditionalExpr(b, l + 1);
    if (!r) r = MultiplicativeExpr(b, l + 1);
    if (!r) r = AdditiveExpr(b, l + 1);
    if (!r) r = CallExpr(b, l + 1);
    if (!r) r = SliceExpr(b, l + 1);
    if (!r) r = IndexExpr(b, l + 1);
    if (!r) r = NotExpr(b, l + 1);
    if (!r) r = TernaryExpr(b, l + 1);
    if (!r) r = IssetExpr(b, l + 1);
    if (!r) r = FieldGroup(b, l + 1);
    if (!r) r = PrimaryGroup(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_EXTENDS
  public static boolean ExtendsStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendsStatement")) return false;
    if (!nextTokenIs(b, RYTHM_EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_EXTENDS);
    exit_section_(b, m, EXTENDS_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // '.' IDENT FieldChain?
  public static boolean FieldChain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldChain")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_CHAIN, "<field chain>");
    r = consumeToken(b, ".");
    r = r && consumeToken(b, IDENT);
    r = r && FieldChain_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FieldChain?
  private static boolean FieldChain_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldChain_2")) return false;
    FieldChain(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression FieldChain
  public static boolean FieldChainExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldChainExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_CHAIN_EXPR, "<field chain expr>");
    r = Expression(b, l + 1);
    r = r && FieldChain(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FieldChain
  public static boolean FieldExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_EXPR, "<field expr>");
    r = FieldChain(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FieldExpr   | FieldChainExpr
  static boolean FieldGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldGroup")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldExpr(b, l + 1);
    if (!r) r = FieldChainExpr(b, l + 1);
    exit_section_(b, m, null, r);
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
  // IDENT | '.'
  public static boolean IdentifierExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_EXPR, "<identifier expr>");
    r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, ".");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'if' (set_declaration ';')? Pipeline  StatementList (EndStatement|ElseIfStatement|ElseStatement)
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = consumeToken(b, "if");
    r = r && IfStatement_1(b, l + 1);
    r = r && Pipeline(b, l + 1);
    r = r && StatementList(b, l + 1);
    r = r && IfStatement_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (set_declaration ';')?
  private static boolean IfStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_1")) return false;
    IfStatement_1_0(b, l + 1);
    return true;
  }

  // set_declaration ';'
  private static boolean IfStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // EndStatement|ElseIfStatement|ElseStatement
  private static boolean IfStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EndStatement(b, l + 1);
    if (!r) r = ElseIfStatement(b, l + 1);
    if (!r) r = ElseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_IMPORT
  public static boolean ImportStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportStatement")) return false;
    if (!nextTokenIs(b, RYTHM_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RYTHM_IMPORT);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression '[' Expression ']'
  public static boolean IndexExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INDEX_EXPR, "<index expr>");
    r = Expression(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, "["));
    r = p && report_error_(b, Expression(b, l + 1)) && r;
    r = p && consumeToken(b, "]") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'isset' '(' expression_list ')'
  public static boolean IssetExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IssetExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ISSET_EXPR, "<isset expr>");
    r = consumeToken(b, "isset");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, "("));
    r = p && report_error_(b, expression_list(b, l + 1)) && r;
    r = p && consumeToken(b, ")") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // Expression mul_op Expression
  public static boolean MultiplicativeExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplicativeExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_EXPR, "<multiplicative expr>");
    r = Expression(b, l + 1);
    r = r && mul_op(b, l + 1);
    r = r && Expression(b, l + 1);
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
  // '!' Expression
  public static boolean NotExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NotExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NOT_EXPR, "<not expr>");
    r = consumeToken(b, "!");
    p = r; // pin = 1
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean NumberExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberExpr")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, NUMBER_EXPR, r);
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
  // Expression '||' Expression
  public static boolean OrExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_EXPR, "<or expr>");
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "||");
    r = r && Expression(b, l + 1);
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
  // '(' Pipeline ')'
  public static boolean ParenthesesExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesesExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARENTHESES_EXPR, "<parentheses expr>");
    r = consumeToken(b, "(");
    p = r; // pin = 1
    r = r && report_error_(b, Pipeline(b, l + 1));
    r = p && consumeToken(b, ")") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '|' Expression (':' expression_list)? Pipe?
  public static boolean Pipe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PIPE, "<pipe>");
    r = consumeToken(b, "|");
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, Pipe_2(b, l + 1)) && r;
    r = p && Pipe_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (':' expression_list)?
  private static boolean Pipe_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe_2")) return false;
    Pipe_2_0(b, l + 1);
    return true;
  }

  // ':' expression_list
  private static boolean Pipe_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && expression_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pipe?
  private static boolean Pipe_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipe_3")) return false;
    Pipe(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression (':' expression_list)?  Pipe?
  public static boolean Pipeline(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PIPELINE, "<pipeline>");
    r = Expression(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, Pipeline_1(b, l + 1));
    r = p && Pipeline_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (':' expression_list)?
  private static boolean Pipeline_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline_1")) return false;
    Pipeline_1_0(b, l + 1);
    return true;
  }

  // ':' expression_list
  private static boolean Pipeline_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && expression_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pipe?
  private static boolean Pipeline_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pipeline_2")) return false;
    Pipe(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NumberExpr  | IdentifierExpr | StringExpr | ParenthesesExpr
  static boolean PrimaryGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryGroup")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NumberExpr(b, l + 1);
    if (!r) r = IdentifierExpr(b, l + 1);
    if (!r) r = StringExpr(b, l + 1);
    if (!r) r = ParenthesesExpr(b, l + 1);
    exit_section_(b, m, null, r);
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
  // Expression '[' Expression? ':' Expression? ']'
  public static boolean SliceExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLICE_EXPR, "<slice expr>");
    r = Expression(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, "["));
    r = p && report_error_(b, SliceExpr_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, ":")) && r;
    r = p && report_error_(b, SliceExpr_4(b, l + 1)) && r;
    r = p && consumeToken(b, "]") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Expression?
  private static boolean SliceExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpr_2")) return false;
    Expression(b, l + 1);
    return true;
  }

  // Expression?
  private static boolean SliceExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpr_4")) return false;
    Expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( TEXT+ | IfStatement)*
  public static boolean StatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST, "<statement list>");
    int c = current_position_(b);
    while (true) {
      if (!StatementList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // TEXT+ | IfStatement
  private static boolean StatementList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StatementList_0_0(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEXT+
  private static boolean StatementList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, TEXT)) break;
      if (!empty_element_parsed_guard_(b, "StatementList_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ExtendsStatement? ImportStatement*  StatementList
  public static boolean Statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENTS, "<statements>");
    r = Statements_0(b, l + 1);
    r = r && Statements_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ExtendsStatement?
  private static boolean Statements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statements_0")) return false;
    ExtendsStatement(b, l + 1);
    return true;
  }

  // ImportStatement*
  private static boolean Statements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statements_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ImportStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Statements_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RAW_STRING|STRING
  public static boolean StringExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringExpr")) return false;
    if (!nextTokenIs(b, "<string expr>", RAW_STRING, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_EXPR, "<string expr>");
    r = consumeToken(b, RAW_STRING);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression '?' (Expression) ':' Expression
  public static boolean TernaryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TERNARY_EXPR, "<ternary expr>");
    r = Expression(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, "?"));
    r = p && report_error_(b, TernaryExpr_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, ":")) && r;
    r = p && Expression(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (Expression)
  private static boolean TernaryExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // '+' | '-'
  static boolean add_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_op")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' | ':='
  static boolean assign_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_op")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, ":=");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Expression (',' Expression)*)?
  static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    expression_list_0(b, l + 1);
    return true;
  }

  // Expression (',' Expression)*
  private static boolean expression_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && expression_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Expression)*
  private static boolean expression_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Expression
  private static boolean expression_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FieldChainExpr|IdentifierExpr
  static boolean fieldOrID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldOrID")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldChainExpr(b, l + 1);
    if (!r) r = IdentifierExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF|RYTHM_KEY|RYTHM_I_18_N|SCRIPT|RYTHM_METHOD|HTML|tokens|LETTER
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    if (!r) r = COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, RYTHM_KEY);
    if (!r) r = consumeToken(b, RYTHM_I_18_N);
    if (!r) r = consumeToken(b, SCRIPT);
    if (!r) r = consumeToken(b, RYTHM_METHOD);
    if (!r) r = consumeToken(b, HTML);
    if (!r) r = tokens(b, l + 1);
    if (!r) r = LETTER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '*' | '%' | '/'
  static boolean mul_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_op")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "/");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RYTHM_ARGS| SEPARATOR|RYTHM_SECTION|RYTHM_EXTENDS|RYTHM_IMPORT|RYTHM_RENDER|RYTHM_INVOKE|RYTHM_ELSE|RYTHM_IF
  // |RYTHM_FOR|RYTHM_PREFIX|RYTHM_KEY|Statements|RYTHM
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = consumeToken(b, RYTHM_ARGS);
    if (!r) r = consumeToken(b, SEPARATOR);
    if (!r) r = consumeToken(b, RYTHM_SECTION);
    if (!r) r = consumeToken(b, RYTHM_EXTENDS);
    if (!r) r = consumeToken(b, RYTHM_IMPORT);
    if (!r) r = consumeToken(b, RYTHM_RENDER);
    if (!r) r = consumeToken(b, RYTHM_INVOKE);
    if (!r) r = consumeToken(b, RYTHM_ELSE);
    if (!r) r = consumeToken(b, RYTHM_IF);
    if (!r) r = consumeToken(b, RYTHM_FOR);
    if (!r) r = consumeToken(b, RYTHM_PREFIX);
    if (!r) r = consumeToken(b, RYTHM_KEY);
    if (!r) r = Statements(b, l + 1);
    if (!r) r = consumeToken(b, RYTHM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '==' | '!=' | '<' | '<=' | '>' | '>='
  static boolean rel_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rel_op")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "!=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, ">=");
    exit_section_(b, m, null, r);
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
  // (fieldOrID (',' fieldOrID)*)  assign_op Pipeline (',' Pipeline)*
  static boolean set_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_declaration_0(b, l + 1);
    r = r && assign_op(b, l + 1);
    r = r && Pipeline(b, l + 1);
    r = r && set_declaration_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fieldOrID (',' fieldOrID)*
  private static boolean set_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fieldOrID(b, l + 1);
    r = r && set_declaration_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' fieldOrID)*
  private static boolean set_declaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!set_declaration_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "set_declaration_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' fieldOrID
  private static boolean set_declaration_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && fieldOrID(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Pipeline)*
  private static boolean set_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!set_declaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "set_declaration_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Pipeline
  private static boolean set_declaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_declaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Pipeline(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RBRACE|RBRACKET|RPAREN|PLUS_PLUS|MINUS_MINUS|LBRACE|LBRACKET|LPAREN|DOUBLE_COLON|
  // COLON|SEMICOLON|COMMA|MULTI_ARGS|CLASS_ATTR_END|CLASS_ATTR_START|SHIFT_LEFT|SHIFT_RIGHT
  // |UNSIGNED_SHIFT_RIGHT|CMP|EQ_EQ|NOT_EQ|LESS_OR_EQ|GREATER_OR_EQ|SEND_CHANNEL|PLUS_EQ|
  // MINUS_EQ|MUL_EQ| DIV_EQ| REMAINDER_EQ|OR_OR|AND_AND|EQ|NOT|BIT_NOT|BIT_OR|BIT_AND|
  // PLUS|MINUS|MUL|DIV|REMAINDER|QUESTION|AT|DOT|LETTER|DIGITS|QM|AS|HASHTAG|WS
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
    if (!r) r = DOT(b, l + 1);
    if (!r) r = LETTER(b, l + 1);
    if (!r) r = DIGITS(b, l + 1);
    if (!r) r = QM(b, l + 1);
    if (!r) r = AS(b, l + 1);
    if (!r) r = HASHTAG(b, l + 1);
    if (!r) r = WS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
