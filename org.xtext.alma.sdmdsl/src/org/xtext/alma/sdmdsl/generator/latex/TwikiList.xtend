package org.xtext.alma.sdmdsl.generator.latex

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class TwikiList {
	
	var container = AlmaTableContainer.instance
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file tablesTwiki.txt
		sdmFsa.setFile("/latex/tablesTwiki.txt")
		sdmFsa.generateFile(generateTwiki)
		
	}
	
	
	def generateTwiki()'''
		CVS Revision: «AlmaTableContainer.revision» --  CVS branch: «AlmaTableContainer.branch»
		«FOR table : container.sortedAlmaTable»
			«output(table)»
		«ENDFOR»
	'''
	
	
	
	def output(AlmaTable table)''' 
		---+++ =«table.name»= Table
		| *Action*  | *Function*  | *Name*  | *Type*   | *Comment*   |
		«FOR attr : table.sortedKeyAttributes»
			| -  | Key  | =«attr.name»=  | !«attr.LatexTypeDescription»  |  |
		«ENDFOR»
		«FOR attr : table.sortedRequiredValueAttributes »
			| -  | Data  | =«attr.name»=  | !«attr.LatexTypeDescription»  |   | 
		«ENDFOR»
		«FOR attr : table.sortedOptionalValueAttributes »
			| -  | Optional  | =«attr.name»=  | !«attr.LatexTypeDescription»  |   |
		«ENDFOR»
	'''
}