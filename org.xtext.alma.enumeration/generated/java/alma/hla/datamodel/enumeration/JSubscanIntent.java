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
 * File JSubscanIntent.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SubscanIntentMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SubscanIntent enumeration.
*/ 
public class JSubscanIntent {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sON_SOURCE = "ON_SOURCE";  /*!< A string definition for ON_SOURCE */
	public static final String sOFF_SOURCE = "OFF_SOURCE";  /*!< A string definition for OFF_SOURCE */
	public static final String sMIXED = "MIXED";  /*!< A string definition for MIXED */
	public static final String sREFERENCE = "REFERENCE";  /*!< A string definition for REFERENCE */
	public static final String sSCANNING = "SCANNING";  /*!< A string definition for SCANNING */
	public static final String sHOT = "HOT";  /*!< A string definition for HOT */
	public static final String sAMBIENT = "AMBIENT";  /*!< A string definition for AMBIENT */
	public static final String sSIGNAL = "SIGNAL";  /*!< A string definition for SIGNAL */
	public static final String sIMAGE = "IMAGE";  /*!< A string definition for IMAGE */
	public static final String sTEST = "TEST";  /*!< A string definition for TEST */
	public static final String sUNSPECIFIED = "UNSPECIFIED";  /*!< A string definition for UNSPECIFIED */
	private static final String[] sSubscanIntentSet = {
		sON_SOURCE,
		sOFF_SOURCE,
		sMIXED,
		sREFERENCE,
		sSCANNING,
		sHOT,
		sAMBIENT,
		sSIGNAL,
		sIMAGE,
		sTEST,
		sUNSPECIFIED
	};
	
	
	/**
	* Returns the version number of the enumeration SubscanIntent.
	*/
	public static int version() { 
		return alma.SubscanIntentMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SubscanIntent.
	*/
	public static String revision() { 
		return alma.SubscanIntentMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SubscanIntent.
	*/
	public static int size() { 
		return sSubscanIntentSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SubscanIntent's enumerator.
	*/
	public static String name(SubscanIntent f){
		switch(f.value()){
			case SubscanIntent._ON_SOURCE : 
				return sON_SOURCE;
			case SubscanIntent._OFF_SOURCE : 
				return sOFF_SOURCE;
			case SubscanIntent._MIXED : 
				return sMIXED;
			case SubscanIntent._REFERENCE : 
				return sREFERENCE;
			case SubscanIntent._SCANNING : 
				return sSCANNING;
			case SubscanIntent._HOT : 
				return sHOT;
			case SubscanIntent._AMBIENT : 
				return sAMBIENT;
			case SubscanIntent._SIGNAL : 
				return sSIGNAL;
			case SubscanIntent._IMAGE : 
				return sIMAGE;
			case SubscanIntent._TEST : 
				return sTEST;
			case SubscanIntent._UNSPECIFIED : 
				return sUNSPECIFIED;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SubscanIntent's enumerator.
	*/
	public static String toString(SubscanIntent f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSubscanIntentSet;
	}
	
	
	/**
	* Returns a SubscanIntent's enumerator by specifying its name.
	*/
	public static SubscanIntent literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sON_SOURCE)) return SubscanIntent.from_int(SubscanIntent._ON_SOURCE);
		if(name.equals(sOFF_SOURCE)) return SubscanIntent.from_int(SubscanIntent._OFF_SOURCE);
		if(name.equals(sMIXED)) return SubscanIntent.from_int(SubscanIntent._MIXED);
		if(name.equals(sREFERENCE)) return SubscanIntent.from_int(SubscanIntent._REFERENCE);
		if(name.equals(sSCANNING)) return SubscanIntent.from_int(SubscanIntent._SCANNING);
		if(name.equals(sHOT)) return SubscanIntent.from_int(SubscanIntent._HOT);
		if(name.equals(sAMBIENT)) return SubscanIntent.from_int(SubscanIntent._AMBIENT);
		if(name.equals(sSIGNAL)) return SubscanIntent.from_int(SubscanIntent._SIGNAL);
		if(name.equals(sIMAGE)) return SubscanIntent.from_int(SubscanIntent._IMAGE);
		if(name.equals(sTEST)) return SubscanIntent.from_int(SubscanIntent._TEST);
		if(name.equals(sUNSPECIFIED)) return SubscanIntent.from_int(SubscanIntent._UNSPECIFIED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SubscanIntent enumeration object by specifying its name
	*/
	public static SubscanIntent newSubscanIntent(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sON_SOURCE)) return SubscanIntent.from_int(SubscanIntent._ON_SOURCE);
		if(name.equals(sOFF_SOURCE)) return SubscanIntent.from_int(SubscanIntent._OFF_SOURCE);
		if(name.equals(sMIXED)) return SubscanIntent.from_int(SubscanIntent._MIXED);
		if(name.equals(sREFERENCE)) return SubscanIntent.from_int(SubscanIntent._REFERENCE);
		if(name.equals(sSCANNING)) return SubscanIntent.from_int(SubscanIntent._SCANNING);
		if(name.equals(sHOT)) return SubscanIntent.from_int(SubscanIntent._HOT);
		if(name.equals(sAMBIENT)) return SubscanIntent.from_int(SubscanIntent._AMBIENT);
		if(name.equals(sSIGNAL)) return SubscanIntent.from_int(SubscanIntent._SIGNAL);
		if(name.equals(sIMAGE)) return SubscanIntent.from_int(SubscanIntent._IMAGE);
		if(name.equals(sTEST)) return SubscanIntent.from_int(SubscanIntent._TEST);
		if(name.equals(sUNSPECIFIED)) return SubscanIntent.from_int(SubscanIntent._UNSPECIFIED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SubscanIntent. 
	 * @parameter value an instance of SubscanIntent.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SubscanIntent value) {
			
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


