package org.xtext.alma.sdmdsl.generator.cpp

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class FWrapperImpl {

	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		// creating and generating FWrapperImpl (src/sdm_modules.f90  src/sdm_library.f90) 
		var sdmFsa = (fsa as SDMFileSystemAccess)

		sdmFsa.setFile("src/sdm_modules.f90")
		sdmFsa.generateFile(generateModuls)

		sdmFsa.setFile("src/sdm_library.f90")
		sdmFsa.generateFile(generateLibrary)
	}

	def generateModuls() '''
		//!
		//! ALMA - Atacama Large Millimeter Array
		//! (c) European Southern Observatory, 2002
		//! (c) Associated Universities Inc., 2002
		//! Copyright by ESO (in the framework of the ALMA collaboration),
		//! Copyright by AUI (in the framework of the ALMA collaboration),
		//! All rights reserved.
		//! 
		//! This library is free software; you can redistribute it and/or
		//! modify it under the terms of the GNU Lesser General Public
		//! License as published by the Free software Foundation; either
		//! version 2.1 of the License, or (at your option) any later version.
		//! 
		//! This library is distributed in the hope that it will be useful,
		//! but WITHOUT ANY WARRANTY, without even the implied warranty of
		//! MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
		//! Lesser General Public License for more details.
		//! 
		//! You should have received a copy of the GNU Lesser General Public
		//! License along with this library; if not, write to the Free Software
		//! Foundation, Inc., 59 Temple Place, Suite 330, Boston,
		//! MA 02111-1307  USA
		//!
		//! File sdm_modules.f90
		//!
		//!----------------------------------------------------------------------------
		//! General types:
		//!
		//module sdm_Types
		////type ArrayTimeInterval
		//////sequence
		//////integer*8 time
		//////integer*8 interval
		////end type ArrayTimeInterval
		//end module sdm_Types
		
		«new FTableWrapperImpl().appendModules»
		
	'''

	def generateLibrary() '''
		//!
		//! ALMA - Atacama Large Millimeter Array
		//! (c) European Southern Observatory, 2002
		//! (c) Associated Universities Inc., 2002
		//! Copyright by ESO (in the framework of the ALMA collaboration),
		//! Copyright by AUI (in the framework of the ALMA collaboration),
		//! All rights reserved.
		//! 
		//! This library is free software; you can redistribute it and/or
		//! modify it under the terms of the GNU Lesser General Public
		//! License as published by the Free software Foundation; either
		//! version 2.1 of the License, or (at your option) any later version.
		//! 
		//! This library is distributed in the hope that it will be useful,
		//! but WITHOUT ANY WARRANTY, without even the implied warranty of
		//! MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
		//! Lesser General Public License for more details.
		//! 
		//! You should have received a copy of the GNU Lesser General Public
		//! License along with this library; if not, write to the Free Software
		//! Foundation, Inc., 59 Temple Place, Suite 330, Boston,
		//! MA 02111-1307  USA
		//!
		//! File sdm_library.f90
		//!
		//!----------------------------------------------------------------------------
		//subroutine charcut(string)
		//! find unused end part of string and replace with nulls.
		//!
		////character *(*) string
		////integer i, j, k, l
		////k = 1
		////l = len(string)
		////do i=1, l
		//////j = ichar(string(i:i))
		//////if (j.ge.ichar('!').and.j.le.ichar('~')) k=i+1
		////enddo
		////k = min(k,l)
		////string(k:l) = char(0)
		//end subroutine charcut
		
		«new FTableWrapperImpl().appendLibrary»
		
	'''

}
