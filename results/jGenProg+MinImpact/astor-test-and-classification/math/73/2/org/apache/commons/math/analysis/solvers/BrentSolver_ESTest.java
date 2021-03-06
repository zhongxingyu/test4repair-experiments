/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 00:50:56 GMT 2017
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
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 1556.5705);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setMaximalIterationCount((-2486));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      try { 
        brentSolver0.solve(univariateRealFunction0, 0.0, 575.2154859551);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-2,486) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.functionValueAccuracy = 2335.263029926316;
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-2973.5143103192727), 2335.263029926316);
      assertEquals((-2973.5143103192727), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      brentSolver0.functionValueAccuracy = 0.0;
      double double0 = brentSolver0.solve((-3460.51), 0.0, (-3041.4665340628353));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.functionValueAccuracy = (-1996.1667200259);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 16.208787036788156, 1.0);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.setFunctionValueAccuracy(0.0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 5.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 16.208787036788156, 1.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-3396.83543), 0.0);
      assertEquals(17, brentSolver0.getIterationCount());
      assertEquals((-2514.844919185153), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve((-3460.51), 0.0, (-3041.4665340628353));
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve(0.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.9999999992573473), (-730.178), 2093.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-1, initial=2,093, upper=-730.178
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, 8.94578043464179E-8, 1.1929459765712522, 0.026361898719249256);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.setMaximalIterationCount(1);
      try { 
        brentSolver0.solve((UnivariateRealFunction) sinFunction0, (double) 1, 575.2154859551);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, (-1.0), 1.5);
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
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-1655.912586), 2.3653287440849127, 2.1723950468228712E-10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-62.0), (-62.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-62, -62]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(Double.NaN, Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-953.001382), 790.52399302682, 695.08401);
      assertEquals(30, brentSolver0.getIterationCount());
      assertEquals((-0.9999999992573473), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.setAbsoluteAccuracy(86.456000719);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-4.042595306516709), 4328.264338911727, 0.2702492243715824);
      assertEquals(7, brentSolver0.getIterationCount());
      assertEquals(1024.6282183317392, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      brentSolver0.setFunctionValueAccuracy(0.5);
      double double0 = brentSolver0.solve(univariateRealFunction0, 0.0, 575.2154859551);
      assertEquals(2, brentSolver0.getIterationCount());
      assertEquals(400.5454727601029, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setMaximalIterationCount(1);
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-953.001382), 790.52399302682, 695.08401);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 314.3773254077, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 589.3121421353115);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) sinFunction0, 6.806855558790318, 133.5176877775662);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [6.807, 133.518], Values: [0.5, 1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 1.0);
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve((-3460.51), 0.005087968575869423, (-3041.4665340628353));
      assertEquals(4, brentSolver0.getIterationCount());
      assertEquals(1.7046220742567907E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      brentSolver0.setFunctionValueAccuracy(0.5);
      double double0 = brentSolver0.solve(univariateRealFunction0, 0.0, 5.0, 1.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.28366218546322625, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, 695.08401, 1264.4927369811694, 1264.471790947874);
      assertEquals(15, brentSolver0.getIterationCount());
      assertEquals(1264.4857548962193, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 0.8414709848078965, 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 5.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((-4219.5591819), 2.0);
      assertEquals(18, brentSolver0.getIterationCount());
      assertEquals((-5.529364748839375E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.2191992369529176, 1.0, 16.208787036788156);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=0.219, initial=16.209, upper=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((-332.800305938), 2335.263029926316, (-1.0));
      assertEquals(7, brentSolver0.getIterationCount());
      assertEquals((-235.61944894027707), double0, 0.01);
  }
}
