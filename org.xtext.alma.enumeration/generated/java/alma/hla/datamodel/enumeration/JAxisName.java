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
 * File JAxisName.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.AxisNameMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the AxisName enumeration.
*/ 
public class JAxisName {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sTIM = "TIM";  /*!< A string definition for TIM */
	public static final String sBAL = "BAL";  /*!< A string definition for BAL */
	public static final String sANT = "ANT";  /*!< A string definition for ANT */
	public static final String sBAB = "BAB";  /*!< A string definition for BAB */
	public static final String sSPW = "SPW";  /*!< A string definition for SPW */
	public static final String sSIB = "SIB";  /*!< A string definition for SIB */
	public static final String sSUB = "SUB";  /*!< A string definition for SUB */
	public static final String sBIN = "BIN";  /*!< A string definition for BIN */
	public static final String sAPC = "APC";  /*!< A string definition for APC */
	public static final String sSPP = "SPP";  /*!< A string definition for SPP */
	public static final String sPOL = "POL";  /*!< A string definition for POL */
	public static final String sSTO = "STO";  /*!< A string definition for STO */
	public static final String sHOL = "HOL";  /*!< A string definition for HOL */
	private static final String[] sAxisNameSet = {
		sTIM,
		sBAL,
		sANT,
		sBAB,
		sSPW,
		sSIB,
		sSUB,
		sBIN,
		sAPC,
		sSPP,
		sPOL,
		sSTO,
		sHOL
	};
	
	
	/**
	* Returns the version number of the enumeration AxisName.
	*/
	public static int version() { 
		return alma.AxisNameMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration AxisName.
	*/
	public static String revision() { 
		return alma.AxisNameMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in AxisName.
	*/
	public static int size() { 
		return sAxisNameSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified AxisName's enumerator.
	*/
	public static String name(AxisName f){
		switch(f.value()){
			case AxisName._TIM : 
				return sTIM;
			case AxisName._BAL : 
				return sBAL;
			case AxisName._ANT : 
				return sANT;
			case AxisName._BAB : 
				return sBAB;
			case AxisName._SPW : 
				return sSPW;
			case AxisName._SIB : 
				return sSIB;
			case AxisName._SUB : 
				return sSUB;
			case AxisName._BIN : 
				return sBIN;
			case AxisName._APC : 
				return sAPC;
			case AxisName._SPP : 
				return sSPP;
			case AxisName._POL : 
				return sPOL;
			case AxisName._STO : 
				return sSTO;
			case AxisName._HOL : 
				return sHOL;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified AxisName's enumerator.
	*/
	public static String toString(AxisName f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sAxisNameSet;
	}
	
	
	/**
	* Returns a AxisName's enumerator by specifying its name.
	*/
	public static AxisName literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sTIM)) return AxisName.from_int(AxisName._TIM);
		if(name.equals(sBAL)) return AxisName.from_int(AxisName._BAL);
		if(name.equals(sANT)) return AxisName.from_int(AxisName._ANT);
		if(name.equals(sBAB)) return AxisName.from_int(AxisName._BAB);
		if(name.equals(sSPW)) return AxisName.from_int(AxisName._SPW);
		if(name.equals(sSIB)) return AxisName.from_int(AxisName._SIB);
		if(name.equals(sSUB)) return AxisName.from_int(AxisName._SUB);
		if(name.equals(sBIN)) return AxisName.from_int(AxisName._BIN);
		if(name.equals(sAPC)) return AxisName.from_int(AxisName._APC);
		if(name.equals(sSPP)) return AxisName.from_int(AxisName._SPP);
		if(name.equals(sPOL)) return AxisName.from_int(AxisName._POL);
		if(name.equals(sSTO)) return AxisName.from_int(AxisName._STO);
		if(name.equals(sHOL)) return AxisName.from_int(AxisName._HOL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a AxisName enumeration object by specifying its name
	*/
	public static AxisName newAxisName(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sTIM)) return AxisName.from_int(AxisName._TIM);
		if(name.equals(sBAL)) return AxisName.from_int(AxisName._BAL);
		if(name.equals(sANT)) return AxisName.from_int(AxisName._ANT);
		if(name.equals(sBAB)) return AxisName.from_int(AxisName._BAB);
		if(name.equals(sSPW)) return AxisName.from_int(AxisName._SPW);
		if(name.equals(sSIB)) return AxisName.from_int(AxisName._SIB);
		if(name.equals(sSUB)) return AxisName.from_int(AxisName._SUB);
		if(name.equals(sBIN)) return AxisName.from_int(AxisName._BIN);
		if(name.equals(sAPC)) return AxisName.from_int(AxisName._APC);
		if(name.equals(sSPP)) return AxisName.from_int(AxisName._SPP);
		if(name.equals(sPOL)) return AxisName.from_int(AxisName._POL);
		if(name.equals(sSTO)) return AxisName.from_int(AxisName._STO);
		if(name.equals(sHOL)) return AxisName.from_int(AxisName._HOL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is AxisName. 
	 * @parameter value an instance of AxisName.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, AxisName value) {
			
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


