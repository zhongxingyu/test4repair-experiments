/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 21:51:41 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("PEGASUS");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 1.9699272335463627E-8);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(3, (UnivariateRealFunction) quinticFunction0, 1783.38413596, 0.0, allowedSolution0);
      assertEquals(1783.38413596, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3156.859), (-30.63564552));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1529, (UnivariateRealFunction) sinFunction0, (-1047.0), 0.0, 1613.88834, allowedSolution0);
      assertEquals(1613.88834, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-10.34098296978073));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      pegasusSolver0.solve(5, (UnivariateRealFunction) monitoredFunction0, 0.0, (-10.34098296978073), 1657.1);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1657.1, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) sinFunction0, (double) 0, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3156.859), (-30.63564552));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(603, univariateRealFunction0, 0.0, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1411.3680778, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) null, 1.0, 1411.3680778, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(516.78164180169, 516.78164180169, 516.78164180169);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1937), (UnivariateRealFunction) sincFunction0, (double) (-1937), (-667.116709), (double) (-1937), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,937) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2125.4));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(19, (UnivariateRealFunction) sincFunction0, (-3243.27), (-3243.27), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-3,243.27, -3,243.27]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-906), (UnivariateRealFunction) null, 3513.62, 0.0, (-284.541078609189), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-24), (UnivariateRealFunction) quinticFunction0, (double) (-24), 0.0, (double) (-24));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-24) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(276, (UnivariateRealFunction) xMinus5Function0, (double) 276, 713.189482, 1008.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [276, 713.189], values: [271, 708.189]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-10.34098296978073), (-10.34098296978073));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5, (UnivariateRealFunction) monitoredFunction0, 1.5301952203117253E-6, (-10.34098296978073), 8.873257684172131E-11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-6);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2656.718922824709, 2656.718922824709);
      Expm1Function expm1Function0 = new Expm1Function();
      pegasusSolver0.setup(879542330, expm1Function0, 1.2246467991473532E-16, 1.2246467991473532E-16, 1029.9408304746003);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.986821492305628E-8, 1754.0, 1754.0);
      SincFunction sincFunction0 = new SincFunction();
      illinoisSolver0.setup(282, sincFunction0, (-1065.469), (-198.357720088764), 282);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,065.469, -198.358], values: [-0, -0.002]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3195.9497);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2023608425, (UnivariateRealFunction) sincFunction0, 1.8362407942122445, 3195.9497, allowedSolution0);
      assertEquals(1.8362407942122445, pegasusSolver0.getMin(), 0.01);
      assertEquals(3194.4035316525205, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2367.2022598233634, 3195.9497, 2367.2022598233634);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2023608425, (UnivariateRealFunction) sincFunction0, 1.8362407942122445, 2367.2022598233634, allowedSolution0);
      assertEquals(1.8362407942122445, pegasusSolver0.getMin(), 0.01);
      assertEquals(2367.2022598233634, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2125.4));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(19, univariateRealFunction0, (-3243.27), (double) 19, (-3243.27), allowedSolution0);
      assertEquals((-3243.27), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3221.7029558614945), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3800.720447604876));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(19, univariateRealFunction0, (-3243.27), (double) 19, 3006.611290686417, allowedSolution0);
      assertEquals(3006.611290686417, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3221.7029558614945), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2125.4));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(19, (UnivariateRealFunction) sincFunction0, (-8.262445751340127E-15), 3.4198147686593074, (-2125.4), allowedSolution0);
      assertEquals((-2125.4), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2111.4399890960217));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(39, univariateRealFunction0, (-3243.27), (double) 39, (double) 39, allowedSolution0);
      assertEquals(39.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3240.55251358853), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2367.2022598233634, 3195.9497, 2367.2022598233634);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(2023608411, (UnivariateRealFunction) sincFunction0, 1.8362407942122445, 2367.2022598233634, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1184.5192503087878, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2367.2022598233634, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2125.4));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(19, univariateRealFunction0, (-3243.27), (double) 19, 3006.6112907, allowedSolution0);
      assertEquals(3006.6112907, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3221.7029558615213), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2367.2022598233634, 3195.5384361027504, 3195.5384361027504);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2023608425, (UnivariateRealFunction) sincFunction0, (-1058.2824932), 2367.2022598233634, allowedSolution0);
      assertEquals((-1058.2824932), pegasusSolver0.getMin(), 0.01);
      assertEquals((-1058.2824932), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2125.4));
      SincFunction sincFunction0 = new SincFunction();
      double double0 = illinoisSolver0.solve(247, (UnivariateRealFunction) sincFunction0, (-1003.7056338252), 0.08944225020240992);
      assertEquals((-501.8080957874988), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1002.168056495144), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = regulaFalsiSolver0.solve(4011, univariateRealFunction0, (-298.00338), 2904.06102882231, 888.0235873);
      assertEquals(888.0235873, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(469.66810171167407, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2111.4399890960217));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(39, (UnivariateRealFunction) sinFunction0, (-3243.27), (double) 39, 0.7937005259840998, allowedSolution0);
      assertEquals(0.7937005259840998, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-804.2477193189872), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2125.4));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(19, univariateRealFunction0, (-3243.27), (double) 19, 3006.6112907, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = illinoisSolver0.solve(1719, (UnivariateRealFunction) xMinus5Function0, (-182.5155322015813), 2573.297, 893.51799162);
      assertEquals(893.51799162, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-4729.23));
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = illinoisSolver0.solve(39, univariateRealFunction0, (double) 39, (-4729.23), (double) 39);
      assertEquals(39.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-4729.23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(792.6694, 0.0, (-2700.632601382337));
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      illinoisSolver0.solve(2612, univariateRealFunction0, (-2700.632601382337), (double) 2612, (double) 2612);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(2612.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2700.632601382337), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-4729.23));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(39, (UnivariateRealFunction) expm1Function0, (double) 39, (-4729.23), (double) 39);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [39, -4,729.23]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3195.8089544696822);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(2023608411, (UnivariateRealFunction) sincFunction0, 2.6502095778167583, 2367.2022598233634, allowedSolution0);
  }
}