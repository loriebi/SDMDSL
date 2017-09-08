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
 * File JSwitchingMode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SwitchingModeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SwitchingMode enumeration.
*/ 
public class JSwitchingMode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNO_SWITCHING = "NO_SWITCHING";  /*!< A string definition for NO_SWITCHING */
	public static final String sLOAD_SWITCHING = "LOAD_SWITCHING";  /*!< A string definition for LOAD_SWITCHING */
	public static final String sPOSITION_SWITCHING = "POSITION_SWITCHING";  /*!< A string definition for POSITION_SWITCHING */
	public static final String sPHASE_SWITCHING = "PHASE_SWITCHING";  /*!< A string definition for PHASE_SWITCHING */
	public static final String sFREQUENCY_SWITCHING = "FREQUENCY_SWITCHING";  /*!< A string definition for FREQUENCY_SWITCHING */
	public static final String sNUTATOR_SWITCHING = "NUTATOR_SWITCHING";  /*!< A string definition for NUTATOR_SWITCHING */
	public static final String sCHOPPER_WHEEL = "CHOPPER_WHEEL";  /*!< A string definition for CHOPPER_WHEEL */
	private static final String[] sSwitchingModeSet = {
		sNO_SWITCHING,
		sLOAD_SWITCHING,
		sPOSITION_SWITCHING,
		sPHASE_SWITCHING,
		sFREQUENCY_SWITCHING,
		sNUTATOR_SWITCHING,
		sCHOPPER_WHEEL
	};
	
	
	/**
	* Returns the version number of the enumeration SwitchingMode.
	*/
	public static int version() { 
		return alma.SwitchingModeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SwitchingMode.
	*/
	public static String revision() { 
		return alma.SwitchingModeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SwitchingMode.
	*/
	public static int size() { 
		return sSwitchingModeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SwitchingMode's enumerator.
	*/
	public static String name(SwitchingMode f){
		switch(f.value()){
			case SwitchingMode._NO_SWITCHING : 
				return sNO_SWITCHING;
			case SwitchingMode._LOAD_SWITCHING : 
				return sLOAD_SWITCHING;
			case SwitchingMode._POSITION_SWITCHING : 
				return sPOSITION_SWITCHING;
			case SwitchingMode._PHASE_SWITCHING : 
				return sPHASE_SWITCHING;
			case SwitchingMode._FREQUENCY_SWITCHING : 
				return sFREQUENCY_SWITCHING;
			case SwitchingMode._NUTATOR_SWITCHING : 
				return sNUTATOR_SWITCHING;
			case SwitchingMode._CHOPPER_WHEEL : 
				return sCHOPPER_WHEEL;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SwitchingMode's enumerator.
	*/
	public static String toString(SwitchingMode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSwitchingModeSet;
	}
	
	
	/**
	* Returns a SwitchingMode's enumerator by specifying its name.
	*/
	public static SwitchingMode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNO_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._NO_SWITCHING);
		if(name.equals(sLOAD_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._LOAD_SWITCHING);
		if(name.equals(sPOSITION_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._POSITION_SWITCHING);
		if(name.equals(sPHASE_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._PHASE_SWITCHING);
		if(name.equals(sFREQUENCY_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._FREQUENCY_SWITCHING);
		if(name.equals(sNUTATOR_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._NUTATOR_SWITCHING);
		if(name.equals(sCHOPPER_WHEEL)) return SwitchingMode.from_int(SwitchingMode._CHOPPER_WHEEL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SwitchingMode enumeration object by specifying its name
	*/
	public static SwitchingMode newSwitchingMode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNO_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._NO_SWITCHING);
		if(name.equals(sLOAD_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._LOAD_SWITCHING);
		if(name.equals(sPOSITION_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._POSITION_SWITCHING);
		if(name.equals(sPHASE_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._PHASE_SWITCHING);
		if(name.equals(sFREQUENCY_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._FREQUENCY_SWITCHING);
		if(name.equals(sNUTATOR_SWITCHING)) return SwitchingMode.from_int(SwitchingMode._NUTATOR_SWITCHING);
		if(name.equals(sCHOPPER_WHEEL)) return SwitchingMode.from_int(SwitchingMode._CHOPPER_WHEEL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SwitchingMode. 
	 * @parameter value an instance of SwitchingMode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SwitchingMode value) {
			
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


