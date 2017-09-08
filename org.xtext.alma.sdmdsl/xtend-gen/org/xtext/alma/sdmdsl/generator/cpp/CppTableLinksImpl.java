package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CppTableLinksImpl {
  public CharSequence doGenerate(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
