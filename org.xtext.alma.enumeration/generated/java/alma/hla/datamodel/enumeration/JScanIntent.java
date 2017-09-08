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
 * File JScanIntent.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.ScanIntentMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the ScanIntent enumeration.
*/ 
public class JScanIntent {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sCALIBRATE_AMPLI = "CALIBRATE_AMPLI";  /*!< A string definition for CALIBRATE_AMPLI */
	public static final String sCALIBRATE_ATMOSPHERE = "CALIBRATE_ATMOSPHERE";  /*!< A string definition for CALIBRATE_ATMOSPHERE */
	public static final String sCALIBRATE_BANDPASS = "CALIBRATE_BANDPASS";  /*!< A string definition for CALIBRATE_BANDPASS */
	public static final String sCALIBRATE_DELAY = "CALIBRATE_DELAY";  /*!< A string definition for CALIBRATE_DELAY */
	public static final String sCALIBRATE_FLUX = "CALIBRATE_FLUX";  /*!< A string definition for CALIBRATE_FLUX */
	public static final String sCALIBRATE_FOCUS = "CALIBRATE_FOCUS";  /*!< A string definition for CALIBRATE_FOCUS */
	public static final String sCALIBRATE_FOCUS_X = "CALIBRATE_FOCUS_X";  /*!< A string definition for CALIBRATE_FOCUS_X */
	public static final String sCALIBRATE_FOCUS_Y = "CALIBRATE_FOCUS_Y";  /*!< A string definition for CALIBRATE_FOCUS_Y */
	public static final String sCALIBRATE_PHASE = "CALIBRATE_PHASE";  /*!< A string definition for CALIBRATE_PHASE */
	public static final String sCALIBRATE_POINTING = "CALIBRATE_POINTING";  /*!< A string definition for CALIBRATE_POINTING */
	public static final String sCALIBRATE_POLARIZATION = "CALIBRATE_POLARIZATION";  /*!< A string definition for CALIBRATE_POLARIZATION */
	public static final String sCALIBRATE_SIDEBAND_RATIO = "CALIBRATE_SIDEBAND_RATIO";  /*!< A string definition for CALIBRATE_SIDEBAND_RATIO */
	public static final String sCALIBRATE_WVR = "CALIBRATE_WVR";  /*!< A string definition for CALIBRATE_WVR */
	public static final String sDO_SKYDIP = "DO_SKYDIP";  /*!< A string definition for DO_SKYDIP */
	public static final String sMAP_ANTENNA_SURFACE = "MAP_ANTENNA_SURFACE";  /*!< A string definition for MAP_ANTENNA_SURFACE */
	public static final String sMAP_PRIMARY_BEAM = "MAP_PRIMARY_BEAM";  /*!< A string definition for MAP_PRIMARY_BEAM */
	public static final String sOBSERVE_TARGET = "OBSERVE_TARGET";  /*!< A string definition for OBSERVE_TARGET */
	public static final String sCALIBRATE_POL_LEAKAGE = "CALIBRATE_POL_LEAKAGE";  /*!< A string definition for CALIBRATE_POL_LEAKAGE */
	public static final String sCALIBRATE_POL_ANGLE = "CALIBRATE_POL_ANGLE";  /*!< A string definition for CALIBRATE_POL_ANGLE */
	public static final String sTEST = "TEST";  /*!< A string definition for TEST */
	public static final String sUNSPECIFIED = "UNSPECIFIED";  /*!< A string definition for UNSPECIFIED */
	public static final String sCALIBRATE_ANTENNA_POSITION = "CALIBRATE_ANTENNA_POSITION";  /*!< A string definition for CALIBRATE_ANTENNA_POSITION */
	public static final String sCALIBRATE_ANTENNA_PHASE = "CALIBRATE_ANTENNA_PHASE";  /*!< A string definition for CALIBRATE_ANTENNA_PHASE */
	public static final String sMEASURE_RFI = "MEASURE_RFI";  /*!< A string definition for MEASURE_RFI */
	public static final String sCALIBRATE_ANTENNA_POINTING_MODEL = "CALIBRATE_ANTENNA_POINTING_MODEL";  /*!< A string definition for CALIBRATE_ANTENNA_POINTING_MODEL */
	public static final String sSYSTEM_CONFIGURATION = "SYSTEM_CONFIGURATION";  /*!< A string definition for SYSTEM_CONFIGURATION */
	public static final String sCALIBRATE_APPPHASE_ACTIVE = "CALIBRATE_APPPHASE_ACTIVE";  /*!< A string definition for CALIBRATE_APPPHASE_ACTIVE */
	public static final String sCALIBRATE_APPPHASE_PASSIVE = "CALIBRATE_APPPHASE_PASSIVE";  /*!< A string definition for CALIBRATE_APPPHASE_PASSIVE */
	public static final String sOBSERVE_CHECK_SOURCE = "OBSERVE_CHECK_SOURCE";  /*!< A string definition for OBSERVE_CHECK_SOURCE */
	public static final String sCALIBRATE_DIFFGAIN = "CALIBRATE_DIFFGAIN";  /*!< A string definition for CALIBRATE_DIFFGAIN */
	private static final String[] sScanIntentSet = {
		sCALIBRATE_AMPLI,
		sCALIBRATE_ATMOSPHERE,
		sCALIBRATE_BANDPASS,
		sCALIBRATE_DELAY,
		sCALIBRATE_FLUX,
		sCALIBRATE_FOCUS,
		sCALIBRATE_FOCUS_X,
		sCALIBRATE_FOCUS_Y,
		sCALIBRATE_PHASE,
		sCALIBRATE_POINTING,
		sCALIBRATE_POLARIZATION,
		sCALIBRATE_SIDEBAND_RATIO,
		sCALIBRATE_WVR,
		sDO_SKYDIP,
		sMAP_ANTENNA_SURFACE,
		sMAP_PRIMARY_BEAM,
		sOBSERVE_TARGET,
		sCALIBRATE_POL_LEAKAGE,
		sCALIBRATE_POL_ANGLE,
		sTEST,
		sUNSPECIFIED,
		sCALIBRATE_ANTENNA_POSITION,
		sCALIBRATE_ANTENNA_PHASE,
		sMEASURE_RFI,
		sCALIBRATE_ANTENNA_POINTING_MODEL,
		sSYSTEM_CONFIGURATION,
		sCALIBRATE_APPPHASE_ACTIVE,
		sCALIBRATE_APPPHASE_PASSIVE,
		sOBSERVE_CHECK_SOURCE,
		sCALIBRATE_DIFFGAIN
	};
	
	
	/**
	* Returns the version number of the enumeration ScanIntent.
	*/
	public static int version() { 
		return alma.ScanIntentMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration ScanIntent.
	*/
	public static String revision() { 
		return alma.ScanIntentMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in ScanIntent.
	*/
	public static int size() { 
		return sScanIntentSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified ScanIntent's enumerator.
	*/
	public static String name(ScanIntent f){
		switch(f.value()){
			case ScanIntent._CALIBRATE_AMPLI : 
				return sCALIBRATE_AMPLI;
			case ScanIntent._CALIBRATE_ATMOSPHERE : 
				return sCALIBRATE_ATMOSPHERE;
			case ScanIntent._CALIBRATE_BANDPASS : 
				return sCALIBRATE_BANDPASS;
			case ScanIntent._CALIBRATE_DELAY : 
				return sCALIBRATE_DELAY;
			case ScanIntent._CALIBRATE_FLUX : 
				return sCALIBRATE_FLUX;
			case ScanIntent._CALIBRATE_FOCUS : 
				return sCALIBRATE_FOCUS;
			case ScanIntent._CALIBRATE_FOCUS_X : 
				return sCALIBRATE_FOCUS_X;
			case ScanIntent._CALIBRATE_FOCUS_Y : 
				return sCALIBRATE_FOCUS_Y;
			case ScanIntent._CALIBRATE_PHASE : 
				return sCALIBRATE_PHASE;
			case ScanIntent._CALIBRATE_POINTING : 
				return sCALIBRATE_POINTING;
			case ScanIntent._CALIBRATE_POLARIZATION : 
				return sCALIBRATE_POLARIZATION;
			case ScanIntent._CALIBRATE_SIDEBAND_RATIO : 
				return sCALIBRATE_SIDEBAND_RATIO;
			case ScanIntent._CALIBRATE_WVR : 
				return sCALIBRATE_WVR;
			case ScanIntent._DO_SKYDIP : 
				return sDO_SKYDIP;
			case ScanIntent._MAP_ANTENNA_SURFACE : 
				return sMAP_ANTENNA_SURFACE;
			case ScanIntent._MAP_PRIMARY_BEAM : 
				return sMAP_PRIMARY_BEAM;
			case ScanIntent._OBSERVE_TARGET : 
				return sOBSERVE_TARGET;
			case ScanIntent._CALIBRATE_POL_LEAKAGE : 
				return sCALIBRATE_POL_LEAKAGE;
			case ScanIntent._CALIBRATE_POL_ANGLE : 
				return sCALIBRATE_POL_ANGLE;
			case ScanIntent._TEST : 
				return sTEST;
			case ScanIntent._UNSPECIFIED : 
				return sUNSPECIFIED;
			case ScanIntent._CALIBRATE_ANTENNA_POSITION : 
				return sCALIBRATE_ANTENNA_POSITION;
			case ScanIntent._CALIBRATE_ANTENNA_PHASE : 
				return sCALIBRATE_ANTENNA_PHASE;
			case ScanIntent._MEASURE_RFI : 
				return sMEASURE_RFI;
			case ScanIntent._CALIBRATE_ANTENNA_POINTING_MODEL : 
				return sCALIBRATE_ANTENNA_POINTING_MODEL;
			case ScanIntent._SYSTEM_CONFIGURATION : 
				return sSYSTEM_CONFIGURATION;
			case ScanIntent._CALIBRATE_APPPHASE_ACTIVE : 
				return sCALIBRATE_APPPHASE_ACTIVE;
			case ScanIntent._CALIBRATE_APPPHASE_PASSIVE : 
				return sCALIBRATE_APPPHASE_PASSIVE;
			case ScanIntent._OBSERVE_CHECK_SOURCE : 
				return sOBSERVE_CHECK_SOURCE;
			case ScanIntent._CALIBRATE_DIFFGAIN : 
				return sCALIBRATE_DIFFGAIN;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified ScanIntent's enumerator.
	*/
	public static String toString(ScanIntent f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sScanIntentSet;
	}
	
	
	/**
	* Returns a ScanIntent's enumerator by specifying its name.
	*/
	public static ScanIntent literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCALIBRATE_AMPLI)) return ScanIntent.from_int(ScanIntent._CALIBRATE_AMPLI);
		if(name.equals(sCALIBRATE_ATMOSPHERE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ATMOSPHERE);
		if(name.equals(sCALIBRATE_BANDPASS)) return ScanIntent.from_int(ScanIntent._CALIBRATE_BANDPASS);
		if(name.equals(sCALIBRATE_DELAY)) return ScanIntent.from_int(ScanIntent._CALIBRATE_DELAY);
		if(name.equals(sCALIBRATE_FLUX)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FLUX);
		if(name.equals(sCALIBRATE_FOCUS)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FOCUS);
		if(name.equals(sCALIBRATE_FOCUS_X)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FOCUS_X);
		if(name.equals(sCALIBRATE_FOCUS_Y)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FOCUS_Y);
		if(name.equals(sCALIBRATE_PHASE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_PHASE);
		if(name.equals(sCALIBRATE_POINTING)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POINTING);
		if(name.equals(sCALIBRATE_POLARIZATION)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POLARIZATION);
		if(name.equals(sCALIBRATE_SIDEBAND_RATIO)) return ScanIntent.from_int(ScanIntent._CALIBRATE_SIDEBAND_RATIO);
		if(name.equals(sCALIBRATE_WVR)) return ScanIntent.from_int(ScanIntent._CALIBRATE_WVR);
		if(name.equals(sDO_SKYDIP)) return ScanIntent.from_int(ScanIntent._DO_SKYDIP);
		if(name.equals(sMAP_ANTENNA_SURFACE)) return ScanIntent.from_int(ScanIntent._MAP_ANTENNA_SURFACE);
		if(name.equals(sMAP_PRIMARY_BEAM)) return ScanIntent.from_int(ScanIntent._MAP_PRIMARY_BEAM);
		if(name.equals(sOBSERVE_TARGET)) return ScanIntent.from_int(ScanIntent._OBSERVE_TARGET);
		if(name.equals(sCALIBRATE_POL_LEAKAGE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POL_LEAKAGE);
		if(name.equals(sCALIBRATE_POL_ANGLE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POL_ANGLE);
		if(name.equals(sTEST)) return ScanIntent.from_int(ScanIntent._TEST);
		if(name.equals(sUNSPECIFIED)) return ScanIntent.from_int(ScanIntent._UNSPECIFIED);
		if(name.equals(sCALIBRATE_ANTENNA_POSITION)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ANTENNA_POSITION);
		if(name.equals(sCALIBRATE_ANTENNA_PHASE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ANTENNA_PHASE);
		if(name.equals(sMEASURE_RFI)) return ScanIntent.from_int(ScanIntent._MEASURE_RFI);
		if(name.equals(sCALIBRATE_ANTENNA_POINTING_MODEL)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ANTENNA_POINTING_MODEL);
		if(name.equals(sSYSTEM_CONFIGURATION)) return ScanIntent.from_int(ScanIntent._SYSTEM_CONFIGURATION);
		if(name.equals(sCALIBRATE_APPPHASE_ACTIVE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_APPPHASE_ACTIVE);
		if(name.equals(sCALIBRATE_APPPHASE_PASSIVE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_APPPHASE_PASSIVE);
		if(name.equals(sOBSERVE_CHECK_SOURCE)) return ScanIntent.from_int(ScanIntent._OBSERVE_CHECK_SOURCE);
		if(name.equals(sCALIBRATE_DIFFGAIN)) return ScanIntent.from_int(ScanIntent._CALIBRATE_DIFFGAIN);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a ScanIntent enumeration object by specifying its name
	*/
	public static ScanIntent newScanIntent(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCALIBRATE_AMPLI)) return ScanIntent.from_int(ScanIntent._CALIBRATE_AMPLI);
		if(name.equals(sCALIBRATE_ATMOSPHERE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ATMOSPHERE);
		if(name.equals(sCALIBRATE_BANDPASS)) return ScanIntent.from_int(ScanIntent._CALIBRATE_BANDPASS);
		if(name.equals(sCALIBRATE_DELAY)) return ScanIntent.from_int(ScanIntent._CALIBRATE_DELAY);
		if(name.equals(sCALIBRATE_FLUX)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FLUX);
		if(name.equals(sCALIBRATE_FOCUS)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FOCUS);
		if(name.equals(sCALIBRATE_FOCUS_X)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FOCUS_X);
		if(name.equals(sCALIBRATE_FOCUS_Y)) return ScanIntent.from_int(ScanIntent._CALIBRATE_FOCUS_Y);
		if(name.equals(sCALIBRATE_PHASE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_PHASE);
		if(name.equals(sCALIBRATE_POINTING)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POINTING);
		if(name.equals(sCALIBRATE_POLARIZATION)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POLARIZATION);
		if(name.equals(sCALIBRATE_SIDEBAND_RATIO)) return ScanIntent.from_int(ScanIntent._CALIBRATE_SIDEBAND_RATIO);
		if(name.equals(sCALIBRATE_WVR)) return ScanIntent.from_int(ScanIntent._CALIBRATE_WVR);
		if(name.equals(sDO_SKYDIP)) return ScanIntent.from_int(ScanIntent._DO_SKYDIP);
		if(name.equals(sMAP_ANTENNA_SURFACE)) return ScanIntent.from_int(ScanIntent._MAP_ANTENNA_SURFACE);
		if(name.equals(sMAP_PRIMARY_BEAM)) return ScanIntent.from_int(ScanIntent._MAP_PRIMARY_BEAM);
		if(name.equals(sOBSERVE_TARGET)) return ScanIntent.from_int(ScanIntent._OBSERVE_TARGET);
		if(name.equals(sCALIBRATE_POL_LEAKAGE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POL_LEAKAGE);
		if(name.equals(sCALIBRATE_POL_ANGLE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_POL_ANGLE);
		if(name.equals(sTEST)) return ScanIntent.from_int(ScanIntent._TEST);
		if(name.equals(sUNSPECIFIED)) return ScanIntent.from_int(ScanIntent._UNSPECIFIED);
		if(name.equals(sCALIBRATE_ANTENNA_POSITION)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ANTENNA_POSITION);
		if(name.equals(sCALIBRATE_ANTENNA_PHASE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ANTENNA_PHASE);
		if(name.equals(sMEASURE_RFI)) return ScanIntent.from_int(ScanIntent._MEASURE_RFI);
		if(name.equals(sCALIBRATE_ANTENNA_POINTING_MODEL)) return ScanIntent.from_int(ScanIntent._CALIBRATE_ANTENNA_POINTING_MODEL);
		if(name.equals(sSYSTEM_CONFIGURATION)) return ScanIntent.from_int(ScanIntent._SYSTEM_CONFIGURATION);
		if(name.equals(sCALIBRATE_APPPHASE_ACTIVE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_APPPHASE_ACTIVE);
		if(name.equals(sCALIBRATE_APPPHASE_PASSIVE)) return ScanIntent.from_int(ScanIntent._CALIBRATE_APPPHASE_PASSIVE);
		if(name.equals(sOBSERVE_CHECK_SOURCE)) return ScanIntent.from_int(ScanIntent._OBSERVE_CHECK_SOURCE);
		if(name.equals(sCALIBRATE_DIFFGAIN)) return ScanIntent.from_int(ScanIntent._CALIBRATE_DIFFGAIN);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is ScanIntent. 
	 * @parameter value an instance of ScanIntent.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, ScanIntent value) {
			
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


