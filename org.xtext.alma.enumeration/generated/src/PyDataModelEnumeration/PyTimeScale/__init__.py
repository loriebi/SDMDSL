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


from TimeScaleMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'UTC': UTC,
			'TAI': TAI,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def TimeScaleSet():
	return [
		'TimeScale',
		'TimeScale',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		UTC: 'UTC',
		TAI: 'TAI',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		UTC: """!< Coordinated Universal Time. """,
		TAI: """!< International Atomic Time. """,
	}

def hasAssociatedNumber():
 	return False
 	
def newTimeScale(p):
     if type(p) is str:
         return fromString(p)
     return None
