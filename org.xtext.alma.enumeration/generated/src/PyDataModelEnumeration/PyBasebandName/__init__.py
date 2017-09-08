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


from BasebandNameMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'NOBB': NOBB,
			'BB_1': BB_1,
			'BB_2': BB_2,
			'BB_3': BB_3,
			'BB_4': BB_4,
			'BB_5': BB_5,
			'BB_6': BB_6,
			'BB_7': BB_7,
			'BB_8': BB_8,
			'BB_ALL': BB_ALL,
			'A1C1_3BIT': A1C1_3BIT,
			'A2C2_3BIT': A2C2_3BIT,
			'AC_8BIT': AC_8BIT,
			'B1D1_3BIT': B1D1_3BIT,
			'B2D2_3BIT': B2D2_3BIT,
			'BD_8BIT': BD_8BIT,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def BasebandNameSet():
	return [
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
		'BasebandName',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		NOBB: 'NOBB',
		BB_1: 'BB_1',
		BB_2: 'BB_2',
		BB_3: 'BB_3',
		BB_4: 'BB_4',
		BB_5: 'BB_5',
		BB_6: 'BB_6',
		BB_7: 'BB_7',
		BB_8: 'BB_8',
		BB_ALL: 'BB_ALL',
		A1C1_3BIT: 'A1C1_3BIT',
		A2C2_3BIT: 'A2C2_3BIT',
		AC_8BIT: 'AC_8BIT',
		B1D1_3BIT: 'B1D1_3BIT',
		B2D2_3BIT: 'B2D2_3BIT',
		BD_8BIT: 'BD_8BIT',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		NOBB: """!< Baseband not applicable. """,
		BB_1: """!< Baseband one """,
		BB_2: """!< Baseband two """,
		BB_3: """!< Baseband three """,
		BB_4: """!< Baseband four """,
		BB_5: """!< Baseband five (not ALMA) """,
		BB_6: """!< Baseband six (not ALMA) """,
		BB_7: """!< Baseband seven (not ALMA) """,
		BB_8: """!< Baseband eight (not ALMA) """,
		BB_ALL: """!< All ALMA basebands (i.e. all available basebands) """,
		A1C1_3BIT: """!<  """,
		A2C2_3BIT: """!<  """,
		AC_8BIT: """!<  """,
		B1D1_3BIT: """!<  """,
		B2D2_3BIT: """!<  """,
		BD_8BIT: """!<  """,
	}

def hasAssociatedNumber():
 	return False
 	
def newBasebandName(p):
     if type(p) is str:
         return fromString(p)
     return None
