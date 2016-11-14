package com.rythmplugin.ide.highlighter;

import com.intellij.ide.highlighter.JavaHighlightingColors;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.options.colors.pages.ANSIColoredConsoleColorsPage;
import com.intellij.openapi.options.colors.pages.DefaultLanguageColorsPage;
import com.intellij.openapi.options.colors.pages.HTMLColorsPage;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.lexer.RythmLexerAdapter;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


/**
 * Created by mpl on 05.08.2016.
 */
public class RythmSyntaxHighlighter extends SyntaxHighlighterBase {


    public static final TextAttributesKey RYTHM_ARGS = createTextAttributesKey("RYTHM_ARGS", JavaHighlightingColors.CLASS_NAME_ATTRIBUTES);
    public static final TextAttributesKey RYTHM_SECTION = createTextAttributesKey("RYTHM_SECTION", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_EXTENDS = createTextAttributesKey("RYTHM_EXTENDS", JavaHighlightingColors.CLASS_NAME_ATTRIBUTES);
    public static final TextAttributesKey RYTHM_IMPORT = createTextAttributesKey("RYTHM_IMPORT", JavaHighlightingColors.CLASS_NAME_ATTRIBUTES);
    public static final TextAttributesKey RYTHM_RENDER = createTextAttributesKey("RYTHM_RENDER", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_IF = createTextAttributesKey("RYTHM_IF", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_FOR = createTextAttributesKey("RYTHM_FOR", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_PREFIX = createTextAttributesKey("RYTHM_PREFIX", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_INVOKE = createTextAttributesKey("RYTHM_INVOKE", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_METHOD = createTextAttributesKey("RYTHM_METHOD", JavaHighlightingColors.METHOD_CALL_ATTRIBUTES);
    public static final TextAttributesKey RYTHM_KEY = createTextAttributesKey("RYTHM_KEY", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_I18N = createTextAttributesKey("RYTHM_I18N", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("BLOCK_COMMENT", JavaHighlightingColors.JAVA_BLOCK_COMMENT);
    public static final TextAttributesKey RYTHM_ELSE = createTextAttributesKey("RYTHM_ELSE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STATEMENT = createTextAttributesKey("STATEMENT", JavaHighlightingColors.CLASS_NAME_ATTRIBUTES);
    public static final TextAttributesKey RYTHM_ESCAPED = createTextAttributesKey("RYTHM_ESCAPED", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey VAR = createTextAttributesKey("VAR,", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FUNCTION = createTextAttributesKey("FUNCTION", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey THIS = createTextAttributesKey("THIS", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NEW = createTextAttributesKey("NEW", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DIGIT = createTextAttributesKey("DIGIT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey SEMICOLON = createTextAttributesKey("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey COMMA = createTextAttributesKey("COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey Q_RYTHM = createTextAttributesKey("Q_RYTHM", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey STRING_LITERAL = createTextAttributesKey("STRING_LITERAL", DefaultLanguageHighlighterColors.STRING);


    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] RYTHM_ARGS_KEYS = new TextAttributesKey[]{RYTHM_ARGS};
    private static final TextAttributesKey[] RYTHM_SECTION_KEYS = new TextAttributesKey[]{RYTHM_SECTION};
    private static final TextAttributesKey[] RYTHM_EXTENDS_KEYS = new TextAttributesKey[]{RYTHM_EXTENDS};
    private static final TextAttributesKey[] RYTHM_IMPORT_KEYS = new TextAttributesKey[]{RYTHM_IMPORT};
    private static final TextAttributesKey[] RYTHM_RENDER_KEYS = new TextAttributesKey[]{RYTHM_RENDER};
    private static final TextAttributesKey[] RYTHM_IF_KEYS = new TextAttributesKey[]{RYTHM_IF};
    private static final TextAttributesKey[] RYTHM_FOR_KEYS = new TextAttributesKey[]{RYTHM_FOR};
    private static final TextAttributesKey[] RYTHM_PREFIX_KEYS = new TextAttributesKey[]{RYTHM_PREFIX};
    private static final TextAttributesKey[] RYTHM_INVOKE_KEYS = new TextAttributesKey[]{RYTHM_INVOKE};
    private static final TextAttributesKey[] RYTHM_METHOD_KEYS = new TextAttributesKey[]{RYTHM_METHOD};
    private static final TextAttributesKey[] RYTHM_KEY_KEYS = new TextAttributesKey[]{RYTHM_KEY};
    private static final TextAttributesKey[] RYTHM_I18N_KEYS = new TextAttributesKey[]{RYTHM_I18N};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] RYTHM_ELSE_KEYS = new TextAttributesKey[]{RYTHM_ELSE};
    private static final TextAttributesKey[] STATEMENT_KEYS = new TextAttributesKey[]{STATEMENT};
    private static final TextAttributesKey[] RYTHM_ESCAPED_KEYS = new TextAttributesKey[]{RYTHM_ESCAPED};
    private static final TextAttributesKey[] VAR_KEYS = new TextAttributesKey[]{VAR};
    private static final TextAttributesKey[] FUNCTION_KEYS = new TextAttributesKey[]{FUNCTION};
    private static final TextAttributesKey[] THIS_KEYS = new TextAttributesKey[]{THIS};
    private static final TextAttributesKey[] NEW_KEYS = new TextAttributesKey[]{NEW};
    private static final TextAttributesKey[] DIGIT_KEYS = new TextAttributesKey[]{DIGIT};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] Q_RYTHM_KEYS = new TextAttributesKey[]{Q_RYTHM};
    private static final TextAttributesKey[] STRING_LITERAL_KEYS = new TextAttributesKey[]{STRING_LITERAL};

    @NotNull
    @Override

    public Lexer getHighlightingLexer() {
        return new RythmLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {

        if (tokenType.equals(RythmTypes.RYTHM_ARGS)) {
            return RYTHM_ARGS_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_EXTENDS)) {
            return RYTHM_EXTENDS_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_SECTION)) {
            return RYTHM_SECTION_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_IMPORT)) {
            return RYTHM_IMPORT_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_INVOKE)) {
            return RYTHM_INVOKE_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_RENDER)) {
            return RYTHM_RENDER_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_IF)) {
            return RYTHM_IF_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_FOR)) {
            return RYTHM_FOR_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_PREFIX)) {
            return RYTHM_PREFIX_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_I_18_N)) {
            return RYTHM_I18N_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_KEY)) {
            return RYTHM_KEY_KEYS;
        } else if (tokenType.equals(RythmTypes.BLOCK_COMMENT)) {
            return BLOCK_COMMENT_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_ESCAPED)) {
            return RYTHM_ESCAPED_KEYS;
        } else if (tokenType.equals(RythmTypes.VAR)) {
            return VAR_KEYS;
        } else if (tokenType.equals(RythmTypes.FUNCTION)) {
            return FUNCTION_KEYS;
        } else if (tokenType.equals(RythmTypes.THIS)) {
            return THIS_KEYS;
        } else if (tokenType.equals(RythmTypes.NEW)) {
            return NEW_KEYS;
        } else if (tokenType.equals(RythmTypes.DIGIT)) {
            return DIGIT_KEYS;
        } else if (tokenType.equals(RythmTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        } else if (tokenType.equals(RythmTypes.COMMA)) {
            return COMMA_KEYS;
        } else if (tokenType.equals(RythmTypes.Q_RYTHM)) {
            return Q_RYTHM_KEYS;
        } else if (tokenType.equals(RythmTypes.STRING_LITERAL)) {
            return STRING_LITERAL_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
