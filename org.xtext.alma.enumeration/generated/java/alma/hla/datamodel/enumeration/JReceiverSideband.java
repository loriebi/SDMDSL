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
 * File JReceiverSideband.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.ReceiverSidebandMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the ReceiverSideband enumeration.
*/ 
public class JReceiverSideband {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNOSB = "NOSB";  /*!< A string definition for NOSB */
	public static final String sDSB = "DSB";  /*!< A string definition for DSB */
	public static final String sSSB = "SSB";  /*!< A string definition for SSB */
	public static final String sTSB = "TSB";  /*!< A string definition for TSB */
	private static final String[] sReceiverSidebandSet = {
		sNOSB,
		sDSB,
		sSSB,
		sTSB
	};
	
	
	/**
	* Returns the version number of the enumeration ReceiverSideband.
	*/
	public static int version() { 
		return alma.ReceiverSidebandMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration ReceiverSideband.
	*/
	public static String revision() { 
		return alma.ReceiverSidebandMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in ReceiverSideband.
	*/
	public static int size() { 
		return sReceiverSidebandSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified ReceiverSideband's enumerator.
	*/
	public static String name(ReceiverSideband f){
		switch(f.value()){
			case ReceiverSideband._NOSB : 
				return sNOSB;
			case ReceiverSideband._DSB : 
				return sDSB;
			case ReceiverSideband._SSB : 
				return sSSB;
			case ReceiverSideband._TSB : 
				return sTSB;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified ReceiverSideband's enumerator.
	*/
	public static String toString(ReceiverSideband f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sReceiverSidebandSet;
	}
	
	
	/**
	* Returns a ReceiverSideband's enumerator by specifying its name.
	*/
	public static ReceiverSideband literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOSB)) return ReceiverSideband.from_int(ReceiverSideband._NOSB);
		if(name.equals(sDSB)) return ReceiverSideband.from_int(ReceiverSideband._DSB);
		if(name.equals(sSSB)) return ReceiverSideband.from_int(ReceiverSideband._SSB);
		if(name.equals(sTSB)) return ReceiverSideband.from_int(ReceiverSideband._TSB);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a ReceiverSideband enumeration object by specifying its name
	*/
	public static ReceiverSideband newReceiverSideband(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOSB)) return ReceiverSideband.from_int(ReceiverSideband._NOSB);
		if(name.equals(sDSB)) return ReceiverSideband.from_int(ReceiverSideband._DSB);
		if(name.equals(sSSB)) return ReceiverSideband.from_int(ReceiverSideband._SSB);
		if(name.equals(sTSB)) return ReceiverSideband.from_int(ReceiverSideband._TSB);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is ReceiverSideband. 
	 * @parameter value an instance of ReceiverSideband.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, ReceiverSideband value) {
			
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


