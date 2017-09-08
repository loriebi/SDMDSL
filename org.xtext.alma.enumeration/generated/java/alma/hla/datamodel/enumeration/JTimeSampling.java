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
 * File JTimeSampling.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.TimeSamplingMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the TimeSampling enumeration.
*/ 
public class JTimeSampling {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sSUBINTEGRATION = "SUBINTEGRATION";  /*!< A string definition for SUBINTEGRATION */
	public static final String sINTEGRATION = "INTEGRATION";  /*!< A string definition for INTEGRATION */
	private static final String[] sTimeSamplingSet = {
		sSUBINTEGRATION,
		sINTEGRATION
	};
	
	
	/**
	* Returns the version number of the enumeration TimeSampling.
	*/
	public static int version() { 
		return alma.TimeSamplingMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration TimeSampling.
	*/
	public static String revision() { 
		return alma.TimeSamplingMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in TimeSampling.
	*/
	public static int size() { 
		return sTimeSamplingSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified TimeSampling's enumerator.
	*/
	public static String name(TimeSampling f){
		switch(f.value()){
			case TimeSampling._SUBINTEGRATION : 
				return sSUBINTEGRATION;
			case TimeSampling._INTEGRATION : 
				return sINTEGRATION;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified TimeSampling's enumerator.
	*/
	public static String toString(TimeSampling f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sTimeSamplingSet;
	}
	
	
	/**
	* Returns a TimeSampling's enumerator by specifying its name.
	*/
	public static TimeSampling literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sSUBINTEGRATION)) return TimeSampling.from_int(TimeSampling._SUBINTEGRATION);
		if(name.equals(sINTEGRATION)) return TimeSampling.from_int(TimeSampling._INTEGRATION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a TimeSampling enumeration object by specifying its name
	*/
	public static TimeSampling newTimeSampling(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sSUBINTEGRATION)) return TimeSampling.from_int(TimeSampling._SUBINTEGRATION);
		if(name.equals(sINTEGRATION)) return TimeSampling.from_int(TimeSampling._INTEGRATION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is TimeSampling. 
	 * @parameter value an instance of TimeSampling.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, TimeSampling value) {
			
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


