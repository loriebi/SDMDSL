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
public class JAVAGenerator extends EnumerationAbstractGenerator {
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
    String _plus = ("java/alma/hla/datamodel/enumeration/J" + _name);
    String _plus_1 = (_plus + ".java");
    enumFsa.setFile(_plus_1);
    CharSequence _generateJavaEnumClass = this.generateJavaEnumClass(enumType);
    enumFsa.generateFile(_generateJavaEnumClass);
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
  
  public CharSequence generateJavaEnumClass(final EnumType enumType) {
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
    _builder.append("* File J");
    String _name = enumType.getName();
    _builder.append(_name, " ");
    _builder.append(".java");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/\t\t");
    _builder.newLine();
    _builder.append("package alma.hla.datamodel.enumeration;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;");
    _builder.newLine();
    _builder.append("import alma.");
    String _name_1 = enumType.getName();
    _builder.append(_name_1, "");
    _builder.append("Mod.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.lang.reflect.Array;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* Extensions to the ");
    String _name_2 = enumType.getName();
    _builder.append(_name_2, "");
    _builder.append(" enumeration.");
    _builder.newLineIfNotEmpty();
    _builder.append("*/ ");
    _builder.newLine();
    _builder.append("public class J");
    String _name_3 = enumType.getName();
    _builder.append(_name_3, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Individual static String declarations for each enumerator.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    {
      EList<EObject> _values = enumType.getValues();
      for(final EObject literal : _values) {
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("\t");
            _builder.append("public static final String s");
            String _name_4 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_4, "\t");
            _builder.append(" = \"");
            String _name_5 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_5, "\t");
            _builder.append("\";  /*!< A string definition for ");
            String _name_6 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_6, "\t");
            _builder.append(" */");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("\t");
            _builder.append("public static final String s");
            String _name_7 = ((EnumValue)literal).getName();
            _builder.append(_name_7, "\t");
            _builder.append(" = \"");
            String _name_8 = ((EnumValue)literal).getName();
            _builder.append(_name_8, "\t");
            _builder.append("\";  /*!< A string definition for ");
            String _name_9 = ((EnumValue)literal).getName();
            _builder.append(_name_9, "\t");
            _builder.append(" */");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("private static final String[] s");
    String _name_10 = enumType.getName();
    _builder.append(_name_10, "\t");
    _builder.append("Set = {");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _values_1 = enumType.getValues();
      boolean _hasElements = false;
      for(final EObject literal_1 : _values_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t\t");
        }
        {
          if ((literal_1 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            _builder.append("s");
            String _name_11 = ((EnumValueWithoutComma)literal_1).getName();
            _builder.append(_name_11, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_1 instanceof EnumValue)) {
            _builder.append("\t\t");
            _builder.append("s");
            String _name_12 = ((EnumValue)literal_1).getName();
            _builder.append(_name_12, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Returns the version number of the enumeration ");
    String _name_13 = enumType.getName();
    _builder.append(_name_13, "\t");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static int version() { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return alma.");
    String _name_14 = enumType.getName();
    _builder.append(_name_14, "\t\t");
    _builder.append("Mod.version.value;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Returns the revision number of the enumeration ");
    String _name_15 = enumType.getName();
    _builder.append(_name_15, "\t");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String revision() { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return alma.");
    String _name_16 = enumType.getName();
    _builder.append(_name_16, "\t\t");
    _builder.append("Mod.revision.value;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Returns the number of enumerators defined in ");
    String _name_17 = enumType.getName();
    _builder.append(_name_17, "\t");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static int size() { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return s");
    String _name_18 = enumType.getName();
    _builder.append(_name_18, "\t\t");
    _builder.append("Set.length;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Return the string name associated with the specified ");
    String _name_19 = enumType.getName();
    _builder.append(_name_19, "\t");
    _builder.append("\'s enumerator.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String name(");
    String _name_20 = enumType.getName();
    _builder.append(_name_20, "\t");
    _builder.append(" f){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("switch(f.value()){");
    _builder.newLine();
    {
      EList<EObject> _values_2 = enumType.getValues();
      for(final EObject literal_2 : _values_2) {
        {
          if ((literal_2 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t\t");
            _builder.append("case ");
            String _name_21 = enumType.getName();
            _builder.append(_name_21, "\t\t\t");
            _builder.append("._");
            String _name_22 = ((EnumValueWithoutComma)literal_2).getName();
            _builder.append(_name_22, "\t\t\t");
            _builder.append(" : ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("return s");
            String _name_23 = ((EnumValueWithoutComma)literal_2).getName();
            _builder.append(_name_23, "\t\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_2 instanceof EnumValue)) {
            _builder.append("\t\t\t");
            _builder.append("case ");
            String _name_24 = enumType.getName();
            _builder.append(_name_24, "\t\t\t");
            _builder.append("._");
            String _name_25 = ((EnumValue)literal_2).getName();
            _builder.append(_name_25, "\t\t\t");
            _builder.append(" : ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("return s");
            String _name_26 = ((EnumValue)literal_2).getName();
            _builder.append(_name_26, "\t\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("* An alternate, Java-style way of getting the string name associated ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* with the specified ");
    String _name_27 = enumType.getName();
    _builder.append(_name_27, "\t");
    _builder.append("\'s enumerator.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String toString(");
    String _name_28 = enumType.getName();
    _builder.append(_name_28, "\t");
    _builder.append(" f) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return name(f);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Return an array of all the enumerators as strings. The strings are stored in the array in the same order");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* than the enumerators are declared in the enumeration.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String[] names() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return s");
    String _name_29 = enumType.getName();
    _builder.append(_name_29, "\t\t");
    _builder.append("Set;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Returns a ");
    String _name_30 = enumType.getName();
    _builder.append(_name_30, "\t");
    _builder.append("\'s enumerator by specifying its name.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _name_31 = enumType.getName();
    _builder.append(_name_31, "\t");
    _builder.append(" literal(String name) throws AcsJBadParameterEx {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<EObject> _values_3 = enumType.getValues();
      for(final EObject literal_3 : _values_3) {
        {
          if ((literal_3 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            _builder.append("if(name.equals(s");
            String _name_32 = ((EnumValueWithoutComma)literal_3).getName();
            _builder.append(_name_32, "\t\t");
            _builder.append(")) return ");
            String _name_33 = enumType.getName();
            _builder.append(_name_33, "\t\t");
            _builder.append(".from_int(");
            String _name_34 = enumType.getName();
            _builder.append(_name_34, "\t\t");
            _builder.append("._");
            String _name_35 = ((EnumValueWithoutComma)literal_3).getName();
            _builder.append(_name_35, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_3 instanceof EnumValue)) {
            _builder.append("\t\t");
            _builder.append("if(name.equals(s");
            String _name_36 = ((EnumValue)literal_3).getName();
            _builder.append(_name_36, "\t\t");
            _builder.append(")) return ");
            String _name_37 = enumType.getName();
            _builder.append(_name_37, "\t\t");
            _builder.append(".from_int(");
            String _name_38 = enumType.getName();
            _builder.append(_name_38, "\t\t");
            _builder.append("._");
            String _name_39 = ((EnumValue)literal_3).getName();
            _builder.append(_name_39, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new AcsJBadParameterEx();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Create a ");
    String _name_40 = enumType.getName();
    _builder.append(_name_40, "\t");
    _builder.append(" enumeration object by specifying its name");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _name_41 = enumType.getName();
    _builder.append(_name_41, "\t");
    _builder.append(" new");
    String _name_42 = enumType.getName();
    _builder.append(_name_42, "\t");
    _builder.append("(String name) throws AcsJBadParameterEx {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<EObject> _values_4 = enumType.getValues();
      for(final EObject literal_4 : _values_4) {
        {
          if ((literal_4 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            _builder.append("if(name.equals(s");
            String _name_43 = ((EnumValueWithoutComma)literal_4).getName();
            _builder.append(_name_43, "\t\t");
            _builder.append(")) return ");
            String _name_44 = enumType.getName();
            _builder.append(_name_44, "\t\t");
            _builder.append(".from_int(");
            String _name_45 = enumType.getName();
            _builder.append(_name_45, "\t\t");
            _builder.append("._");
            String _name_46 = ((EnumValueWithoutComma)literal_4).getName();
            _builder.append(_name_46, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_4 instanceof EnumValue)) {
            _builder.append("\t\t");
            _builder.append("if(name.equals(s");
            String _name_47 = ((EnumValue)literal_4).getName();
            _builder.append(_name_47, "\t\t");
            _builder.append(")) return ");
            String _name_48 = enumType.getName();
            _builder.append(_name_48, "\t\t");
            _builder.append(".from_int(");
            String _name_49 = enumType.getName();
            _builder.append(_name_49, "\t\t");
            _builder.append("._");
            String _name_50 = ((EnumValue)literal_4).getName();
            _builder.append(_name_50, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new AcsJBadParameterEx();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @parameter a an Object which is expected to be an array whose base type is ");
    String _name_51 = enumType.getName();
    _builder.append(_name_51, "\t ");
    _builder.append(". ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @parameter value an instance of ");
    String _name_52 = enumType.getName();
    _builder.append(_name_52, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @returns a with all its elements set to value.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static public Object setArray(Object a, ");
    String _name_53 = enumType.getName();
    _builder.append(_name_53, "\t");
    _builder.append(" value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if ( a == null )  return (Object) value;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String aCName = a.getClass().getName();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println( aCName);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (aCName.charAt(0) == \'[\') {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Yes a is an array.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("for (int i = 0; i < Array.getLength(a); i++)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Array.set(a, i, setArray( Array.get(a, i), value));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// No a is a scalar");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("a =  value;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return a;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
