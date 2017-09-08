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
 * File JSchedulerMode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SchedulerModeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SchedulerMode enumeration.
*/ 
public class JSchedulerMode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sDYNAMIC = "DYNAMIC";  /*!< A string definition for DYNAMIC */
	public static final String sINTERACTIVE = "INTERACTIVE";  /*!< A string definition for INTERACTIVE */
	public static final String sMANUAL = "MANUAL";  /*!< A string definition for MANUAL */
	public static final String sQUEUED = "QUEUED";  /*!< A string definition for QUEUED */
	private static final String[] sSchedulerModeSet = {
		sDYNAMIC,
		sINTERACTIVE,
		sMANUAL,
		sQUEUED
	};
	
	
	/**
	* Returns the version number of the enumeration SchedulerMode.
	*/
	public static int version() { 
		return alma.SchedulerModeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SchedulerMode.
	*/
	public static String revision() { 
		return alma.SchedulerModeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SchedulerMode.
	*/
	public static int size() { 
		return sSchedulerModeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SchedulerMode's enumerator.
	*/
	public static String name(SchedulerMode f){
		switch(f.value()){
			case SchedulerMode._DYNAMIC : 
				return sDYNAMIC;
			case SchedulerMode._INTERACTIVE : 
				return sINTERACTIVE;
			case SchedulerMode._MANUAL : 
				return sMANUAL;
			case SchedulerMode._QUEUED : 
				return sQUEUED;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SchedulerMode's enumerator.
	*/
	public static String toString(SchedulerMode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSchedulerModeSet;
	}
	
	
	/**
	* Returns a SchedulerMode's enumerator by specifying its name.
	*/
	public static SchedulerMode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sDYNAMIC)) return SchedulerMode.from_int(SchedulerMode._DYNAMIC);
		if(name.equals(sINTERACTIVE)) return SchedulerMode.from_int(SchedulerMode._INTERACTIVE);
		if(name.equals(sMANUAL)) return SchedulerMode.from_int(SchedulerMode._MANUAL);
		if(name.equals(sQUEUED)) return SchedulerMode.from_int(SchedulerMode._QUEUED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SchedulerMode enumeration object by specifying its name
	*/
	public static SchedulerMode newSchedulerMode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sDYNAMIC)) return SchedulerMode.from_int(SchedulerMode._DYNAMIC);
		if(name.equals(sINTERACTIVE)) return SchedulerMode.from_int(SchedulerMode._INTERACTIVE);
		if(name.equals(sMANUAL)) return SchedulerMode.from_int(SchedulerMode._MANUAL);
		if(name.equals(sQUEUED)) return SchedulerMode.from_int(SchedulerMode._QUEUED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SchedulerMode. 
	 * @parameter value an instance of SchedulerMode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SchedulerMode value) {
			
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


