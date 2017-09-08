package org.xtext.alma.sdmdsl.generator.latex;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class TwikiList {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("/latex/tablesTwiki.txt");
    CharSequence _generateTwiki = this.generateTwiki();
    sdmFsa.generateFile(_generateTwiki);
  }
  
  public CharSequence generateTwiki() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CVS Revision: ");
    String _revision = AlmaTableContainer.getRevision();
    _builder.append(_revision, "");
    _builder.append(" --  CVS branch: ");
    String _branch = AlmaTableContainer.getBranch();
    _builder.append(_branch, "");
    _builder.newLineIfNotEmpty();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _output = this.output(table);
        _builder.append(_output, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence output(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("---+++ =");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("= Table");
    _builder.newLineIfNotEmpty();
    _builder.append("| *Action*  | *Function*  | *Name*  | *Type*   | *Comment*   |");
    _builder.newLine();
    {
      List<ASDMAttribute> _sortedKeyAttributes = table.sortedKeyAttributes();
      for(final ASDMAttribute attr : _sortedKeyAttributes) {
        _builder.append("| -  | Key  | =");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.append("=  | !");
        String _LatexTypeDescription = attr.LatexTypeDescription();
        _builder.append(_LatexTypeDescription, "");
        _builder.append("  |  |");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _sortedRequiredValueAttributes = table.sortedRequiredValueAttributes();
      for(final ASDMAttribute attr_1 : _sortedRequiredValueAttributes) {
        _builder.append("| -  | Data  | =");
        String _name_2 = attr_1.getName();
        _builder.append(_name_2, "");
        _builder.append("=  | !");
        String _LatexTypeDescription_1 = attr_1.LatexTypeDescription();
        _builder.append(_LatexTypeDescription_1, "");
        _builder.append("  |   | ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _sortedOptionalValueAttributes = table.sortedOptionalValueAttributes();
      for(final ASDMAttribute attr_2 : _sortedOptionalValueAttributes) {
        _builder.append("| -  | Optional  | =");
        String _name_3 = attr_2.getName();
        _builder.append(_name_3, "");
        _builder.append("=  | !");
        String _LatexTypeDescription_2 = attr_2.LatexTypeDescription();
        _builder.append(_LatexTypeDescription_2, "");
        _builder.append("  |   |");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
