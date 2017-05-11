/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 03:16:33 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      double double0 = threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 2.220446049250313E-13, doubleArray0, (-1047.758), doubleArray0);
      double double1 = threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (-1047.758), doubleArray0, 0.0, doubleArray0);
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1575.6223946), doubleArray0, doubleArray0);
      StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
      double[] doubleArray1 = new double[2];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputTest0, (-1575.6223946), doubleArray0, (-1575.6223946), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(4.450312892752409);
      eulerIntegrator0.setMaxEvaluations(2950);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (-1047.758), doubleArray0, 0.0, doubleArray0);
      threeEighthesIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      double double0 = threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (-1047.758), doubleArray0, 1.02654690214993, doubleArray0);
      assertEquals(1.02654690214993, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      classicalRungeKuttaIntegrator0.setMaxEvaluations(0);
      int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
      assertEquals(0, int0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, 0.0, (double) 5, 0.0, (double) 5);
      double double0 = adamsMoultonIntegrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1.0), 2937500.0, 4365.5209350041);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 4365.5209350041, doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, (-1047.758));
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(Double.NaN);
      threeEighthesIntegrator0.addEventHandler((EventHandler) stepProblem0, (-1047.758), 0.0, (-1728), (UnivariateSolver) regulaFalsiSolver0);
      try { 
        threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (-1047.758), doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,728) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-60.19669523126412), 1536.0102, 566.0, 1536.0102);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-60.19669523126412), (double[]) null, (-60.19669523126412), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(0.0);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      threeEighthesIntegrator0.setMaxEvaluations(0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0);
      try { 
        threeEighthesIntegrator0.integrate(expandableStatefulODE0, 2.2737367544323206E-10);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1854.5910046);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1854.5910046), (-6.818702940330079), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-6.818702940330079), (-6.818702940330079), (-1854.5910046));
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      expandableStatefulODE0.setTime((-0.871391583777973));
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-6.818702940330079));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (1.85E03) reached, integration needs 1.44E01
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      // Undeclared exception!
      try { 
        gillIntegrator0.integrate((ExpandableStatefulODE) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 53.4, Double.NaN, 53.4);
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-3.096733638475319E128));
      midpointIntegrator0.setMaxEvaluations((-1350));
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1854.5910046), (-6.818702940330079), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.clearEventHandlers();
      assertEquals(1854.5910046, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      gillIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        threeEighthesIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-1284.37), doubleArray0, (-1284.37), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1854.5910046), (-1854.5910046), 0.0);
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      expandableStatefulODE0.setTime((-0.871391583777973));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
      assertEquals(0.0, expandableStatefulODE0.getTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      StepProblem stepProblem0 = new StepProblem(1.0, (-752.4083940373), (double) 0);
      double[] doubleArray0 = new double[7];
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 1.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      classicalRungeKuttaIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      StepProblem stepProblem0 = new StepProblem(1553.327577, 6.709727430151118, (-415.5536668319));
      threeEighthesIntegrator0.addEventHandler((EventHandler) stepProblem0, (-415.5536668319), (-415.5536668319), 5);
      double[] doubleArray0 = new double[1];
      double double0 = threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (-1047.758), doubleArray0, 0.0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((double) 5, 1.0E-8, (double) 5, 1.0E-8);
      String string0 = graggBulirschStoerIntegrator0.getName();
      assertEquals("Gragg-Bulirsch-Stoer", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      classicalRungeKuttaIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((double) (-1380));
      StepProblem stepProblem0 = new StepProblem((-1.0), (-352.6), (double) 2146384474);
      gillIntegrator0.addEventHandler((EventHandler) stepProblem0, (-352.6), 0.0, (-1380));
      gillIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-3.096733638475319E128));
      double double0 = midpointIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      int int0 = threeEighthesIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      threeEighthesIntegrator0.getEvaluations();
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      double double0 = midpointIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1047.758));
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (-1047.758), doubleArray0, 0.0, doubleArray0);
      int int0 = threeEighthesIntegrator0.getEvaluations();
      assertEquals(4, int0);
  }
}