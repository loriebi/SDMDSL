package org.xtext.alma.sdmdsl.generator.html;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class HTMLKeyValue {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("doc/KeyValue.html");
    CharSequence _generateKeyValue = this.generateKeyValue();
    sdmFsa.generateFile(_generateKeyValue);
  }
  
  public CharSequence generateKeyValue() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<h1>Contents</h1>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("Listed below are tables of the ASDM.   For each table, a ");
    _builder.newLine();
    _builder.append("list of (key, value) pair is given. The autoincrementable");
    _builder.newLine();
    _builder.append("attribute of a table that if any is always a part of");
    _builder.newLine();
    _builder.append("the key, is written with an underlined font.   ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _tableDef = this.tableDef(table);
        _builder.append(_tableDef, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence tableDef(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<hr>");
    _builder.newLine();
    _builder.append("<h2>Table: ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    _builder.append("<table border=\"1\" width=\"600\">");
    _builder.newLine();
    _builder.append("<tr><th width=\"50%\" align=\"center\">Key</th><th width=\"50%\" align=\"center\">Value</th></tr>");
    _builder.newLine();
    _builder.append("<tr><td valign=\"top\" align=\"left\">");
    _builder.newLine();
    _builder.append("<ul type=\"square\">");
    _builder.newLine();
    {
      boolean _noExtrinsicAttribute = table.noExtrinsicAttribute();
      boolean _not = (!_noExtrinsicAttribute);
      if (_not) {
        {
          List<ASDMAttribute> _extrinsic = table.getExtrinsic();
          for(final ASDMAttribute attr : _extrinsic) {
            CharSequence _rowDefKey = this.rowDefKey(attr);
            _builder.append(_rowDefKey, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      List<ASDMAttribute> _intrinsic = table.getIntrinsic();
      for(final ASDMAttribute attr_1 : _intrinsic) {
        CharSequence _rowDefKey_1 = this.rowDefKey(attr_1);
        _builder.append(_rowDefKey_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("<td valign=\"top\" align=\"left\">");
    _builder.newLine();
    _builder.append("<ul type=\"square\">");
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_1 = table.getIntrinsic();
      for(final ASDMAttribute attr_2 : _intrinsic_1) {
        CharSequence _rowDefMandatoryValue = this.rowDefMandatoryValue(attr_2);
        _builder.append(_rowDefMandatoryValue, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _noExtrinsicAttribute_1 = table.noExtrinsicAttribute();
      boolean _not_1 = (!_noExtrinsicAttribute_1);
      if (_not_1) {
        {
          List<ASDMAttribute> _extrinsic_1 = table.getExtrinsic();
          for(final ASDMAttribute attr_3 : _extrinsic_1) {
            CharSequence _rowDefMandatoryValue_1 = this.rowDefMandatoryValue(attr_3);
            _builder.append(_rowDefMandatoryValue_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_2 = table.getIntrinsic();
      for(final ASDMAttribute attr_4 : _intrinsic_2) {
        CharSequence _rowDefOptionalValue = this.rowDefOptionalValue(attr_4);
        _builder.append(_rowDefOptionalValue, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _noExtrinsicAttribute_2 = table.noExtrinsicAttribute();
      boolean _not_2 = (!_noExtrinsicAttribute_2);
      if (_not_2) {
        {
          List<ASDMAttribute> _extrinsic_2 = table.getExtrinsic();
          for(final ASDMAttribute attr_5 : _extrinsic_2) {
            CharSequence _rowDefOptionalValue_1 = this.rowDefOptionalValue(attr_5);
            _builder.append(_rowDefOptionalValue_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence rowDefKey(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isKey = attr.isKey();
      if (_isKey) {
        {
          boolean _isAutoIncrementable = attr.isAutoIncrementable();
          if (_isAutoIncrementable) {
            _builder.append("<li><u>(");
            String _JavaType = attr.JavaType();
            _builder.append(_JavaType, "");
            _builder.append(") ");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.append("</u>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("<li>(");
            String _JavaType_1 = attr.JavaType();
            _builder.append(_JavaType_1, "");
            _builder.append(") ");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence rowDefMandatoryValue(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isKey = attr.isKey();
      boolean _not = (!_isKey);
      if (_not) {
        {
          boolean _isOptional = attr.isOptional();
          boolean _not_1 = (!_isOptional);
          if (_not_1) {
            _builder.append("<li> (");
            String _JavaType = attr.JavaType();
            _builder.append(_JavaType, "");
            _builder.append(") ");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence rowDefOptionalValue(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isKey = attr.isKey();
      boolean _not = (!_isKey);
      if (_not) {
        {
          boolean _isOptional = attr.isOptional();
          if (_isOptional) {
            _builder.append("<li> (optional, ");
            String _JavaType = attr.JavaType();
            _builder.append(_JavaType, "");
            _builder.append(") ");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
