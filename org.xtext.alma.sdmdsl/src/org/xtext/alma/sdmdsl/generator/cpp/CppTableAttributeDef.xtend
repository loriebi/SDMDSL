package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.ASDMAttribute

class CppTableAttributeDef {
	
	def doGenerate(ASDMAttribute attr)'''
		«IF attr.isOptional»
			// ===> Attribute «attr.name», which is optional
		«ELSE»
			// ===> Attribute «attr.name»
		«ENDIF»
		«IF attr.isOptional»
			bool «attr.name»Exists;
		«ENDIF»
		
		
		«attr.CppType» «attr.name»;
		
		«IF attr.isAutoIncrementable»
			/**
			 * Set «attr.name» with the specified «attr.CppType» value.
			 * @param «attr.name» The «attr.CppType» value to which «attr.name» is to be set.
			«IF !attr.isOptional»
				«IF attr.isKey» * @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.«ENDIF»
				 */
				void set«attr.UpperCaseName» («attr.CppType» «attr.name»);
			«ELSE»
				 */
				void set«attr.UpperCaseName» («attr.CppType» «attr.name»);
			«ENDIF»
		«ENDIF»
	'''
	
}