package org.xtext.alma.sdmdsl.generator.test;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.test.TestAutoIncrementable;
import org.xtext.alma.sdmdsl.generator.test.TestExtrinsic;
import org.xtext.alma.sdmdsl.generator.test.TestIntrinsic;
import org.xtext.alma.sdmdsl.generator.test.TestKey;

@SuppressWarnings("all")
public class TestGenerator {
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TestIntrinsic _testIntrinsic = new TestIntrinsic();
    _testIntrinsic.doGenerate(fsa, context);
    TestAutoIncrementable _testAutoIncrementable = new TestAutoIncrementable();
    _testAutoIncrementable.doGenerate(fsa, context);
    TestKey _testKey = new TestKey();
    _testKey.doGenerate(fsa, context);
    TestExtrinsic _testExtrinsic = new TestExtrinsic();
    _testExtrinsic.doGenerate(fsa, context);
  }
}
