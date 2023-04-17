/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 17 13:00:54 GMT 2023
 */

package Agile.Software.Testing.LeanTesting;

import org.junit.Test;
import static org.junit.Assert.*;
import Agile.Software.Testing.LeanTesting.Divide;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Divide_ESTest extends Divide_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = Divide.divide(0, 1738);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = Divide.divide(1738, (-1));
      assertEquals((-1738.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = Divide.divide(1738, 0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Divide divide0 = new Divide();
  }
}
