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
        } else if (t == AS) {
            r = AS(b, 0);
        } else if (t == AT) {
            r = AT(b, 0);
        } else if (t == BIT_AND) {
            r = BIT_AND(b, 0);
        } else if (t == BIT_NOT) {
            r = BIT_NOT(b, 0);
        } else if (t == BIT_OR) {
            r = BIT_OR(b, 0);
        } else if (t == BIT_XOR) {
            r = BIT_XOR(b, 0);
        } else if (t == CLASS_ATTR_END) {
            r = CLASS_ATTR_END(b, 0);
        } else if (t == CLASS_ATTR_START) {
            r = CLASS_ATTR_START(b, 0);
        } else if (t == CMP) {
            r = CMP(b, 0);
        } else if (t == COLON) {
            r = COLON(b, 0);
        } else if (t == COMMA) {
            r = COMMA(b, 0);
        } else if (t == DIGITS) {
            r = DIGITS(b, 0);
        } else if (t == DIV) {
            r = DIV(b, 0);
        } else if (t == DIV_EQ) {
            r = DIV_EQ(b, 0);
        } else if (t == DOT) {
            r = DOT(b, 0);
        } else if (t == DOUBLE_COLON) {
            r = DOUBLE_COLON(b, 0);
        } else if (t == EQ) {
            r = EQ(b, 0);
        } else if (t == EQ_EQ) {
            r = EQ_EQ(b, 0);
        } else if (t == GREATER) {
            r = GREATER(b, 0);
        } else if (t == GREATER_OR_EQ) {
            r = GREATER_OR_EQ(b, 0);
        } else if (t == HASHTAG) {
            r = HASHTAG(b, 0);
        } else if (t == KONSONANTEN) {
            r = KONSONANTEN(b, 0);
        } else if (t == LBRACE) {
            r = LBRACE(b, 0);
        } else if (t == LBRACKET) {
            r = LBRACKET(b, 0);
        } else if (t == LESS) {
            r = LESS(b, 0);
        } else if (t == LESS_OR_EQ) {
            r = LESS_OR_EQ(b, 0);
        } else if (t == LPAREN) {
            r = LPAREN(b, 0);
        } else if (t == MINUS) {
            r = MINUS(b, 0);
        } else if (t == MINUS_EQ) {
            r = MINUS_EQ(b, 0);
        } else if (t == MINUS_MINUS) {
            r = MINUS_MINUS(b, 0);
        } else if (t == MUL) {
            r = MUL(b, 0);
        } else if (t == MULTI_ARGS) {
            r = MULTI_ARGS(b, 0);
        } else if (t == MUL_EQ) {
            r = MUL_EQ(b, 0);
        } else if (t == NOT) {
            r = NOT(b, 0);
        } else if (t == NOT_EQ) {
            r = NOT_EQ(b, 0);
        } else if (t == OR_OR) {
            r = OR_OR(b, 0);
        } else if (t == PLUS) {
            r = PLUS(b, 0);
        } else if (t == PLUS_EQ) {
            r = PLUS_EQ(b, 0);
        } else if (t == PLUS_PLUS) {
            r = PLUS_PLUS(b, 0);
        } else if (t == QM) {
            r = QM(b, 0);
        } else if (t == QUESTION) {
            r = QUESTION(b, 0);
        } else if (t == RBRACE) {
            r = RBRACE(b, 0);
        } else if (t == RBRACKET) {
            r = RBRACKET(b, 0);
        } else if (t == REMAINDER) {
            r = REMAINDER(b, 0);
        } else if (t == REMAINDER_EQ) {
            r = REMAINDER_EQ(b, 0);
        } else if (t == RPAREN) {
            r = RPAREN(b, 0);
        } else if (t == SEMICOLON) {
            r = SEMICOLON(b, 0);
        } else if (t == SEND_CHANNEL) {
            r = SEND_CHANNEL(b, 0);
        } else if (t == SHIFT_LEFT) {
            r = SHIFT_LEFT(b, 0);
        } else if (t == SHIFT_RIGHT) {
            r = SHIFT_RIGHT(b, 0);
        } else if (t == UNSIGNED_SHIFT_RIGHT) {
            r = UNSIGNED_SHIFT_RIGHT(b, 0);
        } else if (t == VOKALE) {
            r = VOKALE(b, 0);
        } else if (t == PROPERTY) {
            r = property(b, 0);
        } else if (t == TOKENS) {
            r = tokens(b, 0);
        } else {
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
    // '1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'|'0'
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
    // 'b'|'c'|'d'|'f'|'g'|'h'|'j'|'k'|'l'|'m'|'n'|'p'|'q'|'r'|'s'|'t'|'v'|'w'|'x'|'y'|'z'
    public static boolean KONSONANTEN(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "KONSONANTEN")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, KONSONANTEN, "<konsonanten>");
        r = consumeToken(b, "b");
        if (!r) r = consumeToken(b, "c");
        if (!r) r = consumeToken(b, "d");
        if (!r) r = consumeToken(b, "f");
        if (!r) r = consumeToken(b, "g");
        if (!r) r = consumeToken(b, "h");
        if (!r) r = consumeToken(b, "j");
        if (!r) r = consumeToken(b, "k");
        if (!r) r = consumeToken(b, "l");
        if (!r) r = consumeToken(b, "m");
        if (!r) r = consumeToken(b, "n");
        if (!r) r = consumeToken(b, "p");
        if (!r) r = consumeToken(b, "q");
        if (!r) r = consumeToken(b, "r");
        if (!r) r = consumeToken(b, "s");
        if (!r) r = consumeToken(b, "t");
        if (!r) r = consumeToken(b, "v");
        if (!r) r = consumeToken(b, "w");
        if (!r) r = consumeToken(b, "x");
        if (!r) r = consumeToken(b, "y");
        if (!r) r = consumeToken(b, "z");
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
    // 'a'|'e'|'i'|'o'|'u'
    public static boolean VOKALE(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "VOKALE")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, VOKALE, "<vokale>");
        r = consumeToken(b, "a");
        if (!r) r = consumeToken(b, "e");
        if (!r) r = consumeToken(b, "i");
        if (!r) r = consumeToken(b, "o");
        if (!r) r = consumeToken(b, "u");
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // property|COMMENT|CRLF|tokens/*|HTML_PART|JS_PART*/|RYTHM_KEY|RYTHM_I_18_N|SCRIPT|RYTHM_METHOD
    static boolean item_(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "item_")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = property(b, l + 1);
        if (!r) r = consumeToken(b, COMMENT);
        if (!r) r = consumeToken(b, CRLF);
        if (!r) r = tokens(b, l + 1);
        if (!r) r = consumeToken(b, RYTHM_KEY);
        if (!r) r = consumeToken(b, RYTHM_I_18_N);
        if (!r) r = consumeToken(b, SCRIPT);
        if (!r) r = consumeToken(b, RYTHM_METHOD);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // RYTHM_ARGS| SEPARATOR|RYTHM_SECTION|RYTHM_EXTENDS|RYTHM_IMPORT|RYTHM_RENDER|RYTHM_INVOKE|RYTHM_ELSE|RYTHM_IF
    // |RYTHM_FOR|RYTHM_PREFIX|RYTHM_NAVBOX|RYTHM| RYTHM_SYN|RYTHM_PART
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
        if (!r) r = consumeToken(b, RYTHM_NAVBOX);
        if (!r) r = consumeToken(b, RYTHM);
        if (!r) r = consumeToken(b, RYTHM_SYN);
        if (!r) r = consumeToken(b, RYTHM_PART);
        exit_section_(b, l, m, r, false, null);
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
    // LESS|GREATER|PLUS|MINUS|MUL|DIV|REMAINDER|QUESTION|AT|DOT|VOKALE|KONSONANTEN|DIGITS|QM|AS|HASHTAG
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
        if (!r) r = LESS(b, l + 1);
        if (!r) r = GREATER(b, l + 1);
        if (!r) r = PLUS(b, l + 1);
        if (!r) r = MINUS(b, l + 1);
        if (!r) r = MUL(b, l + 1);
        if (!r) r = DIV(b, l + 1);
        if (!r) r = REMAINDER(b, l + 1);
        if (!r) r = QUESTION(b, l + 1);
        if (!r) r = AT(b, l + 1);
        if (!r) r = DOT(b, l + 1);
        if (!r) r = VOKALE(b, l + 1);
        if (!r) r = KONSONANTEN(b, l + 1);
        if (!r) r = DIGITS(b, l + 1);
        if (!r) r = QM(b, l + 1);
        if (!r) r = AS(b, l + 1);
        if (!r) r = HASHTAG(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

}
