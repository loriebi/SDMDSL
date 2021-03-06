package org.xtext.alma.sdmdsl.generator.test;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class TestAutoIncrementable {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    List<AlmaTable> _tables = this.container.getTables();
    for (final AlmaTable table : _tables) {
      {
        String _name = table.getName();
        String _plus = ("test/autoIncrementable/" + _name);
        String _plus_1 = (_plus + "AutoIncre.txt");
        sdmFsa.setFile(_plus_1);
        CharSequence _generateAutoIncrementable = this.generateAutoIncrementable(table);
        sdmFsa.generateFile(_generateAutoIncrementable);
      }
    }
  }
  
  public CharSequence generateAutoIncrementable(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LIST OF AUTO INCREMENTABLE ATTRIBUTES :");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _autoIncrementable = table.getAutoIncrementable();
      for(final ASDMAttribute attr : _autoIncrementable) {
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
