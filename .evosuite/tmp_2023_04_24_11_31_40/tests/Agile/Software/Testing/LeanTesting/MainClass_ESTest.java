/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 24 09:33:46 GMT 2023
 */

package Agile.Software.Testing.LeanTesting;

import org.junit.Test;
import static org.junit.Assert.*;
import Agile.Software.Testing.LeanTesting.MainClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MainClass_ESTest extends MainClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MainClass.findEvenOdd(0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MainClass.findEvenOdd((-633));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MainClass.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MainClass mainClass0 = new MainClass();
  }
}