/**
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 01:47:09 GMT 2017
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
            fDistributionImpl0 = new FDistributionImpl(1717.5761, 0.0);
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
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2684.5884, 2684.5884);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability(2684.5884);
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
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability((-0.4919138160976202));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // p must be between 0.0 and 1.0, inclusive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3717.48377351, 3717.48377351);
        double double0 = fDistributionImpl0.cumulativeProbability(1635.6776, 3717.48377351);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.cumulativeProbability((-139.31759892974486), 1.0E-15);
        Assert.assertEquals(0.49999999999999195, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1686.837, 1686.837);
        double double0 = fDistributionImpl0.getInitialDomain(1686.837);
        Assert.assertEquals(1.0011870584513516, double0, 0.01);
        Assert.assertEquals(1686.837, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1999.9422721417627, 1999.9422721417627);
        double double0 = fDistributionImpl0.getDomainUpperBound(1999.9422721417627);
        Assert.assertEquals(1999.9422721417627, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.7976931348623157E308, double0, 0.01);
        Assert.assertEquals(1999.9422721417627, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.getDomainLowerBound(0.49999999999999195);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(611.0, 1.0E-15);
        double double0 = fDistributionImpl0.cumulativeProbability(1.0E-15);
        Assert.assertEquals((-7.971401316808624E-14), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(124.2817435279776, 124.2817435279776);
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
    public void test12() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(654.74352, 2.0);
        fDistributionImpl0.setNumeratorDegreesOfFreedom(2213.3486291707745);
        Assert.assertEquals(2213.3486291707745, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3717.48377351, 3717.48377351);
        double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
        Assert.assertEquals(3717.48377351, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(3717.48377351, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3717.48377351, 3717.48377351);
        double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
        Assert.assertEquals(3717.48377351, double0, 0.01);
        Assert.assertEquals(3717.48377351, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
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
    public void test16() throws Throwable {
        FDistributionImpl fDistributionImpl0 = null;
        try {
            fDistributionImpl0 = new FDistributionImpl((-1576.707643), 0.0);
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
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3717.48377351, 3717.48377351);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
        Assert.assertEquals(3717.48377351, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(3717.48377351, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(124.2817435279776, 124.2817435279776);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(124.2817435279776, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(124.2817435279776, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2057.1757841754, 2057.1757841754);
        double double0 = fDistributionImpl0.cumulativeProbability(0.0);
        Assert.assertEquals(2057.1757841754, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(2057.1757841754, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.399464998481189E-5, 3.399464998481189E-5);
        double double0 = fDistributionImpl0.cumulativeProbability(3.399464998481189E-5);
        Assert.assertEquals(0.4999125625328999, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
        double double0 = fDistributionImpl0.getInitialDomain(1.0E-15);
        // AssertFixer: old assertion Assert.assertEquals((-5.000000000000003E-16), double0, 0.01)
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.399464998481189E-5, 3.399464998481189E-5);
        fDistributionImpl0.setDenominatorDegreesOfFreedom(0.4999125625328999);
        {
            fDistributionImpl0.inverseCumulativeProbability(3.399464998481189E-5);
        }
    }
}

