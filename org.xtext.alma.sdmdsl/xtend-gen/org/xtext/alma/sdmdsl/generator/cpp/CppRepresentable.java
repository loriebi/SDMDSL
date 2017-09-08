package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class CppRepresentable {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("include/Representable.h");
    CharSequence _generateRepresentable = this.generateRepresentable();
    sdmFsa.generateFile(_generateRepresentable);
  }
  
  public CharSequence generateRepresentable() {
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
    _builder.append("* Warning!");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  -------------------------------------------------------------------- ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* | This is generated code!  Do not modify this file.                  |");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* | If you do, all changes will be lost when the file is re-generated. |");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  --------------------------------------------------------------------");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File Representable.h");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#ifndef _Representable_H");
    _builder.newLine();
    _builder.append("#define _Representable_H");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef __cplusplus");
    _builder.newLine();
    _builder.append("#error This is a C++ include file and cannot be used from plain C");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#include <Entity.h>");
    _builder.newLine();
    _builder.append("#include <ConversionException.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using std::string;");
    _builder.newLine();
    _builder.append("using asdm::Entity;");
    _builder.newLine();
    _builder.append("using asdm::ConversionException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The Representable interface is implemented by all tables");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* and by the container.  It represents methods that are ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* required to convert between the internal and the various ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* external representations of tables and containers.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("class Representable {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("friend class ");
    String _name = this.container.getName();
    _builder.append(_name, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual ~Representable() {}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual string toXML()   = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual void fromXML(string& xml) = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual string getName() const = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual unsigned int size() const = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("protected:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual Entity getEntity() const = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual void setEntity(Entity e) = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bool presentInMemory;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bool loadInProgress;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("uint32_t declaredSize;");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} // End namespace asdm");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif /* _Representable_CLASS */");
    _builder.newLine();
    return _builder;
  }
}