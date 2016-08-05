package com.rythmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.rythmplugin.RythmLanguage;
import com.sun.istack.internal.NotNull;
import org.jetbrains.annotations.NonNls;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmTokenType extends IElementType {
    public RythmTokenType(@NotNull @NonNls String debugName){
        super(debugName, RythmLanguage.INSTANCE);
    }

    @Override
    public String toString(){
        return "RythmTokenType." + super.toString();
    }
}
