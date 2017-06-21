/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 09:15:40 GMT 2017
 */


package org.apache.commons.math.distribution;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.junit.Test;

public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(165.0222249721, 165.0222249721);
        // Undeclared exception!
        try {
            fDistributionImpl0.setDenominatorDegreesOfFreedom(0.0);
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
        double double0 = fDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        Assert.assertEquals(1.7976931348623157E308, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.7976931348623157E308, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(2.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(417.46078174, 417.46078174);
        double double0 = fDistributionImpl0.cumulativeProbability(2.0);
        Assert.assertEquals(0.999999999998791, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.9999999999998416, 1.0E-15);
        // Undeclared exception!
        try {
            fDistributionImpl0.setNumeratorDegreesOfFreedom((-5.000000000000003E-16));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // degrees of freedom must be positive.
            // 
            EvoAssertions.verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1343.82896303, 1343.82896303);
        double double0 = fDistributionImpl0.cumulativeProbability((-571.33162748465));
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(1343.82896303, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1343.82896303, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(417.46078174, 417.46078174);
        double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
        Assert.assertEquals(417.46078174, double0, 0.01);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(417.46078174, 417.46078174);
        double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
        Assert.assertEquals(417.46078174, double0, 0.01);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(30.8460321, 1.0E-14);
        // Undeclared exception!
        try {
            fDistributionImpl0.setDenominatorDegreesOfFreedom((-1190.599523046755));
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
    public void test10() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
        Assert.assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(417.46078174, 417.46078174);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(417.46078174, 417.46078174);
        double double0 = fDistributionImpl0.getInitialDomain(0.0);
        Assert.assertEquals(1.0048139321156229, double0, 0.01);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(417.46078174, 417.46078174);
        double double0 = fDistributionImpl0.getDomainUpperBound(417.46078174);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(1.7976931348623157E308, double0, 0.01);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(417.46078174, 417.46078174);
        double double0 = fDistributionImpl0.getDomainLowerBound((-2676.552));
        Assert.assertEquals(417.46078174, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(417.46078174, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(30.8460321, 1.0E-14);
        double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
        Assert.assertEquals((-7.105427357601002E-15), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.9999999999998416, 1.0E-15);
        double double0 = fDistributionImpl0.getInitialDomain(0.9999999999998416);
        Assert.assertEquals(0.9999999999998416, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
        // AssertFixer: old assertion Assert.assertEquals((-5.000000000000003E-16), double0, 0.01)
        Assert.assertEquals(1.0, double0, 0.01);
    }
}
