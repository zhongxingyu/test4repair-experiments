/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 13:58:12 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.setRelativeAccuracy(1.0);
      double double0 = brentSolver0.solve((-1726.804822), 1.0, 0.0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2335.7573152), 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-170.8499048476037), 1.0E-6);
      assertEquals((-170.8499048476037), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.functionValueAccuracy = (-1726.804822);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-2009.8525), (-862.27076443391), (-1726.804822));
      assertEquals(30, brentSolver0.getIterationCount());
      assertEquals((-1150.4487836593798), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-3975.9410604), 0.0, (-1417.27732));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.functionValueAccuracy = 0.0;
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1726.804822), 226.396, (-2.233235375748214E-5));
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.functionValueAccuracy = 0.0;
      double double0 = brentSolver0.solve(univariateRealFunction0, (-2009.8525), (-862.27076443391), (-1726.804822));
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals((-1726.804822), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2471.0), 0.0);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve(0.0, 2043.438790951076, 1.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(0.0, 0.9675225735802415);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((-135.0), 1.0E-15);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2717.8697), (-1604.0686), (-2959.69));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-2,717.87, initial=-2,959.69, upper=-1,604.069
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      brentSolver0.setMaximalIterationCount(2);
      try { 
        brentSolver0.solve(univariateRealFunction0, 1.0E-15, 2652.0697368281, 1.0E-6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (2) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, (-726.5190711), 1.1914015145136232, 5.08046606029211E-6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, (-5006.430790186), 1.52587890625E-5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((-23.886141501220763), (-23.886141501220763), (-23.886141501220763));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-23.886, initial=-23.886, upper=-23.886
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.0, 3672.73582, 1595.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(1121.491, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,121.491, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.0, 3029.8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrentSolver brentSolver0 = null;
      try {
        brentSolver0 = new BrentSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-2718.0), 1624.9973938831079, 0.0);
      assertEquals(10, brentSolver0.getIterationCount());
      assertEquals((-1402.7211198276689), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1726.804822), 226.396, (-2.233235375748214E-5));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve((-1726.804822), 1.0, (-13.233610489406901));
      assertEquals(8, brentSolver0.getIterationCount());
      assertEquals((-4.712388980750383), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-3501.0), 1.1914015145136232, (-726.5190711));
      assertEquals(16, brentSolver0.getIterationCount());
      assertEquals(1.0000000000711387, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sinFunction0);
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-170.8499048476037), 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      brentSolver0.setMaximalIterationCount((-1243));
      try { 
        brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1544.785411), 194.11);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1,243) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1307.188305671), 0.0);
      assertEquals((-1307.188305671), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, Double.NaN, (-1.0));
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 2612.846288181554, 3656.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [2,612.846, 3,656], Values: [121,778,109,228,822,224, 653,177,016,481,105,150]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, (double) 371);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(0.0, 2043.915441, 1.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-3975.9410604), 1.0E-15, (-1417.27732));
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((-1726.804822), 94.06781039136);
      assertEquals(20, brentSolver0.getIterationCount());
      assertEquals((-2.6718338593633535E-8), double0, 0.01);
  }
}