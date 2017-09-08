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
 * File JProcessorSubType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.ProcessorSubTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the ProcessorSubType enumeration.
*/ 
public class JProcessorSubType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sALMA_CORRELATOR_MODE = "ALMA_CORRELATOR_MODE";  /*!< A string definition for ALMA_CORRELATOR_MODE */
	public static final String sSQUARE_LAW_DETECTOR = "SQUARE_LAW_DETECTOR";  /*!< A string definition for SQUARE_LAW_DETECTOR */
	public static final String sHOLOGRAPHY = "HOLOGRAPHY";  /*!< A string definition for HOLOGRAPHY */
	public static final String sALMA_RADIOMETER = "ALMA_RADIOMETER";  /*!< A string definition for ALMA_RADIOMETER */
	private static final String[] sProcessorSubTypeSet = {
		sALMA_CORRELATOR_MODE,
		sSQUARE_LAW_DETECTOR,
		sHOLOGRAPHY,
		sALMA_RADIOMETER
	};
	
	
	/**
	* Returns the version number of the enumeration ProcessorSubType.
	*/
	public static int version() { 
		return alma.ProcessorSubTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration ProcessorSubType.
	*/
	public static String revision() { 
		return alma.ProcessorSubTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in ProcessorSubType.
	*/
	public static int size() { 
		return sProcessorSubTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified ProcessorSubType's enumerator.
	*/
	public static String name(ProcessorSubType f){
		switch(f.value()){
			case ProcessorSubType._ALMA_CORRELATOR_MODE : 
				return sALMA_CORRELATOR_MODE;
			case ProcessorSubType._SQUARE_LAW_DETECTOR : 
				return sSQUARE_LAW_DETECTOR;
			case ProcessorSubType._HOLOGRAPHY : 
				return sHOLOGRAPHY;
			case ProcessorSubType._ALMA_RADIOMETER : 
				return sALMA_RADIOMETER;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified ProcessorSubType's enumerator.
	*/
	public static String toString(ProcessorSubType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sProcessorSubTypeSet;
	}
	
	
	/**
	* Returns a ProcessorSubType's enumerator by specifying its name.
	*/
	public static ProcessorSubType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sALMA_CORRELATOR_MODE)) return ProcessorSubType.from_int(ProcessorSubType._ALMA_CORRELATOR_MODE);
		if(name.equals(sSQUARE_LAW_DETECTOR)) return ProcessorSubType.from_int(ProcessorSubType._SQUARE_LAW_DETECTOR);
		if(name.equals(sHOLOGRAPHY)) return ProcessorSubType.from_int(ProcessorSubType._HOLOGRAPHY);
		if(name.equals(sALMA_RADIOMETER)) return ProcessorSubType.from_int(ProcessorSubType._ALMA_RADIOMETER);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a ProcessorSubType enumeration object by specifying its name
	*/
	public static ProcessorSubType newProcessorSubType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sALMA_CORRELATOR_MODE)) return ProcessorSubType.from_int(ProcessorSubType._ALMA_CORRELATOR_MODE);
		if(name.equals(sSQUARE_LAW_DETECTOR)) return ProcessorSubType.from_int(ProcessorSubType._SQUARE_LAW_DETECTOR);
		if(name.equals(sHOLOGRAPHY)) return ProcessorSubType.from_int(ProcessorSubType._HOLOGRAPHY);
		if(name.equals(sALMA_RADIOMETER)) return ProcessorSubType.from_int(ProcessorSubType._ALMA_RADIOMETER);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is ProcessorSubType. 
	 * @parameter value an instance of ProcessorSubType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, ProcessorSubType value) {
			
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


