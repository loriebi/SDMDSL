package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CTableWrapperImpl {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  /**
   * CTableWrapperImpl generator (append to sdmWrapper.cpp file)
   */
  public CharSequence doGenerate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      List<AlmaTable> _tables = this.container.getTables();
      for(final AlmaTable table : _tables) {
        CharSequence _generateCTableWrapperImpl = this.generateCTableWrapperImpl(table);
        _builder.append(_generateCTableWrapperImpl, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateCTableWrapperImpl(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ASDMAttribute> _intrinsic = table.getIntrinsic();
      for(final ASDMAttribute attr : _intrinsic) {
        {
          boolean _isEnumeration = attr.isEnumeration();
          if (_isEnumeration) {
            _builder.append("using namespace ");
            String _typeName = attr.getTypeName();
            _builder.append(_typeName, "");
            _builder.append("Mod;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("// =================== ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("Table ============================");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      String _name_1 = table.getName();
      boolean _notEquals = (!Objects.equal(_name_1, "DataDescription"));
      if (_notEquals) {
        _builder.append("extern \"C\" int sdm_add");
        String _name_2 = table.getName();
        _builder.append(_name_2, "");
        _builder.append("Row (");
        String _RequiredAddCList = table.RequiredAddCList();
        _builder.append(_RequiredAddCList, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_3 = table.getName();
        boolean _equals = Objects.equal(_name_3, "DataDescription");
        if (_equals) {
          _builder.append("extern \"C\" int sdm_add");
          String _name_4 = table.getName();
          _builder.append(_name_4, "");
          _builder.append("Row (");
          String _RequiredAddCList_1 = table.RequiredAddCList();
          _builder.append(_RequiredAddCList_1, "");
          _builder.append(", bool * holoType);");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("extern \"C\" int sdm_get");
    String _name_5 = table.getName();
    _builder.append(_name_5, "");
    _builder.append("Row (");
    String _RequiredGetCList = table.RequiredGetCList();
    _builder.append(_RequiredGetCList, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("extern \"C\" int sdm_get");
    String _name_6 = table.getName();
    _builder.append(_name_6, "");
    _builder.append("TableSize ();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("extern \"C\" int sdm_get");
    String _name_7 = table.getName();
    _builder.append(_name_7, "");
    _builder.append("Keys (");
    String _KeyCTypeList = table.KeyCTypeList();
    _builder.append(_KeyCTypeList, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Create a new row initialized to the specified values.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return a pointer on the created and initialized row.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    {
      String _name_8 = table.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_8, "DataDescription"));
      if (_notEquals_1) {
        _builder.append("int  sdm_add");
        String _name_9 = table.getName();
        _builder.append(_name_9, "");
        _builder.append("Row (");
        String _RequiredAddCList_2 = table.RequiredAddCList();
        _builder.append(_RequiredAddCList_2, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_10 = table.getName();
        boolean _equals_1 = Objects.equal(_name_10, "DataDescription");
        if (_equals_1) {
          _builder.append("int  sdm_add");
          String _name_11 = table.getName();
          _builder.append(_name_11, "");
          _builder.append("Row (");
          String _RequiredAddCList_3 = table.RequiredAddCList();
          _builder.append(_RequiredAddCList_3, "");
          _builder.append(", bool * holoType){");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (dataset==0) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cout<<\"No dataset initialized\"<<endl;");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("return -1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    String _name_12 = table.getName();
    _builder.append(_name_12, "\t");
    _builder.append("Table &table = dataset->get");
    String _name_13 = table.getName();
    _builder.append(_name_13, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_14 = table.getName();
    _builder.append(_name_14, "\t");
    _builder.append("Row *row = 0;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes = table.getRequiredAttributes();
      for(final ASDMAttribute attr_1 : _requiredAttributes) {
        {
          boolean _isArray = attr_1.isArray();
          if (_isArray) {
            _builder.append("\t");
            _builder.append("// ");
            String _name_15 = attr_1.getName();
            _builder.append(_name_15, "\t");
            _builder.append(" is an Array");
            _builder.newLineIfNotEmpty();
            {
              boolean _or = false;
              int _dimension = attr_1.getDimension();
              boolean _equals_2 = (_dimension == 1);
              if (_equals_2) {
                _or = true;
              } else {
                boolean _isExtrinsic = attr_1.isExtrinsic();
                _or = _isExtrinsic;
              }
              if (_or) {
                _builder.append("\t");
                _builder.append("// ");
                String _name_16 = attr_1.getName();
                _builder.append(_name_16, "\t");
                _builder.append(" is OneD");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isStringType = attr_1.isStringType();
                  boolean _not = (!_isStringType);
                  if (_not) {
                    _builder.append("\t");
                    String _CppType = attr_1.CppType();
                    _builder.append(_CppType, "\t");
                    _builder.append("  ");
                    String _name_17 = attr_1.getName();
                    _builder.append(_name_17, "\t");
                    _builder.append("Vec(");
                    String _name_18 = attr_1.getName();
                    _builder.append(_name_18, "\t");
                    _builder.append("Dim[0]);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for (int i=0;i<");
                    String _name_19 = attr_1.getName();
                    _builder.append(_name_19, "\t");
                    _builder.append("Dim[0];i++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    String _name_20 = attr_1.getName();
                    _builder.append(_name_20, "\t\t");
                    _builder.append("Vec[i]= ");
                    String _SimpleCppType = attr_1.SimpleCppType();
                    _builder.append(_SimpleCppType, "\t\t");
                    _builder.append("(");
                    String _name_21 = attr_1.getName();
                    _builder.append(_name_21, "\t\t");
                    _builder.append("[i]   ");
                    {
                      String _SimpleCppType_1 = attr_1.SimpleCppType();
                      boolean _equals_3 = Objects.equal(_SimpleCppType_1, "Tag");
                      if (_equals_3) {
                        _builder.append(", ");
                        String _CppTagType = attr_1.CppTagType();
                        _builder.append(_CppTagType, "\t\t");
                      }
                    }
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    String _CppType_1 = attr_1.CppType();
                    _builder.append(_CppType_1, "\t");
                    _builder.append("  ");
                    String _name_22 = attr_1.getName();
                    _builder.append(_name_22, "\t");
                    _builder.append("Vec(");
                    String _name_23 = attr_1.getName();
                    _builder.append(_name_23, "\t");
                    _builder.append("Dim[2]);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for (int i=0;i<");
                    String _name_24 = attr_1.getName();
                    _builder.append(_name_24, "\t");
                    _builder.append("Dim[2];i++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    String _name_25 = attr_1.getName();
                    _builder.append(_name_25, "\t\t");
                    _builder.append("Vec[i]= ");
                    String _SimpleCppType_2 = attr_1.SimpleCppType();
                    _builder.append(_SimpleCppType_2, "\t\t");
                    _builder.append("(");
                    String _name_26 = attr_1.getName();
                    _builder.append(_name_26, "\t\t");
                    _builder.append("+i*");
                    String _name_27 = attr_1.getName();
                    _builder.append(_name_27, "\t\t");
                    _builder.append("Dim[1]  ");
                    {
                      String _SimpleCppType_3 = attr_1.SimpleCppType();
                      boolean _equals_4 = Objects.equal(_SimpleCppType_3, "Tag");
                      if (_equals_4) {
                        _builder.append(", ");
                        String _CppTagType_1 = attr_1.CppTagType();
                        _builder.append(_CppTagType_1, "\t\t");
                      }
                    }
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                int _dimension_1 = attr_1.getDimension();
                boolean _equals_5 = (_dimension_1 == 2);
                if (_equals_5) {
                  _builder.append("\t");
                  _builder.append("// ");
                  String _name_28 = attr_1.getName();
                  _builder.append(_name_28, "\t");
                  _builder.append(" is 2 D");
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _isStringType_1 = attr_1.isStringType();
                    boolean _not_1 = (!_isStringType_1);
                    if (_not_1) {
                      _builder.append("\t");
                      String _CppType_2 = attr_1.CppType();
                      _builder.append(_CppType_2, "\t");
                      _builder.append("  ");
                      String _name_29 = attr_1.getName();
                      _builder.append(_name_29, "\t");
                      _builder.append("Vec(");
                      String _name_30 = attr_1.getName();
                      _builder.append(_name_30, "\t");
                      _builder.append("Dim[2]);   // Inversion of dim in fortran/C");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (int i=0;i<");
                      String _name_31 = attr_1.getName();
                      _builder.append(_name_31, "\t");
                      _builder.append("Dim[2];i++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t");
                      String _name_32 = attr_1.getName();
                      _builder.append(_name_32, "\t\t");
                      _builder.append("Vec[i].resize(");
                      String _name_33 = attr_1.getName();
                      _builder.append(_name_33, "\t\t");
                      _builder.append("Dim[0]);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t");
                      _builder.append("for (int j=0;j<");
                      String _name_34 = attr_1.getName();
                      _builder.append(_name_34, "\t\t");
                      _builder.append("Dim[0];j++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t\t");
                      String _name_35 = attr_1.getName();
                      _builder.append(_name_35, "\t\t\t");
                      _builder.append("Vec[i][j]= ");
                      String _SimpleCppType_4 = attr_1.SimpleCppType();
                      _builder.append(_SimpleCppType_4, "\t\t\t");
                      _builder.append("(");
                      String _name_36 = attr_1.getName();
                      _builder.append(_name_36, "\t\t\t");
                      _builder.append("[i*");
                      String _name_37 = attr_1.getName();
                      _builder.append(_name_37, "\t\t\t");
                      _builder.append("Dim[1]+j]  ");
                      {
                        String _SimpleCppType_5 = attr_1.SimpleCppType();
                        boolean _equals_6 = Objects.equal(_SimpleCppType_5, "Tag");
                        if (_equals_6) {
                          _builder.append(", ");
                          String _CppTagType_2 = attr_1.CppTagType();
                          _builder.append(_CppTagType_2, "\t\t\t");
                        }
                      }
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t");
                      String _CppType_3 = attr_1.CppType();
                      _builder.append(_CppType_3, "\t");
                      _builder.append("  ");
                      String _name_38 = attr_1.getName();
                      _builder.append(_name_38, "\t");
                      _builder.append("Vec(");
                      String _name_39 = attr_1.getName();
                      _builder.append(_name_39, "\t");
                      _builder.append("Dim[4]);   // Inversion of dim in fortran/C");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (int i=0;i<");
                      String _name_40 = attr_1.getName();
                      _builder.append(_name_40, "\t");
                      _builder.append("Dim[4];i++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t");
                      String _name_41 = attr_1.getName();
                      _builder.append(_name_41, "\t\t");
                      _builder.append("Vec[i].resize(");
                      String _name_42 = attr_1.getName();
                      _builder.append(_name_42, "\t\t");
                      _builder.append("Dim[2]);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t");
                      _builder.append("for (int j=0;j<");
                      String _name_43 = attr_1.getName();
                      _builder.append(_name_43, "\t\t");
                      _builder.append("Dim[2];j++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t\t");
                      String _name_44 = attr_1.getName();
                      _builder.append(_name_44, "\t\t\t");
                      _builder.append("Vec[i][j]= ");
                      String _SimpleCppType_6 = attr_1.SimpleCppType();
                      _builder.append(_SimpleCppType_6, "\t\t\t");
                      _builder.append("(");
                      String _name_45 = attr_1.getName();
                      _builder.append(_name_45, "\t\t\t");
                      _builder.append("+(i*");
                      String _name_46 = attr_1.getName();
                      _builder.append(_name_46, "\t\t\t");
                      _builder.append("Dim[3]+j)*");
                      String _name_47 = attr_1.getName();
                      _builder.append(_name_47, "\t\t\t");
                      _builder.append("Dim[1] ");
                      {
                        String _SimpleCppType_7 = attr_1.SimpleCppType();
                        boolean _equals_7 = Objects.equal(_SimpleCppType_7, "Tag");
                        if (_equals_7) {
                          _builder.append(", ");
                          String _CppTagType_3 = attr_1.CppTagType();
                          _builder.append(_CppTagType_3, "\t\t\t");
                        }
                      }
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("\t");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  int _dimension_2 = attr_1.getDimension();
                  boolean _equals_8 = (_dimension_2 == 3);
                  if (_equals_8) {
                    _builder.append("\t");
                    _builder.append("// ");
                    String _name_48 = attr_1.getName();
                    _builder.append(_name_48, "\t");
                    _builder.append(" is 3 D");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    String _CppType_4 = attr_1.CppType();
                    _builder.append(_CppType_4, "\t");
                    _builder.append("  ");
                    String _name_49 = attr_1.getName();
                    _builder.append(_name_49, "\t");
                    _builder.append("Vec(");
                    String _name_50 = attr_1.getName();
                    _builder.append(_name_50, "\t");
                    _builder.append("Dim[4]);   // Inversion of dim in fortran/C");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for (int i=0;i<");
                    String _name_51 = attr_1.getName();
                    _builder.append(_name_51, "\t");
                    _builder.append("Dim[4];i++) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    String _name_52 = attr_1.getName();
                    _builder.append(_name_52, "\t\t");
                    _builder.append("Vec[i].resize(");
                    String _name_53 = attr_1.getName();
                    _builder.append(_name_53, "\t\t");
                    _builder.append("Dim[2]);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("for (int j=0;j<");
                    String _name_54 = attr_1.getName();
                    _builder.append(_name_54, "\t\t");
                    _builder.append("Dim[2];j++) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    String _name_55 = attr_1.getName();
                    _builder.append(_name_55, "\t\t\t");
                    _builder.append("Vec[i][j].resize(");
                    String _name_56 = attr_1.getName();
                    _builder.append(_name_56, "\t\t\t");
                    _builder.append("Dim[0]);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("for (int k=0;k<");
                    String _name_57 = attr_1.getName();
                    _builder.append(_name_57, "\t\t\t");
                    _builder.append("Dim[0];k++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t    ");
                    String _name_58 = attr_1.getName();
                    _builder.append(_name_58, "\t\t    ");
                    _builder.append("Vec[i][j][k]= ");
                    String _SimpleCppType_8 = attr_1.SimpleCppType();
                    _builder.append(_SimpleCppType_8, "\t\t    ");
                    _builder.append("(");
                    String _name_59 = attr_1.getName();
                    _builder.append(_name_59, "\t\t    ");
                    _builder.append("[(i*");
                    String _name_60 = attr_1.getName();
                    _builder.append(_name_60, "\t\t    ");
                    _builder.append("Dim[3]+j)*");
                    String _name_61 = attr_1.getName();
                    _builder.append(_name_61, "\t\t    ");
                    _builder.append("Dim[1]+k] ");
                    {
                      String _SimpleCppType_9 = attr_1.SimpleCppType();
                      boolean _equals_9 = Objects.equal(_SimpleCppType_9, "Tag");
                      if (_equals_9) {
                        _builder.append(", ");
                        String _CppTagType_4 = attr_1.CppTagType();
                        _builder.append(_CppTagType_4, "\t\t    ");
                      }
                    }
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    int _dimension_3 = attr_1.getDimension();
                    boolean _equals_10 = (_dimension_3 == 4);
                    if (_equals_10) {
                      _builder.append("\t");
                      _builder.append("// ");
                      String _name_62 = attr_1.getName();
                      _builder.append(_name_62, "\t");
                      _builder.append(" is 4 D");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      String _CppType_5 = attr_1.CppType();
                      _builder.append(_CppType_5, "\t");
                      _builder.append("  ");
                      String _name_63 = attr_1.getName();
                      _builder.append(_name_63, "\t");
                      _builder.append("Vec(");
                      String _name_64 = attr_1.getName();
                      _builder.append(_name_64, "\t");
                      _builder.append("Dim[6]);   // Inversion of dim in fortran/C");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("for (int i=0;i<");
                      String _name_65 = attr_1.getName();
                      _builder.append(_name_65, "\t");
                      _builder.append("Dim[6];i++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t");
                      String _name_66 = attr_1.getName();
                      _builder.append(_name_66, "\t\t");
                      _builder.append("Vec[i].resize(");
                      String _name_67 = attr_1.getName();
                      _builder.append(_name_67, "\t\t");
                      _builder.append("Dim[4]);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t");
                      _builder.append("for (int j=0;j<");
                      String _name_68 = attr_1.getName();
                      _builder.append(_name_68, "\t\t");
                      _builder.append("Dim[4];j++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t\t");
                      String _name_69 = attr_1.getName();
                      _builder.append(_name_69, "\t\t\t");
                      _builder.append("Vec[i][j].resize(");
                      String _name_70 = attr_1.getName();
                      _builder.append(_name_70, "\t\t\t");
                      _builder.append("Dim[2]);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t  \t");
                      _builder.append("for (int k=0;k<");
                      String _name_71 = attr_1.getName();
                      _builder.append(_name_71, "\t\t  \t");
                      _builder.append("Dim[2];k++) {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t    \t");
                      String _name_72 = attr_1.getName();
                      _builder.append(_name_72, "\t\t    \t");
                      _builder.append("Vec[i][j][k].resize(");
                      String _name_73 = attr_1.getName();
                      _builder.append(_name_73, "\t\t    \t");
                      _builder.append("Dim[0]);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t    \t");
                      _builder.append("for (int l=0;k<");
                      String _name_74 = attr_1.getName();
                      _builder.append(_name_74, "\t\t    \t");
                      _builder.append("Dim[0];l++) ");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t    \t\t");
                      String _name_75 = attr_1.getName();
                      _builder.append(_name_75, "\t\t    \t\t");
                      _builder.append("Vec[i][j][k][l]= ");
                      String _SimpleCppType_10 = attr_1.SimpleCppType();
                      _builder.append(_SimpleCppType_10, "\t\t    \t\t");
                      _builder.append("(");
                      String _name_76 = attr_1.getName();
                      _builder.append(_name_76, "\t\t    \t\t");
                      _builder.append("[((i*");
                      String _name_77 = attr_1.getName();
                      _builder.append(_name_77, "\t\t    \t\t");
                      _builder.append("Dim[5]+j)*");
                      String _name_78 = attr_1.getName();
                      _builder.append(_name_78, "\t\t    \t\t");
                      _builder.append("Dim[3]+k)*");
                      String _name_79 = attr_1.getName();
                      _builder.append(_name_79, "\t\t    \t\t");
                      _builder.append("Dim[1]+l] ");
                      {
                        String _SimpleCppType_11 = attr_1.SimpleCppType();
                        boolean _equals_11 = Objects.equal(_SimpleCppType_11, "Tag");
                        if (_equals_11) {
                          _builder.append(", ");
                          String _CppTagType_5 = attr_1.CppTagType();
                          _builder.append(_CppTagType_5, "\t\t    \t\t");
                        }
                      }
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("    \t");
                      _builder.append("}");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("\t");
                      _builder.append("}");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("}");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.newLine();
                    }
                  }
                }
              }
            }
          } else {
            {
              boolean _isEnumeration_1 = attr_1.isEnumeration();
              if (_isEnumeration_1) {
                _builder.append("\t");
                _builder.append("// ");
                String _name_80 = attr_1.getName();
                _builder.append(_name_80, "\t");
                _builder.append(" is an enumeration");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("// ");
                String _CType = attr_1.CType();
                _builder.append(_CType, "\t");
                _builder.append(" * ");
                String _name_81 = attr_1.getName();
                _builder.append(_name_81, "\t");
                _builder.append(" =  (int) ");
                String _name_82 = attr_1.getName();
                _builder.append(_name_82, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Create new row");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    {
      boolean _isArrayTimeIntervalKey = table.isArrayTimeIntervalKey();
      if (_isArrayTimeIntervalKey) {
        _builder.append("\t");
        _builder.append("if (*(timeInterval+1)>0) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("row = table.newRow(");
        String _RequiredValueCppFromCList = table.RequiredValueCppFromCList();
        _builder.append(_RequiredValueCppFromCList, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("row = table.newRow(");
        String _RequiredValueCppFromCListWithoutInterval = table.RequiredValueCppFromCListWithoutInterval();
        _builder.append(_RequiredValueCppFromCListWithoutInterval, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        String _name_83 = table.getName();
        boolean _equals_12 = Objects.equal(_name_83, "DataDescription");
        if (_equals_12) {
          _builder.append("\t");
          _builder.append("if (*holoType) {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("row = table.newRow(Tag(*polOrHoloId,TagType::Holography), Tag(*spectralWindowId,TagType::SpectralWindow));");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("} else {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("row = table.newRow(Tag(*polOrHoloId,TagType::Polarization), Tag(*spectralWindowId,TagType::SpectralWindow));");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}\t");
          _builder.newLine();
        } else {
          String _name_84 = table.getName();
          boolean _equals_13 = Objects.equal(_name_84, "Processor");
          if (_equals_13) {
            _builder.append("\t");
            _builder.append("if (*processorSubType == ProcessorSubTypeMod::ALMA_CORRELATOR_MODE) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("row = table.newRow(Tag(*modeId, TagType::CorrelatorMode), *processorType, *processorSubType);");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("} else if (*processorSubType == ProcessorSubTypeMod::ALMA_RADIOMETER) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("row = table.newRow(Tag(*modeId, TagType::AlmaRadiometer), *processorType, *processorSubType);");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("} else if (*processorSubType == ProcessorSubTypeMod::SQUARE_LAW_DETECTOR)  {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("row = table.newRow(Tag(*modeId, TagType::SquareLawDetector), *processorType, *processorSubType);");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("//} else if (*processorSubType == ProcessorSubTypeMod::HOLOGRAPHY)  {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("//\t  row = table.newRow(Tag(*modeId, TagType::Holography), *processorType, *processorSubType);");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("row = table.newRow(");
            String _RequiredValueCppFromCList_1 = table.RequiredValueCppFromCList();
            _builder.append(_RequiredValueCppFromCList_1, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Add row");
    _builder.newLine();
    _builder.append("\t");
    String _name_85 = table.getName();
    _builder.append(_name_85, "\t");
    _builder.append("Row *retRow = table.add(row);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (retRow != row) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//    cout << \"Attempt to store a row identical to a row present in the ");
    String _name_86 = table.getName();
    _builder.append(_name_86, "\t\t");
    _builder.append("Table\" << endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _autoIncrementable = table.getAutoIncrementable();
      int _size = _autoIncrementable.size();
      boolean _notEquals_2 = (_size != 0);
      if (_notEquals_2) {
        {
          List<ASDMAttribute> _autoIncrementable_1 = table.getAutoIncrementable();
          for(final ASDMAttribute attr_2 : _autoIncrementable_1) {
            {
              boolean _isCppStandard = attr_2.isCppStandard();
              if (_isCppStandard) {
                _builder.append("\t");
                _builder.append("return retRow->get");
                String _UpperCaseName = attr_2.UpperCaseName();
                _builder.append(_UpperCaseName, "\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              } else {
                String _CppType_6 = attr_2.CppType();
                boolean _equals_14 = Objects.equal(_CppType_6, "Tag");
                if (_equals_14) {
                  _builder.append("\t");
                  _builder.append("// return atoi((retRow->get");
                  String _UpperCaseName_1 = attr_2.UpperCaseName();
                  _builder.append(_UpperCaseName_1, "\t");
                  _builder.append("().getId()).c_str());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return retRow->get");
                  String _UpperCaseName_2 = attr_2.UpperCaseName();
                  _builder.append(_UpperCaseName_2, "\t");
                  _builder.append("().getTagValue();");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t");
                  _builder.append("return retRow->get");
                  String _UpperCaseName_3 = attr_2.UpperCaseName();
                  _builder.append(_UpperCaseName_3, "\t");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      } else {
        _builder.append("\t");
        _builder.append("return 0;    // No autoIncrementable attribute");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("catch (DuplicateKey e) {  // exception thrown if duplicate key and no autoIncrementable attribute");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cout << e.getMessage() << endl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;   // No autoIncrementable attribute");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("catch (InvalidArgumentException e)  { // exception thrown if Invalid Argument");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cout << e.getMessage() << endl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;   // No autoIncrementable attribute");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("// -------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Returns a ");
    String _name_87 = table.getName();
    _builder.append(_name_87, " ");
    _builder.append("Row* given a key.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("int sdm_get");
    String _name_88 = table.getName();
    _builder.append(_name_88, "");
    _builder.append("Row (");
    String _RequiredGetCList_1 = table.RequiredGetCList();
    _builder.append(_RequiredGetCList_1, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (dataset==0) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cout<<\"No dataset initialized\"<<endl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return -1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    String _name_89 = table.getName();
    _builder.append(_name_89, "\t");
    _builder.append("Table &table = dataset->get");
    String _name_90 = table.getName();
    _builder.append(_name_90, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_91 = table.getName();
    _builder.append(_name_91, "\t");
    _builder.append("Row *row = 0;");
    _builder.newLineIfNotEmpty();
    {
      boolean _isArrayTimeIntervalKey_1 = table.isArrayTimeIntervalKey();
      if (_isArrayTimeIntervalKey_1) {
        _builder.append("\t");
        _builder.append("if (*(timeInterval+1)>0)  ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("row = table.getRowByKey(");
        String _KeyCppFromCList = table.KeyCppFromCList();
        _builder.append(_KeyCppFromCList, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("else");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("row = table.getRowByKey(");
        String _KeyCppFromCListWithoutInterval = table.KeyCppFromCListWithoutInterval();
        _builder.append(_KeyCppFromCListWithoutInterval, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_92 = table.getName();
        boolean _equals_15 = Objects.equal(_name_92, "SquareLawDetector");
        if (_equals_15) {
          _builder.append("\t");
          _builder.append("// row = table.getRowByKey( Tag(*modeId, TagType::SquareLawDetector));");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("row = table.getRowByKey(");
          String _KeyCppFromCList_1 = table.KeyCppFromCList();
          _builder.append(_KeyCppFromCList_1, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          _builder.append("row = table.getRowByKey(");
          String _KeyCppFromCList_2 = table.KeyCppFromCList();
          _builder.append(_KeyCppFromCList_2, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (row==0) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return -1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// copy all elements of row in method parameters");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// example: *pressure      = row->getPressure().get();");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_1 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_3 : _requiredAttributes_1) {
        _builder.append("\t\t");
        _builder.append("//  attr.NameS:  ");
        String _name_93 = attr_3.getName();
        _builder.append(_name_93, "\t\t");
        _builder.append("  attr.UpperCaseName: ");
        String _UpperCaseName_4 = attr_3.UpperCaseName();
        _builder.append(_UpperCaseName_4, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          boolean _isKey = attr_3.isKey();
          boolean _not_2 = (!_isKey);
          if (_not_2) {
            {
              boolean _isArray_1 = attr_3.isArray();
              boolean _not_3 = (!_isArray_1);
              if (_not_3) {
                {
                  boolean _isCppStandard_1 = attr_3.isCppStandard();
                  if (_isCppStandard_1) {
                    _builder.append("\t\t");
                    _builder.append("*");
                    String _name_94 = attr_3.getName();
                    _builder.append(_name_94, "\t\t");
                    _builder.append(" = row->get");
                    String _UpperCaseName_5 = attr_3.UpperCaseName();
                    _builder.append(_UpperCaseName_5, "\t\t");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _CppType_7 = attr_3.CppType();
                    boolean _equals_16 = Objects.equal(_CppType_7, "Tag");
                    if (_equals_16) {
                      _builder.append("\t\t");
                      _builder.append("// *");
                      String _name_95 = attr_3.getName();
                      _builder.append(_name_95, "\t\t");
                      _builder.append(" = atoi((row->get");
                      String _UpperCaseName_6 = attr_3.UpperCaseName();
                      _builder.append(_UpperCaseName_6, "\t\t");
                      _builder.append("().getId()).c_str());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("*");
                      String _name_96 = attr_3.getName();
                      _builder.append(_name_96, "\t\t");
                      _builder.append(" = row->get");
                      String _UpperCaseName_7 = attr_3.UpperCaseName();
                      _builder.append(_UpperCaseName_7, "\t\t");
                      _builder.append("().getTagValue();");
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _CppType_8 = attr_3.CppType();
                      boolean _equals_17 = Objects.equal(_CppType_8, "string");
                      if (_equals_17) {
                        _builder.append("\t\t");
                        _builder.append("if ((int)row->get");
                        String _UpperCaseName_8 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_8, "\t\t");
                        _builder.append("().size()<");
                        String _name_97 = attr_3.getName();
                        _builder.append(_name_97, "\t\t");
                        _builder.append("Dim[1])");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("strcpy(");
                        String _name_98 = attr_3.getName();
                        _builder.append(_name_98, "\t\t\t");
                        _builder.append(",row->get");
                        String _UpperCaseName_9 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_9, "\t\t\t");
                        _builder.append("().c_str());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("else");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("strncpy(");
                        String _name_99 = attr_3.getName();
                        _builder.append(_name_99, "\t\t\t");
                        _builder.append(",row->get");
                        String _UpperCaseName_10 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_10, "\t\t\t");
                        _builder.append("().c_str(),");
                        String _name_100 = attr_3.getName();
                        _builder.append(_name_100, "\t\t\t");
                        _builder.append("Dim[1]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _name_101 = attr_3.getName();
                        _builder.append(_name_101, "\t\t");
                        _builder.append("Dim[0] = (int)row->get");
                        String _UpperCaseName_11 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_11, "\t\t");
                        _builder.append("().size();");
                        _builder.newLineIfNotEmpty();
                      } else {
                        String _CppType_9 = attr_3.CppType();
                        boolean _equals_18 = Objects.equal(_CppType_9, "EntityRef");
                        if (_equals_18) {
                          _builder.append("\t\t");
                          _builder.append("strcpy(");
                          String _name_102 = attr_3.getName();
                          _builder.append(_name_102, "\t\t");
                          _builder.append(",row->get");
                          String _UpperCaseName_12 = attr_3.UpperCaseName();
                          _builder.append(_UpperCaseName_12, "\t\t");
                          _builder.append("().toString().c_str());");
                          _builder.newLineIfNotEmpty();
                        } else {
                          String _CppType_10 = attr_3.CppType();
                          boolean _equals_19 = Objects.equal(_CppType_10, "ArrayTime");
                          if (_equals_19) {
                            _builder.append("\t\t");
                            _builder.append("*");
                            String _name_103 = attr_3.getName();
                            _builder.append(_name_103, "\t\t");
                            _builder.append("     = row->get");
                            String _UpperCaseName_13 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_13, "\t\t");
                            _builder.append("().get();");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _CppType_11 = attr_3.CppType();
                            boolean _equals_20 = Objects.equal(_CppType_11, "ArrayTimeInterval");
                            if (_equals_20) {
                              _builder.append("\t\t");
                              _builder.append("*");
                              String _name_104 = attr_3.getName();
                              _builder.append(_name_104, "\t\t");
                              _builder.append("     = row->get");
                              String _UpperCaseName_14 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_14, "\t\t");
                              _builder.append("().getStartInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("*(");
                              String _name_105 = attr_3.getName();
                              _builder.append(_name_105, "\t\t");
                              _builder.append("+1) = row->get");
                              String _UpperCaseName_15 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_15, "\t\t");
                              _builder.append("().getDurationInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t");
                              _builder.append("*");
                              String _name_106 = attr_3.getName();
                              _builder.append(_name_106, "\t\t");
                              _builder.append(" = row->get");
                              String _UpperCaseName_16 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_16, "\t\t");
                              _builder.append("().get();");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("\t\t");
                _builder.newLine();
                {
                  boolean _or_1 = false;
                  int _dimension_4 = attr_3.getDimension();
                  boolean _equals_21 = (_dimension_4 == 1);
                  if (_equals_21) {
                    _or_1 = true;
                  } else {
                    boolean _isExtrinsic_1 = attr_3.isExtrinsic();
                    _or_1 = _isExtrinsic_1;
                  }
                  if (_or_1) {
                    _builder.append("\t\t");
                    String _CppType_12 = attr_3.CppType();
                    _builder.append(_CppType_12, "\t\t");
                    _builder.append("  ");
                    String _name_107 = attr_3.getName();
                    _builder.append(_name_107, "\t\t");
                    _builder.append("Vec = row->get");
                    String _UpperCaseName_17 = attr_3.UpperCaseName();
                    _builder.append(_UpperCaseName_17, "\t\t");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.newLine();
                    {
                      boolean _isCppStandard_2 = attr_3.isCppStandard();
                      if (_isCppStandard_2) {
                        _builder.append("\t\t");
                        _builder.append("for (int i=0; i<min((int)");
                        String _name_108 = attr_3.getName();
                        _builder.append(_name_108, "\t\t");
                        _builder.append("Vec.size(),");
                        String _name_109 = attr_3.getName();
                        _builder.append(_name_109, "\t\t");
                        _builder.append("Dim[1]); i++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        String _name_110 = attr_3.getName();
                        _builder.append(_name_110, "\t\t\t");
                        _builder.append("[i] = ");
                        String _name_111 = attr_3.getName();
                        _builder.append(_name_111, "\t\t\t");
                        _builder.append("Vec[i];");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _name_112 = attr_3.getName();
                        _builder.append(_name_112, "\t\t");
                        _builder.append("Dim[0] = (int)");
                        String _name_113 = attr_3.getName();
                        _builder.append(_name_113, "\t\t");
                        _builder.append("Vec.size();  // return dimension of the ASDM table");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.newLine();
                      } else {
                        String _SimpleCppType_12 = attr_3.SimpleCppType();
                        boolean _equals_22 = Objects.equal(_SimpleCppType_12, "Tag");
                        if (_equals_22) {
                          _builder.append("\t\t");
                          _builder.append("for (int i=0; i<min((int)");
                          String _name_114 = attr_3.getName();
                          _builder.append(_name_114, "\t\t");
                          _builder.append("Vec.size(),");
                          String _name_115 = attr_3.getName();
                          _builder.append(_name_115, "\t\t");
                          _builder.append("Dim[1]); i++)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("//");
                          String _name_116 = attr_3.getName();
                          _builder.append(_name_116, "\t\t\t");
                          _builder.append("[i] = atoi((row->get");
                          String _UpperCaseName_18 = attr_3.UpperCaseName();
                          _builder.append(_UpperCaseName_18, "\t\t\t");
                          _builder.append("()[i]).getId().c_str());");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          String _name_117 = attr_3.getName();
                          _builder.append(_name_117, "\t\t");
                          _builder.append("[i] = ");
                          String _name_118 = attr_3.getName();
                          _builder.append(_name_118, "\t\t");
                          _builder.append("Vec[i].getTagValue();");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          String _name_119 = attr_3.getName();
                          _builder.append(_name_119, "\t\t");
                          _builder.append("Dim[0] = (int)");
                          String _name_120 = attr_3.getName();
                          _builder.append(_name_120, "\t\t");
                          _builder.append("Vec.size();  // return dimension of the ASDM table");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.newLine();
                        } else {
                          String _SimpleCppType_13 = attr_3.SimpleCppType();
                          boolean _equals_23 = Objects.equal(_SimpleCppType_13, "string");
                          if (_equals_23) {
                            _builder.append("\t\t");
                            _builder.append("int maxDimZero");
                            String _UpperCaseName_19 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_19, "\t\t");
                            _builder.append(" = 0;");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("for (int i=0; i<min((int)");
                            String _name_121 = attr_3.getName();
                            _builder.append(_name_121, "\t\t");
                            _builder.append("Vec.size(),");
                            String _name_122 = attr_3.getName();
                            _builder.append(_name_122, "\t\t");
                            _builder.append("Dim[3]); i++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            _builder.append("if ((int)");
                            String _name_123 = attr_3.getName();
                            _builder.append(_name_123, "\t\t\t");
                            _builder.append("Vec[i].size()<");
                            String _name_124 = attr_3.getName();
                            _builder.append(_name_124, "\t\t\t");
                            _builder.append("Dim[1])");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t\t");
                            _builder.append("strcpy(");
                            String _name_125 = attr_3.getName();
                            _builder.append(_name_125, "\t\t\t\t");
                            _builder.append("+i*");
                            String _name_126 = attr_3.getName();
                            _builder.append(_name_126, "\t\t\t\t");
                            _builder.append("Dim[1],");
                            String _name_127 = attr_3.getName();
                            _builder.append(_name_127, "\t\t\t\t");
                            _builder.append("Vec[i].c_str());");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            _builder.append("else");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("\t\t");
                            _builder.append("strncpy(");
                            String _name_128 = attr_3.getName();
                            _builder.append(_name_128, "\t\t\t\t");
                            _builder.append("+i*");
                            String _name_129 = attr_3.getName();
                            _builder.append(_name_129, "\t\t\t\t");
                            _builder.append("Dim[1],");
                            String _name_130 = attr_3.getName();
                            _builder.append(_name_130, "\t\t\t\t");
                            _builder.append("Vec[i].c_str(),");
                            String _name_131 = attr_3.getName();
                            _builder.append(_name_131, "\t\t\t\t");
                            _builder.append("Dim[1]);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            _builder.append("maxDimZero");
                            String _UpperCaseName_20 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_20, "\t\t\t");
                            _builder.append(" = max((int)");
                            String _name_132 = attr_3.getName();
                            _builder.append(_name_132, "\t\t\t");
                            _builder.append("Vec[i].size(),maxDimZero");
                            String _UpperCaseName_21 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_21, "\t\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t");
                            String _name_133 = attr_3.getName();
                            _builder.append(_name_133, "\t\t");
                            _builder.append("Dim[0] = maxDimZero");
                            String _UpperCaseName_22 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_22, "\t\t");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            String _name_134 = attr_3.getName();
                            _builder.append(_name_134, "\t\t");
                            _builder.append("Dim[2] = ");
                            String _name_135 = attr_3.getName();
                            _builder.append(_name_135, "\t\t");
                            _builder.append("Vec.size();  // number of strings");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.newLine();
                          } else {
                            _builder.append("\t\t");
                            _builder.append("for (int i=0; i<min((int)");
                            String _name_136 = attr_3.getName();
                            _builder.append(_name_136, "\t\t");
                            _builder.append("Vec.size(),");
                            String _name_137 = attr_3.getName();
                            _builder.append(_name_137, "\t\t");
                            _builder.append("Dim[1]); i++)");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            String _name_138 = attr_3.getName();
                            _builder.append(_name_138, "\t\t\t");
                            _builder.append("[i] = ");
                            String _name_139 = attr_3.getName();
                            _builder.append(_name_139, "\t\t\t");
                            _builder.append("Vec[i].get();");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            String _name_140 = attr_3.getName();
                            _builder.append(_name_140, "\t\t");
                            _builder.append("Dim[0] = ");
                            String _name_141 = attr_3.getName();
                            _builder.append(_name_141, "\t\t");
                            _builder.append("Vec.size(); // return dimension of the ASDM table");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                    _builder.append("\t\t");
                    _builder.newLine();
                  } else {
                    int _dimension_5 = attr_3.getDimension();
                    boolean _equals_24 = (_dimension_5 == 2);
                    if (_equals_24) {
                      _builder.append("\t\t");
                      String _CppType_13 = attr_3.CppType();
                      _builder.append(_CppType_13, "\t\t");
                      _builder.append("  ");
                      String _name_142 = attr_3.getName();
                      _builder.append(_name_142, "\t\t");
                      _builder.append("Vec = row->get");
                      String _UpperCaseName_23 = attr_3.UpperCaseName();
                      _builder.append(_UpperCaseName_23, "\t\t");
                      _builder.append("();");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.newLine();
                      {
                        boolean _isCppStandard_3 = attr_3.isCppStandard();
                        if (_isCppStandard_3) {
                          _builder.append("\t\t");
                          _builder.append("int maxDimZero");
                          String _UpperCaseName_24 = attr_3.UpperCaseName();
                          _builder.append(_UpperCaseName_24, "\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("for (int i=0;i<min((int)");
                          String _name_143 = attr_3.getName();
                          _builder.append(_name_143, "\t\t");
                          _builder.append("Vec.size(),");
                          String _name_144 = attr_3.getName();
                          _builder.append(_name_144, "\t\t");
                          _builder.append("Dim[3]) ;i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("maxDimZero");
                          String _UpperCaseName_25 = attr_3.UpperCaseName();
                          _builder.append(_UpperCaseName_25, "\t\t\t");
                          _builder.append(" = max((int)");
                          String _name_145 = attr_3.getName();
                          _builder.append(_name_145, "\t\t\t");
                          _builder.append("Vec[i].size(),maxDimZero");
                          String _UpperCaseName_26 = attr_3.UpperCaseName();
                          _builder.append(_UpperCaseName_26, "\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0;j<min((int)");
                          String _name_146 = attr_3.getName();
                          _builder.append(_name_146, "\t\t\t");
                          _builder.append("Vec[i].size(),");
                          String _name_147 = attr_3.getName();
                          _builder.append(_name_147, "\t\t\t");
                          _builder.append("Dim[1]) ;j++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t\t");
                          String _name_148 = attr_3.getName();
                          _builder.append(_name_148, "\t\t\t\t");
                          _builder.append("[i*");
                          String _name_149 = attr_3.getName();
                          _builder.append(_name_149, "\t\t\t\t");
                          _builder.append("Dim[1]+j]= ");
                          String _name_150 = attr_3.getName();
                          _builder.append(_name_150, "\t\t\t\t");
                          _builder.append("Vec[i][j];");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t");
                          String _name_151 = attr_3.getName();
                          _builder.append(_name_151, "\t\t");
                          _builder.append("Dim[0] = maxDimZero");
                          String _UpperCaseName_27 = attr_3.UpperCaseName();
                          _builder.append(_UpperCaseName_27, "\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          String _name_152 = attr_3.getName();
                          _builder.append(_name_152, "\t\t");
                          _builder.append("Dim[2] = ");
                          String _name_153 = attr_3.getName();
                          _builder.append(_name_153, "\t\t");
                          _builder.append("Vec.size();  // return dimension of the ASDM");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.newLine();
                        } else {
                          String _SimpleCppType_14 = attr_3.SimpleCppType();
                          boolean _equals_25 = Objects.equal(_SimpleCppType_14, "Tag");
                          if (_equals_25) {
                            _builder.append("\t\t");
                            _builder.append("int maxDimZero");
                            String _UpperCaseName_28 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_28, "\t\t");
                            _builder.append(" = 0;");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("for (int i=0; i<min((int)");
                            String _name_154 = attr_3.getName();
                            _builder.append(_name_154, "\t\t");
                            _builder.append("Vec[i].size(),");
                            String _name_155 = attr_3.getName();
                            _builder.append(_name_155, "\t\t");
                            _builder.append("Dim[3]); i++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            _builder.append("maxDimZero");
                            String _UpperCaseName_29 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_29, "\t\t\t");
                            _builder.append(" = max((int)");
                            String _name_156 = attr_3.getName();
                            _builder.append(_name_156, "\t\t\t");
                            _builder.append("Vec[i][i].size(),maxDimZero");
                            String _UpperCaseName_30 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_30, "\t\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            _builder.append("for (int j=0; j<min((int)");
                            String _name_157 = attr_3.getName();
                            _builder.append(_name_157, "\t\t\t");
                            _builder.append("Vec[i][i].size(),");
                            String _name_158 = attr_3.getName();
                            _builder.append(_name_158, "\t\t\t");
                            _builder.append("Dim[1]) ;j++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t\t");
                            _builder.append("// ");
                            String _name_159 = attr_3.getName();
                            _builder.append(_name_159, "\t\t\t\t");
                            _builder.append("[i*");
                            String _name_160 = attr_3.getName();
                            _builder.append(_name_160, "\t\t\t\t");
                            _builder.append("Dim[0]+j] = atoi((row->get");
                            String _UpperCaseName_31 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_31, "\t\t\t\t");
                            _builder.append("()[i][j]).getId().c_str());");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t\t");
                            String _name_161 = attr_3.getName();
                            _builder.append(_name_161, "\t\t\t\t");
                            _builder.append("[i*");
                            String _name_162 = attr_3.getName();
                            _builder.append(_name_162, "\t\t\t\t");
                            _builder.append("Dim[0]+j] = ");
                            String _name_163 = attr_3.getName();
                            _builder.append(_name_163, "\t\t\t\t");
                            _builder.append("Vec[i][i][j].getTagValue();");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t");
                            String _name_164 = attr_3.getName();
                            _builder.append(_name_164, "\t\t");
                            _builder.append("Dim[0] = maxDimZero");
                            String _UpperCaseName_32 = attr_3.UpperCaseName();
                            _builder.append(_UpperCaseName_32, "\t\t");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            String _name_165 = attr_3.getName();
                            _builder.append(_name_165, "\t\t");
                            _builder.append("Dim[2] = ");
                            String _name_166 = attr_3.getName();
                            _builder.append(_name_166, "\t\t");
                            _builder.append("Vec.size();  // return dimension of the ASDM");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.newLine();
                          } else {
                            String _SimpleCppType_15 = attr_3.SimpleCppType();
                            boolean _equals_26 = Objects.equal(_SimpleCppType_15, "string");
                            if (_equals_26) {
                              _builder.append("\t\t");
                              _builder.append("int maxDimTwo");
                              String _UpperCaseName_33 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_33, "\t\t");
                              _builder.append(" = 0;");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("int maxDimZero");
                              String _UpperCaseName_34 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_34, "\t\t");
                              _builder.append(" = 0;");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("for (int i=0; i< min((int)");
                              String _name_167 = attr_3.getName();
                              _builder.append(_name_167, "\t\t");
                              _builder.append("Vec[i].size(),");
                              String _name_168 = attr_3.getName();
                              _builder.append(_name_168, "\t\t");
                              _builder.append("Dim[5]) ;i++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t");
                              _builder.append("maxDimTwo");
                              String _UpperCaseName_35 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_35, "\t\t\t");
                              _builder.append(" = max((int)");
                              String _name_169 = attr_3.getName();
                              _builder.append(_name_169, "\t\t\t");
                              _builder.append("Vec[i][i].size(),maxDimTwo");
                              String _UpperCaseName_36 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_36, "\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t");
                              _builder.append("for (int j=0; j< min((int)");
                              String _name_170 = attr_3.getName();
                              _builder.append(_name_170, "\t\t\t");
                              _builder.append("Vec[i].size(),");
                              String _name_171 = attr_3.getName();
                              _builder.append(_name_171, "\t\t\t");
                              _builder.append("Dim[3]) ;j++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t\t");
                              _builder.append("if ((int)");
                              String _name_172 = attr_3.getName();
                              _builder.append(_name_172, "\t\t\t\t");
                              _builder.append("Vec[i][j].size()>");
                              String _name_173 = attr_3.getName();
                              _builder.append(_name_173, "\t\t\t\t");
                              _builder.append("Dim[1])");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t\t\t");
                              _builder.append("strcpy(");
                              String _name_174 = attr_3.getName();
                              _builder.append(_name_174, "\t\t\t\t\t");
                              _builder.append("+(i*");
                              String _name_175 = attr_3.getName();
                              _builder.append(_name_175, "\t\t\t\t\t");
                              _builder.append("Dim[3]+j)*");
                              String _name_176 = attr_3.getName();
                              _builder.append(_name_176, "\t\t\t\t\t");
                              _builder.append("Dim[1],");
                              String _name_177 = attr_3.getName();
                              _builder.append(_name_177, "\t\t\t\t\t");
                              _builder.append("Vec[i][j].c_str());");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t\t");
                              _builder.append("else");
                              _builder.newLine();
                              _builder.append("\t\t");
                              _builder.append("\t\t\t");
                              _builder.append("strncpy(");
                              String _name_178 = attr_3.getName();
                              _builder.append(_name_178, "\t\t\t\t\t");
                              _builder.append("+(i*");
                              String _name_179 = attr_3.getName();
                              _builder.append(_name_179, "\t\t\t\t\t");
                              _builder.append("Dim[3]+j)*");
                              String _name_180 = attr_3.getName();
                              _builder.append(_name_180, "\t\t\t\t\t");
                              _builder.append("Dim[1],");
                              String _name_181 = attr_3.getName();
                              _builder.append(_name_181, "\t\t\t\t\t");
                              _builder.append("Vec[i][j].c_str(),");
                              String _name_182 = attr_3.getName();
                              _builder.append(_name_182, "\t\t\t\t\t");
                              _builder.append("Dim[1]);");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t\t");
                              _builder.append("maxDimZero");
                              String _UpperCaseName_37 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_37, "\t\t\t\t");
                              _builder.append(" = max((int)");
                              String _name_183 = attr_3.getName();
                              _builder.append(_name_183, "\t\t\t\t");
                              _builder.append("Vec[i][j].size(),maxDimZero");
                              String _UpperCaseName_38 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_38, "\t\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t");
                              String _name_184 = attr_3.getName();
                              _builder.append(_name_184, "\t\t");
                              _builder.append("Dim[0] = maxDimZero");
                              String _UpperCaseName_39 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_39, "\t\t");
                              _builder.append(";");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              String _name_185 = attr_3.getName();
                              _builder.append(_name_185, "\t\t");
                              _builder.append("Dim[2] = maxDimTwo");
                              String _UpperCaseName_40 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_40, "\t\t");
                              _builder.append(";");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              String _name_186 = attr_3.getName();
                              _builder.append(_name_186, "\t\t");
                              _builder.append("Dim[4] = ");
                              String _name_187 = attr_3.getName();
                              _builder.append(_name_187, "\t\t");
                              _builder.append("Vec.size();  // return dimension of the ASDM table");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.newLine();
                            } else {
                              _builder.append("\t\t");
                              _builder.append("int maxDimZero");
                              String _UpperCaseName_41 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_41, "\t\t");
                              _builder.append(" = 0;");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("for (int i=0; i< min((int)");
                              String _name_188 = attr_3.getName();
                              _builder.append(_name_188, "\t\t");
                              _builder.append("Vec.size(),");
                              String _name_189 = attr_3.getName();
                              _builder.append(_name_189, "\t\t");
                              _builder.append("Dim[3]) ;i++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t");
                              _builder.append("maxDimZero");
                              String _UpperCaseName_42 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_42, "\t\t\t");
                              _builder.append(" = max((int)");
                              String _name_190 = attr_3.getName();
                              _builder.append(_name_190, "\t\t\t");
                              _builder.append("Vec[i].size(),maxDimZero");
                              String _UpperCaseName_43 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_43, "\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t");
                              _builder.append("for (int j=0; j<min((int)");
                              String _name_191 = attr_3.getName();
                              _builder.append(_name_191, "\t\t\t");
                              _builder.append("Vec[i].size(),");
                              String _name_192 = attr_3.getName();
                              _builder.append(_name_192, "\t\t\t");
                              _builder.append("Dim[1]) ;j++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t\t");
                              String _name_193 = attr_3.getName();
                              _builder.append(_name_193, "\t\t\t\t");
                              _builder.append("[i*");
                              String _name_194 = attr_3.getName();
                              _builder.append(_name_194, "\t\t\t\t");
                              _builder.append("Dim[1]+j] = ");
                              String _name_195 = attr_3.getName();
                              _builder.append(_name_195, "\t\t\t\t");
                              _builder.append("Vec[i][j].get();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t");
                              String _name_196 = attr_3.getName();
                              _builder.append(_name_196, "\t\t");
                              _builder.append("Dim[0] = maxDimZero");
                              String _UpperCaseName_44 = attr_3.UpperCaseName();
                              _builder.append(_UpperCaseName_44, "\t\t");
                              _builder.append(";");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              String _name_197 = attr_3.getName();
                              _builder.append(_name_197, "\t\t");
                              _builder.append("Dim[2] = ");
                              String _name_198 = attr_3.getName();
                              _builder.append(_name_198, "\t\t");
                              _builder.append("Vec.size();  // return dimension of the ASDM table");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                      _builder.append("\t\t");
                      _builder.newLine();
                    } else {
                      int _dimension_6 = attr_3.getDimension();
                      boolean _equals_27 = (_dimension_6 == 3);
                      if (_equals_27) {
                        _builder.append("\t\t");
                        String _CppType_14 = attr_3.CppType();
                        _builder.append(_CppType_14, "\t\t");
                        _builder.append("  ");
                        String _name_199 = attr_3.getName();
                        _builder.append(_name_199, "\t\t");
                        _builder.append("Vec = row->get");
                        String _UpperCaseName_45 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_45, "\t\t");
                        _builder.append("();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("int maxDimTwo");
                        String _UpperCaseName_46 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_46, "\t\t");
                        _builder.append(" = 0;");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("int maxDimZero");
                        String _UpperCaseName_47 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_47, "\t\t");
                        _builder.append(" = 0;");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (int i=0; i<  min((int)");
                        String _name_200 = attr_3.getName();
                        _builder.append(_name_200, "\t\t");
                        _builder.append("Vec.size(),");
                        String _name_201 = attr_3.getName();
                        _builder.append(_name_201, "\t\t");
                        _builder.append("Dim[5]) ;i++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("maxDimTwo");
                        String _UpperCaseName_48 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_48, "\t\t\t");
                        _builder.append(" = max((int)");
                        String _name_202 = attr_3.getName();
                        _builder.append(_name_202, "\t\t\t");
                        _builder.append("Vec[i].size(),maxDimTwo");
                        String _UpperCaseName_49 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_49, "\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("for (int j=0;j< min((int)");
                        String _name_203 = attr_3.getName();
                        _builder.append(_name_203, "\t\t\t");
                        _builder.append("Vec[i].size(),");
                        String _name_204 = attr_3.getName();
                        _builder.append(_name_204, "\t\t\t");
                        _builder.append("Dim[3]) ;j++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t\t");
                        _builder.append("maxDimZero");
                        String _UpperCaseName_50 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_50, "\t\t\t\t");
                        _builder.append(" = max((int)");
                        String _name_205 = attr_3.getName();
                        _builder.append(_name_205, "\t\t\t\t");
                        _builder.append("Vec[i][j].size(),maxDimZero");
                        String _UpperCaseName_51 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_51, "\t\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t\t");
                        _builder.append("for (int k=0; k< min((int)");
                        String _name_206 = attr_3.getName();
                        _builder.append(_name_206, "\t\t\t\t");
                        _builder.append("Vec[i][j].size(),");
                        String _name_207 = attr_3.getName();
                        _builder.append(_name_207, "\t\t\t\t");
                        _builder.append("Dim[1]) ;k++) {");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isCppStandard_4 = attr_3.isCppStandard();
                          if (_isCppStandard_4) {
                            String _name_208 = attr_3.getName();
                            _builder.append(_name_208, "");
                            _builder.append("[(i*");
                            String _name_209 = attr_3.getName();
                            _builder.append(_name_209, "");
                            _builder.append("Dim[3]+j)*");
                            String _name_210 = attr_3.getName();
                            _builder.append(_name_210, "");
                            _builder.append("Dim[1]+k]= ");
                            String _name_211 = attr_3.getName();
                            _builder.append(_name_211, "");
                            _builder.append("Vec[i][j][k];");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t\t");
                            _builder.append("\t\t\t");
                            String _name_212 = attr_3.getName();
                            _builder.append(_name_212, "\t\t\t\t\t");
                            _builder.append("[(i*");
                            String _name_213 = attr_3.getName();
                            _builder.append(_name_213, "\t\t\t\t\t");
                            _builder.append("Dim[3]+j)*");
                            String _name_214 = attr_3.getName();
                            _builder.append(_name_214, "\t\t\t\t\t");
                            _builder.append("Dim[1]+k]= ");
                            String _name_215 = attr_3.getName();
                            _builder.append(_name_215, "\t\t\t\t\t");
                            _builder.append("Vec[i][j][k].get();");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        _builder.append("\t\t");
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t");
                        String _name_216 = attr_3.getName();
                        _builder.append(_name_216, "\t\t");
                        _builder.append("Dim[0] = maxDimZero");
                        String _UpperCaseName_52 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_52, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _name_217 = attr_3.getName();
                        _builder.append(_name_217, "\t\t");
                        _builder.append("Dim[2] = maxDimTwo");
                        String _UpperCaseName_53 = attr_3.UpperCaseName();
                        _builder.append(_UpperCaseName_53, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _name_218 = attr_3.getName();
                        _builder.append(_name_218, "\t\t");
                        _builder.append("Dim[4] = ");
                        String _name_219 = attr_3.getName();
                        _builder.append(_name_219, "\t\t");
                        _builder.append("Vec.size();  // return dimension of the ASDM table");
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
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 1;   // 1 means that the line has been found");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      boolean _or_2 = false;
      String _name_220 = table.getName();
      boolean _equals_28 = Objects.equal(_name_220, "TotalPower");
      if (_equals_28) {
        _or_2 = true;
      } else {
        String _name_221 = table.getName();
        boolean _equals_29 = Objects.equal(_name_221, "Pointing");
        _or_2 = _equals_29;
      }
      if (_or_2) {
        _builder.append("// -------------------------------------------");
        _builder.newLine();
        _builder.append("// Columns get methods");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredAttributes_2 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_4 : _requiredAttributes_2) {
            _builder.append("// -------------------------------------------");
            _builder.newLine();
            _builder.append("// NEW METHOD");
            _builder.newLine();
            _builder.append("/**");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Returns the column ");
            String _UpperCaseName_54 = attr_4.UpperCaseName();
            _builder.append(_UpperCaseName_54, " ");
            _builder.append(" of Table ");
            String _name_222 = table.getName();
            _builder.append(_name_222, " ");
            _builder.append(".");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.append("#define sdm_get");
            String _name_223 = table.getName();
            _builder.append(_name_223, "");
            String _UpperCaseName_55 = attr_4.UpperCaseName();
            _builder.append(_UpperCaseName_55, "");
            _builder.append("Column  sdm_get");
            String _ToLowerCase = table.ToLowerCase();
            _builder.append(_ToLowerCase, "");
            String _ToLowerCase_1 = attr_4.ToLowerCase();
            _builder.append(_ToLowerCase_1, "");
            _builder.append("column_");
            _builder.newLineIfNotEmpty();
            _builder.append("extern \"C\" int sdm_get");
            String _name_224 = table.getName();
            _builder.append(_name_224, "");
            String _UpperCaseName_56 = attr_4.UpperCaseName();
            _builder.append(_UpperCaseName_56, "");
            _builder.append("Column(");
            String _CTypeAttributeDimList = attr_4.CTypeAttributeDimList();
            _builder.append(_CTypeAttributeDimList, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("int sdm_get");
            String _name_225 = table.getName();
            _builder.append(_name_225, "");
            String _UpperCaseName_57 = attr_4.UpperCaseName();
            _builder.append(_UpperCaseName_57, "");
            _builder.append("Column (");
            String _CTypeAttributeDimList_1 = attr_4.CTypeAttributeDimList();
            _builder.append(_CTypeAttributeDimList_1, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("if (dataset==0) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("cout<<\"No dataset initialized\"<<endl;");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return -1;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            String _name_226 = table.getName();
            _builder.append(_name_226, "\t");
            _builder.append("Table &table = dataset->get");
            String _name_227 = table.getName();
            _builder.append(_name_227, "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("vector< ");
            String _name_228 = table.getName();
            _builder.append(_name_228, "\t");
            _builder.append("Row * > row = table.get();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("int size = (int)table.get().size();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("if (size==0) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return 0;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("} else {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("for (int ir=0; ir<size; ir++) {");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("// Table:  ");
            String _name_229 = attr_4.getName();
            _builder.append(_name_229, "\t\t\t");
            _builder.append("  Column: ");
            String _UpperCaseName_58 = attr_4.UpperCaseName();
            _builder.append(_UpperCaseName_58, "\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              boolean _isArray_2 = attr_4.isArray();
              boolean _not_4 = (!_isArray_2);
              if (_not_4) {
                _builder.append("\t\t\t");
                _builder.append("// Scalar column of ");
                String _CppType_15 = attr_4.CppType();
                _builder.append(_CppType_15, "\t\t\t");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isCppStandard_5 = attr_4.isCppStandard();
                  if (_isCppStandard_5) {
                    _builder.append("\t\t\t");
                    String _name_230 = attr_4.getName();
                    _builder.append(_name_230, "\t\t\t");
                    _builder.append("[ir] = row[ir]->get");
                    String _UpperCaseName_59 = attr_4.UpperCaseName();
                    _builder.append(_UpperCaseName_59, "\t\t\t");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _CppType_16 = attr_4.CppType();
                    boolean _equals_30 = Objects.equal(_CppType_16, "Tag");
                    if (_equals_30) {
                      _builder.append("\t\t\t");
                      String _name_231 = attr_4.getName();
                      _builder.append(_name_231, "\t\t\t");
                      _builder.append("[ir] = row[ir]->get");
                      String _UpperCaseName_60 = attr_4.UpperCaseName();
                      _builder.append(_UpperCaseName_60, "\t\t\t");
                      _builder.append("().getTagValue();");
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _CppType_17 = attr_4.CppType();
                      boolean _equals_31 = Objects.equal(_CppType_17, "string");
                      if (_equals_31) {
                        _builder.append("\t\t\t");
                        _builder.append("strcpy(");
                        String _name_232 = attr_4.getName();
                        _builder.append(_name_232, "\t\t\t");
                        _builder.append("+ir*");
                        String _name_233 = attr_4.getName();
                        _builder.append(_name_233, "\t\t\t");
                        _builder.append("Dim[0],row[ir]->get");
                        String _UpperCaseName_61 = attr_4.UpperCaseName();
                        _builder.append(_UpperCaseName_61, "\t\t\t");
                        _builder.append("().c_str());");
                        _builder.newLineIfNotEmpty();
                      } else {
                        String _CppType_18 = attr_4.CppType();
                        boolean _equals_32 = Objects.equal(_CppType_18, "EntityRef");
                        if (_equals_32) {
                          _builder.append("\t\t\t");
                          _builder.append("strcpy(");
                          String _name_234 = attr_4.getName();
                          _builder.append(_name_234, "\t\t\t");
                          _builder.append("+ir*");
                          String _name_235 = attr_4.getName();
                          _builder.append(_name_235, "\t\t\t");
                          _builder.append("Dim[0],row[ir]->get");
                          String _UpperCaseName_62 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_62, "\t\t\t");
                          _builder.append("().toString().c_str());");
                          _builder.newLineIfNotEmpty();
                        } else {
                          String _CppType_19 = attr_4.CppType();
                          boolean _equals_33 = Objects.equal(_CppType_19, "ArrayTime");
                          if (_equals_33) {
                            _builder.append("\t\t\t");
                            String _name_236 = attr_4.getName();
                            _builder.append(_name_236, "\t\t\t");
                            _builder.append("[ir]     = row[ir]->get");
                            String _UpperCaseName_63 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_63, "\t\t\t");
                            _builder.append("().get();");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _CppType_20 = attr_4.CppType();
                            boolean _equals_34 = Objects.equal(_CppType_20, "ArrayTimeInterval");
                            if (_equals_34) {
                              _builder.append("\t\t\t");
                              String _name_237 = attr_4.getName();
                              _builder.append(_name_237, "\t\t\t");
                              _builder.append("[2*ir]  = row[ir]->get");
                              String _UpperCaseName_64 = attr_4.UpperCaseName();
                              _builder.append(_UpperCaseName_64, "\t\t\t");
                              _builder.append("().getStartInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              String _name_238 = attr_4.getName();
                              _builder.append(_name_238, "\t\t\t");
                              _builder.append("[2*ir+1] = row[ir]->get");
                              String _UpperCaseName_65 = attr_4.UpperCaseName();
                              _builder.append(_UpperCaseName_65, "\t\t\t");
                              _builder.append("().getDurationInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t\t");
                              String _name_239 = attr_4.getName();
                              _builder.append(_name_239, "\t\t\t");
                              _builder.append("[ir] = row[ir]->get");
                              String _UpperCaseName_66 = attr_4.UpperCaseName();
                              _builder.append(_UpperCaseName_66, "\t\t\t");
                              _builder.append("().get();");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("\t\t\t");
                String _CppType_21 = attr_4.CppType();
                _builder.append(_CppType_21, "\t\t\t");
                _builder.append("  ");
                String _name_240 = attr_4.getName();
                _builder.append(_name_240, "\t\t\t");
                _builder.append("Vec = row[ir]->get");
                String _UpperCaseName_67 = attr_4.UpperCaseName();
                _builder.append(_UpperCaseName_67, "\t\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                {
                  boolean _or_3 = false;
                  int _dimension_7 = attr_4.getDimension();
                  boolean _equals_35 = (_dimension_7 == 1);
                  if (_equals_35) {
                    _or_3 = true;
                  } else {
                    boolean _isExtrinsic_2 = attr_4.isExtrinsic();
                    _or_3 = _isExtrinsic_2;
                  }
                  if (_or_3) {
                    _builder.append("\t\t\t");
                    _builder.append("// OneD column of ");
                    String _SimpleCppType_16 = attr_4.SimpleCppType();
                    _builder.append(_SimpleCppType_16, "\t\t\t");
                    _builder.newLineIfNotEmpty();
                    {
                      String _SimpleCppType_17 = attr_4.SimpleCppType();
                      boolean _equals_36 = Objects.equal(_SimpleCppType_17, "string");
                      if (_equals_36) {
                        _builder.append("\t\t\t");
                        _builder.append("int maxDimZero");
                        String _UpperCaseName_68 = attr_4.UpperCaseName();
                        _builder.append(_UpperCaseName_68, "\t\t\t");
                        _builder.append(" = 0;");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("for (int i=0; i<min((int)");
                        String _name_241 = attr_4.getName();
                        _builder.append(_name_241, "\t\t\t");
                        _builder.append("Vec.size(),");
                        String _name_242 = attr_4.getName();
                        _builder.append(_name_242, "\t\t\t");
                        _builder.append("Dim[3]); i++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("if ((int)");
                        String _name_243 = attr_4.getName();
                        _builder.append(_name_243, "\t\t\t\t");
                        _builder.append("Vec[i].size()<");
                        String _name_244 = attr_4.getName();
                        _builder.append(_name_244, "\t\t\t\t");
                        _builder.append("Dim[1])");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t\t");
                        _builder.append("strcpy(");
                        String _name_245 = attr_4.getName();
                        _builder.append(_name_245, "\t\t\t\t\t");
                        _builder.append("+(ir*");
                        String _name_246 = attr_4.getName();
                        _builder.append(_name_246, "\t\t\t\t\t");
                        _builder.append("Dim[3]+i)*");
                        String _name_247 = attr_4.getName();
                        _builder.append(_name_247, "\t\t\t\t\t");
                        _builder.append("Dim[1], ");
                        String _name_248 = attr_4.getName();
                        _builder.append(_name_248, "\t\t\t\t\t");
                        _builder.append("Vec[i].c_str());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("else ");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        _builder.append("\t\t");
                        _builder.append("strncpy(");
                        String _name_249 = attr_4.getName();
                        _builder.append(_name_249, "\t\t\t\t\t");
                        _builder.append("+(ir*");
                        String _name_250 = attr_4.getName();
                        _builder.append(_name_250, "\t\t\t\t\t");
                        _builder.append("Dim[3]+i)*");
                        String _name_251 = attr_4.getName();
                        _builder.append(_name_251, "\t\t\t\t\t");
                        _builder.append("Dim[1], ");
                        String _name_252 = attr_4.getName();
                        _builder.append(_name_252, "\t\t\t\t\t");
                        _builder.append("Vec[i].c_str(),");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t\t");
                        String _name_253 = attr_4.getName();
                        _builder.append(_name_253, "\t\t\t\t\t");
                        _builder.append("Dim[1]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("maxDimZero");
                        String _UpperCaseName_69 = attr_4.UpperCaseName();
                        _builder.append(_UpperCaseName_69, "\t\t\t\t");
                        _builder.append(" = max((int)");
                        String _name_254 = attr_4.getName();
                        _builder.append(_name_254, "\t\t\t\t");
                        _builder.append("Vec.size(), maxDimZero");
                        String _UpperCaseName_70 = attr_4.UpperCaseName();
                        _builder.append(_UpperCaseName_70, "\t\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        String _name_255 = attr_4.getName();
                        _builder.append(_name_255, "\t\t\t");
                        _builder.append("Dim[ir*2] = maxDimZero");
                        String _UpperCaseName_71 = attr_4.UpperCaseName();
                        _builder.append(_UpperCaseName_71, "\t\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        String _name_256 = attr_4.getName();
                        _builder.append(_name_256, "\t\t\t");
                        _builder.append("Dim[ir*2+2] = ");
                        String _name_257 = attr_4.getName();
                        _builder.append(_name_257, "\t\t\t");
                        _builder.append("Vec.size();  // number of strings");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t\t");
                        _builder.append("for (int i=0; i<min((int)");
                        String _name_258 = attr_4.getName();
                        _builder.append(_name_258, "\t\t\t");
                        _builder.append("Vec.size(),");
                        String _name_259 = attr_4.getName();
                        _builder.append(_name_259, "\t\t\t");
                        _builder.append("Dim[1]); i++) {");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isCppStandard_6 = attr_4.isCppStandard();
                          if (_isCppStandard_6) {
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            String _name_260 = attr_4.getName();
                            _builder.append(_name_260, "\t\t\t\t");
                            _builder.append("[ir*");
                            String _name_261 = attr_4.getName();
                            _builder.append(_name_261, "\t\t\t\t");
                            _builder.append("Dim[1]+i] = ");
                            String _name_262 = attr_4.getName();
                            _builder.append(_name_262, "\t\t\t\t");
                            _builder.append("Vec[i];");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _SimpleCppType_18 = attr_4.SimpleCppType();
                            boolean _equals_37 = Objects.equal(_SimpleCppType_18, "Tag");
                            if (_equals_37) {
                              String _name_263 = attr_4.getName();
                              _builder.append(_name_263, "");
                              _builder.append("[ir*");
                              String _name_264 = attr_4.getName();
                              _builder.append(_name_264, "");
                              _builder.append("Dim[1]+i] = ");
                              String _name_265 = attr_4.getName();
                              _builder.append(_name_265, "");
                              _builder.append("Vec[i].getTagValue();");
                              _builder.newLineIfNotEmpty();
                            } else {
                              String _name_266 = attr_4.getName();
                              _builder.append(_name_266, "");
                              _builder.append("[ir*");
                              String _name_267 = attr_4.getName();
                              _builder.append(_name_267, "");
                              _builder.append("Dim[1]+i] = ");
                              String _name_268 = attr_4.getName();
                              _builder.append(_name_268, "");
                              _builder.append("Vec[i].get();");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                        _builder.append("\t\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        String _name_269 = attr_4.getName();
                        _builder.append(_name_269, "\t\t\t");
                        _builder.append("Dim[ir*2] = (int)");
                        String _name_270 = attr_4.getName();
                        _builder.append(_name_270, "\t\t\t");
                        _builder.append("Vec.size();  // return dimension of the vector in each row");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    int _dimension_8 = attr_4.getDimension();
                    boolean _equals_38 = (_dimension_8 == 2);
                    if (_equals_38) {
                      _builder.append("\t\t\t");
                      _builder.append("// TwoD column of ");
                      String _SimpleCppType_19 = attr_4.SimpleCppType();
                      _builder.append(_SimpleCppType_19, "\t\t\t");
                      _builder.newLineIfNotEmpty();
                      {
                        String _SimpleCppType_20 = attr_4.SimpleCppType();
                        boolean _equals_39 = Objects.equal(_SimpleCppType_20, "string");
                        if (_equals_39) {
                          _builder.append("\t\t\t");
                          _builder.append("int maxDimZero");
                          String _UpperCaseName_72 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_72, "\t\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("int maxDimTwo");
                          String _UpperCaseName_73 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_73, "\t\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("for (int i=0; i<min((int)");
                          String _name_271 = attr_4.getName();
                          _builder.append(_name_271, "\t\t\t");
                          _builder.append("Vec.size(),");
                          String _name_272 = attr_4.getName();
                          _builder.append(_name_272, "\t\t\t");
                          _builder.append("Dim[5]); i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("maxDimTwo");
                          String _UpperCaseName_74 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_74, "\t\t\t\t");
                          _builder.append(" = max((int)");
                          String _name_273 = attr_4.getName();
                          _builder.append(_name_273, "\t\t\t\t");
                          _builder.append("Vec[i].size(), maxDimTwo");
                          String _UpperCaseName_75 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_75, "\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0; j<min((int)row[ir]->get");
                          String _UpperCaseName_76 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_76, "\t\t\t\t");
                          _builder.append("()[i].size(),");
                          String _name_274 = attr_4.getName();
                          _builder.append(_name_274, "\t\t\t\t");
                          _builder.append("Dim[3]); j++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("  \t\t");
                          _builder.append("maxDimZero");
                          String _UpperCaseName_77 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_77, "\t\t\t  \t\t");
                          _builder.append(" = max((int)");
                          String _name_275 = attr_4.getName();
                          _builder.append(_name_275, "\t\t\t  \t\t");
                          _builder.append("Vec[i][j].size(), maxDimZero");
                          String _UpperCaseName_78 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_78, "\t\t\t  \t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("  \t\t");
                          _builder.append("if ((int)");
                          String _name_276 = attr_4.getName();
                          _builder.append(_name_276, "\t\t\t  \t\t");
                          _builder.append("Vec[i][j].size()<");
                          String _name_277 = attr_4.getName();
                          _builder.append(_name_277, "\t\t\t  \t\t");
                          _builder.append("Dim[1])");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t\t");
                          _builder.append("strcpy(");
                          String _name_278 = attr_4.getName();
                          _builder.append(_name_278, "\t\t\t\t\t\t");
                          _builder.append("+((ir*");
                          String _name_279 = attr_4.getName();
                          _builder.append(_name_279, "\t\t\t\t\t\t");
                          _builder.append("Dim[5]+i)*");
                          String _name_280 = attr_4.getName();
                          _builder.append(_name_280, "\t\t\t\t\t\t");
                          _builder.append("Dim[3]+j)**");
                          String _name_281 = attr_4.getName();
                          _builder.append(_name_281, "\t\t\t\t\t\t");
                          _builder.append("Dim[1], ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t \t\t\t");
                          String _name_282 = attr_4.getName();
                          _builder.append(_name_282, "\t\t\t\t \t\t\t");
                          _builder.append("Vec[i][j].c_str());");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("  \t\t");
                          _builder.append("else ");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("      \t\t");
                          _builder.append("strcpy(");
                          String _name_283 = attr_4.getName();
                          _builder.append(_name_283, "\t\t\t      \t\t");
                          _builder.append("+((ir*");
                          String _name_284 = attr_4.getName();
                          _builder.append(_name_284, "\t\t\t      \t\t");
                          _builder.append("Dim[5]+i)*");
                          String _name_285 = attr_4.getName();
                          _builder.append(_name_285, "\t\t\t      \t\t");
                          _builder.append("Dim[3]+j)**");
                          String _name_286 = attr_4.getName();
                          _builder.append(_name_286, "\t\t\t      \t\t");
                          _builder.append("Dim[1], ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t\t\t");
                          String _name_287 = attr_4.getName();
                          _builder.append(_name_287, "\t\t\t\t\t\t\t");
                          _builder.append("Vec[i][j].c_str(),");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t");
                          String _name_288 = attr_4.getName();
                          _builder.append(_name_288, "\t\t\t\t\t");
                          _builder.append("Dim[1]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          String _name_289 = attr_4.getName();
                          _builder.append(_name_289, "\t\t\t");
                          _builder.append("Dim[ir*2] = maxDimZero");
                          String _UpperCaseName_79 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_79, "\t\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_290 = attr_4.getName();
                          _builder.append(_name_290, "\t\t\t");
                          _builder.append("Dim[ir*2+2] = maxDimTwp");
                          String _UpperCaseName_80 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_80, "\t\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_291 = attr_4.getName();
                          _builder.append(_name_291, "\t\t\t");
                          _builder.append("Dim[ir*2+4] = ");
                          String _name_292 = attr_4.getName();
                          _builder.append(_name_292, "\t\t\t");
                          _builder.append("Vec.size();  // number of strings");
                          _builder.newLineIfNotEmpty();
                        } else {
                          _builder.append("\t\t\t");
                          _builder.append("int maxDimZero");
                          String _UpperCaseName_81 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_81, "\t\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("for (int i=0; i<min((int)");
                          String _name_293 = attr_4.getName();
                          _builder.append(_name_293, "\t\t\t");
                          _builder.append("Vec.size(),");
                          String _name_294 = attr_4.getName();
                          _builder.append(_name_294, "\t\t\t");
                          _builder.append("Dim[3]); i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("maxDimZero");
                          String _UpperCaseName_82 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_82, "\t\t\t\t");
                          _builder.append(" = max((int)");
                          String _name_295 = attr_4.getName();
                          _builder.append(_name_295, "\t\t\t\t");
                          _builder.append("Vec[i].size(),maxDimZero");
                          String _UpperCaseName_83 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_83, "\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0; j<min((int)");
                          String _name_296 = attr_4.getName();
                          _builder.append(_name_296, "\t\t\t\t");
                          _builder.append("Vec[i].size(), ");
                          String _name_297 = attr_4.getName();
                          _builder.append(_name_297, "\t\t\t\t");
                          _builder.append("Dim[1]) ;j++) {");
                          _builder.newLineIfNotEmpty();
                          {
                            boolean _isCppStandard_7 = attr_4.isCppStandard();
                            if (_isCppStandard_7) {
                              _builder.append("\t\t\t");
                              _builder.append("\t\t");
                              String _name_298 = attr_4.getName();
                              _builder.append(_name_298, "\t\t\t\t\t");
                              _builder.append("[(ir*");
                              String _name_299 = attr_4.getName();
                              _builder.append(_name_299, "\t\t\t\t\t");
                              _builder.append("Dim[3]+i)*");
                              String _name_300 = attr_4.getName();
                              _builder.append(_name_300, "\t\t\t\t\t");
                              _builder.append("Dim[1]+j]= ");
                              String _name_301 = attr_4.getName();
                              _builder.append(_name_301, "\t\t\t\t\t");
                              _builder.append("Vec[i][j];");
                              _builder.newLineIfNotEmpty();
                            } else {
                              String _SimpleCppType_21 = attr_4.SimpleCppType();
                              boolean _equals_40 = Objects.equal(_SimpleCppType_21, "Tag");
                              if (_equals_40) {
                                _builder.append("\t\t\t");
                                _builder.append("\t\t");
                                String _name_302 = attr_4.getName();
                                _builder.append(_name_302, "\t\t\t\t\t");
                                _builder.append("[(ir*");
                                String _name_303 = attr_4.getName();
                                _builder.append(_name_303, "\t\t\t\t\t");
                                _builder.append("Dim[3]+i)*");
                                String _name_304 = attr_4.getName();
                                _builder.append(_name_304, "\t\t\t\t\t");
                                _builder.append("Dim[1]+j]= ");
                                String _name_305 = attr_4.getName();
                                _builder.append(_name_305, "\t\t\t\t\t");
                                _builder.append("Vec[i][j].getTagValue();");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t\t");
                                _builder.append("\t\t");
                                String _name_306 = attr_4.getName();
                                _builder.append(_name_306, "\t\t\t\t\t");
                                _builder.append("[(ir*");
                                String _name_307 = attr_4.getName();
                                _builder.append(_name_307, "\t\t\t\t\t");
                                _builder.append("Dim[3]+i)*");
                                String _name_308 = attr_4.getName();
                                _builder.append(_name_308, "\t\t\t\t\t");
                                _builder.append("Dim[1]+j]= ");
                                String _name_309 = attr_4.getName();
                                _builder.append(_name_309, "\t\t\t\t\t");
                                _builder.append("Vec[i][j].get();;");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t  \t\t\t");
                          String _name_310 = attr_4.getName();
                          _builder.append(_name_310, "\t  \t\t\t");
                          _builder.append("Dim[ir*4] = maxDimZero");
                          String _UpperCaseName_84 = attr_4.UpperCaseName();
                          _builder.append(_UpperCaseName_84, "\t  \t\t\t");
                          _builder.append("; // return the maximum of inner dimension");
                          _builder.newLineIfNotEmpty();
                          _builder.append("         \t\t");
                          String _name_311 = attr_4.getName();
                          _builder.append(_name_311, "         \t\t");
                          _builder.append("Dim[ir*4+2] = ");
                          String _name_312 = attr_4.getName();
                          _builder.append(_name_312, "         \t\t");
                          _builder.append("Vec.size();  // return the outer dimension");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    } else {
                      int _dimension_9 = attr_4.getDimension();
                      boolean _equals_41 = (_dimension_9 == 3);
                      if (_equals_41) {
                        _builder.append("\t\t\t");
                        _builder.append("// ThreeD column of ");
                        String _SimpleCppType_22 = attr_4.SimpleCppType();
                        _builder.append(_SimpleCppType_22, "\t\t\t");
                        _builder.newLineIfNotEmpty();
                        {
                          String _SimpleCppType_23 = attr_4.SimpleCppType();
                          boolean _equals_42 = Objects.equal(_SimpleCppType_23, "string");
                          if (_equals_42) {
                            _builder.append("\t\t\t");
                            _builder.append("cout << \"Programming deficiency: Dimensionality higher than two not supported for strings\" << endl;");
                            _builder.newLine();
                          } else {
                            _builder.append("\t\t\t");
                            _builder.append("int maxDimTwo");
                            String _UpperCaseName_85 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_85, "\t\t\t");
                            _builder.append(" = 0;");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("int maxDimZero");
                            String _UpperCaseName_86 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_86, "\t\t\t");
                            _builder.append(" = 0;");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("for (int i=0; i<  min((int)");
                            String _name_313 = attr_4.getName();
                            _builder.append(_name_313, "\t\t\t");
                            _builder.append("Vec.size(),");
                            String _name_314 = attr_4.getName();
                            _builder.append(_name_314, "\t\t\t");
                            _builder.append("Dim[5]) ;i++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("maxDimTwo");
                            String _UpperCaseName_87 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_87, "\t\t\t\t");
                            _builder.append(" = max((int)");
                            String _name_315 = attr_4.getName();
                            _builder.append(_name_315, "\t\t\t\t");
                            _builder.append("Vec[i].size(),maxDimTwo");
                            String _UpperCaseName_88 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_88, "\t\t\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("for (int j=0;j< min((int)");
                            String _name_316 = attr_4.getName();
                            _builder.append(_name_316, "\t\t\t\t");
                            _builder.append("Vec[i].size(),");
                            String _name_317 = attr_4.getName();
                            _builder.append(_name_317, "\t\t\t\t");
                            _builder.append("Dim[3]) ;j++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t\t");
                            _builder.append("maxDimZero");
                            String _UpperCaseName_89 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_89, "\t\t\t\t\t");
                            _builder.append(" = max((int)");
                            String _name_318 = attr_4.getName();
                            _builder.append(_name_318, "\t\t\t\t\t");
                            _builder.append("Vec[i][j].size(),maxDimZero");
                            String _UpperCaseName_90 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_90, "\t\t\t\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t\t");
                            _builder.append("for (int k=0; k< min((int)");
                            String _name_319 = attr_4.getName();
                            _builder.append(_name_319, "\t\t\t\t\t");
                            _builder.append("Vec[i][j].size(),");
                            String _name_320 = attr_4.getName();
                            _builder.append(_name_320, "\t\t\t\t\t");
                            _builder.append("Dim[1]) ;k++) {");
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _isCppStandard_8 = attr_4.isCppStandard();
                              if (_isCppStandard_8) {
                                _builder.append("\t\t\t");
                                _builder.append("\t\t\t");
                                String _name_321 = attr_4.getName();
                                _builder.append(_name_321, "\t\t\t\t\t\t");
                                _builder.append("[((ir*");
                                String _name_322 = attr_4.getName();
                                _builder.append(_name_322, "\t\t\t\t\t\t");
                                _builder.append("Dim[5]+i)*");
                                String _name_323 = attr_4.getName();
                                _builder.append(_name_323, "\t\t\t\t\t\t");
                                _builder.append("Dim[3]+j)*");
                                String _name_324 = attr_4.getName();
                                _builder.append(_name_324, "\t\t\t\t\t\t");
                                _builder.append("Dim[1]+k] = ");
                                String _name_325 = attr_4.getName();
                                _builder.append(_name_325, "\t\t\t\t\t\t");
                                _builder.append("Vec[i][j][k];");
                                _builder.newLineIfNotEmpty();
                              } else {
                                String _SimpleCppType_24 = attr_4.SimpleCppType();
                                boolean _equals_43 = Objects.equal(_SimpleCppType_24, "Tag");
                                if (_equals_43) {
                                  _builder.append("\t\t\t");
                                  _builder.append("\t\t\t");
                                  String _name_326 = attr_4.getName();
                                  _builder.append(_name_326, "\t\t\t\t\t\t");
                                  _builder.append("[((ir*");
                                  String _name_327 = attr_4.getName();
                                  _builder.append(_name_327, "\t\t\t\t\t\t");
                                  _builder.append("Dim[5]+i)*");
                                  String _name_328 = attr_4.getName();
                                  _builder.append(_name_328, "\t\t\t\t\t\t");
                                  _builder.append("Dim[3]+j)*");
                                  String _name_329 = attr_4.getName();
                                  _builder.append(_name_329, "\t\t\t\t\t\t");
                                  _builder.append("Dim[1]+k] = ");
                                  String _name_330 = attr_4.getName();
                                  _builder.append(_name_330, "\t\t\t\t\t\t");
                                  _builder.append("Vec[i][j][k].getTagValue();");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  _builder.append("\t\t\t");
                                  _builder.append("\t\t\t");
                                  String _name_331 = attr_4.getName();
                                  _builder.append(_name_331, "\t\t\t\t\t\t");
                                  _builder.append("[((ir*");
                                  String _name_332 = attr_4.getName();
                                  _builder.append(_name_332, "\t\t\t\t\t\t");
                                  _builder.append("Dim[5]+i)*");
                                  String _name_333 = attr_4.getName();
                                  _builder.append(_name_333, "\t\t\t\t\t\t");
                                  _builder.append("Dim[3]+j)*");
                                  String _name_334 = attr_4.getName();
                                  _builder.append(_name_334, "\t\t\t\t\t\t");
                                  _builder.append("Dim[1]+k] = ");
                                  String _name_335 = attr_4.getName();
                                  _builder.append(_name_335, "\t\t\t\t\t\t");
                                  _builder.append("Vec[i][j][k].get();");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                            _builder.append("\t\t\t");
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            String _name_336 = attr_4.getName();
                            _builder.append(_name_336, "\t\t\t");
                            _builder.append("Dim[ir*2] = maxDimZero");
                            String _UpperCaseName_91 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_91, "\t\t\t");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            String _name_337 = attr_4.getName();
                            _builder.append(_name_337, "\t\t\t");
                            _builder.append("Dim[ir*2+2] = maxDimTwo");
                            String _UpperCaseName_92 = attr_4.UpperCaseName();
                            _builder.append(_UpperCaseName_92, "\t\t\t");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            String _name_338 = attr_4.getName();
                            _builder.append(_name_338, "\t\t\t");
                            _builder.append("Dim[ir*2+4] = ");
                            String _name_339 = attr_4.getName();
                            _builder.append(_name_339, "\t\t\t");
                            _builder.append("Vec.size();  // return dimension of the ASDM table ");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      } else {
                        _builder.append("\t\t\t");
                        _builder.append("cout << \"Programming deficiency: Dimensionality higher than three not supported \" << endl;");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            }
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return size ;   // return the size of the table  ");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("// -------------------------------------------");
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Return the size of a table");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  0  if table is empty");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* -1 if table does not exist");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int sdm_get");
    String _name_340 = table.getName();
    _builder.append(_name_340, "");
    _builder.append("TableSize() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if (dataset==0) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("cout<<\"No dataset initialized\"<<endl;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return -1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _name_341 = table.getName();
    _builder.append(_name_341, "");
    _builder.append("Table &table = dataset->get");
    String _name_342 = table.getName();
    _builder.append(_name_342, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("int size = (int)table.get().size();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return size;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("// -------------------------------------------");
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Return key arrays");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  0  if table is empty");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* -1 if table does not exist");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("int sdm_get");
    String _name_343 = table.getName();
    _builder.append(_name_343, "");
    _builder.append("Keys(");
    String _KeyCTypeList_1 = table.KeyCTypeList();
    _builder.append(_KeyCTypeList_1, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if (dataset==0) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cout<<\"No dataset initialized\"<<endl;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("return -1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _name_344 = table.getName();
    _builder.append(_name_344, "\t");
    _builder.append("Table &table = dataset->get");
    String _name_345 = table.getName();
    _builder.append(_name_345, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("vector< ");
    String _name_346 = table.getName();
    _builder.append(_name_346, "\t");
    _builder.append("Row * > row = table.get();");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("int size = (int)table.get().size();");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("if (size==0) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("} else {");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_3 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_5 : _requiredAttributes_3) {
        {
          boolean _isKey_1 = attr_5.isKey();
          if (_isKey_1) {
            {
              boolean _isArray_3 = attr_5.isArray();
              boolean _not_5 = (!_isArray_3);
              if (_not_5) {
                {
                  String _CppType_22 = attr_5.CppType();
                  boolean _equals_44 = Objects.equal(_CppType_22, "string");
                  if (_equals_44) {
                    _builder.append("\t\t");
                    _builder.append("int maxDimZero");
                    String _UpperCaseName_93 = attr_5.UpperCaseName();
                    _builder.append(_UpperCaseName_93, "\t\t");
                    _builder.append(" = 0;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("  \t\t");
    _builder.append("for (int i=0;i<size;i++) {");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_4 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_6 : _requiredAttributes_4) {
        {
          boolean _isKey_2 = attr_6.isKey();
          if (_isKey_2) {
            {
              boolean _isArray_4 = attr_6.isArray();
              boolean _not_6 = (!_isArray_4);
              if (_not_6) {
                {
                  boolean _isCppStandard_9 = attr_6.isCppStandard();
                  if (_isCppStandard_9) {
                    _builder.append("\t  \t\t");
                    String _name_347 = attr_6.getName();
                    _builder.append(_name_347, "\t  \t\t");
                    _builder.append("[i] = row[i]->get");
                    String _UpperCaseName_94 = attr_6.UpperCaseName();
                    _builder.append(_UpperCaseName_94, "\t  \t\t");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _CppType_23 = attr_6.CppType();
                    boolean _equals_45 = Objects.equal(_CppType_23, "Tag");
                    if (_equals_45) {
                      _builder.append("\t  \t\t");
                      _builder.append("// ");
                      String _name_348 = attr_6.getName();
                      _builder.append(_name_348, "\t  \t\t");
                      _builder.append("[i] = atoi((row[i]->get");
                      String _UpperCaseName_95 = attr_6.UpperCaseName();
                      _builder.append(_UpperCaseName_95, "\t  \t\t");
                      _builder.append("().getId()).c_str());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t\t");
                      String _name_349 = attr_6.getName();
                      _builder.append(_name_349, "\t\t\t\t");
                      _builder.append("[i] = row[i]->get");
                      String _UpperCaseName_96 = attr_6.UpperCaseName();
                      _builder.append(_UpperCaseName_96, "\t\t\t\t");
                      _builder.append("().getTagValue();");
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _CppType_24 = attr_6.CppType();
                      boolean _equals_46 = Objects.equal(_CppType_24, "string");
                      if (_equals_46) {
                        _builder.append("\t  \t\t");
                        _builder.append("if ((int) row[i]->get");
                        String _UpperCaseName_97 = attr_6.UpperCaseName();
                        _builder.append(_UpperCaseName_97, "\t  \t\t");
                        _builder.append("().size() < ");
                        String _name_350 = attr_6.getName();
                        _builder.append(_name_350, "\t  \t\t");
                        _builder.append("Dim[1])");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t  \t\t");
                        _builder.append("\t");
                        _builder.append("strcpy(");
                        String _name_351 = attr_6.getName();
                        _builder.append(_name_351, "\t  \t\t\t");
                        _builder.append("+i*");
                        String _name_352 = attr_6.getName();
                        _builder.append(_name_352, "\t  \t\t\t");
                        _builder.append("Dim[1],row[i]->get");
                        String _UpperCaseName_98 = attr_6.UpperCaseName();
                        _builder.append(_UpperCaseName_98, "\t  \t\t\t");
                        _builder.append("().c_str());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t  \t\t");
                        _builder.append("else");
                        _builder.newLine();
                        _builder.append("\t  \t\t");
                        _builder.append("\t");
                        _builder.append("strncpy(");
                        String _name_353 = attr_6.getName();
                        _builder.append(_name_353, "\t  \t\t\t");
                        _builder.append("+i*");
                        String _name_354 = attr_6.getName();
                        _builder.append(_name_354, "\t  \t\t\t");
                        _builder.append("Dim[1],row[i]->get");
                        String _UpperCaseName_99 = attr_6.UpperCaseName();
                        _builder.append(_UpperCaseName_99, "\t  \t\t\t");
                        _builder.append("().c_str(),");
                        String _name_355 = attr_6.getName();
                        _builder.append(_name_355, "\t  \t\t\t");
                        _builder.append("Dim[1]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t  \t\t");
                        _builder.append("maxDimZero");
                        String _UpperCaseName_100 = attr_6.UpperCaseName();
                        _builder.append(_UpperCaseName_100, "\t  \t\t");
                        _builder.append(" = max((int)row[i]->get");
                        String _UpperCaseName_101 = attr_6.UpperCaseName();
                        _builder.append(_UpperCaseName_101, "\t  \t\t");
                        _builder.append("().size(), maxDimZero");
                        String _UpperCaseName_102 = attr_6.UpperCaseName();
                        _builder.append(_UpperCaseName_102, "\t  \t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      } else {
                        String _CppType_25 = attr_6.CppType();
                        boolean _equals_47 = Objects.equal(_CppType_25, "EntityRef");
                        if (_equals_47) {
                          _builder.append("\t  \t\t");
                          _builder.append("strcpy(");
                          String _name_356 = attr_6.getName();
                          _builder.append(_name_356, "\t  \t\t");
                          _builder.append("+i*");
                          String _name_357 = attr_6.getName();
                          _builder.append(_name_357, "\t  \t\t");
                          _builder.append("Dim[1],row[i]->get");
                          String _UpperCaseName_103 = attr_6.UpperCaseName();
                          _builder.append(_UpperCaseName_103, "\t  \t\t");
                          _builder.append("().toString().c_str());");
                          _builder.newLineIfNotEmpty();
                        } else {
                          String _CppType_26 = attr_6.CppType();
                          boolean _equals_48 = Objects.equal(_CppType_26, "ArrayTime");
                          if (_equals_48) {
                            _builder.append("\t  \t\t");
                            String _name_358 = attr_6.getName();
                            _builder.append(_name_358, "\t  \t\t");
                            _builder.append("[i] = row[i]->get");
                            String _UpperCaseName_104 = attr_6.UpperCaseName();
                            _builder.append(_UpperCaseName_104, "\t  \t\t");
                            _builder.append("().get();");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _CppType_27 = attr_6.CppType();
                            boolean _equals_49 = Objects.equal(_CppType_27, "ArrayTimeInterval");
                            if (_equals_49) {
                              _builder.append("\t  \t\t");
                              String _name_359 = attr_6.getName();
                              _builder.append(_name_359, "\t  \t\t");
                              _builder.append("[2*i]   = row[i]->get");
                              String _UpperCaseName_105 = attr_6.UpperCaseName();
                              _builder.append(_UpperCaseName_105, "\t  \t\t");
                              _builder.append("().getStartInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t\t");
                              String _name_360 = attr_6.getName();
                              _builder.append(_name_360, "\t\t\t\t");
                              _builder.append("[2*i+1]  = row[i]->get");
                              String _UpperCaseName_106 = attr_6.UpperCaseName();
                              _builder.append(_UpperCaseName_106, "\t\t\t\t");
                              _builder.append("().getDurationInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t  \t\t");
                              _builder.append("//cout<<\"ArrayTimeInterval in key\"<<endl;");
                              _builder.newLine();
                            } else {
                              _builder.append("\t  \t\t");
                              String _name_361 = attr_6.getName();
                              _builder.append(_name_361, "\t  \t\t");
                              _builder.append("[i] = ");
                              String _UpperCaseName_107 = attr_6.UpperCaseName();
                              _builder.append(_UpperCaseName_107, "\t  \t\t");
                              _builder.append("Vec.get();");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("\t  \t\t");
                _builder.append("cout<<\"Multidimensional array in key !!!\"<<endl;");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("  \t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredAttributes_5 = table.getRequiredAttributes();
      for(final ASDMAttribute attr_7 : _requiredAttributes_5) {
        {
          boolean _isKey_3 = attr_7.isKey();
          if (_isKey_3) {
            {
              boolean _isArray_5 = attr_7.isArray();
              boolean _not_7 = (!_isArray_5);
              if (_not_7) {
                {
                  String _CppType_28 = attr_7.CppType();
                  boolean _equals_50 = Objects.equal(_CppType_28, "string");
                  if (_equals_50) {
                    String _name_362 = attr_7.getName();
                    _builder.append(_name_362, "");
                    _builder.append("Dim[0] = maxDimZero");
                    String _UpperCaseName_108 = attr_7.UpperCaseName();
                    _builder.append(_UpperCaseName_108, "");
                    _builder.append(" ;");
                    _builder.newLineIfNotEmpty();
                    String _name_363 = attr_7.getName();
                    _builder.append(_name_363, "");
                    _builder.append("Dim[2] = size ;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("return size;");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
      int _size_1 = _optionalValueAttributes.size();
      boolean _notEquals_3 = (_size_1 != 0);
      if (_notEquals_3) {
        {
          List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
          for(final ASDMAttribute attr_8 : _optionalValueAttributes_1) {
            _builder.append("// -------------------------------------------");
            _builder.newLine();
            _builder.append("/**");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Set the optional parameter ");
            String _name_364 = attr_8.getName();
            _builder.append(_name_364, " ");
            _builder.append(", in a row of the ");
            String _name_365 = table.getName();
            _builder.append(_name_365, " ");
            _builder.append(" table, given a key");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.newLine();
            _builder.append("#define sdm_add");
            String _name_366 = table.getName();
            _builder.append(_name_366, "");
            String _UpperCaseName_109 = attr_8.UpperCaseName();
            _builder.append(_UpperCaseName_109, "");
            _builder.append("  sdm_add");
            String _ToLowerCase_2 = table.ToLowerCase();
            _builder.append(_ToLowerCase_2, "");
            String _ToLowerCase_3 = attr_8.ToLowerCase();
            _builder.append(_ToLowerCase_3, "");
            _builder.append("_");
            _builder.newLineIfNotEmpty();
            _builder.append("extern \"C\" int sdm_add");
            String _name_367 = table.getName();
            _builder.append(_name_367, "");
            String _UpperCaseName_110 = attr_8.UpperCaseName();
            _builder.append(_UpperCaseName_110, "");
            _builder.append("(");
            String _KeyCTypeList_2 = table.KeyCTypeList();
            _builder.append(_KeyCTypeList_2, "");
            _builder.append(", ");
            String _CTypeAttributeDimList_2 = attr_8.CTypeAttributeDimList();
            _builder.append(_CTypeAttributeDimList_2, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.append("int sdm_add");
            String _name_368 = table.getName();
            _builder.append(_name_368, "");
            String _UpperCaseName_111 = attr_8.UpperCaseName();
            _builder.append(_UpperCaseName_111, "");
            _builder.append("(");
            String _KeyCTypeList_3 = table.KeyCTypeList();
            _builder.append(_KeyCTypeList_3, "");
            _builder.append(", ");
            String _CTypeAttributeDimList_3 = attr_8.CTypeAttributeDimList();
            _builder.append(_CTypeAttributeDimList_3, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("if (dataset==0) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("cout<<\"No dataset initialized\"<<endl;");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return -1;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            String _name_369 = table.getName();
            _builder.append(_name_369, "\t");
            _builder.append("Table &table = dataset->get");
            String _name_370 = table.getName();
            _builder.append(_name_370, "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            String _name_371 = table.getName();
            _builder.append(_name_371, "\t");
            _builder.append("Row *row = 0;");
            _builder.newLineIfNotEmpty();
            {
              boolean _isArrayTimeIntervalKey_2 = table.isArrayTimeIntervalKey();
              if (_isArrayTimeIntervalKey_2) {
                _builder.append("\t");
                _builder.append("if (*(timeInterval+1)>0)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("row = table.getRowByKey(");
                String _KeyCppFromCList_3 = table.KeyCppFromCList();
                _builder.append(_KeyCppFromCList_3, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("else");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("row = table.getRowByKey(");
                String _KeyCppFromCListWithoutInterval_1 = table.KeyCppFromCListWithoutInterval();
                _builder.append(_KeyCppFromCListWithoutInterval_1, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("row = table.getRowByKey(");
                String _KeyCppFromCList_4 = table.KeyCppFromCList();
                _builder.append(_KeyCppFromCList_4, "\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("if (row==0) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return -1;     // No row corresponding to the key");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("} else {");
            _builder.newLine();
            {
              boolean _isArray_6 = attr_8.isArray();
              if (_isArray_6) {
                {
                  boolean _or_4 = false;
                  int _dimension_10 = attr_8.getDimension();
                  boolean _equals_51 = (_dimension_10 == 1);
                  if (_equals_51) {
                    _or_4 = true;
                  } else {
                    boolean _isExtrinsic_3 = attr_8.isExtrinsic();
                    _or_4 = _isExtrinsic_3;
                  }
                  if (_or_4) {
                    {
                      boolean _isStringType_2 = attr_8.isStringType();
                      boolean _not_8 = (!_isStringType_2);
                      if (_not_8) {
                        _builder.append("\t\t");
                        String _CppType_29 = attr_8.CppType();
                        _builder.append(_CppType_29, "\t\t");
                        _builder.append("  ");
                        String _name_372 = attr_8.getName();
                        _builder.append(_name_372, "\t\t");
                        _builder.append("Vec(");
                        String _name_373 = attr_8.getName();
                        _builder.append(_name_373, "\t\t");
                        _builder.append("Dim[0]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (int i=0;i<");
                        String _name_374 = attr_8.getName();
                        _builder.append(_name_374, "\t\t");
                        _builder.append("Dim[0];i++)");
                        _builder.newLineIfNotEmpty();
                        {
                          String _SimpleCppType_25 = attr_8.SimpleCppType();
                          boolean _equals_52 = Objects.equal(_SimpleCppType_25, "long long");
                          if (_equals_52) {
                            _builder.append("\t\t");
                            _builder.append("\t");
                            String _name_375 = attr_8.getName();
                            _builder.append(_name_375, "\t\t\t");
                            _builder.append("Vec[i]= ");
                            String _name_376 = attr_8.getName();
                            _builder.append(_name_376, "\t\t\t");
                            _builder.append("[i];");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _SimpleCppType_26 = attr_8.SimpleCppType();
                            boolean _equals_53 = Objects.equal(_SimpleCppType_26, "ArrayTimeInterval");
                            if (_equals_53) {
                              _builder.append("\t\t");
                              _builder.append("\t");
                              String _name_377 = attr_8.getName();
                              _builder.append(_name_377, "\t\t\t");
                              _builder.append("Vec[i]= ");
                              String _SimpleCppType_27 = attr_8.SimpleCppType();
                              _builder.append(_SimpleCppType_27, "\t\t\t");
                              _builder.append("(");
                              String _name_378 = attr_8.getName();
                              _builder.append(_name_378, "\t\t\t");
                              _builder.append("[2*i], ");
                              String _name_379 = attr_8.getName();
                              _builder.append(_name_379, "\t\t\t");
                              _builder.append("[2*i+1]);");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t");
                              _builder.append("\t");
                              String _name_380 = attr_8.getName();
                              _builder.append(_name_380, "\t\t\t");
                              _builder.append("Vec[i]= ");
                              String _SimpleCppType_28 = attr_8.SimpleCppType();
                              _builder.append(_SimpleCppType_28, "\t\t\t");
                              _builder.append("(");
                              String _name_381 = attr_8.getName();
                              _builder.append(_name_381, "\t\t\t");
                              _builder.append("[i] ");
                              {
                                String _SimpleCppType_29 = attr_8.SimpleCppType();
                                boolean _equals_54 = Objects.equal(_SimpleCppType_29, "Tag");
                                if (_equals_54) {
                                  _builder.append(", ");
                                  String _CppTagType_6 = attr_8.CppTagType();
                                  _builder.append(_CppTagType_6, "\t\t\t");
                                }
                              }
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      } else {
                        _builder.append("\t\t");
                        String _CppType_30 = attr_8.CppType();
                        _builder.append(_CppType_30, "\t\t");
                        _builder.append("  ");
                        String _name_382 = attr_8.getName();
                        _builder.append(_name_382, "\t\t");
                        _builder.append("Vec(");
                        String _name_383 = attr_8.getName();
                        _builder.append(_name_383, "\t\t");
                        _builder.append("Dim[2]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (int i=0;i<");
                        String _name_384 = attr_8.getName();
                        _builder.append(_name_384, "\t\t");
                        _builder.append("Dim[2];i++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        String _name_385 = attr_8.getName();
                        _builder.append(_name_385, "\t\t\t");
                        _builder.append("Vec[i]= ");
                        String _SimpleCppType_30 = attr_8.SimpleCppType();
                        _builder.append(_SimpleCppType_30, "\t\t\t");
                        _builder.append("(");
                        String _name_386 = attr_8.getName();
                        _builder.append(_name_386, "\t\t\t");
                        _builder.append("+i*");
                        String _name_387 = attr_8.getName();
                        _builder.append(_name_387, "\t\t\t");
                        _builder.append("Dim[1]  ");
                        {
                          String _SimpleCppType_31 = attr_8.SimpleCppType();
                          boolean _equals_55 = Objects.equal(_SimpleCppType_31, "Tag");
                          if (_equals_55) {
                            _builder.append(", ");
                            String _CppTagType_7 = attr_8.CppTagType();
                            _builder.append(_CppTagType_7, "\t\t\t");
                          }
                        }
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    int _dimension_11 = attr_8.getDimension();
                    boolean _equals_56 = (_dimension_11 == 2);
                    if (_equals_56) {
                      {
                        boolean _isStringType_3 = attr_8.isStringType();
                        boolean _not_9 = (!_isStringType_3);
                        if (_not_9) {
                          _builder.append("\t\t");
                          _builder.append("//... 2 dimensions optional par ");
                          String _name_388 = attr_8.getName();
                          _builder.append(_name_388, "\t\t");
                          _builder.append(":");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          String _CppType_31 = attr_8.CppType();
                          _builder.append(_CppType_31, "\t\t");
                          _builder.append("  ");
                          String _name_389 = attr_8.getName();
                          _builder.append(_name_389, "\t\t");
                          _builder.append("Vec(");
                          String _name_390 = attr_8.getName();
                          _builder.append(_name_390, "\t\t");
                          _builder.append("Dim[2]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("for (int i=0;i<");
                          String _name_391 = attr_8.getName();
                          _builder.append(_name_391, "\t\t");
                          _builder.append("Dim[2];i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          String _name_392 = attr_8.getName();
                          _builder.append(_name_392, "\t\t\t");
                          _builder.append("Vec[i].resize(");
                          String _name_393 = attr_8.getName();
                          _builder.append(_name_393, "\t\t\t");
                          _builder.append("Dim[0]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0;j<");
                          String _name_394 = attr_8.getName();
                          _builder.append(_name_394, "\t\t\t");
                          _builder.append("Dim[0];j++)");
                          _builder.newLineIfNotEmpty();
                          {
                            String _SimpleCppType_32 = attr_8.SimpleCppType();
                            boolean _equals_57 = Objects.equal(_SimpleCppType_32, "long long");
                            if (_equals_57) {
                              _builder.append("\t\t");
                              _builder.append("\t\t");
                              String _name_395 = attr_8.getName();
                              _builder.append(_name_395, "\t\t\t\t");
                              _builder.append("Vec[i][j]= ");
                              String _name_396 = attr_8.getName();
                              _builder.append(_name_396, "\t\t\t\t");
                              _builder.append("[i*(");
                              String _name_397 = attr_8.getName();
                              _builder.append(_name_397, "\t\t\t\t");
                              _builder.append("Dim[1])+j];");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t");
                              _builder.append("\t\t");
                              String _name_398 = attr_8.getName();
                              _builder.append(_name_398, "\t\t\t\t");
                              _builder.append("Vec[i][j]= ");
                              String _SimpleCppType_33 = attr_8.SimpleCppType();
                              _builder.append(_SimpleCppType_33, "\t\t\t\t");
                              _builder.append("(");
                              String _name_399 = attr_8.getName();
                              _builder.append(_name_399, "\t\t\t\t");
                              _builder.append("[i*(");
                              String _name_400 = attr_8.getName();
                              _builder.append(_name_400, "\t\t\t\t");
                              _builder.append("Dim[1])+j]);");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          _builder.append("\t\t");
                          _builder.append("// ... 2 dimensions optional  string parameter ");
                          String _name_401 = attr_8.getName();
                          _builder.append(_name_401, "\t\t");
                          _builder.append(": ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          String _CppType_32 = attr_8.CppType();
                          _builder.append(_CppType_32, "\t\t");
                          _builder.append("  ");
                          String _name_402 = attr_8.getName();
                          _builder.append(_name_402, "\t\t");
                          _builder.append("Vec(");
                          String _name_403 = attr_8.getName();
                          _builder.append(_name_403, "\t\t");
                          _builder.append("Dim[4]  ");
                          {
                            String _SimpleCppType_34 = attr_8.SimpleCppType();
                            boolean _equals_58 = Objects.equal(_SimpleCppType_34, "Tag");
                            if (_equals_58) {
                              _builder.append(", ");
                              String _CppTagType_8 = attr_8.CppTagType();
                              _builder.append(_CppTagType_8, "\t\t");
                            }
                          }
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("for (int i=0;i<*");
                          String _name_404 = attr_8.getName();
                          _builder.append(_name_404, "\t\t");
                          _builder.append("Dim[4];i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          String _name_405 = attr_8.getName();
                          _builder.append(_name_405, "\t\t\t");
                          _builder.append("Vec[i].resize(");
                          String _name_406 = attr_8.getName();
                          _builder.append(_name_406, "\t\t\t");
                          _builder.append("Dim[2]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0;j<");
                          String _name_407 = attr_8.getName();
                          _builder.append(_name_407, "\t\t\t");
                          _builder.append("Dim[2];j++)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t\t");
                          String _SimpleCppType_35 = attr_8.SimpleCppType();
                          _builder.append(_SimpleCppType_35, "\t\t\t\t");
                          _builder.append("(");
                          String _name_408 = attr_8.getName();
                          _builder.append(_name_408, "\t\t\t\t");
                          _builder.append("+(i*(");
                          String _name_409 = attr_8.getName();
                          _builder.append(_name_409, "\t\t\t\t");
                          _builder.append("Dim[3])+j)*");
                          String _name_410 = attr_8.getName();
                          _builder.append(_name_410, "\t\t\t\t");
                          _builder.append("Dim[1]  ");
                          {
                            String _SimpleCppType_36 = attr_8.SimpleCppType();
                            boolean _equals_59 = Objects.equal(_SimpleCppType_36, "Tag");
                            if (_equals_59) {
                              _builder.append(", ");
                              String _CppTagType_9 = attr_8.CppTagType();
                              _builder.append(_CppTagType_9, "\t\t\t\t");
                            }
                          }
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                        }
                      }
                    } else {
                      int _dimension_12 = attr_8.getDimension();
                      boolean _equals_60 = (_dimension_12 == 3);
                      if (_equals_60) {
                        _builder.append("\t\t");
                        _builder.append("//... 3 dimensions optional par ");
                        String _name_411 = attr_8.getName();
                        _builder.append(_name_411, "\t\t");
                        _builder.append(":  ");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _CppType_33 = attr_8.CppType();
                        _builder.append(_CppType_33, "\t\t");
                        _builder.append("  ");
                        String _name_412 = attr_8.getName();
                        _builder.append(_name_412, "\t\t");
                        _builder.append("Vec(");
                        String _name_413 = attr_8.getName();
                        _builder.append(_name_413, "\t\t");
                        _builder.append("Dim[4]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("for (int i=0;i<");
                        String _name_414 = attr_8.getName();
                        _builder.append(_name_414, "\t\t");
                        _builder.append("Dim[4];i++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        String _name_415 = attr_8.getName();
                        _builder.append(_name_415, "\t\t\t");
                        _builder.append("Vec[i].resize(");
                        String _name_416 = attr_8.getName();
                        _builder.append(_name_416, "\t\t\t");
                        _builder.append("Dim[2]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("for (int j=0;j<");
                        String _name_417 = attr_8.getName();
                        _builder.append(_name_417, "\t\t\t");
                        _builder.append("Dim[2];j++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t\t");
                        String _name_418 = attr_8.getName();
                        _builder.append(_name_418, "\t\t\t\t");
                        _builder.append("Vec[i][j].resize(");
                        String _name_419 = attr_8.getName();
                        _builder.append(_name_419, "\t\t\t\t");
                        _builder.append("Dim[0]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t\t");
                        _builder.append("for (int k=0;k<");
                        String _name_420 = attr_8.getName();
                        _builder.append(_name_420, "\t\t\t\t");
                        _builder.append("Dim[0];k++)");
                        _builder.newLineIfNotEmpty();
                        {
                          String _SimpleCppType_37 = attr_8.SimpleCppType();
                          boolean _equals_61 = Objects.equal(_SimpleCppType_37, "long long");
                          if (_equals_61) {
                            _builder.append("\t\t");
                            _builder.append("\t\t\t");
                            String _name_421 = attr_8.getName();
                            _builder.append(_name_421, "\t\t\t\t\t");
                            _builder.append("Vec[i][j][k]= ");
                            String _name_422 = attr_8.getName();
                            _builder.append(_name_422, "\t\t\t\t\t");
                            _builder.append("[(i*");
                            String _name_423 = attr_8.getName();
                            _builder.append(_name_423, "\t\t\t\t\t");
                            _builder.append("Dim[3]+j)*");
                            String _name_424 = attr_8.getName();
                            _builder.append(_name_424, "\t\t\t\t\t");
                            _builder.append("Dim[1]+k];");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t\t");
                            _builder.append("\t\t\t");
                            String _name_425 = attr_8.getName();
                            _builder.append(_name_425, "\t\t\t\t\t");
                            _builder.append("Vec[i][j][k]= ");
                            String _SimpleCppType_38 = attr_8.SimpleCppType();
                            _builder.append(_SimpleCppType_38, "\t\t\t\t\t");
                            _builder.append("(");
                            String _name_426 = attr_8.getName();
                            _builder.append(_name_426, "\t\t\t\t\t");
                            _builder.append("[(i*");
                            String _name_427 = attr_8.getName();
                            _builder.append(_name_427, "\t\t\t\t\t");
                            _builder.append("Dim[3]+j)*");
                            String _name_428 = attr_8.getName();
                            _builder.append(_name_428, "\t\t\t\t\t");
                            _builder.append("Dim[1]+k]);");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        int _dimension_13 = attr_8.getDimension();
                        boolean _equals_62 = (_dimension_13 == 4);
                        if (_equals_62) {
                          _builder.append("\t\t");
                          _builder.append("//... 4 dimensions optional par ");
                          String _name_429 = attr_8.getName();
                          _builder.append(_name_429, "\t\t");
                          _builder.append(": ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          String _CppType_34 = attr_8.CppType();
                          _builder.append(_CppType_34, "\t\t");
                          _builder.append("  ");
                          String _name_430 = attr_8.getName();
                          _builder.append(_name_430, "\t\t");
                          _builder.append("Vec(");
                          String _name_431 = attr_8.getName();
                          _builder.append(_name_431, "\t\t");
                          _builder.append("Dim[6]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("for (int i=0;i<");
                          String _name_432 = attr_8.getName();
                          _builder.append(_name_432, "\t\t");
                          _builder.append("Dim[6];i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          String _name_433 = attr_8.getName();
                          _builder.append(_name_433, "\t\t\t");
                          _builder.append("Vec[i].resize(");
                          String _name_434 = attr_8.getName();
                          _builder.append(_name_434, "\t\t\t");
                          _builder.append("Dim[4]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0;j<");
                          String _name_435 = attr_8.getName();
                          _builder.append(_name_435, "\t\t\t");
                          _builder.append("Dim[4];j++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t\t");
                          String _name_436 = attr_8.getName();
                          _builder.append(_name_436, "\t\t\t\t");
                          _builder.append("Vec[i][j].resize(");
                          String _name_437 = attr_8.getName();
                          _builder.append(_name_437, "\t\t\t\t");
                          _builder.append("Dim[2]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t\t");
                          _builder.append("for (int k=0;k<");
                          String _name_438 = attr_8.getName();
                          _builder.append(_name_438, "\t\t\t\t");
                          _builder.append("Dim[2];k++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t\t\t");
                          String _name_439 = attr_8.getName();
                          _builder.append(_name_439, "\t\t\t\t\t");
                          _builder.append("Vec[i][j][k].resize(");
                          String _name_440 = attr_8.getName();
                          _builder.append(_name_440, "\t\t\t\t\t");
                          _builder.append("Dim[0]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("\t\t\t");
                          _builder.append("for (int l=0;l<");
                          String _name_441 = attr_8.getName();
                          _builder.append(_name_441, "\t\t\t\t\t");
                          _builder.append("Dim[0];k++)");
                          _builder.newLineIfNotEmpty();
                          {
                            String _SimpleCppType_39 = attr_8.SimpleCppType();
                            boolean _equals_63 = Objects.equal(_SimpleCppType_39, "long long");
                            if (_equals_63) {
                              _builder.append("\t\t");
                              _builder.append("\t\t\t\t");
                              String _name_442 = attr_8.getName();
                              _builder.append(_name_442, "\t\t\t\t\t\t");
                              _builder.append("Vec[i][j][k][l]= ");
                              String _name_443 = attr_8.getName();
                              _builder.append(_name_443, "\t\t\t\t\t\t");
                              _builder.append("[((i*");
                              String _name_444 = attr_8.getName();
                              _builder.append(_name_444, "\t\t\t\t\t\t");
                              _builder.append("Dim[5]+j)*");
                              String _name_445 = attr_8.getName();
                              _builder.append(_name_445, "\t\t\t\t\t\t");
                              _builder.append("Dim[3]+k)*");
                              String _name_446 = attr_8.getName();
                              _builder.append(_name_446, "\t\t\t\t\t\t");
                              _builder.append("Dim[1]+l];");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t");
                              _builder.append("\t\t\t\t");
                              String _name_447 = attr_8.getName();
                              _builder.append(_name_447, "\t\t\t\t\t\t");
                              _builder.append("Vec[i][j][k][l]= ");
                              String _SimpleCppType_40 = attr_8.SimpleCppType();
                              _builder.append(_SimpleCppType_40, "\t\t\t\t\t\t");
                              _builder.append("(");
                              String _name_448 = attr_8.getName();
                              _builder.append(_name_448, "\t\t\t\t\t\t");
                              _builder.append("[((i*");
                              String _name_449 = attr_8.getName();
                              _builder.append(_name_449, "\t\t\t\t\t\t");
                              _builder.append("Dim[5]+j)*");
                              String _name_450 = attr_8.getName();
                              _builder.append(_name_450, "\t\t\t\t\t\t");
                              _builder.append("Dim[3]+k)*");
                              String _name_451 = attr_8.getName();
                              _builder.append(_name_451, "\t\t\t\t\t\t");
                              _builder.append("Dim[1]+l]);");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                          _builder.append("\t\t");
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                        }
                      }
                    }
                  }
                }
                _builder.append("\t\t");
                _builder.append("row->set");
                String _UpperCaseName_112 = attr_8.UpperCaseName();
                _builder.append(_UpperCaseName_112, "\t\t");
                _builder.append("(");
                String _name_452 = attr_8.getName();
                _builder.append(_name_452, "\t\t");
                _builder.append("Vec);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t");
                _builder.append("// case: scalar attribute.");
                _builder.newLine();
                {
                  boolean _or_5 = false;
                  String _CppType_35 = attr_8.CppType();
                  boolean _equals_64 = Objects.equal(_CppType_35, "EntityRef");
                  if (_equals_64) {
                    _or_5 = true;
                  } else {
                    String _CppType_36 = attr_8.CppType();
                    boolean _equals_65 = Objects.equal(_CppType_36, "string");
                    _or_5 = _equals_65;
                  }
                  if (_or_5) {
                    _builder.append("\t\t");
                    _builder.append("row->set");
                    String _UpperCaseName_113 = attr_8.UpperCaseName();
                    _builder.append(_UpperCaseName_113, "\t\t");
                    _builder.append("(");
                    String _SimpleCppType_41 = attr_8.SimpleCppType();
                    _builder.append(_SimpleCppType_41, "\t\t");
                    _builder.append("(");
                    String _name_453 = attr_8.getName();
                    _builder.append(_name_453, "\t\t");
                    _builder.append("));");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _CppType_37 = attr_8.CppType();
                    boolean _equals_66 = Objects.equal(_CppType_37, "long long");
                    if (_equals_66) {
                      _builder.append("\t\t");
                      _builder.append("row->set");
                      String _UpperCaseName_114 = attr_8.UpperCaseName();
                      _builder.append(_UpperCaseName_114, "\t\t");
                      _builder.append("(* ");
                      String _name_454 = attr_8.getName();
                      _builder.append(_name_454, "\t\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t\t");
                      _builder.append("row->set");
                      String _UpperCaseName_115 = attr_8.UpperCaseName();
                      _builder.append(_UpperCaseName_115, "\t\t");
                      _builder.append("(");
                      String _SimpleCppType_42 = attr_8.SimpleCppType();
                      _builder.append(_SimpleCppType_42, "\t\t");
                      _builder.append("(* ");
                      String _name_455 = attr_8.getName();
                      _builder.append(_name_455, "\t\t");
                      _builder.append(" ");
                      {
                        String _SimpleCppType_43 = attr_8.SimpleCppType();
                        boolean _equals_67 = Objects.equal(_SimpleCppType_43, "Tag");
                        if (_equals_67) {
                          _builder.append(", ");
                          String _CppTagType_10 = attr_8.CppTagType();
                          _builder.append(_CppTagType_10, "\t\t");
                        }
                      }
                      _builder.append("));");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return 0;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.newLine();
            _builder.append("// -------------------------------------------");
            _builder.newLine();
            _builder.append("/**");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Get the optional parameter ");
            String _name_456 = attr_8.getName();
            _builder.append(_name_456, " ");
            _builder.append(", in a row of the ");
            String _name_457 = table.getName();
            _builder.append(_name_457, " ");
            _builder.append(" table, given a key");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.newLine();
            _builder.append("#define sdm_get");
            String _name_458 = table.getName();
            _builder.append(_name_458, "");
            String _UpperCaseName_116 = attr_8.UpperCaseName();
            _builder.append(_UpperCaseName_116, "");
            _builder.append("  sdm_get");
            String _ToLowerCase_4 = table.ToLowerCase();
            _builder.append(_ToLowerCase_4, "");
            String _ToLowerCase_5 = attr_8.ToLowerCase();
            _builder.append(_ToLowerCase_5, "");
            _builder.append("_");
            _builder.newLineIfNotEmpty();
            _builder.append("extern \"C\" int sdm_get");
            String _name_459 = table.getName();
            _builder.append(_name_459, "");
            String _UpperCaseName_117 = attr_8.UpperCaseName();
            _builder.append(_UpperCaseName_117, "");
            _builder.append("(");
            String _KeyCTypeList_4 = table.KeyCTypeList();
            _builder.append(_KeyCTypeList_4, "");
            _builder.append(", ");
            String _CTypeAttributeDimList_4 = attr_8.CTypeAttributeDimList();
            _builder.append(_CTypeAttributeDimList_4, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.append("int sdm_get");
            String _name_460 = table.getName();
            _builder.append(_name_460, "");
            String _UpperCaseName_118 = attr_8.UpperCaseName();
            _builder.append(_UpperCaseName_118, "");
            _builder.append("(");
            String _KeyCTypeList_5 = table.KeyCTypeList();
            _builder.append(_KeyCTypeList_5, "");
            _builder.append(", ");
            String _CTypeAttributeDimList_5 = attr_8.CTypeAttributeDimList();
            _builder.append(_CTypeAttributeDimList_5, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("if (dataset==0) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("cout<<\"No dataset initialized\"<<endl;");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return -1;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            String _name_461 = table.getName();
            _builder.append(_name_461, "\t");
            _builder.append("Table &table = dataset->get");
            String _name_462 = table.getName();
            _builder.append(_name_462, "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _name_463 = table.getName();
            _builder.append(_name_463, "\t");
            _builder.append("Row *row = 0;");
            _builder.newLineIfNotEmpty();
            {
              boolean _isArrayTimeIntervalKey_3 = table.isArrayTimeIntervalKey();
              if (_isArrayTimeIntervalKey_3) {
                _builder.append("\t");
                _builder.append("if (*(timeInterval+1)>0)  ");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("row = table.getRowByKey(");
                String _KeyCppFromCList_5 = table.KeyCppFromCList();
                _builder.append(_KeyCppFromCList_5, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("else");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("row = table.getRowByKey(");
                String _KeyCppFromCListWithoutInterval_2 = table.KeyCppFromCListWithoutInterval();
                _builder.append(_KeyCppFromCListWithoutInterval_2, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("row = table.getRowByKey(");
                String _KeyCppFromCList_6 = table.KeyCppFromCList();
                _builder.append(_KeyCppFromCList_6, "\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("if (row==0) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return -1;     // No row corresponding to the key");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("} else {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("if (row->is");
            String _UpperCaseName_119 = attr_8.UpperCaseName();
            _builder.append(_UpperCaseName_119, "\t\t");
            _builder.append("Exists()) {");
            _builder.newLineIfNotEmpty();
            {
              boolean _isArray_7 = attr_8.isArray();
              boolean _not_10 = (!_isArray_7);
              if (_not_10) {
                {
                  boolean _isCppStandard_10 = attr_8.isCppStandard();
                  if (_isCppStandard_10) {
                    _builder.append("\t\t\t");
                    _builder.append("*");
                    String _name_464 = attr_8.getName();
                    _builder.append(_name_464, "\t\t\t");
                    _builder.append(" = row->get");
                    String _UpperCaseName_120 = attr_8.UpperCaseName();
                    _builder.append(_UpperCaseName_120, "\t\t\t");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _CppType_38 = attr_8.CppType();
                    boolean _equals_68 = Objects.equal(_CppType_38, "Tag");
                    if (_equals_68) {
                      _builder.append("\t\t\t");
                      _builder.append("// *");
                      String _name_465 = attr_8.getName();
                      _builder.append(_name_465, "\t\t\t");
                      _builder.append(" = atoi((row->get");
                      String _UpperCaseName_121 = attr_8.UpperCaseName();
                      _builder.append(_UpperCaseName_121, "\t\t\t");
                      _builder.append("().getId()).c_str());");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t");
                      _builder.append("*");
                      String _name_466 = attr_8.getName();
                      _builder.append(_name_466, "\t\t\t");
                      _builder.append(" = row->get");
                      String _UpperCaseName_122 = attr_8.UpperCaseName();
                      _builder.append(_UpperCaseName_122, "\t\t\t");
                      _builder.append("().getTagValue();");
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _CppType_39 = attr_8.CppType();
                      boolean _equals_69 = Objects.equal(_CppType_39, "string");
                      if (_equals_69) {
                        _builder.append("\t\t\t");
                        _builder.append("if ((int)row->get");
                        String _UpperCaseName_123 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_123, "\t\t\t");
                        _builder.append("().size()<");
                        String _name_467 = attr_8.getName();
                        _builder.append(_name_467, "\t\t\t");
                        _builder.append("Dim[1])");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("strcpy(");
                        String _name_468 = attr_8.getName();
                        _builder.append(_name_468, "\t\t\t\t");
                        _builder.append(",row->get");
                        String _UpperCaseName_124 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_124, "\t\t\t\t");
                        _builder.append("().c_str());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("else");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("strncpy(");
                        String _name_469 = attr_8.getName();
                        _builder.append(_name_469, "\t\t\t\t");
                        _builder.append(",row->get");
                        String _UpperCaseName_125 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_125, "\t\t\t\t");
                        _builder.append("().c_str(),");
                        String _name_470 = attr_8.getName();
                        _builder.append(_name_470, "\t\t\t\t");
                        _builder.append("Dim[1]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        String _name_471 = attr_8.getName();
                        _builder.append(_name_471, "\t\t\t");
                        _builder.append("Dim[0] = (int)row->get");
                        String _UpperCaseName_126 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_126, "\t\t\t");
                        _builder.append("().size();");
                        _builder.newLineIfNotEmpty();
                      } else {
                        String _CppType_40 = attr_8.CppType();
                        boolean _equals_70 = Objects.equal(_CppType_40, "EntityRef");
                        if (_equals_70) {
                          _builder.append("\t\t\t");
                          _builder.append("strcpy(");
                          String _name_472 = attr_8.getName();
                          _builder.append(_name_472, "\t\t\t");
                          _builder.append(",row->get");
                          String _UpperCaseName_127 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_127, "\t\t\t");
                          _builder.append("().toString().c_str());");
                          _builder.newLineIfNotEmpty();
                        } else {
                          String _CppType_41 = attr_8.CppType();
                          boolean _equals_71 = Objects.equal(_CppType_41, "ArrayTime");
                          if (_equals_71) {
                            _builder.append("\t\t\t");
                            _builder.append("*");
                            String _name_473 = attr_8.getName();
                            _builder.append(_name_473, "\t\t\t");
                            _builder.append("     = row->get");
                            String _UpperCaseName_128 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_128, "\t\t\t");
                            _builder.append("().get();");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _CppType_42 = attr_8.CppType();
                            boolean _equals_72 = Objects.equal(_CppType_42, "ArrayTimeInterval");
                            if (_equals_72) {
                              _builder.append("\t\t\t");
                              _builder.append("*");
                              String _name_474 = attr_8.getName();
                              _builder.append(_name_474, "\t\t\t");
                              _builder.append("     = row->get");
                              String _UpperCaseName_129 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_129, "\t\t\t");
                              _builder.append("().getStartInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("*(");
                              String _name_475 = attr_8.getName();
                              _builder.append(_name_475, "\t\t\t");
                              _builder.append("+1) = row->get");
                              String _UpperCaseName_130 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_130, "\t\t\t");
                              _builder.append("().getDurationInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t\t");
                              _builder.append("*");
                              String _name_476 = attr_8.getName();
                              _builder.append(_name_476, "\t\t\t");
                              _builder.append(" = row->get");
                              String _UpperCaseName_131 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_131, "\t\t\t");
                              _builder.append("().get();");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("\t\t\t");
                _builder.append("// attr.CppType: ");
                String _CppType_43 = attr_8.CppType();
                _builder.append(_CppType_43, "\t\t\t");
                _builder.append(" attr.isOneD: ");
                boolean _isOneD = attr_8.isOneD();
                _builder.append(_isOneD, "\t\t\t");
                _builder.newLineIfNotEmpty();
                {
                  boolean _or_6 = false;
                  boolean _isOneD_1 = attr_8.isOneD();
                  if (_isOneD_1) {
                    _or_6 = true;
                  } else {
                    boolean _isExtrinsic_4 = attr_8.isExtrinsic();
                    _or_6 = _isExtrinsic_4;
                  }
                  if (_or_6) {
                    {
                      boolean _isCppStandard_11 = attr_8.isCppStandard();
                      if (_isCppStandard_11) {
                        _builder.append("\t\t\t");
                        _builder.append("for (int i=0; i<min((int)row->get");
                        String _UpperCaseName_132 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_132, "\t\t\t");
                        _builder.append("().size(),");
                        String _name_477 = attr_8.getName();
                        _builder.append(_name_477, "\t\t\t");
                        _builder.append("Dim[1]); i++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        String _name_478 = attr_8.getName();
                        _builder.append(_name_478, "\t\t\t\t");
                        _builder.append("[i] = row->get");
                        String _UpperCaseName_133 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_133, "\t\t\t\t");
                        _builder.append("()[i];");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        String _name_479 = attr_8.getName();
                        _builder.append(_name_479, "\t\t\t");
                        _builder.append("Dim[0] = (int)row->get");
                        String _UpperCaseName_134 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_134, "\t\t\t");
                        _builder.append("().size();  // return dimension of the ASDM table");
                        _builder.newLineIfNotEmpty();
                      } else {
                        String _SimpleCppType_44 = attr_8.SimpleCppType();
                        boolean _equals_73 = Objects.equal(_SimpleCppType_44, "Tag");
                        if (_equals_73) {
                          _builder.append("\t\t\t");
                          _builder.append("for (int i=0; i<min((int)row->get");
                          String _UpperCaseName_135 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_135, "\t\t\t");
                          _builder.append("().size(),");
                          String _name_480 = attr_8.getName();
                          _builder.append(_name_480, "\t\t\t");
                          _builder.append("Dim[1]); i++)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("// ");
                          String _name_481 = attr_8.getName();
                          _builder.append(_name_481, "\t\t\t");
                          _builder.append("[i] = atoi((row->get");
                          String _UpperCaseName_136 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_136, "\t\t\t");
                          _builder.append("()[i]).getId().c_str());");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_482 = attr_8.getName();
                          _builder.append(_name_482, "\t\t\t");
                          _builder.append("[i] = row->get");
                          String _UpperCaseName_137 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_137, "\t\t\t");
                          _builder.append("()[i].getTagValue();");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_483 = attr_8.getName();
                          _builder.append(_name_483, "\t\t\t");
                          _builder.append("Dim[0] = (int)row->get");
                          String _UpperCaseName_138 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_138, "\t\t\t");
                          _builder.append("().size();  // return dimension of the ASDM table");
                          _builder.newLineIfNotEmpty();
                        } else {
                          String _SimpleCppType_45 = attr_8.SimpleCppType();
                          boolean _equals_74 = Objects.equal(_SimpleCppType_45, "string");
                          if (_equals_74) {
                            _builder.append("\t\t\t");
                            _builder.append("int maxDimZero");
                            String _UpperCaseName_139 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_139, "\t\t\t");
                            _builder.append(" = 0;");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("for (int i=0; i<min((int)row->get");
                            String _UpperCaseName_140 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_140, "\t\t\t");
                            _builder.append("().size(),");
                            String _name_484 = attr_8.getName();
                            _builder.append(_name_484, "\t\t\t");
                            _builder.append("Dim[3]); i++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("if ((int)row->get");
                            String _UpperCaseName_141 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_141, "\t\t\t\t");
                            _builder.append("()[i].size()<");
                            String _name_485 = attr_8.getName();
                            _builder.append(_name_485, "\t\t\t\t");
                            _builder.append("Dim[1])");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t\t");
                            _builder.append("strcpy(");
                            String _name_486 = attr_8.getName();
                            _builder.append(_name_486, "\t\t\t\t\t");
                            _builder.append("+i*");
                            String _name_487 = attr_8.getName();
                            _builder.append(_name_487, "\t\t\t\t\t");
                            _builder.append("Dim[1],row->get");
                            String _UpperCaseName_142 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_142, "\t\t\t\t\t");
                            _builder.append("()[i].c_str());");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("else");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("\t\t");
                            _builder.append("strncpy(");
                            String _name_488 = attr_8.getName();
                            _builder.append(_name_488, "\t\t\t\t\t");
                            _builder.append("+i*");
                            String _name_489 = attr_8.getName();
                            _builder.append(_name_489, "\t\t\t\t\t");
                            _builder.append("Dim[1],row->get");
                            String _UpperCaseName_143 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_143, "\t\t\t\t\t");
                            _builder.append("()[i].c_str(),");
                            String _name_490 = attr_8.getName();
                            _builder.append(_name_490, "\t\t\t\t\t");
                            _builder.append("Dim[1]);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("maxDimZero");
                            String _UpperCaseName_144 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_144, "\t\t\t\t");
                            _builder.append(" = max((int)row->get");
                            String _UpperCaseName_145 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_145, "\t\t\t\t");
                            _builder.append("()[i].size(),maxDimZero");
                            String _UpperCaseName_146 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_146, "\t\t\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            String _name_491 = attr_8.getName();
                            _builder.append(_name_491, "\t\t\t");
                            _builder.append("Dim[0] = maxDimZero");
                            String _UpperCaseName_147 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_147, "\t\t\t");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            String _name_492 = attr_8.getName();
                            _builder.append(_name_492, "\t\t\t");
                            _builder.append("Dim[2] = row->get");
                            String _UpperCaseName_148 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_148, "\t\t\t");
                            _builder.append("().size();  // number of strings");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _SimpleCppType_46 = attr_8.SimpleCppType();
                            boolean _equals_75 = Objects.equal(_SimpleCppType_46, "ArrayTimeInterval");
                            if (_equals_75) {
                              _builder.append("\t\t\t");
                              _builder.append("for (int i=0; i<min((int)row->get");
                              String _UpperCaseName_149 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_149, "\t\t\t");
                              _builder.append("().size(),");
                              String _name_493 = attr_8.getName();
                              _builder.append(_name_493, "\t\t\t");
                              _builder.append("Dim[1]); i++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              String _name_494 = attr_8.getName();
                              _builder.append(_name_494, "\t\t\t\t");
                              _builder.append("[2*i] = row->get");
                              String _UpperCaseName_150 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_150, "\t\t\t\t");
                              _builder.append("()[i].getStartInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              String _name_495 = attr_8.getName();
                              _builder.append(_name_495, "\t\t\t\t");
                              _builder.append("[2*i+1] = row->get");
                              String _UpperCaseName_151 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_151, "\t\t\t\t");
                              _builder.append("()[i].getDurationInNanoSeconds();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              String _name_496 = attr_8.getName();
                              _builder.append(_name_496, "\t\t\t");
                              _builder.append("Dim[0] = row->get");
                              String _UpperCaseName_152 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_152, "\t\t\t");
                              _builder.append("().size(); // return dimension of the ASDM table");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t\t");
                              _builder.append("for (int i=0; i<min((int)row->get");
                              String _UpperCaseName_153 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_153, "\t\t\t");
                              _builder.append("().size(),");
                              String _name_497 = attr_8.getName();
                              _builder.append(_name_497, "\t\t\t");
                              _builder.append("Dim[1]); i++)");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              String _name_498 = attr_8.getName();
                              _builder.append(_name_498, "\t\t\t\t");
                              _builder.append("[i] = row->get");
                              String _UpperCaseName_154 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_154, "\t\t\t\t");
                              _builder.append("()[i].get();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              String _name_499 = attr_8.getName();
                              _builder.append(_name_499, "\t\t\t");
                              _builder.append("Dim[0] = row->get");
                              String _UpperCaseName_155 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_155, "\t\t\t");
                              _builder.append("().size(); // return dimension of the ASDM table");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                    _builder.append("\t\t\t");
                    _builder.newLine();
                  } else {
                    boolean _isTwoD = attr_8.isTwoD();
                    if (_isTwoD) {
                      {
                        boolean _isCppStandard_12 = attr_8.isCppStandard();
                        if (_isCppStandard_12) {
                          _builder.append("\t\t\t");
                          _builder.append("int maxDimZero");
                          String _UpperCaseName_156 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_156, "\t\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("for (int i=0;i<min((int)row->get");
                          String _UpperCaseName_157 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_157, "\t\t\t");
                          _builder.append("().size(),");
                          String _name_500 = attr_8.getName();
                          _builder.append(_name_500, "\t\t\t");
                          _builder.append("Dim[3]) ;i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("maxDimZero");
                          String _UpperCaseName_158 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_158, "\t\t\t\t");
                          _builder.append(" = max((int)row->get");
                          String _UpperCaseName_159 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_159, "\t\t\t\t");
                          _builder.append("()[i].size(),maxDimZero");
                          String _UpperCaseName_160 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_160, "\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0;j<min((int)row->get");
                          String _UpperCaseName_161 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_161, "\t\t\t\t");
                          _builder.append("()[i].size(),");
                          String _name_501 = attr_8.getName();
                          _builder.append(_name_501, "\t\t\t\t");
                          _builder.append("Dim[1]) ;j++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t");
                          String _name_502 = attr_8.getName();
                          _builder.append(_name_502, "\t\t\t\t\t");
                          _builder.append("[i*");
                          String _name_503 = attr_8.getName();
                          _builder.append(_name_503, "\t\t\t\t\t");
                          _builder.append("Dim[1]+j]= row->get");
                          String _UpperCaseName_162 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_162, "\t\t\t\t\t");
                          _builder.append("()[i][j];");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          String _name_504 = attr_8.getName();
                          _builder.append(_name_504, "\t\t\t");
                          _builder.append("Dim[0] = maxDimZero");
                          String _UpperCaseName_163 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_163, "\t\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_505 = attr_8.getName();
                          _builder.append(_name_505, "\t\t\t");
                          _builder.append("Dim[2] = row->get");
                          String _UpperCaseName_164 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_164, "\t\t\t");
                          _builder.append("().size();  // return dimension of the ASDM table");
                          _builder.newLineIfNotEmpty();
                        } else {
                          String _SimpleCppType_47 = attr_8.SimpleCppType();
                          boolean _equals_76 = Objects.equal(_SimpleCppType_47, "Tag");
                          if (_equals_76) {
                            _builder.append("\t\t\t");
                            _builder.append("int maxDimZero");
                            String _UpperCaseName_165 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_165, "\t\t\t");
                            _builder.append(" = 0;");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("for (int i=0; i<min((int)row->get");
                            String _UpperCaseName_166 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_166, "\t\t\t");
                            _builder.append("().size(),");
                            String _name_506 = attr_8.getName();
                            _builder.append(_name_506, "\t\t\t");
                            _builder.append("Dim[3]); i++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("maxDimZero");
                            String _UpperCaseName_167 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_167, "\t\t\t\t");
                            _builder.append(" = max((int)row->get");
                            String _UpperCaseName_168 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_168, "\t\t\t\t");
                            _builder.append("()[i].size(),maxDimZero");
                            String _UpperCaseName_169 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_169, "\t\t\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("for (int j=0; j<min((int)row->get");
                            String _UpperCaseName_170 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_170, "\t\t\t\t");
                            _builder.append("()[i].size(),");
                            String _name_507 = attr_8.getName();
                            _builder.append(_name_507, "\t\t\t\t");
                            _builder.append("Dim[1]) ;j++) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t\t");
                            _builder.append("// ");
                            String _name_508 = attr_8.getName();
                            _builder.append(_name_508, "\t\t\t\t\t");
                            _builder.append("[i*");
                            String _name_509 = attr_8.getName();
                            _builder.append(_name_509, "\t\t\t\t\t");
                            _builder.append("Dim[0]+j] = atoi((row->get");
                            String _UpperCaseName_171 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_171, "\t\t\t\t\t");
                            _builder.append("()[i][j]).getId().c_str());");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t\t");
                            String _name_510 = attr_8.getName();
                            _builder.append(_name_510, "\t\t\t\t\t");
                            _builder.append("[i*");
                            String _name_511 = attr_8.getName();
                            _builder.append(_name_511, "\t\t\t\t\t");
                            _builder.append("Dim[0]+j] = row->get");
                            String _UpperCaseName_172 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_172, "\t\t\t\t\t");
                            _builder.append("()[i][j].getTagValue();");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            String _name_512 = attr_8.getName();
                            _builder.append(_name_512, "\t\t\t");
                            _builder.append("Dim[0] = maxDimZero");
                            String _UpperCaseName_173 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_173, "\t\t\t");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            String _name_513 = attr_8.getName();
                            _builder.append(_name_513, "\t\t\t");
                            _builder.append("Dim[2] = row->get");
                            String _UpperCaseName_174 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_174, "\t\t\t");
                            _builder.append("().size();  // return dimension of the ASDM table");
                            _builder.newLineIfNotEmpty();
                          } else {
                            String _SimpleCppType_48 = attr_8.SimpleCppType();
                            boolean _equals_77 = Objects.equal(_SimpleCppType_48, "string");
                            if (_equals_77) {
                              _builder.append("\t\t\t");
                              _builder.append("int maxDimTwo");
                              String _UpperCaseName_175 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_175, "\t\t\t");
                              _builder.append(" = 0;");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("int maxDimZero");
                              String _UpperCaseName_176 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_176, "\t\t\t");
                              _builder.append(" = 0;");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("for (int i=0; i< min((int)row->get");
                              String _UpperCaseName_177 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_177, "\t\t\t");
                              _builder.append("().size(),");
                              String _name_514 = attr_8.getName();
                              _builder.append(_name_514, "\t\t\t");
                              _builder.append("Dim[5]) ;i++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("maxDimTwo");
                              String _UpperCaseName_178 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_178, "\t\t\t\t");
                              _builder.append(" = max((int)row->get");
                              String _UpperCaseName_179 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_179, "\t\t\t\t");
                              _builder.append("()[i].size(),maxDimTwo");
                              String _UpperCaseName_180 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_180, "\t\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("for (int j=0; j< min((int)row->get");
                              String _UpperCaseName_181 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_181, "\t\t\t\t");
                              _builder.append("()[i].size(),");
                              String _name_515 = attr_8.getName();
                              _builder.append(_name_515, "\t\t\t\t");
                              _builder.append("Dim[3]) ;j++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t\t");
                              _builder.append("if ((int)row->get");
                              String _UpperCaseName_182 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_182, "\t\t\t\t\t");
                              _builder.append("()[i][j].size()>");
                              String _name_516 = attr_8.getName();
                              _builder.append(_name_516, "\t\t\t\t\t");
                              _builder.append("Dim[1])");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t\t\t");
                              _builder.append("strcpy(");
                              String _name_517 = attr_8.getName();
                              _builder.append(_name_517, "\t\t\t\t\t\t");
                              _builder.append("+(i*");
                              String _name_518 = attr_8.getName();
                              _builder.append(_name_518, "\t\t\t\t\t\t");
                              _builder.append("Dim[3]+j)*");
                              String _name_519 = attr_8.getName();
                              _builder.append(_name_519, "\t\t\t\t\t\t");
                              _builder.append("Dim[1],row->get");
                              String _UpperCaseName_183 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_183, "\t\t\t\t\t\t");
                              _builder.append("()[i][j].c_str());");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t\t");
                              _builder.append("else");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              _builder.append("\t\t\t");
                              _builder.append("strncpy(");
                              String _name_520 = attr_8.getName();
                              _builder.append(_name_520, "\t\t\t\t\t\t");
                              _builder.append("+(i*");
                              String _name_521 = attr_8.getName();
                              _builder.append(_name_521, "\t\t\t\t\t\t");
                              _builder.append("Dim[3]+j)*");
                              String _name_522 = attr_8.getName();
                              _builder.append(_name_522, "\t\t\t\t\t\t");
                              _builder.append("Dim[1],row->get");
                              String _UpperCaseName_184 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_184, "\t\t\t\t\t\t");
                              _builder.append("()[i][j].c_str(),");
                              String _name_523 = attr_8.getName();
                              _builder.append(_name_523, "\t\t\t\t\t\t");
                              _builder.append("Dim[1]);");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t\t");
                              _builder.append("maxDimZero");
                              String _UpperCaseName_185 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_185, "\t\t\t\t\t");
                              _builder.append(" = max((int)row->get");
                              String _UpperCaseName_186 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_186, "\t\t\t\t\t");
                              _builder.append("()[i][j].size(),maxDimZero");
                              String _UpperCaseName_187 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_187, "\t\t\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              String _name_524 = attr_8.getName();
                              _builder.append(_name_524, "\t\t\t");
                              _builder.append("Dim[0] = maxDimZero");
                              String _UpperCaseName_188 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_188, "\t\t\t");
                              _builder.append(";");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              String _name_525 = attr_8.getName();
                              _builder.append(_name_525, "\t\t\t");
                              _builder.append("Dim[2] = maxDimTwo");
                              String _UpperCaseName_189 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_189, "\t\t\t");
                              _builder.append(";");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              String _name_526 = attr_8.getName();
                              _builder.append(_name_526, "\t\t\t");
                              _builder.append("Dim[4] = row->get");
                              String _UpperCaseName_190 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_190, "\t\t\t");
                              _builder.append("().size();  // return dimension of the ASDM table");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t\t");
                              _builder.append("int maxDimZero");
                              String _UpperCaseName_191 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_191, "\t\t\t");
                              _builder.append(" = 0;");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("for (int i=0; i< min((int)row->get");
                              String _UpperCaseName_192 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_192, "\t\t\t");
                              _builder.append("().size(),");
                              String _name_527 = attr_8.getName();
                              _builder.append(_name_527, "\t\t\t");
                              _builder.append("Dim[3]) ;i++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("maxDimZero");
                              String _UpperCaseName_193 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_193, "\t\t\t\t");
                              _builder.append(" = max((int)row->get");
                              String _UpperCaseName_194 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_194, "\t\t\t\t");
                              _builder.append("()[i].size(),maxDimZero");
                              String _UpperCaseName_195 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_195, "\t\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("for (int j=0; j<min((int)row->get");
                              String _UpperCaseName_196 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_196, "\t\t\t\t");
                              _builder.append("()[i].size(),");
                              String _name_528 = attr_8.getName();
                              _builder.append(_name_528, "\t\t\t\t");
                              _builder.append("Dim[1]) ;j++) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t\t");
                              String _name_529 = attr_8.getName();
                              _builder.append(_name_529, "\t\t\t\t\t");
                              _builder.append("[i*");
                              String _name_530 = attr_8.getName();
                              _builder.append(_name_530, "\t\t\t\t\t");
                              _builder.append("Dim[1]+j] = row->get");
                              String _UpperCaseName_197 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_197, "\t\t\t\t\t");
                              _builder.append("()[i][j].get();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              _builder.append("}");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              String _name_531 = attr_8.getName();
                              _builder.append(_name_531, "\t\t\t");
                              _builder.append("Dim[0] = maxDimZero");
                              String _UpperCaseName_198 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_198, "\t\t\t");
                              _builder.append(";");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              String _name_532 = attr_8.getName();
                              _builder.append(_name_532, "\t\t\t");
                              _builder.append("Dim[2] = row->get");
                              String _UpperCaseName_199 = attr_8.UpperCaseName();
                              _builder.append(_UpperCaseName_199, "\t\t\t");
                              _builder.append("().size();  // return dimension of the ASDM table");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                      _builder.newLine();
                    } else {
                      boolean _isThreeD = attr_8.isThreeD();
                      if (_isThreeD) {
                        _builder.append("\t\t\t");
                        _builder.append("int maxDimTwo");
                        String _UpperCaseName_200 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_200, "\t\t\t");
                        _builder.append(" = 0;");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("int maxDimZero");
                        String _UpperCaseName_201 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_201, "\t\t\t");
                        _builder.append(" = 0;");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("for (int i=0; i<  min((int)row->get");
                        String _UpperCaseName_202 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_202, "\t\t\t");
                        _builder.append("().size(),");
                        String _name_533 = attr_8.getName();
                        _builder.append(_name_533, "\t\t\t");
                        _builder.append("Dim[5]) ;i++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("maxDimTwo");
                        String _UpperCaseName_203 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_203, "\t\t\t\t");
                        _builder.append(" = max((int)row->get");
                        String _UpperCaseName_204 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_204, "\t\t\t\t");
                        _builder.append("()[i].size(),maxDimTwo");
                        String _UpperCaseName_205 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_205, "\t\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("for (int j=0;j< min((int)row->get");
                        String _UpperCaseName_206 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_206, "\t\t\t\t");
                        _builder.append("()[i].size(),");
                        String _name_534 = attr_8.getName();
                        _builder.append(_name_534, "\t\t\t\t");
                        _builder.append("Dim[3]) ;j++) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t\t");
                        _builder.append("maxDimZero");
                        String _UpperCaseName_207 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_207, "\t\t\t\t\t");
                        _builder.append(" = max((int)row->get");
                        String _UpperCaseName_208 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_208, "\t\t\t\t\t");
                        _builder.append("()[i][j].size(),maxDimZero");
                        String _UpperCaseName_209 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_209, "\t\t\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t\t");
                        _builder.append("for (int k=0; k< min((int)row->get");
                        String _UpperCaseName_210 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_210, "\t\t\t\t\t");
                        _builder.append("()[i][j].size(),");
                        String _name_535 = attr_8.getName();
                        _builder.append(_name_535, "\t\t\t\t\t");
                        _builder.append("Dim[1]) ;k++) {");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isCppStandard_13 = attr_8.isCppStandard();
                          if (_isCppStandard_13) {
                            _builder.append("\t\t\t");
                            _builder.append("\t\t\t");
                            String _name_536 = attr_8.getName();
                            _builder.append(_name_536, "\t\t\t\t\t\t");
                            _builder.append("[(i*");
                            String _name_537 = attr_8.getName();
                            _builder.append(_name_537, "\t\t\t\t\t\t");
                            _builder.append("Dim[3]+j)*");
                            String _name_538 = attr_8.getName();
                            _builder.append(_name_538, "\t\t\t\t\t\t");
                            _builder.append("Dim[1]+k]= row->get");
                            String _UpperCaseName_211 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_211, "\t\t\t\t\t\t");
                            _builder.append("()[i][j][k];");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t\t\t");
                            _builder.append("\t\t\t");
                            String _name_539 = attr_8.getName();
                            _builder.append(_name_539, "\t\t\t\t\t\t");
                            _builder.append("[(i*");
                            String _name_540 = attr_8.getName();
                            _builder.append(_name_540, "\t\t\t\t\t\t");
                            _builder.append("Dim[3]+j)*");
                            String _name_541 = attr_8.getName();
                            _builder.append(_name_541, "\t\t\t\t\t\t");
                            _builder.append("Dim[1]+k]= row->get");
                            String _UpperCaseName_212 = attr_8.UpperCaseName();
                            _builder.append(_UpperCaseName_212, "\t\t\t\t\t\t");
                            _builder.append("()[i][j][k].get();");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        _builder.append("\t\t\t");
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        String _name_542 = attr_8.getName();
                        _builder.append(_name_542, "\t\t\t");
                        _builder.append("Dim[0] = maxDimZero");
                        String _UpperCaseName_213 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_213, "\t\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        String _name_543 = attr_8.getName();
                        _builder.append(_name_543, "\t\t\t");
                        _builder.append("Dim[2] = maxDimTwo");
                        String _UpperCaseName_214 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_214, "\t\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        String _name_544 = attr_8.getName();
                        _builder.append(_name_544, "\t\t\t");
                        _builder.append("Dim[4] = row->get");
                        String _UpperCaseName_215 = attr_8.UpperCaseName();
                        _builder.append(_UpperCaseName_215, "\t\t\t");
                        _builder.append("().size();  // return dimension of the ASDM table");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.newLine();
                      } else {
                        boolean _isFourD = attr_8.isFourD();
                        if (_isFourD) {
                          _builder.append("\t\t\t");
                          _builder.append("int maxDimFour");
                          String _UpperCaseName_216 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_216, "\t\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("int maxDimTwo");
                          String _UpperCaseName_217 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_217, "\t\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("int maxDimZero");
                          String _UpperCaseName_218 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_218, "\t\t\t");
                          _builder.append(" = 0;");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("for (int i=0; i<  min((int)row->get");
                          String _UpperCaseName_219 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_219, "\t\t\t");
                          _builder.append("().size(),");
                          String _name_545 = attr_8.getName();
                          _builder.append(_name_545, "\t\t\t");
                          _builder.append("Dim[7]) ;i++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("maxDimFour");
                          String _UpperCaseName_220 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_220, "\t\t\t\t");
                          _builder.append(" = max((int)row->get");
                          String _UpperCaseName_221 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_221, "\t\t\t\t");
                          _builder.append("()[i].size(),maxDimFour");
                          String _UpperCaseName_222 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_222, "\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("for (int j=0;j< min((int)row->get");
                          String _UpperCaseName_223 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_223, "\t\t\t\t");
                          _builder.append("()[i].size(),");
                          String _name_546 = attr_8.getName();
                          _builder.append(_name_546, "\t\t\t\t");
                          _builder.append("Dim[5]) ;j++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t");
                          _builder.append("maxDimTwo");
                          String _UpperCaseName_224 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_224, "\t\t\t\t\t");
                          _builder.append(" = max((int)row->get");
                          String _UpperCaseName_225 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_225, "\t\t\t\t\t");
                          _builder.append("()[i][j].size(),maxDimTwo");
                          String _UpperCaseName_226 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_226, "\t\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t");
                          _builder.append("for (int k=0; k< min((int)row->get");
                          String _UpperCaseName_227 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_227, "\t\t\t\t\t");
                          _builder.append("()[i][j].size(),");
                          String _name_547 = attr_8.getName();
                          _builder.append(_name_547, "\t\t\t\t\t");
                          _builder.append("Dim[3]) ;k++) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t\t");
                          _builder.append("maxDimZero");
                          String _UpperCaseName_228 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_228, "\t\t\t\t\t\t");
                          _builder.append(" = max((int)row->get");
                          String _UpperCaseName_229 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_229, "\t\t\t\t\t\t");
                          _builder.append("()[i][j][k].size(),maxDimZero");
                          String _UpperCaseName_230 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_230, "\t\t\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t\t");
                          _builder.append("for (int l=0; l< min((int)row->get");
                          String _UpperCaseName_231 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_231, "\t\t\t\t\t\t");
                          _builder.append("()[i][j][k].size(),");
                          String _name_548 = attr_8.getName();
                          _builder.append(_name_548, "\t\t\t\t\t\t");
                          _builder.append("Dim[1]) ;l++) ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t\t\t");
                          String _name_549 = attr_8.getName();
                          _builder.append(_name_549, "\t\t\t\t\t\t\t");
                          _builder.append("[((i*");
                          String _name_550 = attr_8.getName();
                          _builder.append(_name_550, "\t\t\t\t\t\t\t");
                          _builder.append("Dim[5]+j)*");
                          String _name_551 = attr_8.getName();
                          _builder.append(_name_551, "\t\t\t\t\t\t\t");
                          _builder.append("Dim[3]+k)*");
                          String _name_552 = attr_8.getName();
                          _builder.append(_name_552, "\t\t\t\t\t\t\t");
                          _builder.append("Dim[1]+l]= row->get");
                          String _UpperCaseName_232 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_232, "\t\t\t\t\t\t\t");
                          _builder.append("()[i][j][k][l]");
                          {
                            boolean _isCppStandard_14 = attr_8.isCppStandard();
                            boolean _not_11 = (!_isCppStandard_14);
                            if (_not_11) {
                              _builder.append(".get()");
                            }
                          }
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          String _name_553 = attr_8.getName();
                          _builder.append(_name_553, "\t\t\t");
                          _builder.append("Dim[0] = maxDimZero");
                          String _UpperCaseName_233 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_233, "\t\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_554 = attr_8.getName();
                          _builder.append(_name_554, "\t\t\t");
                          _builder.append("Dim[2] = maxDimTwo");
                          String _UpperCaseName_234 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_234, "\t\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_555 = attr_8.getName();
                          _builder.append(_name_555, "\t\t\t");
                          _builder.append("Dim[4] = maxDimFour");
                          String _UpperCaseName_235 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_235, "\t\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_556 = attr_8.getName();
                          _builder.append(_name_556, "\t\t\t");
                          _builder.append("Dim[6] = row->get");
                          String _UpperCaseName_236 = attr_8.UpperCaseName();
                          _builder.append(_UpperCaseName_236, "\t\t\t");
                          _builder.append("().size();  // return dimension of the ASDM table");
                          _builder.newLineIfNotEmpty();
                        } else {
                          _builder.append("\t\t\t");
                          _builder.append("// *** Unhandled case of >4 dimension parameter  ");
                          String _name_557 = attr_8.getName();
                          _builder.append(_name_557, "\t\t\t");
                          _builder.append(" *** ");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.append("\t\t");
            _builder.append("} else {");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("return 1; // return 1 if optional parameter is absent, but row exists.");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return 0;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    return _builder;
  }
}
