package org.xtext.alma.enumeration.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.alma.enumeration.enumeration.EnumType;
import org.xtext.alma.enumeration.enumeration.EnumValue;
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma;
import org.xtext.alma.enumeration.generator.EnumerationAbstractGenerator;
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess;

@SuppressWarnings("all")
public class CPPClassGenerator extends EnumerationAbstractGenerator {
  @Override
  public void doGenerate(final EList<Resource> input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    for (final Resource resource : input) {
      this.doGenerate(resource, fsa, context);
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EnumerationFileSystemAccess enumFsa = ((EnumerationFileSystemAccess) fsa);
    EObject _resourceToEObject = this.resourceToEObject(resource);
    EnumType enumType = ((EnumType) _resourceToEObject);
    String _name = enumType.getName();
    String _plus = ("src/C" + _name);
    String _plus_1 = (_plus + ".cpp");
    enumFsa.setFile(_plus_1);
    CharSequence _generateCPPClass = this.generateCPPClass(enumType);
    enumFsa.generateFile(_generateCPPClass);
  }
  
  public EObject resourceToEObject(final Resource resource) {
    TreeIterator<EObject> _allContents = null;
    if (resource!=null) {
      _allContents=resource.getAllContents();
    }
    EObject _head = null;
    if (_allContents!=null) {
      _head=IteratorExtensions.<EObject>head(_allContents);
    }
    return _head;
  }
  
  public CharSequence generateCPPClass(final EnumType enumType) {
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
    _builder.append("*");
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
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* // WARNING!  DO NOT MODIFY THIS FILE!                          //");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* //  ---------------------------------------------------------  //");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* // | This is generated code!  Do not modify this file.       | //");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* // | Any changes will be lost when the file is re-generated. | //");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* //  ---------------------------------------------------------  //");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File C");
    String _name = enumType.getName();
    _builder.append(_name, " ");
    _builder.append(".cpp");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("#include <sstream>");
    _builder.newLine();
    _builder.append("#include <C");
    String _name_1 = enumType.getName();
    _builder.append(_name_1, "");
    _builder.append(".h>");
    _builder.newLineIfNotEmpty();
    _builder.append("#include <string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append("int C");
    String _name_2 = enumType.getName();
    _builder.append(_name_2, "");
    _builder.append("::version() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_3 = enumType.getName();
    _builder.append(_name_3, "\t");
    _builder.append("Mod::version;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("string C");
    String _name_4 = enumType.getName();
    _builder.append(_name_4, "");
    _builder.append("::revision () {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_5 = enumType.getName();
    _builder.append(_name_5, "\t");
    _builder.append("Mod::revision;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append("unsigned int C");
    String _name_6 = enumType.getName();
    _builder.append(_name_6, "");
    _builder.append("::size() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    EList<EObject> _values = enumType.getValues();
    int _size = _values.size();
    _builder.append(_size, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      EList<EObject> _values_1 = enumType.getValues();
      for(final EObject literal : _values_1) {
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("const std::string& C");
            String _name_7 = enumType.getName();
            _builder.append(_name_7, "");
            _builder.append("::s");
            String _name_8 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_8, "");
            _builder.append(" = \"");
            String _name_9 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_9, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("const std::string& C");
            String _name_10 = enumType.getName();
            _builder.append(_name_10, "");
            _builder.append("::s");
            String _name_11 = ((EnumValue)literal).getName();
            _builder.append(_name_11, "");
            _builder.append(" = \"");
            String _name_12 = ((EnumValue)literal).getName();
            _builder.append(_name_12, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("const std::vector<std::string> C");
    String _name_13 = enumType.getName();
    _builder.append(_name_13, "");
    _builder.append("::names() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("std::vector<std::string> enumSet;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<EObject> _values_2 = enumType.getValues();
      for(final EObject literal_1 : _values_2) {
        {
          if ((literal_1 instanceof EnumValueWithoutComma)) {
            _builder.append("\t");
            _builder.append("enumSet.insert(enumSet.end(), C");
            String _name_14 = enumType.getName();
            _builder.append(_name_14, "\t");
            _builder.append("::s");
            String _name_15 = ((EnumValueWithoutComma)literal_1).getName();
            _builder.append(_name_15, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_1 instanceof EnumValue)) {
            _builder.append("\t");
            _builder.append("enumSet.insert(enumSet.end(), C");
            String _name_16 = enumType.getName();
            _builder.append(_name_16, "\t");
            _builder.append("::s");
            String _name_17 = ((EnumValue)literal_1).getName();
            _builder.append(_name_17, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return enumSet;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("std::string C");
    String _name_18 = enumType.getName();
    _builder.append(_name_18, "");
    _builder.append("::name(const ");
    String _name_19 = enumType.getName();
    _builder.append(_name_19, "");
    _builder.append("Mod::");
    String _name_20 = enumType.getName();
    _builder.append(_name_20, "");
    _builder.append("& f) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("switch (f) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<EObject> _values_3 = enumType.getValues();
      for(final EObject literal_2 : _values_3) {
        {
          if ((literal_2 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            _builder.append("case ");
            String _name_21 = enumType.getName();
            _builder.append(_name_21, "\t\t");
            _builder.append("Mod::");
            String _name_22 = ((EnumValueWithoutComma)literal_2).getName();
            _builder.append(_name_22, "\t\t");
            _builder.append(":");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("return C");
            String _name_23 = enumType.getName();
            _builder.append(_name_23, "\t\t\t");
            _builder.append("::s");
            String _name_24 = ((EnumValueWithoutComma)literal_2).getName();
            _builder.append(_name_24, "\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_2 instanceof EnumValue)) {
            _builder.append("\t\t");
            _builder.append("case ");
            String _name_25 = enumType.getName();
            _builder.append(_name_25, "\t\t");
            _builder.append("Mod::");
            String _name_26 = ((EnumValue)literal_2).getName();
            _builder.append(_name_26, "\t\t");
            _builder.append(":");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("return C");
            String _name_27 = enumType.getName();
            _builder.append(_name_27, "\t\t\t");
            _builder.append("::s");
            String _name_28 = ((EnumValue)literal_2).getName();
            _builder.append(_name_28, "\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Impossible siutation but....who knows with C++ enums");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw badInt((int) f);");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    String _name_29 = enumType.getName();
    _builder.append(_name_29, "");
    _builder.append("Mod::");
    String _name_30 = enumType.getName();
    _builder.append(_name_30, "");
    _builder.append(" C");
    String _name_31 = enumType.getName();
    _builder.append(_name_31, "");
    _builder.append("::new");
    String _name_32 = enumType.getName();
    _builder.append(_name_32, "");
    _builder.append("(const std::string& name) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<EObject> _values_4 = enumType.getValues();
      for(final EObject literal_3 : _values_4) {
        {
          if ((literal_3 instanceof EnumValueWithoutComma)) {
            _builder.append("\t");
            _builder.append("if (name == C");
            String _name_33 = enumType.getName();
            _builder.append(_name_33, "\t");
            _builder.append("::s");
            String _name_34 = ((EnumValueWithoutComma)literal_3).getName();
            _builder.append(_name_34, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return ");
            String _name_35 = enumType.getName();
            _builder.append(_name_35, "\t\t");
            _builder.append("Mod::");
            String _name_36 = ((EnumValueWithoutComma)literal_3).getName();
            _builder.append(_name_36, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        {
          if ((literal_3 instanceof EnumValue)) {
            _builder.append("\t");
            _builder.append("if (name == C");
            String _name_37 = enumType.getName();
            _builder.append(_name_37, "\t");
            _builder.append("::s");
            String _name_38 = ((EnumValue)literal_3).getName();
            _builder.append(_name_38, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return ");
            String _name_39 = enumType.getName();
            _builder.append(_name_39, "\t\t");
            _builder.append("Mod::");
            String _name_40 = ((EnumValue)literal_3).getName();
            _builder.append(_name_40, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw badString(name);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    String _name_41 = enumType.getName();
    _builder.append(_name_41, "");
    _builder.append("Mod::");
    String _name_42 = enumType.getName();
    _builder.append(_name_42, "");
    _builder.append(" C");
    String _name_43 = enumType.getName();
    _builder.append(_name_43, "");
    _builder.append("::literal(const std::string& name) {");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _values_5 = enumType.getValues();
      for(final EObject literal_4 : _values_5) {
        {
          if ((literal_4 instanceof EnumValueWithoutComma)) {
            _builder.append("\t");
            _builder.append("if (name == C");
            String _name_44 = enumType.getName();
            _builder.append(_name_44, "\t");
            _builder.append("::s");
            String _name_45 = ((EnumValueWithoutComma)literal_4).getName();
            _builder.append(_name_45, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return ");
            String _name_46 = enumType.getName();
            _builder.append(_name_46, "\t\t");
            _builder.append("Mod::");
            String _name_47 = ((EnumValueWithoutComma)literal_4).getName();
            _builder.append(_name_47, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        {
          if ((literal_4 instanceof EnumValue)) {
            _builder.append("\t");
            _builder.append("if (name == C");
            String _name_48 = enumType.getName();
            _builder.append(_name_48, "\t");
            _builder.append("::s");
            String _name_49 = ((EnumValue)literal_4).getName();
            _builder.append(_name_49, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return ");
            String _name_50 = enumType.getName();
            _builder.append(_name_50, "\t\t");
            _builder.append("Mod::");
            String _name_51 = ((EnumValue)literal_4).getName();
            _builder.append(_name_51, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw badString(name);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    String _name_52 = enumType.getName();
    _builder.append(_name_52, "");
    _builder.append("Mod::");
    String _name_53 = enumType.getName();
    _builder.append(_name_53, "");
    _builder.append(" C");
    String _name_54 = enumType.getName();
    _builder.append(_name_54, "");
    _builder.append("::from_int(unsigned int i) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("vector<string> names_ = names();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (i >= names_.size()) throw badInt(i);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return new");
    String _name_55 = enumType.getName();
    _builder.append(_name_55, "\t");
    _builder.append("(names_.at(i));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("string C");
    String _name_56 = enumType.getName();
    _builder.append(_name_56, "");
    _builder.append("::badString(const string& name) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return \"\'\"+name+\"\' does not correspond to any literal in the enumeration \'");
    String _name_57 = enumType.getName();
    _builder.append(_name_57, "\t");
    _builder.append("\'.\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("string C");
    String _name_58 = enumType.getName();
    _builder.append(_name_58, "");
    _builder.append("::badInt(unsigned int i) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ostringstream oss ;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("oss << \"\'\" << i << \"\' is out of range for the enumeration \'");
    String _name_59 = enumType.getName();
    _builder.append(_name_59, "\t");
    _builder.append("\'.\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return oss.str();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace ");
    String _name_60 = enumType.getName();
    _builder.append(_name_60, "");
    _builder.append("Mod {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("std::ostream & operator << ( std::ostream & out, const ");
    String _name_61 = enumType.getName();
    _builder.append(_name_61, "\t");
    _builder.append("& value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("out << C");
    String _name_62 = enumType.getName();
    _builder.append(_name_62, "\t\t");
    _builder.append("::name(value);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return out;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("std::istream & operator >> ( std::istream & in , ");
    String _name_63 = enumType.getName();
    _builder.append(_name_63, "\t");
    _builder.append("& value ) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("in.clear();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("string s;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("in >> s;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("value = C");
    String _name_64 = enumType.getName();
    _builder.append(_name_64, "\t\t\t");
    _builder.append("::literal(s);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch (string & m) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("in.setstate(ios::failbit);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return in;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
