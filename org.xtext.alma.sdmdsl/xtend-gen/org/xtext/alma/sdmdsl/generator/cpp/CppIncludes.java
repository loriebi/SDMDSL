package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class CppIncludes {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("include/ASDMEntities.h");
    CharSequence _generateASDMEntities = this.generateASDMEntities();
    sdmFsa.generateFile(_generateASDMEntities);
    sdmFsa.setFile("include/ASDMExceptions.h");
    CharSequence _generateASDMExceptions = this.generateASDMExceptions();
    sdmFsa.generateFile(_generateASDMExceptions);
    sdmFsa.setFile("include/ASDMTypes.h");
    CharSequence _generateASDMTypes = this.generateASDMTypes();
    sdmFsa.generateFile(_generateASDMTypes);
    sdmFsa.setFile("include/ASDMAll.h");
    CharSequence _generateASDMAll = this.generateASDMAll();
    sdmFsa.generateFile(_generateASDMAll);
  }
  
  public CharSequence generateASDMEntities() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MA 02111-1307  USA");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File ASDMEntities.h");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("#ifndef ASDMEntities_h");
    _builder.newLine();
    _builder.append("#define ASDMEntities_h");
    _builder.newLine();
    _builder.append("#include <ASDM.h>");
    _builder.newLine();
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        _builder.append("#include <");
        String _name = table.getName();
        _builder.append(_name, "");
        _builder.append("Row.h>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_1 = this.container.sortedAlmaTable();
      for(final AlmaTable table_1 : _sortedAlmaTable_1) {
        _builder.append("#include <");
        String _name_1 = table_1.getName();
        _builder.append(_name_1, "");
        _builder.append("Table.h>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("#endif /* ASDMEntities_h */");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateASDMExceptions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MA 02111-1307  USA");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File ASDMExceptions.h");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("#ifndef ASDMExceptions_h");
    _builder.newLine();
    _builder.append("#define ASDMExceptions_h");
    _builder.newLine();
    _builder.append("#include <ConversionException.h>");
    _builder.newLine();
    _builder.append("#include <DuplicateKey.h>");
    _builder.newLine();
    _builder.append("#include <IllegalAccessException.h>");
    _builder.newLine();
    _builder.append("#include <InvalidArgumentException.h>");
    _builder.newLine();
    _builder.append("#include <InvalidDataException.h>");
    _builder.newLine();
    _builder.append("#include <NoSuchRow.h>");
    _builder.newLine();
    _builder.append("#include <NumberFormatException.h>");
    _builder.newLine();
    _builder.append("#include <OutOfBoundsException.h>");
    _builder.newLine();
    _builder.append("#endif /* ASDMExceptions_h */");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateASDMTypes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MA 02111-1307  USA");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File ASDMTypes.h");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef ASDMTypes_h");
    _builder.newLine();
    _builder.append("#define ASDMTypes_h");
    _builder.newLine();
    _builder.append("#include <Angle.h>");
    _builder.newLine();
    _builder.append("#include <AngularRate.h>");
    _builder.newLine();
    _builder.append("#include <ArrayTime.h>");
    _builder.newLine();
    _builder.append("#include <ArrayTimeInterval.h>");
    _builder.newLine();
    _builder.append("#include <BooleanWrapper.h>");
    _builder.newLine();
    _builder.append("#include <ByteWrapper.h>");
    _builder.newLine();
    _builder.append("#include <CharacterWrapper.h>");
    _builder.newLine();
    _builder.append("#include <ComplexWrapper.h>");
    _builder.newLine();
    _builder.append("#include <DoubleWrapper.h>");
    _builder.newLine();
    _builder.append("#include <Entity.h>");
    _builder.newLine();
    _builder.append("#include <EntityId.h>");
    _builder.newLine();
    _builder.append("#include <EntityRef.h>");
    _builder.newLine();
    _builder.append("#include <FloatWrapper.h>");
    _builder.newLine();
    _builder.append("#include <Flux.h>");
    _builder.newLine();
    _builder.append("#include <Frequency.h>");
    _builder.newLine();
    _builder.append("#include <Humidity.h>");
    _builder.newLine();
    _builder.append("#include <IntegerWrapper.h>");
    _builder.newLine();
    _builder.append("#include <Interval.h>");
    _builder.newLine();
    _builder.append("#include <Length.h>");
    _builder.newLine();
    _builder.append("#include <LongWrapper.h>");
    _builder.newLine();
    _builder.append("#include <PartId.h>");
    _builder.newLine();
    _builder.append("#include <ShortWrapper.h>");
    _builder.newLine();
    _builder.append("#include <Speed.h>");
    _builder.newLine();
    _builder.append("#include <Tag.h>");
    _builder.newLine();
    _builder.append("#include <Temperature.h>");
    _builder.newLine();
    _builder.append("#include <UTCCorrection.h>");
    _builder.newLine();
    _builder.append("#endif /* ASDMTypes_h */");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateASDMAll() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MA 02111-1307  USA");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File ASDMAll.h");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("#ifndef ASDMAll_h");
    _builder.newLine();
    _builder.append("#define ASDMAll_h");
    _builder.newLine();
    _builder.append("#include <ASDMTypes.h>");
    _builder.newLine();
    _builder.append("#include <ASDMExceptions.h>");
    _builder.newLine();
    _builder.append("#include <ASDMEntities.h>");
    _builder.newLine();
    _builder.append("#endif /* ASDMAll_h */");
    _builder.newLine();
    return _builder;
  }
}
