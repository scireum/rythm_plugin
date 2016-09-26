// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RythmRythmIf extends PsiElement {

  @NotNull
  List<RythmLetter> getLetterList();

  @NotNull
  List<RythmLparen> getLparenList();

  @NotNull
  List<RythmRparen> getRparenList();

  @NotNull
  List<RythmWs> getWsList();

  @NotNull
  List<RythmTokens> getTokensList();

}
