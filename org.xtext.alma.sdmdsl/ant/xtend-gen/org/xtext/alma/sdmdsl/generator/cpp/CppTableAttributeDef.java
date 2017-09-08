package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CppTableAttributeDef {
  public CharSequence doGenerate(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOptional = attr.isOptional();
      if (_isOptional) {
        _builder.append("// ===> Attribute ");
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append(", which is optional");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("// ===> Attribute ");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isOptional_1 = attr.isOptional();
      if (_isOptional_1) {
        _builder.append("bool ");
        String _name_2 = attr.getName();
        _builder.append(_name_2, "");
        _builder.append("Exists;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    String _CppType = attr.CppType();
    _builder.append(_CppType, "");
    _builder.append(" ");
    String _name_3 = attr.getName();
    _builder.append(_name_3, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isAutoIncrementable = attr.isAutoIncrementable();
      if (_isAutoIncrementable) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Set ");
        String _name_4 = attr.getName();
        _builder.append(_name_4, " ");
        _builder.append(" with the specified ");
        String _CppType_1 = attr.CppType();
        _builder.append(_CppType_1, " ");
        _builder.append(" value.");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* @param ");
        String _name_5 = attr.getName();
        _builder.append(_name_5, " ");
        _builder.append(" The ");
        String _CppType_2 = attr.CppType();
        _builder.append(_CppType_2, " ");
        _builder.append(" value to which ");
        String _name_6 = attr.getName();
        _builder.append(_name_6, " ");
        _builder.append(" is to be set.");
        _builder.newLineIfNotEmpty();
        {
          boolean _isOptional_2 = attr.isOptional();
          boolean _not = (!_isOptional_2);
          if (_not) {
            {
              boolean _isKey = attr.isKey();
              if (_isKey) {
                _builder.append(" * @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.append("void set");
            String _UpperCaseName = attr.UpperCaseName();
            _builder.append(_UpperCaseName, "");
            _builder.append(" (");
            String _CppType_3 = attr.CppType();
            _builder.append(_CppType_3, "");
            _builder.append(" ");
            String _name_7 = attr.getName();
            _builder.append(_name_7, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.append("void set");
            String _UpperCaseName_1 = attr.UpperCaseName();
            _builder.append(_UpperCaseName_1, "");
            _builder.append(" (");
            String _CppType_4 = attr.CppType();
            _builder.append(_CppType_4, "");
            _builder.append(" ");
            String _name_8 = attr.getName();
            _builder.append(_name_8, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
