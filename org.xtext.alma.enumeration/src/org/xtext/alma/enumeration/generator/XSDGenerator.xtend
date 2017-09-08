package org.xtext.alma.enumeration.generator

import org.xtext.alma.enumeration.generator.EnumerationAbstractGenerator
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma

class XSDGenerator extends EnumerationAbstractGenerator {

	override doGenerate(EList<Resource> resources, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (resource : resources) {
			generateXSDFile(resourceToEObject(resource) as EnumType, fsa as EnumerationFileSystemAccess)
		}
	}
	
	def generateXSDFile(EnumType enumType, EnumerationFileSystemAccess enumFsa) {
		enumFsa.file = "xsd/" + enumType.name + ".xsd"
		enumFsa.generateFile(generateXSD(enumType))
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
	
	def generateXSD(EnumType enumType)'''
<?xml version="1.0" encoding="ISO-8859-1"?>
<!--
   ALMA - Atacama Large Millimeter Array
  (c) European Southern Observatory, 2002
  (c) Associated Universities Inc., 2002
  Copyright by ESO (in the framework of the ALMA collaboration),
  Copyright by AUI (in the framework of the ALMA collaboration),
  All rights reserved.
  
   This library is free software; you can redistribute it and/or
   modify it under the terms of the GNU Lesser General Public
   License as published by the Free software Foundation; either
   version 2.1 of the License, or (at your option) any later version.
  
   This library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY, without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   Lesser General Public License for more details.
  
   You should have received a copy of the GNU Lesser General Public
   License along with this library; if not, write to the Free Software
   Foundation, Inc., 59 Temple Place, Suite 330, Boston,
   MA 02111-1307  USA
   
   /////////////////////////////////////////////////////////////////
   // WARNING!  DO NOT MODIFY THIS FILE!                         
   //  
   // This is generated code!  Do not modify this file.  
   // Any changes will be lost when the file is re-generated.
   // 
   /////////////////////////////////////////////////////////////////
  
   File «enumType.name».xsd
 -->
 <xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                          xmlns:«enumType.xmlns»="http://Alma/XENUM/«enumType.name»Mod" 
                          targetNamespace="http://Alma/XENUM/«enumType.name»Mod"
                          attributeFormDefault="qualified" elementFormDefault="unqualified"
                          version="«enumType.version» «enumType.revision»" >  
 	<xsd:simpleType name="«enumType.name»">
 	
			«xsdDocumentation(enumType.docEnum)»
		<xsd:restriction base="xsd:NCName">
		
  	«FOR litteral : enumType.values»
  		«IF litteral instanceof EnumValueWithoutComma»
 		<xsd:enumeration value="«litteral.name»" >	
 	«xsdDocumentation(litteral.doc)»
 			</xsd:enumeration>
 		«ENDIF»
 		«IF litteral instanceof EnumValue»
			<xsd:enumeration value="«litteral.name»" >	
	«xsdDocumentation(litteral.doc)»
 		 	</xsd:enumeration>
 		 «ENDIF»
      «ENDFOR»
		</xsd:restriction>
	</xsd:simpleType>
 
 
 <!--
 	Type for an item constrained by the union of enumerators.
 -->
 	<xsd:simpleType name="«enumType.name»List">
 		<xsd:restriction>
 			<xsd:simpleType>
 				<xsd:list>
 					<xsd:simpleType>
 						<xsd:restriction base="«enumType.xmlns»:«enumType.name»" />
 					</xsd:simpleType>
 				</xsd:list>
 			</xsd:simpleType>
 		</xsd:restriction>
 	</xsd:simpleType>
 	<xsd:simpleType name ="«enumType.name»s">
 		<xsd:restriction base="«enumType.xmlns»:«enumType.name»List">
 			<xsd:maxLength value = "«enumType.values.size»" />
 		</xsd:restriction>
 	</xsd:simpleType>
 </xsd:schema>	
	'''

	def xsdDocumentation(String doc) '''
	«IF doc != null»
		«val doc_ = doc.trim()»
		«IF doc_.startsWith("/*!<")»
			<xsd:annotation>
	«doc_.substring(4, doc_.length - 4)»
			 </xsd:annotation>
		«ELSEIF doc_.startsWith("/*")»
			<xsd:annotation>
	«doc_.substring(2, doc_.length - 2)»
			 </xsd:annotation>
		«ENDIF»			
	«ENDIF»
		
	'''

	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	// returns head of AST
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
	}

}
