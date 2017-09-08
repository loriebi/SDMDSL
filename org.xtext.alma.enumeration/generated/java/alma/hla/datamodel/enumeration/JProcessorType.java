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
 * File JProcessorType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.ProcessorTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the ProcessorType enumeration.
*/ 
public class JProcessorType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sCORRELATOR = "CORRELATOR";  /*!< A string definition for CORRELATOR */
	public static final String sRADIOMETER = "RADIOMETER";  /*!< A string definition for RADIOMETER */
	public static final String sSPECTROMETER = "SPECTROMETER";  /*!< A string definition for SPECTROMETER */
	private static final String[] sProcessorTypeSet = {
		sCORRELATOR,
		sRADIOMETER,
		sSPECTROMETER
	};
	
	
	/**
	* Returns the version number of the enumeration ProcessorType.
	*/
	public static int version() { 
		return alma.ProcessorTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration ProcessorType.
	*/
	public static String revision() { 
		return alma.ProcessorTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in ProcessorType.
	*/
	public static int size() { 
		return sProcessorTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified ProcessorType's enumerator.
	*/
	public static String name(ProcessorType f){
		switch(f.value()){
			case ProcessorType._CORRELATOR : 
				return sCORRELATOR;
			case ProcessorType._RADIOMETER : 
				return sRADIOMETER;
			case ProcessorType._SPECTROMETER : 
				return sSPECTROMETER;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified ProcessorType's enumerator.
	*/
	public static String toString(ProcessorType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sProcessorTypeSet;
	}
	
	
	/**
	* Returns a ProcessorType's enumerator by specifying its name.
	*/
	public static ProcessorType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCORRELATOR)) return ProcessorType.from_int(ProcessorType._CORRELATOR);
		if(name.equals(sRADIOMETER)) return ProcessorType.from_int(ProcessorType._RADIOMETER);
		if(name.equals(sSPECTROMETER)) return ProcessorType.from_int(ProcessorType._SPECTROMETER);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a ProcessorType enumeration object by specifying its name
	*/
	public static ProcessorType newProcessorType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCORRELATOR)) return ProcessorType.from_int(ProcessorType._CORRELATOR);
		if(name.equals(sRADIOMETER)) return ProcessorType.from_int(ProcessorType._RADIOMETER);
		if(name.equals(sSPECTROMETER)) return ProcessorType.from_int(ProcessorType._SPECTROMETER);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is ProcessorType. 
	 * @parameter value an instance of ProcessorType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, ProcessorType value) {
			
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


