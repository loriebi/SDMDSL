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
 * File JAntennaType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.AntennaTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the AntennaType enumeration.
*/ 
public class JAntennaType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sGROUND_BASED = "GROUND_BASED";  /*!< A string definition for GROUND_BASED */
	public static final String sSPACE_BASED = "SPACE_BASED";  /*!< A string definition for SPACE_BASED */
	public static final String sTRACKING_STN = "TRACKING_STN";  /*!< A string definition for TRACKING_STN */
	private static final String[] sAntennaTypeSet = {
		sGROUND_BASED,
		sSPACE_BASED,
		sTRACKING_STN
	};
	
	
	/**
	* Returns the version number of the enumeration AntennaType.
	*/
	public static int version() { 
		return alma.AntennaTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration AntennaType.
	*/
	public static String revision() { 
		return alma.AntennaTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in AntennaType.
	*/
	public static int size() { 
		return sAntennaTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified AntennaType's enumerator.
	*/
	public static String name(AntennaType f){
		switch(f.value()){
			case AntennaType._GROUND_BASED : 
				return sGROUND_BASED;
			case AntennaType._SPACE_BASED : 
				return sSPACE_BASED;
			case AntennaType._TRACKING_STN : 
				return sTRACKING_STN;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified AntennaType's enumerator.
	*/
	public static String toString(AntennaType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sAntennaTypeSet;
	}
	
	
	/**
	* Returns a AntennaType's enumerator by specifying its name.
	*/
	public static AntennaType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sGROUND_BASED)) return AntennaType.from_int(AntennaType._GROUND_BASED);
		if(name.equals(sSPACE_BASED)) return AntennaType.from_int(AntennaType._SPACE_BASED);
		if(name.equals(sTRACKING_STN)) return AntennaType.from_int(AntennaType._TRACKING_STN);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a AntennaType enumeration object by specifying its name
	*/
	public static AntennaType newAntennaType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sGROUND_BASED)) return AntennaType.from_int(AntennaType._GROUND_BASED);
		if(name.equals(sSPACE_BASED)) return AntennaType.from_int(AntennaType._SPACE_BASED);
		if(name.equals(sTRACKING_STN)) return AntennaType.from_int(AntennaType._TRACKING_STN);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is AntennaType. 
	 * @parameter value an instance of AntennaType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, AntennaType value) {
			
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


