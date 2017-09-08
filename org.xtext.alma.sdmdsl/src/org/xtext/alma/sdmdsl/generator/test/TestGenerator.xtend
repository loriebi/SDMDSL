package org.xtext.alma.sdmdsl.generator.test

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class TestGenerator {
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		new TestIntrinsic().doGenerate(fsa,context)
		
		new TestAutoIncrementable().doGenerate(fsa,context)
		
		new TestKey().doGenerate(fsa,context)
		
		new TestExtrinsic().doGenerate(fsa,context)
	}
	
}