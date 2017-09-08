package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CppTableAttributeImpl {
  public CharSequence doGenerate(final String tableName, final String append, final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOptional = attr.isOptional();
      if (_isOptional) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* The attribute ");
        String _name = attr.getName();
        _builder.append(_name, "\t ");
        _builder.append(" is optional. Return true if this attribute exists.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return true if and only if the ");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "\t ");
        _builder.append(" attribute exists. ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("bool ");
        _builder.append(tableName, "\t");
        _builder.append(append, "\t");
        _builder.append("::is");
        String _UpperCaseName = attr.UpperCaseName();
        _builder.append(_UpperCaseName, "\t");
        _builder.append("Exists() const {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_2 = attr.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("Exists;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      boolean _isOptional_1 = attr.isOptional();
      if (_isOptional_1) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Get ");
        String _name_3 = attr.getName();
        _builder.append(_name_3, "\t ");
        _builder.append(", which is optional.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return ");
        String _name_4 = attr.getName();
        _builder.append(_name_4, "\t ");
        _builder.append(" as ");
        String _CppType = attr.CppType();
        _builder.append(_CppType, "\t ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @throw IllegalAccessException If ");
        String _name_5 = attr.getName();
        _builder.append(_name_5, "\t ");
        _builder.append(" does not exist.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t \t");
        String _CppType_1 = attr.CppType();
        _builder.append(_CppType_1, "\t \t");
        _builder.append(" ");
        _builder.append(tableName, "\t \t");
        _builder.append(append, "\t \t");
        _builder.append("::get");
        String _UpperCaseName_1 = attr.UpperCaseName();
        _builder.append(_UpperCaseName_1, "\t \t");
        _builder.append("() const  {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (!");
        String _name_6 = attr.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append("Exists) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("throw IllegalAccessException(\"");
        String _name_7 = attr.getName();
        _builder.append(_name_7, "\t\t\t");
        _builder.append("\", \"");
        _builder.append(tableName, "\t\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Get ");
        String _name_8 = attr.getName();
        _builder.append(_name_8, "\t ");
        _builder.append(".");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return ");
        String _name_9 = attr.getName();
        _builder.append(_name_9, "\t ");
        _builder.append(" as ");
        String _CppType_2 = attr.CppType();
        _builder.append(_CppType_2, "\t ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t \t");
        String _CppType_3 = attr.CppType();
        _builder.append(_CppType_3, "\t \t");
        _builder.append(" ");
        _builder.append(tableName, "\t \t");
        _builder.append(append, "\t \t");
        _builder.append("::get");
        String _UpperCaseName_2 = attr.UpperCaseName();
        _builder.append(_UpperCaseName_2, "\t \t");
        _builder.append("() const {");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  \t\t");
    _builder.append("return ");
    String _name_10 = attr.getName();
    _builder.append(_name_10, "  \t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("  \t ");
    _builder.append("* Set ");
    String _name_11 = attr.getName();
    _builder.append(_name_11, "  \t ");
    _builder.append(" with the specified ");
    String _CppType_4 = attr.CppType();
    _builder.append(_CppType_4, "  \t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t ");
    _builder.append("* @param ");
    String _name_12 = attr.getName();
    _builder.append(_name_12, "  \t ");
    _builder.append(" The ");
    String _CppType_5 = attr.CppType();
    _builder.append(_CppType_5, "  \t ");
    _builder.append(" value to which ");
    String _name_13 = attr.getName();
    _builder.append(_name_13, "  \t ");
    _builder.append(" is to be set.");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t ");
    _builder.newLine();
    {
      boolean _isOptional_2 = attr.isOptional();
      boolean _not = (!_isOptional_2);
      if (_not) {
        {
          boolean _isKey = attr.isKey();
          if (_isKey) {
            _builder.append("  \t");
            _builder.append("\t");
            _builder.append("* @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.");
            _builder.newLine();
          }
        }
        _builder.append("  \t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("  \t");
        _builder.append("void ");
        _builder.append(tableName, "  \t");
        _builder.append(append, "  \t");
        _builder.append("::set");
        String _UpperCaseName_3 = attr.UpperCaseName();
        _builder.append(_UpperCaseName_3, "  \t");
        _builder.append(" (");
        String _CppType_6 = attr.CppType();
        _builder.append(_CppType_6, "  \t");
        _builder.append(" ");
        String _name_14 = attr.getName();
        _builder.append(_name_14, "  \t");
        _builder.append(")  {");
        _builder.newLineIfNotEmpty();
        _builder.append("  \t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("  \t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("  \t");
        _builder.append("\t");
        _builder.append("if (hasBeenAdded) {");
        _builder.newLine();
        {
          boolean _isKey_1 = attr.isKey();
          if (_isKey_1) {
            _builder.append("  \t");
            _builder.append("\t");
            _builder.append("throw IllegalAccessException(\"");
            String _name_15 = attr.getName();
            _builder.append(_name_15, "  \t\t");
            _builder.append("\", \"");
            _builder.append(tableName, "  \t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("  \t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("  \t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("  \t");
        _builder.append("void ");
        _builder.append(tableName, "  \t");
        _builder.append(append, "  \t");
        _builder.append("::set");
        String _UpperCaseName_4 = attr.UpperCaseName();
        _builder.append(_UpperCaseName_4, "  \t");
        _builder.append(" (");
        String _CppType_7 = attr.CppType();
        _builder.append(_CppType_7, "  \t");
        _builder.append(" ");
        String _name_16 = attr.getName();
        _builder.append(_name_16, "  \t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  \t\t");
    _builder.append("this->");
    String _name_17 = attr.getName();
    _builder.append(_name_17, "  \t\t");
    _builder.append(" = ");
    String _name_18 = attr.getName();
    _builder.append(_name_18, "  \t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      boolean _isOptional_3 = attr.isOptional();
      if (_isOptional_3) {
        _builder.append(" \t");
        String _name_19 = attr.getName();
        _builder.append(_name_19, " \t");
        _builder.append("Exists = true;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    {
      boolean _isOptional_4 = attr.isOptional();
      if (_isOptional_4) {
        _builder.append(" \t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" \t");
        _builder.append(" ");
        _builder.append("* Mark ");
        String _name_20 = attr.getName();
        _builder.append(_name_20, " \t ");
        _builder.append(", which is an optional field, as non-existent.");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append(" \t");
        _builder.append("void ");
        _builder.append(tableName, " \t");
        _builder.append(append, " \t");
        _builder.append("::clear");
        String _UpperCaseName_5 = attr.UpperCaseName();
        _builder.append(_UpperCaseName_5, " \t");
        _builder.append(" () {");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t");
        _builder.append("\t");
        String _name_21 = attr.getName();
        _builder.append(_name_21, " \t\t");
        _builder.append("Exists = false;");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
