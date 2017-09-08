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


from SwitchingModeMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'NO_SWITCHING': NO_SWITCHING,
			'LOAD_SWITCHING': LOAD_SWITCHING,
			'POSITION_SWITCHING': POSITION_SWITCHING,
			'PHASE_SWITCHING': PHASE_SWITCHING,
			'FREQUENCY_SWITCHING': FREQUENCY_SWITCHING,
			'NUTATOR_SWITCHING': NUTATOR_SWITCHING,
			'CHOPPER_WHEEL': CHOPPER_WHEEL,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def SwitchingModeSet():
	return [
		'SwitchingMode',
		'SwitchingMode',
		'SwitchingMode',
		'SwitchingMode',
		'SwitchingMode',
		'SwitchingMode',
		'SwitchingMode',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		NO_SWITCHING: 'NO_SWITCHING',
		LOAD_SWITCHING: 'LOAD_SWITCHING',
		POSITION_SWITCHING: 'POSITION_SWITCHING',
		PHASE_SWITCHING: 'PHASE_SWITCHING',
		FREQUENCY_SWITCHING: 'FREQUENCY_SWITCHING',
		NUTATOR_SWITCHING: 'NUTATOR_SWITCHING',
		CHOPPER_WHEEL: 'CHOPPER_WHEEL',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		NO_SWITCHING: """!< No switching """,
		LOAD_SWITCHING: """!< Receiver beam is switched between sky and load """,
		POSITION_SWITCHING: """!< Antenna (main reflector) pointing direction  is switched  """,
		PHASE_SWITCHING: """!< 90 degrees phase switching  (switching mode used for sideband separation or rejection with DSB receivers) """,
		FREQUENCY_SWITCHING: """!< LO frequency is switched (definition context sensitive: fast if cycle shrorter than the integration duration, slow if e.g. step one step per subscan) """,
		NUTATOR_SWITCHING: """!< Switching between different directions by nutating the sub-reflector """,
		CHOPPER_WHEEL: """!< Switching using a chopper wheel """,
	}

def hasAssociatedNumber():
 	return False
 	
def newSwitchingMode(p):
     if type(p) is str:
         return fromString(p)
     return None
