package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class IDLGenerator extends EnumerationAbstractGenerator {
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var enumFsa = (fsa as EnumerationFileSystemAccess)
		enumFsa.setFile("idl/almaEnumerations_IF.idl")
		
		// generates IDL file -> almaEnumerations_IF.idl	
		enumFsa.generateFile(input.generateIDLFile)
		
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
	
	
	// function that generates almaEnumerations_IF.idl file
	def generateIDLFile(EList<Resource> input)'''
		/*
		 * ALMA - Atacama Large Millimeter Array
		 * (c) European Southern Observatory, 2002
		 * (c) Associated Universities Inc., 2002
		 * Copyright by ESO (in the framework of the ALMA collaboration),
		 * Copyright by AUI (in the framework of the ALMA collaboration),
		 * All rights reserved.
		 * 
		 * This library is free software; you can redistribute it and/or
		 * modify it under the terms of the GNU Lesser General Public
		 * License as published by the Free software Foundation; either
		 * version 2.1 of the License, or (at your option) any later version.
		 * 
		 * This library is distributed in the hope that it will be useful,
		 * but WITHOUT ANY WARRANTY, without even the implied warranty of
		 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
		 * Lesser General Public License for more details.
		 * 
		 * You should have received a copy of the GNU Lesser General Public
		 * License along with this library; if not, write to the Free Software
		 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,
		 * MA 02111-1307  USA
		 * 
		 * /////////////////////////////////////////////////////////////////
		 * // WARNING!  DO NOT MODIFY THIS FILE!                          //
		 * //  ---------------------------------------------------------  //
		 * // | This is generated code!  Do not modify this file.       | //
		 * // | Any changes will be lost when the file is re-generated. | //
		 * //  ---------------------------------------------------------  //
		 * /////////////////////////////////////////////////////////////////
		 *
		 * File almaEnumerations_IF.idl
		 */
		 
		#ifndef ALMA_DATA_MODEL_ENUMERATION_IDL
		#define ALMA_DATA_MODEL_ENUMERATION_IDL

		#pragma prefix "alma"
		
		/*! 
		  \mainpage Presentation.
		  
		  \section intro Introduction.
		  The different pieces of software related to the ALMA project naturally process or describe data whose types may cover all the range  from the basic types 
		  (integer, float, etc.) up to compound types (arrays, classes...) by using the mechanisms offered by languages like C++, Java, IDL or Python.
		 
		  But there are situations which require the definitions of finite sets of constant values in order to represent properly  ideas like "the set of antenna makers" or
		  "the set of possible antenna types" or  "the set of possible types for the data obtained during an observation". The languages mentioned above allow to create
		  \e enumerated \e types which are \e user \e defined data types consisting of sets of constants called \e enumerations. The creation of an enumerated type actually defines
		  an \e enumeration by its name (e.g. \c  AntennaType) and the set of its enumerators (e.g. \c GROUND_BASED  , \c SPACE_BASED, \c TRACKING_STN).
		 
		 \section enum-desc Enumerations definitions.
		 Given that these enumerations are meant to be shared by all the software's contributors and that the software is for a large part a collection of distributed objects using CORBA
		 as their middleware, IDL seemed to be the natural language to define these enumerations. The documentation which follows this introductory part lists \e all the enumerations 
		 defined for the ALMA project in IDL. For each enumeration it provides its name and information about its nature as well as a commented list of its enumerators. 
		 
		\subsection namspace Encapsulating modules.
		\subsubsection lit-conf Avoid literal conflicts.
		 The possibility to use a same constant as an enumerator in more than one enumeration has been considered as desirable. Consequently each
		 enumeration is \e protected by its own namespace. In IDL this is obtained by defining an encapsulating module for each defined enumeration. The name of 
		 the module is the name of the enumeration suffixed by \c Mod (hence the list of packages in the documentation generated by doxygen).
		 
		 \subsubsection versioning Versioning requirements.
		 Another benefit of encapsulating each enumeration in its own module is related to versioning. The versioning policy defined by the Schema Versioning Function Based Team
		 assumes that each defined type is also formally described in an XML Schema and stipulates that each of those schemas must be qualified by a \e version \e number 
		 and a \e revision \e identifier. In order to be fully useful the versioning information must be shared by the different representations of a same defined type, hence the necessity
		 to intoduce such an information in the IDL representation of the enumerations.  This is done by declaring two constants \c version (int) and \c revision (string) in each module 
		 containing the declaration of an enumeration. 
		 
		 In summary each enumeration  <I>EnumT</I> and its versioning information are packed in a module <I>EnumT</I><tt>Mod</tt> as in the following example :
		 \verbatim
		 module CorrelationModeMod {
		 	 const unsigned long version = 1; 
		 	 const string revision = "1.3";
		 	 
		 	 enum CorrelationMode {
		 	 	CROSS_ONLY ,
		 	 	AUTO_ONLY,
		 	 	CROSS_AND_AUTO
		 	};
		};
		\endverbatim
		
		
		 
		 \subsection howto How to display the  documentation attached to an enumeration.
		 Unfold if necessary the "Package list" in the left window and click on a package name (e.g. %AntennaTypeMod) then you will get the documentation of
		 the selected IDL module (\c %AntennaTypeMod) and of its enclosed enumeration (\c %AntennaType). 
		 
		 \section enum-impl Enumerations implementations.
		 The implementations of the enumerations,  from their IDL descriptions, in different programming languages are obtained by using  the  tools 
		 provided by the project. These tools apply the standard CORBA -> XXX mapping to generate the enumerations implementation in the language XXX 
		 (those mappings are defined at http://www.omg.org/technology/documents/idl2x_spec_catalog.htm).
		 
		 \section enum-helper Helper classes.
		 Helpers classes are generated, above the implementations directly produced by the different compilers IDL -> XXX , to provide the programmers with
		 a level of functionalities as uniform as possible through the different languages -- C++, Java and Python. The APIs documentations of these helpers classes
		 can be read here :
		 <ul>
		 <li><a href="../c++" target="_parent">The C++ helper classes.</a></li>
		  <li><a href="../java" target="_parent">The Java helper classes.</a></li>
		 </ul> 
		
		*/
		
		
		«FOR resource : input» 
		
			«generateIDLModule(resourceToEObject(resource) as EnumType)»

		«ENDFOR»
		
			
		#endif /* ALMA_DATA_MODEL_ENUMERATION_IDL */
	'''
	
	
	// generates IDL module (used in generateIDLFile to generate module for resource)
	def generateIDLModule(EnumType enumType)'''
		/**
		*  A module to encapsulate the enumeration «enumType.name».
		*/
		module «enumType.name»Mod{
			
			const unsigned long version = «enumType.version»; /*!< the major  version number of the enumeration. */
			const string revision = "«enumType.revision»";  /*!< the revision identifier. */
			
			/*! Definition of enumeration «enumType.name» : */
			«IF enumType.docEnum != null»
				/*! «documentation(enumType.docEnum)» 
				 */
			«ENDIF»
			
			enum «enumType.name»{
				«FOR literal : enumType.values SEPARATOR ','»
					«IF literal instanceof EnumValueWithoutComma»
						«literal.name» «IF literal.doc != null» «documentation(literal.doc) »«ENDIF»
					«ENDIF»
					«IF literal instanceof EnumValue»
						«literal.name» «IF literal.doc != null» «documentation(literal.doc) »«ENDIF»
					«ENDIF»
				«ENDFOR»
			};
			
			typedef sequence<«enumType.name»> Sof«enumType.name»;
			typedef sequence<sequence<«enumType.name»> > SofSof«enumType.name»;
			typedef sequence<sequence<sequence<«enumType.name»> > > SofSofSof«enumType.name»;

		};
	'''
	
}