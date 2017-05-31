/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 18:53:50 GMT 2017
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-15.33824373490026), (-15.33824373490026), (-15.33824373490026));
      double[] doubleArray0 = new double[7];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-15.33824373490026), (-15.33824373490026), 3);
      eventState0.stepAccepted(0.0, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals((-15.33824373490026), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(3, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2847.4719077), (-2847.4719077), (-2847.4719077));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2847.4719077), (-2847.4719077), 0);
      Double double0 = new Double((double) 0);
      double[] doubleArray0 = new double[8];
      eventState0.reinitializeBegin((double) double0, doubleArray0);
      assertEquals((-2847.4719077), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-134.9175201414296), (-134.9175201414296), 9);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(9, int0);
      assertEquals((-134.9175201414296), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1588.96248), (-1588.96248), 3832.64359683075);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1588.96248), 3832.64359683075, (-2342));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals((-2342), int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals((-1588.96248), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(3832.64359683075, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3367.9336227925, 3367.9336227925, 3367.9336227925);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3367.9336227925, (-1108.4568645892), 0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3367.9336227925, double0, 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1108.4568645892, eventState0.getConvergence(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1588.96248), (-1588.96248), 3832.64359683075);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1588.96248), 3832.64359683075, (-2342));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals((-1588.96248), double0, 0.01);
      assertEquals(3832.64359683075, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-2342, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-15.33824373490026), (-15.33824373490026), (-15.33824373490026));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-15.33824373490026), (-15.33824373490026), 3);
      eventState0.getEventHandler();
      assertEquals(3, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-15.33824373490026), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1588.96248), (-1588.96248), 3832.64359683075);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (double) (-2342), 0.0, (-2342));
      double double0 = eventState0.getConvergence();
      assertEquals((-2342.0), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-2342, eventState0.getMaxIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-3890.76520185), (-3890.76520185), (-2363));
      // Undeclared exception!
      try { 
        eventState0.stepAccepted((-3890.76520185), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1588.96248), (-1588.96248), 3832.64359683075);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1588.96248), 3832.64359683075, (-2342));
      // Undeclared exception!
      try { 
        eventState0.evaluateStep((StepInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 1.0, 1.0, 9);
      double[] doubleArray0 = new double[2];
      boolean boolean0 = eventState0.reset((-1377.9497131528), doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(9, eventState0.getMaxIterationCount());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-15.33824373490026), (-15.33824373490026), (-15.33824373490026));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-15.33824373490026), (-15.33824373490026), 3);
      boolean boolean0 = eventState0.stop();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3, eventState0.getMaxIterationCount());
      assertEquals((-15.33824373490026), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-3027.05858609), (-3027.05858609), 1081.1);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3027.05858609), (-3027.05858609), 6);
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted(1081.1, doubleArray0);
      assertEquals(6, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-3027.05858609), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3367.9336227925, 3367.9336227925, 3367.9336227925);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3367.9336227925, (-1108.4568645892), 0);
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted(0, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(3367.9336227925, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(1108.4568645892, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-1146.2650171424405), 7);
      double[] doubleArray0 = new double[8];
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(7, eventState0.getMaxIterationCount());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1146.2650171424405, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1588.96248), (-1588.96248), 3832.64359683075);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1588.96248), 3832.64359683075, (-2342));
      double[] doubleArray0 = new double[6];
      eventState0.reinitializeBegin((-2342), doubleArray0);
      assertEquals((-1588.96248), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(3832.64359683075, eventState0.getConvergence(), 0.01);
      assertEquals(-2342, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-5600.987633307688), (-5600.987633307688), (-5600.987633307688));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-5600.987633307688), (-5600.987633307688), 1);
      double double0 = eventState0.getConvergence();
      assertFalse(eventState0.stop());
      assertEquals(1, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(5600.987633307688, double0, 0.01);
      assertEquals((-5600.987633307688), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 1015.21, 2642);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1015.21, eventState0.getConvergence(), 0.01);
      assertEquals(2642, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-134.9175201414296), (-134.9175201414296), 9);
      double double0 = eventState0.getEventTime();
      assertFalse(eventState0.stop());
      assertEquals((-134.9175201414296), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(9, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2164.3201), (-2164.3201), (-1690.09));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1690.09), (-1690.09), 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(0, int0);
      assertFalse(eventState0.stop());
      assertEquals((-1690.09), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 1.0, 1.0, 9);
      eventState0.getEventHandler();
      assertEquals(9, eventState0.getMaxIterationCount());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }
}