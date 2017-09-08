package org.xtext.alma.sdmdsl.generator.idl

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class IDLGenerator {
	

	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		new IDLStructDef().doGenerate(fsa,context)
	}		
}