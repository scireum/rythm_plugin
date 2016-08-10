package com.rythmplugin;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import com.sun.javafx.collections.MappingChange;

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
            new AttributesDescriptor("RYTHM", RythmSyntaxHighlighter.RYTHM),
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
                        "@if (...){} else {}\n";
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