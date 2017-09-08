package org.xtext.alma.enumeration.generator;

import com.google.common.base.Objects;
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
public class PythonGenerator extends EnumerationAbstractGenerator {
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
    String _plus = ("src/PyDataModelEnumeration/Py" + _name);
    String _plus_1 = (_plus + "/__init__.py");
    enumFsa.setFile(_plus_1);
    CharSequence _generatePython = this.generatePython(enumType);
    enumFsa.generateFile(_generatePython);
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
  
  public String documentation(final String doc) {
    StringBuilder sb = new StringBuilder(doc);
    sb.deleteCharAt(0);
    sb.deleteCharAt(0);
    int _length = sb.length();
    int _minus = (_length - 1);
    sb.deleteCharAt(_minus);
    int _length_1 = sb.length();
    int _minus_1 = (_length_1 - 1);
    sb.deleteCharAt(_minus_1);
    return sb.toString();
  }
  
  public CharSequence generatePython(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#! /usr/bin/env python");
    _builder.newLine();
    _builder.append("# ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append("# (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append("# (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append("# Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("# Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("# All rights reserved.");
    _builder.newLine();
    _builder.append("# ");
    _builder.newLine();
    _builder.append("# This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append("# modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("# License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append("# version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append("# ");
    _builder.newLine();
    _builder.append("# This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append("# but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append("# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append("# Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append("# ");
    _builder.newLine();
    _builder.append("# You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("# License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append("# Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append("# MA 02111-1307  USA");
    _builder.newLine();
    _builder.append("# ");
    _builder.newLine();
    _builder.append("# /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("# // WARNING!  DO NOT MODIFY THIS FILE!                          //");
    _builder.newLine();
    _builder.append("# //  =========================================================  //");
    _builder.newLine();
    _builder.append("# // | This is generated code!  Do not modify this file.       | //");
    _builder.newLine();
    _builder.append("# // | Any changes will be lost when the file is re-generated. | //");
    _builder.newLine();
    _builder.append("# //  =========================================================  //");
    _builder.newLine();
    _builder.append("# /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# File __init__.py");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("from ");
    String _name = enumType.getName();
    _builder.append(_name, "");
    _builder.append("Mod import *");
    _builder.newLineIfNotEmpty();
    _builder.append("from ACSErrTypeCommon import BadParameterEx");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def fromString(stringVersionOfEnumeration):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return {");
    _builder.newLine();
    {
      EList<EObject> _values = enumType.getValues();
      for(final EObject literal : _values) {
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t\t");
            _builder.append("\'");
            String _name_1 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_1, "\t\t\t");
            _builder.append("\': ");
            String _name_2 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_2, "\t\t\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("\t\t\t");
            _builder.append("\'");
            String _name_3 = ((EnumValue)literal).getName();
            _builder.append(_name_3, "\t\t\t");
            _builder.append("\': ");
            String _name_4 = ((EnumValue)literal).getName();
            _builder.append(_name_4, "\t\t\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("}[stringVersionOfEnumeration]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("except KeyError:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("raise BadParameterEx(\'stringVersionOfEnumeration\')");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("def ");
    String _name_5 = enumType.getName();
    _builder.append(_name_5, "");
    _builder.append("Set():");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return [");
    _builder.newLine();
    {
      EList<EObject> _values_1 = enumType.getValues();
      for(final EObject literal_1 : _values_1) {
        {
          if ((literal_1 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            _builder.append("\'");
            String _name_6 = enumType.getName();
            _builder.append(_name_6, "\t\t");
            _builder.append("\',");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_1 instanceof EnumValue)) {
            _builder.append("\t\t");
            _builder.append("\'");
            String _name_7 = enumType.getName();
            _builder.append(_name_7, "\t\t");
            _builder.append("\',");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append(" \t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("Although this method could be simpler, the strings are listed explicity");
    _builder.newLine();
    _builder.append("to ensure consistency between this and other language mappings.");
    _builder.newLine();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("def toString(valueVersionOfEnumeration):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return {");
    _builder.newLine();
    {
      EList<EObject> _values_2 = enumType.getValues();
      for(final EObject literal_2 : _values_2) {
        {
          if ((literal_2 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            String _name_8 = ((EnumValueWithoutComma)literal_2).getName();
            _builder.append(_name_8, "\t\t");
            _builder.append(": \'");
            String _name_9 = ((EnumValueWithoutComma)literal_2).getName();
            _builder.append(_name_9, "\t\t");
            _builder.append("\',");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_2 instanceof EnumValue)) {
            _builder.append("\t\t");
            String _name_10 = ((EnumValue)literal_2).getName();
            _builder.append(_name_10, "\t\t");
            _builder.append(": \'");
            String _name_11 = ((EnumValue)literal_2).getName();
            _builder.append(_name_11, "\t\t");
            _builder.append("\',");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append(" \t");
    _builder.append("}[valueVersionOfEnumeration]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def hasHelp():");
    _builder.newLine();
    {
      String _docEnum = enumType.getDocEnum();
      boolean _notEquals = (!Objects.equal(_docEnum, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("return True");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("return False");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      String _docEnum_1 = enumType.getDocEnum();
      boolean _notEquals_1 = (!Objects.equal(_docEnum_1, null));
      if (_notEquals_1) {
        _builder.append("def help(valueVersionOfEnumeration):");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return {");
        _builder.newLine();
        {
          EList<EObject> _values_3 = enumType.getValues();
          for(final EObject literal_3 : _values_3) {
            {
              if ((literal_3 instanceof EnumValueWithoutComma)) {
                _builder.append("\t\t");
                String _name_12 = ((EnumValueWithoutComma)literal_3).getName();
                _builder.append(_name_12, "\t\t");
                _builder.append(": \"\"\"");
                String _doc = ((EnumValueWithoutComma)literal_3).getDoc();
                String _documentation = this.documentation(_doc);
                _builder.append(_documentation, "\t\t");
                _builder.append("\"\"\",");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              if ((literal_3 instanceof EnumValue)) {
                _builder.append("\t\t");
                String _name_13 = ((EnumValue)literal_3).getName();
                _builder.append(_name_13, "\t\t");
                _builder.append(": \"\"\"");
                String _doc_1 = ((EnumValue)literal_3).getDoc();
                String _documentation_1 = this.documentation(_doc_1);
                _builder.append(_documentation_1, "\t\t");
                _builder.append("\"\"\",");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("def hasAssociatedNumber():");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("return False");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append("def new");
    String _name_14 = enumType.getName();
    _builder.append(_name_14, "");
    _builder.append("(p):");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("if type(p) is str:");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("return fromString(p)");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("return None");
    _builder.newLine();
    return _builder;
  }
}
