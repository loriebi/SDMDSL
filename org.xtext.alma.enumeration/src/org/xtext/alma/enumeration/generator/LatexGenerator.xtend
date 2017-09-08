package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class LatexGenerator extends EnumerationAbstractGenerator{
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var enumFsa = (fsa as EnumerationFileSystemAccess)
		enumFsa.setFile("doc/enumerations.tex")
		
		// generates Latex file -> doc/enumerations.tex"	
		enumFsa.generateFile(input.generateLatexFile)	
	}
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
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

	
	// returns head of AST 
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
	}
	
	
	// template generates latex file
	def generateLatexFile(EList<Resource> input)'''
		% This is a Generated file ! do not edit !
		\subsection{Versioning information for the enumerations.}
		\begin{itemize}
		\item UML description : UML DESCRIPTION
		\item CVS revision : CVS REVISION
		\item CVS branch : CVS BRANCH
		\end{itemize} 
		\newpage
		
		«FOR resource : input» 
		
		«generateLatexDoc(resourceToEObject(resource) as EnumType)»
		
		«ENDFOR»
	'''
	
	
	def generateLatexDoc(EnumType enumType)'''
		\subsection{\texttt{«enumType.name»}}
		version «enumType.version»
		«IF enumType.docEnum != null»«documentation(enumType.docEnum)»«ENDIF»
		
		\begin{description}
		
		«FOR literal : enumType.values»
			«IF literal instanceof EnumValueWithoutComma»
				\item[\texttt{«literal.name.latexFormat»}]«IF literal.doc != null» : «documentation(literal.doc)»«ENDIF»
			«ENDIF»
			«IF literal instanceof EnumValue»
				\item[\texttt{«literal.name.latexFormat»}]«IF literal.doc != null» : «documentation(literal.doc)»«ENDIF»
			«ENDIF»
		«ENDFOR»
		
		\end{description}
	'''
	
	def latexFormat(String literalName) {
		return literalName.replaceAll("_", "\\\\_");
	}
	
}