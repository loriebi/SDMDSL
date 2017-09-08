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


from DataContentMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'CROSS_DATA': CROSS_DATA,
			'AUTO_DATA': AUTO_DATA,
			'ZERO_LAGS': ZERO_LAGS,
			'ACTUAL_TIMES': ACTUAL_TIMES,
			'ACTUAL_DURATIONS': ACTUAL_DURATIONS,
			'WEIGHTS': WEIGHTS,
			'FLAGS': FLAGS,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def DataContentSet():
	return [
		'DataContent',
		'DataContent',
		'DataContent',
		'DataContent',
		'DataContent',
		'DataContent',
		'DataContent',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		CROSS_DATA: 'CROSS_DATA',
		AUTO_DATA: 'AUTO_DATA',
		ZERO_LAGS: 'ZERO_LAGS',
		ACTUAL_TIMES: 'ACTUAL_TIMES',
		ACTUAL_DURATIONS: 'ACTUAL_DURATIONS',
		WEIGHTS: 'WEIGHTS',
		FLAGS: 'FLAGS',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		CROSS_DATA: """!< Cross-correlation data """,
		AUTO_DATA: """!< Auto-correlation data """,
		ZERO_LAGS: """!< Zero-lag data """,
		ACTUAL_TIMES: """!< :Actual times (mid points of integrations) """,
		ACTUAL_DURATIONS: """!< Actual duration of integrations """,
		WEIGHTS: """!< Weights """,
		FLAGS: """!< Baseband based flags """,
	}

def hasAssociatedNumber():
 	return False
 	
def newDataContent(p):
     if type(p) is str:
         return fromString(p)
     return None
