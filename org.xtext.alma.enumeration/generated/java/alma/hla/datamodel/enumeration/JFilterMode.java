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
 * File JFilterMode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.FilterModeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the FilterMode enumeration.
*/ 
public class JFilterMode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sFILTER_NA = "FILTER_NA";  /*!< A string definition for FILTER_NA */
	public static final String sFILTER_TDM = "FILTER_TDM";  /*!< A string definition for FILTER_TDM */
	public static final String sFILTER_TFB = "FILTER_TFB";  /*!< A string definition for FILTER_TFB */
	public static final String sUNDEFINED = "UNDEFINED";  /*!< A string definition for UNDEFINED */
	private static final String[] sFilterModeSet = {
		sFILTER_NA,
		sFILTER_TDM,
		sFILTER_TFB,
		sUNDEFINED
	};
	
	
	/**
	* Returns the version number of the enumeration FilterMode.
	*/
	public static int version() { 
		return alma.FilterModeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration FilterMode.
	*/
	public static String revision() { 
		return alma.FilterModeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in FilterMode.
	*/
	public static int size() { 
		return sFilterModeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified FilterMode's enumerator.
	*/
	public static String name(FilterMode f){
		switch(f.value()){
			case FilterMode._FILTER_NA : 
				return sFILTER_NA;
			case FilterMode._FILTER_TDM : 
				return sFILTER_TDM;
			case FilterMode._FILTER_TFB : 
				return sFILTER_TFB;
			case FilterMode._UNDEFINED : 
				return sUNDEFINED;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified FilterMode's enumerator.
	*/
	public static String toString(FilterMode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sFilterModeSet;
	}
	
	
	/**
	* Returns a FilterMode's enumerator by specifying its name.
	*/
	public static FilterMode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sFILTER_NA)) return FilterMode.from_int(FilterMode._FILTER_NA);
		if(name.equals(sFILTER_TDM)) return FilterMode.from_int(FilterMode._FILTER_TDM);
		if(name.equals(sFILTER_TFB)) return FilterMode.from_int(FilterMode._FILTER_TFB);
		if(name.equals(sUNDEFINED)) return FilterMode.from_int(FilterMode._UNDEFINED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a FilterMode enumeration object by specifying its name
	*/
	public static FilterMode newFilterMode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sFILTER_NA)) return FilterMode.from_int(FilterMode._FILTER_NA);
		if(name.equals(sFILTER_TDM)) return FilterMode.from_int(FilterMode._FILTER_TDM);
		if(name.equals(sFILTER_TFB)) return FilterMode.from_int(FilterMode._FILTER_TFB);
		if(name.equals(sUNDEFINED)) return FilterMode.from_int(FilterMode._UNDEFINED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is FilterMode. 
	 * @parameter value an instance of FilterMode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, FilterMode value) {
			
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


