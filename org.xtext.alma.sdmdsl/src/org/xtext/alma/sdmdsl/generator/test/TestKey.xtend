package org.xtext.alma.sdmdsl.generator.test

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class TestKey {
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * test Key generator
		 */
		for(table : container.tables){
			
			// creating file and generating code
			sdmFsa.setFile("test/key/" + table.name + "Key.txt")
			sdmFsa.generateFile(table.generateKey)
			
		}
		
	}
	
	
	def generateKey(AlmaTable table)'''
	LIST OF KEY ATTRIBUTES :
	
	«FOR attr : table.keyAttributes»
	«attr.name»
	«ENDFOR»
	'''
}