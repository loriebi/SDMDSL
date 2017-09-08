package org.xtext.alma.sdmdsl.generator.html;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class HTMLTableMethods {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("doc/TableMethods.html");
    CharSequence _generateTableMethods = this.generateTableMethods();
    sdmFsa.generateFile(_generateTableMethods);
  }
  
  public CharSequence generateTableMethods() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<h1>ASDM Tables - New proposed methods</h1>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("Listed below are the names and signatures for new proposed methods defined in the classes ");
    _builder.newLine();
    _builder.append("implementing the ASDM tables. These methods put a particular emphasis on the use of the key and value");
    _builder.newLine();
    _builder.append("sections defined on each table. Another important addition is about the concept of \"autoincrementable\"");
    _builder.newLine();
    _builder.append("attribute; an autoincrementable attribute is an intrinsic attribute, Tag or integer id, belonging to ");
    _builder.newLine();
    _builder.append("the key section  that can be automatically computed when a new row is added to a table using an ");
    _builder.newLine();
    _builder.append("appropriate method (addAutoInc). There is at most one autoincrementable attribute per table.");
    _builder.newLine();
    _builder.append("Using the addAutoInc method obviously relieves the programmer  of having to generate and to manage ");
    _builder.newLine();
    _builder.append("Tags and integer ids. <br/>");
    _builder.newLine();
    _builder.append("<br/>");
    _builder.newLine();
    _builder.append("For each table we give as a reminder the list of attributes split into two columns <b>key</b> and ");
    _builder.newLine();
    _builder.append("<b>value</b>; the autoincrementable attribute, if any, is underlined. ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<p>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _tableMethodsDef = this.tableMethodsDef(table);
        _builder.append(_tableMethodsDef, "");
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
  
  public CharSequence tableMethodsDef(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<hr>");
    _builder.newLine();
    _builder.append("<h2>Table: ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    _builder.append("<h3>Attributes</h3>");
    _builder.newLine();
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
    _builder.append("<h3>Methods</h3>");
    _builder.newLine();
    _builder.append("<h4>Create a row.</h4>");
    _builder.newLine();
    _builder.append("<table border=\"1\" width=\"100%\">");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<td valign=\"top\" width=\"100%\">");
    _builder.newLine();
    _builder.append("<code>");
    _builder.newLine();
    {
      String _RequiredValueJava = table.RequiredValueJava();
      boolean _notEquals = (!Objects.equal(_RequiredValueJava, ""));
      if (_notEquals) {
        _builder.append("/*<br/>");
        _builder.newLine();
        _builder.append("** Create a new row from the list of mandatory attributes that are in the value section.<br/>");
        _builder.newLine();
        _builder.append("** Optional attributes, if any, can be set using the appropriate setters.<br/>");
        _builder.newLine();
        _builder.append("*/<br/>\t");
        _builder.newLine();
        _builder.append("<b>Java</b>: ");
        String _name_1 = table.getName();
        _builder.append(_name_1, "");
        _builder.append("Row newRow(");
        String _RequiredValueJava_1 = table.RequiredValueJava();
        _builder.append(_RequiredValueJava_1, "");
        _builder.append(");<br/>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _RequiredValueCpp = table.RequiredValueCpp();
      boolean _notEquals_1 = (!Objects.equal(_RequiredValueCpp, ""));
      if (_notEquals_1) {
        _builder.append("<b>C++</b>: ");
        String _name_2 = table.getName();
        _builder.append(_name_2, "");
        _builder.append("Row* newRow(");
        String _RequiredValueCpp_1 = table.RequiredValueCpp();
        _builder.append(_RequiredValueCpp_1, "");
        _builder.append(");<br/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</code>");
    _builder.newLine();
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("</table>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<h4>Append a row to its table.</h4>");
    _builder.newLine();
    _builder.append("<table border=\"1\" width=\"100%\">");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<td valign=\"top\" width=\"100%\">");
    _builder.newLine();
    _builder.append("<code>");
    _builder.newLine();
    {
      String _KeyJava = table.KeyJava();
      boolean _notEquals_2 = (!Objects.equal(_KeyJava, ""));
      if (_notEquals_2) {
        _builder.append("/* <br/>");
        _builder.newLine();
        _builder.append("** Overwrite the key attributes of x with the values passed in parameters and <br/>");
        _builder.newLine();
        _builder.append("** append x to its table. <br/>");
        _builder.newLine();
        _builder.append("*/ <br/>");
        _builder.newLine();
        _builder.append("<b>Java</b>: void add(");
        String _KeyJava_1 = table.KeyJava();
        _builder.append(_KeyJava_1, "");
        _builder.append(", ");
        String _name_3 = table.getName();
        _builder.append(_name_3, "");
        _builder.append("Row x);<br/>");
        _builder.newLineIfNotEmpty();
        _builder.append("<b>C++</b>: void add(");
        String _KeyCpp = table.KeyCpp();
        _builder.append(_KeyCpp, "");
        _builder.append(", ");
        String _name_4 = table.getName();
        _builder.append(_name_4, "");
        _builder.append("Row* x);<br/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<br/>");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
      boolean _not_3 = (!_NoAutoIncrementableAttribute);
      if (_not_3) {
        _builder.append("/* <br/>");
        _builder.newLine();
        _builder.append("** Overwrite the non autoincrementable key attributes of x with the values passed in parameters <br />");
        _builder.newLine();
        _builder.append("** and append x to its table. <br/>");
        _builder.newLine();
        _builder.append("** Returns the value of ");
        ASDMAttribute _TheAutoIncrementableAttribute = table.TheAutoIncrementableAttribute();
        String _name_5 = _TheAutoIncrementableAttribute.getName();
        _builder.append(_name_5, "");
        _builder.append(" automatically assigned to x. <br />");
        _builder.newLineIfNotEmpty();
        _builder.append("*/ <br/>");
        _builder.newLine();
        {
          List<ASDMAttribute> _keyNoAutoIncrementableAttributes = table.getKeyNoAutoIncrementableAttributes();
          int _size = _keyNoAutoIncrementableAttributes.size();
          boolean _notEquals_3 = (_size != 0);
          if (_notEquals_3) {
            _builder.append("\t");
            _builder.append("<b>Java</b>: ");
            ASDMAttribute _TheAutoIncrementableAttribute_1 = table.TheAutoIncrementableAttribute();
            String _JavaType = _TheAutoIncrementableAttribute_1.JavaType();
            _builder.append(_JavaType, "\t");
            _builder.append(" addAutoInc(");
            String _KeyNoAutoIncJava = table.KeyNoAutoIncJava();
            _builder.append(_KeyNoAutoIncJava, "\t");
            _builder.append(", ");
            String _name_6 = table.getName();
            _builder.append(_name_6, "\t");
            _builder.append("Row x);<br/>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("<b>C++</b>:\t");
            ASDMAttribute _TheAutoIncrementableAttribute_2 = table.TheAutoIncrementableAttribute();
            String _CppType = _TheAutoIncrementableAttribute_2.CppType();
            _builder.append(_CppType, "\t");
            _builder.append("* addAutoInc(");
            String _KeyNoAutoIncCpp = table.KeyNoAutoIncCpp();
            _builder.append(_KeyNoAutoIncCpp, "\t");
            _builder.append(", ");
            String _name_7 = table.getName();
            _builder.append(_name_7, "\t");
            _builder.append("Row* x);<br/>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("<b>Java</b>: ");
            ASDMAttribute _TheAutoIncrementableAttribute_3 = table.TheAutoIncrementableAttribute();
            String _JavaType_1 = _TheAutoIncrementableAttribute_3.JavaType();
            _builder.append(_JavaType_1, "\t");
            _builder.append(" addAutoInc(");
            String _name_8 = table.getName();
            _builder.append(_name_8, "\t");
            _builder.append("Row* x);<br/>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("<b>C++</b>:\t");
            ASDMAttribute _TheAutoIncrementableAttribute_4 = table.TheAutoIncrementableAttribute();
            String _CppType_1 = _TheAutoIncrementableAttribute_4.CppType();
            _builder.append(_CppType_1, "\t");
            _builder.append("* addAutoInc(");
            String _name_9 = table.getName();
            _builder.append(_name_9, "\t");
            _builder.append("Row* x);<br/>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</code>");
    _builder.newLine();
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("</table>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<h4>Query a table using keys without the autoincrementable attribute.</h4>");
    _builder.newLine();
    _builder.append("<table width=\"100%\" border=\"1\">");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<td>");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _NoAutoIncrementableAttribute_1 = table.NoAutoIncrementableAttribute();
      boolean _not_4 = (!_NoAutoIncrementableAttribute_1);
      if (_not_4) {
        {
          List<ASDMAttribute> _keyNoAutoIncrementableAttributes_1 = table.getKeyNoAutoIncrementableAttributes();
          int _size_1 = _keyNoAutoIncrementableAttributes_1.size();
          boolean _notEquals_4 = (_size_1 != 0);
          if (_notEquals_4) {
            _builder.append("<code>");
            _builder.newLine();
            _builder.append("/**<br/>");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Get the rows based on values for attributes of the key section that are not autoincrementable.<br/>");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/<br/>\t\t<b>Java</b>: ");
            String _name_10 = table.getName();
            _builder.append(_name_10, " ");
            _builder.append("Row[] getKeyNoAutoInc(");
            String _KeyNoAutoIncJava_1 = table.KeyNoAutoIncJava();
            _builder.append(_KeyNoAutoIncJava_1, " ");
            _builder.append(");<br/>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("<b>C++</b>:\tvector &lt;");
            String _name_11 = table.getName();
            _builder.append(_name_11, "\t");
            _builder.append("Row*&gt; getKeyNoAutoInc(");
            String _KeyNoAutoIncCpp_1 = table.KeyNoAutoIncCpp();
            _builder.append(_KeyNoAutoIncCpp_1, "\t");
            _builder.append(");<br/>");
            _builder.newLineIfNotEmpty();
            _builder.append("</code>");
            _builder.newLine();
          } else {
            _builder.append("No such method.");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("No such method.");
        _builder.newLine();
      }
    }
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
