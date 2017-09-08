package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableAttributeDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableAttributeDefGS;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableLinksDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableLinksDefGS;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class CppRowDef {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    List<AlmaTable> _tables = this.container.getTables();
    for (final AlmaTable table : _tables) {
      {
        String _name = table.getName();
        String _plus = ("include/" + _name);
        String _plus_1 = (_plus + "Row.h");
        sdmFsa.setFile(_plus_1);
        CharSequence _generateCppRowDef = this.generateCppRowDef(table);
        sdmFsa.generateFile(_generateCppRowDef);
      }
    }
  }
  
  public CharSequence generateCppRowDef(final AlmaTable table) {
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
    _builder.append("Row.h");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#ifndef ");
    String _name_1 = table.getName();
    _builder.append(_name_1, "");
    _builder.append("Row_CLASS");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _name_2 = table.getName();
    _builder.append(_name_2, "");
    _builder.append("Row_CLASS");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <vector>");
    _builder.newLine();
    _builder.append("#include <string>");
    _builder.newLine();
    _builder.append("#include <set>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef WITHOUT_ACS");
    _builder.newLine();
    _builder.append("#include <asdmIDLC.h>");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      boolean _hasLongAttribute = table.hasLongAttribute();
      if (_hasLongAttribute) {
        _builder.append("#include <stdint.h>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.newLine();
    {
      HashSet<String> _usedExtendedTypes = table.getUsedExtendedTypes();
      for(final String et : _usedExtendedTypes) {
        {
          boolean _or = false;
          boolean _or_1 = false;
          boolean _or_2 = false;
          boolean _or_3 = false;
          boolean _or_4 = false;
          boolean _or_5 = false;
          boolean _or_6 = false;
          boolean _or_7 = false;
          boolean _equals = et.equals("Boolean");
          if (_equals) {
            _or_7 = true;
          } else {
            boolean _equals_1 = et.equals("Byte");
            _or_7 = _equals_1;
          }
          if (_or_7) {
            _or_6 = true;
          } else {
            boolean _equals_2 = et.equals("Character");
            _or_6 = _equals_2;
          }
          if (_or_6) {
            _or_5 = true;
          } else {
            boolean _equals_3 = et.equals("Complex");
            _or_5 = _equals_3;
          }
          if (_or_5) {
            _or_4 = true;
          } else {
            boolean _equals_4 = et.equals("Double");
            _or_4 = _equals_4;
          }
          if (_or_4) {
            _or_3 = true;
          } else {
            boolean _equals_5 = et.equals("Float");
            _or_3 = _equals_5;
          }
          if (_or_3) {
            _or_2 = true;
          } else {
            boolean _equals_6 = et.equals("Integer");
            _or_2 = _equals_6;
          }
          if (_or_2) {
            _or_1 = true;
          } else {
            boolean _equals_7 = et.equals("Long");
            _or_1 = _equals_7;
          }
          if (_or_1) {
            _or = true;
          } else {
            boolean _equals_8 = et.equals("Short");
            _or = _equals_8;
          }
          if (_or) {
            _builder.append("#include <");
            _builder.append(et, "");
            _builder.append("Wrapper.h>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("#include <");
            _builder.append(et, "");
            _builder.append(".h>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic = table.getIntrinsic();
      for(final ASDMAttribute attr : _intrinsic) {
        {
          boolean _isEnumeration = attr.isEnumeration();
          if (_isEnumeration) {
            _builder.append("#include \"C");
            String _typeName = attr.getTypeName();
            _builder.append(_typeName, "");
            _builder.append(".h\"");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <ConversionException.h>");
    _builder.newLine();
    _builder.append("#include <NoSuchRow.h>");
    _builder.newLine();
    _builder.append("#include <IllegalAccessException.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <RowTransformer.h>");
    _builder.newLine();
    _builder.append("//#include <TableStreamReader.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/*\\file ");
    String _name_3 = table.getName();
    String _plus = (_name_3 + ".h");
    _builder.append(_plus, "");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("\\brief Generated from model\'s revision \"");
    int _revision = AlmaTable.getRevision();
    _builder.append(_revision, "    ");
    _builder.append("\", branch \"");
    String _branch = AlmaTable.getBranch();
    _builder.append(_branch, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//class asdm::");
    String _name_4 = table.getName();
    _builder.append(_name_4, "\t");
    _builder.append("Table;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _link = table.getLink();
      for(final ASDMAttribute link : _link) {
        {
          String _refersTo = link.getRefersTo();
          String _name_5 = table.getName();
          boolean _equals_9 = _refersTo.equals(_name_5);
          boolean _not = (!_equals_9);
          if (_not) {
            _builder.append("\t");
            _builder.append("// class asdm::");
            String _refersTo_1 = link.getRefersTo();
            _builder.append(_refersTo_1, "\t");
            _builder.append("Row;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("class ");
            String _refersTo_2 = link.getRefersTo();
            _builder.append(_refersTo_2, "\t");
            _builder.append("Row;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    String _name_6 = table.getName();
    _builder.append(_name_6, "\t");
    _builder.append("Row;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("typedef void (");
    String _name_7 = table.getName();
    _builder.append(_name_7, "\t");
    _builder.append("Row::*");
    String _name_8 = table.getName();
    _builder.append(_name_8, "\t");
    _builder.append("AttributeFromBin) (EndianIStream& eis);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("typedef void (");
    String _name_9 = table.getName();
    _builder.append(_name_9, "\t");
    _builder.append("Row::*");
    String _name_10 = table.getName();
    _builder.append(_name_10, "\t");
    _builder.append("AttributeFromText) (const string& s);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* The ");
    String _name_11 = table.getName();
    _builder.append(_name_11, "\t ");
    _builder.append("Row class is a row of a ");
    String _name_12 = table.getName();
    _builder.append(_name_12, "\t ");
    _builder.append("Table.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Generated from model\'s revision \"");
    int _revision_1 = AlmaTable.getRevision();
    _builder.append(_revision_1, "\t ");
    _builder.append("\", branch \"");
    String _branch_1 = AlmaTable.getBranch();
    _builder.append(_branch_1, "\t ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    String _name_13 = table.getName();
    _builder.append(_name_13, "\t");
    _builder.append("Row {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("friend class asdm::");
    String _name_14 = table.getName();
    _builder.append(_name_14, "\t");
    _builder.append("Table;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("friend class asdm::RowTransformer<");
    String _name_15 = table.getName();
    _builder.append(_name_15, "\t");
    _builder.append("Row>;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//friend class asdm::TableStreamReader<");
    String _name_16 = table.getName();
    _builder.append(_name_16, "\t");
    _builder.append("Table, ");
    String _name_17 = table.getName();
    _builder.append(_name_17, "\t");
    _builder.append("Row>;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual ~");
    String _name_18 = table.getName();
    _builder.append(_name_18, "\t\t");
    _builder.append("Row();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Return the table to which this row belongs.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_19 = table.getName();
    _builder.append(_name_19, "\t\t");
    _builder.append("Table &getTable() const;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Has this row been added to its table ?");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @return true if and only if it has been added.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool isAdded() const;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Intrinsic Table Attributes //");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_1 = table.getIntrinsic();
      for(final ASDMAttribute attr_1 : _intrinsic_1) {
        _builder.append("\t\t");
        CppTableAttributeDefGS _cppTableAttributeDefGS = new CppTableAttributeDefGS();
        CharSequence _doGenerate = _cppTableAttributeDefGS.doGenerate(attr_1);
        _builder.append(_doGenerate, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Extrinsic Table Attributes //");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    {
      List<ASDMAttribute> _extrinsic = table.getExtrinsic();
      for(final ASDMAttribute attr_2 : _extrinsic) {
        _builder.append("\t\t");
        CppTableAttributeDefGS _cppTableAttributeDefGS_1 = new CppTableAttributeDefGS();
        CharSequence _doGenerate_1 = _cppTableAttributeDefGS_1.doGenerate(attr_2);
        _builder.append(_doGenerate_1, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("///////////");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Links //");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("///////////");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _link_1 = table.getLink();
      for(final ASDMAttribute linkAttr : _link_1) {
        _builder.append("\t\t");
        CppTableLinksDefGS _cppTableLinksDefGS = new CppTableLinksDefGS();
        CharSequence _doGenerate_2 = _cppTableLinksDefGS.doGenerate(linkAttr);
        _builder.append(_doGenerate_2, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredNoAutoIncrementableAttributes = table.getRequiredNoAutoIncrementableAttributes();
      int _size = _requiredNoAutoIncrementableAttributes.size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("* Compare each mandatory attribute except the autoincrementable one of this ");
        String _name_20 = table.getName();
        _builder.append(_name_20, "\t\t ");
        _builder.append("Row with ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("* the corresponding parameters and return true if there is a match and false otherwise.");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredNoAutoIncrementableAttributes_1 = table.getRequiredNoAutoIncrementableAttributes();
          for(final ASDMAttribute attr_3 : _requiredNoAutoIncrementableAttributes_1) {
            _builder.append("\t\t");
            _builder.append(" \t");
            _builder.append("* @param ");
            String _name_21 = attr_3.getName();
            _builder.append(_name_21, "\t\t \t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("*/ ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("bool compareNoAutoInc(");
        String _RequiredNoAutoIncrementableCpp = table.RequiredNoAutoIncrementableCpp();
        _builder.append(_RequiredNoAutoIncrementableCpp, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredValueAttributes = table.getRequiredValueAttributes();
      int _size_1 = _requiredValueAttributes.size();
      boolean _notEquals_1 = (_size_1 != 0);
      if (_notEquals_1) {
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("* Compare each mandatory value (i.e. not in the key) attribute  with ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("* the corresponding parameters and return true if there is a match and false otherwise.");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredValueAttributes_1 = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_4 : _requiredValueAttributes_1) {
            _builder.append("\t\t");
            _builder.append(" \t");
            _builder.append("* @param ");
            String _name_22 = attr_4.getName();
            _builder.append(_name_22, "\t\t \t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("*/ ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("bool compareRequiredValue(");
        String _RequiredValueCpp = table.RequiredValueCpp();
        _builder.append(_RequiredValueCpp, "\t\t");
        _builder.append("); ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Return true if all required attributes of the value part are equal to their homologues");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* in x and false otherwise.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @param x a pointer on the ");
    String _name_23 = table.getName();
    _builder.append(_name_23, "\t\t ");
    _builder.append("Row whose required attributes of the value part ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("* will be compared with those of this.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @return a boolean.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool equalByRequiredValue(");
    String _name_24 = table.getName();
    _builder.append(_name_24, "\t\t");
    _builder.append("Row* x) ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("#ifndef WITHOUT_ACS");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* Return this row in the form of an IDL struct.");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* @return The values of this row as a ");
    String _name_25 = table.getName();
    _builder.append(_name_25, "\t\t\t ");
    _builder.append("RowIDL struct.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("asdmIDL::");
    String _name_26 = table.getName();
    _builder.append(_name_26, "\t\t\t");
    _builder.append("RowIDL *toIDL() const;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* Define the content of a ");
    String _name_27 = table.getName();
    _builder.append(_name_27, "\t\t\t ");
    _builder.append("RowIDL struct from the values");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t ");
    _builder.append("* found in this row.");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* @param x a reference to the ");
    String _name_28 = table.getName();
    _builder.append(_name_28, "\t\t\t ");
    _builder.append("RowIDL struct to be set.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("void toIDL(asdmIDL::");
    String _name_29 = table.getName();
    _builder.append(_name_29, "\t\t\t ");
    _builder.append("RowIDL& x) const;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("#endif");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("#ifndef WITHOUT_ACS");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* Fill the values of this row from the IDL struct ");
    String _name_30 = table.getName();
    _builder.append(_name_30, "\t\t\t ");
    _builder.append("RowIDL.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t ");
    _builder.append("* @param x The IDL struct containing the values used to fill this row.");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* @throws ConversionException");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("void setFromIDL (asdmIDL::");
    String _name_31 = table.getName();
    _builder.append(_name_31, "\t\t\t");
    _builder.append("RowIDL x) ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("#endif");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Return this row in the form of an XML string.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @return The values of this row as an XML string.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::string toXML() const;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Fill the values of this row from an XML string ");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* that was produced by the toXML() method.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @param rowDoc the XML string being used to set the values of this row.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @throws ConversionException");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void setFromXML (std::string rowDoc) ;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/// @cond DISPLAY_PRIVATE\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// binary-deserialization material from an EndianIStream  //");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::map<std::string, ");
    String _name_32 = table.getName();
    _builder.append(_name_32, "\t\t");
    _builder.append("AttributeFromBin> fromBinMethods;");
    _builder.newLineIfNotEmpty();
    {
      List<ASDMAttribute> _requiredAttributes = table.getRequiredAttributes();
      for(final ASDMAttribute attr_5 : _requiredAttributes) {
        _builder.append("\t\t");
        CharSequence _binaryDeserialize = this.binaryDeserialize("EndianIStream", "eis", attr_5);
        _builder.append(_binaryDeserialize, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_6 : _optionalValueAttributes) {
        _builder.append("\t\t");
        CharSequence _binaryDeserialize_1 = this.binaryDeserialize("EndianIStream", "eis", attr_6);
        _builder.append(_binaryDeserialize_1, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Deserialize a stream of bytes read from an EndianIStream to build a PointingRow.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @param eiss the EndianIStream to be read.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @param table the ");
    String _name_33 = table.getName();
    _builder.append(_name_33, "\t\t ");
    _builder.append("Table to which the row built by deserialization will be parented.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("* @param attributesSeq a vector containing the names of the attributes . The elements order defines the order ");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* in which the attributes are written in the binary serialization.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("static ");
    String _name_34 = table.getName();
    _builder.append(_name_34, "\t\t");
    _builder.append("Row* fromBin(EndianIStream& eis, ");
    String _name_35 = table.getName();
    _builder.append(_name_35, "\t\t");
    _builder.append("Table& table, const std::vector<std::string>& attributesSeq);\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t \t ");
    _builder.append("* Parses a string t and assign the result of the parsing to the attribute of name attributeName.");
    _builder.newLine();
    _builder.append("\t \t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t \t ");
    _builder.append("* @param attributeName the name of the attribute whose value is going to be defined.");
    _builder.newLine();
    _builder.append("\t \t ");
    _builder.append("* @param t the string to be parsed into a value given to the attribute of name attributeName.");
    _builder.newLine();
    _builder.append("\t \t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("void fromText(const std::string& attributeName, const std::string&  t);");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("/// @endcond");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* The table to which this row belongs.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_36 = table.getName();
    _builder.append(_name_36, "\t\t");
    _builder.append("Table &table;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Whether this row has been added to the table or not.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool hasBeenAdded;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// This method is used by the Table class when this row is added to the table.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void isAdded(bool added);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Create a ");
    String _name_37 = table.getName();
    _builder.append(_name_37, "\t\t ");
    _builder.append("Row.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("* <p>");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* This constructor is private because only the");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* table can create rows.  All rows know the table");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* to which they belong.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @param table The table to which this row belongs.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/ ");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_38 = table.getName();
    _builder.append(_name_38, "\t\t");
    _builder.append("Row (");
    String _name_39 = table.getName();
    _builder.append(_name_39, "\t\t");
    _builder.append("Table &table);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Create a ");
    String _name_40 = table.getName();
    _builder.append(_name_40, "\t\t ");
    _builder.append("Row using a copy constructor mechanism.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("* <p>");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Given a ");
    String _name_41 = table.getName();
    _builder.append(_name_41, "\t\t ");
    _builder.append("Row row and a ");
    String _name_42 = table.getName();
    _builder.append(_name_42, "\t\t ");
    _builder.append("Table table, the method creates a new");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("* ");
    String _name_43 = table.getName();
    _builder.append(_name_43, "\t\t ");
    _builder.append("Row owned by table. Each attribute of the created row is a copy (deep)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("* of the corresponding attribute of row. The method does not add the created");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* row to its table, its simply parents it to table, a call to the add method");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* has to be done in order to get the row added (very likely after having modified");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* some of its attributes).");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* If row is null then the method returns a row with default values for its attributes. ");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* This constructor is private because only the");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* table can create rows.  All rows know the table");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* to which they belong.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @param table The table to which this row belongs.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @param row  The row which is to be copied.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t ");
    String _name_44 = table.getName();
    _builder.append(_name_44, "\t\t ");
    _builder.append("Row (");
    String _name_45 = table.getName();
    _builder.append(_name_45, "\t\t ");
    _builder.append("Table &table, ");
    String _name_46 = table.getName();
    _builder.append(_name_46, "\t\t ");
    _builder.append("Row &row);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Intrinsic Table Attributes //");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    {
      List<ASDMAttribute> _intrinsic_2 = table.getIntrinsic();
      for(final ASDMAttribute attr_7 : _intrinsic_2) {
        _builder.append("\t\t\t");
        CppTableAttributeDef _cppTableAttributeDef = new CppTableAttributeDef();
        CharSequence _doGenerate_3 = _cppTableAttributeDef.doGenerate(attr_7);
        _builder.append(_doGenerate_3, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Extrinsic Table Attributes //");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("////////////////////////////////");
    _builder.newLine();
    {
      List<ASDMAttribute> _extrinsic_1 = table.getExtrinsic();
      for(final ASDMAttribute attr_8 : _extrinsic_1) {
        _builder.append("\t\t\t");
        CppTableAttributeDef _cppTableAttributeDef_1 = new CppTableAttributeDef();
        CharSequence _doGenerate_4 = _cppTableAttributeDef_1.doGenerate(attr_8);
        _builder.append(_doGenerate_4, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("///////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Links //");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("///////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _link_2 = table.getLink();
      for(final ASDMAttribute linkAttr_1 : _link_2) {
        _builder.append("\t\t\t");
        CppTableLinksDef _cppTableLinksDef = new CppTableLinksDef();
        CharSequence _doGenerate_5 = _cppTableLinksDef.doGenerate(linkAttr_1);
        _builder.append(_doGenerate_5, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// binary-deserialization material from an EndianIStream  //");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("std::map<std::string, ");
    String _name_47 = table.getName();
    _builder.append(_name_47, "\t\t\t");
    _builder.append("AttributeFromBin> fromBinMethods;");
    _builder.newLineIfNotEmpty();
    {
      List<ASDMAttribute> _requiredAttributes_1 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_9 : _requiredAttributes_1) {
        _builder.append("\t\t\t");
        CharSequence _binaryDeserialize_2 = this.binaryDeserialize("EndianIStream", "eis", attr_9);
        _builder.append(_binaryDeserialize_2, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_10 : _optionalValueAttributes_1) {
        _builder.append("\t\t\t");
        CharSequence _binaryDeserialize_3 = this.binaryDeserialize("EndianIStream", "eis", attr_10);
        _builder.append(_binaryDeserialize_3, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("///////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// text-deserialization material //");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("///////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("std::map<std::string, ");
    String _name_48 = table.getName();
    _builder.append(_name_48, "\t\t\t");
    _builder.append("AttributeFromText> fromTextMethods;");
    _builder.newLineIfNotEmpty();
    {
      List<ASDMAttribute> _requiredAttributes_2 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_11 : _requiredAttributes_2) {
        _builder.append("\t\t\t");
        CharSequence _textDeserialize = this.textDeserialize(attr_11);
        _builder.append(_textDeserialize, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<ASDMAttribute> _optionalValueAttributes_2 = table.getOptionalValueAttributes();
      for(final ASDMAttribute attr_12 : _optionalValueAttributes_2) {
        _builder.append("\t\t\t");
        CharSequence _textDeserialize_1 = this.textDeserialize(attr_12);
        _builder.append(_textDeserialize_1, "\t\t\t");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* Serialize this into a stream of bytes written to an EndianOSStream.");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* @param eoss the EndianOSStream to be written to");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("void toBin(EndianOSStream& eoss);");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* Deserialize a stream of bytes read from an EndianIStream to build a PointingRow.");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* @param eiss the EndianIStream to be read.");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* @param table the ");
    String _name_49 = table.getName();
    _builder.append(_name_49, "\t\t\t ");
    _builder.append("Table to which the row built by deserialization will be parented.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t ");
    _builder.append("* @param attributesSeq a vector containing the names of the attributes . The elements order defines the order ");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* in which the attributes are written in the binary serialization.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("static ");
    String _name_50 = table.getName();
    _builder.append(_name_50, "\t\t\t\t");
    _builder.append("Row* fromBin(EndianIStream& eis, ");
    String _name_51 = table.getName();
    _builder.append(_name_51, "\t\t\t\t");
    _builder.append("Table& table, const std::vector<std::string>& attributesSeq);\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} // End namespace asdm");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif /* ");
    String _name_52 = table.getName();
    _builder.append(_name_52, "");
    _builder.append("_CLASS */");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence binaryDeserialize(final String binSourceType, final String binSource, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void ");
    String _name = attr.getName();
    _builder.append(_name, "");
    _builder.append("FromBin( ");
    _builder.append(binSourceType, "");
    _builder.append("& ");
    _builder.append(binSource, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence textDeserialize(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _typeName = attr.getTypeName();
      boolean _equals = _typeName.equals("EntityRef");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("void ");
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append("FromText (const string & s);");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
