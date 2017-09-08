package org.xtext.alma.sdmdsl.generator.html

import alma.hla.datamodel.meta.asdm.ASDMAttribute
import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class HTMLKeyValue {
	
	var container = AlmaTableContainer.getInstance();
	
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file KeyValue.html
		sdmFsa.setFile("doc/KeyValue.html")
		sdmFsa.generateFile(generateKeyValue)
	}
	
	
	def generateKeyValue()'''
		<html>
		  <body>
		  <h1>Contents</h1>
		  <p>
		Listed below are tables of the ASDM.   For each table, a 
		list of (key, value) pair is given. The autoincrementable
		attribute of a table that if any is always a part of
		the key, is written with an underlined font.   
		  <p>
		
		«FOR table : container.sortedAlmaTable»
		«table.tableDef»
		«ENDFOR»
		  </body>
		</html>
	'''
	
	
	def tableDef(AlmaTable table)'''
		<hr>
		<h2>Table: «table.name»</h2>
		<table border="1" width="600">
		<tr><th width="50%" align="center">Key</th><th width="50%" align="center">Value</th></tr>
		<tr><td valign="top" align="left">
		<ul type="square">
		«IF !table.noExtrinsicAttribute»
			«FOR attr : table.extrinsic»
			«attr.rowDefKey»
			«ENDFOR»
		«ENDIF»
		«FOR attr : table.intrinsic»
		«attr.rowDefKey»
		«ENDFOR»
		</ul>
		</td>
		<td valign="top" align="left">
		<ul type="square">
		«FOR attr : table.intrinsic»
		«attr.rowDefMandatoryValue»
		«ENDFOR»
		«IF !table.noExtrinsicAttribute »
			«FOR attr : table.extrinsic»
			«attr.rowDefMandatoryValue»
			«ENDFOR»
		«ENDIF»
		
		«FOR attr : table.intrinsic»
		«attr.rowDefOptionalValue»
		«ENDFOR»
		«IF !table.noExtrinsicAttribute »
			«FOR attr : table.extrinsic»
			«attr.rowDefOptionalValue»
			«ENDFOR»
		«ENDIF»
		
		</ul>
		</td>
		</tr>
		</table>
	'''
	
	
	def rowDefKey(ASDMAttribute attr)'''
		«IF attr.isKey»
			«IF attr.isAutoIncrementable»
				<li><u>(«attr.JavaType») «attr.name»</u>
			«ELSE»
				<li>(«attr.JavaType») «attr.name»
			«ENDIF»
		«ENDIF»
	'''
	
	
	def rowDefMandatoryValue(ASDMAttribute attr)'''
	«IF !attr.isKey»
		«IF !attr.isOptional»
			<li> («attr.JavaType») «attr.name»
		«ENDIF»
	«ENDIF»
	'''
	
	def rowDefOptionalValue(ASDMAttribute attr)'''
		«IF !attr.isKey »
			«IF attr.isOptional»
				<li> (optional, «attr.JavaType») «attr.name»
			«ENDIF»
		«ENDIF»
	'''
	
}