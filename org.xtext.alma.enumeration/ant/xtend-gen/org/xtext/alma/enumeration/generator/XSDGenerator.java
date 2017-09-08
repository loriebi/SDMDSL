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
public class XSDGenerator extends EnumerationAbstractGenerator {
  public void doGenerate(final EList<Resource> resources, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    for (final Resource resource : resources) {
      EObject _resourceToEObject = this.resourceToEObject(resource);
      this.generateXSDFile(((EnumType) _resourceToEObject), ((EnumerationFileSystemAccess) fsa));
    }
  }
  
  public void generateXSDFile(final EnumType enumType, final EnumerationFileSystemAccess enumFsa) {
    String _name = enumType.getName();
    String _plus = ("xsd/" + _name);
    String _plus_1 = (_plus + ".xsd");
    enumFsa.setFile(_plus_1);
    CharSequence _generateXSD = this.generateXSD(enumType);
    enumFsa.generateFile(_generateXSD);
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
  
  public CharSequence generateXSD(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
    _builder.newLine();
    _builder.append("<!--");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("(c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("(c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("All rights reserved.");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("MA 02111-1307  USA");
    _builder.newLine();
    _builder.append("   ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("/////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("// WARNING!  DO NOT MODIFY THIS FILE!                         ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("//  ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("// This is generated code!  Do not modify this file.  ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("// Any changes will be lost when the file is re-generated.");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("// ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("/////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("File ");
    String _name = enumType.getName();
    _builder.append(_name, "   ");
    _builder.append(".xsd");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("-->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" ");
    _builder.newLine();
    _builder.append("                          ");
    _builder.append("xmlns:");
    String _xmlns = enumType.getXmlns();
    _builder.append(_xmlns, "                          ");
    _builder.append("=\"http://Alma/XENUM/");
    String _name_1 = enumType.getName();
    _builder.append(_name_1, "                          ");
    _builder.append("Mod\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("                          ");
    _builder.append("targetNamespace=\"http://Alma/XENUM/");
    String _name_2 = enumType.getName();
    _builder.append(_name_2, "                          ");
    _builder.append("Mod\"");
    _builder.newLineIfNotEmpty();
    _builder.append("                          ");
    _builder.append("attributeFormDefault=\"qualified\" elementFormDefault=\"unqualified\"");
    _builder.newLine();
    _builder.append("                          ");
    _builder.append("version=\"");
    int _version = enumType.getVersion();
    _builder.append(_version, "                          ");
    _builder.append(" ");
    String _revision = enumType.getRevision();
    _builder.append(_revision, "                          ");
    _builder.append("\" >  ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.append("<xsd:simpleType name=\"");
    String _name_3 = enumType.getName();
    _builder.append(_name_3, " \t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _docEnum = enumType.getDocEnum();
    CharSequence _xsdDocumentation = this.xsdDocumentation(_docEnum);
    _builder.append(_xsdDocumentation, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<xsd:restriction base=\"xsd:NCName\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<EObject> _values = enumType.getValues();
      for(final EObject litteral : _values) {
        {
          if ((litteral instanceof EnumValueWithoutComma)) {
            _builder.append("<xsd:enumeration value=\"");
            String _name_4 = ((EnumValueWithoutComma)litteral).getName();
            _builder.append(_name_4, "");
            _builder.append("\" >\t");
            _builder.newLineIfNotEmpty();
            _builder.append(" \t");
            String _doc = ((EnumValueWithoutComma)litteral).getDoc();
            CharSequence _xsdDocumentation_1 = this.xsdDocumentation(_doc);
            _builder.append(_xsdDocumentation_1, " \t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</xsd:enumeration>");
            _builder.newLine();
          }
        }
        {
          if ((litteral instanceof EnumValue)) {
            _builder.append("<xsd:enumeration value=\"");
            String _name_5 = ((EnumValue)litteral).getName();
            _builder.append(_name_5, "");
            _builder.append("\" >\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _doc_1 = ((EnumValue)litteral).getDoc();
            CharSequence _xsdDocumentation_2 = this.xsdDocumentation(_doc_1);
            _builder.append(_xsdDocumentation_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append(" \t\t \t");
            _builder.append("</xsd:enumeration>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("</xsd:restriction>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:simpleType>");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<!--");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("Type for an item constrained by the union of enumerators.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("-->");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<xsd:simpleType name=\"");
    String _name_6 = enumType.getName();
    _builder.append(_name_6, " \t");
    _builder.append("List\">");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    _builder.append("<xsd:restriction>");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("<xsd:simpleType>");
    _builder.newLine();
    _builder.append(" \t\t\t\t");
    _builder.append("<xsd:list>");
    _builder.newLine();
    _builder.append(" \t\t\t\t\t");
    _builder.append("<xsd:simpleType>");
    _builder.newLine();
    _builder.append(" \t\t\t\t\t\t");
    _builder.append("<xsd:restriction base=\"");
    String _xmlns_1 = enumType.getXmlns();
    _builder.append(_xmlns_1, " \t\t\t\t\t\t");
    _builder.append(":");
    String _name_7 = enumType.getName();
    _builder.append(_name_7, " \t\t\t\t\t\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t\t\t\t");
    _builder.append("</xsd:simpleType>");
    _builder.newLine();
    _builder.append(" \t\t\t\t");
    _builder.append("</xsd:list>");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("</xsd:simpleType>");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("</xsd:restriction>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</xsd:simpleType>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<xsd:simpleType name =\"");
    String _name_8 = enumType.getName();
    _builder.append(_name_8, " \t");
    _builder.append("s\">");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    _builder.append("<xsd:restriction base=\"");
    String _xmlns_2 = enumType.getXmlns();
    _builder.append(_xmlns_2, " \t\t");
    _builder.append(":");
    String _name_9 = enumType.getName();
    _builder.append(_name_9, " \t\t");
    _builder.append("List\">");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t\t");
    _builder.append("<xsd:maxLength value = \"");
    EList<EObject> _values_1 = enumType.getValues();
    int _size = _values_1.size();
    _builder.append(_size, " \t\t\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    _builder.append("</xsd:restriction>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</xsd:simpleType>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("</xsd:schema>\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence xsdDocumentation(final String doc) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(doc, null));
      if (_notEquals) {
        final String doc_ = doc.trim();
        _builder.newLineIfNotEmpty();
        {
          boolean _startsWith = doc_.startsWith("/*!<");
          if (_startsWith) {
            _builder.append("\t\t");
            _builder.append("<xsd:annotation>");
            _builder.newLine();
            int _length = doc_.length();
            int _minus = (_length - 4);
            String _substring = doc_.substring(4, _minus);
            _builder.append(_substring, "");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t ");
            _builder.append("</xsd:annotation>");
            _builder.newLine();
          } else {
            boolean _startsWith_1 = doc_.startsWith("/*");
            if (_startsWith_1) {
              _builder.append("\t\t");
              _builder.append("<xsd:annotation>");
              _builder.newLine();
              int _length_1 = doc_.length();
              int _minus_1 = (_length_1 - 2);
              String _substring_1 = doc_.substring(2, _minus_1);
              _builder.append(_substring_1, "");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t ");
              _builder.append("</xsd:annotation>");
              _builder.newLine();
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    return _builder;
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
}
