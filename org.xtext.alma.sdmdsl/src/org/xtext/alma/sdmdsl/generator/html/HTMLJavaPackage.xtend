package org.xtext.alma.sdmdsl.generator.html

import alma.hla.datamodel.meta.asdm.ASDMAttribute
import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class HTMLJavaPackage {
	
	var container = AlmaTableContainer.getInstance();
	
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file ASDM.html
		sdmFsa.setFile("doc/ASDM.html")
		sdmFsa.generateFile(generateASDM)
	}



	def generateASDM()'''
		<html>
		  <body>
		  <h1>Contents</h1>
		  <p>
		Listed below are tables and one container class that make up the 
		package.  Each table in the UML model results in two classes being 
		generated: a "Table" class and a "Row" class. For each table, a 
		list of attributes, keys, and links to other tables are included.  
		  <p>
		A key is an ordered sequence of attributes that uniquely identify
		a row of a table.  Methods are included to traverse the links from one
		table to another.  The attributes of a table are divided into intrinsic
		and extrinsic attributes.  An intrinsic attribute is
		an attribute that a table has regardless of whether that table is
		related to any other thing or not.  In other words, it is intrinsic to that
		table.  An extrinsic attribute, on the other hand, is one that exists in virtue of the
		fact that the table is related to something else.  In other words, an extrinsic
		attribute exists because that table is associated with some other thing.
		«ContainerDef»
		«FOR table : container.sortedAlmaTable»
		«table.TableDef»
		«ENDFOR»
		  </body>
		</html>
	'''
	
	
	def ContainerDef()'''
	<h2>Table container: «container.name»</h2>
	«container.doc»
	<h3>Attributes:</h3>
		<ul>
		«FOR attr : container.ASDMAttributes»
		«attr.RowDef»
		«ENDFOR»
		</ul>
	<h3>List of member tables:</h3>
		<ul>
	«FOR table : container.sortedAlmaTable »
			<li>«table.name»
	«ENDFOR»
		</ul>
	'''
	
	
	def TableDef(AlmaTable table)'''
	<hr>
	<h2>Table: «table.name»</h2>
	«table.doc»
	<h3>Intrinsic Attributes:</h3>
		«IF table.noIntrinsicAttribute»
			There are no intrinisic attributes.
		«ELSE»
			<ul>
			«FOR attr : table.intrinsic»
			«attr.RowDef»
			«ENDFOR»
			</ul>
		«ENDIF»
	<h3>Extrinsic Attributes:</h3>
		«IF table.noExtrinsicAttribute»
			There are no extrinisic attributes.
		«ELSE»
			<ul>
			«FOR attr : table.extrinsic»
			«attr.RowDef»
			«ENDFOR»
			</ul>
		«ENDIF»
	<h3>Keys:</h3>
		<ul>
		«table.keyAttributes.KeyDef»
		</ul>
	<h3>Links to other tables:</h3>
		«IF table.noLink»
			There are no links to other tables.
		«ELSE»
			<ul>
			«FOR link : table.link»
			«link.LinkDef»
			«ENDFOR»
			</ul>
		«ENDIF»
	'''
	
	
	def RowDef(ASDMAttribute attr)'''
		«IF attr.isOptional»
		<li> (optional, «attr.JavaType») «attr.name»
		«ELSE»
		<li> («attr.JavaType») «attr.name»
		«ENDIF»
	'''
	
	def KeyDef(ASDMAttribute[] attr)'''
		<li> key
		<ul>
		«FOR key : attr»
			<li>Field name: «key.name»
		«ENDFOR»
		</ul>
	'''
	
	def LinkDef(ASDMAttribute linkAttr)'''
		«IF linkAttr.isRefsToOne»
			«/* linkAttr.CaseOne */»
		«ENDIF»
		«IF linkAttr.isOptional»
			«linkAttr.CaseOptional»
		«ENDIF»
		«IF linkAttr.isRefsToMany»
			«CaseMany»
		«ENDIF»
	'''
	
	def CaseOne(ASDMAttribute linkAttr)'''
		<li>One to one link from a row of «linkAttr.tableName» table to a row of «linkAttr.refersTo» table using:
		<ul>
		<li> («linkAttr.JavaType») «linkAttr.name»
		</ul>
	'''
	
	
	def CaseOptional(ASDMAttribute linkAttr)'''
		<li>Optional link from a row of «linkAttr.tableName» table to a row of «linkAttr.refersTo» table using:
		<ul>
		<li> (optional, «linkAttr.JavaType») «linkAttr.name»
		</ul>
	'''
	
	
	def CaseMany()'''
	
	'''
}
