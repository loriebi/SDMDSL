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
public class IDLGenerator extends EnumerationAbstractGenerator {
  @Override
  public void doGenerate(final EList<Resource> input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EnumerationFileSystemAccess enumFsa = ((EnumerationFileSystemAccess) fsa);
    enumFsa.setFile("idl/almaEnumerations_IF.idl");
    CharSequence _generateIDLFile = this.generateIDLFile(input);
    enumFsa.generateFile(_generateIDLFile);
  }
  
  @Override
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
  
  public CharSequence generateIDLFile(final EList<Resource> input) {
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
    _builder.append("* File almaEnumerations_IF.idl");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#ifndef ALMA_DATA_MODEL_ENUMERATION_IDL");
    _builder.newLine();
    _builder.append("#define ALMA_DATA_MODEL_ENUMERATION_IDL");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#pragma prefix \"alma\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/*! ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\mainpage Presentation.");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\section intro Introduction.");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("The different pieces of software related to the ALMA project naturally process or describe data whose types may cover all the range  from the basic types ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("(integer, float, etc.) up to compound types (arrays, classes...) by using the mechanisms offered by languages like C++, Java, IDL or Python.");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("But there are situations which require the definitions of finite sets of constant values in order to represent properly  ideas like \"the set of antenna makers\" or");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"the set of possible antenna types\" or  \"the set of possible types for the data obtained during an observation\". The languages mentioned above allow to create");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\e enumerated \\e types which are \\e user \\e defined data types consisting of sets of constants called \\e enumerations. The creation of an enumerated type actually defines");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("an \\e enumeration by its name (e.g. \\c  AntennaType) and the set of its enumerators (e.g. \\c GROUND_BASED  , \\c SPACE_BASED, \\c TRACKING_STN).");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("\\section enum-desc Enumerations definitions.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Given that these enumerations are meant to be shared by all the software\'s contributors and that the software is for a large part a collection of distributed objects using CORBA");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("as their middleware, IDL seemed to be the natural language to define these enumerations. The documentation which follows this introductory part lists \\e all the enumerations ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("defined for the ALMA project in IDL. For each enumeration it provides its name and information about its nature as well as a commented list of its enumerators. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("\\subsection namspace Encapsulating modules.");
    _builder.newLine();
    _builder.append("\\subsubsection lit-conf Avoid literal conflicts.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("The possibility to use a same constant as an enumerator in more than one enumeration has been considered as desirable. Consequently each");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("enumeration is \\e protected by its own namespace. In IDL this is obtained by defining an encapsulating module for each defined enumeration. The name of ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("the module is the name of the enumeration suffixed by \\c Mod (hence the list of packages in the documentation generated by doxygen).");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("\\subsubsection versioning Versioning requirements.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Another benefit of encapsulating each enumeration in its own module is related to versioning. The versioning policy defined by the Schema Versioning Function Based Team");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("assumes that each defined type is also formally described in an XML Schema and stipulates that each of those schemas must be qualified by a \\e version \\e number ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("and a \\e revision \\e identifier. In order to be fully useful the versioning information must be shared by the different representations of a same defined type, hence the necessity");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("to intoduce such an information in the IDL representation of the enumerations.  This is done by declaring two constants \\c version (int) and \\c revision (string) in each module ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("containing the declaration of an enumeration. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("In summary each enumeration  <I>EnumT</I> and its versioning information are packed in a module <I>EnumT</I><tt>Mod</tt> as in the following example :");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("\\verbatim");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("module CorrelationModeMod {");
    _builder.newLine();
    _builder.append(" \t ");
    _builder.append("const unsigned long version = 1; ");
    _builder.newLine();
    _builder.append(" \t ");
    _builder.append("const string revision = \"1.3\";");
    _builder.newLine();
    _builder.append(" \t ");
    _builder.newLine();
    _builder.append(" \t ");
    _builder.append("enum CorrelationMode {");
    _builder.newLine();
    _builder.append(" \t \t");
    _builder.append("CROSS_ONLY ,");
    _builder.newLine();
    _builder.append(" \t \t");
    _builder.append("AUTO_ONLY,");
    _builder.newLine();
    _builder.append(" \t \t");
    _builder.append("CROSS_AND_AUTO");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("\\endverbatim");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("\\subsection howto How to display the  documentation attached to an enumeration.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Unfold if necessary the \"Package list\" in the left window and click on a package name (e.g. %AntennaTypeMod) then you will get the documentation of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("the selected IDL module (\\c %AntennaTypeMod) and of its enclosed enumeration (\\c %AntennaType). ");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("\\section enum-impl Enumerations implementations.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("The implementations of the enumerations,  from their IDL descriptions, in different programming languages are obtained by using  the  tools ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("provided by the project. These tools apply the standard CORBA -> XXX mapping to generate the enumerations implementation in the language XXX ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("(those mappings are defined at http://www.omg.org/technology/documents/idl2x_spec_catalog.htm).");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("\\section enum-helper Helper classes.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Helpers classes are generated, above the implementations directly produced by the different compilers IDL -> XXX , to provide the programmers with");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("a level of functionalities as uniform as possible through the different languages -- C++, Java and Python. The APIs documentations of these helpers classes");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("can be read here :");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<li><a href=\"../c++\" target=\"_parent\">The C++ helper classes.</a></li>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<li><a href=\"../java\" target=\"_parent\">The Java helper classes.</a></li>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("</ul> ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      for(final Resource resource : input) {
        _builder.newLine();
        _builder.append("\t");
        EObject _resourceToEObject = this.resourceToEObject(resource);
        CharSequence _generateIDLModule = this.generateIDLModule(((EnumType) _resourceToEObject));
        _builder.append(_generateIDLModule, "\t");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("#endif /* ALMA_DATA_MODEL_ENUMERATION_IDL */");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateIDLModule(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("*  A module to encapsulate the enumeration ");
    String _name = enumType.getName();
    _builder.append(_name, "");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("module ");
    String _name_1 = enumType.getName();
    _builder.append(_name_1, "");
    _builder.append("Mod{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("const unsigned long version = ");
    int _version = enumType.getVersion();
    _builder.append(_version, "\t");
    _builder.append("; /*!< the major  version number of the enumeration. */");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("const string revision = \"");
    String _revision = enumType.getRevision();
    _builder.append(_revision, "\t");
    _builder.append("\";  /*!< the revision identifier. */");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*! Definition of enumeration ");
    String _name_2 = enumType.getName();
    _builder.append(_name_2, "\t");
    _builder.append(" : */");
    _builder.newLineIfNotEmpty();
    {
      String _docEnum = enumType.getDocEnum();
      boolean _notEquals = (!Objects.equal(_docEnum, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("/*! ");
        String _docEnum_1 = enumType.getDocEnum();
        String _documentation = this.documentation(_docEnum_1);
        _builder.append(_documentation, "\t");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("enum ");
    String _name_3 = enumType.getName();
    _builder.append(_name_3, "\t");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _values = enumType.getValues();
      boolean _hasElements = false;
      for(final EObject literal : _values) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t\t");
        }
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("\t\t");
            String _name_4 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_4, "\t\t");
            _builder.append(" ");
            {
              String _doc = ((EnumValueWithoutComma)literal).getDoc();
              boolean _notEquals_1 = (!Objects.equal(_doc, null));
              if (_notEquals_1) {
                _builder.append(" ");
                String _doc_1 = ((EnumValueWithoutComma)literal).getDoc();
                String _documentation_1 = this.documentation(_doc_1);
                _builder.append(_documentation_1, "\t\t");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("\t\t");
            String _name_5 = ((EnumValue)literal).getName();
            _builder.append(_name_5, "\t\t");
            _builder.append(" ");
            {
              String _doc_2 = ((EnumValue)literal).getDoc();
              boolean _notEquals_2 = (!Objects.equal(_doc_2, null));
              if (_notEquals_2) {
                _builder.append(" ");
                String _doc_3 = ((EnumValue)literal).getDoc();
                String _documentation_2 = this.documentation(_doc_3);
                _builder.append(_documentation_2, "\t\t");
              }
            }
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
    _builder.append("typedef sequence<");
    String _name_6 = enumType.getName();
    _builder.append(_name_6, "\t");
    _builder.append("> Sof");
    String _name_7 = enumType.getName();
    _builder.append(_name_7, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("typedef sequence<sequence<");
    String _name_8 = enumType.getName();
    _builder.append(_name_8, "\t");
    _builder.append("> > SofSof");
    String _name_9 = enumType.getName();
    _builder.append(_name_9, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("typedef sequence<sequence<sequence<");
    String _name_10 = enumType.getName();
    _builder.append(_name_10, "\t");
    _builder.append("> > > SofSofSof");
    String _name_11 = enumType.getName();
    _builder.append(_name_11, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    return _builder;
  }
}
