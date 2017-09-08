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
public class F90Generator extends EnumerationAbstractGenerator {
  public void doGenerate(final EList<Resource> input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EnumerationFileSystemAccess enumFsa = ((EnumerationFileSystemAccess) fsa);
    enumFsa.setFile("src/sdm_enumerations.f90");
    CharSequence _generateF90File = this.generateF90File(input);
    enumFsa.generateFile(_generateF90File);
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
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
  
  public CharSequence generateF90File(final EList<Resource> input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!");
    _builder.newLine();
    _builder.append("!  ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append("!  (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append("!  (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append("!  Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("!  Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("!  All rights reserved.");
    _builder.newLine();
    _builder.append("!  ");
    _builder.newLine();
    _builder.append("!  This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append("!  modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("!  License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append("!  version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append("!  ");
    _builder.newLine();
    _builder.append("!  This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append("!  but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append("!  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append("!  Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append("!  ");
    _builder.newLine();
    _builder.append("!  You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("!  License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append("!  Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append("!  MA 02111-1307  USA");
    _builder.newLine();
    _builder.append("!  ");
    _builder.newLine();
    _builder.append("!  /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("!  // WARNING!  DO NOT MODIFY THIS FILE!                          //");
    _builder.newLine();
    _builder.append("!  //  ---------------------------------------------------------  //");
    _builder.newLine();
    _builder.append("!  // | This is generated code!  Do not modify this file.       | //");
    _builder.newLine();
    _builder.append("!  // | Any changes will be lost when the file is re-generated. | //");
    _builder.newLine();
    _builder.append("!  //  ---------------------------------------------------------  //");
    _builder.newLine();
    _builder.append("!  /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("! ");
    _builder.newLine();
    _builder.append("!  File sdm_enumerations.f90");
    _builder.newLine();
    _builder.append("! ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module sdm_Enumerations");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Resource resource : input) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        EObject _resourceToEObject = this.resourceToEObject(resource);
        CharSequence _generateFa = this.generateFa(((EnumType) _resourceToEObject));
        _builder.append(_generateFa, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("contains");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Resource resource_1 : input) {
        _builder.newLine();
        EObject _resourceToEObject_1 = this.resourceToEObject(resource_1);
        CharSequence _generateFb = this.generateFb(((EnumType) _resourceToEObject_1));
        _builder.append(_generateFb, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("end module sdm_Enumerations");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateFa(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    int counter = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _values = enumType.getValues();
      for(final EObject literal : _values) {
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("integer, parameter :: ");
            String _name = enumType.getName();
            _builder.append(_name, "");
            _builder.append("_");
            String _name_1 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_1, "");
            _builder.append("=");
            int _plusPlus = counter++;
            _builder.append(_plusPlus, "");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("integer, parameter :: ");
            String _name_2 = enumType.getName();
            _builder.append(_name_2, "");
            _builder.append("_");
            String _name_3 = ((EnumValue)literal).getName();
            _builder.append(_name_3, "");
            _builder.append("=");
            int _plusPlus_1 = counter++;
            _builder.append(_plusPlus_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateFb(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function ");
    String _name = enumType.getName();
    _builder.append(_name, "\t");
    _builder.append("_toString(i)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("integer :: i");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("character*80 :: ");
    String _name_1 = enumType.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("_toString");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("select case(i)");
    _builder.newLine();
    {
      EList<EObject> _values = enumType.getValues();
      for(final EObject literal : _values) {
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            _builder.append("case(");
            String _name_2 = enumType.getName();
            _builder.append(_name_2, "\t\t");
            _builder.append("_");
            String _name_3 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_3, "\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            String _name_4 = enumType.getName();
            _builder.append(_name_4, "\t\t\t");
            _builder.append("_toString = \'");
            String _name_5 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_5, "\t\t\t");
            _builder.append("\'");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("\t\t");
            _builder.append("case(");
            String _name_6 = enumType.getName();
            _builder.append(_name_6, "\t\t");
            _builder.append("_");
            String _name_7 = ((EnumValue)literal).getName();
            _builder.append(_name_7, "\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            String _name_8 = enumType.getName();
            _builder.append(_name_8, "\t\t\t");
            _builder.append("_toString = \'");
            String _name_9 = ((EnumValue)literal).getName();
            _builder.append(_name_9, "\t\t\t");
            _builder.append("\'");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("end select");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("end function ");
    String _name_10 = enumType.getName();
    _builder.append(_name_10, "\t");
    _builder.append("_toString");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function ");
    String _name_11 = enumType.getName();
    _builder.append(_name_11, "\t");
    _builder.append("_fromString(str)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("integer :: ");
    String _name_12 = enumType.getName();
    _builder.append(_name_12, "\t\t");
    _builder.append("_fromString");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("character*80 :: str");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("select case(str)");
    _builder.newLine();
    {
      EList<EObject> _values_1 = enumType.getValues();
      for(final EObject literal_1 : _values_1) {
        {
          if ((literal_1 instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            _builder.append("case(\'");
            String _name_13 = ((EnumValueWithoutComma)literal_1).getName();
            _builder.append(_name_13, "\t\t");
            _builder.append("\')");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            String _name_14 = enumType.getName();
            _builder.append(_name_14, "\t\t\t");
            _builder.append("_fromString = ");
            String _name_15 = enumType.getName();
            _builder.append(_name_15, "\t\t\t");
            _builder.append("_");
            String _name_16 = ((EnumValueWithoutComma)literal_1).getName();
            _builder.append(_name_16, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal_1 instanceof EnumValue)) {
            _builder.append("\t\t");
            _builder.append("case(\'");
            String _name_17 = ((EnumValue)literal_1).getName();
            _builder.append(_name_17, "\t\t");
            _builder.append("\')");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            String _name_18 = enumType.getName();
            _builder.append(_name_18, "\t\t\t");
            _builder.append("_fromString = ");
            String _name_19 = enumType.getName();
            _builder.append(_name_19, "\t\t\t");
            _builder.append("_");
            String _name_20 = ((EnumValue)literal_1).getName();
            _builder.append(_name_20, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("end select");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("end function ");
    String _name_21 = enumType.getName();
    _builder.append(_name_21, "\t");
    _builder.append("_fromString");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
}
