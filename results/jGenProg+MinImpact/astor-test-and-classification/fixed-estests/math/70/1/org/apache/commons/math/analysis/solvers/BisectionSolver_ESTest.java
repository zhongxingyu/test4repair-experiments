/**
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 22:16:27 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.setAbsoluteAccuracy(1.6019731760025025E-5);
        double double0 = bisectionSolver0.solve(0.0, 1.049869140625);
        Assert.assertEquals(15, bisectionSolver0.getIterationCount());
        Assert.assertEquals(8.009865880012512E-6, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-431.1322), 7.62939453E-6, 7.62939453E-6);
        Assert.assertEquals(28, bisectionSolver0.getIterationCount());
        Assert.assertEquals(4.5453542780788046E-10, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-80.4721704), 8.223E-4);
        Assert.assertEquals(26, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-1.0965419188146853E-8), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve((-431.1322), 7.62939453E-6, 4.5453542780788046E-10);
        Assert.assertEquals(28, bisectionSolver0.getIterationCount());
        Assert.assertEquals(4.5453542780788046E-10, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = bisectionSolver0.solve((-560.0), 0.0, (-1239.4));
        Assert.assertEquals(29, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-540.3539366647601), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = bisectionSolver0.solve((-3946.79925416167), 1.0E-14);
        Assert.assertEquals(31, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-854.513201400024), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.4788292570219657, 0.4788292570219657, (-2676.5275005472));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0.479, 0.479]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setMaximalIterationCount((-5760));
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (null)), (-1405.887489477), 0.0, (-2784.89428));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-5,760) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (monitoredFunction0)), (-1839.79661), (-1839.79661));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-1,839.797, -1,839.797]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (null)), (-1.0), 3.75);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve((-431.1321583), (-1148.135454311), 1.0E-15);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-431.132, -1,148.135]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setMaximalIterationCount(0);
        try {
            bisectionSolver0.solve((-3150.317046123093), 1703.0034);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (0) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 583.2);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BisectionSolver bisectionSolver0 = null;
        try {
            bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (null)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function to solve cannot be null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 537.533);
        Assert.assertEquals(29, bisectionSolver0.getIterationCount());
        Assert.assertEquals(2.50308308750391E-7, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        try {
            bisectionSolver0.solve(univariateRealFunction0, (-367.51866399138), 2.4023181443346796E35);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (100) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setMaximalIterationCount((-1118));
        try {
            bisectionSolver0.solve(0.0, 2881.4, 0.0);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-1,118) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-431.1321583), 0.0, 566.132488648974);
        Assert.assertEquals(28, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-4.0152311166748406E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 2881.4, 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        SinFunction sinFunction0 = new SinFunction();
        {
            bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1763.2424), 782.847, (-1763.2424));
        }
    }
}

