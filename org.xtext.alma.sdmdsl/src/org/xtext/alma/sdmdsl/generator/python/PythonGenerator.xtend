package org.xtext.alma.sdmdsl.generator.python

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class PythonGenerator{
	
	def doGenerate(List<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	def doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}