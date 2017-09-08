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
 * File JDopplerTrackingMode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.DopplerTrackingModeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the DopplerTrackingMode enumeration.
*/ 
public class JDopplerTrackingMode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNONE = "NONE";  /*!< A string definition for NONE */
	public static final String sCONTINUOUS = "CONTINUOUS";  /*!< A string definition for CONTINUOUS */
	public static final String sSCAN_BASED = "SCAN_BASED";  /*!< A string definition for SCAN_BASED */
	public static final String sSB_BASED = "SB_BASED";  /*!< A string definition for SB_BASED */
	private static final String[] sDopplerTrackingModeSet = {
		sNONE,
		sCONTINUOUS,
		sSCAN_BASED,
		sSB_BASED
	};
	
	
	/**
	* Returns the version number of the enumeration DopplerTrackingMode.
	*/
	public static int version() { 
		return alma.DopplerTrackingModeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration DopplerTrackingMode.
	*/
	public static String revision() { 
		return alma.DopplerTrackingModeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in DopplerTrackingMode.
	*/
	public static int size() { 
		return sDopplerTrackingModeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified DopplerTrackingMode's enumerator.
	*/
	public static String name(DopplerTrackingMode f){
		switch(f.value()){
			case DopplerTrackingMode._NONE : 
				return sNONE;
			case DopplerTrackingMode._CONTINUOUS : 
				return sCONTINUOUS;
			case DopplerTrackingMode._SCAN_BASED : 
				return sSCAN_BASED;
			case DopplerTrackingMode._SB_BASED : 
				return sSB_BASED;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified DopplerTrackingMode's enumerator.
	*/
	public static String toString(DopplerTrackingMode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sDopplerTrackingModeSet;
	}
	
	
	/**
	* Returns a DopplerTrackingMode's enumerator by specifying its name.
	*/
	public static DopplerTrackingMode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return DopplerTrackingMode.from_int(DopplerTrackingMode._NONE);
		if(name.equals(sCONTINUOUS)) return DopplerTrackingMode.from_int(DopplerTrackingMode._CONTINUOUS);
		if(name.equals(sSCAN_BASED)) return DopplerTrackingMode.from_int(DopplerTrackingMode._SCAN_BASED);
		if(name.equals(sSB_BASED)) return DopplerTrackingMode.from_int(DopplerTrackingMode._SB_BASED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a DopplerTrackingMode enumeration object by specifying its name
	*/
	public static DopplerTrackingMode newDopplerTrackingMode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return DopplerTrackingMode.from_int(DopplerTrackingMode._NONE);
		if(name.equals(sCONTINUOUS)) return DopplerTrackingMode.from_int(DopplerTrackingMode._CONTINUOUS);
		if(name.equals(sSCAN_BASED)) return DopplerTrackingMode.from_int(DopplerTrackingMode._SCAN_BASED);
		if(name.equals(sSB_BASED)) return DopplerTrackingMode.from_int(DopplerTrackingMode._SB_BASED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is DopplerTrackingMode. 
	 * @parameter value an instance of DopplerTrackingMode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, DopplerTrackingMode value) {
			
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


