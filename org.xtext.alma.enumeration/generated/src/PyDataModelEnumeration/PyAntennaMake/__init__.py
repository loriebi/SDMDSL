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


from AntennaMakeMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'AEM_12': AEM_12,
			'MITSUBISHI_7': MITSUBISHI_7,
			'MITSUBISHI_12_A': MITSUBISHI_12_A,
			'MITSUBISHI_12_B': MITSUBISHI_12_B,
			'VERTEX_12_ATF': VERTEX_12_ATF,
			'AEM_12_ATF': AEM_12_ATF,
			'VERTEX_12': VERTEX_12,
			'IRAM_15': IRAM_15,
			'UNDEFINED': UNDEFINED,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def AntennaMakeSet():
	return [
		'AntennaMake',
		'AntennaMake',
		'AntennaMake',
		'AntennaMake',
		'AntennaMake',
		'AntennaMake',
		'AntennaMake',
		'AntennaMake',
		'AntennaMake',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		AEM_12: 'AEM_12',
		MITSUBISHI_7: 'MITSUBISHI_7',
		MITSUBISHI_12_A: 'MITSUBISHI_12_A',
		MITSUBISHI_12_B: 'MITSUBISHI_12_B',
		VERTEX_12_ATF: 'VERTEX_12_ATF',
		AEM_12_ATF: 'AEM_12_ATF',
		VERTEX_12: 'VERTEX_12',
		IRAM_15: 'IRAM_15',
		UNDEFINED: 'UNDEFINED',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		AEM_12: """!< 12m AEM antenna """,
		MITSUBISHI_7: """!< 7-m Mitsubishi antenna (ACA) """,
		MITSUBISHI_12_A: """!< 12-m Mitsubishi antenna (ACA) (refurbished prototype) """,
		MITSUBISHI_12_B: """!< 12-m Mitsubishi antenna (ACA) (production) """,
		VERTEX_12_ATF: """!< 12-m Vertex antenna prototype """,
		AEM_12_ATF: """!< 12-m AEM  antenna prototype """,
		VERTEX_12: """!< 12-m Vertex antenna """,
		IRAM_15: """!< 15-m IRAM antenna """,
		UNDEFINED: """!< Not defined or not applicable. """,
	}

def hasAssociatedNumber():
 	return False
 	
def newAntennaMake(p):
     if type(p) is str:
         return fromString(p)
     return None
