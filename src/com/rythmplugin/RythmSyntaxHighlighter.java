package com.rythmplugin;

import com.intellij.lang.html.HTMLParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.psi.RythmTypes;
import com.sun.istack.internal.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by mpl on 05.08.2016.
 */
public class RythmSyntaxHighlighter extends SyntaxHighlighterBase{
    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("RYTHM_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY = createTextAttributesKey("RYTHM_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE = createTextAttributesKey("RYTHM_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("RYTHM", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("RYTHM_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey RYTHM = createTextAttributesKey("RYTHM", HighlighterColors.TEXT);

    public static final TextAttributesKey HTML_PART = createTextAttributesKey("RYTHM_HTML_PART", HighlighterColors.TEXT);
    public static final TextAttributesKey JS_PART = createTextAttributesKey("RYTHM_JS_PART", HighlighterColors.TEXT);



private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEYS_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private static final TextAttributesKey[] RYTHM_KEYS = new TextAttributesKey[]{RYTHM};
    private static final TextAttributesKey[] HTML_PART_KEYS = new TextAttributesKey[]{HTML_PART};
    private static final TextAttributesKey[] JS_PART_KEYS = new TextAttributesKey[]{JS_PART};




    @NotNull
    @Override

    public Lexer getHighlightingLexer(){
        return new RythmLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType){
        if(tokenType.equals(RythmTypes.SEPARATOR)){
            return SEPARATOR_KEYS;
        }else if (tokenType.equals(RythmTypes.KEY)){
            return KEYS_KEYS;
        }else if (tokenType.equals(RythmTypes.VALUE)){
            return VALUE_KEYS;
        }else if (tokenType.equals(RythmTypes.COMMENT)){
            return COMMENT_KEYS;
        }else if (tokenType.equals(TokenType.BAD_CHARACTER)){
            return BAD_CHAR_KEYS;

        }else if(tokenType.equals(RythmTypes.RYTHM)){
            return RYTHM_KEYS;
        }else if (tokenType.equals(RythmTypes.HTML_PART)){
            return HTML_PART_KEYS;
        }else if (tokenType.equals(RythmTypes.JS_PART)){
            return JS_PART_KEYS;
        }{
            return EMPTY_KEYS;
        }
    }


}
