package org.xtext.alma.sdmdsl.generator.html;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class HTMLJavaPackage {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("doc/ASDM.html");
    CharSequence _generateASDM = this.generateASDM();
    sdmFsa.generateFile(_generateASDM);
  }
  
  public CharSequence generateASDM() {
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
    _builder.append("Listed below are tables and one container class that make up the ");
    _builder.newLine();
    _builder.append("package.  Each table in the UML model results in two classes being ");
    _builder.newLine();
    _builder.append("generated: a \"Table\" class and a \"Row\" class. For each table, a ");
    _builder.newLine();
    _builder.append("list of attributes, keys, and links to other tables are included.  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("A key is an ordered sequence of attributes that uniquely identify");
    _builder.newLine();
    _builder.append("a row of a table.  Methods are included to traverse the links from one");
    _builder.newLine();
    _builder.append("table to another.  The attributes of a table are divided into intrinsic");
    _builder.newLine();
    _builder.append("and extrinsic attributes.  An intrinsic attribute is");
    _builder.newLine();
    _builder.append("an attribute that a table has regardless of whether that table is");
    _builder.newLine();
    _builder.append("related to any other thing or not.  In other words, it is intrinsic to that");
    _builder.newLine();
    _builder.append("table.  An extrinsic attribute, on the other hand, is one that exists in virtue of the");
    _builder.newLine();
    _builder.append("fact that the table is related to something else.  In other words, an extrinsic");
    _builder.newLine();
    _builder.append("attribute exists because that table is associated with some other thing.");
    _builder.newLine();
    CharSequence _ContainerDef = this.ContainerDef();
    _builder.append(_ContainerDef, "");
    _builder.newLineIfNotEmpty();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _TableDef = this.TableDef(table);
        _builder.append(_TableDef, "");
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
  
  public CharSequence ContainerDef() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h2>Table container: ");
    String _name = this.container.getName();
    _builder.append(_name, "");
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    String _doc = this.container.getDoc();
    _builder.append(_doc, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<h3>Attributes:</h3>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ul>");
    _builder.newLine();
    {
      List<ASDMAttribute> _ASDMAttributes = this.container.ASDMAttributes();
      for(final ASDMAttribute attr : _ASDMAttributes) {
        _builder.append("\t");
        CharSequence _RowDef = this.RowDef(attr);
        _builder.append(_RowDef, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("<h3>List of member tables:</h3>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ul>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        _builder.append("<li>");
        String _name_1 = table.getName();
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence TableDef(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<hr>");
    _builder.newLine();
    _builder.append("<h2>Table: ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    String _doc = table.getDoc();
    _builder.append(_doc, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<h3>Intrinsic Attributes:</h3>");
    _builder.newLine();
    {
      boolean _noIntrinsicAttribute = table.noIntrinsicAttribute();
      if (_noIntrinsicAttribute) {
        _builder.append("\t");
        _builder.append("There are no intrinisic attributes.");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("<ul>");
        _builder.newLine();
        {
          List<ASDMAttribute> _intrinsic = table.getIntrinsic();
          for(final ASDMAttribute attr : _intrinsic) {
            _builder.append("\t");
            CharSequence _RowDef = this.RowDef(attr);
            _builder.append(_RowDef, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</ul>");
        _builder.newLine();
      }
    }
    _builder.append("<h3>Extrinsic Attributes:</h3>");
    _builder.newLine();
    {
      boolean _noExtrinsicAttribute = table.noExtrinsicAttribute();
      if (_noExtrinsicAttribute) {
        _builder.append("\t");
        _builder.append("There are no extrinisic attributes.");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("<ul>");
        _builder.newLine();
        {
          List<ASDMAttribute> _extrinsic = table.getExtrinsic();
          for(final ASDMAttribute attr_1 : _extrinsic) {
            _builder.append("\t");
            CharSequence _RowDef_1 = this.RowDef(attr_1);
            _builder.append(_RowDef_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</ul>");
        _builder.newLine();
      }
    }
    _builder.append("<h3>Keys:</h3>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t");
    List<ASDMAttribute> _keyAttributes = table.getKeyAttributes();
    CharSequence _KeyDef = this.KeyDef(((ASDMAttribute[])Conversions.unwrapArray(_keyAttributes, ASDMAttribute.class)));
    _builder.append(_KeyDef, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("<h3>Links to other tables:</h3>");
    _builder.newLine();
    {
      boolean _noLink = table.noLink();
      if (_noLink) {
        _builder.append("\t");
        _builder.append("There are no links to other tables.");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("<ul>");
        _builder.newLine();
        {
          List<ASDMAttribute> _link = table.getLink();
          for(final ASDMAttribute link : _link) {
            _builder.append("\t");
            CharSequence _LinkDef = this.LinkDef(link);
            _builder.append(_LinkDef, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</ul>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence RowDef(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
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
      } else {
        _builder.append("<li> (");
        String _JavaType_1 = attr.JavaType();
        _builder.append(_JavaType_1, "");
        _builder.append(") ");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence KeyDef(final ASDMAttribute[] attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li> key");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    {
      for(final ASDMAttribute key : attr) {
        _builder.append("<li>Field name: ");
        String _name = key.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence LinkDef(final ASDMAttribute linkAttr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isRefsToOne = linkAttr.isRefsToOne();
      if (_isRefsToOne) {
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      boolean _isOptional = linkAttr.isOptional();
      if (_isOptional) {
        CharSequence _CaseOptional = this.CaseOptional(linkAttr);
        _builder.append(_CaseOptional, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isRefsToMany = linkAttr.isRefsToMany();
      if (_isRefsToMany) {
        CharSequence _CaseMany = this.CaseMany();
        _builder.append(_CaseMany, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence CaseOne(final ASDMAttribute linkAttr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>One to one link from a row of ");
    String _tableName = linkAttr.getTableName();
    _builder.append(_tableName, "");
    _builder.append(" table to a row of ");
    String _refersTo = linkAttr.getRefersTo();
    _builder.append(_refersTo, "");
    _builder.append(" table using:");
    _builder.newLineIfNotEmpty();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("<li> (");
    String _JavaType = linkAttr.JavaType();
    _builder.append(_JavaType, "");
    _builder.append(") ");
    String _name = linkAttr.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence CaseOptional(final ASDMAttribute linkAttr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>Optional link from a row of ");
    String _tableName = linkAttr.getTableName();
    _builder.append(_tableName, "");
    _builder.append(" table to a row of ");
    String _refersTo = linkAttr.getRefersTo();
    _builder.append(_refersTo, "");
    _builder.append(" table using:");
    _builder.newLineIfNotEmpty();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("<li> (optional, ");
    String _JavaType = linkAttr.JavaType();
    _builder.append(_JavaType, "");
    _builder.append(") ");
    String _name = linkAttr.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence CaseMany() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
