package org.xtext.alma.sdmdsl.generator.verbatimfiller

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class VerbatimFillerGenerator {
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		/* ---------------------------- ASDMTables def/impl --------------------------------------------------------------- */
		new ASDMTablesDef().doGenerate(fsa,context)
		
		new ASDMTablesImpl().doGenerate(fsa,context)
	
	
	
		/* ---------------------------- Name2Table def/impl --------------------------------------------------------------- */
		new Name2TableDef().doGenerate(fsa,context)
		
		new Name2TableImpl().doGenerate(fsa,context)
	}
	
}