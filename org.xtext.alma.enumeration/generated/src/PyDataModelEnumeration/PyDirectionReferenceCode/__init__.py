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


from DirectionReferenceCodeMod import *
from ACSErrTypeCommon import BadParameterEx

def fromString(stringVersionOfEnumeration):
	try:
		return {
			'J2000': J2000,
			'JMEAN': JMEAN,
			'JTRUE': JTRUE,
			'APP': APP,
			'B1950': B1950,
			'B1950_VLA': B1950_VLA,
			'BMEAN': BMEAN,
			'BTRUE': BTRUE,
			'GALACTIC': GALACTIC,
			'HADEC': HADEC,
			'AZELSW': AZELSW,
			'AZELSWGEO': AZELSWGEO,
			'AZELNE': AZELNE,
			'AZELNEGEO': AZELNEGEO,
			'JNAT': JNAT,
			'ECLIPTIC': ECLIPTIC,
			'MECLIPTIC': MECLIPTIC,
			'TECLIPTIC': TECLIPTIC,
			'SUPERGAL': SUPERGAL,
			'ITRF': ITRF,
			'TOPO': TOPO,
			'ICRS': ICRS,
			'MERCURY': MERCURY,
			'VENUS': VENUS,
			'MARS': MARS,
			'JUPITER': JUPITER,
			'SATURN': SATURN,
			'URANUS': URANUS,
			'NEPTUNE': NEPTUNE,
			'PLUTO': PLUTO,
			'SUN': SUN,
			'MOON': MOON,
		}[stringVersionOfEnumeration]
	except KeyError:
		raise BadParameterEx('stringVersionOfEnumeration')
		
def DirectionReferenceCodeSet():
	return [
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
		'DirectionReferenceCode',
 	]
"""
Although this method could be simpler, the strings are listed explicity
to ensure consistency between this and other language mappings.
"""
def toString(valueVersionOfEnumeration):
	return {
		J2000: 'J2000',
		JMEAN: 'JMEAN',
		JTRUE: 'JTRUE',
		APP: 'APP',
		B1950: 'B1950',
		B1950_VLA: 'B1950_VLA',
		BMEAN: 'BMEAN',
		BTRUE: 'BTRUE',
		GALACTIC: 'GALACTIC',
		HADEC: 'HADEC',
		AZELSW: 'AZELSW',
		AZELSWGEO: 'AZELSWGEO',
		AZELNE: 'AZELNE',
		AZELNEGEO: 'AZELNEGEO',
		JNAT: 'JNAT',
		ECLIPTIC: 'ECLIPTIC',
		MECLIPTIC: 'MECLIPTIC',
		TECLIPTIC: 'TECLIPTIC',
		SUPERGAL: 'SUPERGAL',
		ITRF: 'ITRF',
		TOPO: 'TOPO',
		ICRS: 'ICRS',
		MERCURY: 'MERCURY',
		VENUS: 'VENUS',
		MARS: 'MARS',
		JUPITER: 'JUPITER',
		SATURN: 'SATURN',
		URANUS: 'URANUS',
		NEPTUNE: 'NEPTUNE',
		PLUTO: 'PLUTO',
		SUN: 'SUN',
		MOON: 'MOON',
 	}[valueVersionOfEnumeration]

def hasHelp():
	return True
	
def help(valueVersionOfEnumeration):
	return {
		J2000: """!< mean equator and equinox at J2000.0 """,
		JMEAN: """!< mean equator and equinox at frame epoch. """,
		JTRUE: """!< true equator and equinox at frame epoch. """,
		APP: """!< apparent geocentric position. """,
		B1950: """!< mean epoch and ecliptic at B1950.0. """,
		B1950_VLA: """!<  """,
		BMEAN: """!< mean equator and equinox at frame epoch. """,
		BTRUE: """!< true equator and equinox at frame epoch. """,
		GALACTIC: """!< galactic coordinates. """,
		HADEC: """!< topocentric HA and declination. """,
		AZELSW: """!< topocentric Azimuth and Elevation (N through E). """,
		AZELSWGEO: """!<  """,
		AZELNE: """!< idem AZEL """,
		AZELNEGEO: """!<  """,
		JNAT: """!< geocentric natural frame. """,
		ECLIPTIC: """!< ecliptic for J2000.0 equator, equinox. """,
		MECLIPTIC: """!< ecliptic for mean equator of date. """,
		TECLIPTIC: """!< ecliptic for true equatorof date. """,
		SUPERGAL: """!< supergalactic coordinates. """,
		ITRF: """!< coordinates wrt ITRF earth frame. """,
		TOPO: """!< apparent topocentric position. """,
		ICRS: """!<  """,
		MERCURY: """!< from JPL DE table. """,
		VENUS: """!<  """,
		MARS: """!<  """,
		JUPITER: """!<  """,
		SATURN: """!<  """,
		URANUS: """!<  """,
		NEPTUNE: """!<  """,
		PLUTO: """!<  """,
		SUN: """!<  """,
		MOON: """!<  """,
	}

def hasAssociatedNumber():
 	return False
 	
def newDirectionReferenceCode(p):
     if type(p) is str:
         return fromString(p)
     return None
