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


from CalibrationDeviceMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'AMBIENT_LOAD': AMBIENT_LOAD,
			'COLD_LOAD': COLD_LOAD,
			'HOT_LOAD': HOT_LOAD,
			'NOISE_TUBE_LOAD': NOISE_TUBE_LOAD,
			'QUARTER_WAVE_PLATE': QUARTER_WAVE_PLATE,
			'SOLAR_FILTER': SOLAR_FILTER,
			'NONE': NONE,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def CalibrationDeviceSet():
	return [
		'CalibrationDevice',
		'CalibrationDevice',
		'CalibrationDevice',
		'CalibrationDevice',
		'CalibrationDevice',
		'CalibrationDevice',
		'CalibrationDevice',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		AMBIENT_LOAD: 'AMBIENT_LOAD',
		COLD_LOAD: 'COLD_LOAD',
		HOT_LOAD: 'HOT_LOAD',
		NOISE_TUBE_LOAD: 'NOISE_TUBE_LOAD',
		QUARTER_WAVE_PLATE: 'QUARTER_WAVE_PLATE',
		SOLAR_FILTER: 'SOLAR_FILTER',
		NONE: 'NONE',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		AMBIENT_LOAD: """!< An absorbing load at the ambient temperature. """,
		COLD_LOAD: """!< A cooled absorbing load. """,
		HOT_LOAD: """!< A heated absorbing load. """,
		NOISE_TUBE_LOAD: """!< A noise tube. """,
		QUARTER_WAVE_PLATE: """!< A transparent plate that introduces a 90-degree phase difference between othogonal polarizations. """,
		SOLAR_FILTER: """!< An optical attenuator (to protect receiver from solar heat). """,
		NONE: """!< No device, the receiver looks at the sky (through the telescope). """,
	}

def hasAssociatedNumber():
 	return False
 	
def newCalibrationDevice(p):
     if type(p) is str:
         return fromString(p)
     return None
