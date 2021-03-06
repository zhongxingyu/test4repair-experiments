/**
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 18:36:40 GMT 2017
 */


package org.apache.commons.math.distribution;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.junit.Test;

public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FDistributionImpl fDistributionImpl0 = null;
        try {
            fDistributionImpl0 = new FDistributionImpl(0.0, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 1.7976931348623157E308);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability(1.7976931348623157E308);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // p must be between 0.0 and 1.0, inclusive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(402.101723210276, 402.101723210276);
        double double0 = fDistributionImpl0.cumulativeProbability(2.0);
        Assert.assertEquals(0.9999999999969582, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.cumulativeProbability((-5.000000000000003E-16), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1654.8703515, 1.0E-15);
        double double0 = fDistributionImpl0.cumulativeProbability(1.0E-15);
        Assert.assertEquals((-3.0664359940146824E-13), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
        fDistributionImpl0.setDenominatorDegreesOfFreedom(0.43455988484242636);
        Assert.assertEquals(0.43455988484242636, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        // Undeclared exception!
        try {
            fDistributionImpl0.setDenominatorDegreesOfFreedom((-5.000000000000003E-16));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
        fDistributionImpl0.setNumeratorDegreesOfFreedom(0.5);
        Assert.assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FDistributionImpl fDistributionImpl0 = null;
        try {
            fDistributionImpl0 = new FDistributionImpl(0.5, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        // Undeclared exception!
        try {
            fDistributionImpl0.setNumeratorDegreesOfFreedom((-3742.882549));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
        Assert.assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability((-1.643181065367639E-4));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // p must be between 0.0 and 1.0, inclusive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
        double double0 = fDistributionImpl0.cumulativeProbability((-751.788662152));
        Assert.assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(626.9674192, 626.9674192);
        double double0 = fDistributionImpl0.getInitialDomain((-1.0));
        Assert.assertEquals(626.9674192, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.0032001668223924, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 2546.0);
        double double0 = fDistributionImpl0.getDomainUpperBound(207.9277);
        Assert.assertEquals(1.7976931348623157E308, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.7976931348623157E308, double0, 0.01);
        Assert.assertEquals(2546.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(402.101723210276, 402.101723210276);
        double double0 = fDistributionImpl0.getDomainLowerBound((-1183.288));
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(402.101723210276, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(402.101723210276, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.getInitialDomain(1.0E-15);
        // AssertFixer: old assertion Assert.assertEquals((-5.000000000000003E-16), double0, 0.01)
        Assert.assertEquals(1.0, double0, 0.01);
    }
}

