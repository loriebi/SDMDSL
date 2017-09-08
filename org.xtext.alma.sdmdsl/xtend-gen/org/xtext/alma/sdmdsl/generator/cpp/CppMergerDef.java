package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class CppMergerDef {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("include/Merger.h");
    CharSequence _generateMergerDef = this.generateMergerDef();
    sdmFsa.generateFile(_generateMergerDef);
  }
  
  public CharSequence generateMergerDef() {
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
    _builder.append("#ifndef Merger_CLASS");
    _builder.newLine();
    _builder.append("#define Merger_CLASS");
    _builder.newLine();
    _builder.append("#include <map>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include \"");
    String _name = this.container.getName();
    _builder.append(_name, "");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    {
      List<AlmaTable> _tables = this.container.getTables();
      for(final AlmaTable table : _tables) {
        _builder.append("#include \"");
        String _name_1 = table.getName();
        _builder.append(_name_1, "");
        _builder.append("Table.h\"");
        _builder.newLineIfNotEmpty();
        _builder.append("#include \"");
        String _name_2 = table.getName();
        _builder.append(_name_2, "");
        _builder.append("Row.h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("/*\\file \"Merger.h\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\\brief Generated from model\'s revision \"");
    String _revision = AlmaTableContainer.getRevision();
    _builder.append(_revision, "    ");
    _builder.append("\", branch \"");
    String _branch = AlmaTableContainer.getBranch();
    _builder.append(_branch, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class Merger {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public :");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Merger();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("virtual ~Merger();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void merge(");
    String _name_3 = this.container.getName();
    _builder.append(_name_3, "\t\t\t\t");
    _builder.append("* ds1, ");
    String _name_4 = this.container.getName();
    _builder.append(_name_4, "\t\t\t\t");
    _builder.append("* ds2);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ASDM* ds1;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ASDM* ds2;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("map<string, Tag> tagTag;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Tag getTag(const Tag& t, void (Merger::*mergeTables)());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("map<string, int> idId;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("int getId(const string& tableName, int id, void (Merger::*mergeTables)());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      List<AlmaTable> _tables_1 = this.container.getTables();
      for(final AlmaTable table_1 : _tables_1) {
        _builder.append("\t\t\t");
        _builder.append("bool hasMerged");
        String _name_5 = table_1.getName();
        _builder.append(_name_5, "\t\t\t");
        _builder.append(";\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      List<AlmaTable> _tables_2 = this.container.getTables();
      for(final AlmaTable table_2 : _tables_2) {
        _builder.append("\t\t\t");
        _builder.append("void merge");
        String _name_6 = table_2.getName();
        _builder.append(_name_6, "\t\t\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("void postMerge");
        String _name_7 = table_2.getName();
        _builder.append(_name_7, "\t\t\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      List<AlmaTable> _tables_3 = this.container.getTables();
      for(final AlmaTable table_3 : _tables_3) {
        _builder.append("\t\t\t");
        _builder.append("void (Merger::*merge");
        String _name_8 = table_3.getName();
        _builder.append(_name_8, "\t\t\t");
        _builder.append("Ptr) () ;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} // End namespace asdm");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif  /* Merger_CLASS */");
    _builder.newLine();
    return _builder;
  }
}
