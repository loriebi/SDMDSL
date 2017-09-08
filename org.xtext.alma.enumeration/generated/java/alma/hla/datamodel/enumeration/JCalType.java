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
 * File JCalType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CalTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CalType enumeration.
*/ 
public class JCalType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sCAL_AMPLI = "CAL_AMPLI";  /*!< A string definition for CAL_AMPLI */
	public static final String sCAL_ATMOSPHERE = "CAL_ATMOSPHERE";  /*!< A string definition for CAL_ATMOSPHERE */
	public static final String sCAL_BANDPASS = "CAL_BANDPASS";  /*!< A string definition for CAL_BANDPASS */
	public static final String sCAL_CURVE = "CAL_CURVE";  /*!< A string definition for CAL_CURVE */
	public static final String sCAL_DELAY = "CAL_DELAY";  /*!< A string definition for CAL_DELAY */
	public static final String sCAL_FLUX = "CAL_FLUX";  /*!< A string definition for CAL_FLUX */
	public static final String sCAL_FOCUS = "CAL_FOCUS";  /*!< A string definition for CAL_FOCUS */
	public static final String sCAL_FOCUS_MODEL = "CAL_FOCUS_MODEL";  /*!< A string definition for CAL_FOCUS_MODEL */
	public static final String sCAL_GAIN = "CAL_GAIN";  /*!< A string definition for CAL_GAIN */
	public static final String sCAL_HOLOGRAPHY = "CAL_HOLOGRAPHY";  /*!< A string definition for CAL_HOLOGRAPHY */
	public static final String sCAL_PHASE = "CAL_PHASE";  /*!< A string definition for CAL_PHASE */
	public static final String sCAL_POINTING = "CAL_POINTING";  /*!< A string definition for CAL_POINTING */
	public static final String sCAL_POINTING_MODEL = "CAL_POINTING_MODEL";  /*!< A string definition for CAL_POINTING_MODEL */
	public static final String sCAL_POSITION = "CAL_POSITION";  /*!< A string definition for CAL_POSITION */
	public static final String sCAL_PRIMARY_BEAM = "CAL_PRIMARY_BEAM";  /*!< A string definition for CAL_PRIMARY_BEAM */
	public static final String sCAL_SEEING = "CAL_SEEING";  /*!< A string definition for CAL_SEEING */
	public static final String sCAL_WVR = "CAL_WVR";  /*!< A string definition for CAL_WVR */
	public static final String sCAL_APPPHASE = "CAL_APPPHASE";  /*!< A string definition for CAL_APPPHASE */
	private static final String[] sCalTypeSet = {
		sCAL_AMPLI,
		sCAL_ATMOSPHERE,
		sCAL_BANDPASS,
		sCAL_CURVE,
		sCAL_DELAY,
		sCAL_FLUX,
		sCAL_FOCUS,
		sCAL_FOCUS_MODEL,
		sCAL_GAIN,
		sCAL_HOLOGRAPHY,
		sCAL_PHASE,
		sCAL_POINTING,
		sCAL_POINTING_MODEL,
		sCAL_POSITION,
		sCAL_PRIMARY_BEAM,
		sCAL_SEEING,
		sCAL_WVR,
		sCAL_APPPHASE
	};
	
	
	/**
	* Returns the version number of the enumeration CalType.
	*/
	public static int version() { 
		return alma.CalTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CalType.
	*/
	public static String revision() { 
		return alma.CalTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CalType.
	*/
	public static int size() { 
		return sCalTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CalType's enumerator.
	*/
	public static String name(CalType f){
		switch(f.value()){
			case CalType._CAL_AMPLI : 
				return sCAL_AMPLI;
			case CalType._CAL_ATMOSPHERE : 
				return sCAL_ATMOSPHERE;
			case CalType._CAL_BANDPASS : 
				return sCAL_BANDPASS;
			case CalType._CAL_CURVE : 
				return sCAL_CURVE;
			case CalType._CAL_DELAY : 
				return sCAL_DELAY;
			case CalType._CAL_FLUX : 
				return sCAL_FLUX;
			case CalType._CAL_FOCUS : 
				return sCAL_FOCUS;
			case CalType._CAL_FOCUS_MODEL : 
				return sCAL_FOCUS_MODEL;
			case CalType._CAL_GAIN : 
				return sCAL_GAIN;
			case CalType._CAL_HOLOGRAPHY : 
				return sCAL_HOLOGRAPHY;
			case CalType._CAL_PHASE : 
				return sCAL_PHASE;
			case CalType._CAL_POINTING : 
				return sCAL_POINTING;
			case CalType._CAL_POINTING_MODEL : 
				return sCAL_POINTING_MODEL;
			case CalType._CAL_POSITION : 
				return sCAL_POSITION;
			case CalType._CAL_PRIMARY_BEAM : 
				return sCAL_PRIMARY_BEAM;
			case CalType._CAL_SEEING : 
				return sCAL_SEEING;
			case CalType._CAL_WVR : 
				return sCAL_WVR;
			case CalType._CAL_APPPHASE : 
				return sCAL_APPPHASE;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CalType's enumerator.
	*/
	public static String toString(CalType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCalTypeSet;
	}
	
	
	/**
	* Returns a CalType's enumerator by specifying its name.
	*/
	public static CalType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCAL_AMPLI)) return CalType.from_int(CalType._CAL_AMPLI);
		if(name.equals(sCAL_ATMOSPHERE)) return CalType.from_int(CalType._CAL_ATMOSPHERE);
		if(name.equals(sCAL_BANDPASS)) return CalType.from_int(CalType._CAL_BANDPASS);
		if(name.equals(sCAL_CURVE)) return CalType.from_int(CalType._CAL_CURVE);
		if(name.equals(sCAL_DELAY)) return CalType.from_int(CalType._CAL_DELAY);
		if(name.equals(sCAL_FLUX)) return CalType.from_int(CalType._CAL_FLUX);
		if(name.equals(sCAL_FOCUS)) return CalType.from_int(CalType._CAL_FOCUS);
		if(name.equals(sCAL_FOCUS_MODEL)) return CalType.from_int(CalType._CAL_FOCUS_MODEL);
		if(name.equals(sCAL_GAIN)) return CalType.from_int(CalType._CAL_GAIN);
		if(name.equals(sCAL_HOLOGRAPHY)) return CalType.from_int(CalType._CAL_HOLOGRAPHY);
		if(name.equals(sCAL_PHASE)) return CalType.from_int(CalType._CAL_PHASE);
		if(name.equals(sCAL_POINTING)) return CalType.from_int(CalType._CAL_POINTING);
		if(name.equals(sCAL_POINTING_MODEL)) return CalType.from_int(CalType._CAL_POINTING_MODEL);
		if(name.equals(sCAL_POSITION)) return CalType.from_int(CalType._CAL_POSITION);
		if(name.equals(sCAL_PRIMARY_BEAM)) return CalType.from_int(CalType._CAL_PRIMARY_BEAM);
		if(name.equals(sCAL_SEEING)) return CalType.from_int(CalType._CAL_SEEING);
		if(name.equals(sCAL_WVR)) return CalType.from_int(CalType._CAL_WVR);
		if(name.equals(sCAL_APPPHASE)) return CalType.from_int(CalType._CAL_APPPHASE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CalType enumeration object by specifying its name
	*/
	public static CalType newCalType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCAL_AMPLI)) return CalType.from_int(CalType._CAL_AMPLI);
		if(name.equals(sCAL_ATMOSPHERE)) return CalType.from_int(CalType._CAL_ATMOSPHERE);
		if(name.equals(sCAL_BANDPASS)) return CalType.from_int(CalType._CAL_BANDPASS);
		if(name.equals(sCAL_CURVE)) return CalType.from_int(CalType._CAL_CURVE);
		if(name.equals(sCAL_DELAY)) return CalType.from_int(CalType._CAL_DELAY);
		if(name.equals(sCAL_FLUX)) return CalType.from_int(CalType._CAL_FLUX);
		if(name.equals(sCAL_FOCUS)) return CalType.from_int(CalType._CAL_FOCUS);
		if(name.equals(sCAL_FOCUS_MODEL)) return CalType.from_int(CalType._CAL_FOCUS_MODEL);
		if(name.equals(sCAL_GAIN)) return CalType.from_int(CalType._CAL_GAIN);
		if(name.equals(sCAL_HOLOGRAPHY)) return CalType.from_int(CalType._CAL_HOLOGRAPHY);
		if(name.equals(sCAL_PHASE)) return CalType.from_int(CalType._CAL_PHASE);
		if(name.equals(sCAL_POINTING)) return CalType.from_int(CalType._CAL_POINTING);
		if(name.equals(sCAL_POINTING_MODEL)) return CalType.from_int(CalType._CAL_POINTING_MODEL);
		if(name.equals(sCAL_POSITION)) return CalType.from_int(CalType._CAL_POSITION);
		if(name.equals(sCAL_PRIMARY_BEAM)) return CalType.from_int(CalType._CAL_PRIMARY_BEAM);
		if(name.equals(sCAL_SEEING)) return CalType.from_int(CalType._CAL_SEEING);
		if(name.equals(sCAL_WVR)) return CalType.from_int(CalType._CAL_WVR);
		if(name.equals(sCAL_APPPHASE)) return CalType.from_int(CalType._CAL_APPPHASE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CalType. 
	 * @parameter value an instance of CalType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CalType value) {
			
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


