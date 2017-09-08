package org.xtext.alma.sdmdsl.generator.html;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.html.ASDMEntities;
import org.xtext.alma.sdmdsl.generator.html.ASDMEntitiesDocBook;
import org.xtext.alma.sdmdsl.generator.html.HTMLJavaPackage;
import org.xtext.alma.sdmdsl.generator.html.HTMLKeyValue;
import org.xtext.alma.sdmdsl.generator.html.HTMLTableMethods;

@SuppressWarnings("all")
public class HTMLGenerator {
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    ASDMEntities _aSDMEntities = new ASDMEntities();
    _aSDMEntities.doGenerate(fsa, context);
    ASDMEntitiesDocBook _aSDMEntitiesDocBook = new ASDMEntitiesDocBook();
    _aSDMEntitiesDocBook.doGenerate(fsa, context);
    HTMLKeyValue _hTMLKeyValue = new HTMLKeyValue();
    _hTMLKeyValue.doGenerate(fsa, context);
    HTMLTableMethods _hTMLTableMethods = new HTMLTableMethods();
    _hTMLTableMethods.doGenerate(fsa, context);
    HTMLJavaPackage _hTMLJavaPackage = new HTMLJavaPackage();
    _hTMLJavaPackage.doGenerate(fsa, context);
  }
}
