/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 09:06:32 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      doubleArray0[1] = (-2.185039863261519);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 1.1102230246251565E-14;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2.185039863261519);
      doubleArray0[0] = (-2.185039863261519);
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2.185039863261519));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 1.1102230246251565E-14;
      doubleArray0[3] = 1.1102230246251565E-14;
      doubleArray0[6] = 1.0986122886681096;
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
      assertEquals(1.1102230246251565E-14, double0, 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      doubleArray0[4] = (-298.0);
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals((-298.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(2);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      doubleArray0[1] = (-2.185039863261519);
      doubleArray0[2] = 1.1102230246251565E-14;
      doubleArray0[3] = (-2.185039863261519);
      doubleArray0[5] = (-1791.3498848054287);
      doubleArray0[6] = 5.563853238645008E8;
      double[] doubleArray1 = new double[6];
      doubleArray0[4] = 1.1102230246251565E-14;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 45.5263296062519);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(1.6734941228090178E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      doubleArray0[1] = (-0.9863392590717683);
      doubleArray0[4] = (-298.0);
      doubleArray0[5] = (-1791.3498848054287);
      doubleArray0[6] = 1.0986122886681096;
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1791.3498848054287);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 20.08553692318767);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-5.296112642839033E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2604);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2604
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 1.2599210498948732);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      double[][] doubleArray2 = new double[1][1];
      doubleArray2[0] = doubleArray0;
      array2DRowRealMatrix0.data = doubleArray2;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 2409.1894);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x7 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 27.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2.185039863261519);
      doubleArray0[4] = (-298.0);
      doubleArray0[5] = (-1791.3498848054287);
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 18.451348250750993;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = (-1791.3498848054287);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 0.014631227719162608;
      doubleArray0[4] = (-298.0);
      doubleArray0[5] = (-1791.3498848054287);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.014631227719162608;
      doubleArray1[1] = 2.0;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = 0.014631227719162608;
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(247074.285604174, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 2.0;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = (-1791.3498848054287);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.014631227719162608;
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 0.014631227719162608;
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = 0.014631227719162608;
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals((-1.7873110870257863E-5), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      doubleArray0[2] = (-1318.3217716);
      doubleArray0[4] = (-298.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = (-1318.3217716);
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = (-1791.3498848054287);
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      assertEquals(6.9742472061032776E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = (-1791.3498848054287);
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2074.3888893121;
      doubleArray0[4] = (-298.0);
      doubleArray0[6] = (-1791.3498848054287);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 2074.3888893121;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = (-1791.3498848054287);
      doubleArray1[5] = (-2.185039863261519);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1791.3498848054287));
      assertEquals((-6.3480076455775155E17), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-2853.17833);
      doubleArray0[5] = (-1791.3498848054287);
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 2.0;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = 0.014631227719162608;
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 1.1102230246251565E-14;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = (-1791.3498848054287);
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      assertEquals(9.6357662352395328E17, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2.185039863261519);
      doubleArray0[2] = (-2.185039863261519);
      doubleArray0[3] = (-2.185039863261519);
      doubleArray0[4] = (-2.185039863261519);
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-2.185039863261519);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2.185039863261519));
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 2074.3888893121;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = 2074.3888893121;
      doubleArray1[4] = (-1791.3498848054287);
      doubleArray1[5] = (-2.185039863261519);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals((-1.6314088162310497E24), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 2074.3888893121;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = 2074.3888893121;
      doubleArray1[4] = (-1791.3498848054287);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 1.1102230246251565E-14;
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = (-1791.3498848054287);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-2.185039863261519);
      doubleArray0[4] = (-298.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[4] = (-1791.3498848054287);
      doubleArray1[5] = (-2.185039863261519);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2.185039863261519));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 1.1102230246251565E-14;
      doubleArray1[2] = (-298.0);
      doubleArray1[3] = (-2853.17833);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = 1.1102230246251565E-14;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2853.17833);
      doubleArray0[3] = 2074.3888893121;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-2853.17833);
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = (-1791.3498848054287);
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2.185039863261519);
      doubleArray0[2] = (-2.185039863261519);
      doubleArray0[3] = (-2.185039863261519);
      doubleArray0[4] = (-2.185039863261519);
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1791.3498848054287);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2.185039863261519));
      eigenDecompositionImpl0.getV();
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-2853.17833);
      doubleArray0[1] = 2.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 0.9950547536867305;
      doubleArray1[3] = (-2853.17833);
      doubleArray1[4] = 0.014631227719162608;
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = (-1791.3498848054287);
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1791.3498848054287);
      doubleArray1[3] = (-298.0);
      doubleArray1[4] = 1.1102230246251565E-14;
      doubleArray1[5] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 20.08553692318767);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-1791.3498848054287));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2853.17833);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 1.1102230246251565E-14;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 20.08553692318767);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 20.08553692318767);
      try { 
        eigenDecompositionImpl0.getEigenvector(7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 45.5263296062519);
      eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(983);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 983
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2.185039863261519));
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(7, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 20.08553692318767);
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(7, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 1.0986122886681096);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2.185039863261519);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.014631227719162608;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 2410.440591215615);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2.185039863261519));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      eigenDecompositionImpl0.getImagEigenvalue(2);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 45.5263296062519);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
