package org.xtext.alma.enumeration.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;

public interface IEnumerationGenerator2 extends IGenerator2{

	void doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context);
	
}
