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
 * File JBinaryDataFlags.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.BinaryDataFlagsMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the BinaryDataFlags enumeration.
*/ 
public class JBinaryDataFlags {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sINTEGRATION_FULLY_BLANKED = "INTEGRATION_FULLY_BLANKED";  /*!< A string definition for INTEGRATION_FULLY_BLANKED */
	public static final String sWVR_APC = "WVR_APC";  /*!< A string definition for WVR_APC */
	public static final String sCORRELATOR_MISSING_STATUS = "CORRELATOR_MISSING_STATUS";  /*!< A string definition for CORRELATOR_MISSING_STATUS */
	public static final String sMISSING_ANTENNA_EVENT = "MISSING_ANTENNA_EVENT";  /*!< A string definition for MISSING_ANTENNA_EVENT */
	public static final String sDELTA_SIGMA_OVERFLOW = "DELTA_SIGMA_OVERFLOW";  /*!< A string definition for DELTA_SIGMA_OVERFLOW */
	public static final String sDELAY_CORRECTION_NOT_APPLIED = "DELAY_CORRECTION_NOT_APPLIED";  /*!< A string definition for DELAY_CORRECTION_NOT_APPLIED */
	public static final String sSYNCRONIZATION_ERROR = "SYNCRONIZATION_ERROR";  /*!< A string definition for SYNCRONIZATION_ERROR */
	public static final String sFFT_OVERFLOW = "FFT_OVERFLOW";  /*!< A string definition for FFT_OVERFLOW */
	public static final String sTFB_SCALING_FACTOR_NOT_RETRIEVED = "TFB_SCALING_FACTOR_NOT_RETRIEVED";  /*!< A string definition for TFB_SCALING_FACTOR_NOT_RETRIEVED */
	public static final String sZERO_LAG_NOT_RECEIVED = "ZERO_LAG_NOT_RECEIVED";  /*!< A string definition for ZERO_LAG_NOT_RECEIVED */
	public static final String sSIGMA_OVERFLOW = "SIGMA_OVERFLOW";  /*!< A string definition for SIGMA_OVERFLOW */
	public static final String sUNUSABLE_CAI_OUTPUT = "UNUSABLE_CAI_OUTPUT";  /*!< A string definition for UNUSABLE_CAI_OUTPUT */
	public static final String sQC_FAILED = "QC_FAILED";  /*!< A string definition for QC_FAILED */
	public static final String sNOISY_TDM_CHANNELS = "NOISY_TDM_CHANNELS";  /*!< A string definition for NOISY_TDM_CHANNELS */
	public static final String sSPECTRAL_NORMALIZATION_FAILED = "SPECTRAL_NORMALIZATION_FAILED";  /*!< A string definition for SPECTRAL_NORMALIZATION_FAILED */
	public static final String sDROPPED_PACKETS = "DROPPED_PACKETS";  /*!< A string definition for DROPPED_PACKETS */
	public static final String sDETECTOR_SATURATED = "DETECTOR_SATURATED";  /*!< A string definition for DETECTOR_SATURATED */
	public static final String sNO_DATA_FROM_DIGITAL_POWER_METER = "NO_DATA_FROM_DIGITAL_POWER_METER";  /*!< A string definition for NO_DATA_FROM_DIGITAL_POWER_METER */
	public static final String sRESERVED_18 = "RESERVED_18";  /*!< A string definition for RESERVED_18 */
	public static final String sRESERVED_19 = "RESERVED_19";  /*!< A string definition for RESERVED_19 */
	public static final String sRESERVED_20 = "RESERVED_20";  /*!< A string definition for RESERVED_20 */
	public static final String sRESERVED_21 = "RESERVED_21";  /*!< A string definition for RESERVED_21 */
	public static final String sRESERVED_22 = "RESERVED_22";  /*!< A string definition for RESERVED_22 */
	public static final String sRESERVED_23 = "RESERVED_23";  /*!< A string definition for RESERVED_23 */
	public static final String sRESERVED_24 = "RESERVED_24";  /*!< A string definition for RESERVED_24 */
	public static final String sRESERVED_25 = "RESERVED_25";  /*!< A string definition for RESERVED_25 */
	public static final String sRESERVED_26 = "RESERVED_26";  /*!< A string definition for RESERVED_26 */
	public static final String sRESERVED_27 = "RESERVED_27";  /*!< A string definition for RESERVED_27 */
	public static final String sRESERVED_28 = "RESERVED_28";  /*!< A string definition for RESERVED_28 */
	public static final String sRESERVED_29 = "RESERVED_29";  /*!< A string definition for RESERVED_29 */
	public static final String sRESERVED_30 = "RESERVED_30";  /*!< A string definition for RESERVED_30 */
	public static final String sALL_PURPOSE_ERROR = "ALL_PURPOSE_ERROR";  /*!< A string definition for ALL_PURPOSE_ERROR */
	private static final String[] sBinaryDataFlagsSet = {
		sINTEGRATION_FULLY_BLANKED,
		sWVR_APC,
		sCORRELATOR_MISSING_STATUS,
		sMISSING_ANTENNA_EVENT,
		sDELTA_SIGMA_OVERFLOW,
		sDELAY_CORRECTION_NOT_APPLIED,
		sSYNCRONIZATION_ERROR,
		sFFT_OVERFLOW,
		sTFB_SCALING_FACTOR_NOT_RETRIEVED,
		sZERO_LAG_NOT_RECEIVED,
		sSIGMA_OVERFLOW,
		sUNUSABLE_CAI_OUTPUT,
		sQC_FAILED,
		sNOISY_TDM_CHANNELS,
		sSPECTRAL_NORMALIZATION_FAILED,
		sDROPPED_PACKETS,
		sDETECTOR_SATURATED,
		sNO_DATA_FROM_DIGITAL_POWER_METER,
		sRESERVED_18,
		sRESERVED_19,
		sRESERVED_20,
		sRESERVED_21,
		sRESERVED_22,
		sRESERVED_23,
		sRESERVED_24,
		sRESERVED_25,
		sRESERVED_26,
		sRESERVED_27,
		sRESERVED_28,
		sRESERVED_29,
		sRESERVED_30,
		sALL_PURPOSE_ERROR
	};
	
	
	/**
	* Returns the version number of the enumeration BinaryDataFlags.
	*/
	public static int version() { 
		return alma.BinaryDataFlagsMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration BinaryDataFlags.
	*/
	public static String revision() { 
		return alma.BinaryDataFlagsMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in BinaryDataFlags.
	*/
	public static int size() { 
		return sBinaryDataFlagsSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified BinaryDataFlags's enumerator.
	*/
	public static String name(BinaryDataFlags f){
		switch(f.value()){
			case BinaryDataFlags._INTEGRATION_FULLY_BLANKED : 
				return sINTEGRATION_FULLY_BLANKED;
			case BinaryDataFlags._WVR_APC : 
				return sWVR_APC;
			case BinaryDataFlags._CORRELATOR_MISSING_STATUS : 
				return sCORRELATOR_MISSING_STATUS;
			case BinaryDataFlags._MISSING_ANTENNA_EVENT : 
				return sMISSING_ANTENNA_EVENT;
			case BinaryDataFlags._DELTA_SIGMA_OVERFLOW : 
				return sDELTA_SIGMA_OVERFLOW;
			case BinaryDataFlags._DELAY_CORRECTION_NOT_APPLIED : 
				return sDELAY_CORRECTION_NOT_APPLIED;
			case BinaryDataFlags._SYNCRONIZATION_ERROR : 
				return sSYNCRONIZATION_ERROR;
			case BinaryDataFlags._FFT_OVERFLOW : 
				return sFFT_OVERFLOW;
			case BinaryDataFlags._TFB_SCALING_FACTOR_NOT_RETRIEVED : 
				return sTFB_SCALING_FACTOR_NOT_RETRIEVED;
			case BinaryDataFlags._ZERO_LAG_NOT_RECEIVED : 
				return sZERO_LAG_NOT_RECEIVED;
			case BinaryDataFlags._SIGMA_OVERFLOW : 
				return sSIGMA_OVERFLOW;
			case BinaryDataFlags._UNUSABLE_CAI_OUTPUT : 
				return sUNUSABLE_CAI_OUTPUT;
			case BinaryDataFlags._QC_FAILED : 
				return sQC_FAILED;
			case BinaryDataFlags._NOISY_TDM_CHANNELS : 
				return sNOISY_TDM_CHANNELS;
			case BinaryDataFlags._SPECTRAL_NORMALIZATION_FAILED : 
				return sSPECTRAL_NORMALIZATION_FAILED;
			case BinaryDataFlags._DROPPED_PACKETS : 
				return sDROPPED_PACKETS;
			case BinaryDataFlags._DETECTOR_SATURATED : 
				return sDETECTOR_SATURATED;
			case BinaryDataFlags._NO_DATA_FROM_DIGITAL_POWER_METER : 
				return sNO_DATA_FROM_DIGITAL_POWER_METER;
			case BinaryDataFlags._RESERVED_18 : 
				return sRESERVED_18;
			case BinaryDataFlags._RESERVED_19 : 
				return sRESERVED_19;
			case BinaryDataFlags._RESERVED_20 : 
				return sRESERVED_20;
			case BinaryDataFlags._RESERVED_21 : 
				return sRESERVED_21;
			case BinaryDataFlags._RESERVED_22 : 
				return sRESERVED_22;
			case BinaryDataFlags._RESERVED_23 : 
				return sRESERVED_23;
			case BinaryDataFlags._RESERVED_24 : 
				return sRESERVED_24;
			case BinaryDataFlags._RESERVED_25 : 
				return sRESERVED_25;
			case BinaryDataFlags._RESERVED_26 : 
				return sRESERVED_26;
			case BinaryDataFlags._RESERVED_27 : 
				return sRESERVED_27;
			case BinaryDataFlags._RESERVED_28 : 
				return sRESERVED_28;
			case BinaryDataFlags._RESERVED_29 : 
				return sRESERVED_29;
			case BinaryDataFlags._RESERVED_30 : 
				return sRESERVED_30;
			case BinaryDataFlags._ALL_PURPOSE_ERROR : 
				return sALL_PURPOSE_ERROR;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified BinaryDataFlags's enumerator.
	*/
	public static String toString(BinaryDataFlags f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sBinaryDataFlagsSet;
	}
	
	
	/**
	* Returns a BinaryDataFlags's enumerator by specifying its name.
	*/
	public static BinaryDataFlags literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sINTEGRATION_FULLY_BLANKED)) return BinaryDataFlags.from_int(BinaryDataFlags._INTEGRATION_FULLY_BLANKED);
		if(name.equals(sWVR_APC)) return BinaryDataFlags.from_int(BinaryDataFlags._WVR_APC);
		if(name.equals(sCORRELATOR_MISSING_STATUS)) return BinaryDataFlags.from_int(BinaryDataFlags._CORRELATOR_MISSING_STATUS);
		if(name.equals(sMISSING_ANTENNA_EVENT)) return BinaryDataFlags.from_int(BinaryDataFlags._MISSING_ANTENNA_EVENT);
		if(name.equals(sDELTA_SIGMA_OVERFLOW)) return BinaryDataFlags.from_int(BinaryDataFlags._DELTA_SIGMA_OVERFLOW);
		if(name.equals(sDELAY_CORRECTION_NOT_APPLIED)) return BinaryDataFlags.from_int(BinaryDataFlags._DELAY_CORRECTION_NOT_APPLIED);
		if(name.equals(sSYNCRONIZATION_ERROR)) return BinaryDataFlags.from_int(BinaryDataFlags._SYNCRONIZATION_ERROR);
		if(name.equals(sFFT_OVERFLOW)) return BinaryDataFlags.from_int(BinaryDataFlags._FFT_OVERFLOW);
		if(name.equals(sTFB_SCALING_FACTOR_NOT_RETRIEVED)) return BinaryDataFlags.from_int(BinaryDataFlags._TFB_SCALING_FACTOR_NOT_RETRIEVED);
		if(name.equals(sZERO_LAG_NOT_RECEIVED)) return BinaryDataFlags.from_int(BinaryDataFlags._ZERO_LAG_NOT_RECEIVED);
		if(name.equals(sSIGMA_OVERFLOW)) return BinaryDataFlags.from_int(BinaryDataFlags._SIGMA_OVERFLOW);
		if(name.equals(sUNUSABLE_CAI_OUTPUT)) return BinaryDataFlags.from_int(BinaryDataFlags._UNUSABLE_CAI_OUTPUT);
		if(name.equals(sQC_FAILED)) return BinaryDataFlags.from_int(BinaryDataFlags._QC_FAILED);
		if(name.equals(sNOISY_TDM_CHANNELS)) return BinaryDataFlags.from_int(BinaryDataFlags._NOISY_TDM_CHANNELS);
		if(name.equals(sSPECTRAL_NORMALIZATION_FAILED)) return BinaryDataFlags.from_int(BinaryDataFlags._SPECTRAL_NORMALIZATION_FAILED);
		if(name.equals(sDROPPED_PACKETS)) return BinaryDataFlags.from_int(BinaryDataFlags._DROPPED_PACKETS);
		if(name.equals(sDETECTOR_SATURATED)) return BinaryDataFlags.from_int(BinaryDataFlags._DETECTOR_SATURATED);
		if(name.equals(sNO_DATA_FROM_DIGITAL_POWER_METER)) return BinaryDataFlags.from_int(BinaryDataFlags._NO_DATA_FROM_DIGITAL_POWER_METER);
		if(name.equals(sRESERVED_18)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_18);
		if(name.equals(sRESERVED_19)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_19);
		if(name.equals(sRESERVED_20)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_20);
		if(name.equals(sRESERVED_21)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_21);
		if(name.equals(sRESERVED_22)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_22);
		if(name.equals(sRESERVED_23)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_23);
		if(name.equals(sRESERVED_24)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_24);
		if(name.equals(sRESERVED_25)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_25);
		if(name.equals(sRESERVED_26)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_26);
		if(name.equals(sRESERVED_27)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_27);
		if(name.equals(sRESERVED_28)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_28);
		if(name.equals(sRESERVED_29)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_29);
		if(name.equals(sRESERVED_30)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_30);
		if(name.equals(sALL_PURPOSE_ERROR)) return BinaryDataFlags.from_int(BinaryDataFlags._ALL_PURPOSE_ERROR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a BinaryDataFlags enumeration object by specifying its name
	*/
	public static BinaryDataFlags newBinaryDataFlags(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sINTEGRATION_FULLY_BLANKED)) return BinaryDataFlags.from_int(BinaryDataFlags._INTEGRATION_FULLY_BLANKED);
		if(name.equals(sWVR_APC)) return BinaryDataFlags.from_int(BinaryDataFlags._WVR_APC);
		if(name.equals(sCORRELATOR_MISSING_STATUS)) return BinaryDataFlags.from_int(BinaryDataFlags._CORRELATOR_MISSING_STATUS);
		if(name.equals(sMISSING_ANTENNA_EVENT)) return BinaryDataFlags.from_int(BinaryDataFlags._MISSING_ANTENNA_EVENT);
		if(name.equals(sDELTA_SIGMA_OVERFLOW)) return BinaryDataFlags.from_int(BinaryDataFlags._DELTA_SIGMA_OVERFLOW);
		if(name.equals(sDELAY_CORRECTION_NOT_APPLIED)) return BinaryDataFlags.from_int(BinaryDataFlags._DELAY_CORRECTION_NOT_APPLIED);
		if(name.equals(sSYNCRONIZATION_ERROR)) return BinaryDataFlags.from_int(BinaryDataFlags._SYNCRONIZATION_ERROR);
		if(name.equals(sFFT_OVERFLOW)) return BinaryDataFlags.from_int(BinaryDataFlags._FFT_OVERFLOW);
		if(name.equals(sTFB_SCALING_FACTOR_NOT_RETRIEVED)) return BinaryDataFlags.from_int(BinaryDataFlags._TFB_SCALING_FACTOR_NOT_RETRIEVED);
		if(name.equals(sZERO_LAG_NOT_RECEIVED)) return BinaryDataFlags.from_int(BinaryDataFlags._ZERO_LAG_NOT_RECEIVED);
		if(name.equals(sSIGMA_OVERFLOW)) return BinaryDataFlags.from_int(BinaryDataFlags._SIGMA_OVERFLOW);
		if(name.equals(sUNUSABLE_CAI_OUTPUT)) return BinaryDataFlags.from_int(BinaryDataFlags._UNUSABLE_CAI_OUTPUT);
		if(name.equals(sQC_FAILED)) return BinaryDataFlags.from_int(BinaryDataFlags._QC_FAILED);
		if(name.equals(sNOISY_TDM_CHANNELS)) return BinaryDataFlags.from_int(BinaryDataFlags._NOISY_TDM_CHANNELS);
		if(name.equals(sSPECTRAL_NORMALIZATION_FAILED)) return BinaryDataFlags.from_int(BinaryDataFlags._SPECTRAL_NORMALIZATION_FAILED);
		if(name.equals(sDROPPED_PACKETS)) return BinaryDataFlags.from_int(BinaryDataFlags._DROPPED_PACKETS);
		if(name.equals(sDETECTOR_SATURATED)) return BinaryDataFlags.from_int(BinaryDataFlags._DETECTOR_SATURATED);
		if(name.equals(sNO_DATA_FROM_DIGITAL_POWER_METER)) return BinaryDataFlags.from_int(BinaryDataFlags._NO_DATA_FROM_DIGITAL_POWER_METER);
		if(name.equals(sRESERVED_18)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_18);
		if(name.equals(sRESERVED_19)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_19);
		if(name.equals(sRESERVED_20)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_20);
		if(name.equals(sRESERVED_21)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_21);
		if(name.equals(sRESERVED_22)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_22);
		if(name.equals(sRESERVED_23)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_23);
		if(name.equals(sRESERVED_24)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_24);
		if(name.equals(sRESERVED_25)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_25);
		if(name.equals(sRESERVED_26)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_26);
		if(name.equals(sRESERVED_27)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_27);
		if(name.equals(sRESERVED_28)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_28);
		if(name.equals(sRESERVED_29)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_29);
		if(name.equals(sRESERVED_30)) return BinaryDataFlags.from_int(BinaryDataFlags._RESERVED_30);
		if(name.equals(sALL_PURPOSE_ERROR)) return BinaryDataFlags.from_int(BinaryDataFlags._ALL_PURPOSE_ERROR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is BinaryDataFlags. 
	 * @parameter value an instance of BinaryDataFlags.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, BinaryDataFlags value) {
			
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


