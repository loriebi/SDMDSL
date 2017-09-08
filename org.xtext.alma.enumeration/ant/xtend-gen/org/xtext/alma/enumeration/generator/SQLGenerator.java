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
public class SQLGenerator extends EnumerationAbstractGenerator {
  public void doGenerate(final EList<Resource> input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EnumerationFileSystemAccess enumFsa = ((EnumerationFileSystemAccess) fsa);
    enumFsa.setFile("src/sql/createAndPopulateEnumerations.sql");
    CharSequence _generateSQLFile = this.generateSQLFile(input);
    enumFsa.generateFile(_generateSQLFile);
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
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
  
  public CharSequence generateSQLFile(final EList<Resource> input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-- ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append("-- (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append("-- (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append("-- Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("-- Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("-- All rights reserved.");
    _builder.newLine();
    _builder.append("-- ");
    _builder.newLine();
    _builder.append("-- This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append("-- modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("-- License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append("-- version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append("-- ");
    _builder.newLine();
    _builder.append("-- This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append("-- but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append("-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append("-- Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append("-- ");
    _builder.newLine();
    _builder.append("-- You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("-- License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append("-- Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append("-- MA 02111-1307  USA");
    _builder.newLine();
    _builder.append("-- ");
    _builder.newLine();
    _builder.append("-- /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("-- // WARNING!  DO NOT MODIFY THIS FILE!                          //");
    _builder.newLine();
    _builder.append("-- //  ---------------------------------------------------------  //");
    _builder.newLine();
    _builder.append("-- // | This is generated code!  Do not modify this file.       | //");
    _builder.newLine();
    _builder.append("-- // | Any changes will be lost when the file is re-generated. | //");
    _builder.newLine();
    _builder.append("-- //  ---------------------------------------------------------  //");
    _builder.newLine();
    _builder.append("-- /////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("--");
    _builder.newLine();
    _builder.append("-- File createAndPopulateEnumerations.sql");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Resource resource : input) {
        EObject _resourceToEObject = this.resourceToEObject(resource);
        CharSequence _createAndPopulate = this.createAndPopulate(((EnumType) _resourceToEObject));
        _builder.append(_createAndPopulate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createAndPopulate(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("--");
    _builder.newLine();
    _builder.append("-----------------------------------");
    String _name = enumType.getName();
    _builder.append(_name, "");
    _builder.append("---------------------------------");
    _builder.newLineIfNotEmpty();
    _builder.append("--");
    _builder.newLine();
    _builder.append("DROP TABLE IF EXISTS ASDM_ENUM_");
    String _name_1 = enumType.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TABLE ASDM_ENUM_");
    String _name_2 = enumType.getName();
    _builder.append(_name_2, "");
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    _builder.append("ID\tNUMBER(19)\tNOT NULL,");
    _builder.newLine();
    _builder.append("NAME\t\t\tVARCHAR2(64)\tNOT NULL,");
    _builder.newLine();
    _builder.append("DESCRIPTION\t\t\tVARCHAR2(512)\tNULL,");
    _builder.newLine();
    _builder.append("PRIMARY KEY(ID)");
    _builder.newLine();
    _builder.append(");");
    _builder.newLine();
    int index = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _values = enumType.getValues();
      boolean _hasElements = false;
      for(final EObject literal : _values) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("INSERT INTO ASDM_ENUM_");
            String _name_3 = enumType.getName();
            _builder.append(_name_3, "");
            _builder.append(" (id, name) values (");
            int _plusPlus = index++;
            _builder.append(_plusPlus, "");
            _builder.append(", \"");
            String _name_4 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_4, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("INSERT INTO ASDM_ENUM_");
            String _name_5 = enumType.getName();
            _builder.append(_name_5, "");
            _builder.append(" (id, name) values (");
            int _plusPlus_1 = index++;
            _builder.append(_plusPlus_1, "");
            _builder.append(", \"");
            String _name_6 = ((EnumValue)literal).getName();
            _builder.append(_name_6, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
