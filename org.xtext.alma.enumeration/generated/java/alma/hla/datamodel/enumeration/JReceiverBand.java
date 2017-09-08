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
 * File JReceiverBand.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.ReceiverBandMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the ReceiverBand enumeration.
*/ 
public class JReceiverBand {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sALMA_RB_01 = "ALMA_RB_01";  /*!< A string definition for ALMA_RB_01 */
	public static final String sALMA_RB_02 = "ALMA_RB_02";  /*!< A string definition for ALMA_RB_02 */
	public static final String sALMA_RB_03 = "ALMA_RB_03";  /*!< A string definition for ALMA_RB_03 */
	public static final String sALMA_RB_04 = "ALMA_RB_04";  /*!< A string definition for ALMA_RB_04 */
	public static final String sALMA_RB_05 = "ALMA_RB_05";  /*!< A string definition for ALMA_RB_05 */
	public static final String sALMA_RB_06 = "ALMA_RB_06";  /*!< A string definition for ALMA_RB_06 */
	public static final String sALMA_RB_07 = "ALMA_RB_07";  /*!< A string definition for ALMA_RB_07 */
	public static final String sALMA_RB_08 = "ALMA_RB_08";  /*!< A string definition for ALMA_RB_08 */
	public static final String sALMA_RB_09 = "ALMA_RB_09";  /*!< A string definition for ALMA_RB_09 */
	public static final String sALMA_RB_10 = "ALMA_RB_10";  /*!< A string definition for ALMA_RB_10 */
	public static final String sALMA_RB_ALL = "ALMA_RB_ALL";  /*!< A string definition for ALMA_RB_ALL */
	public static final String sALMA_HOLOGRAPHY_RECEIVER = "ALMA_HOLOGRAPHY_RECEIVER";  /*!< A string definition for ALMA_HOLOGRAPHY_RECEIVER */
	public static final String sBURE_01 = "BURE_01";  /*!< A string definition for BURE_01 */
	public static final String sBURE_02 = "BURE_02";  /*!< A string definition for BURE_02 */
	public static final String sBURE_03 = "BURE_03";  /*!< A string definition for BURE_03 */
	public static final String sBURE_04 = "BURE_04";  /*!< A string definition for BURE_04 */
	public static final String sEVLA_4 = "EVLA_4";  /*!< A string definition for EVLA_4 */
	public static final String sEVLA_P = "EVLA_P";  /*!< A string definition for EVLA_P */
	public static final String sEVLA_L = "EVLA_L";  /*!< A string definition for EVLA_L */
	public static final String sEVLA_C = "EVLA_C";  /*!< A string definition for EVLA_C */
	public static final String sEVLA_S = "EVLA_S";  /*!< A string definition for EVLA_S */
	public static final String sEVLA_X = "EVLA_X";  /*!< A string definition for EVLA_X */
	public static final String sEVLA_Ku = "EVLA_Ku";  /*!< A string definition for EVLA_Ku */
	public static final String sEVLA_K = "EVLA_K";  /*!< A string definition for EVLA_K */
	public static final String sEVLA_Ka = "EVLA_Ka";  /*!< A string definition for EVLA_Ka */
	public static final String sEVLA_Q = "EVLA_Q";  /*!< A string definition for EVLA_Q */
	public static final String sUNSPECIFIED = "UNSPECIFIED";  /*!< A string definition for UNSPECIFIED */
	private static final String[] sReceiverBandSet = {
		sALMA_RB_01,
		sALMA_RB_02,
		sALMA_RB_03,
		sALMA_RB_04,
		sALMA_RB_05,
		sALMA_RB_06,
		sALMA_RB_07,
		sALMA_RB_08,
		sALMA_RB_09,
		sALMA_RB_10,
		sALMA_RB_ALL,
		sALMA_HOLOGRAPHY_RECEIVER,
		sBURE_01,
		sBURE_02,
		sBURE_03,
		sBURE_04,
		sEVLA_4,
		sEVLA_P,
		sEVLA_L,
		sEVLA_C,
		sEVLA_S,
		sEVLA_X,
		sEVLA_Ku,
		sEVLA_K,
		sEVLA_Ka,
		sEVLA_Q,
		sUNSPECIFIED
	};
	
	
	/**
	* Returns the version number of the enumeration ReceiverBand.
	*/
	public static int version() { 
		return alma.ReceiverBandMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration ReceiverBand.
	*/
	public static String revision() { 
		return alma.ReceiverBandMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in ReceiverBand.
	*/
	public static int size() { 
		return sReceiverBandSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified ReceiverBand's enumerator.
	*/
	public static String name(ReceiverBand f){
		switch(f.value()){
			case ReceiverBand._ALMA_RB_01 : 
				return sALMA_RB_01;
			case ReceiverBand._ALMA_RB_02 : 
				return sALMA_RB_02;
			case ReceiverBand._ALMA_RB_03 : 
				return sALMA_RB_03;
			case ReceiverBand._ALMA_RB_04 : 
				return sALMA_RB_04;
			case ReceiverBand._ALMA_RB_05 : 
				return sALMA_RB_05;
			case ReceiverBand._ALMA_RB_06 : 
				return sALMA_RB_06;
			case ReceiverBand._ALMA_RB_07 : 
				return sALMA_RB_07;
			case ReceiverBand._ALMA_RB_08 : 
				return sALMA_RB_08;
			case ReceiverBand._ALMA_RB_09 : 
				return sALMA_RB_09;
			case ReceiverBand._ALMA_RB_10 : 
				return sALMA_RB_10;
			case ReceiverBand._ALMA_RB_ALL : 
				return sALMA_RB_ALL;
			case ReceiverBand._ALMA_HOLOGRAPHY_RECEIVER : 
				return sALMA_HOLOGRAPHY_RECEIVER;
			case ReceiverBand._BURE_01 : 
				return sBURE_01;
			case ReceiverBand._BURE_02 : 
				return sBURE_02;
			case ReceiverBand._BURE_03 : 
				return sBURE_03;
			case ReceiverBand._BURE_04 : 
				return sBURE_04;
			case ReceiverBand._EVLA_4 : 
				return sEVLA_4;
			case ReceiverBand._EVLA_P : 
				return sEVLA_P;
			case ReceiverBand._EVLA_L : 
				return sEVLA_L;
			case ReceiverBand._EVLA_C : 
				return sEVLA_C;
			case ReceiverBand._EVLA_S : 
				return sEVLA_S;
			case ReceiverBand._EVLA_X : 
				return sEVLA_X;
			case ReceiverBand._EVLA_Ku : 
				return sEVLA_Ku;
			case ReceiverBand._EVLA_K : 
				return sEVLA_K;
			case ReceiverBand._EVLA_Ka : 
				return sEVLA_Ka;
			case ReceiverBand._EVLA_Q : 
				return sEVLA_Q;
			case ReceiverBand._UNSPECIFIED : 
				return sUNSPECIFIED;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified ReceiverBand's enumerator.
	*/
	public static String toString(ReceiverBand f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sReceiverBandSet;
	}
	
	
	/**
	* Returns a ReceiverBand's enumerator by specifying its name.
	*/
	public static ReceiverBand literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sALMA_RB_01)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_01);
		if(name.equals(sALMA_RB_02)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_02);
		if(name.equals(sALMA_RB_03)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_03);
		if(name.equals(sALMA_RB_04)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_04);
		if(name.equals(sALMA_RB_05)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_05);
		if(name.equals(sALMA_RB_06)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_06);
		if(name.equals(sALMA_RB_07)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_07);
		if(name.equals(sALMA_RB_08)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_08);
		if(name.equals(sALMA_RB_09)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_09);
		if(name.equals(sALMA_RB_10)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_10);
		if(name.equals(sALMA_RB_ALL)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_ALL);
		if(name.equals(sALMA_HOLOGRAPHY_RECEIVER)) return ReceiverBand.from_int(ReceiverBand._ALMA_HOLOGRAPHY_RECEIVER);
		if(name.equals(sBURE_01)) return ReceiverBand.from_int(ReceiverBand._BURE_01);
		if(name.equals(sBURE_02)) return ReceiverBand.from_int(ReceiverBand._BURE_02);
		if(name.equals(sBURE_03)) return ReceiverBand.from_int(ReceiverBand._BURE_03);
		if(name.equals(sBURE_04)) return ReceiverBand.from_int(ReceiverBand._BURE_04);
		if(name.equals(sEVLA_4)) return ReceiverBand.from_int(ReceiverBand._EVLA_4);
		if(name.equals(sEVLA_P)) return ReceiverBand.from_int(ReceiverBand._EVLA_P);
		if(name.equals(sEVLA_L)) return ReceiverBand.from_int(ReceiverBand._EVLA_L);
		if(name.equals(sEVLA_C)) return ReceiverBand.from_int(ReceiverBand._EVLA_C);
		if(name.equals(sEVLA_S)) return ReceiverBand.from_int(ReceiverBand._EVLA_S);
		if(name.equals(sEVLA_X)) return ReceiverBand.from_int(ReceiverBand._EVLA_X);
		if(name.equals(sEVLA_Ku)) return ReceiverBand.from_int(ReceiverBand._EVLA_Ku);
		if(name.equals(sEVLA_K)) return ReceiverBand.from_int(ReceiverBand._EVLA_K);
		if(name.equals(sEVLA_Ka)) return ReceiverBand.from_int(ReceiverBand._EVLA_Ka);
		if(name.equals(sEVLA_Q)) return ReceiverBand.from_int(ReceiverBand._EVLA_Q);
		if(name.equals(sUNSPECIFIED)) return ReceiverBand.from_int(ReceiverBand._UNSPECIFIED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a ReceiverBand enumeration object by specifying its name
	*/
	public static ReceiverBand newReceiverBand(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sALMA_RB_01)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_01);
		if(name.equals(sALMA_RB_02)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_02);
		if(name.equals(sALMA_RB_03)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_03);
		if(name.equals(sALMA_RB_04)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_04);
		if(name.equals(sALMA_RB_05)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_05);
		if(name.equals(sALMA_RB_06)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_06);
		if(name.equals(sALMA_RB_07)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_07);
		if(name.equals(sALMA_RB_08)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_08);
		if(name.equals(sALMA_RB_09)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_09);
		if(name.equals(sALMA_RB_10)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_10);
		if(name.equals(sALMA_RB_ALL)) return ReceiverBand.from_int(ReceiverBand._ALMA_RB_ALL);
		if(name.equals(sALMA_HOLOGRAPHY_RECEIVER)) return ReceiverBand.from_int(ReceiverBand._ALMA_HOLOGRAPHY_RECEIVER);
		if(name.equals(sBURE_01)) return ReceiverBand.from_int(ReceiverBand._BURE_01);
		if(name.equals(sBURE_02)) return ReceiverBand.from_int(ReceiverBand._BURE_02);
		if(name.equals(sBURE_03)) return ReceiverBand.from_int(ReceiverBand._BURE_03);
		if(name.equals(sBURE_04)) return ReceiverBand.from_int(ReceiverBand._BURE_04);
		if(name.equals(sEVLA_4)) return ReceiverBand.from_int(ReceiverBand._EVLA_4);
		if(name.equals(sEVLA_P)) return ReceiverBand.from_int(ReceiverBand._EVLA_P);
		if(name.equals(sEVLA_L)) return ReceiverBand.from_int(ReceiverBand._EVLA_L);
		if(name.equals(sEVLA_C)) return ReceiverBand.from_int(ReceiverBand._EVLA_C);
		if(name.equals(sEVLA_S)) return ReceiverBand.from_int(ReceiverBand._EVLA_S);
		if(name.equals(sEVLA_X)) return ReceiverBand.from_int(ReceiverBand._EVLA_X);
		if(name.equals(sEVLA_Ku)) return ReceiverBand.from_int(ReceiverBand._EVLA_Ku);
		if(name.equals(sEVLA_K)) return ReceiverBand.from_int(ReceiverBand._EVLA_K);
		if(name.equals(sEVLA_Ka)) return ReceiverBand.from_int(ReceiverBand._EVLA_Ka);
		if(name.equals(sEVLA_Q)) return ReceiverBand.from_int(ReceiverBand._EVLA_Q);
		if(name.equals(sUNSPECIFIED)) return ReceiverBand.from_int(ReceiverBand._UNSPECIFIED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is ReceiverBand. 
	 * @parameter value an instance of ReceiverBand.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, ReceiverBand value) {
			
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


