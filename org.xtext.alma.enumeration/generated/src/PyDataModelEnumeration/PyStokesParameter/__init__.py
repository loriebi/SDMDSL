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


from StokesParameterMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'I': I,
			'Q': Q,
			'U': U,
			'V': V,
			'RR': RR,
			'RL': RL,
			'LR': LR,
			'LL': LL,
			'XX': XX,
			'XY': XY,
			'YX': YX,
			'YY': YY,
			'RX': RX,
			'RY': RY,
			'LX': LX,
			'LY': LY,
			'XR': XR,
			'XL': XL,
			'YR': YR,
			'YL': YL,
			'PP': PP,
			'PQ': PQ,
			'QP': QP,
			'QQ': QQ,
			'RCIRCULAR': RCIRCULAR,
			'LCIRCULAR': LCIRCULAR,
			'LINEAR': LINEAR,
			'PTOTAL': PTOTAL,
			'PLINEAR': PLINEAR,
			'PFTOTAL': PFTOTAL,
			'PFLINEAR': PFLINEAR,
			'PANGLE': PANGLE,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def StokesParameterSet():
	return [
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
		'StokesParameter',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		I: 'I',
		Q: 'Q',
		U: 'U',
		V: 'V',
		RR: 'RR',
		RL: 'RL',
		LR: 'LR',
		LL: 'LL',
		XX: 'XX',
		XY: 'XY',
		YX: 'YX',
		YY: 'YY',
		RX: 'RX',
		RY: 'RY',
		LX: 'LX',
		LY: 'LY',
		XR: 'XR',
		XL: 'XL',
		YR: 'YR',
		YL: 'YL',
		PP: 'PP',
		PQ: 'PQ',
		QP: 'QP',
		QQ: 'QQ',
		RCIRCULAR: 'RCIRCULAR',
		LCIRCULAR: 'LCIRCULAR',
		LINEAR: 'LINEAR',
		PTOTAL: 'PTOTAL',
		PLINEAR: 'PLINEAR',
		PFTOTAL: 'PFTOTAL',
		PFLINEAR: 'PFLINEAR',
		PANGLE: 'PANGLE',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		I: """!<  """,
		Q: """!<  """,
		U: """!<  """,
		V: """!<  """,
		RR: """!<  """,
		RL: """!<  """,
		LR: """!<  """,
		LL: """!<  """,
		XX: """!< Linear correlation product """,
		XY: """!<  """,
		YX: """!<  """,
		YY: """!<  """,
		RX: """!< Mixed correlation product """,
		RY: """!< Mixed correlation product """,
		LX: """!< Mixed LX product """,
		LY: """!< Mixed LY correlation product """,
		XR: """!< Mixed XR correlation product """,
		XL: """!< Mixed XL correlation product """,
		YR: """!< Mixed YR correlation product """,
		YL: """!< Mixel YL correlation product """,
		PP: """!<  """,
		PQ: """!<  """,
		QP: """!<  """,
		QQ: """!<  """,
		RCIRCULAR: """!<  """,
		LCIRCULAR: """!<  """,
		LINEAR: """!< single dish polarization type """,
		PTOTAL: """!< Polarized intensity ((Q^2+U^2+V^2)^(1/2)) """,
		PLINEAR: """!< Linearly Polarized intensity ((Q^2+U^2)^(1/2)) """,
		PFTOTAL: """!< Polarization Fraction (Ptotal/I) """,
		PFLINEAR: """!< Linear Polarization Fraction (Plinear/I) """,
		PANGLE: """!< Linear Polarization Angle (0.5 arctan(U/Q)) (in radians) """,
	}

def hasAssociatedNumber():
 	return False
 	
def newStokesParameter(p):
     if type(p) is str:
         return fromString(p)
     return None
