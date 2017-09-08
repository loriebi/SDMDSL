package org.xtext.alma.sdmdsl.generator.idl;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.idl.IDLStructDef;

@SuppressWarnings("all")
public class IDLGenerator {
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    IDLStructDef _iDLStructDef = new IDLStructDef();
    _iDLStructDef.doGenerate(fsa, context);
  }
}
