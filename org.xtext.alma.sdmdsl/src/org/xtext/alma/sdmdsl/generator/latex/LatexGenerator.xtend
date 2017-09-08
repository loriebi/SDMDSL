package org.xtext.alma.sdmdsl.generator.latex

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class LatexGenerator {
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		/* ---------------------------- Latex --------------------------------------------------------------- */
		new LatexTables().doGenerate(fsa, context)
	
	
	
		/* ---------------------------- TwikiList --------------------------------------------------------------- */
		new TwikiList().doGenerate(fsa, context)
	}
	
}