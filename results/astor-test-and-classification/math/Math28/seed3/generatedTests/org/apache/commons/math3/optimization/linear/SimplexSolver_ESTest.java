/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 23:16:42 GMT 2017
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = (-878.9493594381888);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1534.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-878.9493594381888));
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, (-59));
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) (-1320);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (double) (-1320));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexSolver simplexSolver0 = new SimplexSolver();
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-4095.611770457302));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexSolver simplexSolver0 = new SimplexSolver();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[26];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }
}