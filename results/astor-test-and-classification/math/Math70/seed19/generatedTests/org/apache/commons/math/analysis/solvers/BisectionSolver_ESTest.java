/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 04:10:25 GMT 2017
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
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      double double0 = bisectionSolver0.solve(0.0, 1.0E-15, 0.5);
      assertEquals(106, monitoredFunction0.getCallsCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 7.259815552856676E-22, 1.0E-15, 1.0E-15);
      assertEquals(0, bisectionSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-1755.3156932697), 1.0E-15);
      assertEquals(30, bisectionSolver0.getIterationCount());
      assertEquals((-4.086912816797227E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = bisectionSolver0.solve((-1.0), 0.0, 0.0);
      assertEquals(19, bisectionSolver0.getIterationCount());
      assertEquals((-0.9999995231628418), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = bisectionSolver0.solve((-0.5339107594345097), 311.1608);
      assertEquals(58, monitoredFunction0.getCallsCount());
      assertEquals(2.0609041118874972E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, 0.0, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setMaximalIterationCount((-148));
      SinFunction sinFunction0 = new SinFunction();
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (double) (-148), 1.0E-15, (double) (-148));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-148) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 1.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1.120532224066173E-9), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-0, -1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, 0.0, 1.8408919048309327E-4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-58.012324), (-58.012324), (-58.012324));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-58.012, -58.012]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      try { 
        bisectionSolver0.solve(778.2015, 2.356964398765555E21, 575.77486015156);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-817.017), 3235.1, 1861.3936474990196);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(0.25, 0.03513625366808526);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.25, 0.035]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      bisectionSolver0.setMaximalIterationCount(22);
      try { 
        bisectionSolver0.solve((double) (-19), 0.5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (22) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-946.1243641524), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BisectionSolver bisectionSolver0 = null;
      try {
        bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.setAbsoluteAccuracy((-1145.941385213064));
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-1755.3156932697), 2.2830316598693557E-7);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-636.48827139), 0.0, 0.0);
      assertEquals(29, bisectionSolver0.getIterationCount());
      assertEquals((-1.0000001912350722), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = bisectionSolver0.solve((double) (-19), 0.5);
      assertEquals(24, bisectionSolver0.getIterationCount());
      assertEquals((-1.0000002011656761), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 1.51515188529, 1995.2149690915953);
      assertEquals(30, bisectionSolver0.getIterationCount());
      assertEquals(166.50441082894773, double0, 0.01);
  }
}
