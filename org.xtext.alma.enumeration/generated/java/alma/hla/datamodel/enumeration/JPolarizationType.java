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
 * File JPolarizationType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.PolarizationTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the PolarizationType enumeration.
*/ 
public class JPolarizationType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sR = "R";  /*!< A string definition for R */
	public static final String sL = "L";  /*!< A string definition for L */
	public static final String sX = "X";  /*!< A string definition for X */
	public static final String sY = "Y";  /*!< A string definition for Y */
	public static final String sBOTH = "BOTH";  /*!< A string definition for BOTH */
	private static final String[] sPolarizationTypeSet = {
		sR,
		sL,
		sX,
		sY,
		sBOTH
	};
	
	
	/**
	* Returns the version number of the enumeration PolarizationType.
	*/
	public static int version() { 
		return alma.PolarizationTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration PolarizationType.
	*/
	public static String revision() { 
		return alma.PolarizationTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in PolarizationType.
	*/
	public static int size() { 
		return sPolarizationTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified PolarizationType's enumerator.
	*/
	public static String name(PolarizationType f){
		switch(f.value()){
			case PolarizationType._R : 
				return sR;
			case PolarizationType._L : 
				return sL;
			case PolarizationType._X : 
				return sX;
			case PolarizationType._Y : 
				return sY;
			case PolarizationType._BOTH : 
				return sBOTH;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified PolarizationType's enumerator.
	*/
	public static String toString(PolarizationType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sPolarizationTypeSet;
	}
	
	
	/**
	* Returns a PolarizationType's enumerator by specifying its name.
	*/
	public static PolarizationType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sR)) return PolarizationType.from_int(PolarizationType._R);
		if(name.equals(sL)) return PolarizationType.from_int(PolarizationType._L);
		if(name.equals(sX)) return PolarizationType.from_int(PolarizationType._X);
		if(name.equals(sY)) return PolarizationType.from_int(PolarizationType._Y);
		if(name.equals(sBOTH)) return PolarizationType.from_int(PolarizationType._BOTH);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a PolarizationType enumeration object by specifying its name
	*/
	public static PolarizationType newPolarizationType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sR)) return PolarizationType.from_int(PolarizationType._R);
		if(name.equals(sL)) return PolarizationType.from_int(PolarizationType._L);
		if(name.equals(sX)) return PolarizationType.from_int(PolarizationType._X);
		if(name.equals(sY)) return PolarizationType.from_int(PolarizationType._Y);
		if(name.equals(sBOTH)) return PolarizationType.from_int(PolarizationType._BOTH);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is PolarizationType. 
	 * @parameter value an instance of PolarizationType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, PolarizationType value) {
			
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


