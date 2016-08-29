package com.rythmplugin.lexer;

import com.intellij.psi.tree.IElementType;
import com.rythmplugin.RythmLanguage;
import com.sun.istack.internal.NotNull;
import org.jetbrains.annotations.NonNls;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmElementType extends IElementType {
    public RythmElementType(@NotNull @NonNls String debugName){
        super(debugName, RythmLanguage.INSTANCE);
    }

  public String toString(){
      return "[Rythm]" + super.toString();
  }
}
