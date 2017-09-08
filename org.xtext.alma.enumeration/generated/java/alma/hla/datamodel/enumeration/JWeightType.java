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
 * File JWeightType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.WeightTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the WeightType enumeration.
*/ 
public class JWeightType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sK = "K";  /*!< A string definition for K */
	public static final String sJY = "JY";  /*!< A string definition for JY */
	public static final String sCOUNT_WEIGHT = "COUNT_WEIGHT";  /*!< A string definition for COUNT_WEIGHT */
	private static final String[] sWeightTypeSet = {
		sK,
		sJY,
		sCOUNT_WEIGHT
	};
	
	
	/**
	* Returns the version number of the enumeration WeightType.
	*/
	public static int version() { 
		return alma.WeightTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration WeightType.
	*/
	public static String revision() { 
		return alma.WeightTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in WeightType.
	*/
	public static int size() { 
		return sWeightTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified WeightType's enumerator.
	*/
	public static String name(WeightType f){
		switch(f.value()){
			case WeightType._K : 
				return sK;
			case WeightType._JY : 
				return sJY;
			case WeightType._COUNT_WEIGHT : 
				return sCOUNT_WEIGHT;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified WeightType's enumerator.
	*/
	public static String toString(WeightType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sWeightTypeSet;
	}
	
	
	/**
	* Returns a WeightType's enumerator by specifying its name.
	*/
	public static WeightType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sK)) return WeightType.from_int(WeightType._K);
		if(name.equals(sJY)) return WeightType.from_int(WeightType._JY);
		if(name.equals(sCOUNT_WEIGHT)) return WeightType.from_int(WeightType._COUNT_WEIGHT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a WeightType enumeration object by specifying its name
	*/
	public static WeightType newWeightType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sK)) return WeightType.from_int(WeightType._K);
		if(name.equals(sJY)) return WeightType.from_int(WeightType._JY);
		if(name.equals(sCOUNT_WEIGHT)) return WeightType.from_int(WeightType._COUNT_WEIGHT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is WeightType. 
	 * @parameter value an instance of WeightType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, WeightType value) {
			
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


