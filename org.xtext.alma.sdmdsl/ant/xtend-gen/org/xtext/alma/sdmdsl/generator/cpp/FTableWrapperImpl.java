package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FTableWrapperImpl {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  /**
   * FTableWrapperImpl generator (append to src/sdm_modules.90 file)
   */
  public CharSequence appendModules() {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<AlmaTable> _tables = this.container.getTables();
      for(final AlmaTable table : _tables) {
        CharSequence _generateModules = this.generateModules(table);
        _builder.append(_generateModules, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * FTableWrapperImpl generator (append to src/sdm_library.90 file)
   */
  public CharSequence appendLibrary() {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<AlmaTable> _tables = this.container.getTables();
      for(final AlmaTable table : _tables) {
        CharSequence _generateLibrary = this.generateLibrary(table);
        _builder.append(_generateLibrary, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence generateModules(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _name = table.getName();
      boolean _notEquals = (!Objects.equal(_name, "Beam"));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        String _name_1 = table.getName();
        boolean _notEquals_1 = (!Objects.equal(_name_1, "Observation"));
        _and_1 = _notEquals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _name_2 = table.getName();
        boolean _notEquals_2 = (!Objects.equal(_name_2, "Ephemeris"));
        _and = _notEquals_2;
      }
      if (_and) {
        _builder.append("//! ");
        _builder.newLine();
        _builder.append("//! ===========================================================================");
        _builder.newLine();
        _builder.append("//! ");
        _builder.newLine();
        _builder.append("//! ");
        String _name_3 = table.getName();
        _builder.append(_name_3, "");
        _builder.append(" Table: ");
        _builder.newLineIfNotEmpty();
        _builder.append("//! ");
        _builder.newLine();
        _builder.append("//module sdm_");
        String _name_4 = table.getName();
        _builder.append(_name_4, "");
        _builder.newLineIfNotEmpty();
        _builder.append("////use sdm_Types");
        _builder.newLine();
        _builder.append("////type ");
        String _name_5 = table.getName();
        _builder.append(_name_5, "");
        _builder.append("Row");
        _builder.newLineIfNotEmpty();
        {
          boolean _and_2 = false;
          String _name_6 = table.getName();
          boolean _notEquals_3 = (!Objects.equal(_name_6, "AlmaRadiometer"));
          if (!_notEquals_3) {
            _and_2 = false;
          } else {
            String _name_7 = table.getName();
            boolean _notEquals_4 = (!Objects.equal(_name_7, "Weather"));
            _and_2 = _notEquals_4;
          }
          if (_and_2) {
            {
              List<ASDMAttribute> _requiredAttributes = table.getRequiredAttributes();
              for(final ASDMAttribute attr : _requiredAttributes) {
                {
                  boolean _isKey = attr.isKey();
                  boolean _not = (!_isKey);
                  if (_not) {
                    _builder.append("//////");
                    String _FFullType = attr.FFullType();
                    _builder.append(_FFullType, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          } else {
            _builder.append("//////integer:: dummy ! make sure it compiles...");
            _builder.newLine();
          }
        }
        _builder.append("////end type ");
        String _name_8 = table.getName();
        _builder.append(_name_8, "");
        _builder.append("Row");
        _builder.newLineIfNotEmpty();
        _builder.append("////type ");
        String _name_9 = table.getName();
        _builder.append(_name_9, "");
        _builder.append("Key");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _requiredAttributes_1 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_1 : _requiredAttributes_1) {
            {
              boolean _isKey_1 = attr_1.isKey();
              if (_isKey_1) {
                _builder.append("//////");
                String _FFullType_1 = attr_1.FFullType();
                _builder.append(_FFullType_1, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("////end type ");
        String _name_10 = table.getName();
        _builder.append(_name_10, "");
        _builder.append("Key");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
          int _size = _optionalValueAttributes.size();
          boolean _notEquals_5 = (_size != 0);
          if (_notEquals_5) {
            _builder.append("////type ");
            String _name_11 = table.getName();
            _builder.append(_name_11, "");
            _builder.append("Opt");
            _builder.newLineIfNotEmpty();
            {
              List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
              for(final ASDMAttribute attr_2 : _optionalValueAttributes_1) {
                _builder.append("//////");
                String _FFullType_2 = attr_2.FFullType();
                _builder.append(_FFullType_2, "");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("////end type ");
            String _name_12 = table.getName();
            _builder.append(_name_12, "");
            _builder.append("Opt");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("////type ");
        String _name_13 = table.getName();
        _builder.append(_name_13, "");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _requiredAttributes_2 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_3 : _requiredAttributes_2) {
            {
              boolean _isArray = attr_3.isArray();
              if (_isArray) {
                {
                  boolean _or = false;
                  boolean _isOneD = attr_3.isOneD();
                  if (_isOneD) {
                    _or = true;
                  } else {
                    boolean _isExtrinsic = attr_3.isExtrinsic();
                    _or = _isExtrinsic;
                  }
                  if (_or) {
                    _builder.append("//////");
                    String _FType = attr_3.FType();
                    _builder.append(_FType, "");
                    _builder.append(", allocatable :: ");
                    String _name_14 = attr_3.getName();
                    _builder.append(_name_14, "");
                    _builder.append("(:,:)");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _isTwoD = attr_3.isTwoD();
                    if (_isTwoD) {
                      _builder.append("//////");
                      String _FType_1 = attr_3.FType();
                      _builder.append(_FType_1, "");
                      _builder.append(", allocatable :: ");
                      String _name_15 = attr_3.getName();
                      _builder.append(_name_15, "");
                      _builder.append("(:,:,:)");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _isThreeD = attr_3.isThreeD();
                      if (_isThreeD) {
                        _builder.append("//////");
                        String _FType_2 = attr_3.FType();
                        _builder.append(_FType_2, "");
                        _builder.append(", allocatable :: ");
                        String _name_16 = attr_3.getName();
                        _builder.append(_name_16, "");
                        _builder.append("(:,:,:,:)");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isFourD = attr_3.isFourD();
                        if (_isFourD) {
                          _builder.append("//////");
                          String _FType_3 = attr_3.FType();
                          _builder.append(_FType_3, "");
                          _builder.append(", allocatable :: ");
                          String _name_17 = attr_3.getName();
                          _builder.append(_name_17, "");
                          _builder.append("(:,:,:,:,:)");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("//////");
                String _FType_4 = attr_3.FType();
                _builder.append(_FType_4, "");
                _builder.append(", allocatable :: ");
                String _name_18 = attr_3.getName();
                _builder.append(_name_18, "");
                _builder.append("(:)");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("////end type ");
        String _name_19 = table.getName();
        _builder.append(_name_19, "");
        _builder.newLineIfNotEmpty();
        _builder.append("//end module sdm_");
        String _name_20 = table.getName();
        _builder.append(_name_20, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence generateLibrary(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _name = table.getName();
      boolean _notEquals = (!Objects.equal(_name, "Beam"));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        String _name_1 = table.getName();
        boolean _notEquals_1 = (!Objects.equal(_name_1, "Observation"));
        _and_1 = _notEquals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _name_2 = table.getName();
        boolean _notEquals_2 = (!Objects.equal(_name_2, "Ephemeris"));
        _and = _notEquals_2;
      }
      if (_and) {
        _builder.append("//! ");
        _builder.newLine();
        _builder.append("//! ===========================================================================");
        _builder.newLine();
        _builder.append("//! ");
        _builder.newLine();
        _builder.append("//! ");
        String _name_3 = table.getName();
        _builder.append(_name_3, "");
        _builder.append(" Table: ");
        _builder.newLineIfNotEmpty();
        _builder.append("//! ");
        _builder.newLine();
        _builder.append("//! ===========================================================================");
        _builder.newLine();
        _builder.append("//! ");
        _builder.newLine();
        {
          String _name_4 = table.getName();
          boolean _equals = Objects.equal(_name_4, "DataDescription");
          if (_equals) {
            _builder.append("//subroutine add");
            String _name_5 = table.getName();
            _builder.append(_name_5, "");
            _builder.append("Row(key, row, holoType, error)");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("//subroutine add");
            String _name_6 = table.getName();
            _builder.append(_name_6, "");
            _builder.append("Row(key, row, error)");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////use sdm_");
        String _name_7 = table.getName();
        _builder.append(_name_7, "");
        _builder.newLineIfNotEmpty();
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////type(");
        String _name_8 = table.getName();
        _builder.append(_name_8, "");
        _builder.append("Row) :: row");
        _builder.newLineIfNotEmpty();
        _builder.append("////type(");
        String _name_9 = table.getName();
        _builder.append(_name_9, "");
        _builder.append("Key) :: key");
        _builder.newLineIfNotEmpty();
        _builder.append("////logical error");
        _builder.newLine();
        {
          String _name_10 = table.getName();
          boolean _equals_1 = Objects.equal(_name_10, "DataDescription");
          if (_equals_1) {
            _builder.append("////logical holoType");
            _builder.newLine();
          }
        }
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////integer :: ireturn, sdm_add");
        String _name_11 = table.getName();
        _builder.append(_name_11, "");
        _builder.append("Row, i, j");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _requiredAttributes = table.getRequiredAttributes();
          for(final ASDMAttribute attr : _requiredAttributes) {
            {
              boolean _isArray = attr.isArray();
              if (_isArray) {
                {
                  boolean _or = false;
                  boolean _isOneD = attr.isOneD();
                  if (_isOneD) {
                    _or = true;
                  } else {
                    boolean _isExtrinsic = attr.isExtrinsic();
                    _or = _isExtrinsic;
                  }
                  if (_or) {
                    _builder.append("////integer, parameter :: ");
                    String _name_12 = attr.getName();
                    _builder.append(_name_12, "");
                    _builder.append("Rank = 1 ");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _isTwoD = attr.isTwoD();
                    if (_isTwoD) {
                      _builder.append("////integer, parameter :: ");
                      String _name_13 = attr.getName();
                      _builder.append(_name_13, "");
                      _builder.append("Rank = 2 ");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _isThreeD = attr.isThreeD();
                      if (_isThreeD) {
                        _builder.append("////integer, parameter :: ");
                        String _name_14 = attr.getName();
                        _builder.append(_name_14, "");
                        _builder.append("Rank = 3 ");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isFourD = attr.isFourD();
                        if (_isFourD) {
                          _builder.append("////integer, parameter :: ");
                          String _name_15 = attr.getName();
                          _builder.append(_name_15, "");
                          _builder.append("Rank = 4 ");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
                {
                  boolean _isStringType = attr.isStringType();
                  if (_isStringType) {
                    _builder.append("////integer :: ");
                    String _name_16 = attr.getName();
                    _builder.append(_name_16, "");
                    _builder.append("Dim(2,");
                    String _name_17 = attr.getName();
                    _builder.append(_name_17, "");
                    _builder.append("Rank+1)");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("////integer :: ");
                    String _name_18 = attr.getName();
                    _builder.append(_name_18, "");
                    _builder.append("Dim(2,");
                    String _name_19 = attr.getName();
                    _builder.append(_name_19, "");
                    _builder.append("Rank)");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                String _FType = attr.FType();
                boolean _equals_2 = Objects.equal(_FType, "character*256");
                if (_equals_2) {
                  _builder.append("////integer :: ");
                  String _name_20 = attr.getName();
                  _builder.append(_name_20, "");
                  _builder.append("Dim(2)");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("////! ----------------");
        _builder.newLine();
        _builder.append("////! Deal with dimensions");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredAttributes_1 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_1 : _requiredAttributes_1) {
            {
              boolean _isArray_1 = attr_1.isArray();
              if (_isArray_1) {
                _builder.append("////if (.not.allocated(");
                String _FFullName = attr_1.FFullName();
                _builder.append(_FFullName, "");
                _builder.append(")) then");
                _builder.newLineIfNotEmpty();
                _builder.append("//////call sdmMessage(8,3,\'");
                String _name_21 = table.getName();
                _builder.append(_name_21, "");
                _builder.append("Table\',\'");
                String _FFullName_1 = attr_1.FFullName();
                _builder.append(_FFullName_1, "");
                _builder.append(" not allocated.\')");
                _builder.newLineIfNotEmpty();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("//////return");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                {
                  boolean _isStringType_1 = attr_1.isStringType();
                  if (_isStringType_1) {
                    _builder.append("////");
                    String _name_22 = attr_1.getName();
                    _builder.append(_name_22, "");
                    _builder.append("Dim(:,1) = len(");
                    String _FFullName_2 = attr_1.FFullName();
                    _builder.append(_FFullName_2, "");
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                    _builder.append("////do i=1, ");
                    String _name_23 = attr_1.getName();
                    _builder.append(_name_23, "");
                    _builder.append("Rank");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////");
                    String _name_24 = attr_1.getName();
                    _builder.append(_name_24, "");
                    _builder.append("Dim(:,i+1) = size(");
                    String _FFullName_3 = attr_1.FFullName();
                    _builder.append(_FFullName_3, "");
                    _builder.append(",i)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("////enddo");
                    _builder.newLine();
                    {
                      boolean _or_1 = false;
                      boolean _isOneD_1 = attr_1.isOneD();
                      if (_isOneD_1) {
                        _or_1 = true;
                      } else {
                        boolean _isExtrinsic_1 = attr_1.isExtrinsic();
                        _or_1 = _isExtrinsic_1;
                      }
                      if (_or_1) {
                        _builder.append("////do i=1, ");
                        String _name_25 = attr_1.getName();
                        _builder.append(_name_25, "");
                        _builder.append("Dim(1,2) ");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////call charcut(");
                        String _FFullName_4 = attr_1.FFullName();
                        _builder.append(_FFullName_4, "");
                        _builder.append("(i))");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////enddo");
                        _builder.newLine();
                      } else {
                        boolean _isTwoD_1 = attr_1.isTwoD();
                        if (_isTwoD_1) {
                          _builder.append("////do i=1, ");
                          String _name_26 = attr_1.getName();
                          _builder.append(_name_26, "");
                          _builder.append("Dim(1,3) ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("//////do j=1, ");
                          String _name_27 = attr_1.getName();
                          _builder.append(_name_27, "");
                          _builder.append("Dim(1,2) ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("////////call charcut(");
                          String _FFullName_5 = attr_1.FFullName();
                          _builder.append(_FFullName_5, "");
                          _builder.append("(j,i))");
                          _builder.newLineIfNotEmpty();
                          _builder.append("//////enddo");
                          _builder.newLine();
                          _builder.append("////enddo");
                          _builder.newLine();
                        }
                      }
                    }
                  } else {
                    _builder.append("////do i=1, ");
                    String _name_28 = attr_1.getName();
                    _builder.append(_name_28, "");
                    _builder.append("Rank");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////");
                    String _name_29 = attr_1.getName();
                    _builder.append(_name_29, "");
                    _builder.append("Dim(:,i) = size(");
                    String _FFullName_6 = attr_1.FFullName();
                    _builder.append(_FFullName_6, "");
                    _builder.append(",i)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("////enddo");
                    _builder.newLine();
                  }
                }
              } else {
                String _FType_1 = attr_1.FType();
                boolean _equals_3 = Objects.equal(_FType_1, "character*256");
                if (_equals_3) {
                  _builder.append("////");
                  String _name_30 = attr_1.getName();
                  _builder.append(_name_30, "");
                  _builder.append("Dim = len(");
                  String _FFullName_7 = attr_1.FFullName();
                  _builder.append(_FFullName_7, "");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                  _builder.append("////call charcut(");
                  String _FFullName_8 = attr_1.FFullName();
                  _builder.append(_FFullName_8, "");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("////!");
        _builder.newLine();
        {
          String _name_31 = table.getName();
          boolean _equals_4 = Objects.equal(_name_31, "DataDescription");
          if (_equals_4) {
            _builder.append("////ireturn = sdm_add");
            String _name_32 = table.getName();
            _builder.append(_name_32, "");
            _builder.append("Row(");
            String _RequiredAddFList = table.RequiredAddFList();
            _builder.append(_RequiredAddFList, "");
            _builder.append(", holoType)");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("////ireturn = sdm_add");
            String _name_33 = table.getName();
            _builder.append(_name_33, "");
            _builder.append("Row(");
            String _RequiredAddFList_1 = table.RequiredAddFList();
            _builder.append(_RequiredAddFList_1, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("////if (ireturn.lt.0) then");
        _builder.newLine();
        _builder.append("//////call sdmMessageI(8,3,\'");
        String _name_34 = table.getName();
        _builder.append(_name_34, "");
        _builder.append("Table\',\'Error in sdm_add");
        String _name_35 = table.getName();
        _builder.append(_name_35, "");
        _builder.append("Row\', ireturn)");
        _builder.newLineIfNotEmpty();
        _builder.append("//////error = .true.");
        _builder.newLine();
        {
          List<ASDMAttribute> _autoIncrementable = table.getAutoIncrementable();
          int _size = _autoIncrementable.size();
          boolean _notEquals_3 = (_size != 0);
          if (_notEquals_3) {
            _builder.append("////else");
            _builder.newLine();
            {
              List<ASDMAttribute> _autoIncrementable_1 = table.getAutoIncrementable();
              for(final ASDMAttribute attr_2 : _autoIncrementable_1) {
                _builder.append("//////key%");
                String _name_36 = attr_2.getName();
                _builder.append(_name_36, "");
                _builder.append(" = ireturn");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("////endif");
        _builder.newLine();
        _builder.append("//end subroutine add");
        String _name_37 = table.getName();
        _builder.append(_name_37, "");
        _builder.append("Row");
        _builder.newLineIfNotEmpty();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//! ---------------------------------------------------------------------------");
        _builder.newLine();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//subroutine get");
        String _name_38 = table.getName();
        _builder.append(_name_38, "");
        _builder.append("Row(key, row, error)");
        _builder.newLineIfNotEmpty();
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////use sdm_");
        String _name_39 = table.getName();
        _builder.append(_name_39, "");
        _builder.newLineIfNotEmpty();
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////type(");
        String _name_40 = table.getName();
        _builder.append(_name_40, "");
        _builder.append("Row) :: row");
        _builder.newLineIfNotEmpty();
        _builder.append("////type(");
        String _name_41 = table.getName();
        _builder.append(_name_41, "");
        _builder.append("Key) :: key");
        _builder.newLineIfNotEmpty();
        _builder.append("////logical error");
        _builder.newLine();
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////integer :: ireturn, sdm_get");
        String _name_42 = table.getName();
        _builder.append(_name_42, "");
        _builder.append("Row, i");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _requiredAttributes_2 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_3 : _requiredAttributes_2) {
            {
              boolean _isArray_2 = attr_3.isArray();
              if (_isArray_2) {
                {
                  boolean _or_2 = false;
                  boolean _isOneD_2 = attr_3.isOneD();
                  if (_isOneD_2) {
                    _or_2 = true;
                  } else {
                    boolean _isExtrinsic_2 = attr_3.isExtrinsic();
                    _or_2 = _isExtrinsic_2;
                  }
                  if (_or_2) {
                    _builder.append("////integer, parameter :: ");
                    String _name_43 = attr_3.getName();
                    _builder.append(_name_43, "");
                    _builder.append("Rank = 1 ");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _isTwoD_2 = attr_3.isTwoD();
                    if (_isTwoD_2) {
                      _builder.append("////integer, parameter :: ");
                      String _name_44 = attr_3.getName();
                      _builder.append(_name_44, "");
                      _builder.append("Rank = 2 ");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _isThreeD_1 = attr_3.isThreeD();
                      if (_isThreeD_1) {
                        _builder.append("////integer, parameter :: ");
                        String _name_45 = attr_3.getName();
                        _builder.append(_name_45, "");
                        _builder.append("Rank = 3 ");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isFourD_1 = attr_3.isFourD();
                        if (_isFourD_1) {
                          _builder.append("////integer, parameter :: ");
                          String _name_46 = attr_3.getName();
                          _builder.append(_name_46, "");
                          _builder.append("Rank = 4");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
                {
                  boolean _isStringType_2 = attr_3.isStringType();
                  if (_isStringType_2) {
                    _builder.append("////integer :: ");
                    String _name_47 = attr_3.getName();
                    _builder.append(_name_47, "");
                    _builder.append("Dim(2,");
                    String _name_48 = attr_3.getName();
                    _builder.append(_name_48, "");
                    _builder.append("Rank+1)");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("////integer :: ");
                    String _name_49 = attr_3.getName();
                    _builder.append(_name_49, "");
                    _builder.append("Dim(2,");
                    String _name_50 = attr_3.getName();
                    _builder.append(_name_50, "");
                    _builder.append("Rank)");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                String _FType_2 = attr_3.FType();
                boolean _equals_5 = Objects.equal(_FType_2, "character*256");
                if (_equals_5) {
                  _builder.append("////integer :: ");
                  String _name_51 = attr_3.getName();
                  _builder.append(_name_51, "");
                  _builder.append("Dim(2)");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("////! Deal with dimensions");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredAttributes_3 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_4 : _requiredAttributes_3) {
            {
              boolean _isArray_3 = attr_4.isArray();
              if (_isArray_3) {
                _builder.append("////if (.not.allocated(");
                String _FFullName_9 = attr_4.FFullName();
                _builder.append(_FFullName_9, "");
                _builder.append(")) then");
                _builder.newLineIfNotEmpty();
                _builder.append("//////call sdmMessage(8,3,\'");
                String _name_52 = table.getName();
                _builder.append(_name_52, "");
                _builder.append("Table\',\'");
                String _FFullName_10 = attr_4.FFullName();
                _builder.append(_FFullName_10, "");
                _builder.append(" not allocated.\')");
                _builder.newLineIfNotEmpty();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("//////return");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                {
                  boolean _isStringType_3 = attr_4.isStringType();
                  if (_isStringType_3) {
                    _builder.append("////");
                    String _name_53 = attr_4.getName();
                    _builder.append(_name_53, "");
                    _builder.append("Dim(:,1) = len(");
                    String _FFullName_11 = attr_4.FFullName();
                    _builder.append(_FFullName_11, "");
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                    _builder.append("////do i=1, ");
                    String _name_54 = attr_4.getName();
                    _builder.append(_name_54, "");
                    _builder.append("Rank");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////");
                    String _name_55 = attr_4.getName();
                    _builder.append(_name_55, "");
                    _builder.append("Dim(:,i+1) = size(");
                    String _FFullName_12 = attr_4.FFullName();
                    _builder.append(_FFullName_12, "");
                    _builder.append(",i)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("////enddo");
                    _builder.newLine();
                  } else {
                    _builder.append("////do i=1, ");
                    String _name_56 = attr_4.getName();
                    _builder.append(_name_56, "");
                    _builder.append("Rank");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////");
                    String _name_57 = attr_4.getName();
                    _builder.append(_name_57, "");
                    _builder.append("Dim(:,i) = size(");
                    String _FFullName_13 = attr_4.FFullName();
                    _builder.append(_FFullName_13, "");
                    _builder.append(",i)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("////enddo");
                    _builder.newLine();
                  }
                }
              } else {
                String _FType_3 = attr_4.FType();
                boolean _equals_6 = Objects.equal(_FType_3, "character*256");
                if (_equals_6) {
                  _builder.append("////");
                  String _name_58 = attr_4.getName();
                  _builder.append(_name_58, "");
                  _builder.append("Dim = len(");
                  String _FFullName_14 = attr_4.FFullName();
                  _builder.append(_FFullName_14, "");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                  _builder.append("////call charcut(");
                  String _FFullName_15 = attr_4.FFullName();
                  _builder.append(_FFullName_15, "");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////ireturn = sdm_get");
        String _name_59 = table.getName();
        _builder.append(_name_59, "");
        _builder.append("Row(");
        String _RequiredGetFList = table.RequiredGetFList();
        _builder.append(_RequiredGetFList, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _requiredAttributes_4 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_5 : _requiredAttributes_4) {
            {
              boolean _isArray_4 = attr_5.isArray();
              if (_isArray_4) {
                {
                  boolean _isOneD_3 = attr_5.isOneD();
                  if (_isOneD_3) {
                    {
                      boolean _isStringType_4 = attr_5.isStringType();
                      if (_isStringType_4) {
                        _builder.append("////do i=1,");
                        String _name_60 = attr_5.getName();
                        _builder.append(_name_60, "");
                        _builder.append("Dim(1,2) ");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isKey = attr_5.isKey();
                          if (_isKey) {
                            _builder.append("//////key%");
                            String _name_61 = attr_5.getName();
                            _builder.append(_name_61, "");
                            _builder.append("(i)(");
                            String _name_62 = attr_5.getName();
                            _builder.append(_name_62, "");
                            _builder.append("Dim(1,1)+1:) = \'\'");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("//////row%");
                            String _name_63 = attr_5.getName();
                            _builder.append(_name_63, "");
                            _builder.append("(i)(");
                            String _name_64 = attr_5.getName();
                            _builder.append(_name_64, "");
                            _builder.append("Dim(1,1)+1:) = \'\'");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        _builder.append("////enddo");
                        _builder.newLine();
                      }
                    }
                  }
                }
              } else {
                String _FType_4 = attr_5.FType();
                boolean _equals_7 = Objects.equal(_FType_4, "character*256");
                if (_equals_7) {
                  {
                    boolean _isKey_1 = attr_5.isKey();
                    if (_isKey_1) {
                      _builder.append("////key%");
                      String _name_65 = attr_5.getName();
                      _builder.append(_name_65, "");
                      _builder.append("(");
                      String _name_66 = attr_5.getName();
                      _builder.append(_name_66, "");
                      _builder.append("Dim(1)+1:) = \'\'");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("////row%");
                      String _name_67 = attr_5.getName();
                      _builder.append(_name_67, "");
                      _builder.append("(");
                      String _name_68 = attr_5.getName();
                      _builder.append(_name_68, "");
                      _builder.append("Dim(1)+1:) = \'\'");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("////if (ireturn.lt.0) then");
        _builder.newLine();
        _builder.append("//////call sdmMessageI(8,3,\'");
        String _name_69 = table.getName();
        _builder.append(_name_69, "");
        _builder.append("Table\',\'Error in sdm_get");
        String _name_70 = table.getName();
        _builder.append(_name_70, "");
        _builder.append("Row\', ireturn)");
        _builder.newLineIfNotEmpty();
        _builder.append("//////error = .true.");
        _builder.newLine();
        _builder.append("////endif");
        _builder.newLine();
        _builder.append("//end subroutine get");
        String _name_71 = table.getName();
        _builder.append(_name_71, "");
        _builder.append("Row");
        _builder.newLineIfNotEmpty();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//! ---------------------------------------------------------------------------");
        _builder.newLine();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//subroutine get");
        String _name_72 = table.getName();
        _builder.append(_name_72, "");
        _builder.append("TableSize(tableSize, error)");
        _builder.newLineIfNotEmpty();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//! return the size of the table");
        _builder.newLine();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("////integer :: tableSize, sdm_get");
        String _name_73 = table.getName();
        _builder.append(_name_73, "");
        _builder.append("TableSize, ireturn");
        _builder.newLineIfNotEmpty();
        _builder.append("////logical :: error");
        _builder.newLine();
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////ireturn = sdm_get");
        String _name_74 = table.getName();
        _builder.append(_name_74, "");
        _builder.append("TableSize()");
        _builder.newLineIfNotEmpty();
        _builder.append("////tableSize = ireturn");
        _builder.newLine();
        _builder.append("////if (ireturn.lt.0) error = .true.");
        _builder.newLine();
        _builder.append("//end subroutine get");
        String _name_75 = table.getName();
        _builder.append(_name_75, "");
        _builder.append("TableSize");
        _builder.newLineIfNotEmpty();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//! ---------------------------------------------------------------------------");
        _builder.newLine();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//subroutine get");
        String _name_76 = table.getName();
        _builder.append(_name_76, "");
        _builder.append("Keys(tableSize, keyList, error)");
        _builder.newLineIfNotEmpty();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("//! return the list of keys");
        _builder.newLine();
        _builder.append("//!");
        _builder.newLine();
        _builder.append("////use sdm_");
        String _name_77 = table.getName();
        _builder.append(_name_77, "");
        _builder.newLineIfNotEmpty();
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////integer :: tableSize");
        _builder.newLine();
        _builder.append("////logical :: error");
        _builder.newLine();
        _builder.append("////type(");
        String _name_78 = table.getName();
        _builder.append(_name_78, "");
        _builder.append("Key) :: keyList(tableSize)");
        _builder.newLineIfNotEmpty();
        _builder.append("////integer :: ireturn, sdm_get");
        String _name_79 = table.getName();
        _builder.append(_name_79, "");
        _builder.append("Keys, i");
        _builder.newLineIfNotEmpty();
        {
          List<ASDMAttribute> _requiredAttributes_5 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_6 : _requiredAttributes_5) {
            {
              boolean _isKey_2 = attr_6.isKey();
              if (_isKey_2) {
                {
                  boolean _isArray_5 = attr_6.isArray();
                  boolean _not = (!_isArray_5);
                  if (_not) {
                    _builder.append("////");
                    String _FType_5 = attr_6.FType();
                    _builder.append(_FType_5, "");
                    _builder.append(", allocatable :: ");
                    String _name_80 = attr_6.getName();
                    _builder.append(_name_80, "");
                    _builder.append("List(:) ");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  boolean _isStringType_5 = attr_6.isStringType();
                  if (_isStringType_5) {
                    _builder.append("////integer :: ");
                    String _name_81 = attr_6.getName();
                    _builder.append(_name_81, "");
                    _builder.append("ListDim(2,2)");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        _builder.append("////!");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredAttributes_6 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_7 : _requiredAttributes_6) {
            {
              boolean _isKey_3 = attr_7.isKey();
              if (_isKey_3) {
                {
                  boolean _isArray_6 = attr_7.isArray();
                  boolean _not_1 = (!_isArray_6);
                  if (_not_1) {
                    _builder.append("////allocate(");
                    String _name_82 = attr_7.getName();
                    _builder.append(_name_82, "");
                    _builder.append("List(tableSize))  ");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _FType_6 = attr_7.FType();
                  boolean _equals_8 = Objects.equal(_FType_6, "character*256");
                  if (_equals_8) {
                    _builder.append("////");
                    String _name_83 = attr_7.getName();
                    _builder.append(_name_83, "");
                    _builder.append("ListDim = len(keyList%");
                    String _name_84 = attr_7.getName();
                    _builder.append(_name_84, "");
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        _builder.append("////!");
        _builder.newLine();
        _builder.append("////ireturn = sdm_get");
        String _name_85 = table.getName();
        _builder.append(_name_85, "");
        _builder.append("Keys(");
        String _KeyFTypeList = table.KeyFTypeList();
        _builder.append(_KeyFTypeList, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("////if (ireturn.lt.0) then");
        _builder.newLine();
        _builder.append("//////call sdmMessageI(8,3,\'");
        String _name_86 = table.getName();
        _builder.append(_name_86, "");
        _builder.append("Table\',\'Error in sdm_get");
        String _name_87 = table.getName();
        _builder.append(_name_87, "");
        _builder.append("Keys\', ireturn)");
        _builder.newLineIfNotEmpty();
        _builder.append("//////error = .true.");
        _builder.newLine();
        _builder.append("//////return");
        _builder.newLine();
        _builder.append("////endif");
        _builder.newLine();
        _builder.append("////do i=1, tableSize");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredAttributes_7 = table.getRequiredAttributes();
          for(final ASDMAttribute attr_8 : _requiredAttributes_7) {
            {
              boolean _isKey_4 = attr_8.isKey();
              if (_isKey_4) {
                {
                  boolean _isArray_7 = attr_8.isArray();
                  boolean _not_2 = (!_isArray_7);
                  if (_not_2) {
                    {
                      boolean _isStringType_6 = attr_8.isStringType();
                      if (_isStringType_6) {
                        _builder.append("//////keyList(i)%");
                        String _name_88 = attr_8.getName();
                        _builder.append(_name_88, "");
                        _builder.append(" = ");
                        String _name_89 = attr_8.getName();
                        _builder.append(_name_89, "");
                        _builder.append("List(i)(1:");
                        String _name_90 = attr_8.getName();
                        _builder.append(_name_90, "");
                        _builder.append("ListDim(1,1))");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("//////keyList(i)%");
                        String _name_91 = attr_8.getName();
                        _builder.append(_name_91, "");
                        _builder.append(" = ");
                        String _name_92 = attr_8.getName();
                        _builder.append(_name_92, "");
                        _builder.append("List(i)");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("////enddo");
        _builder.newLine();
        _builder.append("//end subroutine get");
        String _name_93 = table.getName();
        _builder.append(_name_93, "");
        _builder.append("Keys");
        _builder.newLineIfNotEmpty();
        {
          boolean _and_2 = false;
          String _name_94 = table.getName();
          boolean _notEquals_4 = (!Objects.equal(_name_94, "TotalPower"));
          if (!_notEquals_4) {
            _and_2 = false;
          } else {
            String _name_95 = table.getName();
            boolean _notEquals_5 = (!Objects.equal(_name_95, "Annotation"));
            _and_2 = _notEquals_5;
          }
          if (_and_2) {
            {
              boolean _hasRequiredArrays = table.hasRequiredArrays();
              if (_hasRequiredArrays) {
                _builder.append("//! ---------------------------------------------------------------------------");
                _builder.newLine();
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//subroutine alloc");
                String _name_96 = table.getName();
                _builder.append(_name_96, "");
                _builder.append("Row(row, error)");
                _builder.newLineIfNotEmpty();
                _builder.append("////use sdm_");
                String _name_97 = table.getName();
                _builder.append(_name_97, "");
                _builder.newLineIfNotEmpty();
                _builder.append("////type(");
                String _name_98 = table.getName();
                _builder.append(_name_98, "");
                _builder.append("Row) :: row");
                _builder.newLineIfNotEmpty();
                _builder.append("////logical :: error");
                _builder.newLine();
                _builder.append("////integer :: ier");
                _builder.newLine();
                _builder.append("////character, parameter :: sdmTable*32= \'");
                String _name_99 = table.getName();
                _builder.append(_name_99, "");
                _builder.append("\'");
                _builder.newLineIfNotEmpty();
                {
                  List<ASDMAttribute> _requiredAttributes_8 = table.getRequiredAttributes();
                  for(final ASDMAttribute attr_9 : _requiredAttributes_8) {
                    {
                      boolean _isArray_8 = attr_9.isArray();
                      if (_isArray_8) {
                        _builder.append("////! row%");
                        String _name_100 = attr_9.getName();
                        _builder.append(_name_100, "");
                        _builder.append(" allocation");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////if (allocated(row%");
                        String _name_101 = attr_9.getName();
                        _builder.append(_name_101, "");
                        _builder.append(")) then");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////deallocate(row%");
                        String _name_102 = attr_9.getName();
                        _builder.append(_name_102, "");
                        _builder.append(", stat=ier)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////if (ier.ne.0) goto 98");
                        _builder.newLine();
                        _builder.append("////endif");
                        _builder.newLine();
                      }
                    }
                  }
                }
                _builder.append("////allocate(");
                String _RowAllocateFList = table.RowAllocateFList();
                _builder.append(_RowAllocateFList, "");
                _builder.append(", stat=ier)");
                _builder.newLineIfNotEmpty();
                _builder.append("////if (ier.ne.0) then");
                _builder.newLine();
                _builder.append("//////call sdmmessageI(8,4,sdmTable ,\'Allocation error ier \',ier)");
                _builder.newLine();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                _builder.append("////return");
                _builder.newLine();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("//98 call sdmmessageI(8,4,sdmTable ,\'Deallocation error ier \',ier)");
                _builder.newLine();
                _builder.append("////error = .true.");
                _builder.newLine();
                _builder.append("////return");
                _builder.newLine();
                _builder.append("//endsubroutine alloc");
                String _name_103 = table.getName();
                _builder.append(_name_103, "");
                _builder.append("Row ");
                _builder.newLineIfNotEmpty();
                _builder.append("//! ");
                _builder.newLine();
              }
            }
            {
              boolean _hasOptionalArrays = table.hasOptionalArrays();
              if (_hasOptionalArrays) {
                _builder.append("//! ---------------------------------------------------------------------------");
                _builder.newLine();
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//subroutine alloc");
                String _name_104 = table.getName();
                _builder.append(_name_104, "");
                _builder.append("Opt(row, opt, error)");
                _builder.newLineIfNotEmpty();
                _builder.append("////use sdm_");
                String _name_105 = table.getName();
                _builder.append(_name_105, "");
                _builder.newLineIfNotEmpty();
                _builder.append("////type(");
                String _name_106 = table.getName();
                _builder.append(_name_106, "");
                _builder.append("Row) :: row");
                _builder.newLineIfNotEmpty();
                _builder.append("////type(");
                String _name_107 = table.getName();
                _builder.append(_name_107, "");
                _builder.append("Opt) :: opt");
                _builder.newLineIfNotEmpty();
                _builder.append("////logical :: error");
                _builder.newLine();
                _builder.append("////integer :: ier");
                _builder.newLine();
                _builder.append("////character, parameter :: sdmTable*32 = \'");
                String _name_108 = table.getName();
                _builder.append(_name_108, "");
                _builder.append("\'");
                _builder.newLineIfNotEmpty();
                {
                  List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
                  for(final ASDMAttribute attr_10 : _optionalValueAttributes) {
                    {
                      boolean _isArray_9 = attr_10.isArray();
                      if (_isArray_9) {
                        _builder.append("////! opt%");
                        String _name_109 = attr_10.getName();
                        _builder.append(_name_109, "");
                        _builder.append(" allocation");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////if (allocated(opt%");
                        String _name_110 = attr_10.getName();
                        _builder.append(_name_110, "");
                        _builder.append(")) then");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////deallocate(opt%");
                        String _name_111 = attr_10.getName();
                        _builder.append(_name_111, "");
                        _builder.append(", stat=ier)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////if (ier.ne.0) goto 98");
                        _builder.newLine();
                        _builder.append("////endif");
                        _builder.newLine();
                      }
                    }
                  }
                }
                _builder.append("////allocate(");
                String _OptAllocateFList = table.OptAllocateFList();
                _builder.append(_OptAllocateFList, "");
                _builder.append(", stat=ier)");
                _builder.newLineIfNotEmpty();
                _builder.append("////if (ier.ne.0) then");
                _builder.newLine();
                _builder.append("//////call sdmmessageI(8,4,sdmTable ,\'Allocation error ier \',ier)");
                _builder.newLine();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                _builder.append("////return");
                _builder.newLine();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("//98 call sdmmessageI(8,4,sdmTable ,\'Opt. Deallocation error ier \',ier)");
                _builder.newLine();
                _builder.append("////error = .true.");
                _builder.newLine();
                _builder.append("////return");
                _builder.newLine();
                _builder.append("//endsubroutine alloc");
                String _name_112 = table.getName();
                _builder.append(_name_112, "");
                _builder.append("Opt");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("//! ---------------------------------------------------------------------------");
        _builder.newLine();
        _builder.newLine();
        {
          List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
          int _size_1 = _optionalValueAttributes_1.size();
          boolean _notEquals_6 = (_size_1 != 0);
          if (_notEquals_6) {
            {
              List<ASDMAttribute> _optionalValueAttributes_2 = table.getOptionalValueAttributes();
              for(final ASDMAttribute attr_11 : _optionalValueAttributes_2) {
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//! ---------------------------------------------------------------------------");
                _builder.newLine();
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//subroutine add");
                String _name_113 = table.getName();
                _builder.append(_name_113, "");
                String _UpperCaseName = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName, "");
                _builder.append("(key, opt, error)");
                _builder.newLineIfNotEmpty();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////use sdm_");
                String _name_114 = table.getName();
                _builder.append(_name_114, "");
                _builder.newLineIfNotEmpty();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////type(");
                String _name_115 = table.getName();
                _builder.append(_name_115, "");
                _builder.append("Key) :: key");
                _builder.newLineIfNotEmpty();
                _builder.append("////type(");
                String _name_116 = table.getName();
                _builder.append(_name_116, "");
                _builder.append("Opt) :: opt");
                _builder.newLineIfNotEmpty();
                _builder.append("////logical :: error");
                _builder.newLine();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////integer :: ireturn, sdm_add");
                String _name_117 = table.getName();
                _builder.append(_name_117, "");
                String _UpperCaseName_1 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_1, "");
                _builder.append(", i");
                _builder.newLineIfNotEmpty();
                {
                  List<ASDMAttribute> _requiredAttributes_9 = table.getRequiredAttributes();
                  for(final ASDMAttribute attr2 : _requiredAttributes_9) {
                    {
                      boolean _isKey_5 = attr2.isKey();
                      if (_isKey_5) {
                        {
                          boolean _isStringType_7 = attr2.isStringType();
                          if (_isStringType_7) {
                            _builder.append("////integer :: ");
                            String _name_118 = attr_11.getName();
                            _builder.append(_name_118, "");
                            _builder.append("Dim(2)");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
                _builder.append("////!! ");
                String _FFullType = attr_11.FFullType();
                _builder.append(_FFullType, "");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isArray_10 = attr_11.isArray();
                  if (_isArray_10) {
                    {
                      boolean _or_3 = false;
                      boolean _isOneD_4 = attr_11.isOneD();
                      if (_isOneD_4) {
                        _or_3 = true;
                      } else {
                        boolean _isExtrinsic_3 = attr_11.isExtrinsic();
                        _or_3 = _isExtrinsic_3;
                      }
                      if (_or_3) {
                        _builder.append("////integer, parameter :: ");
                        String _name_119 = attr_11.getName();
                        _builder.append(_name_119, "");
                        _builder.append("Rank = 1 ");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isTwoD_3 = attr_11.isTwoD();
                        if (_isTwoD_3) {
                          _builder.append("////integer, parameter :: ");
                          String _name_120 = attr_11.getName();
                          _builder.append(_name_120, "");
                          _builder.append("Rank = 2 ");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _isThreeD_2 = attr_11.isThreeD();
                          if (_isThreeD_2) {
                            _builder.append("////integer, parameter :: ");
                            String _name_121 = attr_11.getName();
                            _builder.append(_name_121, "");
                            _builder.append("Rank = 3 ");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _isFourD_2 = attr_11.isFourD();
                            if (_isFourD_2) {
                              _builder.append("////integer, parameter :: ");
                              String _name_122 = attr_11.getName();
                              _builder.append(_name_122, "");
                              _builder.append("Rank = 4 ");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                    {
                      boolean _isStringType_8 = attr_11.isStringType();
                      if (_isStringType_8) {
                        _builder.append("////integer :: ");
                        String _name_123 = attr_11.getName();
                        _builder.append(_name_123, "");
                        _builder.append("Dim(2,");
                        String _name_124 = attr_11.getName();
                        _builder.append(_name_124, "");
                        _builder.append("Rank+1)");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("////integer :: ");
                        String _name_125 = attr_11.getName();
                        _builder.append(_name_125, "");
                        _builder.append("Dim(2,");
                        String _name_126 = attr_11.getName();
                        _builder.append(_name_126, "");
                        _builder.append("Rank)");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    String _FType_7 = attr_11.FType();
                    boolean _equals_9 = Objects.equal(_FType_7, "character*256");
                    if (_equals_9) {
                      _builder.append("////integer :: ");
                      String _name_127 = attr_11.getName();
                      _builder.append(_name_127, "");
                      _builder.append("Dim(2)");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
                _builder.append("////! Deal with dimensions");
                _builder.newLine();
                {
                  boolean _isArray_11 = attr_11.isArray();
                  if (_isArray_11) {
                    _builder.append("////if (.not.allocated(opt%");
                    String _name_128 = attr_11.getName();
                    _builder.append(_name_128, "");
                    _builder.append(")) then");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////call sdmMessage(8,3,\'");
                    String _name_129 = table.getName();
                    _builder.append(_name_129, "");
                    _builder.append("Table\',\'opt%");
                    String _name_130 = attr_11.getName();
                    _builder.append(_name_130, "");
                    _builder.append(" not allocated.\')");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////error = .true.");
                    _builder.newLine();
                    _builder.append("//////return");
                    _builder.newLine();
                    _builder.append("////endif");
                    _builder.newLine();
                    {
                      boolean _isStringType_9 = attr_11.isStringType();
                      if (_isStringType_9) {
                        _builder.append("////");
                        String _name_131 = attr_11.getName();
                        _builder.append(_name_131, "");
                        _builder.append("Dim(:,1) = len(opt%");
                        String _name_132 = attr_11.getName();
                        _builder.append(_name_132, "");
                        _builder.append(")");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////do i=1, ");
                        String _name_133 = attr_11.getName();
                        _builder.append(_name_133, "");
                        _builder.append("Rank");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////");
                        String _name_134 = attr_11.getName();
                        _builder.append(_name_134, "");
                        _builder.append("Dim(:,i+1) = size(opt%");
                        String _name_135 = attr_11.getName();
                        _builder.append(_name_135, "");
                        _builder.append(",i)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////call charcut(opt%");
                        String _name_136 = attr_11.getName();
                        _builder.append(_name_136, "");
                        _builder.append("(i))");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////enddo");
                        _builder.newLine();
                      } else {
                        _builder.append("////do i=1, ");
                        String _name_137 = attr_11.getName();
                        _builder.append(_name_137, "");
                        _builder.append("Rank");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////");
                        String _name_138 = attr_11.getName();
                        _builder.append(_name_138, "");
                        _builder.append("Dim(:,i) = size(opt%");
                        String _name_139 = attr_11.getName();
                        _builder.append(_name_139, "");
                        _builder.append(",i)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////enddo");
                        _builder.newLine();
                      }
                    }
                  } else {
                    String _FType_8 = attr_11.FType();
                    boolean _equals_10 = Objects.equal(_FType_8, "character*256");
                    if (_equals_10) {
                      _builder.append("////");
                      String _name_140 = attr_11.getName();
                      _builder.append(_name_140, "");
                      _builder.append("Dim = len(opt%");
                      String _name_141 = attr_11.getName();
                      _builder.append(_name_141, "");
                      _builder.append(")");
                      _builder.newLineIfNotEmpty();
                      _builder.append("////call charcut(opt%");
                      String _name_142 = attr_11.getName();
                      _builder.append(_name_142, "");
                      _builder.append(")");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
                _builder.append("////ireturn = sdm_add");
                String _name_143 = table.getName();
                _builder.append(_name_143, "");
                String _UpperCaseName_2 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_2, "");
                _builder.append("(");
                String _KeyFType = table.KeyFType();
                _builder.append(_KeyFType, "");
                _builder.append(", opt%");
                String _FTypeAttributeDimList = attr_11.FTypeAttributeDimList();
                _builder.append(_FTypeAttributeDimList, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append("////if (ireturn.lt.0) then");
                _builder.newLine();
                _builder.append("//////call sdmMessageI(8,3,\'");
                String _name_144 = table.getName();
                _builder.append(_name_144, "");
                _builder.append("Table\',\'Error in sdm_add");
                String _name_145 = table.getName();
                _builder.append(_name_145, "");
                String _UpperCaseName_3 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_3, "");
                _builder.append("\', ireturn)");
                _builder.newLineIfNotEmpty();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                _builder.append("//end subroutine add");
                String _name_146 = table.getName();
                _builder.append(_name_146, "");
                String _UpperCaseName_4 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_4, "");
                _builder.newLineIfNotEmpty();
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//! ---------------------------------------------------------------------------");
                _builder.newLine();
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//subroutine get");
                String _name_147 = table.getName();
                _builder.append(_name_147, "");
                String _UpperCaseName_5 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_5, "");
                _builder.append("(key, opt, present, error)");
                _builder.newLineIfNotEmpty();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////use sdm_");
                String _name_148 = table.getName();
                _builder.append(_name_148, "");
                _builder.newLineIfNotEmpty();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////type(");
                String _name_149 = table.getName();
                _builder.append(_name_149, "");
                _builder.append("Key) :: key");
                _builder.newLineIfNotEmpty();
                _builder.append("////type(");
                String _name_150 = table.getName();
                _builder.append(_name_150, "");
                _builder.append("Opt) :: opt");
                _builder.newLineIfNotEmpty();
                _builder.append("////logical :: error, present");
                _builder.newLine();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////integer :: ireturn, sdm_get");
                String _name_151 = table.getName();
                _builder.append(_name_151, "");
                String _UpperCaseName_6 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_6, "");
                _builder.append(", i");
                _builder.newLineIfNotEmpty();
                {
                  List<ASDMAttribute> _requiredAttributes_10 = table.getRequiredAttributes();
                  for(final ASDMAttribute attr2_1 : _requiredAttributes_10) {
                    {
                      boolean _isKey_6 = attr2_1.isKey();
                      if (_isKey_6) {
                        {
                          boolean _isStringType_10 = attr2_1.isStringType();
                          if (_isStringType_10) {
                            _builder.append("////integer :: ");
                            String _name_152 = attr_11.getName();
                            _builder.append(_name_152, "");
                            _builder.append("Dim(2)");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
                {
                  boolean _isArray_12 = attr_11.isArray();
                  if (_isArray_12) {
                    {
                      boolean _or_4 = false;
                      boolean _isOneD_5 = attr_11.isOneD();
                      if (_isOneD_5) {
                        _or_4 = true;
                      } else {
                        boolean _isExtrinsic_4 = attr_11.isExtrinsic();
                        _or_4 = _isExtrinsic_4;
                      }
                      if (_or_4) {
                        _builder.append("////integer, parameter :: ");
                        String _name_153 = attr_11.getName();
                        _builder.append(_name_153, "");
                        _builder.append("Rank = 1 ");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isTwoD_4 = attr_11.isTwoD();
                        if (_isTwoD_4) {
                          _builder.append("////integer, parameter :: ");
                          String _name_154 = attr_11.getName();
                          _builder.append(_name_154, "");
                          _builder.append("Rank = 2 ");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _isThreeD_3 = attr_11.isThreeD();
                          if (_isThreeD_3) {
                            _builder.append("////integer, parameter :: ");
                            String _name_155 = attr_11.getName();
                            _builder.append(_name_155, "");
                            _builder.append("Rank = 3 ");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _isFourD_3 = attr_11.isFourD();
                            if (_isFourD_3) {
                              _builder.append("////integer, parameter :: ");
                              String _name_156 = attr_11.getName();
                              _builder.append(_name_156, "");
                              _builder.append("Rank = 4 ");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                    {
                      boolean _isStringType_11 = attr_11.isStringType();
                      if (_isStringType_11) {
                        _builder.append("////integer :: ");
                        String _name_157 = attr_11.getName();
                        _builder.append(_name_157, "");
                        _builder.append("Dim(2,");
                        String _name_158 = attr_11.getName();
                        _builder.append(_name_158, "");
                        _builder.append("Rank+1)");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("////integer :: ");
                        String _name_159 = attr_11.getName();
                        _builder.append(_name_159, "");
                        _builder.append("Dim(2,");
                        String _name_160 = attr_11.getName();
                        _builder.append(_name_160, "");
                        _builder.append("Rank)");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    String _FType_9 = attr_11.FType();
                    boolean _equals_11 = Objects.equal(_FType_9, "character*256");
                    if (_equals_11) {
                      _builder.append("////integer :: ");
                      String _name_161 = attr_11.getName();
                      _builder.append(_name_161, "");
                      _builder.append("Dim(2)");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
                _builder.append("////! Deal with dimensions");
                _builder.newLine();
                {
                  boolean _isArray_13 = attr_11.isArray();
                  if (_isArray_13) {
                    _builder.append("////if (.not.allocated(opt%");
                    String _name_162 = attr_11.getName();
                    _builder.append(_name_162, "");
                    _builder.append(")) then");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////call sdmMessage(8,3,\'");
                    String _name_163 = table.getName();
                    _builder.append(_name_163, "");
                    _builder.append("Table\',\'opt%");
                    String _name_164 = attr_11.getName();
                    _builder.append(_name_164, "");
                    _builder.append(" not allocated.\')");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////error = .true.");
                    _builder.newLine();
                    _builder.append("//////return");
                    _builder.newLine();
                    _builder.append("////endif");
                    _builder.newLine();
                    {
                      boolean _isStringType_12 = attr_11.isStringType();
                      if (_isStringType_12) {
                        _builder.append("////");
                        String _name_165 = attr_11.getName();
                        _builder.append(_name_165, "");
                        _builder.append("Dim(:,1) = len(opt%");
                        String _name_166 = attr_11.getName();
                        _builder.append(_name_166, "");
                        _builder.append(")");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////do i=1, ");
                        String _name_167 = attr_11.getName();
                        _builder.append(_name_167, "");
                        _builder.append("Rank");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////");
                        String _name_168 = attr_11.getName();
                        _builder.append(_name_168, "");
                        _builder.append("Dim(:,i+1) = size(opt%");
                        String _name_169 = attr_11.getName();
                        _builder.append(_name_169, "");
                        _builder.append(",i)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////enddo");
                        _builder.newLine();
                      } else {
                        _builder.append("////do i=1, ");
                        String _name_170 = attr_11.getName();
                        _builder.append(_name_170, "");
                        _builder.append("Rank");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////");
                        String _name_171 = attr_11.getName();
                        _builder.append(_name_171, "");
                        _builder.append("Dim(:,i) = size(opt%");
                        String _name_172 = attr_11.getName();
                        _builder.append(_name_172, "");
                        _builder.append(",i)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////enddo");
                        _builder.newLine();
                      }
                    }
                  } else {
                    String _FType_10 = attr_11.FType();
                    boolean _equals_12 = Objects.equal(_FType_10, "character*256");
                    if (_equals_12) {
                      _builder.append("////");
                      String _name_173 = attr_11.getName();
                      _builder.append(_name_173, "");
                      _builder.append("Dim = len(opt%");
                      String _name_174 = attr_11.getName();
                      _builder.append(_name_174, "");
                      _builder.append(")");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
                _builder.append("////ireturn = sdm_get");
                String _name_175 = table.getName();
                _builder.append(_name_175, "");
                String _UpperCaseName_7 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_7, "");
                _builder.append("(");
                String _KeyFType_1 = table.KeyFType();
                _builder.append(_KeyFType_1, "");
                _builder.append(", opt%");
                String _FTypeAttributeDimList_1 = attr_11.FTypeAttributeDimList();
                _builder.append(_FTypeAttributeDimList_1, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append("////if (ireturn.lt.0) then");
                _builder.newLine();
                _builder.append("//////call sdmMessageI(8,3,\'");
                String _name_176 = table.getName();
                _builder.append(_name_176, "");
                _builder.append("Table\',\'Error in sdm_get");
                String _name_177 = table.getName();
                _builder.append(_name_177, "");
                String _UpperCaseName_8 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_8, "");
                _builder.append("\', ireturn)");
                _builder.newLineIfNotEmpty();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("////else");
                _builder.newLine();
                _builder.append("//////present = ireturn.eq.0");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                _builder.append("//end subroutine get");
                String _name_178 = table.getName();
                _builder.append(_name_178, "");
                String _UpperCaseName_9 = attr_11.UpperCaseName();
                _builder.append(_UpperCaseName_9, "");
                _builder.newLineIfNotEmpty();
                _builder.append("//!");
                _builder.newLine();
              }
            }
          }
        }
        _builder.newLine();
        _builder.newLine();
        {
          boolean _or_5 = false;
          String _name_179 = table.getName();
          boolean _equals_13 = Objects.equal(_name_179, "TotalPower");
          if (_equals_13) {
            _or_5 = true;
          } else {
            String _name_180 = table.getName();
            boolean _equals_14 = Objects.equal(_name_180, "Pointing");
            _or_5 = _equals_14;
          }
          if (_or_5) {
            _builder.append("//! ---------------------------------------------------------------------------");
            _builder.newLine();
            _builder.append("//! Columns methods for Table ");
            String _name_181 = table.getName();
            _builder.append(_name_181, "");
            _builder.newLineIfNotEmpty();
            {
              List<ASDMAttribute> _requiredAttributes_11 = table.getRequiredAttributes();
              for(final ASDMAttribute attr_12 : _requiredAttributes_11) {
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//! ---------------------------------------------------------------------------");
                _builder.newLine();
                _builder.append("//!");
                _builder.newLine();
                _builder.append("//subroutine get");
                String _name_182 = table.getName();
                _builder.append(_name_182, "");
                String _UpperCaseName_10 = attr_12.UpperCaseName();
                _builder.append(_UpperCaseName_10, "");
                _builder.append("Column(table, error)");
                _builder.newLineIfNotEmpty();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////use sdm_");
                String _name_183 = table.getName();
                _builder.append(_name_183, "");
                _builder.newLineIfNotEmpty();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////type(");
                String _name_184 = table.getName();
                _builder.append(_name_184, "");
                _builder.append(") :: table");
                _builder.newLineIfNotEmpty();
                _builder.append("////logical :: error");
                _builder.newLine();
                _builder.append("////!");
                _builder.newLine();
                _builder.append("////integer :: ireturn, sdm_get");
                String _name_185 = table.getName();
                _builder.append(_name_185, "");
                String _UpperCaseName_11 = attr_12.UpperCaseName();
                _builder.append(_UpperCaseName_11, "");
                _builder.append("Column, tableSize, i, j, ier");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isArray_14 = attr_12.isArray();
                  if (_isArray_14) {
                    _builder.append("////integer, allocatable :: ");
                    String _name_186 = attr_12.getName();
                    _builder.append(_name_186, "");
                    _builder.append("Dim(:,:,:)");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _or_6 = false;
                      boolean _isOneD_6 = attr_12.isOneD();
                      if (_isOneD_6) {
                        _or_6 = true;
                      } else {
                        boolean _isExtrinsic_5 = attr_12.isExtrinsic();
                        _or_6 = _isExtrinsic_5;
                      }
                      if (_or_6) {
                        _builder.append("////integer, parameter :: ");
                        String _name_187 = attr_12.getName();
                        _builder.append(_name_187, "");
                        _builder.append("Rank = 1 ");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isTwoD_5 = attr_12.isTwoD();
                        if (_isTwoD_5) {
                          _builder.append("////integer, parameter :: ");
                          String _name_188 = attr_12.getName();
                          _builder.append(_name_188, "");
                          _builder.append("Rank = 2 ");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _isThreeD_4 = attr_12.isThreeD();
                          if (_isThreeD_4) {
                            _builder.append("////integer, parameter :: ");
                            String _name_189 = attr_12.getName();
                            _builder.append(_name_189, "");
                            _builder.append("Rank = 3 ");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _isFourD_4 = attr_12.isFourD();
                            if (_isFourD_4) {
                              _builder.append("////integer, parameter :: ");
                              String _name_190 = attr_12.getName();
                              _builder.append(_name_190, "");
                              _builder.append("Rank = 4 ");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  } else {
                    {
                      String _FType_11 = attr_12.FType();
                      boolean _equals_15 = Objects.equal(_FType_11, "character*256");
                      if (_equals_15) {
                        _builder.append("////integer, allocatable :: ");
                        String _name_191 = attr_12.getName();
                        _builder.append(_name_191, "");
                        _builder.append("Dim(:,:,:)");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("////integer, parameter :: ");
                    String _name_192 = attr_12.getName();
                    _builder.append(_name_192, "");
                    _builder.append("Rank = 0 ");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("////if (.not.allocated(table%");
                String _name_193 = attr_12.getName();
                _builder.append(_name_193, "");
                _builder.append(")) then");
                _builder.newLineIfNotEmpty();
                _builder.append("//////call sdmMessage(8,3,\'");
                String _name_194 = table.getName();
                _builder.append(_name_194, "");
                _builder.append("Table\',\'table%");
                String _name_195 = attr_12.getName();
                _builder.append(_name_195, "");
                _builder.append(" not allocated.\')");
                _builder.newLineIfNotEmpty();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("//////return");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                _builder.append("////tableSize = size(table%");
                String _name_196 = attr_12.getName();
                _builder.append(_name_196, "");
                _builder.append(",");
                String _name_197 = attr_12.getName();
                _builder.append(_name_197, "");
                _builder.append("Rank+1)");
                _builder.newLineIfNotEmpty();
                _builder.append("////! Deal with dimensions");
                _builder.newLine();
                {
                  boolean _isArray_15 = attr_12.isArray();
                  if (_isArray_15) {
                    _builder.append("////allocate(");
                    String _name_198 = attr_12.getName();
                    _builder.append(_name_198, "");
                    _builder.append("Dim(2,");
                    String _name_199 = attr_12.getName();
                    _builder.append(_name_199, "");
                    _builder.append("Rank,tableSize),stat=ier)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("////if (ier.ne.0) then");
                    _builder.newLine();
                    _builder.append("//////call sdmMessage(8,3,\'");
                    String _name_200 = table.getName();
                    _builder.append(_name_200, "");
                    _builder.append("Table\',\'Allocate error for ");
                    String _name_201 = attr_12.getName();
                    _builder.append(_name_201, "");
                    _builder.append("Dim\')");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//////error = .true.");
                    _builder.newLine();
                    _builder.append("//////return");
                    _builder.newLine();
                    _builder.append("////endif");
                    _builder.newLine();
                    _builder.append("////do j=1, tableSize");
                    _builder.newLine();
                    {
                      boolean _isStringType_13 = attr_12.isStringType();
                      if (_isStringType_13) {
                        _builder.append("//////");
                        String _name_202 = attr_12.getName();
                        _builder.append(_name_202, "");
                        _builder.append("Dim(:,1,j) = len(table%");
                        String _name_203 = attr_12.getName();
                        _builder.append(_name_203, "");
                        _builder.append("(1,j))");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////do i=1, ");
                        String _name_204 = attr_12.getName();
                        _builder.append(_name_204, "");
                        _builder.append("Rank");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////////");
                        String _name_205 = attr_12.getName();
                        _builder.append(_name_205, "");
                        _builder.append("Dim(:,i+1,j) = size(table%");
                        String _name_206 = attr_12.getName();
                        _builder.append(_name_206, "");
                        _builder.append(",i)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////enddo");
                        _builder.newLine();
                      } else {
                        _builder.append("//////do i=1, ");
                        String _name_207 = attr_12.getName();
                        _builder.append(_name_207, "");
                        _builder.append("Rank");
                        _builder.newLineIfNotEmpty();
                        _builder.append("////////");
                        String _name_208 = attr_12.getName();
                        _builder.append(_name_208, "");
                        _builder.append("Dim(:,i,j) = size(table%");
                        String _name_209 = attr_12.getName();
                        _builder.append(_name_209, "");
                        _builder.append(",i)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//////enddo");
                        _builder.newLine();
                      }
                    }
                    _builder.append("////enddo");
                    _builder.newLine();
                  } else {
                    String _FType_12 = attr_12.FType();
                    boolean _equals_16 = Objects.equal(_FType_12, "character*256");
                    if (_equals_16) {
                      _builder.append("////allocate(");
                      String _name_210 = attr_12.getName();
                      _builder.append(_name_210, "");
                      _builder.append("Dim(2,1,tableSize),stat=ier)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("////if (ier.ne.0) then");
                      _builder.newLine();
                      _builder.append("//////call sdmMessage(8,3,\'");
                      String _name_211 = table.getName();
                      _builder.append(_name_211, "");
                      _builder.append("Table\',\'Allocate error\')");
                      _builder.newLineIfNotEmpty();
                      _builder.append("//////error = .true.");
                      _builder.newLine();
                      _builder.append("//////return");
                      _builder.newLine();
                      _builder.append("////endif");
                      _builder.newLine();
                      _builder.append("////do j=1, tableSize");
                      _builder.newLine();
                      _builder.append("//////");
                      String _name_212 = attr_12.getName();
                      _builder.append(_name_212, "");
                      _builder.append("Dim(:,1,j) = len(table%");
                      String _name_213 = attr_12.getName();
                      _builder.append(_name_213, "");
                      _builder.append("(j))");
                      _builder.newLineIfNotEmpty();
                      _builder.append("////enddo");
                      _builder.newLine();
                    }
                  }
                }
                _builder.append("////ireturn = sdm_get");
                String _name_214 = table.getName();
                _builder.append(_name_214, "");
                String _UpperCaseName_12 = attr_12.UpperCaseName();
                _builder.append(_UpperCaseName_12, "");
                _builder.append("Column(table%");
                String _FTypeAttributeDimList_2 = attr_12.FTypeAttributeDimList();
                _builder.append(_FTypeAttributeDimList_2, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append("////if (ireturn.lt.0) then");
                _builder.newLine();
                _builder.append("//////call sdmMessageI(8,3,\'");
                String _name_215 = table.getName();
                _builder.append(_name_215, "");
                _builder.append("Table\',\'Error in sdm_get");
                String _name_216 = table.getName();
                _builder.append(_name_216, "");
                String _UpperCaseName_13 = attr_12.UpperCaseName();
                _builder.append(_UpperCaseName_13, "");
                _builder.append("\', ireturn)");
                _builder.newLineIfNotEmpty();
                _builder.append("//////error = .true.");
                _builder.newLine();
                _builder.append("////endif");
                _builder.newLine();
                _builder.append("//end subroutine get");
                String _name_217 = table.getName();
                _builder.append(_name_217, "");
                String _UpperCaseName_14 = attr_12.UpperCaseName();
                _builder.append(_UpperCaseName_14, "");
                _builder.append("Column");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
