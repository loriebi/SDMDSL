package org.xtext.alma.sdmdsl.generator.test

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class TestExtrinsic {
	
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * test extrinsic generator
		 */
		for(table : container.tables){
			
			// creating file and generating code
			sdmFsa.setFile("test/extrinsic/" + table.name + "Extrinsic.txt")
			sdmFsa.generateFile(table.generateExtrinsic)
			
		}
		
	}
	
	
	
	def generateExtrinsic(AlmaTable table)'''
	LIST OF EXTRINSIC ATTRIBUTES :
		
	«FOR attr : table.extrinsic»
	«attr.name»
	«ENDFOR»
	'''
	
}