package org.xtext.alma.sdmdsl.generator.idl;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class IDLStructDef {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("idl/asdmIDL.idl");
    CharSequence _generateASDM = this.generateASDM();
    sdmFsa.generateFile(_generateASDM);
  }
  
  public CharSequence generateASDM() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef _ASDMIDL_IDL_");
    _builder.newLine();
    _builder.append("#define _ASDMIDL_IDL_ ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <asdmIDLTypes.idl>");
    _builder.newLine();
    _builder.append("#include <almaEnumerations_IF.idl>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// this pragma must come *after* any IDL includes, to work around a bug in ACE/TAO ");
    _builder.newLine();
    _builder.append("#pragma prefix \"alma\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module asdmIDL {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence< asdmIDLTypes::IDLTag > SofIDLTag;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < boolean > Sofboolean;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < Sofboolean > SofSofboolean;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < double > Sofdouble;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < Sofdouble > SofSofdouble;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < long > Soflong;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < Soflong > SofSoflong;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < float > Soffloat;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < Soffloat > SofSoffloat;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofSoffloat > SofSofSoffloat;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < string > Sofstring;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < Sofstring > SofSofstring;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < long long > Soflonglong;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < Soflonglong > SofSoflonglong;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLLength >SofIDLLength;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofIDLLength > SofSofIDLLength;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < PolarizationTypeMod::PolarizationType > SofPolarizationType;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofPolarizationType > SofSofPolarizationType;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLFrequency > SofIDLFrequency;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofIDLFrequency > SofSofIDLFrequency;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLTemperature > SofIDLTemperature;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofIDLTemperature > SofSofIDLTemperature;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < ScanIntentMod::ScanIntent > SofScanIntent;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLAngle > SofIDLAngle;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofIDLAngle > SofSofIDLAngle;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofSofIDLAngle > SofSofSofIDLAngle;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < ReceiverSidebandMod::ReceiverSideband > SofReceiverSideband;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < CalibrationDeviceMod::CalibrationDevice > SofCalibrationDevice;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < StokesParameterMod::StokesParameter > SofStokesParameter;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < InvalidatingConditionMod::InvalidatingCondition > SofInvalidatingCondition;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < AtmPhaseCorrectionMod::AtmPhaseCorrection > SofAtmPhaseCorrection;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SpectralResolutionTypeMod::SpectralResolutionType > SofSpectralResolutionType;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < BasebandNameMod::BasebandName > SofBasebandName;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < AxisNameMod::AxisName > SofAxisName;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < FilterModeMod::FilterMode > SofFilterMode;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLComplex > SofIDLComplex;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofIDLComplex > SofSofIDLComplex;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < HolographyChannelTypeMod::HolographyChannelType > SofHolographyChannelType;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLArrayTimeInterval > SofIDLArrayTimeInterval;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < NetSidebandMod::NetSideband > SofNetSideband;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < CalDataOriginMod::CalDataOrigin > SofCalDataOrigin;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < CalibrationFunctionMod::CalibrationFunction > SofCalibrationFunction ;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < CalibrationSetMod::CalibrationSet > SofCalibrationSet;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < AntennaMotionPatternMod::AntennaMotionPattern > SofAntennaMotionPattern;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLAngularRate > SofIDLAngularRate;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLSpeed > SofIDLSpeed;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < sequence < asdmIDLTypes::IDLFlux > > SofSofIDLFlux;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < asdmIDLTypes::IDLInterval > SofIDLInterval;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < SofIDLInterval > SofSofIDLInterval;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typedef sequence < sequence < asdmIDLTypes::IDLArrayTime > > SofSofIDLArrayTime;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        _builder.append("\t");
        CharSequence _TableDef = this.TableDef(table);
        _builder.append(_TableDef, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("struct ASDMDataSetIDL {");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_1 = this.container.sortedAlmaTable();
      for(final AlmaTable t : _sortedAlmaTable_1) {
        _builder.append("\t\t");
        String _name = t.getName();
        _builder.append(_name, "\t\t");
        _builder.append("TableIDL ");
        String _LowerCase = t.LowerCase();
        _builder.append(_LowerCase, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence TableDef(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("struct ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("RowIDL {");
    _builder.newLineIfNotEmpty();
    {
      boolean _noIntrinsicAttribute = table.noIntrinsicAttribute();
      boolean _not = (!_noIntrinsicAttribute);
      if (_not) {
        {
          List<ASDMAttribute> _intrinsic = table.getIntrinsic();
          for(final ASDMAttribute attr : _intrinsic) {
            _builder.append("\t");
            CharSequence _RowDef = this.RowDef(attr);
            _builder.append(_RowDef, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _noExtrinsicAttribute = table.noExtrinsicAttribute();
      boolean _not_1 = (!_noExtrinsicAttribute);
      if (_not_1) {
        {
          List<ASDMAttribute> _extrinsic = table.getExtrinsic();
          for(final ASDMAttribute attr_1 : _extrinsic) {
            _builder.append("\t");
            CharSequence _RowDef_1 = this.RowDef(attr_1);
            _builder.append(_RowDef_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      List<ASDMAttribute> _link = table.getLink();
      for(final ASDMAttribute link : _link) {
        _builder.append("\t\t");
        CharSequence _TableLinks = this.TableLinks(link);
        _builder.append(_TableLinks, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    _builder.append("typedef\tsequence < ");
    String _name_1 = table.getName();
    _builder.append(_name_1, "");
    _builder.append("RowIDL > Sof");
    String _name_2 = table.getName();
    _builder.append(_name_2, "");
    _builder.append("Row;\t");
    _builder.newLineIfNotEmpty();
    _builder.append("struct ");
    String _name_3 = table.getName();
    _builder.append(_name_3, "");
    _builder.append("TableIDL {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Sof");
    String _name_4 = table.getName();
    _builder.append(_name_4, "\t");
    _builder.append("Row row;");
    _builder.newLineIfNotEmpty();
    _builder.append("};");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence RowDef(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOptional = attr.isOptional();
      if (_isOptional) {
        _builder.append("boolean ");
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append("Exists;");
        _builder.newLineIfNotEmpty();
      }
    }
    String _IDLType = attr.IDLType();
    _builder.append(_IDLType, "");
    _builder.append(" ");
    String _name_1 = attr.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence TableLinks(final ASDMAttribute linkAttr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Links");
    _builder.newLine();
    {
      boolean _isRefsToAslice = linkAttr.isRefsToAslice();
      if (_isRefsToAslice) {
        _builder.append("// Nothing to generate for a slice.");
        _builder.newLine();
      } else {
        {
          boolean _isRefsToMany = linkAttr.isRefsToMany();
          if (_isRefsToMany) {
            {
              boolean _isExtrinsic = linkAttr.isExtrinsic();
              if (_isExtrinsic) {
                _builder.append("\t");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
