package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer

class FTableWrapperImpl {

	var container = AlmaTableContainer.instance

	/*
	 * FTableWrapperImpl generator (append to src/sdm_modules.90 file)
	 */
	def appendModules() '''
		«FOR table : container.tables»
			«table.generateModules»
		«ENDFOR»
	'''

	/*
	 * FTableWrapperImpl generator (append to src/sdm_library.90 file)
	 */
	def appendLibrary() '''
		«FOR table : container.tables»
			«table.generateLibrary»
		«ENDFOR»
	'''

	private def generateModules(AlmaTable table) '''
		«IF table.name !="Beam" && table.name !="Observation" && table.name !="Ephemeris" »
			//! 
			//! ===========================================================================
			//! 
			//! «table.name» Table: 
			//! 
			//module sdm_«table.name»
			////use sdm_Types
			////type «table.name»Row
			«IF table.name !="AlmaRadiometer" && table.name !="Weather" »     
				«FOR attr : table.requiredAttributes»
					«IF !attr.isKey»
						//////«attr.FFullType»
					«ENDIF»
				«ENDFOR»
			«ELSE»
				//////integer:: dummy ! make sure it compiles...
			«ENDIF»
			////end type «table.name»Row
			////type «table.name»Key
			«FOR attr : table.requiredAttributes»
				«IF attr.isKey»
					//////«attr.FFullType»
				«ENDIF»
			«ENDFOR»
			////end type «table.name»Key
			«IF table.optionalValueAttributes.size != 0»
				////type «table.name»Opt
				«FOR attr : table.optionalValueAttributes»
					//////«attr.FFullType»
				«ENDFOR»
				////end type «table.name»Opt
			«ENDIF»
			////type «table.name»
			«FOR attr : table.requiredAttributes»
				«IF attr.isArray»
					«IF attr.isOneD || attr.isExtrinsic»
						//////«attr.FType», allocatable :: «attr.name»(:,:)
					«ELSEIF attr.isTwoD»
						//////«attr.FType», allocatable :: «attr.name»(:,:,:)
					«ELSEIF attr.isThreeD»
						//////«attr.FType», allocatable :: «attr.name»(:,:,:,:)
					«ELSEIF attr.isFourD»
						//////«attr.FType», allocatable :: «attr.name»(:,:,:,:,:)
					«ENDIF»
				«ELSE»
					//////«attr.FType», allocatable :: «attr.name»(:)
				«ENDIF»
			«ENDFOR»
			////end type «table.name»
			//end module sdm_«table.name»
		«ENDIF»
	'''
	
	
	private def generateLibrary(AlmaTable table)'''
		«IF table.name !="Beam" && table.name !="Observation" && table.name !="Ephemeris" »
			//! 
			//! ===========================================================================
			//! 
			//! «table.name» Table: 
			//! 
			//! ===========================================================================
			//! 
			«IF table.name =="DataDescription" »
				//subroutine add«table.name»Row(key, row, holoType, error)
			«ELSE»
				//subroutine add«table.name»Row(key, row, error)
			«ENDIF»
			////!
			////use sdm_«table.name»
			////!
			////type(«table.name»Row) :: row
			////type(«table.name»Key) :: key
			////logical error
			«IF table.name =="DataDescription" »
				////logical holoType
			«ENDIF»
			////!
			////integer :: ireturn, sdm_add«table.name»Row, i, j
			«FOR attr : table.requiredAttributes»
				«IF attr.isArray»
					«IF attr.isOneD || attr.isExtrinsic»
						////integer, parameter :: «attr.name»Rank = 1 
					«ELSEIF attr.isTwoD»
						////integer, parameter :: «attr.name»Rank = 2 
					«ELSEIF attr.isThreeD»
						////integer, parameter :: «attr.name»Rank = 3 
					«ELSEIF attr.isFourD»
						////integer, parameter :: «attr.name»Rank = 4 
					«ENDIF»
					«IF attr.isStringType»
						////integer :: «attr.name»Dim(2,«attr.name»Rank+1)
					«ELSE»
						////integer :: «attr.name»Dim(2,«attr.name»Rank)
					«ENDIF»
				«ELSEIF attr.FType=="character*256"»
					////integer :: «attr.name»Dim(2)
				«ENDIF»
			«ENDFOR» 
			////! ----------------
			////! Deal with dimensions
			«FOR attr : table.requiredAttributes»
				«IF attr.isArray»
					////if (.not.allocated(«attr.FFullName»)) then
					//////call sdmMessage(8,3,'«table.name»Table','«attr.FFullName» not allocated.')
					//////error = .true.
					//////return
					////endif
					«IF attr.isStringType»
						////«attr.name»Dim(:,1) = len(«attr.FFullName»)
						////do i=1, «attr.name»Rank
						//////«attr.name»Dim(:,i+1) = size(«attr.FFullName»,i)
						////enddo
						«IF attr.isOneD || attr.isExtrinsic»
							////do i=1, «attr.name»Dim(1,2) 
							//////call charcut(«attr.FFullName»(i))
							////enddo
						«ELSEIF attr.isTwoD»
							////do i=1, «attr.name»Dim(1,3) 
							//////do j=1, «attr.name»Dim(1,2) 
							////////call charcut(«attr.FFullName»(j,i))
							//////enddo
							////enddo
						«ENDIF»
					«ELSE»
						////do i=1, «attr.name»Rank
						//////«attr.name»Dim(:,i) = size(«attr.FFullName»,i)
						////enddo
					«ENDIF»
				«ELSEIF attr.FType=="character*256"»
					////«attr.name»Dim = len(«attr.FFullName»)
					////call charcut(«attr.FFullName»)
				«ENDIF»
			«ENDFOR»
			////!
			«IF table.name =="DataDescription" »
				////ireturn = sdm_add«table.name»Row(«table.RequiredAddFList», holoType)
			«ELSE»
				////ireturn = sdm_add«table.name»Row(«table.RequiredAddFList»)
			«ENDIF»
			////if (ireturn.lt.0) then
			//////call sdmMessageI(8,3,'«table.name»Table','Error in sdm_add«table.name»Row', ireturn)
			//////error = .true.
			«IF  table.autoIncrementable.size != 0»
				////else
				«FOR attr : table.autoIncrementable»
					//////key%«attr.name» = ireturn
				«ENDFOR»
			«ENDIF»
			////endif
			//end subroutine add«table.name»Row
			//!
			//! ---------------------------------------------------------------------------
			//!
			//subroutine get«table.name»Row(key, row, error)
			////!
			////use sdm_«table.name»
			////!
			////type(«table.name»Row) :: row
			////type(«table.name»Key) :: key
			////logical error
			////!
			////integer :: ireturn, sdm_get«table.name»Row, i
			«FOR attr : table.requiredAttributes»
				«IF attr.isArray»
					«IF attr.isOneD || attr.isExtrinsic»
						////integer, parameter :: «attr.name»Rank = 1 
					«ELSEIF attr.isTwoD»
						////integer, parameter :: «attr.name»Rank = 2 
					«ELSEIF attr.isThreeD»
						////integer, parameter :: «attr.name»Rank = 3 
					«ELSEIF attr.isFourD»
						////integer, parameter :: «attr.name»Rank = 4
					«ENDIF»
					«IF attr.isStringType»
						////integer :: «attr.name»Dim(2,«attr.name»Rank+1)
					«ELSE»
						////integer :: «attr.name»Dim(2,«attr.name»Rank)
					«ENDIF»
				«ELSEIF attr.FType=="character*256"»
					////integer :: «attr.name»Dim(2)
				«ENDIF»
			«ENDFOR»
			////! Deal with dimensions
			«FOR attr : table.requiredAttributes»
				«IF attr.isArray»
					////if (.not.allocated(«attr.FFullName»)) then
					//////call sdmMessage(8,3,'«table.name»Table','«attr.FFullName» not allocated.')
					//////error = .true.
					//////return
					////endif
					«IF attr.isStringType»
						////«attr.name»Dim(:,1) = len(«attr.FFullName»)
						////do i=1, «attr.name»Rank
						//////«attr.name»Dim(:,i+1) = size(«attr.FFullName»,i)
						////enddo
					«ELSE»
						////do i=1, «attr.name»Rank
						//////«attr.name»Dim(:,i) = size(«attr.FFullName»,i)
						////enddo
					«ENDIF»
				«ELSEIF attr.FType=="character*256"»
					////«attr.name»Dim = len(«attr.FFullName»)
					////call charcut(«attr.FFullName»)
				«ENDIF»
			«ENDFOR»
			////!
			////ireturn = sdm_get«table.name»Row(«table.RequiredGetFList»)
			«FOR attr : table.requiredAttributes»
				«IF attr.isArray»
					«IF attr.isOneD»
						«IF attr.isStringType»
							////do i=1,«attr.name»Dim(1,2) 
							«IF attr.isKey»
								//////key%«attr.name»(i)(«attr.name»Dim(1,1)+1:) = ''
							«ELSE»
								//////row%«attr.name»(i)(«attr.name»Dim(1,1)+1:) = ''
							«ENDIF»
							////enddo
						«ENDIF»
					«ENDIF»
				«ELSEIF attr.FType=="character*256"»
					«IF attr.isKey»
						////key%«attr.name»(«attr.name»Dim(1)+1:) = ''
					«ELSE»
						////row%«attr.name»(«attr.name»Dim(1)+1:) = ''
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			////if (ireturn.lt.0) then
			//////call sdmMessageI(8,3,'«table.name»Table','Error in sdm_get«table.name»Row', ireturn)
			//////error = .true.
			////endif
			//end subroutine get«table.name»Row
			//!
			//! ---------------------------------------------------------------------------
			//!
			//subroutine get«table.name»TableSize(tableSize, error)
			//!
			//! return the size of the table
			//!
			////integer :: tableSize, sdm_get«table.name»TableSize, ireturn
			////logical :: error
			////!
			////ireturn = sdm_get«table.name»TableSize()
			////tableSize = ireturn
			////if (ireturn.lt.0) error = .true.
			//end subroutine get«table.name»TableSize
			//!
			//! ---------------------------------------------------------------------------
			//!
			//subroutine get«table.name»Keys(tableSize, keyList, error)
			//!
			//! return the list of keys
			//!
			////use sdm_«table.name»
			////!
			////integer :: tableSize
			////logical :: error
			////type(«table.name»Key) :: keyList(tableSize)
			////integer :: ireturn, sdm_get«table.name»Keys, i
			«FOR attr : table.requiredAttributes»
				«IF attr.isKey»
					«IF !attr.isArray»
						////«attr.FType», allocatable :: «attr.name»List(:) 
					«ENDIF»
					«IF attr.isStringType»
						////integer :: «attr.name»ListDim(2,2)
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			////!
			«FOR attr : table.requiredAttributes»
				«IF attr.isKey»
					«IF !attr.isArray»
						////allocate(«attr.name»List(tableSize))  
					«ENDIF»
					«IF attr.FType=="character*256"»
						////«attr.name»ListDim = len(keyList%«attr.name»)
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			////!
			////ireturn = sdm_get«table.name»Keys(«table.KeyFTypeList»)
			////if (ireturn.lt.0) then
			//////call sdmMessageI(8,3,'«table.name»Table','Error in sdm_get«table.name»Keys', ireturn)
			//////error = .true.
			//////return
			////endif
			////do i=1, tableSize
			«FOR attr : table.requiredAttributes»
				«IF attr.isKey»
					«IF !attr.isArray»
						«IF attr.isStringType»
							//////keyList(i)%«attr.name» = «attr.name»List(i)(1:«attr.name»ListDim(1,1))
						«ELSE»
							//////keyList(i)%«attr.name» = «attr.name»List(i)
						«ENDIF»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			////enddo
			//end subroutine get«table.name»Keys
			«IF table.name !="TotalPower" && table.name !="Annotation" »
				«IF table.hasRequiredArrays»
					//! ---------------------------------------------------------------------------
					//!
					//subroutine alloc«table.name»Row(row, error)
					////use sdm_«table.name»
					////type(«table.name»Row) :: row
					////logical :: error
					////integer :: ier
					////character, parameter :: sdmTable*32= '«table.name»'
					«FOR attr : table.requiredAttributes»«IF attr.isArray»
						////! row%«attr.name» allocation
						////if (allocated(row%«attr.name»)) then
						//////deallocate(row%«attr.name», stat=ier)
						//////if (ier.ne.0) goto 98
						////endif
					«ENDIF»«ENDFOR»
					////allocate(«table.RowAllocateFList», stat=ier)
					////if (ier.ne.0) then
					//////call sdmmessageI(8,4,sdmTable ,'Allocation error ier ',ier)
					//////error = .true.
					////endif
					////return
					////!
					//98 call sdmmessageI(8,4,sdmTable ,'Deallocation error ier ',ier)
					////error = .true.
					////return
					//endsubroutine alloc«table.name»Row 
					//! 
				«ENDIF»
				«IF table.hasOptionalArrays»
					//! ---------------------------------------------------------------------------
					//!
					//subroutine alloc«table.name»Opt(row, opt, error)
					////use sdm_«table.name»
					////type(«table.name»Row) :: row
					////type(«table.name»Opt) :: opt
					////logical :: error
					////integer :: ier
					////character, parameter :: sdmTable*32 = '«table.name»'
					«FOR attr : table.optionalValueAttributes»«IF attr.isArray»
						////! opt%«attr.name» allocation
						////if (allocated(opt%«attr.name»)) then
						//////deallocate(opt%«attr.name», stat=ier)
						//////if (ier.ne.0) goto 98
						////endif
					«ENDIF»«ENDFOR»
					////allocate(«table.OptAllocateFList», stat=ier)
					////if (ier.ne.0) then
					//////call sdmmessageI(8,4,sdmTable ,'Allocation error ier ',ier)
					//////error = .true.
					////endif
					////return
					////!
					//98 call sdmmessageI(8,4,sdmTable ,'Opt. Deallocation error ier ',ier)
					////error = .true.
					////return
					//endsubroutine alloc«table.name»Opt
				«ENDIF»
			«ENDIF»
			//! ---------------------------------------------------------------------------
			«/* Methods for optional parameters */»
			«IF table.optionalValueAttributes.size != 0»
				«FOR attr : table.optionalValueAttributes»
					//!
					//! ---------------------------------------------------------------------------
					//!
					//subroutine add«table.name»«attr.UpperCaseName»(key, opt, error)
					////!
					////use sdm_«table.name»
					////!
					////type(«table.name»Key) :: key
					////type(«table.name»Opt) :: opt
					////logical :: error
					////!
					////integer :: ireturn, sdm_add«table.name»«attr.UpperCaseName», i
					«FOR attr2 : table.requiredAttributes»
						«IF attr2.isKey»
							«IF attr2.isStringType»
								////integer :: «attr.name»Dim(2)
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					////!! «attr.FFullType»
					«IF attr.isArray»
						«IF attr.isOneD || attr.isExtrinsic»
							////integer, parameter :: «attr.name»Rank = 1 
						«ELSEIF attr.isTwoD»
							////integer, parameter :: «attr.name»Rank = 2 
						«ELSEIF attr.isThreeD»
							////integer, parameter :: «attr.name»Rank = 3 
						«ELSEIF attr.isFourD»
							////integer, parameter :: «attr.name»Rank = 4 
						«ENDIF»
						«IF attr.isStringType»
							////integer :: «attr.name»Dim(2,«attr.name»Rank+1)
						«ELSE»
							////integer :: «attr.name»Dim(2,«attr.name»Rank)
						«ENDIF»
					«ELSEIF attr.FType=="character*256"»
						////integer :: «attr.name»Dim(2)
					«ENDIF»
					////! Deal with dimensions
					«IF attr.isArray»
						////if (.not.allocated(opt%«attr.name»)) then
						//////call sdmMessage(8,3,'«table.name»Table','opt%«attr.name» not allocated.')
						//////error = .true.
						//////return
						////endif
						«IF attr.isStringType»
							////«attr.name»Dim(:,1) = len(opt%«attr.name»)
							////do i=1, «attr.name»Rank
							//////«attr.name»Dim(:,i+1) = size(opt%«attr.name»,i)
							//////call charcut(opt%«attr.name»(i))
							////enddo
						«ELSE»
							////do i=1, «attr.name»Rank
							//////«attr.name»Dim(:,i) = size(opt%«attr.name»,i)
							////enddo
						«ENDIF»
					«ELSEIF attr.FType=="character*256"»
						////«attr.name»Dim = len(opt%«attr.name»)
						////call charcut(opt%«attr.name»)
					«ENDIF»
					////ireturn = sdm_add«table.name»«attr.UpperCaseName»(«table.KeyFType», opt%«attr.FTypeAttributeDimList»)
					////if (ireturn.lt.0) then
					//////call sdmMessageI(8,3,'«table.name»Table','Error in sdm_add«table.name»«attr.UpperCaseName»', ireturn)
					//////error = .true.
					////endif
					//end subroutine add«table.name»«attr.UpperCaseName»
					//!
					//! ---------------------------------------------------------------------------
					//!
					//subroutine get«table.name»«attr.UpperCaseName»(key, opt, present, error)
					////!
					////use sdm_«table.name»
					////!
					////type(«table.name»Key) :: key
					////type(«table.name»Opt) :: opt
					////logical :: error, present
					////!
					////integer :: ireturn, sdm_get«table.name»«attr.UpperCaseName», i
					«FOR attr2 : table.requiredAttributes»
						«IF attr2.isKey»
							«IF attr2.isStringType»
								////integer :: «attr.name»Dim(2)
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					«IF attr.isArray»
						«IF attr.isOneD || attr.isExtrinsic»
							////integer, parameter :: «attr.name»Rank = 1 
						«ELSEIF attr.isTwoD»
							////integer, parameter :: «attr.name»Rank = 2 
						«ELSEIF attr.isThreeD»
							////integer, parameter :: «attr.name»Rank = 3 
						«ELSEIF attr.isFourD»
							////integer, parameter :: «attr.name»Rank = 4 
						«ENDIF»
						«IF attr.isStringType»
							////integer :: «attr.name»Dim(2,«attr.name»Rank+1)
						«ELSE»
							////integer :: «attr.name»Dim(2,«attr.name»Rank)
						«ENDIF»
					«ELSEIF attr.FType=="character*256"»
						////integer :: «attr.name»Dim(2)
					«ENDIF»
					////! Deal with dimensions
					«IF attr.isArray»
						////if (.not.allocated(opt%«attr.name»)) then
						//////call sdmMessage(8,3,'«table.name»Table','opt%«attr.name» not allocated.')
						//////error = .true.
						//////return
						////endif
						«IF attr.isStringType»
							////«attr.name»Dim(:,1) = len(opt%«attr.name»)
							////do i=1, «attr.name»Rank
							//////«attr.name»Dim(:,i+1) = size(opt%«attr.name»,i)
							////enddo
						«ELSE»
							////do i=1, «attr.name»Rank
							//////«attr.name»Dim(:,i) = size(opt%«attr.name»,i)
							////enddo
						«ENDIF»
					«ELSEIF attr.FType=="character*256"»
						////«attr.name»Dim = len(opt%«attr.name»)
					«ENDIF»
					////ireturn = sdm_get«table.name»«attr.UpperCaseName»(«table.KeyFType», opt%«attr.FTypeAttributeDimList»)
					////if (ireturn.lt.0) then
					//////call sdmMessageI(8,3,'«table.name»Table','Error in sdm_get«table.name»«attr.UpperCaseName»', ireturn)
					//////error = .true.
					////else
					//////present = ireturn.eq.0
					////endif
					//end subroutine get«table.name»«attr.UpperCaseName»
					//!
				«ENDFOR»
			«ENDIF»
			
			
			«IF table.name =="TotalPower"|| table.name =="Pointing"»
				//! ---------------------------------------------------------------------------
				//! Columns methods for Table «table.name»
				«FOR attr : table.requiredAttributes»
					//!
					//! ---------------------------------------------------------------------------
					//!
					//subroutine get«table.name»«attr.UpperCaseName»Column(table, error)
					////!
					////use sdm_«table.name»
					////!
					////type(«table.name») :: table
					////logical :: error
					////!
					////integer :: ireturn, sdm_get«table.name»«attr.UpperCaseName»Column, tableSize, i, j, ier
					«IF attr.isArray»
						////integer, allocatable :: «attr.name»Dim(:,:,:)
						«IF attr.isOneD || attr.isExtrinsic»
							////integer, parameter :: «attr.name»Rank = 1 
						«ELSEIF attr.isTwoD»
							////integer, parameter :: «attr.name»Rank = 2 
						«ELSEIF attr.isThreeD»
							////integer, parameter :: «attr.name»Rank = 3 
						«ELSEIF attr.isFourD»
							////integer, parameter :: «attr.name»Rank = 4 
						«ENDIF»
					«ELSE»
						«IF attr.FType=="character*256"»
							////integer, allocatable :: «attr.name»Dim(:,:,:)
						«ENDIF»
						////integer, parameter :: «attr.name»Rank = 0 
					«ENDIF»
					////if (.not.allocated(table%«attr.name»)) then
					//////call sdmMessage(8,3,'«table.name»Table','table%«attr.name» not allocated.')
					//////error = .true.
					//////return
					////endif
					////tableSize = size(table%«attr.name»,«attr.name»Rank+1)
					////! Deal with dimensions
					«IF attr.isArray»
						////allocate(«attr.name»Dim(2,«attr.name»Rank,tableSize),stat=ier)
						////if (ier.ne.0) then
						//////call sdmMessage(8,3,'«table.name»Table','Allocate error for «attr.name»Dim')
						//////error = .true.
						//////return
						////endif
						////do j=1, tableSize
						«IF attr.isStringType»
							//////«attr.name»Dim(:,1,j) = len(table%«attr.name»(1,j))
							//////do i=1, «attr.name»Rank
							////////«attr.name»Dim(:,i+1,j) = size(table%«attr.name»,i)
							//////enddo
						«ELSE»
							//////do i=1, «attr.name»Rank
							////////«attr.name»Dim(:,i,j) = size(table%«attr.name»,i)
							//////enddo
						«ENDIF»
						////enddo
					«ELSEIF attr.FType=="character*256"»
						////allocate(«attr.name»Dim(2,1,tableSize),stat=ier)
						////if (ier.ne.0) then
						//////call sdmMessage(8,3,'«table.name»Table','Allocate error')
						//////error = .true.
						//////return
						////endif
						////do j=1, tableSize
						//////«attr.name»Dim(:,1,j) = len(table%«attr.name»(j))
						////enddo
					«ENDIF»
					////ireturn = sdm_get«table.name»«attr.UpperCaseName»Column(table%«attr.FTypeAttributeDimList»)
					////if (ireturn.lt.0) then
					//////call sdmMessageI(8,3,'«table.name»Table','Error in sdm_get«table.name»«attr.UpperCaseName»', ireturn)
					//////error = .true.
					////endif
					//end subroutine get«table.name»«attr.UpperCaseName»Column
				«ENDFOR»
			«ENDIF»
		«ENDIF»
	'''

}
