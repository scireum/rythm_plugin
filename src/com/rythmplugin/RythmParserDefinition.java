package com.rythmplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.rythmplugin.file.RythmFileElementType;
import com.rythmplugin.parser.RythmParser;
import com.rythmplugin.psi.RythmFile;
import com.rythmplugin.psi.RythmTypes;
import com.sun.istack.internal.NotNull;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(RythmTypes.COMMENT);


  //  public static final IFileElementType FILE = new IFileElementType(Language.<RythmLanguage>findInstance(RythmLanguage.class));

    @Override
    public IFileElementType getFileNodeType(){
        return RythmFileElementType.INSTANCE;
    }
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new RythmLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new RythmParser();
    }

   /* @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }*/

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new RythmFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return RythmTypes.Factory.createElement(node);
    }
}
