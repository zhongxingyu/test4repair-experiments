/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 21:44:34 GMT 2017
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl(1218.046361, (-199.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability(Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0.0 and 1.0, inclusive.
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(364.096506, 2192.6930829688595);
      double double0 = fDistributionImpl0.cumulativeProbability((-608.509643589939));
      assertEquals(364.096506, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2192.6930829688595, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1588.2337, 1588.2337);
      double double0 = fDistributionImpl0.getInitialDomain(1588.2337);
      assertEquals(1.0012608482596228, double0, 0.01);
      assertEquals(1588.2337, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.getInitialDomain(Double.POSITIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(152.421845, 152.421845);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0.0 and 1.0, inclusive.
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0E-14);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1781.672521714156, 1781.672521714156);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setNumeratorDegreesOfFreedom(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(1144.695283347596);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
      assertEquals(1144.695283347596, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals((-1.5654144647214707E-13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setDenominatorDegreesOfFreedom(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl((-571.559235247797), (-571.559235247797));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1781.672521714156, 1781.672521714156);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1781.672521714156, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1781.672521714156, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(910.889130322, 2.003326833049785);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.8421518527333582);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getDomainUpperBound(1.0E-14);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getDomainLowerBound(1.0E-14);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
      assertEquals(0.4999999999999209, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(1.0E-14, double0, 0.01);
  }
}