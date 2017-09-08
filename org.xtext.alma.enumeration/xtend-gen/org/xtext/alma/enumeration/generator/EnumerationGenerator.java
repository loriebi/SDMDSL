/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.enumeration.generator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.enumeration.generator.CPPClassGenerator;
import org.xtext.alma.enumeration.generator.CPPHeaderGenerator;
import org.xtext.alma.enumeration.generator.EnumerationAbstractGenerator;
import org.xtext.alma.enumeration.generator.F90Generator;
import org.xtext.alma.enumeration.generator.IDLGenerator;
import org.xtext.alma.enumeration.generator.JAVAGenerator;
import org.xtext.alma.enumeration.generator.LatexGenerator;
import org.xtext.alma.enumeration.generator.Main;
import org.xtext.alma.enumeration.generator.PostgreSQLGenerator;
import org.xtext.alma.enumeration.generator.PythonGenerator;
import org.xtext.alma.enumeration.generator.SQLGenerator;
import org.xtext.alma.enumeration.generator.TwikiGenerator;
import org.xtext.alma.enumeration.generator.XSDGenerator;
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EnumerationGenerator extends EnumerationAbstractGenerator {
  @Override
  public void doGenerate(final EList<Resource> input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Logger _logger = Main.getLogger();
    _logger.info("Starting Java code generation!");
    JAVAGenerator _jAVAGenerator = new JAVAGenerator();
    _jAVAGenerator.doGenerate(input, fsa, context);
    Logger _logger_1 = Main.getLogger();
    _logger_1.info("Java code generation finished!");
    Logger _logger_2 = Main.getLogger();
    _logger_2.info("Starting IDL code generation!");
    IDLGenerator _iDLGenerator = new IDLGenerator();
    _iDLGenerator.doGenerate(input, fsa, context);
    Logger _logger_3 = Main.getLogger();
    _logger_3.info("IDL code generation finished!");
    Logger _logger_4 = Main.getLogger();
    _logger_4.info("Starting CPP Header generation!");
    CPPHeaderGenerator _cPPHeaderGenerator = new CPPHeaderGenerator();
    _cPPHeaderGenerator.doGenerate(input, fsa, context);
    Logger _logger_5 = Main.getLogger();
    _logger_5.info("CPP Header finished!");
    Logger _logger_6 = Main.getLogger();
    _logger_6.info("Starting CPP Class generation!");
    CPPClassGenerator _cPPClassGenerator = new CPPClassGenerator();
    _cPPClassGenerator.doGenerate(input, fsa, context);
    Logger _logger_7 = Main.getLogger();
    _logger_7.info("CPP Class generation finished!");
    Logger _logger_8 = Main.getLogger();
    _logger_8.info("Starting Twiki generation");
    TwikiGenerator _twikiGenerator = new TwikiGenerator();
    _twikiGenerator.doGenerate(input, fsa, context);
    Logger _logger_9 = Main.getLogger();
    _logger_9.info("Twiki generation finished!");
    Logger _logger_10 = Main.getLogger();
    _logger_10.info("Starting F90 generation");
    F90Generator _f90Generator = new F90Generator();
    _f90Generator.doGenerate(input, fsa, context);
    Logger _logger_11 = Main.getLogger();
    _logger_11.info("F90 generation finished!");
    Logger _logger_12 = Main.getLogger();
    _logger_12.info("Starting Latex generation");
    LatexGenerator _latexGenerator = new LatexGenerator();
    _latexGenerator.doGenerate(input, fsa, context);
    Logger _logger_13 = Main.getLogger();
    _logger_13.info("CPP Class generation finished!");
    Logger _logger_14 = Main.getLogger();
    _logger_14.info("Starting XSD generation");
    XSDGenerator _xSDGenerator = new XSDGenerator();
    _xSDGenerator.doGenerate(input, fsa, context);
    Logger _logger_15 = Main.getLogger();
    _logger_15.info("XSD generation finished!");
    Logger _logger_16 = Main.getLogger();
    _logger_16.info("Starting PostgreSQL generation");
    PostgreSQLGenerator _postgreSQLGenerator = new PostgreSQLGenerator();
    _postgreSQLGenerator.doGenerate(input, fsa, context);
    Logger _logger_17 = Main.getLogger();
    _logger_17.info("PostgreSQL generation finished!\n");
    Logger _logger_18 = Main.getLogger();
    _logger_18.info("Starting SQL generation");
    SQLGenerator _sQLGenerator = new SQLGenerator();
    _sQLGenerator.doGenerate(input, fsa, context);
    Logger _logger_19 = Main.getLogger();
    _logger_19.info("SQL generation finished!\n");
    Logger _logger_20 = Main.getLogger();
    _logger_20.info("Starting Python generation");
    PythonGenerator _pythonGenerator = new PythonGenerator();
    _pythonGenerator.doGenerate(input, fsa, context);
    Logger _logger_21 = Main.getLogger();
    _logger_21.info("Python generation finished!\n");
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    if ((fsa instanceof EnumerationFileSystemAccess)) {
    } else {
      Logger _logger = Main.getLogger();
      _logger.info("code generation not supported for eclipse application!!!");
    }
  }
}