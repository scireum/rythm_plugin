package com.rythmplugin.highlighter;

//<<<<<<< Updated upstream
//import com.intellij.lang.html.HTMLParser;
//=======
//>>>>>>> Stashed changes

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
//<<<<<<< Updated upstream
//import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.RythmLexerAdapter;
//=======
//>>>>>>> Stashed changes
import com.rythmplugin.psi.RythmTypes;
import com.sun.istack.internal.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


/**
 * Created by mpl on 05.08.2016.
 */
public class RythmSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("RYTHM_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY = createTextAttributesKey("RYTHM_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE = createTextAttributesKey("RYTHM_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("RYTHM", DefaultLanguageHighlighterColors.LINE_COMMENT);
    // public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("RYTHM_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey RYTHM_ARGS = createTextAttributesKey("RYTHM_ARGS", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_SECTION = createTextAttributesKey("RYTHM_SECTION", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_EXTENDS = createTextAttributesKey("RYTHM_EXTENDS", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_IMPORT = createTextAttributesKey("RYTHM_IMPORT", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_RENDER = createTextAttributesKey("RYTHM_RENDER", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_ELSE = createTextAttributesKey("RYTHM_ELSE", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_IF = createTextAttributesKey("RYTHM_IF", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_FOR = createTextAttributesKey("RYTHM_FOR", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_I18N = createTextAttributesKey("RYTHM_I18N", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_PREFIX = createTextAttributesKey("RYTHM_PREFIX", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_NAVBOX = createTextAttributesKey("RYTHM_NAVBOX", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_INVOKE = createTextAttributesKey("RYTHM_INVOKE", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM = createTextAttributesKey("RYTHM", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_METHOD = createTextAttributesKey("RYTHM_METHOD", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_SYN = createTextAttributesKey("RYTHM_SYN", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_BLOCK = createTextAttributesKey("RYTHM_BLOCK", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_PART = createTextAttributesKey("RYTHM_PART", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_KEY = createTextAttributesKey("RYTHM_KEY", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_LOST = createTextAttributesKey("RYTHM_LOST", HighlighterColors.TEXT);
    public static final TextAttributesKey SCRIPT = createTextAttributesKey("SCRIPT", HighlighterColors.TEXT);
    public static final TextAttributesKey RYTHM_I_18_N = createTextAttributesKey("RYTHM_I_18_N", HighlighterColors.TEXT);


    //  public static final TextAttributesKey HTML_PART = createTextAttributesKey("RYTHM_HTML_PART", HighlighterColors.TEXT);
    //   public static final TextAttributesKey JS_PART = createTextAttributesKey("RYTHM_JS_PART", HighlighterColors.TEXT);


    //private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    // private static final TextAttributesKey[] KEYS_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private static final TextAttributesKey[] RYTHM_ARGS_KEYS = new TextAttributesKey[]{RYTHM_ARGS};
    private static final TextAttributesKey[] RYTHM_SECTION_KEYS = new TextAttributesKey[]{RYTHM_SECTION};
    private static final TextAttributesKey[] RYTHM_EXTENDS_KEYS = new TextAttributesKey[]{RYTHM_EXTENDS};
    private static final TextAttributesKey[] RYTHM_IMPORT_KEYS = new TextAttributesKey[]{RYTHM_IMPORT};
    private static final TextAttributesKey[] RYTHM_RENDER_KEYS = new TextAttributesKey[]{RYTHM_RENDER};
    private static final TextAttributesKey[] RYTHM_ELSE_KEYS = new TextAttributesKey[]{RYTHM_ELSE};
    private static final TextAttributesKey[] RYTHM_IF_KEYS = new TextAttributesKey[]{RYTHM_IF};
    private static final TextAttributesKey[] RYTHM_FOR_KEYS = new TextAttributesKey[]{RYTHM_FOR};
    private static final TextAttributesKey[] RYTHM_I18N_KEYS = new TextAttributesKey[]{RYTHM_I18N};
    private static final TextAttributesKey[] RYTHM_PREFIX_KEYS = new TextAttributesKey[]{RYTHM_PREFIX};
    private static final TextAttributesKey[] RYTHM_NABOX_KEYS = new TextAttributesKey[]{RYTHM_NAVBOX};
    private static final TextAttributesKey[] RYTHM_INVOKE_KEYS = new TextAttributesKey[]{RYTHM_INVOKE};
    private static final TextAttributesKey[] RYTHM_KEYS = new TextAttributesKey[]{RYTHM};
    private static final TextAttributesKey[] RYTHM_METHOD_KEYS = new TextAttributesKey[]{RYTHM_METHOD};
    private static final TextAttributesKey[] RYTHM_SYN_KEYS = new TextAttributesKey[]{RYTHM_SYN};
    private static final TextAttributesKey[] RYTHM_BLOCK_KEYS = new TextAttributesKey[]{RYTHM_BLOCK};
    private static final TextAttributesKey[] RYTHM_PART_KEYS = new TextAttributesKey[]{RYTHM_PART};
    private static final TextAttributesKey[] RYTHM_KEY_KEYS = new TextAttributesKey[]{RYTHM_KEY};
    private static final TextAttributesKey[] RYTHM_LOST_KEYS = new TextAttributesKey[]{RYTHM_LOST};
    private static final TextAttributesKey[] SCRIPT_KEYS = new TextAttributesKey[]{SCRIPT};
    private static final TextAttributesKey[] RYTHM_I_18_N_KEYS = new TextAttributesKey[]{RYTHM_I_18_N};


    //   private static final TextAttributesKey[] HTML_PART_KEYS = new TextAttributesKey[]{HTML_PART};
    // private static final TextAttributesKey[] JS_PART_KEYS = new TextAttributesKey[]{JS_PART};


    @NotNull
    @Override

    public Lexer getHighlightingLexer() {
        return new RythmLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
       /* if(tokenType.equals(RythmTypes.SEPARATOR)){
            return SEPARATOR_KEYS;
        }else if (tokenType.equals(RythmTypes.KEY)){
            return KEYS_KEYS;
        }else if (tokenType.equals(RythmTypes.VALUE)){
            return VALUE_KEYS;
        }else */
        if (tokenType.equals(RythmTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else /*if(tokenType.equals(RythmTypes.SCRIPT)){
            return SCRIPT_KEYS;
        }else/*if(tokenType.equals(RythmTypes.RYTHM_LOST)){
            return RYTHM_LOST_KEYS;
        }else/*if (tokenType.equals(TokenType.BAD_CHARACTER)){
            return BAD_CHAR_KEYS;

        }else*/ if (tokenType.equals(RythmTypes.RYTHM)) {
            return RYTHM_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_ARGS)) {
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
        } else if (tokenType.equals(RythmTypes.RYTHM_ELSE)) {
            return RYTHM_ELSE_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_IF)) {
            return RYTHM_IF_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_FOR)) {
            return RYTHM_FOR_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_I_18_N)) {
            return RYTHM_I_18_N_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_PREFIX)) {
            return RYTHM_PREFIX_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_NAVBOX)) {
            return RYTHM_NABOX_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_METHOD)) {
            return RYTHM_METHOD_KEYS;
        } else if (tokenType.equals(RYTHM_SYN)) {
            return RYTHM_SYN_KEYS;
        } else /*if (tokenType.equals(RythmTypes.RYTHM_BLOCK)){
            return RYTHM_BLOCK_KEYS;
        }else */if (tokenType.equals(RythmTypes.RYTHM_PART)) {
            return RYTHM_PART_KEYS;
        } else if (tokenType.equals(RythmTypes.RYTHM_KEY)) {
            return RYTHM_KEY_KEYS;
        }
            /*if (tokenType.equals(RythmTypes.HTML_PART)){
            return HTML_PART_KEYS;
        }else if (tokenType.equals(RythmTypes.JS_PART)){
            return JS_PART_KEYS;
        }*/
        {
            return EMPTY_KEYS;
        }
    }


}
