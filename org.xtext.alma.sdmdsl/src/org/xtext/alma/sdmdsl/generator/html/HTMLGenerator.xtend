package org.xtext.alma.sdmdsl.generator.html

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class HTMLGenerator {
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		new ASDMEntities().doGenerate(fsa,context)
		
		new ASDMEntitiesDocBook().doGenerate(fsa,context)
		
		new HTMLKeyValue().doGenerate(fsa,context)
		
		new HTMLTableMethods().doGenerate(fsa,context)
		
		new HTMLJavaPackage().doGenerate(fsa,context)
	}
}