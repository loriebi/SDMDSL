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
 * File JDataScale.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.DataScaleMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the DataScale enumeration.
*/ 
public class JDataScale {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sK = "K";  /*!< A string definition for K */
	public static final String sJY = "JY";  /*!< A string definition for JY */
	public static final String sCORRELATION = "CORRELATION";  /*!< A string definition for CORRELATION */
	public static final String sCORRELATION_COEFFICIENT = "CORRELATION_COEFFICIENT";  /*!< A string definition for CORRELATION_COEFFICIENT */
	private static final String[] sDataScaleSet = {
		sK,
		sJY,
		sCORRELATION,
		sCORRELATION_COEFFICIENT
	};
	
	
	/**
	* Returns the version number of the enumeration DataScale.
	*/
	public static int version() { 
		return alma.DataScaleMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration DataScale.
	*/
	public static String revision() { 
		return alma.DataScaleMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in DataScale.
	*/
	public static int size() { 
		return sDataScaleSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified DataScale's enumerator.
	*/
	public static String name(DataScale f){
		switch(f.value()){
			case DataScale._K : 
				return sK;
			case DataScale._JY : 
				return sJY;
			case DataScale._CORRELATION : 
				return sCORRELATION;
			case DataScale._CORRELATION_COEFFICIENT : 
				return sCORRELATION_COEFFICIENT;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified DataScale's enumerator.
	*/
	public static String toString(DataScale f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sDataScaleSet;
	}
	
	
	/**
	* Returns a DataScale's enumerator by specifying its name.
	*/
	public static DataScale literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sK)) return DataScale.from_int(DataScale._K);
		if(name.equals(sJY)) return DataScale.from_int(DataScale._JY);
		if(name.equals(sCORRELATION)) return DataScale.from_int(DataScale._CORRELATION);
		if(name.equals(sCORRELATION_COEFFICIENT)) return DataScale.from_int(DataScale._CORRELATION_COEFFICIENT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a DataScale enumeration object by specifying its name
	*/
	public static DataScale newDataScale(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sK)) return DataScale.from_int(DataScale._K);
		if(name.equals(sJY)) return DataScale.from_int(DataScale._JY);
		if(name.equals(sCORRELATION)) return DataScale.from_int(DataScale._CORRELATION);
		if(name.equals(sCORRELATION_COEFFICIENT)) return DataScale.from_int(DataScale._CORRELATION_COEFFICIENT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is DataScale. 
	 * @parameter value an instance of DataScale.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, DataScale value) {
			
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


