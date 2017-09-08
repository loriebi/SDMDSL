package org.xtext.alma.sdmdsl.generator.cpp

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class CppGenerator{
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		/* ---------------------------- CPP Container --------------------------------------------------------------- */
		// CppContainerDef generation
		new CppContainerDef().doGenerate(fsa,context)
		
		// CppContainerImpl generation
		new CppContainerImpl().doGenerate(fsa,context)
		
		
		
		
		
		
		
		/* ---------------------------- CPP Enumeration --------------------------------------------------------------- */
		// CppEnumerationParserDef generation
		new CppEnumerationParserDef().doGenerate(fsa,context)
		
		// CppEnumerationParserImpl generation
		new CppEnumerationParserImpl().doGenerate(fsa,context)
		
		
		
		
		
		
		
		/* ---------------------------- CPP Includes --------------------------------------------------------------- */
		// CppIncludes generation
		new CppIncludes().doGenerate(fsa,context)
		
		
		
		/* ---------------------------- CPP Merger --------------------------------------------------------------- */
		// CppMergerDef generation
		new CppMergerDef().doGenerate(fsa,context)
		
		// CppMergerImpl generation
		new CppMergerImpl().doGenerate(fsa,context)
		
		
		
		
		
		/* ---------------------------- CPP Parser --------------------------------------------------------------- */
		// CppParserDef generation
		new CppParserDef().doGenerate(fsa,context)
		
		// CppParserImpl generation
		new CppParserImpl().doGenerate(fsa,context)
		
		
		
		
		
		/* ---------------------------- CPP Representable --------------------------------------------------------------- */
		// CppRepresentable generation
		new CppRepresentable().doGenerate(fsa,context)
		
		
		
		
		/* ---------------------------- CPP Row --------------------------------------------------------------- */
		// CppRowDef generation
		new CppRowDef().doGenerate(fsa,context)
		
		// CppRowImpl generation
		new CppRowImpl().doGenerate(fsa,context)
		
		
		
		
		
		/* ---------------------------- CPP Table --------------------------------------------------------------- */
		//CppTableDef generation
		new CppTableDef().doGenerate(fsa,context)
		
		//CppTableImpl generation
		new CppTableImpl().doGenerate(fsa,context)
			
			
			
		/* ---------------------------- CPP TagType --------------------------------------------------------------- */
		// CppTagTypeDef generation
		new CppTagTypeDef().doGenerate(fsa,context)
	
		// CppTagTypeImpl generator
		new CppTagTypeImpl().doGenerate(fsa,context)
	
	
		
		
		
		/* ---------------------------- CWrapper --------------------------------------------------------------- */
		// CWrapperImpl
		new CWrapperImpl().doGenerate(fsa,context)
	
		
		
		/* ---------------------------- FWrapper --------------------------------------------------------------- */
		// CWrapperImpl
		new FWrapperImpl().doGenerate(fsa,context)
		
	
	
	}
	
	
}