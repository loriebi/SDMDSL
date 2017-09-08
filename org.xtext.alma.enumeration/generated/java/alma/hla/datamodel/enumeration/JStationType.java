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
 * File JStationType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.StationTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the StationType enumeration.
*/ 
public class JStationType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sANTENNA_PAD = "ANTENNA_PAD";  /*!< A string definition for ANTENNA_PAD */
	public static final String sMAINTENANCE_PAD = "MAINTENANCE_PAD";  /*!< A string definition for MAINTENANCE_PAD */
	public static final String sWEATHER_STATION = "WEATHER_STATION";  /*!< A string definition for WEATHER_STATION */
	private static final String[] sStationTypeSet = {
		sANTENNA_PAD,
		sMAINTENANCE_PAD,
		sWEATHER_STATION
	};
	
	
	/**
	* Returns the version number of the enumeration StationType.
	*/
	public static int version() { 
		return alma.StationTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration StationType.
	*/
	public static String revision() { 
		return alma.StationTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in StationType.
	*/
	public static int size() { 
		return sStationTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified StationType's enumerator.
	*/
	public static String name(StationType f){
		switch(f.value()){
			case StationType._ANTENNA_PAD : 
				return sANTENNA_PAD;
			case StationType._MAINTENANCE_PAD : 
				return sMAINTENANCE_PAD;
			case StationType._WEATHER_STATION : 
				return sWEATHER_STATION;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified StationType's enumerator.
	*/
	public static String toString(StationType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sStationTypeSet;
	}
	
	
	/**
	* Returns a StationType's enumerator by specifying its name.
	*/
	public static StationType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sANTENNA_PAD)) return StationType.from_int(StationType._ANTENNA_PAD);
		if(name.equals(sMAINTENANCE_PAD)) return StationType.from_int(StationType._MAINTENANCE_PAD);
		if(name.equals(sWEATHER_STATION)) return StationType.from_int(StationType._WEATHER_STATION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a StationType enumeration object by specifying its name
	*/
	public static StationType newStationType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sANTENNA_PAD)) return StationType.from_int(StationType._ANTENNA_PAD);
		if(name.equals(sMAINTENANCE_PAD)) return StationType.from_int(StationType._MAINTENANCE_PAD);
		if(name.equals(sWEATHER_STATION)) return StationType.from_int(StationType._WEATHER_STATION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is StationType. 
	 * @parameter value an instance of StationType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, StationType value) {
			
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


