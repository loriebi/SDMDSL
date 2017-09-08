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


from AntennaMotionPatternMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'NONE': NONE,
			'CROSS_SCAN': CROSS_SCAN,
			'SPIRAL': SPIRAL,
			'CIRCLE': CIRCLE,
			'THREE_POINTS': THREE_POINTS,
			'FOUR_POINTS': FOUR_POINTS,
			'FIVE_POINTS': FIVE_POINTS,
			'TEST': TEST,
			'UNSPECIFIED': UNSPECIFIED,
			'STAR': STAR,
			'LISSAJOUS': LISSAJOUS,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def AntennaMotionPatternSet():
	return [
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
		'AntennaMotionPattern',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		NONE: 'NONE',
		CROSS_SCAN: 'CROSS_SCAN',
		SPIRAL: 'SPIRAL',
		CIRCLE: 'CIRCLE',
		THREE_POINTS: 'THREE_POINTS',
		FOUR_POINTS: 'FOUR_POINTS',
		FIVE_POINTS: 'FIVE_POINTS',
		TEST: 'TEST',
		UNSPECIFIED: 'UNSPECIFIED',
		STAR: 'STAR',
		LISSAJOUS: 'LISSAJOUS',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		NONE: """!< No pattern. """,
		CROSS_SCAN: """!< Crossed scan (continuous pattern) """,
		SPIRAL: """!< Spiral pattern """,
		CIRCLE: """!< Circular pattern """,
		THREE_POINTS: """!< Three points pattern. """,
		FOUR_POINTS: """!< Four points pattern. """,
		FIVE_POINTS: """!< Five points pattern. """,
		TEST: """!< Reserved for development. """,
		UNSPECIFIED: """!< Unspecified pattern. """,
		STAR: """!<  """,
		LISSAJOUS: """!<  """,
	}

def hasAssociatedNumber():
 	return False
 	
def newAntennaMotionPattern(p):
     if type(p) is str:
         return fromString(p)
     return None
