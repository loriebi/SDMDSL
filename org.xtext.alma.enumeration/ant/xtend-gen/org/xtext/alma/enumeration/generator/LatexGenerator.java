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
public class LatexGenerator extends EnumerationAbstractGenerator {
  public void doGenerate(final EList<Resource> input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EnumerationFileSystemAccess enumFsa = ((EnumerationFileSystemAccess) fsa);
    enumFsa.setFile("doc/enumerations.tex");
    CharSequence _generateLatexFile = this.generateLatexFile(input);
    enumFsa.generateFile(_generateLatexFile);
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
  
  public CharSequence generateLatexFile(final EList<Resource> input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("% This is a Generated file ! do not edit !");
    _builder.newLine();
    _builder.append("\\subsection{Versioning information for the enumerations.}");
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\\item UML description : UML DESCRIPTION");
    _builder.newLine();
    _builder.append("\\item CVS revision : CVS REVISION");
    _builder.newLine();
    _builder.append("\\item CVS branch : CVS BRANCH");
    _builder.newLine();
    _builder.append("\\end{itemize} ");
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Resource resource : input) {
        _builder.newLine();
        EObject _resourceToEObject = this.resourceToEObject(resource);
        CharSequence _generateLatexDoc = this.generateLatexDoc(((EnumType) _resourceToEObject));
        _builder.append(_generateLatexDoc, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateLatexDoc(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\subsection{\\texttt{");
    String _name = enumType.getName();
    _builder.append(_name, "");
    _builder.append("}}");
    _builder.newLineIfNotEmpty();
    _builder.append("version ");
    int _version = enumType.getVersion();
    _builder.append(_version, "");
    _builder.newLineIfNotEmpty();
    {
      String _docEnum = enumType.getDocEnum();
      boolean _notEquals = (!Objects.equal(_docEnum, null));
      if (_notEquals) {
        String _docEnum_1 = enumType.getDocEnum();
        String _documentation = this.documentation(_docEnum_1);
        _builder.append(_documentation, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\begin{description}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EObject> _values = enumType.getValues();
      for(final EObject literal : _values) {
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("\\item[\\texttt{");
            String _name_1 = ((EnumValueWithoutComma)literal).getName();
            String _latexFormat = this.latexFormat(_name_1);
            _builder.append(_latexFormat, "");
            _builder.append("}]");
            {
              String _doc = ((EnumValueWithoutComma)literal).getDoc();
              boolean _notEquals_1 = (!Objects.equal(_doc, null));
              if (_notEquals_1) {
                _builder.append(" : ");
                String _doc_1 = ((EnumValueWithoutComma)literal).getDoc();
                String _documentation_1 = this.documentation(_doc_1);
                _builder.append(_documentation_1, "");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("\\item[\\texttt{");
            String _name_2 = ((EnumValue)literal).getName();
            String _latexFormat_1 = this.latexFormat(_name_2);
            _builder.append(_latexFormat_1, "");
            _builder.append("}]");
            {
              String _doc_2 = ((EnumValue)literal).getDoc();
              boolean _notEquals_2 = (!Objects.equal(_doc_2, null));
              if (_notEquals_2) {
                _builder.append(" : ");
                String _doc_3 = ((EnumValue)literal).getDoc();
                String _documentation_2 = this.documentation(_doc_3);
                _builder.append(_documentation_2, "");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\\end{description}");
    _builder.newLine();
    return _builder;
  }
  
  public String latexFormat(final String literalName) {
    return literalName.replaceAll("_", "\\\\_");
  }
}
