package org.xtext.alma.sdmdsl.generator.cpp;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.cpp.CWrapperImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppContainerDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppContainerImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppEnumerationParserDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppEnumerationParserImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppIncludes;
import org.xtext.alma.sdmdsl.generator.cpp.CppMergerDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppMergerImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppParserDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppParserImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppRepresentable;
import org.xtext.alma.sdmdsl.generator.cpp.CppRowDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppRowImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppTableImpl;
import org.xtext.alma.sdmdsl.generator.cpp.CppTagTypeDef;
import org.xtext.alma.sdmdsl.generator.cpp.CppTagTypeImpl;
import org.xtext.alma.sdmdsl.generator.cpp.FWrapperImpl;

@SuppressWarnings("all")
public class CppGenerator {
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    CppContainerDef _cppContainerDef = new CppContainerDef();
    _cppContainerDef.doGenerate(fsa, context);
    CppContainerImpl _cppContainerImpl = new CppContainerImpl();
    _cppContainerImpl.doGenerate(fsa, context);
    CppEnumerationParserDef _cppEnumerationParserDef = new CppEnumerationParserDef();
    _cppEnumerationParserDef.doGenerate(fsa, context);
    CppEnumerationParserImpl _cppEnumerationParserImpl = new CppEnumerationParserImpl();
    _cppEnumerationParserImpl.doGenerate(fsa, context);
    CppIncludes _cppIncludes = new CppIncludes();
    _cppIncludes.doGenerate(fsa, context);
    CppMergerDef _cppMergerDef = new CppMergerDef();
    _cppMergerDef.doGenerate(fsa, context);
    CppMergerImpl _cppMergerImpl = new CppMergerImpl();
    _cppMergerImpl.doGenerate(fsa, context);
    CppParserDef _cppParserDef = new CppParserDef();
    _cppParserDef.doGenerate(fsa, context);
    CppParserImpl _cppParserImpl = new CppParserImpl();
    _cppParserImpl.doGenerate(fsa, context);
    CppRepresentable _cppRepresentable = new CppRepresentable();
    _cppRepresentable.doGenerate(fsa, context);
    CppRowDef _cppRowDef = new CppRowDef();
    _cppRowDef.doGenerate(fsa, context);
    CppRowImpl _cppRowImpl = new CppRowImpl();
    _cppRowImpl.doGenerate(fsa, context);
    CppTableDef _cppTableDef = new CppTableDef();
    _cppTableDef.doGenerate(fsa, context);
    CppTableImpl _cppTableImpl = new CppTableImpl();
    _cppTableImpl.doGenerate(fsa, context);
    CppTagTypeDef _cppTagTypeDef = new CppTagTypeDef();
    _cppTagTypeDef.doGenerate(fsa, context);
    CppTagTypeImpl _cppTagTypeImpl = new CppTagTypeImpl();
    _cppTagTypeImpl.doGenerate(fsa, context);
    CWrapperImpl _cWrapperImpl = new CWrapperImpl();
    _cWrapperImpl.doGenerate(fsa, context);
    FWrapperImpl _fWrapperImpl = new FWrapperImpl();
    _fWrapperImpl.doGenerate(fsa, context);
  }
}
