
package org.xtext.alma.sdmdsl.generator;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;

public interface ISdmdslGenerator2 extends IGenerator2{
    
    void doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context);

}
