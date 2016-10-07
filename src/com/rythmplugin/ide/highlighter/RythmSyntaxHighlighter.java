package com.rythmplugin.ide.highlighter;

import com.intellij.ide.highlighter.JavaHighlightingColors;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.lexer.RythmLexerAdapter;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


/**
 * Created by mpl on 05.08.2016.
 */
public class RythmSyntaxHighlighter extends SyntaxHighlighterBase {


    public static final TextAttributesKey RYTHM_ARGS = createTextAttributesKey("RYTHM_ARGS", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_SECTION = createTextAttributesKey("RYTHM_SECTION", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_EXTENDS = createTextAttributesKey("RYTHM_EXTENDS", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_IMPORT = createTextAttributesKey("RYTHM_IMPORT", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_RENDER = createTextAttributesKey("RYTHM_RENDER", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_IF = createTextAttributesKey("RYTHM_IF", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_FOR = createTextAttributesKey("RYTHM_FOR", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_PREFIX = createTextAttributesKey("RYTHM_PREFIX", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_INVOKE = createTextAttributesKey("RYTHM_INVOKE", JavaHighlightingColors.KEYWORD);
    //public static final TextAttributesKey RYTHM_METHOD = createTextAttributesKey("RYTHM_METHOD", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_KEY = createTextAttributesKey("RYTHM_KEY", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_I_18_N = createTextAttributesKey("RYTHM_I_18_N", JavaHighlightingColors.KEYWORD);
    public static final TextAttributesKey RYTHM_COMMENT = createTextAttributesKey("RYTHM_COMMENT", JavaHighlightingColors.JAVA_BLOCK_COMMENT);
    //public static final TextAttributesKey RYTHM_SECTION_PARAM = createTextAttributesKey("RYTHM_SECTION_PARAM", DefaultLanguageHighlighterColors.KEYWORD);
    //public static final TextAttributesKey RYTHM_PARAM = createTextAttributesKey("RYTHM_PARAM", JavaHighlightingColors.ANNOTATION_NAME_ATTRIBUTES);
    public static final TextAttributesKey FUNCTION = createTextAttributesKey("FUNCTION", DefaultLanguageHighlighterColors.KEYWORD);


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
    //private static final TextAttributesKey[] RYTHM_METHOD_KEYS = new TextAttributesKey[]{RYTHM_METHOD};
    private static final TextAttributesKey[] RYTHM_KEY_KEYS = new TextAttributesKey[]{RYTHM_KEY};
    private static final TextAttributesKey[] RYTHM_I_18_N_KEYS = new TextAttributesKey[]{RYTHM_I_18_N};
    private static final TextAttributesKey[] RYTHM_COMMENT_KEYS = new TextAttributesKey[]{RYTHM_COMMENT};
    //private static final TextAttributesKey[] RYTHM_SECTION_PARAM_KEYS = new TextAttributesKey[]{RYTHM_SECTION_PARAM};
    //private static final TextAttributesKey[] RYTHM_PARAM_KEYS = new TextAttributesKey[]{RYTHM_PARAM};
    private static final TextAttributesKey[] FUNCTION_KEYS = new TextAttributesKey[]{FUNCTION};


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
        } else if (tokenType.equals(RythmTypes.RYTHM_I_18_N)) {
            return RYTHM_I_18_N_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_PREFIX)) {
            return RYTHM_PREFIX_KEYS;
        } else /*if (tokenType.equals(RythmTypes.RYTHM_METHOD)) {
            return RYTHM_METHOD_KEYS;
        } else */if (tokenType.equals(RythmTypes.RYTHM_KEY)) {
            return RYTHM_KEY_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_COMMENT)) {
            return RYTHM_COMMENT_KEYS;
        } else if( tokenType.equals(RythmTypes.FUNCTION)){
            return FUNCTION_KEYS;
        }/*if (tokenType.equals(RythmTypes.PARAM)) {
            return RYTHM_PARAM_KEYS;
        } else */{
            return EMPTY_KEYS;
        }
    }
}
