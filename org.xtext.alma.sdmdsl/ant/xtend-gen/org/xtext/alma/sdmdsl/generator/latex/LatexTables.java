package org.xtext.alma.sdmdsl.generator.latex;

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
public class LatexTables {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("/latex/tables.tex");
    CharSequence _generateLatexTables = this.generateLatexTables();
    sdmFsa.generateFile(_generateLatexTables);
  }
  
  public CharSequence generateLatexTables() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("% This is a Generated file ! do not edit !");
    _builder.newLine();
    _builder.append("\\subsection{Versioning information for the ASDM.}");
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\\item Version : ");
    String _version = this.container.getVersion();
    _builder.append(_version, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\item CVS revision : ");
    String _revision = AlmaTableContainer.getRevision();
    _builder.append(_revision, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\item CVS branch : ");
    String _branch = AlmaTableContainer.getBranch();
    _builder.append(_branch, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{itemize} ");
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      List<AlmaTable> _sortedAlmaTable = this.container.sortedAlmaTable();
      for(final AlmaTable table : _sortedAlmaTable) {
        CharSequence _output = this.output(table);
        _builder.append(_output, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence output(final AlmaTable table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = table.getName();
      boolean _notEquals = (!Objects.equal(_name, "Main"));
      if (_notEquals) {
        _builder.append(" \\newpage");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _and_2 = false;
      boolean _and_3 = false;
      String _name_1 = table.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, "FlagCmd"));
      if (!_notEquals_1) {
        _and_3 = false;
      } else {
        String _name_2 = table.getName();
        boolean _notEquals_2 = (!Objects.equal(_name_2, "History"));
        _and_3 = _notEquals_2;
      }
      if (!_and_3) {
        _and_2 = false;
      } else {
        String _name_3 = table.getName();
        boolean _notEquals_3 = (!Objects.equal(_name_3, "Observation"));
        _and_2 = _notEquals_3;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        String _name_4 = table.getName();
        boolean _notEquals_4 = (!Objects.equal(_name_4, "Seeing"));
        _and_1 = _notEquals_4;
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _name_5 = table.getName();
        boolean _notEquals_5 = (!Objects.equal(_name_5, "TotalPower"));
        _and = _notEquals_5;
      }
      if (_and) {
        _builder.append("\\subsection{");
        String _name_6 = table.getName();
        _builder.append(_name_6, "");
        _builder.append(" Table}");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          String _doc = table.getDoc();
          boolean _notEquals_6 = (!Objects.equal(_doc, ""));
          if (_notEquals_6) {
            _builder.append(" ");
            String _doc_1 = table.getDoc();
            _builder.append(_doc_1, "");
            _builder.append(" ");
          } else {
            _builder.append("{\\red missing documentation}");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\\begingroup");
        _builder.newLine();
        _builder.append("%");
        _builder.newLine();
        _builder.append("% define shortcuts for dimensions");
        _builder.newLine();
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredValueAttributes = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr : _requiredValueAttributes) {
            {
              boolean _isDimensionPar = attr.isDimensionPar();
              if (_isDimensionPar) {
                _builder.append("%\\newcommand{\\");
                String _name_7 = attr.getName();
                _builder.append(_name_7, "");
                _builder.append("}{");
                String _LatexSymbol = attr.LatexSymbol();
                _builder.append(_LatexSymbol, "");
                _builder.append("}");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _optionalValueAttributes = table.getOptionalValueAttributes();
          int _size = _optionalValueAttributes.size();
          boolean _notEquals_7 = (_size != 0);
          if (_notEquals_7) {
            {
              List<ASDMAttribute> _optionalValueAttributes_1 = table.getOptionalValueAttributes();
              for(final ASDMAttribute attr_1 : _optionalValueAttributes_1) {
                {
                  boolean _isDimensionPar_1 = attr_1.isDimensionPar();
                  if (_isDimensionPar_1) {
                    _builder.append("%\\newcommand{\\");
                    String _name_8 = attr_1.getName();
                    _builder.append(_name_8, "");
                    _builder.append("}{");
                    String _LatexSymbol_1 = attr_1.LatexSymbol();
                    _builder.append(_LatexSymbol_1, "");
                    _builder.append("}");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("\\par\\noindent\\begin{longtable} {|p{45mm}|p{45mm}|p{65mm}|}");
        _builder.newLine();
        _builder.append("\\hline \\multicolumn{3}{|c|}{\\textbf{");
        String _name_9 = table.getName();
        _builder.append(_name_9, "");
        _builder.append("}} \\\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\\hline\\hline");
        _builder.newLine();
        _builder.append("Name & Type (Shape) & Comment \\\\");
        _builder.newLine();
        _builder.append("\\hline \\endfirsthead");
        _builder.newLine();
        _builder.append("\\hline \\multicolumn{3}{|c|}{\\textbf{");
        String _name_10 = table.getName();
        _builder.append(_name_10, "");
        _builder.append("} -- continued from previous page} \\\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\\hline \\hline");
        _builder.newLine();
        _builder.append("Name & Type (Shape) & Comment \\\\");
        _builder.newLine();
        _builder.append("\\hline \\endhead");
        _builder.newLine();
        _builder.append("\\hline \\endfoot");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\\hline \\multicolumn{3}{|l|}{\\em Key} \\\\");
        _builder.newLine();
        _builder.append("\\hline ");
        _builder.newLine();
        _builder.newLine();
        {
          List<ASDMAttribute> _keyAttributes = table.getKeyAttributes();
          for(final ASDMAttribute attr_2 : _keyAttributes) {
            _builder.append("\\texttt{");
            String _LatexSymbol_2 = attr_2.LatexSymbol();
            _builder.append(_LatexSymbol_2, "");
            _builder.append("} & \\texttt{");
            String _LatexTypeDescription = attr_2.LatexTypeDescription();
            _builder.append(_LatexTypeDescription, "");
            _builder.append("} & ");
            String _LatexShortDoc = attr_2.LatexShortDoc();
            _builder.append(_LatexShortDoc, "");
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\\hline \\multicolumn{3}{|l|}{\\em Required Data} \\\\");
        _builder.newLine();
        _builder.append("\\hline");
        _builder.newLine();
        {
          List<ASDMAttribute> _requiredValueAttributes_1 = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_3 : _requiredValueAttributes_1) {
            _builder.append("\\texttt{");
            String _LatexSymbol_3 = attr_3.LatexSymbol();
            _builder.append(_LatexSymbol_3, "");
            _builder.append("} ");
            {
              boolean _isDimensionPar_2 = attr_3.isDimensionPar();
              if (_isDimensionPar_2) {
                _builder.append("(");
                String _LatexSymbol_4 = attr_3.LatexSymbol();
                _builder.append(_LatexSymbol_4, "");
                _builder.append(")");
              }
            }
            _builder.append("& \\texttt{");
            String _LatexTypeDescription_1 = attr_3.LatexTypeDescription();
            _builder.append(_LatexTypeDescription_1, "");
            _builder.append("} &");
            _builder.newLineIfNotEmpty();
            String _LatexShortDoc_1 = attr_3.LatexShortDoc();
            _builder.append(_LatexShortDoc_1, "");
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          List<ASDMAttribute> _optionalValueAttributes_2 = table.getOptionalValueAttributes();
          int _size_1 = _optionalValueAttributes_2.size();
          boolean _notEquals_8 = (_size_1 != 0);
          if (_notEquals_8) {
            _builder.append("\\hline \\multicolumn{3}{|l|}{\\em Optional Data} \\\\");
            _builder.newLine();
            _builder.append("\\hline");
            _builder.newLine();
            {
              List<ASDMAttribute> _optionalValueAttributes_3 = table.getOptionalValueAttributes();
              for(final ASDMAttribute attr_4 : _optionalValueAttributes_3) {
                _builder.append("\\texttt{");
                String _LatexSymbol_5 = attr_4.LatexSymbol();
                _builder.append(_LatexSymbol_5, "");
                _builder.append("} ");
                {
                  boolean _isDimensionPar_3 = attr_4.isDimensionPar();
                  if (_isDimensionPar_3) {
                    _builder.append("(");
                    String _LatexSymbol_6 = attr_4.LatexSymbol();
                    _builder.append(_LatexSymbol_6, "");
                    _builder.append(")");
                  }
                }
                _builder.append(" & \\texttt{");
                String _LatexTypeDescription_2 = attr_4.LatexTypeDescription();
                _builder.append(_LatexTypeDescription_2, "");
                _builder.append("} &");
                _builder.newLineIfNotEmpty();
                String _LatexShortDoc_2 = attr_4.LatexShortDoc();
                _builder.append(_LatexShortDoc_2, "");
                _builder.append(" \\\\");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\\hline");
        _builder.newLine();
        _builder.append("\\end{longtable}");
        _builder.newLine();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("~\\par\\noindent{\\bf Column Descriptions:}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\\begin{description}");
        _builder.newLine();
        {
          List<ASDMAttribute> _keyAttributes_1 = table.getKeyAttributes();
          for(final ASDMAttribute attr_5 : _keyAttributes_1) {
            _builder.append("\\item[\\texttt{");
            String _LatexSymbol_7 = attr_5.LatexSymbol();
            _builder.append(_LatexSymbol_7, "");
            _builder.append("}]: ");
            String _LatexLongDoc = attr_5.LatexLongDoc();
            _builder.append(_LatexLongDoc, "");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _requiredValueAttributes_2 = table.getRequiredValueAttributes();
          for(final ASDMAttribute attr_6 : _requiredValueAttributes_2) {
            _builder.append("\\item[\\texttt{");
            String _LatexSymbol_8 = attr_6.LatexSymbol();
            _builder.append(_LatexSymbol_8, "");
            _builder.append("}]: ");
            String _LatexLongDoc_1 = attr_6.LatexLongDoc();
            _builder.append(_LatexLongDoc_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          List<ASDMAttribute> _optionalValueAttributes_4 = table.getOptionalValueAttributes();
          for(final ASDMAttribute attr_7 : _optionalValueAttributes_4) {
            _builder.append("\\item[\\texttt{");
            String _LatexSymbol_9 = attr_7.LatexSymbol();
            _builder.append(_LatexSymbol_9, "");
            _builder.append("}]: ");
            String _LatexLongDoc_2 = attr_7.LatexLongDoc();
            _builder.append(_LatexLongDoc_2, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\\end{description}");
        _builder.newLine();
        _builder.append("\\endgroup");
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }
}
