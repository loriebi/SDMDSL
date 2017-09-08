package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import alma.hla.datamodel.meta.asdm.ExportEncoding;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableAttributeImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableLinksImpl;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class CppRowImpl {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    List<AlmaTable> _tables = this.container.getTables();
    for (final AlmaTable table : _tables) {
      {
        String _name = table.getName();
        String _plus = ("src/" + _name);
        String _plus_1 = (_plus + "Row.cpp");
        sdmFsa.setFile(_plus_1);
        CharSequence _generateCppRowImpl = this.generateCppRowImpl(table);
        sdmFsa.generateFile(_generateCppRowImpl);
      }
    }
  }
  
  public CharSequence generateCppRowImpl(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MA 02111-1307  USA");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Warning!");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  -------------------------------------------------------------------- ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* | This is generated code!  Do not modify this file.                  |");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* | If you do, all changes will be lost when the file is re-generated. |");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  --------------------------------------------------------------------");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File ");
    String _name = table.getName();
    _builder.append(_name, " ");
    _builder.append("Row.cpp");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#include <vector>");
    _builder.newLine();
    _builder.append("using std::vector;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <set>");
    _builder.newLine();
    _builder.append("using std::set;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <");
    String _name_1 = this.container.getName();
    _builder.append(_name_1, "");
    _builder.append(".h>");
    _builder.newLineIfNotEmpty();
    _builder.append("#include <");
    String _name_2 = table.getName();
    _builder.append(_name_2, "");
    _builder.append("Row.h>");
    _builder.newLineIfNotEmpty();
    _builder.append("#include <");
    String _name_3 = table.getName();
    _builder.append(_name_3, "");
    _builder.append("Table.h>");
    _builder.newLineIfNotEmpty();
    {
      List<ASDMAttribute> _link = table.getLink();
      for(final ASDMAttribute linkAttr : _link) {
        {
          String _refersTo = linkAttr.getRefersTo();
          String _name_4 = table.getName();
          boolean _equals = _refersTo.equals(_name_4);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("#include <");
            String _refersTo_1 = linkAttr.getRefersTo();
            _builder.append(_refersTo_1, "");
            _builder.append("Table.h>");
            _builder.newLineIfNotEmpty();
            _builder.append("#include <");
            String _refersTo_2 = linkAttr.getRefersTo();
            _builder.append(_refersTo_2, "");
            _builder.append("Row.h>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("using asdm::");
    String _name_5 = this.container.getName();
    _builder.append(_name_5, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("using asdm::");
    String _name_6 = table.getName();
    _builder.append(_name_6, "");
    _builder.append("Row;");
    _builder.newLineIfNotEmpty();
    _builder.append("using asdm::");
    String _name_7 = table.getName();
    _builder.append(_name_7, "");
    _builder.append("Table;");
    _builder.newLineIfNotEmpty();
    {
      List<ASDMAttribute> _link_1 = table.getLink();
      for(final ASDMAttribute linkAttr_1 : _link_1) {
        {
          String _refersTo_3 = linkAttr_1.getRefersTo();
          String _name_8 = table.getName();
          boolean _equals_1 = _refersTo_3.equals(_name_8);
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            _builder.append("using asdm::");
            String _refersTo_4 = linkAttr_1.getRefersTo();
            _builder.append(_refersTo_4, "");
            _builder.append("Table;");
            _builder.newLineIfNotEmpty();
            _builder.append("using asdm::");
            String _refersTo_5 = linkAttr_1.getRefersTo();
            _builder.append(_refersTo_5, "");
            _builder.append("Row;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("#include <Parser.h>");
    _builder.newLine();
    _builder.append("using asdm::Parser;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <EnumerationParser.h>");
    _builder.newLine();
    _builder.append("#include <ASDMValuesParser.h>");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#include <InvalidArgumentException.h>");
    _builder.newLine();
    _builder.append("using asdm::InvalidArgumentException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.append("\t");
    String _name_9 = table.getName();
    _builder.append(_name_9, "\t");
    _builder.append("Row::~");
    String _name_10 = table.getName();
    _builder.append(_name_10, "\t");
    _builder.append("Row() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Return the table to which this row belongs.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    String _name_11 = table.getName();
    _builder.append(_name_11, "\t");
    _builder.append("Table &");
    String _name_12 = table.getName();
    _builder.append(_name_12, "\t");
    _builder.append("Row::getTable() const {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return table;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bool ");
    String _name_13 = table.getName();
    _builder.append(_name_13, "\t");
    _builder.append("Row::isAdded() const {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return hasBeenAdded;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _name_14 = table.getName();
    _builder.append(_name_14, "\t");
    _builder.append("Row::isAdded(bool added) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("hasBeenAdded = added;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("#ifndef WITHOUT_ACS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("using asdmIDL::");
    String _name_15 = table.getName();
    _builder.append(_name_15, "\t");
    _builder.append("RowIDL;");
    _builder.newLineIfNotEmpty();
    _builder.append("#endif");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef WITHOUT_ACS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Return this row in the form of an IDL struct.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return The values of this row as a ");
    String _name_16 = table.getName();
    _builder.append(_name_16, "\t ");
    _builder.append("RowIDL struct.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    String _name_17 = table.getName();
    _builder.append(_name_17, "\t");
    _builder.append("RowIDL *");
    String _name_18 = table.getName();
    _builder.append(_name_18, "\t");
    _builder.append("Row::toIDL() const {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_19 = table.getName();
    _builder.append(_name_19, "\t\t");
    _builder.append("RowIDL *x = new ");
    String _name_20 = table.getName();
    _builder.append(_name_20, "\t\t");
    _builder.append("RowIDL ();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Fill the IDL structure.");
    _builder.newLine();
    {
      boolean _noIntrinsicAttribute = table.noIntrinsicAttribute();
      boolean _not_2 = (!_noIntrinsicAttribute);
      if (_not_2) {
        {
          List<ASDMAttribute> _intrinsic = table.getIntrinsic();
          for(final ASDMAttribute attr : _intrinsic) {
            _builder.append("\t");
            CharSequence _iDLDef = this.toIDLDef(attr);
            _builder.append(_iDLDef, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _noExtrinsicAttribute = table.noExtrinsicAttribute();
      boolean _not_3 = (!_noExtrinsicAttribute);
      if (_not_3) {
        {
          List<ASDMAttribute> _extrinsic = table.getExtrinsic();
          for(final ASDMAttribute attr_1 : _extrinsic) {
            _builder.append("\t");
            CharSequence _iDLDef_1 = this.toIDLDef(attr_1);
            _builder.append(_iDLDef_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      List<ASDMAttribute> _link_2 = table.getLink();
      for(final ASDMAttribute linkAttr_2 : _link_2) {
        _builder.append("\t\t");
        CharSequence _iDLLinks = this.toIDLLinks(linkAttr_2);
        _builder.append(_iDLLinks, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return x;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _name_21 = table.getName();
    _builder.append(_name_21, "\t");
    _builder.append("Row::toIDL(asdmIDL::");
    String _name_22 = table.getName();
    _builder.append(_name_22, "\t");
    _builder.append("RowIDL& x) const {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("// Set the x\'s fields.");
    _builder.newLine();
    {
      boolean _noIntrinsicAttribute_1 = table.noIntrinsicAttribute();
      boolean _not_4 = (!_noIntrinsicAttribute_1);
      if (_not_4) {
        {
          List<ASDMAttribute> _intrinsic_1 = table.getIntrinsic();
          for(final ASDMAttribute attr_2 : _intrinsic_1) {
            _builder.append("\t");
            CharSequence _iDLDefByRef = this.toIDLDefByRef(attr_2);
            _builder.append(_iDLDefByRef, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _noExtrinsicAttribute_1 = table.noExtrinsicAttribute();
      boolean _not_5 = (!_noExtrinsicAttribute_1);
      if (_not_5) {
        {
          List<ASDMAttribute> _extrinsic_1 = table.getExtrinsic();
          for(final ASDMAttribute attr_3 : _extrinsic_1) {
            _builder.append("\t");
            CharSequence _iDLDefByRef_1 = this.toIDLDefByRef(attr_3);
            _builder.append(_iDLDefByRef_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      List<ASDMAttribute> _link_3 = table.getLink();
      for(final ASDMAttribute linkAttr_3 : _link_3) {
        _builder.append("\t\t");
        CharSequence _iDLLinksByRef = this.toIDLLinksByRef(linkAttr_3);
        _builder.append(_iDLLinksByRef, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef WITHOUT_ACS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Fill the values of this row from the IDL struct ");
    String _name_23 = table.getName();
    _builder.append(_name_23, "\t ");
    _builder.append("RowIDL.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @param x The IDL struct containing the values used to fill this row.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _name_24 = table.getName();
    _builder.append(_name_24, "\t");
    _builder.append("Row::setFromIDL (");
    String _name_25 = table.getName();
    _builder.append(_name_25, "\t");
    _builder.append("RowIDL x){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Fill the values from x.");
    _builder.newLine();
    {
      boolean _noIntrinsicAttribute_2 = table.noIntrinsicAttribute();
      boolean _not_6 = (!_noIntrinsicAttribute_2);
      if (_not_6) {
        {
          List<ASDMAttribute> _intrinsic_2 = table.getIntrinsic();
          for(final ASDMAttribute attr_4 : _intrinsic_2) {
            _builder.append("\t");
            CharSequence _fromIDLDef = this.fromIDLDef(attr_4);
            _builder.append(_fromIDLDef, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _noExtrinsicAttribute_2 = table.noExtrinsicAttribute();
      boolean _not_7 = (!_noExtrinsicAttribute_2);
      if (_not_7) {
        {
          List<ASDMAttribute> _extrinsic_2 = table.getExtrinsic();
          for(final ASDMAttribute attr_5 : _extrinsic_2) {
            _builder.append("\t");
            CharSequence _fromIDLDef_1 = this.fromIDLDef(attr_5);
            _builder.append(_fromIDLDef_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      List<ASDMAttribute> _link_4 = table.getLink();
      for(final ASDMAttribute linkAttr_4 : _link_4) {
        _builder.append("\t\t");
        CharSequence _fromIDLLinks = this.fromIDLLinks(linkAttr_4);
        _builder.append(_fromIDLLinks, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("} catch (IllegalAccessException err) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw ConversionException (err.getMessage(),\"");
    String _name_26 = table.getName();
    _builder.append(_name_26, "\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Return this row in the form of an XML string.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return The values of this row as an XML string.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string ");
    String _name_27 = table.getName();
    _builder.append(_name_27, "\t");
    _builder.append("Row::toXML() const {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("string buf;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("buf.append(\"<row> \\n\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      boolean _noIntrinsicAttribute_3 = table.noIntrinsicAttribute();
      boolean _not_8 = (!_noIntrinsicAttribute_3);
      if (_not_8) {
        {
          List<ASDMAttribute> _intrinsic_3 = table.getIntrinsic();
          for(final ASDMAttribute attr_6 : _intrinsic_3) {
            _builder.append("\t");
            CharSequence _xMLAttributeName = this.toXMLAttributeName(attr_6);
            _builder.append(_xMLAttributeName, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _noExtrinsicAttribute_3 = table.noExtrinsicAttribute();
      boolean _not_9 = (!_noExtrinsicAttribute_3);
      if (_not_9) {
        {
          List<ASDMAttribute> _extrinsic_3 = table.getExtrinsic();
          for(final ASDMAttribute attr_7 : _extrinsic_3) {
            _builder.append("\t");
            CharSequence _xMLAttributeName_1 = this.toXMLAttributeName(attr_7);
            _builder.append(_xMLAttributeName_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      List<ASDMAttribute> _link_5 = table.getLink();
      for(final ASDMAttribute linkAttr_5 : _link_5) {
        _builder.append("\t\t");
        CharSequence _xMLAttributeLinks = this.toXMLAttributeLinks(linkAttr_5);
        _builder.append(_xMLAttributeLinks, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("buf.append(\"</row>\\n\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return buf;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Fill the values of this row from an XML string ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* that was produced by the toXML() method.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param x The XML string being used to set the values of this row.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _name_28 = table.getName();
    _builder.append(_name_28, "\t");
    _builder.append("Row::setFromXML (string rowDoc) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Parser row(rowDoc);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("string s = \"\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    {
      boolean _noIntrinsicAttribute_4 = table.noIntrinsicAttribute();
      boolean _not_10 = (!_noIntrinsicAttribute_4);
      if (_not_10) {
        {
          List<ASDMAttribute> _intrinsic_4 = table.getIntrinsic();
          for(final ASDMAttribute attr_8 : _intrinsic_4) {
            _builder.append("\t");
            CharSequence _fromXMLAttributeName = this.fromXMLAttributeName(attr_8);
            _builder.append(_fromXMLAttributeName, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _noExtrinsicAttribute_4 = table.noExtrinsicAttribute();
      boolean _not_11 = (!_noExtrinsicAttribute_4);
      if (_not_11) {
        {
          List<ASDMAttribute> _extrinsic_4 = table.getExtrinsic();
          for(final ASDMAttribute attr_9 : _extrinsic_4) {
            _builder.append("\t");
            CharSequence _fromXMLAttributeName_1 = this.fromXMLAttributeName(attr_9);
            _builder.append(_fromXMLAttributeName_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      List<ASDMAttribute> _link_6 = table.getLink();
      for(final ASDMAttribute linkAttr_6 : _link_6) {
        _builder.append("\t\t");
        CharSequence _fromXMLAttributeLinks = this.fromXMLAttributeLinks(linkAttr_6);
        _builder.append(_fromXMLAttributeLinks, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("} catch (IllegalAccessException err) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw ConversionException (err.getMessage(),\"");
    String _name_29 = table.getName();
    _builder.append(_name_29, "\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _name_30 = table.getName();
    _builder.append(_name_30, "\t");
    _builder.append("Row::toBin(EndianOSStream& eoss) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes = table.getRequiredAttributes();
      for(final ASDMAttribute attr_10 : _requiredAttributes) {
        _builder.append("\t");
        CharSequence _bin = this.toBin(attr_10);
        _builder.append(_bin, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_11 : _optionalValueAttributes) {
        _builder.append("\t");
        CharSequence _binOpt = this.toBinOpt(attr_11);
        _builder.append(_binOpt, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_1 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_12 : _requiredAttributes_1) {
        _builder.append("\t");
        CharSequence _binaryDeserialize = this.binaryDeserialize(table, attr_12, "EndianIStream", "eis");
        _builder.append(_binaryDeserialize, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_13 : _optionalValueAttributes_1) {
        _builder.append("\t");
        CharSequence _binaryDeserialize_1 = this.binaryDeserialize(table, attr_13, "EndianIStream", "eis");
        _builder.append(_binaryDeserialize_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    String _name_31 = table.getName();
    _builder.append(_name_31, "\t");
    _builder.append("Row* ");
    String _name_32 = table.getName();
    _builder.append(_name_32, "\t");
    _builder.append("Row::fromBin(EndianIStream& eis, ");
    String _name_33 = table.getName();
    _builder.append(_name_33, "\t");
    _builder.append("Table& table, const vector<string>& attributesSeq) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_34 = table.getName();
    _builder.append(_name_34, "\t\t");
    _builder.append("Row* row = new  ");
    String _name_35 = table.getName();
    _builder.append(_name_35, "\t\t");
    _builder.append("Row(table);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("map<string, ");
    String _name_36 = table.getName();
    _builder.append(_name_36, "\t\t");
    _builder.append("AttributeFromBin>::iterator iter ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for (unsigned int i = 0; i < attributesSeq.size(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("iter = row->fromBinMethods.find(attributesSeq.at(i));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (iter != row->fromBinMethods.end()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("(row->*(row->fromBinMethods[ attributesSeq.at(i) ] ))(eis);\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("BinaryAttributeReaderFunctor* functorP = table.getUnknownAttributeBinaryReader(attributesSeq.at(i));");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if (functorP)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("(*functorP)(eis);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("else");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("throw ConversionException(\"There is not method to read an attribute \'\"+attributesSeq.at(i)+\"\'.\", \"");
    String _name_37 = table.getName();
    _builder.append(_name_37, "\t\t\t\t\t");
    _builder.append("Table\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return row;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// A collection of methods to set the value of the attributes from their textual value in the XML representation");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// of one row.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_2 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_14 : _requiredAttributes_2) {
        _builder.append("\t");
        CharSequence _textDeserialize = this.textDeserialize(table, attr_14);
        _builder.append(_textDeserialize, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _optionalValueAttributes_2 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_15 : _optionalValueAttributes_2) {
        _builder.append("\t");
        CharSequence _textDeserialize_1 = this.textDeserialize(table, attr_15);
        _builder.append(_textDeserialize_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _name_38 = table.getName();
    _builder.append(_name_38, "\t");
    _builder.append("Row::fromText(const std::string& attributeName, const std::string&  t) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("map<string, ");
    String _name_39 = table.getName();
    _builder.append(_name_39, "\t\t");
    _builder.append("AttributeFromText>::iterator iter;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if ((iter = fromTextMethods.find(attributeName)) == fromTextMethods.end())");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw ConversionException(\"I do not know what to do with \'\"+attributeName+\"\' and its content \'\"+t+\"\' (while parsing an XML document)\", \"");
    String _name_40 = table.getName();
    _builder.append(_name_40, "\t\t\t");
    _builder.append("Table\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("(this->*(iter->second))(t);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Intrinsic Table Attributes getters/setters //");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("////////////////////////////////////////////////");
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_5 = table.getIntrinsic();
      for(final ASDMAttribute attr_16 : _intrinsic_5) {
        _builder.append("\t");
        CppTableAttributeImpl _cppTableAttributeImpl = new CppTableAttributeImpl();
        String _name_41 = table.getName();
        CharSequence _doGenerate = _cppTableAttributeImpl.doGenerate(_name_41, "Row", attr_16);
        _builder.append(_doGenerate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("///////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Extrinsic Table Attributes getters/setters//");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("///////////////////////////////////////////////");
    _builder.newLine();
    {
      List<ASDMAttribute> _extrinsic_5 = table.getExtrinsic();
      for(final ASDMAttribute attr_17 : _extrinsic_5) {
        _builder.append("\t");
        CppTableAttributeImpl _cppTableAttributeImpl_1 = new CppTableAttributeImpl();
        String _name_42 = table.getName();
        CharSequence _doGenerate_1 = _cppTableAttributeImpl_1.doGenerate(_name_42, "Row", attr_17);
        _builder.append(_doGenerate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Links Attributes getters/setters //");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//////////////////////////////////////");
    _builder.newLine();
    {
      List<ASDMAttribute> _link_7 = table.getLink();
      for(final ASDMAttribute linkAttr_7 : _link_7) {
        _builder.append("\t");
        CppTableLinksImpl _cppTableLinksImpl = new CppTableLinksImpl();
        CharSequence _doGenerate_2 = _cppTableLinksImpl.doGenerate(linkAttr_7);
        _builder.append(_doGenerate_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Create a ");
    String _name_43 = table.getName();
    _builder.append(_name_43, "\t ");
    _builder.append("Row.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* <p>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* This constructor is private because only the");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* table can create rows.  All rows know the table");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* to which they belong.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param table The table to which this row belongs.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/ ");
    _builder.newLine();
    _builder.append("\t");
    String _name_44 = table.getName();
    _builder.append(_name_44, "\t");
    _builder.append("Row::");
    String _name_45 = table.getName();
    _builder.append(_name_45, "\t");
    _builder.append("Row (");
    String _name_46 = table.getName();
    _builder.append(_name_46, "\t");
    _builder.append("Table &t) : table(t) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("hasBeenAdded = false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_6 = table.getIntrinsic();
      for(final ASDMAttribute attr_18 : _intrinsic_6) {
        _builder.append("\t");
        CharSequence _initializeOptional = this.initializeOptional(attr_18);
        _builder.append(_initializeOptional, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _extrinsic_6 = table.getExtrinsic();
      for(final ASDMAttribute attr_19 : _extrinsic_6) {
        _builder.append("\t");
        CharSequence _initializeOptional_1 = this.initializeOptional(attr_19);
        _builder.append(_initializeOptional_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_7 = table.getIntrinsic();
      for(final ASDMAttribute attr_20 : _intrinsic_7) {
        _builder.append("\t");
        CharSequence _initializeLiteral = this.initializeLiteral(attr_20);
        _builder.append(_initializeLiteral, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_3 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_21 : _requiredAttributes_3) {
        _builder.append("\t");
        _builder.append("fromBinMethods[\"");
        String _name_47 = attr_21.getName();
        _builder.append(_name_47, "\t");
        _builder.append("\"] = &");
        String _name_48 = table.getName();
        _builder.append(_name_48, "\t");
        _builder.append("Row::");
        String _name_49 = attr_21.getName();
        _builder.append(_name_49, "\t");
        _builder.append("FromBin; ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes_3 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_22 : _optionalValueAttributes_3) {
        _builder.append("\t");
        _builder.append("fromBinMethods[\"");
        String _name_50 = attr_22.getName();
        _builder.append(_name_50, "\t");
        _builder.append("\"] = &");
        String _name_51 = table.getName();
        _builder.append(_name_51, "\t");
        _builder.append("Row::");
        String _name_52 = attr_22.getName();
        _builder.append(_name_52, "\t");
        _builder.append("FromBin; ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_4 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_23 : _requiredAttributes_4) {
        {
          String _typeName = attr_23.getTypeName();
          boolean _equals_2 = _typeName.equals("EntityRef");
          boolean _not_12 = (!_equals_2);
          if (_not_12) {
            _builder.append("\t");
            _builder.append("fromTextMethods[\"");
            String _name_53 = attr_23.getName();
            _builder.append(_name_53, "\t");
            _builder.append("\"] = &");
            String _name_54 = table.getName();
            _builder.append(_name_54, "\t");
            _builder.append("Row::");
            String _name_55 = attr_23.getName();
            _builder.append(_name_55, "\t");
            _builder.append("FromText;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes_4 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_24 : _optionalValueAttributes_4) {
        {
          String _typeName_1 = attr_24.getTypeName();
          boolean _equals_3 = _typeName_1.equals("EntityRef");
          boolean _not_13 = (!_equals_3);
          if (_not_13) {
            _builder.append("\t");
            _builder.append("fromTextMethods[\"");
            String _name_56 = attr_24.getName();
            _builder.append(_name_56, "\t");
            _builder.append("\"] = &");
            String _name_57 = table.getName();
            _builder.append(_name_57, "\t");
            _builder.append("Row::");
            String _name_58 = attr_24.getName();
            _builder.append(_name_58, "\t");
            _builder.append("FromText;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    String _name_59 = table.getName();
    _builder.append(_name_59, "\t");
    _builder.append("Row::");
    String _name_60 = table.getName();
    _builder.append(_name_60, "\t");
    _builder.append("Row (");
    String _name_61 = table.getName();
    _builder.append(_name_61, "\t");
    _builder.append("Table &t, ");
    String _name_62 = table.getName();
    _builder.append(_name_62, "\t");
    _builder.append("Row &row) : table(t) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("hasBeenAdded = false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (&row == 0) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_8 = table.getIntrinsic();
      for(final ASDMAttribute attr_25 : _intrinsic_8) {
        _builder.append("\t");
        CharSequence _initializeOptional_2 = this.initializeOptional(attr_25);
        _builder.append(_initializeOptional_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _extrinsic_7 = table.getExtrinsic();
      for(final ASDMAttribute attr_26 : _extrinsic_7) {
        _builder.append("\t");
        CharSequence _initializeOptional_3 = this.initializeOptional(attr_26);
        _builder.append(_initializeOptional_3, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _keyAttributes = table.getKeyAttributes();
      for(final ASDMAttribute attr_27 : _keyAttributes) {
        _builder.append("\t\t");
        String _name_63 = attr_27.getName();
        _builder.append(_name_63, "\t\t");
        _builder.append(" = row.");
        String _name_64 = attr_27.getName();
        _builder.append(_name_64, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredValueAttributes = table.getRequiredValueAttributes();
      for(final ASDMAttribute attr_28 : _requiredValueAttributes) {
        _builder.append("\t\t");
        String _name_65 = attr_28.getName();
        _builder.append(_name_65, "\t\t");
        _builder.append(" = row.");
        String _name_66 = attr_28.getName();
        _builder.append(_name_66, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes_5 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_29 : _optionalValueAttributes_5) {
        _builder.append("\t\t");
        _builder.append("if (row.");
        String _name_67 = attr_29.getName();
        _builder.append(_name_67, "\t\t");
        _builder.append("Exists) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        String _name_68 = attr_29.getName();
        _builder.append(_name_68, "\t\t\t");
        _builder.append(" = row.");
        String _name_69 = attr_29.getName();
        _builder.append(_name_69, "\t\t\t");
        _builder.append(";\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        String _name_70 = attr_29.getName();
        _builder.append(_name_70, "\t\t\t");
        _builder.append("Exists = true;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("else");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        String _name_71 = attr_29.getName();
        _builder.append(_name_71, "\t\t\t");
        _builder.append("Exists = false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_5 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_30 : _requiredAttributes_5) {
        _builder.append("\t\t");
        _builder.append("fromBinMethods[\"");
        String _name_72 = attr_30.getName();
        _builder.append(_name_72, "\t\t");
        _builder.append("\"] = &");
        String _name_73 = table.getName();
        _builder.append(_name_73, "\t\t");
        _builder.append("Row::");
        String _name_74 = attr_30.getName();
        _builder.append(_name_74, "\t\t");
        _builder.append("FromBin; ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes_6 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_31 : _optionalValueAttributes_6) {
        _builder.append("\t\t");
        _builder.append("fromBinMethods[\"");
        String _name_75 = attr_31.getName();
        _builder.append(_name_75, "\t\t");
        _builder.append("\"] = &");
        String _name_76 = table.getName();
        _builder.append(_name_76, "\t\t");
        _builder.append("Row::");
        String _name_77 = attr_31.getName();
        _builder.append(_name_77, "\t\t");
        _builder.append("FromBin; ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredNoAutoIncrementableAttributes = table.getRequiredNoAutoIncrementableAttributes();
      int _size = _requiredNoAutoIncrementableAttributes.size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("bool ");
        String _name_78 = table.getName();
        _builder.append(_name_78, "\t");
        _builder.append("Row::compareNoAutoInc(");
        String _RequiredNoAutoIncrementableCpp = table.RequiredNoAutoIncrementableCpp();
        _builder.append(_RequiredNoAutoIncrementableCpp, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("bool result;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("result = true;");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredNoAutoIncrementableAttributes_1 = table.getRequiredNoAutoIncrementableAttributes();
          for(final ASDMAttribute attr_32 : _requiredNoAutoIncrementableAttributes_1) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _compareAttribute = this.compareAttribute(attr_32);
            _builder.append(_compareAttribute, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return result;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredValueAttributes_1 = table.getRequiredValueAttributes();
      int _size_1 = _requiredValueAttributes_1.size();
      boolean _notEquals_1 = (_size_1 != 0);
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("bool ");
        String _name_79 = table.getName();
        _builder.append(_name_79, "\t");
        _builder.append("Row::compareRequiredValue(");
        String _RequiredValueCpp = table.RequiredValueCpp();
        _builder.append(_RequiredValueCpp, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("bool result;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("result = true;");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredValueAttributes_2 = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_33 : _requiredValueAttributes_2) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _compareAttributeExactly = this.compareAttributeExactly(attr_33);
            _builder.append(_compareAttributeExactly, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return result;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Return true if all required attributes of the value part are equal to their homologues");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* in x and false otherwise.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredValueAttributes_3 = table.getRequiredValueAttributes();
      int _size_2 = _requiredValueAttributes_3.size();
      boolean _notEquals_2 = (_size_2 != 0);
      if (_notEquals_2) {
        _builder.append("* @param x a pointer on the ");
        String _name_80 = table.getName();
        _builder.append(_name_80, "");
        _builder.append("Row whose required attributes of the value part ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t ");
    _builder.append("* will be compared with those of this.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return a boolean.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bool ");
    String _name_81 = table.getName();
    _builder.append(_name_81, "\t");
    _builder.append("Row::equalByRequiredValue(");
    String _name_82 = table.getName();
    _builder.append(_name_82, "\t");
    _builder.append("Row* ");
    {
      List<ASDMAttribute> _requiredValueAttributes_4 = table.getRequiredValueAttributes();
      int _size_3 = _requiredValueAttributes_4.size();
      boolean _notEquals_3 = (_size_3 != 0);
      if (_notEquals_3) {
        _builder.append(" x ");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      List<ASDMAttribute> _requiredValueAttributes_5 = table.getRequiredValueAttributes();
      int _size_4 = _requiredValueAttributes_5.size();
      boolean _notEquals_4 = (_size_4 != 0);
      if (_notEquals_4) {
        {
          List<ASDMAttribute> _requiredValueAttributes_6 = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_34 : _requiredValueAttributes_6) {
            _builder.append("\t\t");
            _builder.append("if (this->");
            String _name_83 = attr_34.getName();
            _builder.append(_name_83, "\t\t");
            _builder.append(" != x->");
            String _name_84 = attr_34.getName();
            _builder.append(_name_84, "\t\t");
            _builder.append(") return false;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("map<string, ");
    String _name_85 = table.getName();
    _builder.append(_name_85, "\t ");
    _builder.append("AttributeFromBin> ");
    String _name_86 = table.getName();
    _builder.append(_name_86, "\t ");
    _builder.append("Row::initFromBinMethods() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("map<string, ");
    String _name_87 = table.getName();
    _builder.append(_name_87, "\t\t");
    _builder.append("AttributeFromBin> result;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_6 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_35 : _requiredAttributes_6) {
        _builder.append("\t\t");
        _builder.append("result[\"");
        String _name_88 = attr_35.getName();
        _builder.append(_name_88, "\t\t");
        _builder.append("\"] = &");
        String _name_89 = table.getName();
        _builder.append(_name_89, "\t\t");
        _builder.append("Row::");
        String _name_90 = attr_35.getName();
        _builder.append(_name_90, "\t\t");
        _builder.append("FromBin;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes_7 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_36 : _optionalValueAttributes_7) {
        _builder.append("\t\t");
        _builder.append("result[\"");
        String _name_91 = attr_36.getName();
        _builder.append(_name_91, "\t\t");
        _builder.append("\"] = &");
        String _name_92 = table.getName();
        _builder.append(_name_92, "\t\t");
        _builder.append("Row::");
        String _name_93 = attr_36.getName();
        _builder.append(_name_93, "\t\t");
        _builder.append("FromBin;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return result;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("}// End namespace asdm");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toIDLDef(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isSet = attr.isSet();
      if (_isSet) {
        _builder.newLine();
        {
          boolean _isExtrinsic = attr.isExtrinsic();
          if (_isExtrinsic) {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("x->");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.append(".length(");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "");
            _builder.append(".size());");
            _builder.newLineIfNotEmpty();
            {
              boolean _isExtendedType = attr.isExtendedType();
              if (_isExtendedType) {
                String _CppType = attr.CppType();
                _builder.append(_CppType, "");
                _builder.append("::iterator iter;");
                _builder.newLineIfNotEmpty();
                _builder.append("int i = 0;");
                _builder.newLine();
                _builder.append("for (iter=");
                String _name_2 = attr.getName();
                _builder.append(_name_2, "");
                _builder.append(".begin(); iter!=");
                String _name_3 = attr.getName();
                _builder.append(_name_3, "");
                _builder.append(".end(); iter++)");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("x->");
                String _name_4 = attr.getName();
                _builder.append(_name_4, "\t");
                _builder.append("[i++] = (*iter).toIDL");
                String _SimpleCppType = attr.SimpleCppType();
                _builder.append(_SimpleCppType, "\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              } else {
                String _CppType_1 = attr.CppType();
                _builder.append(_CppType_1, "");
                _builder.append("::iterator iter;");
                _builder.newLineIfNotEmpty();
                _builder.append("int i = 0;");
                _builder.newLine();
                _builder.append("for (iter=");
                String _name_5 = attr.getName();
                _builder.append(_name_5, "");
                _builder.append(".begin(); iter!=");
                String _name_6 = attr.getName();
                _builder.append(_name_6, "");
                _builder.append(".end(); iter++)");
                _builder.newLineIfNotEmpty();
                {
                  String _SimpleCppType_1 = attr.SimpleCppType();
                  boolean _equals = Objects.equal(_SimpleCppType_1, "string");
                  if (_equals) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("x->");
                    String _name_7 = attr.getName();
                    _builder.append(_name_7, "\t");
                    _builder.append("[i] = CORBA::string_dup((*iter).c_str());");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("x->");
                    String _name_8 = attr.getName();
                    _builder.append(_name_8, "\t");
                    _builder.append("[i] = *iter;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          } else {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
          }
        }
      } else {
        boolean _isExtrinsic_1 = attr.isExtrinsic();
        if (_isExtrinsic_1) {
          _builder.newLine();
          {
            boolean _isOptional = attr.isOptional();
            if (_isOptional) {
              _builder.newLine();
              _builder.append("x->");
              String _name_9 = attr.getName();
              _builder.append(_name_9, "");
              _builder.append("Exists = ");
              String _name_10 = attr.getName();
              _builder.append(_name_10, "");
              _builder.append("Exists;");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            boolean _isArray = attr.isArray();
            if (_isArray) {
              _builder.newLine();
              _builder.append("x->");
              String _name_11 = attr.getName();
              _builder.append(_name_11, "");
              _builder.append(".length(");
              String _name_12 = attr.getName();
              _builder.append(_name_12, "");
              _builder.append(".size());");
              _builder.newLineIfNotEmpty();
              _builder.append("for (unsigned int i = 0; i < ");
              String _name_13 = attr.getName();
              _builder.append(_name_13, "");
              _builder.append(".size(); ++i) {");
              _builder.newLineIfNotEmpty();
              {
                boolean _isExtendedType_1 = attr.isExtendedType();
                if (_isExtendedType_1) {
                  _builder.append("\t");
                  _builder.append("x->");
                  String _name_14 = attr.getName();
                  _builder.append(_name_14, "\t");
                  _builder.append("[i] = ");
                  String _name_15 = attr.getName();
                  _builder.append(_name_15, "\t");
                  _builder.append(".at(i).toIDL");
                  String _SimpleCppType_2 = attr.SimpleCppType();
                  _builder.append(_SimpleCppType_2, "\t");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    String _SimpleCppType_3 = attr.SimpleCppType();
                    boolean _equals_1 = _SimpleCppType_3.equals("string");
                    if (_equals_1) {
                      _builder.append("\t");
                      _builder.append("x->");
                      String _name_16 = attr.getName();
                      _builder.append(_name_16, "\t");
                      _builder.append("[i] = CORBA::string_dup(");
                      String _name_17 = attr.getName();
                      _builder.append(_name_17, "\t");
                      _builder.append(".at(i).c_str());");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t");
                      _builder.append("x->");
                      String _name_18 = attr.getName();
                      _builder.append(_name_18, "\t");
                      _builder.append("[i] = ");
                      String _name_19 = attr.getName();
                      _builder.append(_name_19, "\t");
                      _builder.append(".at(i);");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("}");
              _builder.newLine();
            } else {
              _builder.newLine();
              {
                boolean _isExtendedType_2 = attr.isExtendedType();
                if (_isExtendedType_2) {
                  _builder.append("x->");
                  String _name_20 = attr.getName();
                  _builder.append(_name_20, "");
                  _builder.append(" = ");
                  String _name_21 = attr.getName();
                  _builder.append(_name_21, "");
                  _builder.append(".toIDL");
                  String _JavaType = attr.JavaType();
                  _builder.append(_JavaType, "");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    String _SimpleCppType_4 = attr.SimpleCppType();
                    boolean _equals_2 = _SimpleCppType_4.equals("string");
                    if (_equals_2) {
                      _builder.append("x->");
                      String _name_22 = attr.getName();
                      _builder.append(_name_22, "");
                      _builder.append(" = CORBA::string_dup(");
                      String _name_23 = attr.getName();
                      _builder.append(_name_23, "");
                      _builder.append(".c_str());");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("x->");
                      String _name_24 = attr.getName();
                      _builder.append(_name_24, "");
                      _builder.append(" = ");
                      String _name_25 = attr.getName();
                      _builder.append(_name_25, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        } else {
          _builder.newLine();
          {
            boolean _isOptional_1 = attr.isOptional();
            if (_isOptional_1) {
              _builder.append("x->");
              String _name_26 = attr.getName();
              _builder.append(_name_26, "");
              _builder.append("Exists = ");
              String _name_27 = attr.getName();
              _builder.append(_name_27, "");
              _builder.append("Exists;");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            boolean _isArray_1 = attr.isArray();
            if (_isArray_1) {
              {
                int _dimension = attr.getDimension();
                boolean _equals_3 = (_dimension == 1);
                if (_equals_3) {
                  _builder.append("x->");
                  String _name_28 = attr.getName();
                  _builder.append(_name_28, "");
                  _builder.append(".length(");
                  String _name_29 = attr.getName();
                  _builder.append(_name_29, "");
                  _builder.append(".size());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("for (unsigned int i = 0; i < ");
                  String _name_30 = attr.getName();
                  _builder.append(_name_30, "");
                  _builder.append(".size(); ++i) {");
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _isExtendedType_3 = attr.isExtendedType();
                    if (_isExtendedType_3) {
                      _builder.append("\t");
                      _builder.append("x->");
                      String _name_31 = attr.getName();
                      _builder.append(_name_31, "\t");
                      _builder.append("[i] = ");
                      String _name_32 = attr.getName();
                      _builder.append(_name_32, "\t");
                      _builder.append(".at(i).toIDL");
                      String _SimpleCppType_5 = attr.SimpleCppType();
                      _builder.append(_SimpleCppType_5, "\t");
                      _builder.append("();");
                      _builder.newLineIfNotEmpty();
                    } else {
                      {
                        String _SimpleCppType_6 = attr.SimpleCppType();
                        boolean _equals_4 = _SimpleCppType_6.equals("string");
                        if (_equals_4) {
                          _builder.append("\t");
                          _builder.append("x->");
                          String _name_33 = attr.getName();
                          _builder.append(_name_33, "\t");
                          _builder.append("[i] = CORBA::string_dup(");
                          String _name_34 = attr.getName();
                          _builder.append(_name_34, "\t");
                          _builder.append(".at(i).c_str());");
                          _builder.newLineIfNotEmpty();
                        } else {
                          _builder.append("\t");
                          _builder.append("x->");
                          String _name_35 = attr.getName();
                          _builder.append(_name_35, "\t");
                          _builder.append("[i] = ");
                          String _name_36 = attr.getName();
                          _builder.append(_name_36, "\t");
                          _builder.append(".at(i);");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  int _dimension_1 = attr.getDimension();
                  boolean _equals_5 = (_dimension_1 == 2);
                  if (_equals_5) {
                    _builder.append("x->");
                    String _name_37 = attr.getName();
                    _builder.append(_name_37, "");
                    _builder.append(".length(");
                    String _name_38 = attr.getName();
                    _builder.append(_name_38, "");
                    _builder.append(".size());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("for (unsigned int i = 0; i < ");
                    String _name_39 = attr.getName();
                    _builder.append(_name_39, "");
                    _builder.append(".size(); i++) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("x->");
                    String _name_40 = attr.getName();
                    _builder.append(_name_40, "\t");
                    _builder.append("[i].length(");
                    String _name_41 = attr.getName();
                    _builder.append(_name_41, "\t");
                    _builder.append(".at(i).size());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                    _builder.newLine();
                    _builder.append("for (unsigned int i = 0; i < ");
                    String _name_42 = attr.getName();
                    _builder.append(_name_42, "");
                    _builder.append(".size() ; i++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for (unsigned int j = 0; j < ");
                    String _name_43 = attr.getName();
                    _builder.append(_name_43, "\t");
                    _builder.append(".at(i).size(); j++)");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _isExtendedType_4 = attr.isExtendedType();
                      if (_isExtendedType_4) {
                        _builder.append("\t\t");
                        _builder.append("x->");
                        String _name_44 = attr.getName();
                        _builder.append(_name_44, "\t\t");
                        _builder.append("[i][j]= ");
                        String _name_45 = attr.getName();
                        _builder.append(_name_45, "\t\t");
                        _builder.append(".at(i).at(j).toIDL");
                        String _SimpleCppType_7 = attr.SimpleCppType();
                        _builder.append(_SimpleCppType_7, "\t\t");
                        _builder.append("();");
                        _builder.newLineIfNotEmpty();
                      } else {
                        {
                          String _SimpleCppType_8 = attr.SimpleCppType();
                          boolean _equals_6 = _SimpleCppType_8.equals("string");
                          if (_equals_6) {
                            _builder.append("\t\t");
                            _builder.append("x->");
                            String _name_46 = attr.getName();
                            _builder.append(_name_46, "\t\t");
                            _builder.append("[i][j] = CORBA::string_dup(");
                            String _name_47 = attr.getName();
                            _builder.append(_name_47, "\t\t");
                            _builder.append(".at(i).at(j).c_str());");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t\t");
                            _builder.append("x->");
                            String _name_48 = attr.getName();
                            _builder.append(_name_48, "\t\t");
                            _builder.append("[i][j] = ");
                            String _name_49 = attr.getName();
                            _builder.append(_name_49, "\t\t");
                            _builder.append(".at(i).at(j);");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  } else {
                    int _dimension_2 = attr.getDimension();
                    boolean _equals_7 = (_dimension_2 == 3);
                    if (_equals_7) {
                      _builder.append("x->");
                      String _name_50 = attr.getName();
                      _builder.append(_name_50, "");
                      _builder.append(".length(");
                      String _name_51 = attr.getName();
                      _builder.append(_name_51, "");
                      _builder.append(".size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("for (unsigned int i = 0; i < ");
                      String _name_52 = attr.getName();
                      _builder.append(_name_52, "");
                      _builder.append(".size(); i++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("x->");
                      String _name_53 = attr.getName();
                      _builder.append(_name_53, "\t");
                      _builder.append("[i].length(");
                      String _name_54 = attr.getName();
                      _builder.append(_name_54, "\t");
                      _builder.append(".at(i).size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (unsigned int j = 0; j < ");
                      String _name_55 = attr.getName();
                      _builder.append(_name_55, "\t");
                      _builder.append(".at(i).size(); j++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("x->");
                      String _name_56 = attr.getName();
                      _builder.append(_name_56, "\t\t");
                      _builder.append("[i][j].length(");
                      String _name_57 = attr.getName();
                      _builder.append(_name_57, "\t\t");
                      _builder.append(".at(i).at(j).size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("}\t\t\t\t\t \t\t");
                      _builder.newLine();
                      _builder.append("}");
                      _builder.newLine();
                      _builder.newLine();
                      _builder.append("for (unsigned int i = 0; i < ");
                      String _name_58 = attr.getName();
                      _builder.append(_name_58, "");
                      _builder.append(".size() ; i++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (unsigned int j = 0; j < ");
                      String _name_59 = attr.getName();
                      _builder.append(_name_59, "\t");
                      _builder.append(".at(i).size(); j++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("for (unsigned int k = 0; k < ");
                      String _name_60 = attr.getName();
                      _builder.append(_name_60, "\t\t");
                      _builder.append(".at(i).at(j).size(); k++)");
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _isExtendedType_5 = attr.isExtendedType();
                        if (_isExtendedType_5) {
                          _builder.append("\t\t\t");
                          _builder.append("x->");
                          String _name_61 = attr.getName();
                          _builder.append(_name_61, "\t\t\t");
                          _builder.append("[i][j][k] = ");
                          String _name_62 = attr.getName();
                          _builder.append(_name_62, "\t\t\t");
                          _builder.append(".at(i).at(j).at(k).toIDL");
                          String _SimpleCppType_9 = attr.SimpleCppType();
                          _builder.append(_SimpleCppType_9, "\t\t\t");
                          _builder.append("();");
                          _builder.newLineIfNotEmpty();
                        } else {
                          {
                            String _SimpleCppType_10 = attr.SimpleCppType();
                            boolean _equals_8 = _SimpleCppType_10.equals("string");
                            if (_equals_8) {
                              _builder.append("\t\t\t");
                              _builder.append("x->");
                              String _name_63 = attr.getName();
                              _builder.append(_name_63, "\t\t\t");
                              _builder.append("[i][j][k] = CORBA::string_dup(");
                              String _name_64 = attr.getName();
                              _builder.append(_name_64, "\t\t\t");
                              _builder.append(".at(i).at(j).at(k).c_str());");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t\t");
                              _builder.append("x->");
                              String _name_65 = attr.getName();
                              _builder.append(_name_65, "\t\t\t");
                              _builder.append("[i][j][k] = ");
                              String _name_66 = attr.getName();
                              _builder.append(_name_66, "\t\t\t");
                              _builder.append(".at(i).at(j).at(k);");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    } else {
                      int _dimension_3 = attr.getDimension();
                      boolean _equals_9 = (_dimension_3 == 4);
                      if (_equals_9) {
                        _builder.append("x->");
                        String _name_67 = attr.getName();
                        _builder.append(_name_67, "");
                        _builder.append(".length(");
                        String _name_68 = attr.getName();
                        _builder.append(_name_68, "");
                        _builder.append(".size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("for (unsigned int i = 0; i < ");
                        String _name_69 = attr.getName();
                        _builder.append(_name_69, "");
                        _builder.append(".size(); i++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("x->");
                        String _name_70 = attr.getName();
                        _builder.append(_name_70, "\t");
                        _builder.append("[i].length(");
                        String _name_71 = attr.getName();
                        _builder.append(_name_71, "\t");
                        _builder.append(".at(i).size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("for (unsigned int j = 0; j < ");
                        String _name_72 = attr.getName();
                        _builder.append(_name_72, "\t");
                        _builder.append(".at(i).size(); j++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("x->");
                        String _name_73 = attr.getName();
                        _builder.append(_name_73, "\t\t");
                        _builder.append("[i][j].length(");
                        String _name_74 = attr.getName();
                        _builder.append(_name_74, "\t\t");
                        _builder.append(".at(i).at(j).size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (unsigned int k = 0; k < ");
                        String _name_75 = attr.getName();
                        _builder.append(_name_75, "\t\t");
                        _builder.append(".at(i).at(j).size(); k++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t ");
                        _builder.append("x->");
                        String _name_76 = attr.getName();
                        _builder.append(_name_76, "\t\t\t ");
                        _builder.append("[i][j][k].length(");
                        String _name_77 = attr.getName();
                        _builder.append(_name_77, "\t\t\t ");
                        _builder.append(".at(i).at(j).at(k).size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t   ");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("}\t\t\t\t\t \t\t");
                        _builder.newLine();
                        _builder.append("}");
                        _builder.newLine();
                        _builder.newLine();
                        _builder.append("for (unsigned int i = 0; i < ");
                        String _name_78 = attr.getName();
                        _builder.append(_name_78, "");
                        _builder.append(".size() ; i++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("for (unsigned int j = 0; j < ");
                        String _name_79 = attr.getName();
                        _builder.append(_name_79, "\t");
                        _builder.append(".at(i).size(); j++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (unsigned int k = 0; k < ");
                        String _name_80 = attr.getName();
                        _builder.append(_name_80, "\t\t");
                        _builder.append(".at(i).at(j).size(); k++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("for (unsigned int l = 0; l < ");
                        String _name_81 = attr.getName();
                        _builder.append(_name_81, "\t\t\t");
                        _builder.append(".at(i).at(j).at(k).size(); l++)");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isExtendedType_6 = attr.isExtendedType();
                          if (_isExtendedType_6) {
                            _builder.append("\t\t\t");
                            _builder.append("x->");
                            String _name_82 = attr.getName();
                            _builder.append(_name_82, "\t\t\t");
                            _builder.append("[i][j][k][l] = ");
                            String _name_83 = attr.getName();
                            _builder.append(_name_83, "\t\t\t");
                            _builder.append(".at(i).at(j).at(k).at(l).toIDL");
                            String _SimpleCppType_11 = attr.SimpleCppType();
                            _builder.append(_SimpleCppType_11, "\t\t\t");
                            _builder.append("();");
                            _builder.newLineIfNotEmpty();
                          } else {
                            {
                              String _SimpleCppType_12 = attr.SimpleCppType();
                              boolean _equals_10 = _SimpleCppType_12.equals("string");
                              if (_equals_10) {
                                _builder.append("\t\t\t");
                                _builder.append("x->");
                                String _name_84 = attr.getName();
                                _builder.append(_name_84, "\t\t\t");
                                _builder.append("[i][j][k][l] = CORBA::string_dup(");
                                String _name_85 = attr.getName();
                                _builder.append(_name_85, "\t\t\t");
                                _builder.append(".at(i).at(j).at(k).at(l).c_str());");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t\t");
                                _builder.append("x->");
                                String _name_86 = attr.getName();
                                _builder.append(_name_86, "\t\t\t");
                                _builder.append("[i][j][k][l] = ");
                                String _name_87 = attr.getName();
                                _builder.append(_name_87, "\t\t\t");
                                _builder.append(".at(i).at(j).at(k).at(l);");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                        _builder.append(" ");
                        _builder.append("cout << \"Converted successfully\" << endl;");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            } else {
              {
                boolean _isExtendedType_7 = attr.isExtendedType();
                if (_isExtendedType_7) {
                  _builder.append("x->");
                  String _name_88 = attr.getName();
                  _builder.append(_name_88, "");
                  _builder.append(" = ");
                  String _name_89 = attr.getName();
                  _builder.append(_name_89, "");
                  _builder.append(".toIDL");
                  String _JavaType_1 = attr.JavaType();
                  _builder.append(_JavaType_1, "");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    String _SimpleCppType_13 = attr.SimpleCppType();
                    boolean _equals_11 = _SimpleCppType_13.equals("string");
                    if (_equals_11) {
                      _builder.append("x->");
                      String _name_90 = attr.getName();
                      _builder.append(_name_90, "");
                      _builder.append(" = CORBA::string_dup(");
                      String _name_91 = attr.getName();
                      _builder.append(_name_91, "");
                      _builder.append(".c_str());");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("x->");
                      String _name_92 = attr.getName();
                      _builder.append(_name_92, "");
                      _builder.append(" = ");
                      String _name_93 = attr.getName();
                      _builder.append(_name_93, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toIDLLinks(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toIDLDefByRef(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isSet = attr.isSet();
      if (_isSet) {
        _builder.newLine();
        {
          boolean _isExtrinsic = attr.isExtrinsic();
          if (_isExtrinsic) {
            _builder.newLine();
            _builder.append("x.");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.append(".length(");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "");
            _builder.append(".size());");
            _builder.newLineIfNotEmpty();
            {
              boolean _isExtendedType = attr.isExtendedType();
              if (_isExtendedType) {
                _builder.newLine();
                String _CppType = attr.CppType();
                _builder.append(_CppType, "");
                _builder.append("::iterator iter;");
                _builder.newLineIfNotEmpty();
                _builder.append("int i = 0;");
                _builder.newLine();
                _builder.append("for (iter=");
                String _name_2 = attr.getName();
                _builder.append(_name_2, "");
                _builder.append(".begin(); iter!=");
                String _name_3 = attr.getName();
                _builder.append(_name_3, "");
                _builder.append(".end(); iter++)");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("x.");
                String _name_4 = attr.getName();
                _builder.append(_name_4, "\t");
                _builder.append("[i++] = (*iter).toIDL");
                String _SimpleCppType = attr.SimpleCppType();
                _builder.append(_SimpleCppType, "\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.newLine();
                String _CppType_1 = attr.CppType();
                _builder.append(_CppType_1, "");
                _builder.append("::iterator iter;");
                _builder.newLineIfNotEmpty();
                _builder.append("int i = 0;");
                _builder.newLine();
                _builder.append("for (iter=");
                String _name_5 = attr.getName();
                _builder.append(_name_5, "");
                _builder.append(".begin(); iter!=");
                String _name_6 = attr.getName();
                _builder.append(_name_6, "");
                _builder.append(".end(); iter++)");
                _builder.newLineIfNotEmpty();
                {
                  String _SimpleCppType_1 = attr.SimpleCppType();
                  boolean _equals = _SimpleCppType_1.equals("string");
                  if (_equals) {
                    _builder.append("\t");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("x.");
                    String _name_7 = attr.getName();
                    _builder.append(_name_7, "\t");
                    _builder.append("[i] = CORBA::string_dup((*iter).c_str());");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("x.");
                    String _name_8 = attr.getName();
                    _builder.append(_name_8, "\t");
                    _builder.append("[i] = *iter;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          } else {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.newLine();
      } else {
        boolean _isExtrinsic_1 = attr.isExtrinsic();
        if (_isExtrinsic_1) {
          _builder.newLine();
          {
            boolean _isOptional = attr.isOptional();
            if (_isOptional) {
              _builder.newLine();
              _builder.append("x.");
              String _name_9 = attr.getName();
              _builder.append(_name_9, "");
              _builder.append("Exists = ");
              String _name_10 = attr.getName();
              _builder.append(_name_10, "");
              _builder.append("Exists;");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            boolean _isArray = attr.isArray();
            if (_isArray) {
              _builder.newLine();
              _builder.append("x.");
              String _name_11 = attr.getName();
              _builder.append(_name_11, "");
              _builder.append(".length(");
              String _name_12 = attr.getName();
              _builder.append(_name_12, "");
              _builder.append(".size());");
              _builder.newLineIfNotEmpty();
              _builder.append("for (unsigned int i = 0; i < ");
              String _name_13 = attr.getName();
              _builder.append(_name_13, "");
              _builder.append(".size(); ++i) {");
              _builder.newLineIfNotEmpty();
              {
                boolean _isExtendedType_1 = attr.isExtendedType();
                if (_isExtendedType_1) {
                  _builder.append("\t");
                  _builder.append("x.");
                  String _name_14 = attr.getName();
                  _builder.append(_name_14, "\t");
                  _builder.append("[i] = ");
                  String _name_15 = attr.getName();
                  _builder.append(_name_15, "\t");
                  _builder.append(".at(i).toIDL");
                  String _SimpleCppType_2 = attr.SimpleCppType();
                  _builder.append(_SimpleCppType_2, "\t");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    String _SimpleCppType_3 = attr.SimpleCppType();
                    boolean _equals_1 = _SimpleCppType_3.equals("string");
                    if (_equals_1) {
                      _builder.append("\t");
                      _builder.append("x.");
                      String _name_16 = attr.getName();
                      _builder.append(_name_16, "\t");
                      _builder.append("[i] = CORBA::string_dup(");
                      String _name_17 = attr.getName();
                      _builder.append(_name_17, "\t");
                      _builder.append(".at(i).c_str());");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t");
                      _builder.append("x.");
                      String _name_18 = attr.getName();
                      _builder.append(_name_18, "\t");
                      _builder.append("[i] = ");
                      String _name_19 = attr.getName();
                      _builder.append(_name_19, "\t");
                      _builder.append(".at(i);");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("}");
              _builder.newLine();
            } else {
              _builder.newLine();
              {
                boolean _isExtendedType_2 = attr.isExtendedType();
                if (_isExtendedType_2) {
                  _builder.append("x.");
                  String _name_20 = attr.getName();
                  _builder.append(_name_20, "");
                  _builder.append(" = ");
                  String _name_21 = attr.getName();
                  _builder.append(_name_21, "");
                  _builder.append(".toIDL");
                  String _JavaType = attr.JavaType();
                  _builder.append(_JavaType, "");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    String _SimpleCppType_4 = attr.SimpleCppType();
                    boolean _equals_2 = _SimpleCppType_4.equals("string");
                    if (_equals_2) {
                      _builder.append("x.");
                      String _name_22 = attr.getName();
                      _builder.append(_name_22, "");
                      _builder.append(" = CORBA::string_dup(");
                      String _name_23 = attr.getName();
                      _builder.append(_name_23, "");
                      _builder.append(".c_str());");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("x.");
                      String _name_24 = attr.getName();
                      _builder.append(_name_24, "");
                      _builder.append(" = ");
                      String _name_25 = attr.getName();
                      _builder.append(_name_25, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        } else {
          _builder.newLine();
          {
            boolean _isOptional_1 = attr.isOptional();
            if (_isOptional_1) {
              _builder.append("x.");
              String _name_26 = attr.getName();
              _builder.append(_name_26, "");
              _builder.append("Exists = ");
              String _name_27 = attr.getName();
              _builder.append(_name_27, "");
              _builder.append("Exists;");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            boolean _isArray_1 = attr.isArray();
            if (_isArray_1) {
              {
                int _dimension = attr.getDimension();
                boolean _equals_3 = (_dimension == 1);
                if (_equals_3) {
                  _builder.append("x.");
                  String _name_28 = attr.getName();
                  _builder.append(_name_28, "");
                  _builder.append(".length(");
                  String _name_29 = attr.getName();
                  _builder.append(_name_29, "");
                  _builder.append(".size());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("for (unsigned int i = 0; i < ");
                  String _name_30 = attr.getName();
                  _builder.append(_name_30, "");
                  _builder.append(".size(); ++i) {");
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _isExtendedType_3 = attr.isExtendedType();
                    if (_isExtendedType_3) {
                      _builder.append("\t");
                      _builder.append("x.");
                      String _name_31 = attr.getName();
                      _builder.append(_name_31, "\t");
                      _builder.append("[i] = ");
                      String _name_32 = attr.getName();
                      _builder.append(_name_32, "\t");
                      _builder.append(".at(i).toIDL");
                      String _SimpleCppType_5 = attr.SimpleCppType();
                      _builder.append(_SimpleCppType_5, "\t");
                      _builder.append("();");
                      _builder.newLineIfNotEmpty();
                    } else {
                      {
                        String _SimpleCppType_6 = attr.SimpleCppType();
                        boolean _equals_4 = _SimpleCppType_6.equals("string");
                        if (_equals_4) {
                          _builder.append("\t");
                          _builder.append("x.");
                          String _name_33 = attr.getName();
                          _builder.append(_name_33, "\t");
                          _builder.append("[i] = CORBA::string_dup(");
                          String _name_34 = attr.getName();
                          _builder.append(_name_34, "\t");
                          _builder.append(".at(i).c_str());");
                          _builder.newLineIfNotEmpty();
                        } else {
                          _builder.append("\t");
                          _builder.append("x.");
                          String _name_35 = attr.getName();
                          _builder.append(_name_35, "\t");
                          _builder.append("[i] = ");
                          String _name_36 = attr.getName();
                          _builder.append(_name_36, "\t");
                          _builder.append(".at(i);");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  int _dimension_1 = attr.getDimension();
                  boolean _equals_5 = (_dimension_1 == 2);
                  if (_equals_5) {
                    _builder.append("x.");
                    String _name_37 = attr.getName();
                    _builder.append(_name_37, "");
                    _builder.append(".length(");
                    String _name_38 = attr.getName();
                    _builder.append(_name_38, "");
                    _builder.append(".size());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("for (unsigned int i = 0; i < ");
                    String _name_39 = attr.getName();
                    _builder.append(_name_39, "");
                    _builder.append(".size(); i++) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("x.");
                    String _name_40 = attr.getName();
                    _builder.append(_name_40, "\t");
                    _builder.append("[i].length(");
                    String _name_41 = attr.getName();
                    _builder.append(_name_41, "\t");
                    _builder.append(".at(i).size());\t\t\t \t\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                    _builder.newLine();
                    _builder.append("for (unsigned int i = 0; i < ");
                    String _name_42 = attr.getName();
                    _builder.append(_name_42, "");
                    _builder.append(".size() ; i++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for (unsigned int j = 0; j < ");
                    String _name_43 = attr.getName();
                    _builder.append(_name_43, "\t");
                    _builder.append(".at(i).size(); j++)");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _isExtendedType_4 = attr.isExtendedType();
                      if (_isExtendedType_4) {
                        _builder.append("\t\t\t");
                        _builder.append("x.");
                        String _name_44 = attr.getName();
                        _builder.append(_name_44, "\t\t\t");
                        _builder.append("[i][j]= ");
                        String _name_45 = attr.getName();
                        _builder.append(_name_45, "\t\t\t");
                        _builder.append(".at(i).at(j).toIDL");
                        String _SimpleCppType_7 = attr.SimpleCppType();
                        _builder.append(_SimpleCppType_7, "\t\t\t");
                        _builder.append("();");
                        _builder.newLineIfNotEmpty();
                      } else {
                        {
                          String _SimpleCppType_8 = attr.SimpleCppType();
                          boolean _equals_6 = _SimpleCppType_8.equals("string");
                          if (_equals_6) {
                            _builder.append("\t\t\t");
                            _builder.append("x.");
                            String _name_46 = attr.getName();
                            _builder.append(_name_46, "\t\t\t");
                            _builder.append("[i][j] = CORBA::string_dup(");
                            String _name_47 = attr.getName();
                            _builder.append(_name_47, "\t\t\t");
                            _builder.append(".at(i).at(j).c_str());");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t\t\t");
                            _builder.append("x.");
                            String _name_48 = attr.getName();
                            _builder.append(_name_48, "\t\t\t");
                            _builder.append("[i][j] = ");
                            String _name_49 = attr.getName();
                            _builder.append(_name_49, "\t\t\t");
                            _builder.append(".at(i).at(j);");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                    _builder.newLine();
                  } else {
                    int _dimension_2 = attr.getDimension();
                    boolean _equals_7 = (_dimension_2 == 3);
                    if (_equals_7) {
                      _builder.append("x.");
                      String _name_50 = attr.getName();
                      _builder.append(_name_50, "");
                      _builder.append(".length(");
                      String _name_51 = attr.getName();
                      _builder.append(_name_51, "");
                      _builder.append(".size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("for (unsigned int i = 0; i < ");
                      String _name_52 = attr.getName();
                      _builder.append(_name_52, "");
                      _builder.append(".size(); i++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("x.");
                      String _name_53 = attr.getName();
                      _builder.append(_name_53, "\t");
                      _builder.append("[i].length(");
                      String _name_54 = attr.getName();
                      _builder.append(_name_54, "\t");
                      _builder.append(".at(i).size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (unsigned int j = 0; j < ");
                      String _name_55 = attr.getName();
                      _builder.append(_name_55, "\t");
                      _builder.append(".at(i).size(); j++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("x.");
                      String _name_56 = attr.getName();
                      _builder.append(_name_56, "\t\t");
                      _builder.append("[i][j].length(");
                      String _name_57 = attr.getName();
                      _builder.append(_name_57, "\t\t");
                      _builder.append(".at(i).at(j).size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("}\t\t\t\t\t \t\t");
                      _builder.newLine();
                      _builder.append("}");
                      _builder.newLine();
                      _builder.newLine();
                      _builder.append("for (unsigned int i = 0; i < ");
                      String _name_58 = attr.getName();
                      _builder.append(_name_58, "");
                      _builder.append(".size() ; i++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (unsigned int j = 0; j < ");
                      String _name_59 = attr.getName();
                      _builder.append(_name_59, "\t");
                      _builder.append(".at(i).size(); j++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("for (unsigned int k = 0; k < ");
                      String _name_60 = attr.getName();
                      _builder.append(_name_60, "\t\t");
                      _builder.append(".at(i).at(j).size(); k++)");
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _isExtendedType_5 = attr.isExtendedType();
                        if (_isExtendedType_5) {
                          _builder.append("\t\t\t");
                          _builder.append("x.");
                          String _name_61 = attr.getName();
                          _builder.append(_name_61, "\t\t\t");
                          _builder.append("[i][j][k] = ");
                          String _name_62 = attr.getName();
                          _builder.append(_name_62, "\t\t\t");
                          _builder.append(".at(i).at(j).at(k).toIDL");
                          String _SimpleCppType_9 = attr.SimpleCppType();
                          _builder.append(_SimpleCppType_9, "\t\t\t");
                          _builder.append("();");
                          _builder.newLineIfNotEmpty();
                        } else {
                          {
                            String _SimpleCppType_10 = attr.SimpleCppType();
                            boolean _equals_8 = _SimpleCppType_10.equals("string");
                            if (_equals_8) {
                              _builder.append("\t\t\t");
                              _builder.append("x.");
                              String _name_63 = attr.getName();
                              _builder.append(_name_63, "\t\t\t");
                              _builder.append("[i][j][k] = CORBA::string_dup(");
                              String _name_64 = attr.getName();
                              _builder.append(_name_64, "\t\t\t");
                              _builder.append(".at(i).at(j).at(k).c_str());");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t\t");
                              _builder.append("x.");
                              String _name_65 = attr.getName();
                              _builder.append(_name_65, "\t\t\t");
                              _builder.append("[i][j][k] = ");
                              String _name_66 = attr.getName();
                              _builder.append(_name_66, "\t\t\t");
                              _builder.append(".at(i).at(j).at(k);");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    } else {
                      int _dimension_3 = attr.getDimension();
                      boolean _equals_9 = (_dimension_3 == 4);
                      if (_equals_9) {
                        _builder.append("x.");
                        String _name_67 = attr.getName();
                        _builder.append(_name_67, "");
                        _builder.append(".length(");
                        String _name_68 = attr.getName();
                        _builder.append(_name_68, "");
                        _builder.append(".size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("for (unsigned int i = 0; i < ");
                        String _name_69 = attr.getName();
                        _builder.append(_name_69, "");
                        _builder.append(".size(); i++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("x.");
                        String _name_70 = attr.getName();
                        _builder.append(_name_70, "\t");
                        _builder.append("[i].length(");
                        String _name_71 = attr.getName();
                        _builder.append(_name_71, "\t");
                        _builder.append(".at(i).size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("for (unsigned int j = 0; j < ");
                        String _name_72 = attr.getName();
                        _builder.append(_name_72, "\t");
                        _builder.append(".at(i).size(); j++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("x.");
                        String _name_73 = attr.getName();
                        _builder.append(_name_73, "\t\t");
                        _builder.append("[i][j].length(");
                        String _name_74 = attr.getName();
                        _builder.append(_name_74, "\t\t");
                        _builder.append(".at(i).at(j).size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (unsigned int k = 0; k < ");
                        String _name_75 = attr.getName();
                        _builder.append(_name_75, "\t\t");
                        _builder.append(".at(i).at(j).size(); k++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("x.");
                        String _name_76 = attr.getName();
                        _builder.append(_name_76, "\t\t\t");
                        _builder.append("[i][j][k].length(");
                        String _name_77 = attr.getName();
                        _builder.append(_name_77, "\t\t\t");
                        _builder.append(".at(i).at(j).at(k).size());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("}\t\t\t\t\t \t\t");
                        _builder.newLine();
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.newLine();
                        _builder.append("for (unsigned int i = 0; i < ");
                        String _name_78 = attr.getName();
                        _builder.append(_name_78, "");
                        _builder.append(".size() ; i++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("for (unsigned int j = 0; j < ");
                        String _name_79 = attr.getName();
                        _builder.append(_name_79, "\t");
                        _builder.append(".at(i).size(); j++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (unsigned int k = 0; k < ");
                        String _name_80 = attr.getName();
                        _builder.append(_name_80, "\t\t");
                        _builder.append(".at(i).at(j).size(); k++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("for (unsigned int l = 0; l < ");
                        String _name_81 = attr.getName();
                        _builder.append(_name_81, "\t\t\t");
                        _builder.append(".at(i).at(j).at(k).size(); l++)");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isExtendedType_6 = attr.isExtendedType();
                          if (_isExtendedType_6) {
                            _builder.append("\t\t\t\t");
                            _builder.append("x.");
                            String _name_82 = attr.getName();
                            _builder.append(_name_82, "\t\t\t\t");
                            _builder.append("[i][j][k][l] = ");
                            String _name_83 = attr.getName();
                            _builder.append(_name_83, "\t\t\t\t");
                            _builder.append(".at(i).at(j).at(k).at(l).toIDL");
                            String _SimpleCppType_11 = attr.SimpleCppType();
                            _builder.append(_SimpleCppType_11, "\t\t\t\t");
                            _builder.append("();");
                            _builder.newLineIfNotEmpty();
                          } else {
                            {
                              String _SimpleCppType_12 = attr.SimpleCppType();
                              boolean _equals_10 = _SimpleCppType_12.equals("string");
                              if (_equals_10) {
                                _builder.append("\t\t\t\t");
                                _builder.append("x.");
                                String _name_84 = attr.getName();
                                _builder.append(_name_84, "\t\t\t\t");
                                _builder.append("[i][j][k][l] = CORBA::string_dup(");
                                String _name_85 = attr.getName();
                                _builder.append(_name_85, "\t\t\t\t");
                                _builder.append(".at(i).at(j).at(k).at(l).c_str());");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t\t\t");
                                _builder.append("x.");
                                String _name_86 = attr.getName();
                                _builder.append(_name_86, "\t\t\t\t");
                                _builder.append("[i][j][k][l] = ");
                                String _name_87 = attr.getName();
                                _builder.append(_name_87, "\t\t\t\t");
                                _builder.append(".at(i).at(j).at(k).at(l);");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                        _builder.append("cout << \"Converted successfully\" << endl;");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            } else {
              {
                boolean _isExtendedType_7 = attr.isExtendedType();
                if (_isExtendedType_7) {
                  _builder.append("x.");
                  String _name_88 = attr.getName();
                  _builder.append(_name_88, "");
                  _builder.append(" = ");
                  String _name_89 = attr.getName();
                  _builder.append(_name_89, "");
                  _builder.append(".toIDL");
                  String _JavaType_1 = attr.JavaType();
                  _builder.append(_JavaType_1, "");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    String _SimpleCppType_13 = attr.SimpleCppType();
                    boolean _equals_11 = _SimpleCppType_13.equals("string");
                    if (_equals_11) {
                      _builder.append("x.");
                      String _name_90 = attr.getName();
                      _builder.append(_name_90, "");
                      _builder.append(" = CORBA::string_dup(");
                      String _name_91 = attr.getName();
                      _builder.append(_name_91, "");
                      _builder.append(".c_str());");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("x.");
                      String _name_92 = attr.getName();
                      _builder.append(_name_92, "");
                      _builder.append(" = ");
                      String _name_93 = attr.getName();
                      _builder.append(_name_93, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toIDLLinksByRef(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence fromIDLDef(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isSet = attr.isSet();
      if (_isSet) {
        _builder.newLine();
        {
          boolean _isExtrinsic = attr.isExtrinsic();
          if (_isExtrinsic) {
            _builder.newLine();
            String _CppType = attr.CppType();
            _builder.append(_CppType, "");
            _builder.append(" tmp");
            String _UpperCaseName = attr.UpperCaseName();
            _builder.append(_UpperCaseName, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("for (unsigned int i = 0; i < tmp");
            String _UpperCaseName_1 = attr.UpperCaseName();
            _builder.append(_UpperCaseName_1, "");
            _builder.append(".size(); ++i) {");
            _builder.newLineIfNotEmpty();
            {
              boolean _or = false;
              boolean _isExtendedType = attr.isExtendedType();
              if (_isExtendedType) {
                _or = true;
              } else {
                String _SimpleCppType = attr.SimpleCppType();
                boolean _equals = _SimpleCppType.equals("string");
                _or = _equals;
              }
              if (_or) {
                _builder.append("\t");
                _builder.append("tmp");
                String _UpperCaseName_2 = attr.UpperCaseName();
                _builder.append(_UpperCaseName_2, "\t");
                _builder.append(".insert(");
                String _SimpleCppType_1 = attr.SimpleCppType();
                _builder.append(_SimpleCppType_1, "\t");
                _builder.append(" (x.");
                String _name = attr.getName();
                _builder.append(_name, "\t");
                _builder.append("[i]));");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("tmp");
                String _UpperCaseName_3 = attr.UpperCaseName();
                _builder.append(_UpperCaseName_3, "\t");
                _builder.append(".insert(x.");
                String _name_1 = attr.getName();
                _builder.append(_name_1, "\t");
                _builder.append("[i]);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("}");
            _builder.newLine();
            _builder.append("set");
            String _UpperCaseName_4 = attr.UpperCaseName();
            _builder.append(_UpperCaseName_4, "");
            _builder.append("(tmp");
            String _UpperCaseName_5 = attr.UpperCaseName();
            _builder.append(_UpperCaseName_5, "");
            _builder.append(");\t\t\t\t");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.newLine();
          }
        }
        _builder.newLine();
      } else {
        boolean _and = false;
        boolean _isExtrinsic_1 = attr.isExtrinsic();
        if (!_isExtrinsic_1) {
          _and = false;
        } else {
          boolean _isArray = attr.isArray();
          _and = _isArray;
        }
        if (_and) {
          {
            boolean _isOptional = attr.isOptional();
            if (_isOptional) {
              String _name_2 = attr.getName();
              _builder.append(_name_2, "");
              _builder.append("Exists = x.");
              String _name_3 = attr.getName();
              _builder.append(_name_3, "");
              _builder.append("Exists;");
              _builder.newLineIfNotEmpty();
              _builder.append("if (x.");
              String _name_4 = attr.getName();
              _builder.append(_name_4, "");
              _builder.append("Exists) {");
              _builder.newLineIfNotEmpty();
            }
          }
          String _name_5 = attr.getName();
          _builder.append(_name_5, "");
          _builder.append(" .clear();");
          _builder.newLineIfNotEmpty();
          _builder.append("for (unsigned int i = 0; i <x.");
          String _name_6 = attr.getName();
          _builder.append(_name_6, "");
          _builder.append(".length(); ++i) {");
          _builder.newLineIfNotEmpty();
          {
            boolean _or_1 = false;
            boolean _isExtendedType_1 = attr.isExtendedType();
            boolean _equals_1 = Boolean.valueOf(_isExtendedType_1).equals("string");
            if (_equals_1) {
              _or_1 = true;
            } else {
              String _SimpleCppType_2 = attr.SimpleCppType();
              boolean _equals_2 = _SimpleCppType_2.equals("string");
              _or_1 = _equals_2;
            }
            if (_or_1) {
              _builder.append("\t");
              String _name_7 = attr.getName();
              _builder.append(_name_7, "\t");
              _builder.append(".push_back(");
              String _SimpleCppType_3 = attr.SimpleCppType();
              _builder.append(_SimpleCppType_3, "\t");
              _builder.append(" (x.");
              String _name_8 = attr.getName();
              _builder.append(_name_8, "\t");
              _builder.append("[i]));");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _name_9 = attr.getName();
              _builder.append(_name_9, "\t");
              _builder.append(".push_back(x.");
              String _name_10 = attr.getName();
              _builder.append(_name_10, "\t");
              _builder.append("[i]);");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("}");
          _builder.newLine();
          {
            boolean _isOptional_1 = attr.isOptional();
            if (_isOptional_1) {
              _builder.append("}");
              _builder.newLine();
            }
          }
        } else {
          {
            boolean _isOptional_2 = attr.isOptional();
            if (_isOptional_2) {
              String _name_11 = attr.getName();
              _builder.append(_name_11, "");
              _builder.append("Exists = x.");
              String _name_12 = attr.getName();
              _builder.append(_name_12, "");
              _builder.append("Exists;");
              _builder.newLineIfNotEmpty();
              _builder.append("if (x.");
              String _name_13 = attr.getName();
              _builder.append(_name_13, "");
              _builder.append("Exists) {");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            boolean _isArray_1 = attr.isArray();
            if (_isArray_1) {
              {
                int _dimension = attr.getDimension();
                boolean _equals_3 = (_dimension == 1);
                if (_equals_3) {
                  String _name_14 = attr.getName();
                  _builder.append(_name_14, "");
                  _builder.append(" .clear();");
                  _builder.newLineIfNotEmpty();
                  _builder.append("for (unsigned int i = 0; i <x.");
                  String _name_15 = attr.getName();
                  _builder.append(_name_15, "");
                  _builder.append(".length(); ++i) {");
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _or_2 = false;
                    boolean _isExtendedType_2 = attr.isExtendedType();
                    boolean _equals_4 = Boolean.valueOf(_isExtendedType_2).equals("string");
                    if (_equals_4) {
                      _or_2 = true;
                    } else {
                      String _SimpleCppType_4 = attr.SimpleCppType();
                      boolean _equals_5 = _SimpleCppType_4.equals("string");
                      _or_2 = _equals_5;
                    }
                    if (_or_2) {
                      _builder.append("\t");
                      String _name_16 = attr.getName();
                      _builder.append(_name_16, "\t");
                      _builder.append(".push_back(");
                      String _SimpleCppType_5 = attr.SimpleCppType();
                      _builder.append(_SimpleCppType_5, "\t");
                      _builder.append(" (x.");
                      String _name_17 = attr.getName();
                      _builder.append(_name_17, "\t");
                      _builder.append("[i]));");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t");
                      String _name_18 = attr.getName();
                      _builder.append(_name_18, "\t");
                      _builder.append(".push_back(x.");
                      String _name_19 = attr.getName();
                      _builder.append(_name_19, "\t");
                      _builder.append("[i]);");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  int _dimension_1 = attr.getDimension();
                  boolean _equals_6 = (_dimension_1 == 2);
                  if (_equals_6) {
                    String _name_20 = attr.getName();
                    _builder.append(_name_20, "");
                    _builder.append(" .clear();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("vector<");
                    String _SimpleCppType_6 = attr.SimpleCppType();
                    _builder.append(_SimpleCppType_6, "");
                    _builder.append("> v_aux_");
                    String _name_21 = attr.getName();
                    _builder.append(_name_21, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("for (unsigned int i = 0; i < x.");
                    String _name_22 = attr.getName();
                    _builder.append(_name_22, "");
                    _builder.append(".length(); ++i) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("v_aux_");
                    String _name_23 = attr.getName();
                    _builder.append(_name_23, "\t");
                    _builder.append(".clear();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for (unsigned int j = 0; j < x.");
                    String _name_24 = attr.getName();
                    _builder.append(_name_24, "\t");
                    _builder.append("[0].length(); ++j) {");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _or_3 = false;
                      boolean _isExtendedType_3 = attr.isExtendedType();
                      boolean _equals_7 = Boolean.valueOf(_isExtendedType_3).equals("string");
                      if (_equals_7) {
                        _or_3 = true;
                      } else {
                        String _SimpleCppType_7 = attr.SimpleCppType();
                        boolean _equals_8 = _SimpleCppType_7.equals("string");
                        _or_3 = _equals_8;
                      }
                      if (_or_3) {
                        _builder.append("\t\t");
                        _builder.append("v_aux_");
                        String _name_25 = attr.getName();
                        _builder.append(_name_25, "\t\t");
                        _builder.append(".push_back(");
                        String _SimpleCppType_8 = attr.SimpleCppType();
                        _builder.append(_SimpleCppType_8, "\t\t");
                        _builder.append(" (x.");
                        String _name_26 = attr.getName();
                        _builder.append(_name_26, "\t\t");
                        _builder.append("[i][j]));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("v_aux_");
                        String _name_27 = attr.getName();
                        _builder.append(_name_27, "\t\t");
                        _builder.append(".push_back(x.");
                        String _name_28 = attr.getName();
                        _builder.append(_name_28, "\t\t");
                        _builder.append("[i][j]);");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t\t\t  \t\t\t");
                    String _name_29 = attr.getName();
                    _builder.append(_name_29, "\t\t\t  \t\t\t");
                    _builder.append(".push_back(v_aux_");
                    String _name_30 = attr.getName();
                    _builder.append(_name_30, "\t\t\t  \t\t\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    int _dimension_2 = attr.getDimension();
                    boolean _equals_9 = (_dimension_2 == 3);
                    if (_equals_9) {
                      String _name_31 = attr.getName();
                      _builder.append(_name_31, "");
                      _builder.append(" .clear();");
                      _builder.newLineIfNotEmpty();
                      _builder.append("vector< vector<");
                      String _SimpleCppType_9 = attr.SimpleCppType();
                      _builder.append(_SimpleCppType_9, "");
                      _builder.append("> > vv_aux_");
                      String _name_32 = attr.getName();
                      _builder.append(_name_32, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                      _builder.append("vector<");
                      String _SimpleCppType_10 = attr.SimpleCppType();
                      _builder.append(_SimpleCppType_10, "");
                      _builder.append("> v_aux_");
                      String _name_33 = attr.getName();
                      _builder.append(_name_33, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                      _builder.newLine();
                      _builder.append("for (unsigned int i = 0; i < x.");
                      String _name_34 = attr.getName();
                      _builder.append(_name_34, "");
                      _builder.append(".length(); ++i) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("vv_aux_");
                      String _name_35 = attr.getName();
                      _builder.append(_name_35, "\t");
                      _builder.append(".clear();");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (unsigned int j = 0; j < x.");
                      String _name_36 = attr.getName();
                      _builder.append(_name_36, "\t");
                      _builder.append("[0].length(); ++j) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("v_aux_");
                      String _name_37 = attr.getName();
                      _builder.append(_name_37, "\t\t");
                      _builder.append(".clear();");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("for (unsigned int k = 0; k < x.");
                      String _name_38 = attr.getName();
                      _builder.append(_name_38, "\t\t");
                      _builder.append("[0][0].length(); ++k) {");
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _or_4 = false;
                        boolean _isExtendedType_4 = attr.isExtendedType();
                        boolean _equals_10 = Boolean.valueOf(_isExtendedType_4).equals("string");
                        if (_equals_10) {
                          _or_4 = true;
                        } else {
                          String _SimpleCppType_11 = attr.SimpleCppType();
                          boolean _equals_11 = _SimpleCppType_11.equals("string");
                          _or_4 = _equals_11;
                        }
                        if (_or_4) {
                          _builder.append("\t\t\t");
                          _builder.append("v_aux_");
                          String _name_39 = attr.getName();
                          _builder.append(_name_39, "\t\t\t");
                          _builder.append(".push_back(");
                          String _SimpleCppType_12 = attr.SimpleCppType();
                          _builder.append(_SimpleCppType_12, "\t\t\t");
                          _builder.append(" (x.");
                          String _name_40 = attr.getName();
                          _builder.append(_name_40, "\t\t\t");
                          _builder.append("[i][j][k]));");
                          _builder.newLineIfNotEmpty();
                        } else {
                          _builder.append("\t\t\t");
                          _builder.append("v_aux_");
                          String _name_41 = attr.getName();
                          _builder.append(_name_41, "\t\t\t");
                          _builder.append(".push_back(x.");
                          String _name_42 = attr.getName();
                          _builder.append(_name_42, "\t\t\t");
                          _builder.append("[i][j][k]);");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      _builder.append("  \t\t");
                      _builder.append("}");
                      _builder.newLine();
                      _builder.append("  \t\t");
                      _builder.append("vv_aux_");
                      String _name_43 = attr.getName();
                      _builder.append(_name_43, "  \t\t");
                      _builder.append(".push_back(v_aux_");
                      String _name_44 = attr.getName();
                      _builder.append(_name_44, "  \t\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("}");
                      _builder.newLine();
                      _builder.append("\t\t\t  \t\t\t");
                      String _name_45 = attr.getName();
                      _builder.append(_name_45, "\t\t\t  \t\t\t");
                      _builder.append(".push_back(vv_aux_");
                      String _name_46 = attr.getName();
                      _builder.append(_name_46, "\t\t\t  \t\t\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                      _builder.append("}");
                      _builder.newLine();
                    } else {
                      int _dimension_3 = attr.getDimension();
                      boolean _equals_12 = (_dimension_3 == 4);
                      if (_equals_12) {
                        String _name_47 = attr.getName();
                        _builder.append(_name_47, "");
                        _builder.append(" .clear();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("vector <vector< vector<");
                        String _SimpleCppType_13 = attr.SimpleCppType();
                        _builder.append(_SimpleCppType_13, "");
                        _builder.append("> > > vvv_aux_");
                        String _name_48 = attr.getName();
                        _builder.append(_name_48, "");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("vector< vector<");
                        String _SimpleCppType_14 = attr.SimpleCppType();
                        _builder.append(_SimpleCppType_14, "");
                        _builder.append("> > vv_aux_");
                        String _name_49 = attr.getName();
                        _builder.append(_name_49, "");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("vector<");
                        String _SimpleCppType_15 = attr.SimpleCppType();
                        _builder.append(_SimpleCppType_15, "");
                        _builder.append("> v_aux_");
                        String _name_50 = attr.getName();
                        _builder.append(_name_50, "");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.newLine();
                        _builder.append("for (unsigned int i = 0; i <x.");
                        String _name_51 = attr.getName();
                        _builder.append(_name_51, "");
                        _builder.append(".length(); ++i) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("vvv_aux_");
                        String _name_52 = attr.getName();
                        _builder.append(_name_52, "\t");
                        _builder.append(".clear();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("for (unsigned int j = 0; j <x.");
                        String _name_53 = attr.getName();
                        _builder.append(_name_53, "\t");
                        _builder.append("[0].length(); ++j) { ");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("vv_aux_");
                        String _name_54 = attr.getName();
                        _builder.append(_name_54, "\t\t");
                        _builder.append(".clear();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (unsigned int k = 0; k < x.");
                        String _name_55 = attr.getName();
                        _builder.append(_name_55, "\t\t");
                        _builder.append("[0][0].length(); ++k) { ");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("v_aux_");
                        String _name_56 = attr.getName();
                        _builder.append(_name_56, "\t\t\t");
                        _builder.append(".clear();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("for (unsigned int l = 0; l <x.");
                        String _name_57 = attr.getName();
                        _builder.append(_name_57, "\t\t\t");
                        _builder.append("[0][0][0].length(); ++l) { ");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _or_5 = false;
                          boolean _isExtendedType_5 = attr.isExtendedType();
                          boolean _equals_13 = Boolean.valueOf(_isExtendedType_5).equals("string");
                          if (_equals_13) {
                            _or_5 = true;
                          } else {
                            String _SimpleCppType_16 = attr.SimpleCppType();
                            boolean _equals_14 = _SimpleCppType_16.equals("string");
                            _or_5 = _equals_14;
                          }
                          if (_or_5) {
                            _builder.append("\t\t\t");
                            _builder.append("v_aux_");
                            String _name_58 = attr.getName();
                            _builder.append(_name_58, "\t\t\t");
                            _builder.append(".push_back(");
                            String _SimpleCppType_17 = attr.SimpleCppType();
                            _builder.append(_SimpleCppType_17, "\t\t\t");
                            _builder.append(" (x.");
                            String _name_59 = attr.getName();
                            _builder.append(_name_59, "\t\t\t");
                            _builder.append("[i][j][k][l]));");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t\t\t");
                            _builder.append("v_aux_");
                            String _name_60 = attr.getName();
                            _builder.append(_name_60, "\t\t\t");
                            _builder.append(".push_back(x.");
                            String _name_61 = attr.getName();
                            _builder.append(_name_61, "\t\t\t");
                            _builder.append("[i][j][k][l]);");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        _builder.append("  \t\t   ");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("  \t\t   ");
                        _builder.append("vv_aux_");
                        String _name_62 = attr.getName();
                        _builder.append(_name_62, "  \t\t   ");
                        _builder.append(".push_back(v_aux_");
                        String _name_63 = attr.getName();
                        _builder.append(_name_63, "  \t\t   ");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("  \t   ");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("  \t   ");
                        _builder.append("vvv_aux_");
                        String _name_64 = attr.getName();
                        _builder.append(_name_64, "  \t   ");
                        _builder.append(".push_back(vv_aux_");
                        String _name_65 = attr.getName();
                        _builder.append(_name_65, "  \t   ");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("  \t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("  \t");
                        String _name_66 = attr.getName();
                        _builder.append(_name_66, "  \t");
                        _builder.append(".push_back(vvv_aux_");
                        String _name_67 = attr.getName();
                        _builder.append(_name_67, "  \t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("} ");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            } else {
              {
                boolean _or_6 = false;
                boolean _isExtendedType_6 = attr.isExtendedType();
                boolean _equals_15 = Boolean.valueOf(_isExtendedType_6).equals("string");
                if (_equals_15) {
                  _or_6 = true;
                } else {
                  String _SimpleCppType_18 = attr.SimpleCppType();
                  boolean _equals_16 = _SimpleCppType_18.equals("string");
                  _or_6 = _equals_16;
                }
                if (_or_6) {
                  _builder.append("set");
                  String _UpperCaseName_6 = attr.UpperCaseName();
                  _builder.append(_UpperCaseName_6, "");
                  _builder.append("(");
                  String _SimpleCppType_19 = attr.SimpleCppType();
                  _builder.append(_SimpleCppType_19, "");
                  _builder.append(" (x.");
                  String _name_68 = attr.getName();
                  _builder.append(_name_68, "");
                  _builder.append("));");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("set");
                  String _UpperCaseName_7 = attr.UpperCaseName();
                  _builder.append(_UpperCaseName_7, "");
                  _builder.append("(x.");
                  String _name_69 = attr.getName();
                  _builder.append(_name_69, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            boolean _isOptional_3 = attr.isOptional();
            if (_isOptional_3) {
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toXMLAttributeLinks(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence fromIDLLinks(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toXMLAttributeName(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOptional = attr.isOptional();
      if (_isOptional) {
        _builder.append("if (");
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append("Exists) {");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEnumeration = attr.isEnumeration();
      if (_isEnumeration) {
        _builder.append("buf.append(EnumerationParser::toXML(\"");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.append("\", ");
        String _name_2 = attr.getName();
        _builder.append(_name_2, "");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      } else {
        ExportEncoding _exportEncoding = attr.getExportEncoding();
        String _string = _exportEncoding.toString();
        boolean _equals = _string.equals("Base64");
        if (_equals) {
          _builder.append("Parser::toXMLBase64(");
          String _name_3 = attr.getName();
          _builder.append(_name_3, "");
          _builder.append(", \"");
          String _name_4 = attr.getName();
          _builder.append(_name_4, "");
          _builder.append("\", buf);");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("Parser::toXML(");
          String _name_5 = attr.getName();
          _builder.append(_name_5, "");
          _builder.append(", \"");
          String _name_6 = attr.getName();
          _builder.append(_name_6, "");
          _builder.append("\", buf);");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    {
      boolean _isOptional_1 = attr.isOptional();
      if (_isOptional_1) {
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence fromXMLAttributeName(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEnumeration = attr.isEnumeration();
      if (_isEnumeration) {
        {
          boolean _isOptional = attr.isOptional();
          if (_isOptional) {
            _builder.append("if (row.isStr(\"<");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.append(">\")) {");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          boolean _isArray = attr.isArray();
          if (_isArray) {
            String _name_1 = attr.getName();
            _builder.append(_name_1, "");
            _builder.append(" = EnumerationParser::get");
            String _SimpleCppType = attr.SimpleCppType();
            _builder.append(_SimpleCppType, "");
            String _ArrayDimensions = attr.ArrayDimensions();
            _builder.append(_ArrayDimensions, "");
            _builder.append("D(\"");
            String _name_2 = attr.getName();
            _builder.append(_name_2, "");
            _builder.append("\",\"");
            String _tableName = attr.getTableName();
            _builder.append(_tableName, "");
            _builder.append("\",rowDoc);");
            _builder.newLineIfNotEmpty();
          } else {
            String _name_3 = attr.getName();
            _builder.append(_name_3, "");
            _builder.append(" = EnumerationParser::get");
            String _SimpleCppType_1 = attr.SimpleCppType();
            _builder.append(_SimpleCppType_1, "");
            _builder.append("(\"");
            String _name_4 = attr.getName();
            _builder.append(_name_4, "");
            _builder.append("\",\"");
            String _tableName_1 = attr.getTableName();
            _builder.append(_tableName_1, "");
            _builder.append("\",rowDoc);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          boolean _isOptional_1 = attr.isOptional();
          if (_isOptional_1) {
            String _name_5 = attr.getName();
            _builder.append(_name_5, "");
            _builder.append("Exists = true;");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
      } else {
        boolean _isSet = attr.isSet();
        if (_isSet) {
          {
            boolean _isExtrinsic = attr.isExtrinsic();
            if (_isExtrinsic) {
              _builder.newLine();
              _builder.append("set");
              String _UpperCaseName = attr.UpperCaseName();
              _builder.append(_UpperCaseName, "");
              _builder.append("(Parser::get");
              String _TypeSet = attr.TypeSet();
              _builder.append(_TypeSet, "");
              _builder.append("(\"");
              String _name_6 = attr.getName();
              _builder.append(_name_6, "");
              _builder.append("\",\"");
              String _tableName_2 = attr.getTableName();
              _builder.append(_tableName_2, "");
              _builder.append("\",rowDoc));");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.newLine();
            }
          }
        } else {
          boolean _and = false;
          boolean _isExtrinsic_1 = attr.isExtrinsic();
          if (!_isExtrinsic_1) {
            _and = false;
          } else {
            boolean _isArray_1 = attr.isArray();
            _and = _isArray_1;
          }
          if (_and) {
            {
              boolean _isOptional_2 = attr.isOptional();
              if (_isOptional_2) {
                _builder.append("if (row.isStr(\"<");
                String _name_7 = attr.getName();
                _builder.append(_name_7, "");
                _builder.append(">\")) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t  ");
                _builder.append("set");
                String _UpperCaseName_1 = attr.UpperCaseName();
                _builder.append(_UpperCaseName_1, "\t  ");
                _builder.append("(Parser::get1D");
                String _WrapperType = attr.WrapperType();
                _builder.append(_WrapperType, "\t  ");
                _builder.append("(\"");
                String _name_8 = attr.getName();
                _builder.append(_name_8, "\t  ");
                _builder.append("\",\"");
                String _tableName_3 = attr.getTableName();
                _builder.append(_tableName_3, "\t  ");
                _builder.append("\",rowDoc)); ");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              } else {
                _builder.append("set");
                String _UpperCaseName_2 = attr.UpperCaseName();
                _builder.append(_UpperCaseName_2, "");
                _builder.append("(Parser::get1D");
                String _WrapperType_1 = attr.WrapperType();
                _builder.append(_WrapperType_1, "");
                _builder.append("(\"");
                String _name_9 = attr.getName();
                _builder.append(_name_9, "");
                _builder.append("\",\"");
                String _tableName_4 = attr.getTableName();
                _builder.append(_tableName_4, "");
                _builder.append("\",rowDoc));");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            {
              boolean _isOptional_3 = attr.isOptional();
              if (_isOptional_3) {
                _builder.append("\t");
                _builder.append("if (row.isStr(\"<");
                String _name_10 = attr.getName();
                _builder.append(_name_10, "\t");
                _builder.append(">\")) {");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isArray_2 = attr.isArray();
                  if (_isArray_2) {
                    {
                      ExportEncoding _exportEncoding = attr.getExportEncoding();
                      String _string = _exportEncoding.toString();
                      boolean _equals = _string.equals("Base64");
                      if (_equals) {
                        _builder.append("\t");
                        _builder.append("Parser::get");
                        String _ArrayDimensions_1 = attr.ArrayDimensions();
                        _builder.append(_ArrayDimensions_1, "\t");
                        _builder.append("D");
                        String _WrapperType_2 = attr.WrapperType();
                        _builder.append(_WrapperType_2, "\t");
                        _builder.append("FromBase64(\"");
                        String _name_11 = attr.getName();
                        _builder.append(_name_11, "\t");
                        _builder.append("\",\"");
                        String _tableName_5 = attr.getTableName();
                        _builder.append(_tableName_5, "\t");
                        _builder.append("\",rowDoc, ");
                        String _name_12 = attr.getName();
                        _builder.append(_name_12, "\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t");
                        _builder.append("set");
                        String _UpperCaseName_3 = attr.UpperCaseName();
                        _builder.append(_UpperCaseName_3, "\t");
                        _builder.append("(Parser::get");
                        String _ArrayDimensions_2 = attr.ArrayDimensions();
                        _builder.append(_ArrayDimensions_2, "\t");
                        _builder.append("D");
                        String _WrapperType_3 = attr.WrapperType();
                        _builder.append(_WrapperType_3, "\t");
                        _builder.append("(\"");
                        String _name_13 = attr.getName();
                        _builder.append(_name_13, "\t");
                        _builder.append("\",\"");
                        String _tableName_6 = attr.getTableName();
                        _builder.append(_tableName_6, "\t");
                        _builder.append("\",rowDoc));");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    _builder.append("\t");
                    _builder.append("set");
                    String _UpperCaseName_4 = attr.UpperCaseName();
                    _builder.append(_UpperCaseName_4, "\t");
                    _builder.append("(Parser::get");
                    String _WrapperType_4 = attr.WrapperType();
                    _builder.append(_WrapperType_4, "\t");
                    _builder.append("(\"");
                    String _name_14 = attr.getName();
                    _builder.append(_name_14, "\t");
                    _builder.append("\",\"");
                    String _tableName_7 = attr.getTableName();
                    _builder.append(_tableName_7, "\t");
                    _builder.append("\",rowDoc));");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("}");
                _builder.newLine();
              } else {
                {
                  boolean _isArray_3 = attr.isArray();
                  if (_isArray_3) {
                    {
                      ExportEncoding _exportEncoding_1 = attr.getExportEncoding();
                      String _string_1 = _exportEncoding_1.toString();
                      boolean _equals_1 = _string_1.equals("Base64");
                      if (_equals_1) {
                        _builder.append("Parser::get");
                        String _ArrayDimensions_3 = attr.ArrayDimensions();
                        _builder.append(_ArrayDimensions_3, "");
                        _builder.append("D");
                        String _WrapperType_5 = attr.WrapperType();
                        _builder.append(_WrapperType_5, "");
                        _builder.append("FromBase64(\"");
                        String _name_15 = attr.getName();
                        _builder.append(_name_15, "");
                        _builder.append("\",\"");
                        String _tableName_8 = attr.getTableName();
                        _builder.append(_tableName_8, "");
                        _builder.append("\",rowDoc, ");
                        String _name_16 = attr.getName();
                        _builder.append(_name_16, "");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("set");
                        String _UpperCaseName_5 = attr.UpperCaseName();
                        _builder.append(_UpperCaseName_5, "");
                        _builder.append("(Parser::get");
                        String _ArrayDimensions_4 = attr.ArrayDimensions();
                        _builder.append(_ArrayDimensions_4, "");
                        _builder.append("D");
                        String _WrapperType_6 = attr.WrapperType();
                        _builder.append(_WrapperType_6, "");
                        _builder.append("(\"");
                        String _name_17 = attr.getName();
                        _builder.append(_name_17, "");
                        _builder.append("\",\"");
                        String _tableName_9 = attr.getTableName();
                        _builder.append(_tableName_9, "");
                        _builder.append("\",rowDoc));");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    _builder.append("set");
                    String _UpperCaseName_6 = attr.UpperCaseName();
                    _builder.append(_UpperCaseName_6, "");
                    _builder.append("(Parser::get");
                    String _WrapperType_7 = attr.WrapperType();
                    _builder.append(_WrapperType_7, "");
                    _builder.append("(\"");
                    String _name_18 = attr.getName();
                    _builder.append(_name_18, "");
                    _builder.append("\",\"");
                    String _tableName_10 = attr.getTableName();
                    _builder.append(_tableName_10, "");
                    _builder.append("\",rowDoc));");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence fromXMLAttributeLinks(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toBin(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isExtendedType = attr.isExtendedType();
      if (_isExtendedType) {
        _builder.newLine();
        {
          boolean _isArray = attr.isArray();
          if (_isArray) {
            String _CppClass = attr.CppClass();
            _builder.append(_CppClass, "");
            _builder.append("::toBin(");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.append(", eoss);");
            _builder.newLineIfNotEmpty();
          } else {
            String _name_1 = attr.getName();
            _builder.append(_name_1, "");
            _builder.append(".toBin(eoss);");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.newLine();
        {
          boolean _isArray_1 = attr.isArray();
          if (_isArray_1) {
            _builder.newLine();
            {
              int _dimension = attr.getDimension();
              boolean _equals = (_dimension == 1);
              if (_equals) {
                _builder.append("eoss.writeInt((int) ");
                String _name_2 = attr.getName();
                _builder.append(_name_2, "");
                _builder.append(".size());");
                _builder.newLineIfNotEmpty();
                _builder.append("for (unsigned int i = 0; i < ");
                String _name_3 = attr.getName();
                _builder.append(_name_3, "");
                _builder.append(".size(); i++)");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isEnumeration = attr.isEnumeration();
                  if (_isEnumeration) {
                    _builder.append("eoss.writeString(C");
                    String _typeName = attr.getTypeName();
                    _builder.append(_typeName, "");
                    _builder.append("::name(");
                    String _name_4 = attr.getName();
                    _builder.append(_name_4, "");
                    _builder.append(".at(i)));");
                    _builder.newLineIfNotEmpty();
                    _builder.append("/* eoss.writeInt(");
                    String _name_5 = attr.getName();
                    _builder.append(_name_5, "");
                    _builder.append(".at(i)); */");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("eoss.write");
                    String _SimpleJavaType = attr.SimpleJavaType();
                    String _firstUpper = StringExtensions.toFirstUpper(_SimpleJavaType);
                    _builder.append(_firstUpper, "");
                    _builder.append("(");
                    String _name_6 = attr.getName();
                    _builder.append(_name_6, "");
                    _builder.append(".at(i));");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.newLine();
              } else {
                int _dimension_1 = attr.getDimension();
                boolean _equals_1 = (_dimension_1 == 2);
                if (_equals_1) {
                  _builder.append("eoss.writeInt((int) ");
                  String _name_7 = attr.getName();
                  _builder.append(_name_7, "");
                  _builder.append(".size());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("eoss.writeInt((int) ");
                  String _name_8 = attr.getName();
                  _builder.append(_name_8, "");
                  _builder.append(".at(0).size());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("for (unsigned int i = 0; i < ");
                  String _name_9 = attr.getName();
                  _builder.append(_name_9, "");
                  _builder.append(".size(); i++) ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("for (unsigned int j = 0;  j < ");
                  String _name_10 = attr.getName();
                  _builder.append(_name_10, "\t");
                  _builder.append(".at(0).size(); j++) ");
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _isEnumeration_1 = attr.isEnumeration();
                    if (_isEnumeration_1) {
                      _builder.append("\t\t");
                      _builder.append("eoss.writeString(C");
                      String _typeName_1 = attr.getTypeName();
                      _builder.append(_typeName_1, "\t\t");
                      _builder.append("::name(");
                      String _name_11 = attr.getName();
                      _builder.append(_name_11, "\t\t");
                      _builder.append(".at(i).at(j)));\t\t\t\t");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("/* eoss.writeInt(");
                      String _name_12 = attr.getName();
                      _builder.append(_name_12, "\t\t");
                      _builder.append(".at(i).at(j)); */");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t\t");
                      _builder.append("eoss.write");
                      String _SimpleJavaType_1 = attr.SimpleJavaType();
                      String _firstUpper_1 = StringExtensions.toFirstUpper(_SimpleJavaType_1);
                      _builder.append(_firstUpper_1, "\t\t");
                      _builder.append("(");
                      String _name_13 = attr.getName();
                      _builder.append(_name_13, "\t\t");
                      _builder.append(".at(i).at(j));");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("\t");
                  _builder.newLine();
                } else {
                  int _dimension_2 = attr.getDimension();
                  boolean _equals_2 = (_dimension_2 == 3);
                  if (_equals_2) {
                    _builder.append("eoss.writeInt((int) ");
                    String _name_14 = attr.getName();
                    _builder.append(_name_14, "");
                    _builder.append(".size());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("eoss.writeInt((int) ");
                    String _name_15 = attr.getName();
                    _builder.append(_name_15, "");
                    _builder.append(".at(0).size());\t\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("eoss.writeInt((int) ");
                    String _name_16 = attr.getName();
                    _builder.append(_name_16, "");
                    _builder.append(".at(0).at(0).size());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("for (unsigned int i = 0; i < ");
                    String _name_17 = attr.getName();
                    _builder.append(_name_17, "");
                    _builder.append(".size(); i++) ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for (unsigned int j = 0;  j < ");
                    String _name_18 = attr.getName();
                    _builder.append(_name_18, "\t");
                    _builder.append(".at(0).size(); j++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("for (unsigned int k = 0; k <  ");
                    String _name_19 = attr.getName();
                    _builder.append(_name_19, "\t\t");
                    _builder.append(".at(0).at(0).size(); k++)\t");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _isEnumeration_2 = attr.isEnumeration();
                      if (_isEnumeration_2) {
                        _builder.append("\t\t");
                        _builder.append("eoss.writeString(C");
                        String _typeName_2 = attr.getTypeName();
                        _builder.append(_typeName_2, "\t\t");
                        _builder.append("::name(");
                        String _name_20 = attr.getName();
                        _builder.append(_name_20, "\t\t");
                        _builder.append(".at(i).at(j).at(k)));");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("/* eoss.writeInt(");
                        String _name_21 = attr.getName();
                        _builder.append(_name_21, "\t\t");
                        _builder.append(".at(i).at(j).at(k)); */");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("eoss.write");
                        String _SimpleJavaType_2 = attr.SimpleJavaType();
                        String _firstUpper_2 = StringExtensions.toFirstUpper(_SimpleJavaType_2);
                        _builder.append(_firstUpper_2, "\t\t");
                        _builder.append("(");
                        String _name_22 = attr.getName();
                        _builder.append(_name_22, "\t\t");
                        _builder.append(".at(i).at(j).at(k));");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    int _dimension_3 = attr.getDimension();
                    boolean _equals_3 = (_dimension_3 == 4);
                    if (_equals_3) {
                      _builder.append("eoss.writeInt((int) ");
                      String _name_23 = attr.getName();
                      _builder.append(_name_23, "");
                      _builder.append(".size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("eoss.writeInt((int) ");
                      String _name_24 = attr.getName();
                      _builder.append(_name_24, "");
                      _builder.append(".at(0).size());\t\t");
                      _builder.newLineIfNotEmpty();
                      _builder.append("eoss.writeInt((int) ");
                      String _name_25 = attr.getName();
                      _builder.append(_name_25, "");
                      _builder.append(".at(0).at(0).size());\t\t\t");
                      _builder.newLineIfNotEmpty();
                      _builder.append("eoss.writeInt((int) ");
                      String _name_26 = attr.getName();
                      _builder.append(_name_26, "");
                      _builder.append(".at(0).at(0).at(0).size());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("for (unsigned int i = 0; i < ");
                      String _name_27 = attr.getName();
                      _builder.append(_name_27, "");
                      _builder.append(".size(); i++) ");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (unsigned int j = 0;  j < ");
                      String _name_28 = attr.getName();
                      _builder.append(_name_28, "\t");
                      _builder.append(".at(0).size(); j++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("for (unsigned int k = 0; k <  ");
                      String _name_29 = attr.getName();
                      _builder.append(_name_29, "\t\t");
                      _builder.append(".at(0).at(0).size(); k++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t");
                      _builder.append("for (unsigned int l = 0; l < \t");
                      String _name_30 = attr.getName();
                      _builder.append(_name_30, "\t\t\t");
                      _builder.append(".at(0).at(0).at(0).size(); l++)");
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _isEnumeration_3 = attr.isEnumeration();
                        if (_isEnumeration_3) {
                          _builder.append("\t\t\t\t");
                          _builder.append("eoss.writeString(C");
                          String _typeName_3 = attr.getTypeName();
                          _builder.append(_typeName_3, "\t\t\t\t");
                          _builder.append("::name(");
                          String _name_31 = attr.getName();
                          _builder.append(_name_31, "\t\t\t\t");
                          _builder.append(".at(i).at(j).at(k).at(l)));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t\t");
                          _builder.append("/* eoss.writeInt(");
                          String _name_32 = attr.getName();
                          _builder.append(_name_32, "\t\t\t\t");
                          _builder.append(".at(i).at(j).at(k).at(l)); */");
                          _builder.newLineIfNotEmpty();
                        } else {
                          _builder.append("\t\t\t\t");
                          _builder.append("eoss.write");
                          String _SimpleJavaType_3 = attr.SimpleJavaType();
                          String _firstUpper_3 = StringExtensions.toFirstUpper(_SimpleJavaType_3);
                          _builder.append(_firstUpper_3, "\t\t\t\t");
                          _builder.append("(");
                          String _name_33 = attr.getName();
                          _builder.append(_name_33, "\t\t\t\t");
                          _builder.append(".at(i).at(j).at(k).at(l));\t");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            {
              boolean _isEnumeration_4 = attr.isEnumeration();
              if (_isEnumeration_4) {
                _builder.append("eoss.writeString(C");
                String _typeName_4 = attr.getTypeName();
                _builder.append(_typeName_4, "");
                _builder.append("::name(");
                String _name_34 = attr.getName();
                _builder.append(_name_34, "");
                _builder.append("));");
                _builder.newLineIfNotEmpty();
                _builder.append("/* eoss.writeInt(");
                String _name_35 = attr.getName();
                _builder.append(_name_35, "");
                _builder.append("); */");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("eoss.write");
                String _SimpleJavaType_4 = attr.SimpleJavaType();
                String _firstUpper_4 = StringExtensions.toFirstUpper(_SimpleJavaType_4);
                _builder.append(_firstUpper_4, "");
                _builder.append("(");
                String _name_36 = attr.getName();
                _builder.append(_name_36, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toBinOpt(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eoss.writeBoolean(");
    String _name = attr.getName();
    _builder.append(_name, "");
    _builder.append("Exists);");
    _builder.newLineIfNotEmpty();
    _builder.append("if (");
    String _name_1 = attr.getName();
    _builder.append(_name_1, "");
    _builder.append("Exists) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _bin = this.toBin(attr);
    _builder.append(_bin, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence binaryDeserialize(final AlmaTable table, final ASDMAttribute attr, final String binSourceType, final String binSource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("Row::");
    String _name_1 = attr.getName();
    _builder.append(_name_1, "");
    _builder.append("FromBin(");
    _builder.append(binSourceType, "");
    _builder.append("& ");
    _builder.append(binSource, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      boolean _isOptional = attr.isOptional();
      if (_isOptional) {
        _builder.append("\t");
        CharSequence _fromBinOpt = this.fromBinOpt(binSource, attr);
        _builder.append(_fromBinOpt, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        CharSequence _fromBin = this.fromBin(binSource, attr);
        _builder.append(_fromBin, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence textDeserialize(final AlmaTable table, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _typeName = attr.getTypeName();
      boolean _equals = _typeName.equals("EntityRef");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("// Convert a string into an ");
        String _typeName_1 = attr.getTypeName();
        _builder.append(_typeName_1, "");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("void ");
        String _name = table.getName();
        _builder.append(_name, "");
        _builder.append("Row::");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.append("FromText(const string & s) {");
        _builder.newLineIfNotEmpty();
        {
          boolean _isOptional = attr.isOptional();
          if (_isOptional) {
            _builder.append("\t");
            String _name_2 = attr.getName();
            _builder.append(_name_2, "\t");
            _builder.append("Exists = true;");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _isArray = attr.isArray();
          if (_isArray) {
            _builder.append("\t");
            String _name_3 = attr.getName();
            _builder.append(_name_3, "\t");
            _builder.append(" = ASDMValuesParser::parse");
            int _dimension = attr.getDimension();
            _builder.append(_dimension, "\t");
            _builder.append("D<");
            String _SimpleCppType = attr.SimpleCppType();
            _builder.append(_SimpleCppType, "\t");
            _builder.append(">(s);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            String _name_4 = attr.getName();
            _builder.append(_name_4, "\t");
            _builder.append(" = ASDMValuesParser::parse<");
            String _SimpleCppType_1 = attr.SimpleCppType();
            _builder.append(_SimpleCppType_1, "\t");
            _builder.append(">(s);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence initializeOptional(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOptional = attr.isOptional();
      if (_isOptional) {
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append("Exists = false;");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence initializeLiteral(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isEnumeration = attr.isEnumeration();
      if (!_isEnumeration) {
        _and = false;
      } else {
        boolean _isArray = attr.isArray();
        boolean _not = (!_isArray);
        _and = _not;
      }
      if (_and) {
        _builder.append("// This attribute is scalar and has an enumeration type. Let\'s initialize it to some valid value (the 1st of the enumeration).\t\t");
        _builder.newLine();
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append(" = C");
        String _SimpleCppType = attr.SimpleCppType();
        _builder.append(_SimpleCppType, "");
        _builder.append("::from_int(0);");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compareAttribute(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isOptional = attr.isOptional();
      boolean _not = (!_isOptional);
      if (!_not) {
        _and = false;
      } else {
        boolean _isAutoIncrementable = attr.isAutoIncrementable();
        boolean _not_1 = (!_isAutoIncrementable);
        _and = _not_1;
      }
      if (_and) {
        {
          String _CppType = attr.CppType();
          boolean _equals = _CppType.equals("ArrayTimeInterval");
          if (_equals) {
            _builder.append("result = result && (this->");
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.append(".overlaps(");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          } else {
            String _CppType_1 = attr.CppType();
            boolean _equals_1 = _CppType_1.equals("EntityId");
            if (_equals_1) {
              _builder.append("result = result && (this->");
              String _name_2 = attr.getName();
              _builder.append(_name_2, "");
              _builder.append(".equals(");
              String _name_3 = attr.getName();
              _builder.append(_name_3, "");
              _builder.append("));");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("result = result && (this->");
              String _name_4 = attr.getName();
              _builder.append(_name_4, "");
              _builder.append(" == ");
              String _name_5 = attr.getName();
              _builder.append(_name_5, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("\t");
        _builder.append("if (!result) return false;");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compareAttributeExactly(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOptional = attr.isOptional();
      boolean _not = (!_isOptional);
      if (_not) {
        _builder.append("if (!(this->");
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append(" == ");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.append(")) return false;");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence fromBinOpt(final String binSource, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = attr.getName();
    _builder.append(_name, "");
    _builder.append("Exists = ");
    _builder.append(binSource, "");
    _builder.append(".readBoolean();");
    _builder.newLineIfNotEmpty();
    _builder.append("if (");
    String _name_1 = attr.getName();
    _builder.append(_name_1, "");
    _builder.append("Exists) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _fromBin = this.fromBin(binSource, attr);
    _builder.append(_fromBin, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence fromBin(final String binSource, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isExtendedType = attr.isExtendedType();
      if (_isExtendedType) {
        _builder.append("\t");
        _builder.newLine();
        {
          boolean _isArray = attr.isArray();
          if (_isArray) {
            CharSequence _fromBinArrayExtendedType = this.fromBinArrayExtendedType(binSource, attr);
            _builder.append(_fromBinArrayExtendedType, "");
            _builder.newLineIfNotEmpty();
          } else {
            String _name = attr.getName();
            _builder.append(_name, "");
            _builder.append(" =  ");
            String _SimpleCppType = attr.SimpleCppType();
            _builder.append(_SimpleCppType, "");
            _builder.append("::fromBin(");
            _builder.append(binSource, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.newLine();
        {
          boolean _isArray_1 = attr.isArray();
          if (_isArray_1) {
            CharSequence _fromBinArrayBasicOrEnumType = this.fromBinArrayBasicOrEnumType(binSource, attr);
            _builder.append(_fromBinArrayBasicOrEnumType, "");
            _builder.newLineIfNotEmpty();
          } else {
            {
              boolean _isEnumeration = attr.isEnumeration();
              if (_isEnumeration) {
                String _name_1 = attr.getName();
                _builder.append(_name_1, "");
                _builder.append(" = C");
                String _SimpleCppType_1 = attr.SimpleCppType();
                _builder.append(_SimpleCppType_1, "");
                _builder.append("::literal(");
                _builder.append(binSource, "");
                _builder.append(".readString());");
                _builder.newLineIfNotEmpty();
              } else {
                String _name_2 = attr.getName();
                _builder.append(_name_2, "");
                _builder.append(" =  ");
                _builder.append(binSource, "");
                _builder.append(".read");
                String _SimpleJavaType = attr.SimpleJavaType();
                String _firstUpper = StringExtensions.toFirstUpper(_SimpleJavaType);
                _builder.append(_firstUpper, "");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence fromBinArrayExtendedType(final String binSource, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _dimension = attr.getDimension();
      boolean _equals = (_dimension == 1);
      if (_equals) {
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append(" = ");
        String _SimpleCppType = attr.SimpleCppType();
        _builder.append(_SimpleCppType, "");
        _builder.append("::from1DBin(");
        _builder.append(binSource, "");
        _builder.append(");\t");
        _builder.newLineIfNotEmpty();
      } else {
        int _dimension_1 = attr.getDimension();
        boolean _equals_1 = (_dimension_1 == 2);
        if (_equals_1) {
          String _name_1 = attr.getName();
          _builder.append(_name_1, "");
          _builder.append(" = ");
          String _SimpleCppType_1 = attr.SimpleCppType();
          _builder.append(_SimpleCppType_1, "");
          _builder.append("::from2DBin(");
          _builder.append(binSource, "");
          _builder.append(");\t\t");
          _builder.newLineIfNotEmpty();
        } else {
          int _dimension_2 = attr.getDimension();
          boolean _equals_2 = (_dimension_2 == 3);
          if (_equals_2) {
            String _name_2 = attr.getName();
            _builder.append(_name_2, "");
            _builder.append(" = ");
            String _SimpleCppType_2 = attr.SimpleCppType();
            _builder.append(_SimpleCppType_2, "");
            _builder.append("::from3DBin(");
            _builder.append(binSource, "");
            _builder.append(");\t\t");
            _builder.newLineIfNotEmpty();
          } else {
            int _dimension_3 = attr.getDimension();
            boolean _equals_3 = (_dimension_3 == 4);
            if (_equals_3) {
              String _name_3 = attr.getName();
              _builder.append(_name_3, "");
              _builder.append(" = ");
              String _SimpleCppType_3 = attr.SimpleCppType();
              _builder.append(_SimpleCppType_3, "");
              _builder.append("::from4DBin(");
              _builder.append(binSource, "");
              _builder.append(");\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence fromBinArrayBasicOrEnumType(final String binSource, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _dimension = attr.getDimension();
      boolean _equals = (_dimension == 1);
      if (_equals) {
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append(".clear();");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("unsigned int ");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.append("Dim1 = ");
        _builder.append(binSource, "");
        _builder.append(".readInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("for (unsigned int  i = 0 ; i < ");
        String _name_2 = attr.getName();
        _builder.append(_name_2, "");
        _builder.append("Dim1; i++)");
        _builder.newLineIfNotEmpty();
        {
          boolean _isEnumeration = attr.isEnumeration();
          if (_isEnumeration) {
            _builder.append("\t");
            String _name_3 = attr.getName();
            _builder.append(_name_3, "\t");
            _builder.append(".push_back(C");
            String _SimpleCppType = attr.SimpleCppType();
            _builder.append(_SimpleCppType, "\t");
            _builder.append("::literal(");
            _builder.append(binSource, "\t");
            _builder.append(".readString()));");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            String _name_4 = attr.getName();
            _builder.append(_name_4, "\t");
            _builder.append(".push_back(");
            _builder.append(binSource, "\t");
            _builder.append(".read");
            String _SimpleJavaType = attr.SimpleJavaType();
            String _firstUpper = StringExtensions.toFirstUpper(_SimpleJavaType);
            _builder.append(_firstUpper, "\t");
            _builder.append("());");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        int _dimension_1 = attr.getDimension();
        boolean _equals_1 = (_dimension_1 == 2);
        if (_equals_1) {
          String _name_5 = attr.getName();
          _builder.append(_name_5, "");
          _builder.append(".clear();");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("unsigned int ");
          String _name_6 = attr.getName();
          _builder.append(_name_6, "");
          _builder.append("Dim1 = ");
          _builder.append(binSource, "");
          _builder.append(".readInt();");
          _builder.newLineIfNotEmpty();
          _builder.append("unsigned int ");
          String _name_7 = attr.getName();
          _builder.append(_name_7, "");
          _builder.append("Dim2 = ");
          _builder.append(binSource, "");
          _builder.append(".readInt();");
          _builder.newLineIfNotEmpty();
          _builder.append("vector <");
          String _SimpleCppType_1 = attr.SimpleCppType();
          _builder.append(_SimpleCppType_1, "");
          _builder.append("> ");
          String _name_8 = attr.getName();
          _builder.append(_name_8, "");
          _builder.append("Aux1;");
          _builder.newLineIfNotEmpty();
          _builder.append("for (unsigned int i = 0; i < ");
          String _name_9 = attr.getName();
          _builder.append(_name_9, "");
          _builder.append("Dim1; i++) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          String _name_10 = attr.getName();
          _builder.append(_name_10, "\t");
          _builder.append("Aux1.clear();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("for (unsigned int j = 0; j < ");
          String _name_11 = attr.getName();
          _builder.append(_name_11, "\t");
          _builder.append("Dim2 ; j++)\t\t\t");
          _builder.newLineIfNotEmpty();
          {
            boolean _isEnumeration_1 = attr.isEnumeration();
            if (_isEnumeration_1) {
              _builder.append("\t\t");
              String _name_12 = attr.getName();
              _builder.append(_name_12, "\t\t");
              _builder.append("Aux1.push_back(C");
              String _SimpleCppType_2 = attr.SimpleCppType();
              _builder.append(_SimpleCppType_2, "\t\t");
              _builder.append("::literal(");
              _builder.append(binSource, "\t\t");
              _builder.append(".readString()));");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t\t");
              String _name_13 = attr.getName();
              _builder.append(_name_13, "\t\t");
              _builder.append("Aux1.push_back(");
              _builder.append(binSource, "\t\t");
              _builder.append(".read");
              String _SimpleJavaType_1 = attr.SimpleJavaType();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_SimpleJavaType_1);
              _builder.append(_firstUpper_1, "\t\t");
              _builder.append("());");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t\t\t");
          String _name_14 = attr.getName();
          _builder.append(_name_14, "\t\t\t");
          _builder.append(".push_back(");
          String _name_15 = attr.getName();
          _builder.append(_name_15, "\t\t\t");
          _builder.append("Aux1);");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
        } else {
          int _dimension_2 = attr.getDimension();
          boolean _equals_2 = (_dimension_2 == 3);
          if (_equals_2) {
            String _name_16 = attr.getName();
            _builder.append(_name_16, "");
            _builder.append(".clear();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("unsigned int ");
            String _name_17 = attr.getName();
            _builder.append(_name_17, "");
            _builder.append("Dim1 = ");
            _builder.append(binSource, "");
            _builder.append(".readInt();");
            _builder.newLineIfNotEmpty();
            _builder.append("unsigned int ");
            String _name_18 = attr.getName();
            _builder.append(_name_18, "");
            _builder.append("Dim2 = ");
            _builder.append(binSource, "");
            _builder.append(".readInt();");
            _builder.newLineIfNotEmpty();
            _builder.append("unsigned int ");
            String _name_19 = attr.getName();
            _builder.append(_name_19, "");
            _builder.append("Dim3 = ");
            _builder.append(binSource, "");
            _builder.append(".readInt();");
            _builder.newLineIfNotEmpty();
            _builder.append("vector <vector<");
            String _SimpleCppType_3 = attr.SimpleCppType();
            _builder.append(_SimpleCppType_3, "");
            _builder.append("> > ");
            String _name_20 = attr.getName();
            _builder.append(_name_20, "");
            _builder.append("Aux2;");
            _builder.newLineIfNotEmpty();
            _builder.append("vector <");
            String _SimpleCppType_4 = attr.SimpleCppType();
            _builder.append(_SimpleCppType_4, "");
            _builder.append("> ");
            String _name_21 = attr.getName();
            _builder.append(_name_21, "");
            _builder.append("Aux1;");
            _builder.newLineIfNotEmpty();
            _builder.append("for (unsigned int i = 0; i < ");
            String _name_22 = attr.getName();
            _builder.append(_name_22, "");
            _builder.append("Dim1; i++) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _name_23 = attr.getName();
            _builder.append(_name_23, "\t");
            _builder.append("Aux2.clear();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("for (unsigned int j = 0; j < ");
            String _name_24 = attr.getName();
            _builder.append(_name_24, "\t");
            _builder.append("Dim2 ; j++) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _name_25 = attr.getName();
            _builder.append(_name_25, "\t\t");
            _builder.append("Aux1.clear();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("for (unsigned int k = 0; k < ");
            String _name_26 = attr.getName();
            _builder.append(_name_26, "\t\t");
            _builder.append("Dim3; k++) {");
            _builder.newLineIfNotEmpty();
            {
              boolean _isEnumeration_2 = attr.isEnumeration();
              if (_isEnumeration_2) {
                _builder.append("\t\t\t");
                String _name_27 = attr.getName();
                _builder.append(_name_27, "\t\t\t");
                _builder.append("Aux1.push_back(C");
                String _SimpleCppType_5 = attr.SimpleCppType();
                _builder.append(_SimpleCppType_5, "\t\t\t");
                _builder.append("::literal(");
                _builder.append(binSource, "\t\t\t");
                _builder.append(".readString()));");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t\t");
                String _name_28 = attr.getName();
                _builder.append(_name_28, "\t\t\t");
                _builder.append("Aux1.push_back(");
                _builder.append(binSource, "\t\t\t");
                _builder.append(".read");
                String _SimpleJavaType_2 = attr.SimpleJavaType();
                String _firstUpper_2 = StringExtensions.toFirstUpper(_SimpleJavaType_2);
                _builder.append(_firstUpper_2, "\t\t\t");
                _builder.append("());");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            String _name_29 = attr.getName();
            _builder.append(_name_29, "\t\t");
            _builder.append("Aux2.push_back(");
            String _name_30 = attr.getName();
            _builder.append(_name_30, "\t\t");
            _builder.append("Aux1);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            String _name_31 = attr.getName();
            _builder.append(_name_31, "\t");
            _builder.append(".push_back(");
            String _name_32 = attr.getName();
            _builder.append(_name_32, "\t");
            _builder.append("Aux2);");
            _builder.newLineIfNotEmpty();
            _builder.append("}\t");
            _builder.newLine();
          } else {
            int _dimension_3 = attr.getDimension();
            boolean _equals_3 = (_dimension_3 == 4);
            if (_equals_3) {
              String _name_33 = attr.getName();
              _builder.append(_name_33, "");
              _builder.append(".clear();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("unsigned int ");
              String _name_34 = attr.getName();
              _builder.append(_name_34, "");
              _builder.append("Dim1 = ");
              _builder.append(binSource, "");
              _builder.append(".readInt();");
              _builder.newLineIfNotEmpty();
              _builder.append("unsigned int ");
              String _name_35 = attr.getName();
              _builder.append(_name_35, "");
              _builder.append("Dim2 = ");
              _builder.append(binSource, "");
              _builder.append(".readInt();");
              _builder.newLineIfNotEmpty();
              _builder.append("unsigned int ");
              String _name_36 = attr.getName();
              _builder.append(_name_36, "");
              _builder.append("Dim3 = ");
              _builder.append(binSource, "");
              _builder.append(".readInt();");
              _builder.newLineIfNotEmpty();
              _builder.append("unsigned int ");
              String _name_37 = attr.getName();
              _builder.append(_name_37, "");
              _builder.append("Dim3 = ");
              _builder.append(binSource, "");
              _builder.append(".readInt();");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              _builder.append("vector<vector <vector<");
              String _SimpleCppType_6 = attr.SimpleCppType();
              _builder.append(_SimpleCppType_6, "");
              _builder.append("> > >");
              String _name_38 = attr.getName();
              _builder.append(_name_38, "");
              _builder.append("Aux3;");
              _builder.newLineIfNotEmpty();
              _builder.append("vector <vector<");
              String _SimpleCppType_7 = attr.SimpleCppType();
              _builder.append(_SimpleCppType_7, "");
              _builder.append("> > ");
              String _name_39 = attr.getName();
              _builder.append(_name_39, "");
              _builder.append("Aux2;");
              _builder.newLineIfNotEmpty();
              _builder.append("vector <");
              String _SimpleCppType_8 = attr.SimpleCppType();
              _builder.append(_SimpleCppType_8, "");
              _builder.append("> ");
              String _name_40 = attr.getName();
              _builder.append(_name_40, "");
              _builder.append("Aux1;");
              _builder.newLineIfNotEmpty();
              _builder.append("for (unsigned int i = 0; i < ");
              String _name_41 = attr.getName();
              _builder.append(_name_41, "");
              _builder.append("Dim1; i++) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              String _name_42 = attr.getName();
              _builder.append(_name_42, "\t");
              _builder.append("Aux3.clear();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("for (unsigned int j = 0; j < ");
              String _name_43 = attr.getName();
              _builder.append(_name_43, "\t");
              _builder.append("Dim2 ; j++) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              String _name_44 = attr.getName();
              _builder.append(_name_44, "\t\t");
              _builder.append("Aux2.clear();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("for (unsigned int k = 0; k < ");
              String _name_45 = attr.getName();
              _builder.append(_name_45, "\t\t");
              _builder.append("Dim3; k++) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              String _name_46 = attr.getName();
              _builder.append(_name_46, "\t\t\t");
              _builder.append("Aux1.clear();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("for (unsigned int l = 0; l < ");
              String _name_47 = attr.getName();
              _builder.append(_name_47, "\t\t\t");
              _builder.append("Dim4; k++) {");
              _builder.newLineIfNotEmpty();
              {
                boolean _isEnumeration_3 = attr.isEnumeration();
                if (_isEnumeration_3) {
                  _builder.append("\t\t\t\t");
                  String _name_48 = attr.getName();
                  _builder.append(_name_48, "\t\t\t\t");
                  _builder.append("Aux1.push_back(C");
                  String _SimpleCppType_9 = attr.SimpleCppType();
                  _builder.append(_SimpleCppType_9, "\t\t\t\t");
                  _builder.append("::literal(");
                  _builder.append(binSource, "\t\t\t\t");
                  _builder.append(".readString()));");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t\t\t\t");
                  String _name_49 = attr.getName();
                  _builder.append(_name_49, "\t\t\t\t");
                  _builder.append("Aux1.push_back(");
                  _builder.append(binSource, "\t\t\t\t");
                  _builder.append(".read");
                  String _SimpleJavaType_3 = attr.SimpleJavaType();
                  String _firstUpper_3 = StringExtensions.toFirstUpper(_SimpleJavaType_3);
                  _builder.append(_firstUpper_3, "\t\t\t\t");
                  _builder.append("());");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t\t");
              _builder.append("}");
              _builder.newLine();
              _builder.append("\t\t\t");
              String _name_50 = attr.getName();
              _builder.append(_name_50, "\t\t\t");
              _builder.append("Aux2.push_back(");
              String _name_51 = attr.getName();
              _builder.append(_name_51, "\t\t\t");
              _builder.append("Aux1);");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("}");
              _builder.newLine();
              _builder.append("\t\t");
              String _name_52 = attr.getName();
              _builder.append(_name_52, "\t\t");
              _builder.append("Aux3.push_back(");
              String _name_53 = attr.getName();
              _builder.append(_name_53, "\t\t");
              _builder.append("Aux2);");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
              _builder.append("\t");
              String _name_54 = attr.getName();
              _builder.append(_name_54, "\t");
              _builder.append(".push_back(");
              String _name_55 = attr.getName();
              _builder.append(_name_55, "\t");
              _builder.append("Aux3);");
              _builder.newLineIfNotEmpty();
              _builder.append("}\t\t");
              _builder.newLine();
            }
          }
        }
      }
    }
    return _builder;
  }
}
