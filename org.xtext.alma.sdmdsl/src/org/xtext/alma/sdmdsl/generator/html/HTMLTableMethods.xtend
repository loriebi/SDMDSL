package org.xtext.alma.sdmdsl.generator.html

import alma.hla.datamodel.meta.asdm.ASDMAttribute
import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class HTMLTableMethods {
	
	var container = AlmaTableContainer.getInstance();
	
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file TableMethods.html
		sdmFsa.setFile("doc/TableMethods.html")
		sdmFsa.generateFile(generateTableMethods)
	}
	
	
	def generateTableMethods()'''
		<html>
		  <body>
		  <h1>ASDM Tables - New proposed methods</h1>
		  <p>
		Listed below are the names and signatures for new proposed methods defined in the classes 
		implementing the ASDM tables. These methods put a particular emphasis on the use of the key and value
		sections defined on each table. Another important addition is about the concept of "autoincrementable"
		attribute; an autoincrementable attribute is an intrinsic attribute, Tag or integer id, belonging to 
		the key section  that can be automatically computed when a new row is added to a table using an 
		appropriate method (addAutoInc). There is at most one autoincrementable attribute per table.
		Using the addAutoInc method obviously relieves the programmer  of having to generate and to manage 
		Tags and integer ids. <br/>
		<br/>
		For each table we give as a reminder the list of attributes split into two columns <b>key</b> and 
		<b>value</b>; the autoincrementable attribute, if any, is underlined. 
		  <p>
		«FOR table : container.sortedAlmaTable»
		«table.tableMethodsDef»
		«ENDFOR»
		  </body>
		</html>
	'''
	
	
	def tableMethodsDef(AlmaTable table)'''
		<hr>
		<h2>Table: «table.name»</h2>
		<h3>Attributes</h3>
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
		<h3>Methods</h3>
		<h4>Create a row.</h4>
		<table border="1" width="100%">
		<tr>
		<td valign="top" width="100%">
		<code>
		«IF table.RequiredValueJava != ""»
		/*<br/>
		** Create a new row from the list of mandatory attributes that are in the value section.<br/>
		** Optional attributes, if any, can be set using the appropriate setters.<br/>
		*/<br/>	
		<b>Java</b>: «table.name»Row newRow(«table.RequiredValueJava»);<br/>
		«ENDIF»
		«IF table.RequiredValueCpp != ""»
		<b>C++</b>: «table.name»Row* newRow(«table.RequiredValueCpp»);<br/>
		«ENDIF»
		</code>
		</td>
		</tr>
		</table>
		
		<h4>Append a row to its table.</h4>
		<table border="1" width="100%">
		<tr>
		<td valign="top" width="100%">
		<code>
		«IF table.KeyJava != ""»
		/* <br/>
		** Overwrite the key attributes of x with the values passed in parameters and <br/>
		** append x to its table. <br/>
		*/ <br/>
		<b>Java</b>: void add(«table.KeyJava», «table.name»Row x);<br/>
		<b>C++</b>: void add(«table.KeyCpp», «table.name»Row* x);<br/>
		«ENDIF»
		<br/>
		
		«IF !table.NoAutoIncrementableAttribute»
		/* <br/>
		** Overwrite the non autoincrementable key attributes of x with the values passed in parameters <br />
		** and append x to its table. <br/>
		** Returns the value of «table.TheAutoIncrementableAttribute.name» automatically assigned to x. <br />
		*/ <br/>
			«IF table.keyNoAutoIncrementableAttributes.size != 0»
			<b>Java</b>: «table.TheAutoIncrementableAttribute.JavaType» addAutoInc(«table.KeyNoAutoIncJava», «table.name»Row x);<br/>
			<b>C++</b>:	«table.TheAutoIncrementableAttribute.CppType»* addAutoInc(«table.KeyNoAutoIncCpp», «table.name»Row* x);<br/>
			«ELSE»
			<b>Java</b>: «table.TheAutoIncrementableAttribute.JavaType» addAutoInc(«table.name»Row* x);<br/>
			<b>C++</b>:	«table.TheAutoIncrementableAttribute.CppType»* addAutoInc(«table.name»Row* x);<br/>
			«ENDIF»
		«ENDIF»
		</code>
		</td>
		</tr>
		</table>
		
		<h4>Query a table using keys without the autoincrementable attribute.</h4>
		<table width="100%" border="1">
		<tr>
		<td>
		
		«IF !table.NoAutoIncrementableAttribute»
			«IF table.keyNoAutoIncrementableAttributes.size != 0»
			<code>
			/**<br/>
			 * Get the rows based on values for attributes of the key section that are not autoincrementable.<br/>
			 */<br/>		<b>Java</b>: «table.name»Row[] getKeyNoAutoInc(«table.KeyNoAutoIncJava»);<br/>
				<b>C++</b>:	vector &lt;«table.name»Row*&gt; getKeyNoAutoInc(«table.KeyNoAutoIncCpp»);<br/>
			</code>
			«ELSE»
				No such method.
			«ENDIF»
		«ELSE»
			No such method.
		«ENDIF»
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
		«IF !attr.isKey»
			«IF attr.isOptional»
				<li> (optional, «attr.JavaType») «attr.name»
			«ENDIF»
		«ENDIF»
	'''
}