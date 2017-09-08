package org.xtext.alma.sdmdsl.generator.html;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTable;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class ASDMEntities {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("doc/ASDMEntities.html");
    CharSequence _generateASDMEntities = this.generateASDMEntities();
    sdmFsa.generateFile(_generateASDMEntities);
    sdmFsa.setFile("doc/ASDMEntities_Menu.html");
    CharSequence _generateASDMEntitiesMenu = this.generateASDMEntitiesMenu();
    sdmFsa.generateFile(_generateASDMEntitiesMenu);
    sdmFsa.setFile("doc/ASDMEntities_Content.html");
    CharSequence _generateASDMEntitiesContent = this.generateASDMEntitiesContent();
    sdmFsa.generateFile(_generateASDMEntitiesContent);
  }
  
  public CharSequence generateASDMEntities() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<HTML>");
    _builder.newLine();
    _builder.append("<FRAMESET COLS=\"250,*\" NOBORDER>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<FRAME SRC=\"ASDMEntities_Menu.html\"    NAME=\"Menu\"    NORESIZE NOBORDER>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<FRAME SRC=\"ASDMEntities_Content.html\" NAME=\"Content\" NORESIZE NOBORDER>\t");
    _builder.newLine();
    _builder.append("</FRAMESET>");
    _builder.newLine();
    _builder.append("</HTML>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateASDMEntitiesMenu() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<HTML>");
    _builder.newLine();
    _builder.append("<BODY>");
    _builder.newLine();
    _builder.append("<H2>ASDM Entities</H2>");
    _builder.newLine();
    _builder.append("<H2>Static entities (not depending on time)</H2>");
    _builder.newLine();
    _builder.append("<H3>Static entities with no identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _staticNoIdList = this.staticNoIdList(table);
        _builder.append(_staticNoIdList, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<H3>Static entities with identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_1 = this.container.sortedAlmaTable();
      for(final AlmaTable table_1 : _sortedAlmaTable_1) {
        CharSequence _staticWithIdList = this.staticWithIdList(table_1);
        _builder.append(_staticWithIdList, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<H2>Temporal entities</H2>");
    _builder.newLine();
    _builder.append("<H3>Temporal entities with no identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_2 = this.container.sortedAlmaTable();
      for(final AlmaTable table_2 : _sortedAlmaTable_2) {
        CharSequence _temporalNoIdList = this.temporalNoIdList(table_2);
        _builder.append(_temporalNoIdList, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<H3>Temporal entities with identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_3 = this.container.sortedAlmaTable();
      for(final AlmaTable table_3 : _sortedAlmaTable_3) {
        CharSequence _temporalWithIdList = this.temporalWithIdList(table_3);
        _builder.append(_temporalWithIdList, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</BODY>");
    _builder.newLine();
    _builder.append("</HTML>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateASDMEntitiesContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<HTML>");
    _builder.newLine();
    _builder.append("<BODY>");
    _builder.newLine();
    _builder.append("<H1>ASDM Entities</H1>");
    _builder.newLine();
    _builder.append("<H2>Static entities (not depending on time)</H2>");
    _builder.newLine();
    _builder.append("<H3>Static entities with no identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _staticNoId = this.staticNoId(table);
        _builder.append(_staticNoId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<H3>Static entities with identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_1 = this.container.sortedAlmaTable();
      for(final AlmaTable table_1 : _sortedAlmaTable_1) {
        CharSequence _staticWithId = this.staticWithId(table_1);
        _builder.append(_staticWithId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<H2>Temporal entities</H2>");
    _builder.newLine();
    _builder.append("<H3>Temporal entities with no identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_2 = this.container.sortedAlmaTable();
      for(final AlmaTable table_2 : _sortedAlmaTable_2) {
        CharSequence _temporalNoId = this.temporalNoId(table_2);
        _builder.append(_temporalNoId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<H3>Temporal entities with identifier</H3>");
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable_3 = this.container.sortedAlmaTable();
      for(final AlmaTable table_3 : _sortedAlmaTable_3) {
        CharSequence _temporalWithId = this.temporalWithId(table_3);
        _builder.append(_temporalWithId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</BODY>");
    _builder.newLine();
    _builder.append("</HTML>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence staticNoIdList(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      boolean _not = (!_isTemporal);
      if (!_not) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        _and = _NoAutoIncrementableAttribute;
      }
      if (_and) {
        _builder.append("<A HREF=\"ASDMEntities_Content.html#");
        String _name = table.getName();
        _builder.append(_name, "");
        _builder.append("\" TARGET=\"Content\">");
        String _name_1 = table.getName();
        _builder.append(_name_1, "");
        _builder.append("</A><BR/>\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence staticNoId(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      boolean _not = (!_isTemporal);
      if (!_not) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        _and = _NoAutoIncrementableAttribute;
      }
      if (_and) {
        CharSequence _WithNoId = this.WithNoId(table);
        _builder.append(_WithNoId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence staticWithIdList(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      boolean _not = (!_isTemporal);
      if (!_not) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        boolean _not_1 = (!_NoAutoIncrementableAttribute);
        _and = _not_1;
      }
      if (_and) {
        _builder.append("<A HREF=\"ASDMEntities_Content.html#");
        String _name = table.getName();
        _builder.append(_name, "");
        _builder.append("\" TARGET=\"Content\">");
        String _name_1 = table.getName();
        _builder.append(_name_1, "");
        _builder.append("</A><BR/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence staticWithId(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      boolean _not = (!_isTemporal);
      if (!_not) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        boolean _not_1 = (!_NoAutoIncrementableAttribute);
        _and = _not_1;
      }
      if (_and) {
        CharSequence _WithId = this.WithId(table);
        _builder.append(_WithId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence temporalNoIdList(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      if (!_isTemporal) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        _and = _NoAutoIncrementableAttribute;
      }
      if (_and) {
        _builder.append("<A HREF=\"ASDMEntities_Content.html#");
        String _name = table.getName();
        _builder.append(_name, "");
        _builder.append("\" TARGET=\"Content\">");
        String _name_1 = table.getName();
        _builder.append(_name_1, "");
        _builder.append("</A><BR/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence temporalNoId(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      if (!_isTemporal) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        _and = _NoAutoIncrementableAttribute;
      }
      if (_and) {
        CharSequence _WithNoId = this.WithNoId(table);
        _builder.append(_WithNoId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence temporalWithIdList(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      if (!_isTemporal) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        boolean _not = (!_NoAutoIncrementableAttribute);
        _and = _not;
      }
      if (_and) {
        _builder.append("<A HREF=\"ASDMEntities_Content.html#");
        String _name = table.getName();
        _builder.append(_name, "");
        _builder.append("\" TARGET=\"Content\">");
        String _name_1 = table.getName();
        _builder.append(_name_1, "");
        _builder.append("</A><BR/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence temporalWithId(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _isTemporal = table.isTemporal();
      if (!_isTemporal) {
        _and = false;
      } else {
        boolean _NoAutoIncrementableAttribute = table.NoAutoIncrementableAttribute();
        boolean _not = (!_NoAutoIncrementableAttribute);
        _and = _not;
      }
      if (_and) {
        CharSequence _WithId = this.WithId(table);
        _builder.append(_WithId, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence WithNoId(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<HR/>");
    _builder.newLine();
    _builder.append("<H4><A NAME=\"");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    String _name_1 = table.getName();
    _builder.append(_name_1, "");
    _builder.append("</A></H4>");
    _builder.newLineIfNotEmpty();
    _builder.append("<B>Key :</B><BR/>");
    _builder.newLine();
    _builder.append("<UL>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<LI>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<TABLE BORDER=\"1\" WIDTH=\"750\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<TR>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<TH WIDTH=\"250\"> Name </TH> <TH WIDTH=\"250\"> Java type </TH><TH WIDTH=\"250\"> C++ type </TH>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</TR>");
    _builder.newLine();
    {
      List<ASDMAttribute> _keyAttributes = table.getKeyAttributes();
      for(final ASDMAttribute attr : _keyAttributes) {
        _builder.append("<TR>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<TD><CODE>");
        String _name_2 = attr.getName();
        _builder.append(_name_2, "\t");
        _builder.append("</CODE></TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<TD>");
        String _JavaType = attr.JavaType();
        _builder.append(_JavaType, "\t");
        _builder.append("</TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<TD>");
        String _CppType = attr.CppType();
        _builder.append(_CppType, "\t");
        _builder.append("</TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("</TR>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("</TABLE>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<BR/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</LI>");
    _builder.newLine();
    _builder.append("</UL>\t");
    _builder.newLine();
    CharSequence _ValuePart = this.ValuePart(table);
    _builder.append(_ValuePart, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence WithId(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<HR/>");
    _builder.newLine();
    _builder.append("<H4><A NAME=\"");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    String _name_1 = table.getName();
    _builder.append(_name_1, "");
    _builder.append("</A></H4>");
    _builder.newLineIfNotEmpty();
    _builder.append("<B>Key :</B><BR/>");
    _builder.newLine();
    _builder.append("<UL>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<LI>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<TABLE BORDER=\"1\" WIDTH=\"750\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<TR>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<TH WIDTH=\"250\"> Name </TH> <TH WIDTH=\"250\"> Java type </TH><TH WIDTH=\"250\"> C++ type </TH>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</TR>");
    _builder.newLine();
    {
      List<ASDMAttribute> _keyAttributes = table.getKeyAttributes();
      for(final ASDMAttribute attr : _keyAttributes) {
        _builder.append("\t\t");
        _builder.append("<TR>");
        _builder.newLine();
        {
          String _name_2 = attr.getName();
          ASDMAttribute _TheAutoIncrementableAttribute = table.TheAutoIncrementableAttribute();
          String _name_3 = _TheAutoIncrementableAttribute.getName();
          boolean _equals = Objects.equal(_name_2, _name_3);
          if (_equals) {
            _builder.append("<TD><U><CODE>");
            String _name_4 = attr.getName();
            _builder.append(_name_4, "");
            _builder.append("</CODE></U></TD>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("<TD><CODE>");
            String _name_5 = attr.getName();
            _builder.append(_name_5, "");
            _builder.append("</CODE></TD>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("<TD>");
        String _JavaType = attr.JavaType();
        _builder.append(_JavaType, "\t\t\t");
        _builder.append("</TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("<TD>");
        String _CppType = attr.CppType();
        _builder.append(_CppType, "\t\t\t");
        _builder.append("</TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("</TR>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("</TABLE>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<BR/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</LI>");
    _builder.newLine();
    _builder.append("</UL>");
    _builder.newLine();
    CharSequence _ValuePart = this.ValuePart(table);
    _builder.append(_ValuePart, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence ValuePart(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<B>Value : </B><BR/>");
    _builder.newLine();
    _builder.append("<UL> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<LI><B>Required : </B><BR>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<TABLE BORDER=\"1\" WIDTH=\"750\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<TR>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<TH WIDTH=\"250\"> Name </TH> <TH WIDTH=\"250\"> Java type </TH><TH WIDTH=\"250\"> C++ type </TH>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</TR>");
    _builder.newLine();
    {
      List<ASDMAttribute> _requiredValueAttributes = table.getRequiredValueAttributes();
      for(final ASDMAttribute attr : _requiredValueAttributes) {
        _builder.append("<TR>");
        _builder.newLine();
        _builder.append("<TD><CODE>");
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append("</CODE></TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("<TD>");
        String _JavaType = attr.JavaType();
        _builder.append(_JavaType, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          boolean _isArray = attr.isArray();
          if (_isArray) {
            _builder.append(". Dimensions: ");
            String _JavaTypeDescription = attr.JavaTypeDescription();
            _builder.append(_JavaTypeDescription, "\t");
          }
        }
        _builder.append("</TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("<TD> ");
        String _CppType = attr.CppType();
        _builder.append(_CppType, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          boolean _isArray_1 = attr.isArray();
          if (_isArray_1) {
            _builder.append(". Dimensions: ");
            String _CppTypeDescription = attr.CppTypeDescription();
            _builder.append(_CppTypeDescription, "\t");
          }
        }
        _builder.append("</TD>");
        _builder.newLineIfNotEmpty();
        _builder.append("</TR>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</TABLE>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<BR/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</LI>");
    _builder.newLine();
    {
      List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
      int _size = _optionalValueAttributes.size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("<LI><B>Optional : </B><BR>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<TABLE BORDER WIDTH=\"750\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<TR>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<TH WIDTH=\"250\"> Name </TH> <TH WIDTH=\"250\"> Java type </TH><TH WIDTH=\"250\"> C++ type </TH>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</TR>");
        _builder.newLine();
        {
          List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
          for(final ASDMAttribute attr_1 : _optionalValueAttributes_1) {
            _builder.append("<TR>");
            _builder.newLine();
            _builder.append("<TD><CODE>");
            String _name_1 = attr_1.getName();
            _builder.append(_name_1, "");
            _builder.append("</CODE></TD>");
            _builder.newLineIfNotEmpty();
            _builder.append("<TD>");
            String _JavaType_1 = attr_1.JavaType();
            _builder.append(_JavaType_1, "");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            {
              boolean _isArray_2 = attr_1.isArray();
              if (_isArray_2) {
                _builder.append(". Dimensions: ");
                String _JavaTypeDescription_1 = attr_1.JavaTypeDescription();
                _builder.append(_JavaTypeDescription_1, "\t");
              }
            }
            _builder.append("</TD>");
            _builder.newLineIfNotEmpty();
            _builder.append("<TD> ");
            String _CppType_1 = attr_1.CppType();
            _builder.append(_CppType_1, "");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            {
              boolean _isArray_3 = attr_1.isArray();
              if (_isArray_3) {
                _builder.append(". Dimensions: ");
                String _CppTypeDescription_1 = attr_1.CppTypeDescription();
                _builder.append(_CppTypeDescription_1, "\t");
              }
            }
            _builder.append("</TD>");
            _builder.newLineIfNotEmpty();
            _builder.append("</TR>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("</TABLE>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<BR/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</LI>");
        _builder.newLine();
      }
    }
    _builder.append("</UL>");
    _builder.newLine();
    return _builder;
  }
}
