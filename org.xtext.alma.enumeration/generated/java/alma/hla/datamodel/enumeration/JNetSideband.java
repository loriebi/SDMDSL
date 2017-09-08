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
 * File JNetSideband.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.NetSidebandMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the NetSideband enumeration.
*/ 
public class JNetSideband {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNOSB = "NOSB";  /*!< A string definition for NOSB */
	public static final String sLSB = "LSB";  /*!< A string definition for LSB */
	public static final String sUSB = "USB";  /*!< A string definition for USB */
	public static final String sDSB = "DSB";  /*!< A string definition for DSB */
	private static final String[] sNetSidebandSet = {
		sNOSB,
		sLSB,
		sUSB,
		sDSB
	};
	
	
	/**
	* Returns the version number of the enumeration NetSideband.
	*/
	public static int version() { 
		return alma.NetSidebandMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration NetSideband.
	*/
	public static String revision() { 
		return alma.NetSidebandMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in NetSideband.
	*/
	public static int size() { 
		return sNetSidebandSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified NetSideband's enumerator.
	*/
	public static String name(NetSideband f){
		switch(f.value()){
			case NetSideband._NOSB : 
				return sNOSB;
			case NetSideband._LSB : 
				return sLSB;
			case NetSideband._USB : 
				return sUSB;
			case NetSideband._DSB : 
				return sDSB;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified NetSideband's enumerator.
	*/
	public static String toString(NetSideband f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sNetSidebandSet;
	}
	
	
	/**
	* Returns a NetSideband's enumerator by specifying its name.
	*/
	public static NetSideband literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOSB)) return NetSideband.from_int(NetSideband._NOSB);
		if(name.equals(sLSB)) return NetSideband.from_int(NetSideband._LSB);
		if(name.equals(sUSB)) return NetSideband.from_int(NetSideband._USB);
		if(name.equals(sDSB)) return NetSideband.from_int(NetSideband._DSB);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a NetSideband enumeration object by specifying its name
	*/
	public static NetSideband newNetSideband(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOSB)) return NetSideband.from_int(NetSideband._NOSB);
		if(name.equals(sLSB)) return NetSideband.from_int(NetSideband._LSB);
		if(name.equals(sUSB)) return NetSideband.from_int(NetSideband._USB);
		if(name.equals(sDSB)) return NetSideband.from_int(NetSideband._DSB);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is NetSideband. 
	 * @parameter value an instance of NetSideband.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, NetSideband value) {
			
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


