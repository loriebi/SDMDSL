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
 * File JSpectralResolutionType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SpectralResolutionTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SpectralResolutionType enumeration.
*/ 
public class JSpectralResolutionType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sCHANNEL_AVERAGE = "CHANNEL_AVERAGE";  /*!< A string definition for CHANNEL_AVERAGE */
	public static final String sBASEBAND_WIDE = "BASEBAND_WIDE";  /*!< A string definition for BASEBAND_WIDE */
	public static final String sFULL_RESOLUTION = "FULL_RESOLUTION";  /*!< A string definition for FULL_RESOLUTION */
	private static final String[] sSpectralResolutionTypeSet = {
		sCHANNEL_AVERAGE,
		sBASEBAND_WIDE,
		sFULL_RESOLUTION
	};
	
	
	/**
	* Returns the version number of the enumeration SpectralResolutionType.
	*/
	public static int version() { 
		return alma.SpectralResolutionTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SpectralResolutionType.
	*/
	public static String revision() { 
		return alma.SpectralResolutionTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SpectralResolutionType.
	*/
	public static int size() { 
		return sSpectralResolutionTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SpectralResolutionType's enumerator.
	*/
	public static String name(SpectralResolutionType f){
		switch(f.value()){
			case SpectralResolutionType._CHANNEL_AVERAGE : 
				return sCHANNEL_AVERAGE;
			case SpectralResolutionType._BASEBAND_WIDE : 
				return sBASEBAND_WIDE;
			case SpectralResolutionType._FULL_RESOLUTION : 
				return sFULL_RESOLUTION;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SpectralResolutionType's enumerator.
	*/
	public static String toString(SpectralResolutionType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSpectralResolutionTypeSet;
	}
	
	
	/**
	* Returns a SpectralResolutionType's enumerator by specifying its name.
	*/
	public static SpectralResolutionType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCHANNEL_AVERAGE)) return SpectralResolutionType.from_int(SpectralResolutionType._CHANNEL_AVERAGE);
		if(name.equals(sBASEBAND_WIDE)) return SpectralResolutionType.from_int(SpectralResolutionType._BASEBAND_WIDE);
		if(name.equals(sFULL_RESOLUTION)) return SpectralResolutionType.from_int(SpectralResolutionType._FULL_RESOLUTION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SpectralResolutionType enumeration object by specifying its name
	*/
	public static SpectralResolutionType newSpectralResolutionType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCHANNEL_AVERAGE)) return SpectralResolutionType.from_int(SpectralResolutionType._CHANNEL_AVERAGE);
		if(name.equals(sBASEBAND_WIDE)) return SpectralResolutionType.from_int(SpectralResolutionType._BASEBAND_WIDE);
		if(name.equals(sFULL_RESOLUTION)) return SpectralResolutionType.from_int(SpectralResolutionType._FULL_RESOLUTION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SpectralResolutionType. 
	 * @parameter value an instance of SpectralResolutionType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SpectralResolutionType value) {
			
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


