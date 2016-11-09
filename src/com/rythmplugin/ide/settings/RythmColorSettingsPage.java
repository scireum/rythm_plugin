package com.rythmplugin.ide.settings;


import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.rythmplugin.icons.RythmIcons;
import com.rythmplugin.ide.highlighter.RythmSyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


import javax.swing.*;
import java.util.Map;

/**
 * Created by mpl on 05.08.2016.
 */
public class RythmColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Args", RythmSyntaxHighlighter.RYTHM_ARGS),
            new AttributesDescriptor("Extends", RythmSyntaxHighlighter.RYTHM_EXTENDS),
            new AttributesDescriptor("For", RythmSyntaxHighlighter.RYTHM_FOR),
            new AttributesDescriptor("If", RythmSyntaxHighlighter.RYTHM_IF),
            new AttributesDescriptor("Import", RythmSyntaxHighlighter.RYTHM_IMPORT),
            new AttributesDescriptor("Invoke", RythmSyntaxHighlighter.RYTHM_INVOKE),
            new AttributesDescriptor("Prefix", RythmSyntaxHighlighter.RYTHM_PREFIX),
            new AttributesDescriptor("Render", RythmSyntaxHighlighter.RYTHM_RENDER),
            new AttributesDescriptor("Section", RythmSyntaxHighlighter.RYTHM_SECTION),
            new AttributesDescriptor("Key", RythmSyntaxHighlighter.RYTHM_KEY),
            new AttributesDescriptor("i18n", RythmSyntaxHighlighter.RYTHM_I18N),
            new AttributesDescriptor("Comment", RythmSyntaxHighlighter.BLOCK_COMMENT),
            new AttributesDescriptor("Escaped Rythm", RythmSyntaxHighlighter.RYTHM_ESCAPED),


    };

    @Nullable
    @Override
    public Icon getIcon() {
        return RythmIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new RythmSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return

                "# You are reading the \"example\" entry for a rythm file\n" +
                        "@import\n" +
                        "@extends\n" +
                        "@args\n" +
                        "@rythm\n" +
                        "@@thisIsEscapedRythm\n"+
                        "@prefix\n" +
                        "@*\n" +
                        "*demo\n" +
                        "*@\n" +
                        "@invoke\n" +
                        "@section\n" +
                        "@render\n" +
                        "@i18n\n"+
                        "@if(xxx > yyy) {\n" +
                        "}\n"+
                        "@for\n" +
                        "<div class='block-element'title='@abcd.getAnotherMethod()'>@rythm.getMethod()</div>\n";

    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Rythm";
    }
}