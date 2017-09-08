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
public class TwikiGenerator extends EnumerationAbstractGenerator {
  @Override
  public void doGenerate(final EList<Resource> input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EnumerationFileSystemAccess enumFsa = ((EnumerationFileSystemAccess) fsa);
    enumFsa.setFile("doc/TWikiText.txt");
    CharSequence _generateTwikiFile = this.generateTwikiFile(input);
    enumFsa.generateFile(_generateTwikiFile);
  }
  
  @Override
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
  
  public CharSequence generateTwikiFile(final EList<Resource> input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("%TOC%");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      for(final Resource resource : input) {
        _builder.newLine();
        EObject _resourceToEObject = this.resourceToEObject(resource);
        CharSequence _generateTwiki = this.generateTwiki(((EnumType) _resourceToEObject));
        _builder.append(_generateTwiki, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateTwiki(final EnumType enumType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("---+++++ =");
    String _name = enumType.getName();
    _builder.append(_name, "");
    _builder.append("= ");
    _builder.newLineIfNotEmpty();
    {
      String _docEnum = enumType.getDocEnum();
      boolean _notEquals = (!Objects.equal(_docEnum, null));
      if (_notEquals) {
        _builder.append("<noautolink>");
        String _docEnum_1 = enumType.getDocEnum();
        String _documentation = this.documentation(_docEnum_1);
        _builder.append(_documentation, "");
        _builder.append("</noautolink>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EObject> _values = enumType.getValues();
      for(final EObject literal : _values) {
        {
          if ((literal instanceof EnumValueWithoutComma)) {
            _builder.append("\t");
            _builder.append("* =");
            String _name_1 = ((EnumValueWithoutComma)literal).getName();
            _builder.append(_name_1, "\t");
            _builder.append("=  ");
            {
              String _doc = ((EnumValueWithoutComma)literal).getDoc();
              boolean _notEquals_1 = (!Objects.equal(_doc, null));
              if (_notEquals_1) {
                _builder.append(" : <noautolink>");
                String _doc_1 = ((EnumValueWithoutComma)literal).getDoc();
                String _documentation_1 = this.documentation(_doc_1);
                _builder.append(_documentation_1, "\t");
                _builder.append("</noautolink>");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((literal instanceof EnumValue)) {
            _builder.append("\t");
            _builder.append("* =");
            String _name_2 = ((EnumValue)literal).getName();
            _builder.append(_name_2, "\t");
            _builder.append("=  ");
            {
              String _doc_2 = ((EnumValue)literal).getDoc();
              boolean _notEquals_2 = (!Objects.equal(_doc_2, null));
              if (_notEquals_2) {
                _builder.append(" : <noautolink>");
                String _doc_3 = ((EnumValue)literal).getDoc();
                String _documentation_2 = this.documentation(_doc_3);
                _builder.append(_documentation_2, "\t");
                _builder.append("</noautolink>");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
