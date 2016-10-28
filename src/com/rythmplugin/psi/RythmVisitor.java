// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;

public class RythmVisitor extends PsiElementVisitor {

  public void visitParam(@NotNull RythmParam o) {
    visitPsiElement(o);
  }

  public void visitRythm(@NotNull RythmRythm o) {
    visitPsiElement(o);
  }

  public void visitRythmArgs(@NotNull RythmRythmArgs o) {
    visitPsiElement(o);
  }

  public void visitRythmExtends(@NotNull RythmRythmExtends o) {
    visitPsiElement(o);
  }

  public void visitRythmImport(@NotNull RythmRythmImport o) {
    visitPsiElement(o);
  }

  public void visitRythmSection(@NotNull RythmRythmSection o) {
    visitPsiElement(o);
  }

  public void visitInitialDeclaration(@NotNull RythmInitialDeclaration o) {
    visitPsiElement(o);
  }

  public void visitJavaCode(@NotNull RythmJavaCode o) {
    visitPsiLanguageInjectionHost(o);
  }

  public void visitQualifiedName(@NotNull RythmQualifiedName o) {
    visitPsiElement(o);
  }

  public void visitRythmKeyy(@NotNull RythmRythmKeyy o) {
    visitPsiElement(o);
  }

  public void visitPsiLanguageInjectionHost(@NotNull PsiLanguageInjectionHost o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
