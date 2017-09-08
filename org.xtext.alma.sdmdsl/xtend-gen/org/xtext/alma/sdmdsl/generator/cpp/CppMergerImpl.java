package org.xtext.alma.sdmdsl.generator.cpp;

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
public class CppMergerImpl {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("src/Merger.cpp");
    CharSequence _generateMergerImpl = this.generateMergerImpl();
    sdmFsa.generateFile(_generateMergerImpl);
  }
  
  public CharSequence generateMergerImpl() {
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
    _builder.append("* File Merger.h");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("#include <Merger.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Merger::Merger() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this->ds1 = (");
    String _name = this.container.getName();
    _builder.append(_name, "\t\t");
    _builder.append(" *) 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this->ds2 = (");
    String _name_1 = this.container.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append(" *) 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<AlmaTable> _tables = this.container.getTables();
      for(final AlmaTable table : _tables) {
        _builder.append("\t\t");
        _builder.append("Merger::merge");
        String _name_2 = table.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("Ptr = &Merger::merge");
        String _name_3 = table.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Merger::~Merger() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void Merger::merge(");
    String _name_4 = this.container.getName();
    _builder.append(_name_4, "\t");
    _builder.append("* ds1, ");
    String _name_5 = this.container.getName();
    _builder.append(_name_5, "\t");
    _builder.append("* ds2) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this->ds1 = ds1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this->ds2 = ds2;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<AlmaTable> _tables_1 = this.container.getTables();
      for(final AlmaTable table_1 : _tables_1) {
        _builder.append("\t\t");
        _builder.append("hasMerged");
        String _name_6 = table_1.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append(" = false;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("merge");
        String _name_7 = table_1.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append("( );");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("postMerge");
        String _name_8 = table_1.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append("( );");
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
      List<AlmaTable> _tables_2 = this.container.getTables();
      for(final AlmaTable table_2 : _tables_2) {
        _builder.append("\t");
        _builder.append("void Merger::merge");
        String _name_9 = table_2.getName();
        _builder.append(_name_9, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("cout << \"Entering Merger::merge");
        String _name_10 = table_2.getName();
        _builder.append(_name_10, "\t\t");
        _builder.append("\" << endl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (hasMerged");
        String _name_11 = table_2.getName();
        _builder.append(_name_11, "\t\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("cout << \"Exiting Merger::merge");
        String _name_12 = table_2.getName();
        _builder.append(_name_12, "\t\t\t");
        _builder.append("\" << endl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("vector <");
        String _name_13 = table_2.getName();
        _builder.append(_name_13, "\t\t");
        _builder.append("Row *> rows2 = ds2->get");
        String _name_14 = table_2.getName();
        _builder.append(_name_14, "\t\t");
        _builder.append("().get();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for (unsigned int i = 0; i < rows2.size(); i++) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("cout << \"Merger::merge");
        String _name_15 = table_2.getName();
        _builder.append(_name_15, "\t\t\t");
        _builder.append(" merging row #\" << i << endl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        String _name_16 = table_2.getName();
        _builder.append(_name_16, "\t\t\t");
        _builder.append("Row * row = ds1->get");
        String _name_17 = table_2.getName();
        _builder.append(_name_17, "\t\t\t");
        _builder.append("().newRow(rows2.at(i));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        {
          List<ASDMAttribute> _RequiredExtrinsicAttributesSet = table_2.RequiredExtrinsicAttributesSet();
          int _size = _RequiredExtrinsicAttributesSet.size();
          boolean _notEquals = (_size != 0);
          if (_notEquals) {
            {
              List<ASDMAttribute> _RequiredExtrinsicAttributesSet_1 = table_2.RequiredExtrinsicAttributesSet();
              for(final ASDMAttribute att : _RequiredExtrinsicAttributesSet_1) {
                {
                  boolean _isArray = att.isArray();
                  if (_isArray) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("vector<");
                    String _CppType = att.CppType();
                    _builder.append(_CppType, "\t\t\t");
                    _builder.append("> ");
                    String _name_18 = att.getName();
                    _builder.append(_name_18, "\t\t\t");
                    _builder.append("2 = rows2.at(i)->get");
                    String _UpperCaseName = att.UpperCaseName();
                    _builder.append(_UpperCaseName, "\t\t\t");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("vector<");
                    String _CppType_1 = att.CppType();
                    _builder.append(_CppType_1, "\t\t\t");
                    _builder.append("> ");
                    String _name_19 = att.getName();
                    _builder.append(_name_19, "\t\t\t");
                    _builder.append("1;");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("for (unsigned int j = 0; j < ");
                    String _name_20 = att.getName();
                    _builder.append(_name_20, "\t\t\t");
                    _builder.append("2.size(); j++)");
                    _builder.newLineIfNotEmpty();
                    {
                      String _JavaType = att.JavaType();
                      boolean _equals = _JavaType.equals("Tag");
                      if (_equals) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("\t");
                        String _name_21 = att.getName();
                        _builder.append(_name_21, "\t\t\t\t");
                        _builder.append("1.push_back(getTag(");
                        String _name_22 = att.getName();
                        _builder.append(_name_22, "\t\t\t\t");
                        _builder.append("2.at(j), merge");
                        String _refersTo = att.getRefersTo();
                        _builder.append(_refersTo, "\t\t\t\t");
                        _builder.append("Ptr));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isId = att.isId();
                        if (_isId) {
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("\t");
                          String _name_23 = att.getName();
                          _builder.append(_name_23, "\t\t\t\t");
                          _builder.append("1.push_back(getId(\"");
                          String _refersTo_1 = att.getRefersTo();
                          _builder.append(_refersTo_1, "\t\t\t\t");
                          _builder.append("\", ");
                          String _name_24 = att.getName();
                          _builder.append(_name_24, "\t\t\t\t");
                          _builder.append("2.at(j), merge");
                          String _refersTo_2 = att.getRefersTo();
                          _builder.append(_refersTo_2, "\t\t\t\t");
                          _builder.append("Ptr));");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("row->set");
                    String _UpperCaseName_1 = att.UpperCaseName();
                    _builder.append(_UpperCaseName_1, "\t\t\t");
                    _builder.append("(\t");
                    String _name_25 = att.getName();
                    _builder.append(_name_25, "\t\t\t");
                    _builder.append("1);");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.newLine();
                    {
                      String _JavaType_1 = att.JavaType();
                      boolean _equals_1 = _JavaType_1.equals("Tag");
                      if (_equals_1) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("Tag ");
                        String _name_26 = att.getName();
                        _builder.append(_name_26, "\t\t\t");
                        _builder.append("Tag = getTag(row->get");
                        String _UpperCaseName_2 = att.UpperCaseName();
                        _builder.append(_UpperCaseName_2, "\t\t\t");
                        _builder.append("(), merge");
                        String _refersTo_3 = att.getRefersTo();
                        _builder.append(_refersTo_3, "\t\t\t");
                        _builder.append("Ptr);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("row->set");
                        String _UpperCaseName_3 = att.UpperCaseName();
                        _builder.append(_UpperCaseName_3, "\t\t\t");
                        _builder.append("(");
                        String _name_27 = att.getName();
                        _builder.append(_name_27, "\t\t\t");
                        _builder.append("Tag);");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isId_1 = att.isId();
                        if (_isId_1) {
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("row->set");
                          String _UpperCaseName_4 = att.UpperCaseName();
                          _builder.append(_UpperCaseName_4, "\t\t\t");
                          _builder.append("(getId(\"");
                          String _refersTo_4 = att.getRefersTo();
                          _builder.append(_refersTo_4, "\t\t\t");
                          _builder.append("\", row->get");
                          String _UpperCaseName_5 = att.UpperCaseName();
                          _builder.append(_UpperCaseName_5, "\t\t\t");
                          _builder.append("(), merge");
                          String _refersTo_5 = att.getRefersTo();
                          _builder.append(_refersTo_5, "\t\t\t");
                          _builder.append("Ptr));");
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
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        String _name_28 = table_2.getName();
        _builder.append(_name_28, "\t\t\t");
        _builder.append("Row * retRow = ds1->get");
        String _name_29 = table_2.getName();
        _builder.append(_name_29, "\t\t\t");
        _builder.append("().add(row);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if (false) cout << (unsigned long long) retRow;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        {
          boolean _NoAutoIncrementableAttribute = table_2.NoAutoIncrementableAttribute();
          boolean _not = (!_NoAutoIncrementableAttribute);
          if (_not) {
            {
              ASDMAttribute _TheAutoIncrementableAttribute = table_2.TheAutoIncrementableAttribute();
              String _JavaType_2 = _TheAutoIncrementableAttribute.JavaType();
              boolean _equals_2 = Objects.equal(_JavaType_2, "Tag");
              if (_equals_2) {
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("tagTag.insert(make_pair(rows2.at(i)->get");
                ASDMAttribute _TheAutoIncrementableAttribute_1 = table_2.TheAutoIncrementableAttribute();
                String _UpperCaseName_6 = _TheAutoIncrementableAttribute_1.UpperCaseName();
                _builder.append(_UpperCaseName_6, "\t\t\t");
                _builder.append("().toString(), retRow->get");
                ASDMAttribute _TheAutoIncrementableAttribute_2 = table_2.TheAutoIncrementableAttribute();
                String _UpperCaseName_7 = _TheAutoIncrementableAttribute_2.UpperCaseName();
                _builder.append(_UpperCaseName_7, "\t\t\t");
                _builder.append("()));");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("idId.insert(make_pair(\"");
                String _name_30 = table_2.getName();
                _builder.append(_name_30, "\t\t\t");
                _builder.append("_\"+Integer::toString(rows2.at(i)->get");
                ASDMAttribute _TheAutoIncrementableAttribute_3 = table_2.TheAutoIncrementableAttribute();
                String _UpperCaseName_8 = _TheAutoIncrementableAttribute_3.UpperCaseName();
                _builder.append(_UpperCaseName_8, "\t\t\t");
                _builder.append("()), retRow->get");
                ASDMAttribute _TheAutoIncrementableAttribute_4 = table_2.TheAutoIncrementableAttribute();
                String _UpperCaseName_9 = _TheAutoIncrementableAttribute_4.UpperCaseName();
                _builder.append(_UpperCaseName_9, "\t\t\t");
                _builder.append("()));");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("hasMerged");
        String _name_31 = table_2.getName();
        _builder.append(_name_31, "\t\t");
        _builder.append(" = true;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("cout << \"Exiting Merger::merge");
        String _name_32 = table_2.getName();
        _builder.append(_name_32, "\t\t");
        _builder.append("\" << endl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("void Merger::postMerge");
        String _name_33 = table_2.getName();
        _builder.append(_name_33, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("cout << \"Entering Merger::postMerge");
        String _name_34 = table_2.getName();
        _builder.append(_name_34, "\t\t");
        _builder.append("\" << endl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        {
          List<ASDMAttribute> _OptionalExtrinsicAttributesSet = table_2.OptionalExtrinsicAttributesSet();
          int _size_1 = _OptionalExtrinsicAttributesSet.size();
          boolean _notEquals_1 = (_size_1 != 0);
          if (_notEquals_1) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("vector <");
            String _name_35 = table_2.getName();
            _builder.append(_name_35, "\t\t");
            _builder.append("Row *> rows1 = ds1->get");
            String _name_36 = table_2.getName();
            _builder.append(_name_36, "\t\t");
            _builder.append("().get();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            String _name_37 = table_2.getName();
            _builder.append(_name_37, "\t\t");
            _builder.append("Row *row1 = 0;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("for (unsigned int i = 0; i < rows1.size(); i++) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("row1 = rows1.at(i);");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            {
              List<ASDMAttribute> _OptionalExtrinsicAttributesSet_1 = table_2.OptionalExtrinsicAttributesSet();
              for(final ASDMAttribute att_1 : _OptionalExtrinsicAttributesSet_1) {
                {
                  boolean _isOptional = att_1.isOptional();
                  if (_isOptional) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("if (row1->is");
                    String _UpperCaseName_10 = att_1.UpperCaseName();
                    _builder.append(_UpperCaseName_10, "\t\t\t");
                    _builder.append("Exists()) {");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _isArray_1 = att_1.isArray();
                      if (_isArray_1) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("vector<");
                        String _CppType_2 = att_1.CppType();
                        _builder.append(_CppType_2, "\t\t\t\t");
                        _builder.append("> ");
                        String _name_38 = att_1.getName();
                        _builder.append(_name_38, "\t\t\t\t");
                        _builder.append("1 = row1->get");
                        String _UpperCaseName_11 = att_1.UpperCaseName();
                        _builder.append(_UpperCaseName_11, "\t\t\t\t");
                        _builder.append("();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("vector<");
                        String _CppType_3 = att_1.CppType();
                        _builder.append(_CppType_3, "\t\t\t\t");
                        _builder.append("> ");
                        String _name_39 = att_1.getName();
                        _builder.append(_name_39, "\t\t\t\t");
                        _builder.append("1_new;");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("for (unsigned int j = 0; j < ");
                        String _name_40 = att_1.getName();
                        _builder.append(_name_40, "\t\t\t\t");
                        _builder.append("1.size(); j++) {");
                        _builder.newLineIfNotEmpty();
                        {
                          String _JavaType_3 = att_1.JavaType();
                          boolean _equals_3 = Objects.equal(_JavaType_3, "Tag");
                          if (_equals_3) {
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("\t");
                            String _name_41 = att_1.getName();
                            _builder.append(_name_41, "\t\t\t\t\t");
                            _builder.append("1_new.push_back(getTag( ");
                            String _name_42 = att_1.getName();
                            _builder.append(_name_42, "\t\t\t\t\t");
                            _builder.append("1.at(j), 0));");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _isId_2 = att_1.isId();
                            if (_isId_2) {
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("\t");
                              String _name_43 = att_1.getName();
                              _builder.append(_name_43, "\t\t\t\t\t");
                              _builder.append("1_new.push_back(getId(\"");
                              String _refersTo_6 = att_1.getRefersTo();
                              _builder.append(_refersTo_6, "\t\t\t\t\t");
                              _builder.append("\", ");
                              String _name_44 = att_1.getName();
                              _builder.append(_name_44, "\t\t\t\t\t");
                              _builder.append("1.at(j), 0));");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("row1->set");
                        String _UpperCaseName_12 = att_1.UpperCaseName();
                        _builder.append(_UpperCaseName_12, "\t\t\t\t");
                        _builder.append("(\t");
                        String _name_45 = att_1.getName();
                        _builder.append(_name_45, "\t\t\t\t");
                        _builder.append("1_new);");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.newLine();
                        {
                          String _JavaType_4 = att_1.JavaType();
                          boolean _equals_4 = _JavaType_4.equals("Tag");
                          if (_equals_4) {
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("row1->set");
                            String _UpperCaseName_13 = att_1.UpperCaseName();
                            _builder.append(_UpperCaseName_13, "\t\t\t\t\t");
                            _builder.append("(getTag(row1->get");
                            String _UpperCaseName_14 = att_1.UpperCaseName();
                            _builder.append(_UpperCaseName_14, "\t\t\t\t\t");
                            _builder.append("(), 0));");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _isId_3 = att_1.isId();
                            if (_isId_3) {
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("row1->set");
                              String _UpperCaseName_15 = att_1.UpperCaseName();
                              _builder.append(_UpperCaseName_15, "\t\t\t\t\t");
                              _builder.append("(getId(\"");
                              String _refersTo_7 = att_1.getRefersTo();
                              _builder.append(_refersTo_7, "\t\t\t\t\t");
                              _builder.append("\", row1->get");
                              String _UpperCaseName_16 = att_1.UpperCaseName();
                              _builder.append(_UpperCaseName_16, "\t\t\t\t\t");
                              _builder.append("(), 0));");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append(";");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("cout << \"Exiting Merger::postMerge");
        String _name_46 = table_2.getName();
        _builder.append(_name_46, "\t\t");
        _builder.append("\" << endl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Tag Merger::getTag(const Tag& t, void (Merger::*mergeTables)()) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (mergeTables != 0) (this->*mergeTables)();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("map<string, Tag>::iterator iter = tagTag.find(t.toString());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (iter!=tagTag.end()) return iter->second;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Should throw an exception here.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cout << \"Could not find the mapped Tag for \" << t.toString() << endl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Tag();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int Merger::getId(const string& tableName, int id, void (Merger::*mergeTables)()) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (mergeTables != 0) (this->*mergeTables)();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("map<string, int>::iterator iter = idId.find(tableName+\"_\"+Integer::toString(id));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (iter != idId.end()) return iter->second;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Should throw an exception here.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cout << \"Could not find the mapped Id for \" << id << endl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return -1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} // End of namespace asdm");
    _builder.newLine();
    return _builder;
  }
}
