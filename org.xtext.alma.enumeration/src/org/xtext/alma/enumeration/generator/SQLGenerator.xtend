package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class SQLGenerator extends EnumerationAbstractGenerator{
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var enumFsa = (fsa as EnumerationFileSystemAccess)
		enumFsa.setFile("src/sql/createAndPopulateEnumerations.sql")
		
		// generates SQL file -> createAndPopulateEnumerations.sql	
		enumFsa.generateFile(input.generateSQLFile)	
	}
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	// returns head of AST 
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
	}
	
	
	def generateSQLFile(EList<Resource> input)'''
		-- ALMA - Atacama Large Millimeter Array
		-- (c) European Southern Observatory, 2002
		-- (c) Associated Universities Inc., 2002
		-- Copyright by ESO (in the framework of the ALMA collaboration),
		-- Copyright by AUI (in the framework of the ALMA collaboration),
		-- All rights reserved.
		-- 
		-- This library is free software; you can redistribute it and/or
		-- modify it under the terms of the GNU Lesser General Public
		-- License as published by the Free software Foundation; either
		-- version 2.1 of the License, or (at your option) any later version.
		-- 
		-- This library is distributed in the hope that it will be useful,
		-- but WITHOUT ANY WARRANTY, without even the implied warranty of
		-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
		-- Lesser General Public License for more details.
		-- 
		-- You should have received a copy of the GNU Lesser General Public
		-- License along with this library; if not, write to the Free Software
		-- Foundation, Inc., 59 Temple Place, Suite 330, Boston,
		-- MA 02111-1307  USA
		-- 
		-- /////////////////////////////////////////////////////////////////
		-- // WARNING!  DO NOT MODIFY THIS FILE!                          //
		-- //  ---------------------------------------------------------  //
		-- // | This is generated code!  Do not modify this file.       | //
		-- // | Any changes will be lost when the file is re-generated. | //
		-- //  ---------------------------------------------------------  //
		-- /////////////////////////////////////////////////////////////////
				--
		-- File createAndPopulateEnumerations.sql
		
		«FOR resource : input»
			«createAndPopulate(resourceToEObject(resource) as EnumType)»
		«ENDFOR»
	'''
	
	
	def createAndPopulate(EnumType enumType)'''
		--
		-----------------------------------«enumType.name»---------------------------------
		--
		DROP TABLE IF EXISTS ASDM_ENUM_«enumType.name»
		CREATE TABLE ASDM_ENUM_«enumType.name»(
		ID	NUMBER(19)	NOT NULL,
		NAME			VARCHAR2(64)	NOT NULL,
		DESCRIPTION			VARCHAR2(512)	NULL,
		PRIMARY KEY(ID)
		);
		«var index = 0»
		«FOR literal : enumType.values SEPARATOR ','»
			«IF literal instanceof EnumValueWithoutComma»
				INSERT INTO ASDM_ENUM_«enumType.name» (id, name) values («index++», "«literal.name»");
			«ENDIF»
			«IF literal instanceof EnumValue»
				INSERT INTO ASDM_ENUM_«enumType.name» (id, name) values («index++», "«literal.name»");
			«ENDIF»			
		«ENDFOR»
	'''
}