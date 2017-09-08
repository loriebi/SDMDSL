package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppIncludes{
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file ASDMEntities.h
		sdmFsa.setFile("include/ASDMEntities.h")
		sdmFsa.generateFile(generateASDMEntities)
		
		// creating and generating file ASDMExceptions.h
		sdmFsa.setFile("include/ASDMExceptions.h")
		sdmFsa.generateFile(generateASDMExceptions)
		
		// creating and generating file ASDMTypes.h
		sdmFsa.setFile("include/ASDMTypes.h")
		sdmFsa.generateFile(generateASDMTypes)
		
		// creating and generating file ASDMAll.h
		sdmFsa.setFile("include/ASDMAll.h")
		sdmFsa.generateFile(generateASDMAll)
	}
	
	
	
	def generateASDMEntities()'''
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
		 * File ASDMEntities.h
		 */
		#ifndef ASDMEntities_h
		#define ASDMEntities_h
		#include <ASDM.h>
		«/*  First the XXXRow.h */»
		«FOR table : container.sortedAlmaTable »
			#include <«table.name»Row.h>
		«ENDFOR»
		«/* Then the XXXTable.h */»
		«FOR table : container.sortedAlmaTable »
			#include <«table.name»Table.h>
		«ENDFOR»
		#endif /* ASDMEntities_h */
	'''
	
	
	
	def generateASDMExceptions()'''
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
		 * File ASDMExceptions.h
		 */
		#ifndef ASDMExceptions_h
		#define ASDMExceptions_h
		#include <ConversionException.h>
		#include <DuplicateKey.h>
		#include <IllegalAccessException.h>
		#include <InvalidArgumentException.h>
		#include <InvalidDataException.h>
		#include <NoSuchRow.h>
		#include <NumberFormatException.h>
		#include <OutOfBoundsException.h>
		#endif /* ASDMExceptions_h */
	'''
	
	
	def generateASDMTypes()'''
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
		 * File ASDMTypes.h
		 */
		
		#ifndef ASDMTypes_h
		#define ASDMTypes_h
		#include <Angle.h>
		#include <AngularRate.h>
		#include <ArrayTime.h>
		#include <ArrayTimeInterval.h>
		#include <BooleanWrapper.h>
		#include <ByteWrapper.h>
		#include <CharacterWrapper.h>
		#include <ComplexWrapper.h>
		#include <DoubleWrapper.h>
		#include <Entity.h>
		#include <EntityId.h>
		#include <EntityRef.h>
		#include <FloatWrapper.h>
		#include <Flux.h>
		#include <Frequency.h>
		#include <Humidity.h>
		#include <IntegerWrapper.h>
		#include <Interval.h>
		#include <Length.h>
		#include <LongWrapper.h>
		#include <PartId.h>
		#include <ShortWrapper.h>
		#include <Speed.h>
		#include <Tag.h>
		#include <Temperature.h>
		#include <UTCCorrection.h>
		#endif /* ASDMTypes_h */
	'''
	
	
	
	def generateASDMAll()'''
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
		 * File ASDMAll.h
		 */
		#ifndef ASDMAll_h
		#define ASDMAll_h
		#include <ASDMTypes.h>
		#include <ASDMExceptions.h>
		#include <ASDMEntities.h>
		#endif /* ASDMAll_h */
	'''
}