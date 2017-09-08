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
 * File JWindowFunction.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.WindowFunctionMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the WindowFunction enumeration.
*/ 
public class JWindowFunction {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sUNIFORM = "UNIFORM";  /*!< A string definition for UNIFORM */
	public static final String sHANNING = "HANNING";  /*!< A string definition for HANNING */
	public static final String sHAMMING = "HAMMING";  /*!< A string definition for HAMMING */
	public static final String sBARTLETT = "BARTLETT";  /*!< A string definition for BARTLETT */
	public static final String sBLACKMANN = "BLACKMANN";  /*!< A string definition for BLACKMANN */
	public static final String sBLACKMANN_HARRIS = "BLACKMANN_HARRIS";  /*!< A string definition for BLACKMANN_HARRIS */
	public static final String sWELCH = "WELCH";  /*!< A string definition for WELCH */
	private static final String[] sWindowFunctionSet = {
		sUNIFORM,
		sHANNING,
		sHAMMING,
		sBARTLETT,
		sBLACKMANN,
		sBLACKMANN_HARRIS,
		sWELCH
	};
	
	
	/**
	* Returns the version number of the enumeration WindowFunction.
	*/
	public static int version() { 
		return alma.WindowFunctionMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration WindowFunction.
	*/
	public static String revision() { 
		return alma.WindowFunctionMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in WindowFunction.
	*/
	public static int size() { 
		return sWindowFunctionSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified WindowFunction's enumerator.
	*/
	public static String name(WindowFunction f){
		switch(f.value()){
			case WindowFunction._UNIFORM : 
				return sUNIFORM;
			case WindowFunction._HANNING : 
				return sHANNING;
			case WindowFunction._HAMMING : 
				return sHAMMING;
			case WindowFunction._BARTLETT : 
				return sBARTLETT;
			case WindowFunction._BLACKMANN : 
				return sBLACKMANN;
			case WindowFunction._BLACKMANN_HARRIS : 
				return sBLACKMANN_HARRIS;
			case WindowFunction._WELCH : 
				return sWELCH;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified WindowFunction's enumerator.
	*/
	public static String toString(WindowFunction f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sWindowFunctionSet;
	}
	
	
	/**
	* Returns a WindowFunction's enumerator by specifying its name.
	*/
	public static WindowFunction literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sUNIFORM)) return WindowFunction.from_int(WindowFunction._UNIFORM);
		if(name.equals(sHANNING)) return WindowFunction.from_int(WindowFunction._HANNING);
		if(name.equals(sHAMMING)) return WindowFunction.from_int(WindowFunction._HAMMING);
		if(name.equals(sBARTLETT)) return WindowFunction.from_int(WindowFunction._BARTLETT);
		if(name.equals(sBLACKMANN)) return WindowFunction.from_int(WindowFunction._BLACKMANN);
		if(name.equals(sBLACKMANN_HARRIS)) return WindowFunction.from_int(WindowFunction._BLACKMANN_HARRIS);
		if(name.equals(sWELCH)) return WindowFunction.from_int(WindowFunction._WELCH);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a WindowFunction enumeration object by specifying its name
	*/
	public static WindowFunction newWindowFunction(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sUNIFORM)) return WindowFunction.from_int(WindowFunction._UNIFORM);
		if(name.equals(sHANNING)) return WindowFunction.from_int(WindowFunction._HANNING);
		if(name.equals(sHAMMING)) return WindowFunction.from_int(WindowFunction._HAMMING);
		if(name.equals(sBARTLETT)) return WindowFunction.from_int(WindowFunction._BARTLETT);
		if(name.equals(sBLACKMANN)) return WindowFunction.from_int(WindowFunction._BLACKMANN);
		if(name.equals(sBLACKMANN_HARRIS)) return WindowFunction.from_int(WindowFunction._BLACKMANN_HARRIS);
		if(name.equals(sWELCH)) return WindowFunction.from_int(WindowFunction._WELCH);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is WindowFunction. 
	 * @parameter value an instance of WindowFunction.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, WindowFunction value) {
			
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


