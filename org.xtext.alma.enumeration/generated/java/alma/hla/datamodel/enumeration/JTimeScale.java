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
 * File JTimeScale.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.TimeScaleMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the TimeScale enumeration.
*/ 
public class JTimeScale {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sUTC = "UTC";  /*!< A string definition for UTC */
	public static final String sTAI = "TAI";  /*!< A string definition for TAI */
	private static final String[] sTimeScaleSet = {
		sUTC,
		sTAI
	};
	
	
	/**
	* Returns the version number of the enumeration TimeScale.
	*/
	public static int version() { 
		return alma.TimeScaleMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration TimeScale.
	*/
	public static String revision() { 
		return alma.TimeScaleMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in TimeScale.
	*/
	public static int size() { 
		return sTimeScaleSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified TimeScale's enumerator.
	*/
	public static String name(TimeScale f){
		switch(f.value()){
			case TimeScale._UTC : 
				return sUTC;
			case TimeScale._TAI : 
				return sTAI;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified TimeScale's enumerator.
	*/
	public static String toString(TimeScale f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sTimeScaleSet;
	}
	
	
	/**
	* Returns a TimeScale's enumerator by specifying its name.
	*/
	public static TimeScale literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sUTC)) return TimeScale.from_int(TimeScale._UTC);
		if(name.equals(sTAI)) return TimeScale.from_int(TimeScale._TAI);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a TimeScale enumeration object by specifying its name
	*/
	public static TimeScale newTimeScale(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sUTC)) return TimeScale.from_int(TimeScale._UTC);
		if(name.equals(sTAI)) return TimeScale.from_int(TimeScale._TAI);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is TimeScale. 
	 * @parameter value an instance of TimeScale.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, TimeScale value) {
			
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


