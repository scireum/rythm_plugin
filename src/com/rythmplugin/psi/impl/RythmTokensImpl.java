// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.rythmplugin.psi.RythmTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rythmplugin.psi.*;

public class RythmTokensImpl extends ASTWrapperPsiElement implements RythmTokens {

  public RythmTokensImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RythmVisitor visitor) {
    visitor.visitTokens(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RythmVisitor) accept((RythmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RythmAndAnd getAndAnd() {
    return findChildByClass(RythmAndAnd.class);
  }

  @Override
  @Nullable
  public RythmAs getAs() {
    return findChildByClass(RythmAs.class);
  }

  @Override
  @Nullable
  public RythmAt getAt() {
    return findChildByClass(RythmAt.class);
  }

  @Override
  @Nullable
  public RythmBitAnd getBitAnd() {
    return findChildByClass(RythmBitAnd.class);
  }

  @Override
  @Nullable
  public RythmBitNot getBitNot() {
    return findChildByClass(RythmBitNot.class);
  }

  @Override
  @Nullable
  public RythmBitOr getBitOr() {
    return findChildByClass(RythmBitOr.class);
  }

  @Override
  @Nullable
  public RythmClassAttrEnd getClassAttrEnd() {
    return findChildByClass(RythmClassAttrEnd.class);
  }

  @Override
  @Nullable
  public RythmClassAttrStart getClassAttrStart() {
    return findChildByClass(RythmClassAttrStart.class);
  }

  @Override
  @Nullable
  public RythmCmp getCmp() {
    return findChildByClass(RythmCmp.class);
  }

  @Override
  @Nullable
  public RythmColon getColon() {
    return findChildByClass(RythmColon.class);
  }

  @Override
  @Nullable
  public RythmComma getComma() {
    return findChildByClass(RythmComma.class);
  }

  @Override
  @Nullable
  public RythmDiv getDiv() {
    return findChildByClass(RythmDiv.class);
  }

  @Override
  @Nullable
  public RythmDivEq getDivEq() {
    return findChildByClass(RythmDivEq.class);
  }

  @Override
  @Nullable
  public RythmDoubleColon getDoubleColon() {
    return findChildByClass(RythmDoubleColon.class);
  }

  @Override
  @Nullable
  public RythmEq getEq() {
    return findChildByClass(RythmEq.class);
  }

  @Override
  @Nullable
  public RythmEqEq getEqEq() {
    return findChildByClass(RythmEqEq.class);
  }

  @Override
  @Nullable
  public RythmGreaterOrEq getGreaterOrEq() {
    return findChildByClass(RythmGreaterOrEq.class);
  }

  @Override
  @Nullable
  public RythmHashtag getHashtag() {
    return findChildByClass(RythmHashtag.class);
  }

  @Override
  @Nullable
  public RythmLbrace getLbrace() {
    return findChildByClass(RythmLbrace.class);
  }

  @Override
  @Nullable
  public RythmLbracket getLbracket() {
    return findChildByClass(RythmLbracket.class);
  }

  @Override
  @Nullable
  public RythmLessOrEq getLessOrEq() {
    return findChildByClass(RythmLessOrEq.class);
  }

  @Override
  @Nullable
  public RythmLparen getLparen() {
    return findChildByClass(RythmLparen.class);
  }

  @Override
  @Nullable
  public RythmMinus getMinus() {
    return findChildByClass(RythmMinus.class);
  }

  @Override
  @Nullable
  public RythmMinusEq getMinusEq() {
    return findChildByClass(RythmMinusEq.class);
  }

  @Override
  @Nullable
  public RythmMinusMinus getMinusMinus() {
    return findChildByClass(RythmMinusMinus.class);
  }

  @Override
  @Nullable
  public RythmMul getMul() {
    return findChildByClass(RythmMul.class);
  }

  @Override
  @Nullable
  public RythmMultiArgs getMultiArgs() {
    return findChildByClass(RythmMultiArgs.class);
  }

  @Override
  @Nullable
  public RythmMulEq getMulEq() {
    return findChildByClass(RythmMulEq.class);
  }

  @Override
  @Nullable
  public RythmNot getNot() {
    return findChildByClass(RythmNot.class);
  }

  @Override
  @Nullable
  public RythmNotEq getNotEq() {
    return findChildByClass(RythmNotEq.class);
  }

  @Override
  @Nullable
  public RythmOrOr getOrOr() {
    return findChildByClass(RythmOrOr.class);
  }

  @Override
  @Nullable
  public RythmPlus getPlus() {
    return findChildByClass(RythmPlus.class);
  }

  @Override
  @Nullable
  public RythmPlusEq getPlusEq() {
    return findChildByClass(RythmPlusEq.class);
  }

  @Override
  @Nullable
  public RythmPlusPlus getPlusPlus() {
    return findChildByClass(RythmPlusPlus.class);
  }

  @Override
  @Nullable
  public RythmQm getQm() {
    return findChildByClass(RythmQm.class);
  }

  @Override
  @Nullable
  public RythmQuestion getQuestion() {
    return findChildByClass(RythmQuestion.class);
  }

  @Override
  @Nullable
  public RythmRbrace getRbrace() {
    return findChildByClass(RythmRbrace.class);
  }

  @Override
  @Nullable
  public RythmRbracket getRbracket() {
    return findChildByClass(RythmRbracket.class);
  }

  @Override
  @Nullable
  public RythmRemainder getRemainder() {
    return findChildByClass(RythmRemainder.class);
  }

  @Override
  @Nullable
  public RythmRemainderEq getRemainderEq() {
    return findChildByClass(RythmRemainderEq.class);
  }

  @Override
  @Nullable
  public RythmRparen getRparen() {
    return findChildByClass(RythmRparen.class);
  }

  @Override
  @Nullable
  public RythmSemicolon getSemicolon() {
    return findChildByClass(RythmSemicolon.class);
  }

  @Override
  @Nullable
  public RythmSendChannel getSendChannel() {
    return findChildByClass(RythmSendChannel.class);
  }

  @Override
  @Nullable
  public RythmShiftLeft getShiftLeft() {
    return findChildByClass(RythmShiftLeft.class);
  }

  @Override
  @Nullable
  public RythmShiftRight getShiftRight() {
    return findChildByClass(RythmShiftRight.class);
  }

  @Override
  @Nullable
  public RythmUnsignedShiftRight getUnsignedShiftRight() {
    return findChildByClass(RythmUnsignedShiftRight.class);
  }

}
