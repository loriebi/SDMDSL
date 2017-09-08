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
 * File JHolographyChannelType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.HolographyChannelTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the HolographyChannelType enumeration.
*/ 
public class JHolographyChannelType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sQ2 = "Q2";  /*!< A string definition for Q2 */
	public static final String sQR = "QR";  /*!< A string definition for QR */
	public static final String sQS = "QS";  /*!< A string definition for QS */
	public static final String sR2 = "R2";  /*!< A string definition for R2 */
	public static final String sRS = "RS";  /*!< A string definition for RS */
	public static final String sS2 = "S2";  /*!< A string definition for S2 */
	private static final String[] sHolographyChannelTypeSet = {
		sQ2,
		sQR,
		sQS,
		sR2,
		sRS,
		sS2
	};
	
	
	/**
	* Returns the version number of the enumeration HolographyChannelType.
	*/
	public static int version() { 
		return alma.HolographyChannelTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration HolographyChannelType.
	*/
	public static String revision() { 
		return alma.HolographyChannelTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in HolographyChannelType.
	*/
	public static int size() { 
		return sHolographyChannelTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified HolographyChannelType's enumerator.
	*/
	public static String name(HolographyChannelType f){
		switch(f.value()){
			case HolographyChannelType._Q2 : 
				return sQ2;
			case HolographyChannelType._QR : 
				return sQR;
			case HolographyChannelType._QS : 
				return sQS;
			case HolographyChannelType._R2 : 
				return sR2;
			case HolographyChannelType._RS : 
				return sRS;
			case HolographyChannelType._S2 : 
				return sS2;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified HolographyChannelType's enumerator.
	*/
	public static String toString(HolographyChannelType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sHolographyChannelTypeSet;
	}
	
	
	/**
	* Returns a HolographyChannelType's enumerator by specifying its name.
	*/
	public static HolographyChannelType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sQ2)) return HolographyChannelType.from_int(HolographyChannelType._Q2);
		if(name.equals(sQR)) return HolographyChannelType.from_int(HolographyChannelType._QR);
		if(name.equals(sQS)) return HolographyChannelType.from_int(HolographyChannelType._QS);
		if(name.equals(sR2)) return HolographyChannelType.from_int(HolographyChannelType._R2);
		if(name.equals(sRS)) return HolographyChannelType.from_int(HolographyChannelType._RS);
		if(name.equals(sS2)) return HolographyChannelType.from_int(HolographyChannelType._S2);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a HolographyChannelType enumeration object by specifying its name
	*/
	public static HolographyChannelType newHolographyChannelType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sQ2)) return HolographyChannelType.from_int(HolographyChannelType._Q2);
		if(name.equals(sQR)) return HolographyChannelType.from_int(HolographyChannelType._QR);
		if(name.equals(sQS)) return HolographyChannelType.from_int(HolographyChannelType._QS);
		if(name.equals(sR2)) return HolographyChannelType.from_int(HolographyChannelType._R2);
		if(name.equals(sRS)) return HolographyChannelType.from_int(HolographyChannelType._RS);
		if(name.equals(sS2)) return HolographyChannelType.from_int(HolographyChannelType._S2);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is HolographyChannelType. 
	 * @parameter value an instance of HolographyChannelType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, HolographyChannelType value) {
			
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


