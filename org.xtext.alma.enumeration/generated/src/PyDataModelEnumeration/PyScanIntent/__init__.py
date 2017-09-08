#! /usr/bin/env python
# ALMA - Atacama Large Millimeter Array
# (c) European Southern Observatory, 2002
# (c) Associated Universities Inc., 2002
# Copyright by ESO (in the framework of the ALMA collaboration),
# Copyright by AUI (in the framework of the ALMA collaboration),
# All rights reserved.
# 
# This library is free software; you can redistribute it and/or
# modify it under the terms of the GNU Lesser General Public
# License as published by the Free software Foundation; either
# version 2.1 of the License, or (at your option) any later version.
# 
# This library is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY, without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
# Lesser General Public License for more details.
# 
# You should have received a copy of the GNU Lesser General Public
# License along with this library; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place, Suite 330, Boston,
# MA 02111-1307  USA
# 
# /////////////////////////////////////////////////////////////////
# // WARNING!  DO NOT MODIFY THIS FILE!                          //
# //  =========================================================  //
# // | This is generated code!  Do not modify this file.       | //
# // | Any changes will be lost when the file is re-generated. | //
# //  =========================================================  //
# /////////////////////////////////////////////////////////////////
#
# File __init__.py
#


from ScanIntentMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'CALIBRATE_AMPLI': CALIBRATE_AMPLI,
			'CALIBRATE_ATMOSPHERE': CALIBRATE_ATMOSPHERE,
			'CALIBRATE_BANDPASS': CALIBRATE_BANDPASS,
			'CALIBRATE_DELAY': CALIBRATE_DELAY,
			'CALIBRATE_FLUX': CALIBRATE_FLUX,
			'CALIBRATE_FOCUS': CALIBRATE_FOCUS,
			'CALIBRATE_FOCUS_X': CALIBRATE_FOCUS_X,
			'CALIBRATE_FOCUS_Y': CALIBRATE_FOCUS_Y,
			'CALIBRATE_PHASE': CALIBRATE_PHASE,
			'CALIBRATE_POINTING': CALIBRATE_POINTING,
			'CALIBRATE_POLARIZATION': CALIBRATE_POLARIZATION,
			'CALIBRATE_SIDEBAND_RATIO': CALIBRATE_SIDEBAND_RATIO,
			'CALIBRATE_WVR': CALIBRATE_WVR,
			'DO_SKYDIP': DO_SKYDIP,
			'MAP_ANTENNA_SURFACE': MAP_ANTENNA_SURFACE,
			'MAP_PRIMARY_BEAM': MAP_PRIMARY_BEAM,
			'OBSERVE_TARGET': OBSERVE_TARGET,
			'CALIBRATE_POL_LEAKAGE': CALIBRATE_POL_LEAKAGE,
			'CALIBRATE_POL_ANGLE': CALIBRATE_POL_ANGLE,
			'TEST': TEST,
			'UNSPECIFIED': UNSPECIFIED,
			'CALIBRATE_ANTENNA_POSITION': CALIBRATE_ANTENNA_POSITION,
			'CALIBRATE_ANTENNA_PHASE': CALIBRATE_ANTENNA_PHASE,
			'MEASURE_RFI': MEASURE_RFI,
			'CALIBRATE_ANTENNA_POINTING_MODEL': CALIBRATE_ANTENNA_POINTING_MODEL,
			'SYSTEM_CONFIGURATION': SYSTEM_CONFIGURATION,
			'CALIBRATE_APPPHASE_ACTIVE': CALIBRATE_APPPHASE_ACTIVE,
			'CALIBRATE_APPPHASE_PASSIVE': CALIBRATE_APPPHASE_PASSIVE,
			'OBSERVE_CHECK_SOURCE': OBSERVE_CHECK_SOURCE,
			'CALIBRATE_DIFFGAIN': CALIBRATE_DIFFGAIN,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def ScanIntentSet():
	return [
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
		'ScanIntent',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		CALIBRATE_AMPLI: 'CALIBRATE_AMPLI',
		CALIBRATE_ATMOSPHERE: 'CALIBRATE_ATMOSPHERE',
		CALIBRATE_BANDPASS: 'CALIBRATE_BANDPASS',
		CALIBRATE_DELAY: 'CALIBRATE_DELAY',
		CALIBRATE_FLUX: 'CALIBRATE_FLUX',
		CALIBRATE_FOCUS: 'CALIBRATE_FOCUS',
		CALIBRATE_FOCUS_X: 'CALIBRATE_FOCUS_X',
		CALIBRATE_FOCUS_Y: 'CALIBRATE_FOCUS_Y',
		CALIBRATE_PHASE: 'CALIBRATE_PHASE',
		CALIBRATE_POINTING: 'CALIBRATE_POINTING',
		CALIBRATE_POLARIZATION: 'CALIBRATE_POLARIZATION',
		CALIBRATE_SIDEBAND_RATIO: 'CALIBRATE_SIDEBAND_RATIO',
		CALIBRATE_WVR: 'CALIBRATE_WVR',
		DO_SKYDIP: 'DO_SKYDIP',
		MAP_ANTENNA_SURFACE: 'MAP_ANTENNA_SURFACE',
		MAP_PRIMARY_BEAM: 'MAP_PRIMARY_BEAM',
		OBSERVE_TARGET: 'OBSERVE_TARGET',
		CALIBRATE_POL_LEAKAGE: 'CALIBRATE_POL_LEAKAGE',
		CALIBRATE_POL_ANGLE: 'CALIBRATE_POL_ANGLE',
		TEST: 'TEST',
		UNSPECIFIED: 'UNSPECIFIED',
		CALIBRATE_ANTENNA_POSITION: 'CALIBRATE_ANTENNA_POSITION',
		CALIBRATE_ANTENNA_PHASE: 'CALIBRATE_ANTENNA_PHASE',
		MEASURE_RFI: 'MEASURE_RFI',
		CALIBRATE_ANTENNA_POINTING_MODEL: 'CALIBRATE_ANTENNA_POINTING_MODEL',
		SYSTEM_CONFIGURATION: 'SYSTEM_CONFIGURATION',
		CALIBRATE_APPPHASE_ACTIVE: 'CALIBRATE_APPPHASE_ACTIVE',
		CALIBRATE_APPPHASE_PASSIVE: 'CALIBRATE_APPPHASE_PASSIVE',
		OBSERVE_CHECK_SOURCE: 'OBSERVE_CHECK_SOURCE',
		CALIBRATE_DIFFGAIN: 'CALIBRATE_DIFFGAIN',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		CALIBRATE_AMPLI: """!< Amplitude calibration scan """,
		CALIBRATE_ATMOSPHERE: """!< Atmosphere calibration scan """,
		CALIBRATE_BANDPASS: """!< Bandpass calibration scan """,
		CALIBRATE_DELAY: """!< Delay calibration scan """,
		CALIBRATE_FLUX: """!< flux measurement scan. """,
		CALIBRATE_FOCUS: """!< Focus calibration scan. Z coordinate to be derived """,
		CALIBRATE_FOCUS_X: """!< Focus calibration scan; X focus coordinate to be derived """,
		CALIBRATE_FOCUS_Y: """!< Focus calibration scan; Y focus coordinate to be derived """,
		CALIBRATE_PHASE: """!< Phase calibration scan """,
		CALIBRATE_POINTING: """!< Pointing calibration scan """,
		CALIBRATE_POLARIZATION: """!< Polarization calibration scan """,
		CALIBRATE_SIDEBAND_RATIO: """!< measure relative gains of sidebands. """,
		CALIBRATE_WVR: """!< Data from the water vapor radiometers (and correlation data) are used to derive their calibration parameters. """,
		DO_SKYDIP: """!< Skydip calibration scan """,
		MAP_ANTENNA_SURFACE: """!< Holography calibration scan """,
		MAP_PRIMARY_BEAM: """!< Data on a celestial calibration source are used to derive a map of the primary beam. """,
		OBSERVE_TARGET: """!< Target source scan """,
		CALIBRATE_POL_LEAKAGE: """!<  """,
		CALIBRATE_POL_ANGLE: """!<  """,
		TEST: """!< used for development. """,
		UNSPECIFIED: """!< Unspecified scan intent """,
		CALIBRATE_ANTENNA_POSITION: """!< Requested by EVLA. """,
		CALIBRATE_ANTENNA_PHASE: """!< Requested by EVLA. """,
		MEASURE_RFI: """!< Requested by EVLA. """,
		CALIBRATE_ANTENNA_POINTING_MODEL: """!< Requested by EVLA. """,
		SYSTEM_CONFIGURATION: """!< Requested by EVLA. """,
		CALIBRATE_APPPHASE_ACTIVE: """!< Calculate and apply phasing solutions. Applicable at ALMA. """,
		CALIBRATE_APPPHASE_PASSIVE: """!< Apply previously obtained phasing solutions. Applicable at ALMA. """,
		OBSERVE_CHECK_SOURCE: """!<  """,
		CALIBRATE_DIFFGAIN: """!< Enable a gain differential target type """,
	}

def hasAssociatedNumber():
 	return False
 	
def newScanIntent(p):
     if type(p) is str:
         return fromString(p)
     return None
