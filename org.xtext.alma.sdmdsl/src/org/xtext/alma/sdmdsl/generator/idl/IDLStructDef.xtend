package org.xtext.alma.sdmdsl.generator.idl

import alma.hla.datamodel.meta.asdm.ASDMAttribute
import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import alma.hla.datamodel.meta.asdm.ExtrinsicAttribute
import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess
import alma.hla.datamodel.meta.asdm.TableLink

class IDLStructDef {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file idl/asdmIDL.idl
		sdmFsa.setFile("idl/asdmIDL.idl")
		sdmFsa.generateFile(generateASDM)
	}
	
	
	def generateASDM()'''
	#ifndef _ASDMIDL_IDL_
	#define _ASDMIDL_IDL_ 
	
	#include <asdmIDLTypes.idl>
	#include <almaEnumerations_IF.idl>
	
	// this pragma must come *after* any IDL includes, to work around a bug in ACE/TAO 
	#pragma prefix "alma"
	
	module asdmIDL {
	
		typedef sequence< asdmIDLTypes::IDLTag > SofIDLTag;
		typedef sequence < boolean > Sofboolean;
		typedef sequence < Sofboolean > SofSofboolean;
		typedef sequence < double > Sofdouble;
		typedef sequence < Sofdouble > SofSofdouble;
		typedef sequence < long > Soflong;
		typedef sequence < Soflong > SofSoflong;
		typedef sequence < float > Soffloat;
		typedef sequence < Soffloat > SofSoffloat;
		typedef sequence < SofSoffloat > SofSofSoffloat;
		typedef sequence < string > Sofstring;
		typedef sequence < Sofstring > SofSofstring;
		typedef sequence < long long > Soflonglong;
		typedef sequence < Soflonglong > SofSoflonglong;
		typedef sequence < asdmIDLTypes::IDLLength >SofIDLLength;
		typedef sequence < SofIDLLength > SofSofIDLLength;
		typedef sequence < PolarizationTypeMod::PolarizationType > SofPolarizationType;
		typedef sequence < SofPolarizationType > SofSofPolarizationType;
		typedef sequence < asdmIDLTypes::IDLFrequency > SofIDLFrequency;
		typedef sequence < SofIDLFrequency > SofSofIDLFrequency;
		typedef sequence < asdmIDLTypes::IDLTemperature > SofIDLTemperature;
		typedef sequence < SofIDLTemperature > SofSofIDLTemperature;
		typedef sequence < ScanIntentMod::ScanIntent > SofScanIntent;
		typedef sequence < asdmIDLTypes::IDLAngle > SofIDLAngle;
		typedef sequence < SofIDLAngle > SofSofIDLAngle;
		typedef sequence < SofSofIDLAngle > SofSofSofIDLAngle;
		typedef sequence < ReceiverSidebandMod::ReceiverSideband > SofReceiverSideband;
		typedef sequence < CalibrationDeviceMod::CalibrationDevice > SofCalibrationDevice;
		typedef sequence < StokesParameterMod::StokesParameter > SofStokesParameter;
		typedef sequence < InvalidatingConditionMod::InvalidatingCondition > SofInvalidatingCondition;
		typedef sequence < AtmPhaseCorrectionMod::AtmPhaseCorrection > SofAtmPhaseCorrection;
		typedef sequence < SpectralResolutionTypeMod::SpectralResolutionType > SofSpectralResolutionType;
		typedef sequence < BasebandNameMod::BasebandName > SofBasebandName;
		typedef sequence < AxisNameMod::AxisName > SofAxisName;
		typedef sequence < FilterModeMod::FilterMode > SofFilterMode;
		typedef sequence < asdmIDLTypes::IDLComplex > SofIDLComplex;
		typedef sequence < SofIDLComplex > SofSofIDLComplex;
		typedef sequence < HolographyChannelTypeMod::HolographyChannelType > SofHolographyChannelType;
		typedef sequence < asdmIDLTypes::IDLArrayTimeInterval > SofIDLArrayTimeInterval;
		typedef sequence < NetSidebandMod::NetSideband > SofNetSideband;
		typedef sequence < CalDataOriginMod::CalDataOrigin > SofCalDataOrigin;
		typedef sequence < CalibrationFunctionMod::CalibrationFunction > SofCalibrationFunction ;
		typedef sequence < CalibrationSetMod::CalibrationSet > SofCalibrationSet;
		typedef sequence < AntennaMotionPatternMod::AntennaMotionPattern > SofAntennaMotionPattern;
		typedef sequence < asdmIDLTypes::IDLAngularRate > SofIDLAngularRate;
		typedef sequence < asdmIDLTypes::IDLSpeed > SofIDLSpeed;
		typedef sequence < sequence < asdmIDLTypes::IDLFlux > > SofSofIDLFlux;
		typedef sequence < asdmIDLTypes::IDLInterval > SofIDLInterval;
		typedef sequence < SofIDLInterval > SofSofIDLInterval;
		typedef sequence < sequence < asdmIDLTypes::IDLArrayTime > > SofSofIDLArrayTime;
		
		«/* Define the IDL for each table */»
		«FOR table : container.sortedAlmaTable»
			«table.TableDef»
		«ENDFOR»
		«/* Define the IDL for the ASDM */»
			struct ASDMDataSetIDL {
			«FOR t : container.sortedAlmaTable»
			«t.name»TableIDL «t.LowerCase»;
			«ENDFOR»
			};
		};
	
	#endif
	'''
	
	
	def TableDef(AlmaTable table)'''
		struct «table.name»RowIDL {
			«IF !table.noIntrinsicAttribute»
				«FOR attr : table.intrinsic»
					«attr.RowDef»
				«ENDFOR»
			«ENDIF»
			«IF !table.noExtrinsicAttribute»
				«FOR attr : table.extrinsic»
					«attr.RowDef»
				«ENDFOR»
			«ENDIF»
				«FOR link : table.link»
					«link.TableLinks»
				«ENDFOR»
		};
		typedef	sequence < «table.name»RowIDL > Sof«table.name»Row;	
		struct «table.name»TableIDL {
			Sof«table.name»Row row;
		};
	'''
	
	
	def RowDef(ASDMAttribute attr)''' 
		«IF attr.isOptional»
			boolean «attr.name»Exists;
		«ENDIF»
		«attr.IDLType» «attr.name»;
	'''
	
	def TableLinks(ASDMAttribute linkAttr)'''
		// Links
		«IF linkAttr.refsToAslice»
			// Nothing to generate for a slice.
		«ELSE»
			«IF linkAttr.refsToMany»
				«IF linkAttr.extrinsic»
					«/*generetad in isOneToMany & extrinsic*/»
				«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
}