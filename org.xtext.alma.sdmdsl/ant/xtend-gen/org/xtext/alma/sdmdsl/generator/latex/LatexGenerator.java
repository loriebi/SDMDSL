package org.xtext.alma.sdmdsl.generator.latex;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.latex.LatexTables;
import org.xtext.alma.sdmdsl.generator.latex.TwikiList;

@SuppressWarnings("all")
public class LatexGenerator {
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    LatexTables _latexTables = new LatexTables();
    _latexTables.doGenerate(fsa, context);
    TwikiList _twikiList = new TwikiList();
    _twikiList.doGenerate(fsa, context);
  }
}
