package org.xtext.alma.sdmdsl.generator.verbatimfiller;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class ASDMTablesImpl {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("/tmp/src/ASDMTables.cpp");
    CharSequence _generateASDMTablesImpl = this.generateASDMTablesImpl();
    sdmFsa.generateFile(_generateASDMTablesImpl);
  }
  
  public CharSequence generateASDMTablesImpl() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"ASDMTables.h\"");
    _builder.newLine();
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
    _builder.append("* File ASDMTables.cpp");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("#include <stdint.h>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        _builder.append("ASDM_");
        String _name = table.getName();
        String _upperCase = _name.toUpperCase();
        _builder.append(_upperCase, "");
        _builder.append("::ASDM_");
        String _name_1 = table.getName();
        String _upperCase_1 = _name_1.toUpperCase();
        _builder.append(_upperCase_1, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("name_ = \"ASDM_");
        String _name_2 = table.getName();
        String _upperCase_2 = _name_2.toUpperCase();
        _builder.append(_upperCase_2, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("tableDesc_.comment() = \"The verbatim copy of the ASDM\'s dataset ");
        String _name_3 = table.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" table\";");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _keyAttributes = table.getKeyAttributes();
          for(final ASDMAttribute attr : _keyAttributes) {
            _builder.append("\t");
            _builder.append("tableDesc_.addColumn(");
            String _casaColumnDesc = attr.casaColumnDesc();
            _builder.append(_casaColumnDesc, "\t");
            _builder.append("<");
            String _casaScalarType = attr.casaScalarType();
            _builder.append(_casaScalarType, "\t");
            _builder.append(">(\"");
            String _name_4 = attr.getName();
            _builder.append(_name_4, "\t");
            _builder.append("\", \"blabla\"));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _requiredValueAttributes = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_1 : _requiredValueAttributes) {
            _builder.append("\t");
            _builder.append("tableDesc_.addColumn(");
            String _casaColumnDesc_1 = attr_1.casaColumnDesc();
            _builder.append(_casaColumnDesc_1, "\t");
            _builder.append("<");
            String _casaScalarType_1 = attr_1.casaScalarType();
            _builder.append(_casaScalarType_1, "\t");
            _builder.append(">(\"");
            String _name_5 = attr_1.getName();
            _builder.append(_name_5, "\t");
            _builder.append("\", \"blabla\"));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
          for(final ASDMAttribute attr_2 : _optionalValueAttributes) {
            _builder.append("\t");
            _builder.append("tableDesc_.addColumn(");
            String _casaColumnDesc_2 = attr_2.casaColumnDesc();
            _builder.append(_casaColumnDesc_2, "\t");
            _builder.append("<");
            String _casaScalarType_2 = attr_2.casaScalarType();
            _builder.append(_casaScalarType_2, "\t");
            _builder.append(">(\"");
            String _name_6 = attr_2.getName();
            _builder.append(_name_6, "\t");
            _builder.append("\", \"blabla\"));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("ASDM_");
        String _name_7 = table.getName();
        String _upperCase_3 = _name_7.toUpperCase();
        _builder.append(_upperCase_3, "");
        _builder.append("::~ASDM_");
        String _name_8 = table.getName();
        String _upperCase_4 = _name_8.toUpperCase();
        _builder.append(_upperCase_4, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("const TableDesc& ASDM_");
        String _name_9 = table.getName();
        String _upperCase_5 = _name_9.toUpperCase();
        _builder.append(_upperCase_5, "");
        _builder.append("::tableDesc() const {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("return tableDesc_;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("#include \"");
        String _name_10 = table.getName();
        _builder.append(_name_10, "");
        _builder.append("Table.h\"");
        _builder.newLineIfNotEmpty();
        _builder.append("#include \"");
        String _name_11 = table.getName();
        _builder.append(_name_11, "");
        _builder.append("Row.h\"");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          List<ASDMAttribute> _intrinsic = table.getIntrinsic();
          for(final ASDMAttribute attr_3 : _intrinsic) {
            {
              boolean _isEnumeration = attr_3.isEnumeration();
              if (_isEnumeration) {
                _builder.append("using namespace ");
                String _typeName = attr_3.getTypeName();
                _builder.append(_typeName, "");
                _builder.append("Mod;");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("void ASDM_");
        String _name_12 = table.getName();
        String _upperCase_6 = _name_12.toUpperCase();
        _builder.append(_upperCase_6, "");
        _builder.append("::fill(const ASDM& asdm) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("vector<");
        String _name_13 = table.getName();
        _builder.append(_name_13, "\t");
        _builder.append("Row*> rows = asdm.get");
        String _name_14 = table.getName();
        _builder.append(_name_14, "\t");
        _builder.append("().get();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("unsigned int rowIndex = table_p_->nrow();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("table_p_->addRow(rows.size());");
        _builder.newLine();
        {
          List<ASDMAttribute> _keyAttributes_1 = table.getKeyAttributes();
          for(final ASDMAttribute attr_4 : _keyAttributes_1) {
            _builder.append("\t");
            String _casaColumn = attr_4.casaColumn();
            _builder.append(_casaColumn, "\t");
            _builder.append("<");
            String _casaScalarType_3 = attr_4.casaScalarType();
            _builder.append(_casaScalarType_3, "\t");
            _builder.append("> ");
            String _name_15 = attr_4.getName();
            _builder.append(_name_15, "\t");
            _builder.append("(*table_p_, \"");
            String _name_16 = attr_4.getName();
            _builder.append(_name_16, "\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _requiredValueAttributes_1 = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_5 : _requiredValueAttributes_1) {
            _builder.append("\t");
            String _casaColumn_1 = attr_5.casaColumn();
            _builder.append(_casaColumn_1, "\t");
            _builder.append("<");
            String _casaScalarType_4 = attr_5.casaScalarType();
            _builder.append(_casaScalarType_4, "\t");
            _builder.append("> ");
            String _name_17 = attr_5.getName();
            _builder.append(_name_17, "\t");
            _builder.append("(*table_p_, \"");
            String _name_18 = attr_5.getName();
            _builder.append(_name_18, "\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
          for(final ASDMAttribute attr_6 : _optionalValueAttributes_1) {
            _builder.append("\t");
            String _casaColumn_2 = attr_6.casaColumn();
            _builder.append(_casaColumn_2, "\t");
            _builder.append("<");
            String _casaScalarType_5 = attr_6.casaScalarType();
            _builder.append(_casaScalarType_5, "\t");
            _builder.append("> ");
            String _name_19 = attr_6.getName();
            _builder.append(_name_19, "\t");
            _builder.append("(*table_p_, \"");
            String _name_20 = attr_6.getName();
            _builder.append(_name_20, "\t");
            _builder.append("\");  ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("for (unsigned int i = 0; i < rows.size(); i++) {");
        _builder.newLine();
        {
          List<ASDMAttribute> _keyAttributes_2 = table.getKeyAttributes();
          for(final ASDMAttribute attr_7 : _keyAttributes_2) {
            _builder.append("\t\t");
            CharSequence _PUT = this.PUT("rowIndex", "rows.at(i)->", attr_7);
            _builder.append(_PUT, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _requiredValueAttributes_2 = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_8 : _requiredValueAttributes_2) {
            _builder.append("\t\t");
            CharSequence _PUT_1 = this.PUT("rowIndex", "rows.at(i)->", attr_8);
            _builder.append(_PUT_1, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _optionalValueAttributes_2 = table.getOptionalValueAttributes();
          for(final ASDMAttribute attr_9 : _optionalValueAttributes_2) {
            _builder.append("\t\t");
            CharSequence _PUTOPT = this.PUTOPT("rowIndex", "rows.at(i)->", attr_9);
            _builder.append(_PUTOPT, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("rowIndex++;\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence PUT(final String rowIndex, final String rowContext, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isArray = attr.isArray();
      if (_isArray) {
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append(".put(");
        _builder.append(rowIndex, "");
        _builder.append(", ");
        String _casaArrayValue = attr.casaArrayValue(rowContext);
        _builder.append(_casaArrayValue, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.append(".put(");
        _builder.append(rowIndex, "");
        _builder.append(", ");
        String _casaScalarValue = attr.casaScalarValue(rowContext);
        _builder.append(_casaScalarValue, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence PUTOPT(final String rowIndex, final String rowContext, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isArray = attr.isArray();
      if (_isArray) {
        _builder.append("if (");
        _builder.append(rowContext, "");
        _builder.append("is");
        String _UpperCaseName = attr.UpperCaseName();
        _builder.append(_UpperCaseName, "");
        _builder.append("Exists())");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name = attr.getName();
        _builder.append(_name, "\t");
        _builder.append(".put(");
        _builder.append(rowIndex, "\t");
        _builder.append(", ");
        String _casaArrayValue = attr.casaArrayValue(rowContext);
        _builder.append(_casaArrayValue, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("if (");
        _builder.append(rowContext, "");
        _builder.append("is");
        String _UpperCaseName_1 = attr.UpperCaseName();
        _builder.append(_UpperCaseName_1, "");
        _builder.append("Exists())");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "\t");
        _builder.append(".put(");
        _builder.append(rowIndex, "\t");
        _builder.append(", ");
        String _casaScalarValue = attr.casaScalarValue(rowContext);
        _builder.append(_casaScalarValue, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
