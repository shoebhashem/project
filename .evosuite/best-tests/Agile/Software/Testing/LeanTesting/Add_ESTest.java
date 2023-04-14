/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 14 14:27:10 GMT 2023
 */

package Agile.Software.Testing.LeanTesting;

import org.junit.Test;
import static org.junit.Assert.*;
import Agile.Software.Testing.LeanTesting.Add;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Add_ESTest extends Add_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Add.add(1, 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Add.add((-991), 745);
      assertEquals((-246), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Add add0 = new Add();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Add.add(0, 0);
      assertEquals(0, int0);
  }
}
