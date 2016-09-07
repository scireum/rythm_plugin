package com.rythmplugin.settings;


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
            new AttributesDescriptor("Else", RythmSyntaxHighlighter.RYTHM_ELSE),
            new AttributesDescriptor("Extends", RythmSyntaxHighlighter.RYTHM_EXTENDS),
            new AttributesDescriptor("For", RythmSyntaxHighlighter.RYTHM_FOR),
            new AttributesDescriptor("If", RythmSyntaxHighlighter.RYTHM_IF),
            new AttributesDescriptor("Import", RythmSyntaxHighlighter.RYTHM_IMPORT),
            new AttributesDescriptor("Invoke", RythmSyntaxHighlighter.RYTHM_INVOKE),
            new AttributesDescriptor("Prefix", RythmSyntaxHighlighter.RYTHM_PREFIX),
            new AttributesDescriptor("Render", RythmSyntaxHighlighter.RYTHM_RENDER),
            new AttributesDescriptor("Section", RythmSyntaxHighlighter.RYTHM_SECTION),
            new AttributesDescriptor("Method", RythmSyntaxHighlighter.RYTHM_METHOD),
            new AttributesDescriptor("Key", RythmSyntaxHighlighter.RYTHM_KEY),
            new AttributesDescriptor("i18n", RythmSyntaxHighlighter.RYTHM_I_18_N),
            new AttributesDescriptor("Comment", RythmSyntaxHighlighter.RYTHM_COMMENT),
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
                        "@rythm\n" +
                        "@prefix\n" +
                        "@*\n" +
                        "*demo\n" +
                        "*@\n" +
                        "@invoke\n" +
                        "@section\n" +
                        "<script src=\'/abc/def/ghi.js\' type=\'text/javascript\'></script>\n" +
                        "@render\n" +
                        "@import\n" +
                        "@extends\n" +
                        "@if\n" +
                        "@for\n" +
                        "@args\n" +
                        "<div class='block-element'title='@abcd.getAnotherMethod()'>@rythm.getMethod()</div>\n" +
                        "@i18n\n" +
                        "else {\n";
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