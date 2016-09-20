package com.rythmplugin.ide.formatter;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 16.09.2016.
 */
public class RythmFormatUtil {
    public static boolean hasElementType(@NotNull ASTNode node, @NotNull TokenSet set){
        return set.contains(node.getElementType());
    }
    public static boolean hasElementType(@NotNull ASTNode node, IElementType... types){
        return hasElementType(node, TokenSet.create(types));
    }
}
