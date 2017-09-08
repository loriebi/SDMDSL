package org.xtext.alma.sdmdsl.generator.latex

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess
import alma.hla.datamodel.meta.asdm.AlmaTable

class LatexTables {
	
	var container = AlmaTableContainer.instance
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file tables.tex
		sdmFsa.setFile("/latex/tables.tex")
		sdmFsa.generateFile(generateLatexTables)
		
	}
	
	
	def generateLatexTables()'''
		% This is a Generated file ! do not edit !
		\subsection{Versioning information for the ASDM.}
		\begin{itemize}
		\item Version : «container.version»
		\item CVS revision : «AlmaTableContainer.revision»
		\item CVS branch : «AlmaTableContainer.branch»
		\end{itemize} 
		\newpage
		
		
		«FOR table : container.sortedAlmaTable»
			«output(table)»
		«ENDFOR»
	'''
	
	
	def output(AlmaTable table)'''
		«IF table.name!="Main"» \newpage«ENDIF»
		
		«IF table.name!="FlagCmd" && table.name!="History" && table.name!="Observation" && table.name!="Seeing" && table.name!="TotalPower"»
			\subsection{«table.name» Table}
			
			«IF table.doc != "" » «table.doc» «ELSE»{\red missing documentation}«ENDIF»
			
			\begingroup
			%
			% define shortcuts for dimensions
			
			«FOR attr : table.requiredValueAttributes»
				«IF attr.isDimensionPar»%\newcommand{\«attr.name»}{«attr.LatexSymbol»}«ENDIF»
			«ENDFOR»
			«IF table.optionalValueAttributes.size != 0»
				«FOR attr : table.optionalValueAttributes»
					«IF attr.isDimensionPar»%\newcommand{\«attr.name»}{«attr.LatexSymbol»}«ENDIF»
				«ENDFOR»
			«ENDIF»
			
			\par\noindent\begin{longtable} {|p{45mm}|p{45mm}|p{65mm}|}
			\hline \multicolumn{3}{|c|}{\textbf{«table.name»}} \\
			\hline\hline
			Name & Type (Shape) & Comment \\
			\hline \endfirsthead
			\hline \multicolumn{3}{|c|}{\textbf{«table.name»} -- continued from previous page} \\
			\hline \hline
			Name & Type (Shape) & Comment \\
			\hline \endhead
			\hline \endfoot
			
			
			\hline \multicolumn{3}{|l|}{\em Key} \\
			\hline 
			
			«FOR attr : table.keyAttributes»
				\texttt{«attr.LatexSymbol»} & \texttt{«attr.LatexTypeDescription»} & «attr.LatexShortDoc» \\
			«ENDFOR»
			\hline \multicolumn{3}{|l|}{\em Required Data} \\
			\hline
			«FOR attr : table.requiredValueAttributes»
				 \texttt{«attr.LatexSymbol»} «IF attr.isDimensionPar»(«attr.LatexSymbol»)«ENDIF»& \texttt{«attr.LatexTypeDescription»} &
				 «attr.LatexShortDoc» \\
			«ENDFOR»
			
			«IF table.optionalValueAttributes.size != 0»
				\hline \multicolumn{3}{|l|}{\em Optional Data} \\
				\hline
				«FOR attr : table.optionalValueAttributes»
					\texttt{«attr.LatexSymbol»} «IF attr.isDimensionPar»(«attr.LatexSymbol»)«ENDIF» & \texttt{«attr.LatexTypeDescription»} &
					«attr.LatexShortDoc» \\
				«ENDFOR»
			«ENDIF»
			\hline
			\end{longtable}
			  
			~\par\noindent{\bf Column Descriptions:}
			
			\begin{description}
			«FOR attr : table.keyAttributes»
				\item[\texttt{«attr.LatexSymbol»}]: «attr.LatexLongDoc»
			«ENDFOR»
			«FOR attr : table.requiredValueAttributes»
				\item[\texttt{«attr.LatexSymbol»}]: «attr.LatexLongDoc»
			«ENDFOR»
			«FOR attr : table.optionalValueAttributes»
				\item[\texttt{«attr.LatexSymbol»}]: «attr.LatexLongDoc»
			«ENDFOR»
			\end{description}
			\endgroup
		«ENDIF»
		
	'''
}