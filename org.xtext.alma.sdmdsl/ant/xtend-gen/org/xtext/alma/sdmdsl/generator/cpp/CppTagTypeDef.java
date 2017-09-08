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
public class CppTagTypeDef {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("include/TagType.h");
    CharSequence _generateTagTypeDef = this.generateTagTypeDef();
    sdmFsa.generateFile(_generateTagTypeDef);
  }
  
  public CharSequence generateTagTypeDef() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef TagType_CLASS");
    _builder.newLine();
    _builder.append("#define TagType_CLASS");
    _builder.newLine();
    _builder.append("#include <string>");
    _builder.newLine();
    _builder.append("#include <map>");
    _builder.newLine();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("** A class to represent the type of Tag , i.e. the ASDM class a Tag refers to.");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("class TagType {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* The string representation of a TagType.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @return the string representation of of TagType.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("virtual string toString() const;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Returns a TagType given a string.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* @return the TagType associated to the string given in as a parameter. E.g. getTagType(\"Holography\")");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* returns TagType.Holography. Returns 0 is no Tag is associated to the given string.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("static const TagType* getTagType(string name);");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* The TagType for a no typed Tag.");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/ ");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("static const TagType* NoType;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    {
      List<AlmaTable> _tables = this.container.getTables();
      for(final AlmaTable table : _tables) {
        {
          List<ASDMAttribute> _autoIncrementable = table.getAutoIncrementable();
          int _size = _autoIncrementable.size();
          boolean _notEquals = (_size != 0);
          if (_notEquals) {
            _builder.append("\t\t");
            _builder.append("/**");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append(" ");
            _builder.append("* The TagType for a ");
            String _name = table.getName();
            _builder.append(_name, "\t\t ");
            _builder.append(" Tag.");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("static const TagType*  ");
            String _name_1 = table.getName();
            _builder.append(_name_1, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("string name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("static map<string,const TagType*> name2TagType;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual ~TagType() {};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("TagType(string name);");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class TagTypeMgr {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t  \t");
    _builder.append("~TagTypeMgr () {");
    _builder.newLine();
    _builder.append("\t\t  \t\t");
    _builder.append("if (TagType::NoType) {delete TagType::NoType; TagType::NoType=0;}");
    _builder.newLine();
    {
      List<AlmaTable> _tables_1 = this.container.getTables();
      for(final AlmaTable table_1 : _tables_1) {
        {
          List<ASDMAttribute> _autoIncrementable_1 = table_1.getAutoIncrementable();
          int _size_1 = _autoIncrementable_1.size();
          boolean _notEquals_1 = (_size_1 != 0);
          if (_notEquals_1) {
            _builder.append("\t\t  \t\t");
            _builder.append("if (TagType:: ");
            String _name_2 = table_1.getName();
            _builder.append(_name_2, "\t\t  \t\t");
            _builder.append(") { delete TagType::");
            String _name_3 = table_1.getName();
            _builder.append(_name_3, "\t\t  \t\t");
            _builder.append("; TagType::");
            String _name_4 = table_1.getName();
            _builder.append(_name_4, "\t\t  \t\t");
            _builder.append(" = 0; }");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t  \t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t  \t");
    _builder.newLine();
    _builder.append("\t\t  \t");
    _builder.append("TagTypeMgr() {};");
    _builder.newLine();
    _builder.append("\t\t  \t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private :");
    _builder.newLine();
    _builder.append("\t\t   \t");
    _builder.append("TagTypeMgr(const TagTypeMgr&);");
    _builder.newLine();
    _builder.append("\t\t   \t");
    _builder.append("TagTypeMgr & operator=(const TagTypeMgr&);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("static TagTypeMgr tagTypeMgr;");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("} // end namespace asdm");
    _builder.newLine();
    _builder.append("#endif /* TagType_CLASS */");
    _builder.newLine();
    return _builder;
  }
}
