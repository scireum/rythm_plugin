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
         //   new AttributesDescriptor("Key", RythmSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", RythmSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", RythmSyntaxHighlighter.VALUE),
            new AttributesDescriptor("@", RythmSyntaxHighlighter.AT),
            new AttributesDescriptor("@if", RythmSyntaxHighlighter.AT_IF),
            new AttributesDescriptor("@for", RythmSyntaxHighlighter.AT_FOR),
            new AttributesDescriptor("@while", RythmSyntaxHighlighter.AT_WHILE),
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

                "# You are reading the \".properties\" entry.\n" +
                        "! The exclamation mark can also mark text as comments.\n" +
                        "website = http://en.wikipedia.org/\n" +
                        "language = English\n" +
                        "# The backslash below tells the application to continue reading\n" +
                        "# the value onto the next line.\n" +
                        "message = Welcome to \\\n" +
                        "          Wikipedia!\n" +
                        "message = @\n"+
                        "message = @if\n"+
                        "message = @for\n"+
                        "message = @while\n"+
                        "message = <html>\n"+
                        "# Add spaces to the key\n" +
                        "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
                        "# Unicode\n" +
                        "tab : \\u0009";
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