package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class JAVAGenerator extends EnumerationAbstractGenerator {
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		/*
		 * generates java file for each resource
		 */
		for(Resource resource : input){
			doGenerate(resource,fsa,context)
		}
	
	} 
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var enumFsa = (fsa as EnumerationFileSystemAccess)
		
		var enumType = resourceToEObject(resource) as EnumType
		enumFsa.setFile("java/alma/hla/datamodel/enumeration/J" + enumType.name + ".java")
		enumFsa.generateFile(enumType.generateJavaEnumClass)
		
		
	}
	
	// returns head of AST
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
	}	
	
	// function that generates Java class for enumeration
	def generateJavaEnumClass(EnumType enumType)'''
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
		 * File J«enumType.name	».java
		 */		
		package alma.hla.datamodel.enumeration;
		
		import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
		import alma.«enumType.name»Mod.*;
		
		import java.lang.reflect.Array;
		
		/**
		* Extensions to the «enumType.name» enumeration.
		*/ 
		public class J«enumType.name» {
			/**
			* Individual static String declarations for each enumerator.
			*/
			«FOR literal : enumType.values»
				«IF literal instanceof EnumValueWithoutComma»
					public static final String s«literal.name» = "«literal.name»";  /*!< A string definition for «literal.name» */
				«ENDIF»
				«IF literal instanceof EnumValue»
					public static final String s«literal.name» = "«literal.name»";  /*!< A string definition for «literal.name» */
				«ENDIF»
			«ENDFOR»
			private static final String[] s«enumType.name»Set = {
				«FOR literal : enumType.values SEPARATOR ','»
					«IF literal instanceof EnumValueWithoutComma»
						s«literal.name»
					«ENDIF»
					«IF literal instanceof EnumValue»
						s«literal.name»
					«ENDIF»
				«ENDFOR»
			};
			
			
			/**
			* Returns the version number of the enumeration «enumType.name».
			*/
			public static int version() { 
				return alma.«enumType.name»Mod.version.value;
			}
			
			
			/**
			* Returns the revision number of the enumeration «enumType.name».
			*/
			public static String revision() { 
				return alma.«enumType.name»Mod.revision.value;
			}
			
		
			/**
			* Returns the number of enumerators defined in «enumType.name».
			*/
			public static int size() { 
				return s«enumType.name»Set.length;
			}
			
			
			/**
			* Return the string name associated with the specified «enumType.name»'s enumerator.
			*/
			public static String name(«enumType.name» f){
				switch(f.value()){
					«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						case «enumType.name»._«literal.name» : 
							return s«literal.name»;
					«ENDIF»
					«IF literal instanceof EnumValue»
						case «enumType.name»._«literal.name» : 
							return s«literal.name»;
					«ENDIF»
					«ENDFOR»
				}
				return "";
			}
			
			
			/**
		 	* An alternate, Java-style way of getting the string name associated 
			* with the specified «enumType.name»'s enumerator.
			*/
			public static String toString(«enumType.name» f) {
				return name(f);
			}
			
			
			/**
			* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
			* than the enumerators are declared in the enumeration.
			*/
			public static String[] names() {
				return s«enumType.name»Set;
			}
			
			
			/**
			* Returns a «enumType.name»'s enumerator by specifying its name.
			*/
			public static «enumType.name» literal(String name) throws AcsJBadParameterEx {
				
				«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						if(name.equals(s«literal.name»)) return «enumType.name».from_int(«enumType.name»._«literal.name»);
					«ENDIF»
					«IF literal instanceof EnumValue»
						if(name.equals(s«literal.name»)) return «enumType.name».from_int(«enumType.name»._«literal.name»);
					«ENDIF»
				«ENDFOR»
				
				throw new AcsJBadParameterEx();
			}
			
			
			/**
			* Create a «enumType.name» enumeration object by specifying its name
			*/
			public static «enumType.name» new«enumType.name»(String name) throws AcsJBadParameterEx {
				
				«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						if(name.equals(s«literal.name»)) return «enumType.name».from_int(«enumType.name»._«literal.name»);
					«ENDIF»
					«IF literal instanceof EnumValue»
						if(name.equals(s«literal.name»)) return «enumType.name».from_int(«enumType.name»._«literal.name»);
					«ENDIF»
				«ENDFOR»
				
				throw new AcsJBadParameterEx();
			}
			
			
			/*
			 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
			 * @parameter a an Object which is expected to be an array whose base type is «enumType.name». 
			 * @parameter value an instance of «enumType.name».
			 * @returns a with all its elements set to value.
			 */
			static public Object setArray(Object a, «enumType.name» value) {
					
				if ( a == null )  return (Object) value;
					
				String aCName = a.getClass().getName();
				System.out.println( aCName);
				if (aCName.charAt(0) == '[') {
					// Yes a is an array.
					for (int i = 0; i < Array.getLength(a); i++)
						Array.set(a, i, setArray( Array.get(a, i), value));
				}else{
					// No a is a scalar
					a =  value;
				}
					
				return a;
			} 
			
			
			
		}
		
		
	'''
		
	
	

}