/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 10:39:19 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdaptiveStepsizeIntegrator_ESTest extends AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1608.67564), (-2450.778253), 0.9950547536867305, 0.9950547536867305);
      StepProblem stepProblem0 = new StepProblem(552.6481222, (-2450.778253), (-2450.778253));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(stepProblem0, 1.0E-12, doubleArray0, (-1356868.777702048), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, (-6.0), (double) 1, doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem(0.0, (-2331.32), (-3409.8953436012894));
      try { 
        adamsMoultonIntegrator0.integrate(stepProblem0, (-6.0), doubleArray0, (-6.0), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, (-6.0), (double) 1, doubleArray1, doubleArray0);
      StepProblem stepProblem0 = new StepProblem(0.0, (-2331.32), (-3409.8953436012894));
      try { 
        adamsMoultonIntegrator0.integrate(stepProblem0, (-6.0), doubleArray1, (-6.0), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(6481.073289, 6481.073289, doubleArray0, doubleArray0);
      highamHall54Integrator0.setInitialStepSize(6481.073289);
      assertEquals(6481.073289, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0E-15, 3654.575703854, 3654.575703854, 2449.31719);
      dormandPrince853Integrator0.setInitialStepSize(1.0E-15);
      assertEquals(1.911694458812391E-6, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(811.687, 1470.5503990190941, (-1757.8), 1470.5503990190941);
      dormandPrince54Integrator0.setInitialStepSize(1000.0);
      assertEquals(1092.5322154191203, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0E-6, 1.0E-6, doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem(1.0E-6, 1.0E-6, 0.0);
      dormandPrince54Integrator0.sanityChecks(stepProblem0, 0.0, doubleArray0, (-1.0), doubleArray0);
      assertEquals(1.0E-6, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0E-6, 1.0E-6, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.resetInternalState();
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1.0E-6, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1608.67564), (-1608.67564), 0.9950547536867305, 0.9950547536867305);
      StepProblem stepProblem0 = new StepProblem(552.6481222, 180.061718, 180.061718);
      double[] doubleArray0 = new double[1];
      dormandPrince853Integrator0.integrate(stepProblem0, 1.0E-12, doubleArray0, 99690.83205080547, doubleArray0);
      assertEquals(758, dormandPrince853Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1091.0795), 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1091.0795), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1091.0795), 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMaxStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3129.0173645), (-3129.0173645), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals((-3129.0173645), double0, 0.01);
      assertEquals(3129.0173645, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1613.147499, 0.0, 1613.147499, 1613.147499);
      double double0 = dormandPrince853Integrator0.filterStep(0.0, false, true);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3129.0173645), (-3129.0173645), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1232.7), true, true);
      assertEquals((-3129.0173645), double0, 0.01);
      assertEquals(3129.0173645, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.0, 1.0, 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[5];
      try { 
        graggBulirschStoerIntegrator0.sanityChecks(testProblem5_0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(925.904109279, (-727.7788478), 0.0, (-727.7788478));
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.sanityChecks(testProblem5_0, 100.0, (double[]) null, 42.31073445, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1302.33594122, 0.0, 0.0, 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      try { 
        highamHall54Integrator0.integrate(testProblem5_0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(811.687, 1470.5503990190941, (-1757.8), 1470.5503990190941);
      StepProblem stepProblem0 = new StepProblem((-1757.8), 2.0, 811.687);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate(stepProblem0, (-2598.09), (double[]) null, 1.0E-10, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1786.894685898319), (-1770.62), 0.0, (-1786.894685898319));
      StepProblem stepProblem0 = new StepProblem(2187.8125988, (-1770.62), 3427.8);
      double[] doubleArray0 = new double[3];
      dormandPrince54Integrator0.setMaxEvaluations(0);
      try { 
        dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-1), doubleArray0, 2187.8125988, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, (double) 2, (double) 2, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.initializeStep(testProblem5_0, true, 5, doubleArray0, 556.636527, doubleArray0, doubleArray1, doubleArray0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1786.894685898319), (-1770.62), 0.0, (-1786.894685898319));
      StepProblem stepProblem0 = new StepProblem(2187.8125988, (-1770.62), 3427.8);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-1), doubleArray0, 2187.8125988, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-643.504098264), (-643.504098264), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep((FirstOrderDifferentialEquations) null, true, 0, doubleArray0, (-37.45832313645163), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4055.0613260977, (-1692.083), (-1610.5686364544963), (-39.17726167561544));
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(2619.446570145567, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(4055.0613260977, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(5.0, (-2450.778253), 100.0, Double.NaN);
      double double0 = highamHall54Integrator0.filterStep((-0.2896309375740099), true, true);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(5.0, double0, 0.01);
      assertEquals(110.69729565350727, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-5040.2411878), (-1507.67638), (-5040.2411878), (-5040.2411878));
      try { 
        graggBulirschStoerIntegrator0.filterStep((-3609.4472283519704), false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (5.04E03) reached, integration needs 3.61E03
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-73.38);
      doubleArray0[1] = (-73.38);
      StepProblem stepProblem0 = new StepProblem((-73.38), (-73.38), (-73.38));
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-503.7414852191512), doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[9];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(stepProblem0, false, 4441, doubleArray0, 30.0, doubleArray0, doubleArray1, doubleArray1, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(840.4447360185403, 1470.5503990190941, 840.4447360185403, 1470.5503990190941);
      StepProblem stepProblem0 = new StepProblem(840.4447360185403, 2.0, 840.4447360185403);
      dormandPrince54Integrator0.setInitialStepSize(1000.0);
      double[] doubleArray0 = new double[0];
      double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-276), doubleArray0, 0.6510416666666666, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1111.7177438116034, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1000.0), double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.9990914622269392, 1470.5503990190941, 0.9990914622269392, 1470.5503990190941);
      StepProblem stepProblem0 = new StepProblem(0.9990914622269392, 2.0, 0.9990914622269392);
      dormandPrince54Integrator0.setInitialStepSize(1000.0);
      double[] doubleArray0 = new double[0];
      double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, true, (-276), doubleArray0, 0.6510416666666666, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1000.0, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(38.33033196352982, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, (-3409.293998454686));
      double[] doubleArray1 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(840.4447360185403, 0.0, doubleArray1, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 100.0, doubleArray0, (-2811.31690489981), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 1, absolute tolerance vector has dimension 8
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-503.7414852191512), doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setInitialStepSize(0.001);
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.9990914622269392, 1470.5503990190941, 0.9990914622269392, 1470.5503990190941);
      dormandPrince54Integrator0.setInitialStepSize((-3385.5));
      assertEquals(38.33033196352982, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-6.0), 0.0, 0.0, 0.0);
      double double0 = dormandPrince54Integrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(6.0, dormandPrince54Integrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1313.9042802314), (-1313.9042802314), 2065.1858157038, 100.0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(1313.9042802314, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1313.9042802314, double0, 0.01);
  }
}