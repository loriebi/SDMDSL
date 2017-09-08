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
 * File JInvalidatingCondition.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.InvalidatingConditionMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the InvalidatingCondition enumeration.
*/ 
public class JInvalidatingCondition {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sANTENNA_DISCONNECT = "ANTENNA_DISCONNECT";  /*!< A string definition for ANTENNA_DISCONNECT */
	public static final String sANTENNA_MOVE = "ANTENNA_MOVE";  /*!< A string definition for ANTENNA_MOVE */
	public static final String sANTENNA_POWER_DOWN = "ANTENNA_POWER_DOWN";  /*!< A string definition for ANTENNA_POWER_DOWN */
	public static final String sRECEIVER_EXCHANGE = "RECEIVER_EXCHANGE";  /*!< A string definition for RECEIVER_EXCHANGE */
	public static final String sRECEIVER_POWER_DOWN = "RECEIVER_POWER_DOWN";  /*!< A string definition for RECEIVER_POWER_DOWN */
	private static final String[] sInvalidatingConditionSet = {
		sANTENNA_DISCONNECT,
		sANTENNA_MOVE,
		sANTENNA_POWER_DOWN,
		sRECEIVER_EXCHANGE,
		sRECEIVER_POWER_DOWN
	};
	
	
	/**
	* Returns the version number of the enumeration InvalidatingCondition.
	*/
	public static int version() { 
		return alma.InvalidatingConditionMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration InvalidatingCondition.
	*/
	public static String revision() { 
		return alma.InvalidatingConditionMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in InvalidatingCondition.
	*/
	public static int size() { 
		return sInvalidatingConditionSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified InvalidatingCondition's enumerator.
	*/
	public static String name(InvalidatingCondition f){
		switch(f.value()){
			case InvalidatingCondition._ANTENNA_DISCONNECT : 
				return sANTENNA_DISCONNECT;
			case InvalidatingCondition._ANTENNA_MOVE : 
				return sANTENNA_MOVE;
			case InvalidatingCondition._ANTENNA_POWER_DOWN : 
				return sANTENNA_POWER_DOWN;
			case InvalidatingCondition._RECEIVER_EXCHANGE : 
				return sRECEIVER_EXCHANGE;
			case InvalidatingCondition._RECEIVER_POWER_DOWN : 
				return sRECEIVER_POWER_DOWN;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified InvalidatingCondition's enumerator.
	*/
	public static String toString(InvalidatingCondition f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sInvalidatingConditionSet;
	}
	
	
	/**
	* Returns a InvalidatingCondition's enumerator by specifying its name.
	*/
	public static InvalidatingCondition literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sANTENNA_DISCONNECT)) return InvalidatingCondition.from_int(InvalidatingCondition._ANTENNA_DISCONNECT);
		if(name.equals(sANTENNA_MOVE)) return InvalidatingCondition.from_int(InvalidatingCondition._ANTENNA_MOVE);
		if(name.equals(sANTENNA_POWER_DOWN)) return InvalidatingCondition.from_int(InvalidatingCondition._ANTENNA_POWER_DOWN);
		if(name.equals(sRECEIVER_EXCHANGE)) return InvalidatingCondition.from_int(InvalidatingCondition._RECEIVER_EXCHANGE);
		if(name.equals(sRECEIVER_POWER_DOWN)) return InvalidatingCondition.from_int(InvalidatingCondition._RECEIVER_POWER_DOWN);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a InvalidatingCondition enumeration object by specifying its name
	*/
	public static InvalidatingCondition newInvalidatingCondition(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sANTENNA_DISCONNECT)) return InvalidatingCondition.from_int(InvalidatingCondition._ANTENNA_DISCONNECT);
		if(name.equals(sANTENNA_MOVE)) return InvalidatingCondition.from_int(InvalidatingCondition._ANTENNA_MOVE);
		if(name.equals(sANTENNA_POWER_DOWN)) return InvalidatingCondition.from_int(InvalidatingCondition._ANTENNA_POWER_DOWN);
		if(name.equals(sRECEIVER_EXCHANGE)) return InvalidatingCondition.from_int(InvalidatingCondition._RECEIVER_EXCHANGE);
		if(name.equals(sRECEIVER_POWER_DOWN)) return InvalidatingCondition.from_int(InvalidatingCondition._RECEIVER_POWER_DOWN);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is InvalidatingCondition. 
	 * @parameter value an instance of InvalidatingCondition.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, InvalidatingCondition value) {
			
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


