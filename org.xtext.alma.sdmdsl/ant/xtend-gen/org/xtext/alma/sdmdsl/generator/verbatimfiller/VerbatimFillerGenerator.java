package org.xtext.alma.sdmdsl.generator.verbatimfiller;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.verbatimfiller.ASDMTablesDef;
import org.xtext.alma.sdmdsl.generator.verbatimfiller.ASDMTablesImpl;
import org.xtext.alma.sdmdsl.generator.verbatimfiller.Name2TableDef;
import org.xtext.alma.sdmdsl.generator.verbatimfiller.Name2TableImpl;

@SuppressWarnings("all")
public class VerbatimFillerGenerator {
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    ASDMTablesDef _aSDMTablesDef = new ASDMTablesDef();
    _aSDMTablesDef.doGenerate(fsa, context);
    ASDMTablesImpl _aSDMTablesImpl = new ASDMTablesImpl();
    _aSDMTablesImpl.doGenerate(fsa, context);
    Name2TableDef _name2TableDef = new Name2TableDef();
    _name2TableDef.doGenerate(fsa, context);
    Name2TableImpl _name2TableImpl = new Name2TableImpl();
    _name2TableImpl.doGenerate(fsa, context);
  }
}
