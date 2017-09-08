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
 * File JDataContent.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.DataContentMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the DataContent enumeration.
*/ 
public class JDataContent {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sCROSS_DATA = "CROSS_DATA";  /*!< A string definition for CROSS_DATA */
	public static final String sAUTO_DATA = "AUTO_DATA";  /*!< A string definition for AUTO_DATA */
	public static final String sZERO_LAGS = "ZERO_LAGS";  /*!< A string definition for ZERO_LAGS */
	public static final String sACTUAL_TIMES = "ACTUAL_TIMES";  /*!< A string definition for ACTUAL_TIMES */
	public static final String sACTUAL_DURATIONS = "ACTUAL_DURATIONS";  /*!< A string definition for ACTUAL_DURATIONS */
	public static final String sWEIGHTS = "WEIGHTS";  /*!< A string definition for WEIGHTS */
	public static final String sFLAGS = "FLAGS";  /*!< A string definition for FLAGS */
	private static final String[] sDataContentSet = {
		sCROSS_DATA,
		sAUTO_DATA,
		sZERO_LAGS,
		sACTUAL_TIMES,
		sACTUAL_DURATIONS,
		sWEIGHTS,
		sFLAGS
	};
	
	
	/**
	* Returns the version number of the enumeration DataContent.
	*/
	public static int version() { 
		return alma.DataContentMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration DataContent.
	*/
	public static String revision() { 
		return alma.DataContentMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in DataContent.
	*/
	public static int size() { 
		return sDataContentSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified DataContent's enumerator.
	*/
	public static String name(DataContent f){
		switch(f.value()){
			case DataContent._CROSS_DATA : 
				return sCROSS_DATA;
			case DataContent._AUTO_DATA : 
				return sAUTO_DATA;
			case DataContent._ZERO_LAGS : 
				return sZERO_LAGS;
			case DataContent._ACTUAL_TIMES : 
				return sACTUAL_TIMES;
			case DataContent._ACTUAL_DURATIONS : 
				return sACTUAL_DURATIONS;
			case DataContent._WEIGHTS : 
				return sWEIGHTS;
			case DataContent._FLAGS : 
				return sFLAGS;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified DataContent's enumerator.
	*/
	public static String toString(DataContent f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sDataContentSet;
	}
	
	
	/**
	* Returns a DataContent's enumerator by specifying its name.
	*/
	public static DataContent literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCROSS_DATA)) return DataContent.from_int(DataContent._CROSS_DATA);
		if(name.equals(sAUTO_DATA)) return DataContent.from_int(DataContent._AUTO_DATA);
		if(name.equals(sZERO_LAGS)) return DataContent.from_int(DataContent._ZERO_LAGS);
		if(name.equals(sACTUAL_TIMES)) return DataContent.from_int(DataContent._ACTUAL_TIMES);
		if(name.equals(sACTUAL_DURATIONS)) return DataContent.from_int(DataContent._ACTUAL_DURATIONS);
		if(name.equals(sWEIGHTS)) return DataContent.from_int(DataContent._WEIGHTS);
		if(name.equals(sFLAGS)) return DataContent.from_int(DataContent._FLAGS);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a DataContent enumeration object by specifying its name
	*/
	public static DataContent newDataContent(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCROSS_DATA)) return DataContent.from_int(DataContent._CROSS_DATA);
		if(name.equals(sAUTO_DATA)) return DataContent.from_int(DataContent._AUTO_DATA);
		if(name.equals(sZERO_LAGS)) return DataContent.from_int(DataContent._ZERO_LAGS);
		if(name.equals(sACTUAL_TIMES)) return DataContent.from_int(DataContent._ACTUAL_TIMES);
		if(name.equals(sACTUAL_DURATIONS)) return DataContent.from_int(DataContent._ACTUAL_DURATIONS);
		if(name.equals(sWEIGHTS)) return DataContent.from_int(DataContent._WEIGHTS);
		if(name.equals(sFLAGS)) return DataContent.from_int(DataContent._FLAGS);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is DataContent. 
	 * @parameter value an instance of DataContent.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, DataContent value) {
			
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


