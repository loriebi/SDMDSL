package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class CppTagTypeImpl {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("src/TagType.cpp");
    CharSequence _generateTagTypeImpl = this.generateTagTypeImpl();
    sdmFsa.generateFile(_generateTagTypeImpl);
  }
  
  public CharSequence generateTagTypeImpl() {
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
    _builder.append("* File TagType.cpp");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("#include \"TagType.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("const TagType* TagType::NoType = new TagType(\"NoType\") ;");
    _builder.newLine();
    {
      List<AlmaTable> _tables = this.container.getTables();
      for(final AlmaTable table : _tables) {
        {
          List<ASDMAttribute> _autoIncrementable = table.getAutoIncrementable();
          int _size = _autoIncrementable.size();
          boolean _notEquals = (_size != 0);
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("const TagType* TagType::");
            String _name = table.getName();
            _builder.append(_name, "\t");
            _builder.append(" = new TagType(\"");
            String _name_1 = table.getName();
            _builder.append(_name_1, "\t");
            _builder.append("\") ;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("map<string, const TagType*> fillName2TagType_m() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("map<string, const TagType*> result;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("result[\"NoType\"] = TagType::NoType;");
    _builder.newLine();
    {
      List<AlmaTable> _tables_1 = this.container.getTables();
      for(final AlmaTable table_1 : _tables_1) {
        {
          List<ASDMAttribute> _autoIncrementable_1 = table_1.getAutoIncrementable();
          int _size_1 = _autoIncrementable_1.size();
          boolean _notEquals_1 = (_size_1 != 0);
          if (_notEquals_1) {
            _builder.append("\t\t");
            _builder.append("result[\"");
            String _name_2 = table_1.getName();
            _builder.append(_name_2, "\t\t");
            _builder.append("\"] = TagType::");
            String _name_3 = table_1.getName();
            _builder.append(_name_3, "\t\t");
            _builder.append(" ;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static map<string, const TagType*> name2TagType_m = fillName2TagType_m();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TagType::TagTypeMgr TagType::tagTypeMgr;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TagType::TagType(string name) {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("this->name = name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string TagType::toString() const {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("return this->name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("const TagType* TagType::getTagType(string name) {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("return name2TagType_m[name];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} // End of namespace asdm");
    _builder.newLine();
    return _builder;
  }
}
