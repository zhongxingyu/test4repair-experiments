/**
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 20:58:32 GMT 2017
 */


package org.apache.commons.math.distribution;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.junit.Test;

public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(136.68, 136.68);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability((-1735.4124356));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // p must be between 0.0 and 1.0, inclusive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1178.0, 1178.0);
        double double0 = fDistributionImpl0.getInitialDomain(0.0);
        Assert.assertEquals(1178.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.001700680272109, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.0013483721776885726, 2.001348372177689);
        double double0 = fDistributionImpl0.getDomainUpperBound((-152.5089043903111));
        Assert.assertEquals(0.0013483721776885726, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.7976931348623157E308, double0, 0.01);
        Assert.assertEquals(2.001348372177689, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 1.7976931348623157E308);
        double double0 = fDistributionImpl0.getDomainLowerBound(1.7976931348623157E308);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(1.7976931348623157E308, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.7976931348623157E308, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
        double double0 = fDistributionImpl0.cumulativeProbability(1.0);
        Assert.assertEquals(0.4999999999999993, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 296.8325963746168);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability(296.8325963746168);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // p must be between 0.0 and 1.0, inclusive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
        fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0);
        Assert.assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
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
    public void test09() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
        // Undeclared exception!
        try {
            fDistributionImpl0.setNumeratorDegreesOfFreedom(0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
        fDistributionImpl0.setNumeratorDegreesOfFreedom(539.2883);
        Assert.assertEquals(539.2883, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2517.0, 2517.0);
        double double0 = fDistributionImpl0.cumulativeProbability((-2148.7));
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(2517.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(2517.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(668.4592015175, 1.0E-15);
        double double0 = fDistributionImpl0.cumulativeProbability(1.0E-15);
        Assert.assertEquals((-8.43769498715119E-14), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(668.4592015175, 1.0E-15);
        double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
        Assert.assertEquals(1.0E-15, double0, 0.01);
        Assert.assertEquals(668.4592015175, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 296.8325963746168);
        double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
        Assert.assertEquals(1.0E-15, double0, 0.01);
        Assert.assertEquals(296.8325963746168, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        FDistributionImpl fDistributionImpl0 = null;
        try {
            fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        FDistributionImpl fDistributionImpl0 = null;
        try {
            fDistributionImpl0 = new FDistributionImpl((-690.727550266), (-690.727550266));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
        Assert.assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
        Assert.assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1703.0268761, 1703.0268761);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
        Assert.assertEquals(1703.0268761, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1703.0268761, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(548.0, 548.0);
        try {
            fDistributionImpl0.inverseCumulativeProbability(0.9999999999999996);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Number of iterations=1, maximum iterations=2,147,483,647, initial=1.004, lower bound=0, upper bound=179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, final a value=0.004, final b value=2.004, f(a)=-1, f(b)=0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.0013483721776885726, 2.001348372177689);
        // Undeclared exception!
        fDistributionImpl0.inverseCumulativeProbability(0.0013483721776885726);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.getInitialDomain(1.0E-15);
        // AssertFixer: old assertion Assert.assertEquals((-5.000000000000003E-16), double0, 0.01)
        Assert.assertEquals(1.0, double0, 0.01);
    }
}

