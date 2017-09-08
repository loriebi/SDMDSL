package org.xtext.alma.sdmdsl.generator.html

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class ASDMEntitiesDocBook {
	
	var container = AlmaTableContainer.getInstance();
	
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file ASDMEntities.DocBook.xml
		sdmFsa.setFile("doc/ASDMEntities.DocBook.xml")
		sdmFsa.generateFile(generateASDMEntitiesDocBook)
		
	}
	
	
	def generateASDMEntitiesDocBook()'''
		<?xml version="1.0"?>
		
		<!DOCTYPE book PUBLIC "-//OASIS//DTD DocBook XML V4.0//EN"  "http://www.oasis-open.org/docbook/xml/4.0/docbookx.dtd">
		<chapter>
		    <title>Catalog of the ASDM Entities</title>
		    <subtitle>Revision «AlmaTableContainer.revision», branch «AlmaTableContainer.branch»</subtitle>
		    	«FOR table : container.sortedAlmaTable»
					«table.output»
				«ENDFOR»
		</chapter>
	'''
	
	
	def output(AlmaTable table)'''
		<?hard-pagebreak?>
			<section>
				<title>«table.name»</title>
				<para>
				Key:
					<informaltable>
						<tgroup cols="4">
						<colspec colnum="1" colname="col1" colwidth="1.2*"/>
						<colspec colnum="2" colname="col2" colwidth="1.0*"/>
						<colspec colnum="3" colname="col3" colwidth="1.5*"/>
						<colspec colnum="4" colname="col4" colwidth="1.75*"/>
						
							<thead>
								<row>
									<entry>Name</entry>
									<entry>Java type</entry>
									<entry>C++ type</entry>
									<entry>Array's shape</entry>
								</row>
							</thead>
							<tbody>
							«FOR attr : table.keyAttributes »
								<row>
									<entry><command>«attr.name»</command></entry>
									<entry>«attr.XMLJavaType»</entry>
									<entry>«attr.XMLCppType»</entry>
									<entry>«IF attr.isArray»«attr.XMLCppTypeDescription»«ELSE»&nsbp;«ENDIF»</entry>
								</row>
							«ENDFOR»
							</tbody>
						</tgroup>
					</informaltable>
				</para>
				<para>
				Value required:
					<informaltable>
						<tgroup cols="4">
						<colspec colnum="1" colname="col1" colwidth="1.2*"/>
						<colspec colnum="2" colname="col2" colwidth="1.00*"/>
						<colspec colnum="3" colname="col3" colwidth="1.5*"/>
						<colspec colnum="4" colname="col4" colwidth="1.75*"/>
							<thead>
								<row>
									<entry>Name</entry>
									<entry>Java type</entry>
									<entry>C++ type</entry>
									<entry>Array's shape</entry>
								</row>
							</thead>
							<tbody>
							«FOR attr : table.requiredValueAttributes»
								<row>
									<entry><command>«attr.name»</command></entry>
									<entry>«attr.XMLJavaType»</entry>
									<entry>«attr.XMLCppType»</entry>
									<entry>«IF attr.isArray»«attr.XMLCppTypeDescription»«ELSE»&nsbp;«ENDIF»</entry>
								</row>
							«ENDFOR»
							</tbody>
						</tgroup>
					</informaltable>
					</para>
					«IF table.optionalValueAttributes.size != 0»
					<para>
					Value optional:
					<informaltable>
						<tgroup cols="4">
						<colspec colnum="1" colname="col1" colwidth="1.2*"/>
						<colspec colnum="2" colname="col2" colwidth="1.00*"/>
						<colspec colnum="3" colname="col3" colwidth="1.5*"/>
						<colspec colnum="4" colname="col4" colwidth="1.75*"/>
							<thead>
								<row>
									<entry>Name</entry>
									<entry>Java type</entry>
									<entry>C++ type</entry>
									<entry>Array's shape</entry>
								</row>
							</thead>
							<tbody>
							«FOR attr : table.optionalValueAttributes»
								<row>
									<entry><command>«attr.name»</command></entry>
									<entry>«attr.XMLJavaType»</entry>
									<entry>«attr.XMLCppType»</entry>
									<entry>«IF attr.isArray»«attr.XMLCppTypeDescription»«ELSE»&nsbp;«ENDIF»</entry>
								</row>
							«ENDFOR»
							</tbody>
						</tgroup>
					</informaltable>
					</para>
					«ENDIF»
				
			</section>
	'''
	
	
}