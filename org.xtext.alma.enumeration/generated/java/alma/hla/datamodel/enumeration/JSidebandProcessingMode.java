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
 * File JSidebandProcessingMode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SidebandProcessingModeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SidebandProcessingMode enumeration.
*/ 
public class JSidebandProcessingMode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNONE = "NONE";  /*!< A string definition for NONE */
	public static final String sPHASE_SWITCH_SEPARATION = "PHASE_SWITCH_SEPARATION";  /*!< A string definition for PHASE_SWITCH_SEPARATION */
	public static final String sFREQUENCY_OFFSET_SEPARATION = "FREQUENCY_OFFSET_SEPARATION";  /*!< A string definition for FREQUENCY_OFFSET_SEPARATION */
	public static final String sPHASE_SWITCH_REJECTION = "PHASE_SWITCH_REJECTION";  /*!< A string definition for PHASE_SWITCH_REJECTION */
	public static final String sFREQUENCY_OFFSET_REJECTION = "FREQUENCY_OFFSET_REJECTION";  /*!< A string definition for FREQUENCY_OFFSET_REJECTION */
	private static final String[] sSidebandProcessingModeSet = {
		sNONE,
		sPHASE_SWITCH_SEPARATION,
		sFREQUENCY_OFFSET_SEPARATION,
		sPHASE_SWITCH_REJECTION,
		sFREQUENCY_OFFSET_REJECTION
	};
	
	
	/**
	* Returns the version number of the enumeration SidebandProcessingMode.
	*/
	public static int version() { 
		return alma.SidebandProcessingModeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SidebandProcessingMode.
	*/
	public static String revision() { 
		return alma.SidebandProcessingModeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SidebandProcessingMode.
	*/
	public static int size() { 
		return sSidebandProcessingModeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SidebandProcessingMode's enumerator.
	*/
	public static String name(SidebandProcessingMode f){
		switch(f.value()){
			case SidebandProcessingMode._NONE : 
				return sNONE;
			case SidebandProcessingMode._PHASE_SWITCH_SEPARATION : 
				return sPHASE_SWITCH_SEPARATION;
			case SidebandProcessingMode._FREQUENCY_OFFSET_SEPARATION : 
				return sFREQUENCY_OFFSET_SEPARATION;
			case SidebandProcessingMode._PHASE_SWITCH_REJECTION : 
				return sPHASE_SWITCH_REJECTION;
			case SidebandProcessingMode._FREQUENCY_OFFSET_REJECTION : 
				return sFREQUENCY_OFFSET_REJECTION;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SidebandProcessingMode's enumerator.
	*/
	public static String toString(SidebandProcessingMode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSidebandProcessingModeSet;
	}
	
	
	/**
	* Returns a SidebandProcessingMode's enumerator by specifying its name.
	*/
	public static SidebandProcessingMode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return SidebandProcessingMode.from_int(SidebandProcessingMode._NONE);
		if(name.equals(sPHASE_SWITCH_SEPARATION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._PHASE_SWITCH_SEPARATION);
		if(name.equals(sFREQUENCY_OFFSET_SEPARATION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._FREQUENCY_OFFSET_SEPARATION);
		if(name.equals(sPHASE_SWITCH_REJECTION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._PHASE_SWITCH_REJECTION);
		if(name.equals(sFREQUENCY_OFFSET_REJECTION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._FREQUENCY_OFFSET_REJECTION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SidebandProcessingMode enumeration object by specifying its name
	*/
	public static SidebandProcessingMode newSidebandProcessingMode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return SidebandProcessingMode.from_int(SidebandProcessingMode._NONE);
		if(name.equals(sPHASE_SWITCH_SEPARATION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._PHASE_SWITCH_SEPARATION);
		if(name.equals(sFREQUENCY_OFFSET_SEPARATION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._FREQUENCY_OFFSET_SEPARATION);
		if(name.equals(sPHASE_SWITCH_REJECTION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._PHASE_SWITCH_REJECTION);
		if(name.equals(sFREQUENCY_OFFSET_REJECTION)) return SidebandProcessingMode.from_int(SidebandProcessingMode._FREQUENCY_OFFSET_REJECTION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SidebandProcessingMode. 
	 * @parameter value an instance of SidebandProcessingMode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SidebandProcessingMode value) {
			
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


