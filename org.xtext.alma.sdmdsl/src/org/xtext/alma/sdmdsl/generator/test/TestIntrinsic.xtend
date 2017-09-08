package org.xtext.alma.sdmdsl.generator.test

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class TestIntrinsic {
	
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * test intrinsic generator
		 */
		for(table : container.tables){
			
			// creating file and generating code
			sdmFsa.setFile("test/intrinsic/" + table.name + "Intrinsic.txt")
			sdmFsa.generateFile(table.generateIntrinsic)
			
		}
		
	}
	
	
	
	def generateIntrinsic(AlmaTable table)'''
	LIST OF INTRINSIC ATTRIBUTES :
		
	«FOR attr : table.intrinsic»
	«attr.name»
	«ENDFOR»
	'''
	
}