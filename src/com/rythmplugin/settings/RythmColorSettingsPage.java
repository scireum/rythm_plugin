package com.rythmplugin.settings;


import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.rythmplugin.RythmIcons;
import com.rythmplugin.highlighter.RythmSyntaxHighlighter;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Created by mpl on 05.08.2016.
 */
public class RythmColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", RythmSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", RythmSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", RythmSyntaxHighlighter.VALUE),
            new AttributesDescriptor("RYTHM_ARGS", RythmSyntaxHighlighter.RYTHM_ARGS),
            new AttributesDescriptor("RYTHM_ELSE", RythmSyntaxHighlighter.RYTHM_ELSE),
            new AttributesDescriptor("RYTHM_EXTENDS", RythmSyntaxHighlighter.RYTHM_EXTENDS),
            new AttributesDescriptor("RYTHM_FOR", RythmSyntaxHighlighter.RYTHM_FOR),
            new AttributesDescriptor("RYTHM_I18N", RythmSyntaxHighlighter.RYTHM_I18N),
            new AttributesDescriptor("RYTHM_IF", RythmSyntaxHighlighter.RYTHM_IF),
            new AttributesDescriptor("RYTHM_IMPORT", RythmSyntaxHighlighter.RYTHM_IMPORT),
            new AttributesDescriptor("RYTHM_INVOKE", RythmSyntaxHighlighter.RYTHM_INVOKE),
            new AttributesDescriptor("RYTHM_NAVBOX", RythmSyntaxHighlighter.RYTHM_NAVBOX),
            new AttributesDescriptor("RYTHM_PREFIX", RythmSyntaxHighlighter.RYTHM_PREFIX),
            new AttributesDescriptor("RYTHM_RENDER", RythmSyntaxHighlighter.RYTHM_RENDER),
            new AttributesDescriptor("RYTHM_SECTION", RythmSyntaxHighlighter.RYTHM_SECTION),
            new AttributesDescriptor("RYTHM", RythmSyntaxHighlighter.RYTHM),
            new AttributesDescriptor("RYTHM_METHOD", RythmSyntaxHighlighter.RYTHM_METHOD),
            new AttributesDescriptor("RYTHM_SYN", RythmSyntaxHighlighter.RYTHM_SYN),
            new AttributesDescriptor("RYTHM_BLOCK", RythmSyntaxHighlighter.RYTHM_BLOCK),
            new AttributesDescriptor("RYTHM_PART", RythmSyntaxHighlighter.RYTHM_PART),
            new AttributesDescriptor("RYTHM_KEY", RythmSyntaxHighlighter.RYTHM_KEY),

            new AttributesDescriptor("HTML", RythmSyntaxHighlighter.HTML_PART),
            new AttributesDescriptor("JS", RythmSyntaxHighlighter.JS_PART),
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
                        "@hello\n" +
                        "@prefix\n" +
                        "@invoke\n" +
                        "@section\n" +
                        "@render\n" +
                        "@navbox\n" +
                        "@import\n" +
                        "@extends\n" +
                        "@if\n" +
                        "@for\n" +
                        "@args\n" +
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