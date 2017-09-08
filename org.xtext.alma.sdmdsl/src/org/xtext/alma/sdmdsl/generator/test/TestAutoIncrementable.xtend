package org.xtext.alma.sdmdsl.generator.test

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class TestAutoIncrementable {
	
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * autoIncrementable test generator
		 */
		for(table : container.tables){
			
			// creating file and generating code
			sdmFsa.setFile("test/autoIncrementable/" + table.name + "AutoIncre.txt")
			sdmFsa.generateFile(table.generateAutoIncrementable)
			
		}
		
	}
	
	
	
	def generateAutoIncrementable(AlmaTable table)'''
	LIST OF AUTO INCREMENTABLE ATTRIBUTES :
		
	«FOR attr : table.autoIncrementable»
	«attr.name»
	«ENDFOR»
	'''
	
}