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


from ReceiverBandMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'ALMA_RB_01': ALMA_RB_01,
			'ALMA_RB_02': ALMA_RB_02,
			'ALMA_RB_03': ALMA_RB_03,
			'ALMA_RB_04': ALMA_RB_04,
			'ALMA_RB_05': ALMA_RB_05,
			'ALMA_RB_06': ALMA_RB_06,
			'ALMA_RB_07': ALMA_RB_07,
			'ALMA_RB_08': ALMA_RB_08,
			'ALMA_RB_09': ALMA_RB_09,
			'ALMA_RB_10': ALMA_RB_10,
			'ALMA_RB_ALL': ALMA_RB_ALL,
			'ALMA_HOLOGRAPHY_RECEIVER': ALMA_HOLOGRAPHY_RECEIVER,
			'BURE_01': BURE_01,
			'BURE_02': BURE_02,
			'BURE_03': BURE_03,
			'BURE_04': BURE_04,
			'EVLA_4': EVLA_4,
			'EVLA_P': EVLA_P,
			'EVLA_L': EVLA_L,
			'EVLA_C': EVLA_C,
			'EVLA_S': EVLA_S,
			'EVLA_X': EVLA_X,
			'EVLA_Ku': EVLA_Ku,
			'EVLA_K': EVLA_K,
			'EVLA_Ka': EVLA_Ka,
			'EVLA_Q': EVLA_Q,
			'UNSPECIFIED': UNSPECIFIED,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def ReceiverBandSet():
	return [
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
		'ReceiverBand',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		ALMA_RB_01: 'ALMA_RB_01',
		ALMA_RB_02: 'ALMA_RB_02',
		ALMA_RB_03: 'ALMA_RB_03',
		ALMA_RB_04: 'ALMA_RB_04',
		ALMA_RB_05: 'ALMA_RB_05',
		ALMA_RB_06: 'ALMA_RB_06',
		ALMA_RB_07: 'ALMA_RB_07',
		ALMA_RB_08: 'ALMA_RB_08',
		ALMA_RB_09: 'ALMA_RB_09',
		ALMA_RB_10: 'ALMA_RB_10',
		ALMA_RB_ALL: 'ALMA_RB_ALL',
		ALMA_HOLOGRAPHY_RECEIVER: 'ALMA_HOLOGRAPHY_RECEIVER',
		BURE_01: 'BURE_01',
		BURE_02: 'BURE_02',
		BURE_03: 'BURE_03',
		BURE_04: 'BURE_04',
		EVLA_4: 'EVLA_4',
		EVLA_P: 'EVLA_P',
		EVLA_L: 'EVLA_L',
		EVLA_C: 'EVLA_C',
		EVLA_S: 'EVLA_S',
		EVLA_X: 'EVLA_X',
		EVLA_Ku: 'EVLA_Ku',
		EVLA_K: 'EVLA_K',
		EVLA_Ka: 'EVLA_Ka',
		EVLA_Q: 'EVLA_Q',
		UNSPECIFIED: 'UNSPECIFIED',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		ALMA_RB_01: """!< ALMA Receiver band 01 """,
		ALMA_RB_02: """!< ALMA Receiver band 02 """,
		ALMA_RB_03: """!< ALMA Receiver band 03 """,
		ALMA_RB_04: """!< ALMA Receiver band 04 """,
		ALMA_RB_05: """!< ALMA Receiver band 05 """,
		ALMA_RB_06: """!< ALMA Receiver band 06 """,
		ALMA_RB_07: """!< ALMA Receiver band 07 """,
		ALMA_RB_08: """!< ALMA Receiver band 08 """,
		ALMA_RB_09: """!< ALMA Receiver band 09 """,
		ALMA_RB_10: """!< ALMA Receiver band 10 """,
		ALMA_RB_ALL: """!< all ALMA receiver bands. """,
		ALMA_HOLOGRAPHY_RECEIVER: """!< Alma transmitter Holography receiver. """,
		BURE_01: """!< Plateau de Bure receiver band #1. """,
		BURE_02: """!< Plateau de Bure receiver band #2. """,
		BURE_03: """!< Plateau de Bure receiver band #3. """,
		BURE_04: """!< Plateau de Bure receiver band #4 """,
		EVLA_4: """!<  """,
		EVLA_P: """!<  """,
		EVLA_L: """!<  """,
		EVLA_C: """!<  """,
		EVLA_S: """!<  """,
		EVLA_X: """!<  """,
		EVLA_Ku: """!<  """,
		EVLA_K: """!<  """,
		EVLA_Ka: """!<  """,
		EVLA_Q: """!<  """,
		UNSPECIFIED: """!< receiver band of unspecified origin. """,
	}

def hasAssociatedNumber():
 	return False
 	
def newReceiverBand(p):
     if type(p) is str:
         return fromString(p)
     return None
