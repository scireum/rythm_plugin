package com.rythmplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.rythmplugin.file.RythmFile;
import com.rythmplugin.file.RythmFileType;
import com.rythmplugin.psi.RythmRythm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by mpl on 23.09.2016.
 */
public class RythmUtil {
    public static List<RythmRythm> findRythms(Project project, String key) {
        List<RythmRythm> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, RythmFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            RythmFile rythmFile = (RythmFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (rythmFile != null) {
                RythmRythm[] rythms = PsiTreeUtil.getChildrenOfType(rythmFile, RythmRythm.class);
                if (rythms != null) {
                    for (RythmRythm rythm : rythms) {
                       // if (key.equals(rythm.getKey())) {
                            if (result == null) {
                                result = new ArrayList<RythmRythm>();
                            }
                            result.add(rythm);
                        }
                    }
                }
            }
       // }
        return result != null ? result : Collections.<RythmRythm>emptyList();
    }

    public static List<RythmRythm> findRythms(Project project) {
        List<RythmRythm> result = new ArrayList<RythmRythm>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, RythmFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            RythmFile rythmFile = (RythmFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (rythmFile != null) {
                RythmRythm[] rythms = PsiTreeUtil.getChildrenOfType(rythmFile, RythmRythm.class);
                if (rythms != null) {
                    Collections.addAll(result, rythms);
                }
            }
        }
        return result;
    }
}