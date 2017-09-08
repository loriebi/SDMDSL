package org.xtext.alma.sdmdsl.generator.html;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class ASDMEntitiesDocBook {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("doc/ASDMEntities.DocBook.xml");
    CharSequence _generateASDMEntitiesDocBook = this.generateASDMEntitiesDocBook();
    sdmFsa.generateFile(_generateASDMEntitiesDocBook);
  }
  
  public CharSequence generateASDMEntitiesDocBook() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!DOCTYPE book PUBLIC \"-//OASIS//DTD DocBook XML V4.0//EN\"  \"http://www.oasis-open.org/docbook/xml/4.0/docbookx.dtd\">");
    _builder.newLine();
    _builder.append("<chapter>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>Catalog of the ASDM Entities</title>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<subtitle>Revision ");
    String _revision = AlmaTableContainer.getRevision();
    _builder.append(_revision, "    ");
    _builder.append(", branch ");
    String _branch = AlmaTableContainer.getBranch();
    _builder.append(_branch, "    ");
    _builder.append("</subtitle>");
    _builder.newLineIfNotEmpty();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _output = this.output(table);
        _builder.append(_output, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</chapter>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence output(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?hard-pagebreak?>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<section>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>");
    String _name = table.getName();
    _builder.append(_name, "\t\t");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<para>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Key:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<informaltable>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<tgroup cols=\"4\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"1\" colname=\"col1\" colwidth=\"1.2*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"2\" colname=\"col2\" colwidth=\"1.0*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"3\" colname=\"col3\" colwidth=\"1.5*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"4\" colname=\"col4\" colwidth=\"1.75*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<row>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>Name</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>Java type</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>C++ type</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>Array\'s shape</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</row>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<tbody>");
    _builder.newLine();
    {
      List<ASDMAttribute> _keyAttributes = table.getKeyAttributes();
      for(final ASDMAttribute attr : _keyAttributes) {
        _builder.append("\t\t\t\t\t");
        _builder.append("<row>");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry><command>");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "\t\t\t\t\t\t");
        _builder.append("</command></entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry>");
        String _XMLJavaType = attr.XMLJavaType();
        _builder.append(_XMLJavaType, "\t\t\t\t\t\t");
        _builder.append("</entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry>");
        String _XMLCppType = attr.XMLCppType();
        _builder.append(_XMLCppType, "\t\t\t\t\t\t");
        _builder.append("</entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry>");
        {
          boolean _isArray = attr.isArray();
          if (_isArray) {
            String _XMLCppTypeDescription = attr.XMLCppTypeDescription();
            _builder.append(_XMLCppTypeDescription, "\t\t\t\t\t\t");
          } else {
            _builder.append("&nsbp;");
          }
        }
        _builder.append("</entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("</row>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</tgroup>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</informaltable>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</para>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<para>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Value required:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<informaltable>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<tgroup cols=\"4\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"1\" colname=\"col1\" colwidth=\"1.2*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"2\" colname=\"col2\" colwidth=\"1.00*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"3\" colname=\"col3\" colwidth=\"1.5*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<colspec colnum=\"4\" colname=\"col4\" colwidth=\"1.75*\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<row>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>Name</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>Java type</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>C++ type</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<entry>Array\'s shape</entry>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</row>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<tbody>");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredValueAttributes = table.getRequiredValueAttributes();
      for(final ASDMAttribute attr_1 : _requiredValueAttributes) {
        _builder.append("\t\t\t\t\t");
        _builder.append("<row>");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry><command>");
        String _name_2 = attr_1.getName();
        _builder.append(_name_2, "\t\t\t\t\t\t");
        _builder.append("</command></entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry>");
        String _XMLJavaType_1 = attr_1.XMLJavaType();
        _builder.append(_XMLJavaType_1, "\t\t\t\t\t\t");
        _builder.append("</entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry>");
        String _XMLCppType_1 = attr_1.XMLCppType();
        _builder.append(_XMLCppType_1, "\t\t\t\t\t\t");
        _builder.append("</entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<entry>");
        {
          boolean _isArray_1 = attr_1.isArray();
          if (_isArray_1) {
            String _XMLCppTypeDescription_1 = attr_1.XMLCppTypeDescription();
            _builder.append(_XMLCppTypeDescription_1, "\t\t\t\t\t\t");
          } else {
            _builder.append("&nsbp;");
          }
        }
        _builder.append("</entry>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("</row>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</tgroup>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</informaltable>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</para>");
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
      int _size = _optionalValueAttributes.size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        _builder.append("\t\t\t");
        _builder.append("<para>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("Value optional:");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<informaltable>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<tgroup cols=\"4\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<colspec colnum=\"1\" colname=\"col1\" colwidth=\"1.2*\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<colspec colnum=\"2\" colname=\"col2\" colwidth=\"1.00*\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<colspec colnum=\"3\" colname=\"col3\" colwidth=\"1.5*\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<colspec colnum=\"4\" colname=\"col4\" colwidth=\"1.75*\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("<thead>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t\t");
        _builder.append("<row>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t\t\t");
        _builder.append("<entry>Name</entry>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t\t\t");
        _builder.append("<entry>Java type</entry>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t\t\t");
        _builder.append("<entry>C++ type</entry>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t\t\t");
        _builder.append("<entry>Array\'s shape</entry>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t\t");
        _builder.append("</row>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("</thead>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("<tbody>");
        _builder.newLine();
        {
          List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
          for(final ASDMAttribute attr_2 : _optionalValueAttributes_1) {
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("<row>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<entry><command>");
            String _name_3 = attr_2.getName();
            _builder.append(_name_3, "\t\t\t\t\t\t");
            _builder.append("</command></entry>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<entry>");
            String _XMLJavaType_2 = attr_2.XMLJavaType();
            _builder.append(_XMLJavaType_2, "\t\t\t\t\t\t");
            _builder.append("</entry>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<entry>");
            String _XMLCppType_2 = attr_2.XMLCppType();
            _builder.append(_XMLCppType_2, "\t\t\t\t\t\t");
            _builder.append("</entry>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<entry>");
            {
              boolean _isArray_2 = attr_2.isArray();
              if (_isArray_2) {
                String _XMLCppTypeDescription_2 = attr_2.XMLCppTypeDescription();
                _builder.append(_XMLCppTypeDescription_2, "\t\t\t\t\t\t");
              } else {
                _builder.append("&nsbp;");
              }
            }
            _builder.append("</entry>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("</row>");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("</tbody>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("</tgroup>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</informaltable>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</para>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</section>");
    _builder.newLine();
    return _builder;
  }
}
