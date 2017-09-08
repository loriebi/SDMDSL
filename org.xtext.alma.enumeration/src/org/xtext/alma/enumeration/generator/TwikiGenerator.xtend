package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class TwikiGenerator extends EnumerationAbstractGenerator{
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var enumFsa = (fsa as EnumerationFileSystemAccess)
		enumFsa.setFile("doc/TWikiText.txt")
		
		// generates TWiki file -> doc/TWikiText.txt"	
		enumFsa.generateFile(input.generateTwikiFile)
	}
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	// returns head of AST
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
	}
	
	
	// documentation
	def documentation(String doc){
		var sb = new StringBuilder(doc);
		sb.deleteCharAt(0);
		sb.deleteCharAt(0);
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
	
	def generateTwikiFile(EList<Resource> input)'''
		%TOC%
		
		
		«FOR resource : input» 
		
		«generateTwiki(resourceToEObject(resource) as EnumType)»
		
		«ENDFOR»
	'''
	
	def generateTwiki(EnumType enumType)'''
		---+++++ =«enumType.name»= 
		«IF enumType.docEnum != null»
			<noautolink>«documentation(enumType.docEnum)»</noautolink>
		«ENDIF»
			«FOR literal : enumType.values»
				«IF literal instanceof EnumValueWithoutComma»
					* =«literal.name»=  «IF literal.doc != null» : <noautolink>«documentation(literal.doc)»</noautolink>«ENDIF»
				«ENDIF»
				«IF literal instanceof EnumValue»
					* =«literal.name»=  «IF literal.doc != null» : <noautolink>«documentation(literal.doc)»</noautolink>«ENDIF»
				«ENDIF»
			«ENDFOR»
	'''
}