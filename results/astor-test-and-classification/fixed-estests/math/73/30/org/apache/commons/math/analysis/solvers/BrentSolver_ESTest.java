/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 09:14:18 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 1.0E-15, 1009.348966738121);
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-4058.75), 1.0E-15);
        Assert.assertEquals(1.0E-15, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 1.0E-15, 0.5231192579214786);
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        brentSolver0.setFunctionValueAccuracy((-22.15037));
        double double0 = brentSolver0.solve((-1207.416), 0.0, (-22.15037));
        Assert.assertEquals(13, brentSolver0.getIterationCount());
        Assert.assertEquals((-0.9999999995634418), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.setFunctionValueAccuracy((-1747.9));
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, ((double) (1)), 0.007088987306907213);
        Assert.assertEquals(20, brentSolver0.getIterationCount());
        Assert.assertEquals(0.007088987306907213, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 1701.5743665, 0.007088987306907213);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-338.0593), 1.0, 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve((-1833.8084496698546), 0.0, (-862.8513952633799));
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = brentSolver0.solve((-1870.0), 3198.0, (-1.0));
        Assert.assertEquals(8, brentSolver0.getIterationCount());
        Assert.assertEquals((-4.845638936665878E-8), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = brentSolver0.solve((-666.398387913356), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = brentSolver0.solve(2070.2418875222, Double.NaN);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (quinticFunction0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = brentSolver0.solve((-476.7113757616257), (-1.0));
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 142.7119927621, 1.1555426754350506E-15, 0.0012715549630773451);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid interval, initial value parameters:  lower=142.712, initial=0.001, upper=0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (null)), 8.639617172210586E-5, 1553.48607, 0.06424963431975636);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        brentSolver0.setMaximalIterationCount((-1));
        try {
            brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-1107.8264382428), 877.0);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-1) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (null)), 2823.09384752, 3339.0718591151613);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        // Undeclared exception!
        try {
            brentSolver0.solve(2104.05124257, 0.5, (-4.845638936665878E-8));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid interval, initial value parameters:  lower=2,104.051, initial=-0, upper=0.5
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve((-1.0), 1349.5, 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve((-4346.5941897), 2637.92);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BrentSolver brentSolver0 = null;
        try {
            brentSolver0 = new BrentSolver(((UnivariateRealFunction) (null)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function to solve cannot be null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-3518.06394), 0.0, (-0.22458908321290638));
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-9.168247096424828), 589.896196350105);
        Assert.assertEquals(28, brentSolver0.getIterationCount());
        Assert.assertEquals((-9.932703458689776E-10), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        brentSolver0.setAbsoluteAccuracy((-957.507921));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-957.507921), 0.5, (-3.877841166378932E-13));
        Assert.assertEquals(2, brentSolver0.getIterationCount());
        Assert.assertEquals((-3.1554436208840472E-30), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 1593.12);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(univariateRealFunction0, 0.0, 2181.3890010293);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs.  Endpoints: [0, 2,181.389], Values: [1, \u221E]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 1.1555426754350506E-15, 142.7119927621);
        Assert.assertEquals(1.1555426754350506E-15, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-9.168247096424828), (-1.2246467991473532E-16));
        Assert.assertEquals((-1.2246467991473532E-16), double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), Double.NaN, 1.0E-6);
        Assert.assertEquals(1.0E-6, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        try {
            BrentSolver brentSolver0 = new BrentSolver();
            Expm1Function expm1Function0 = new Expm1Function();
            double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 1.0, 2907.11112024, 1689.2353653591335);
            Assert.assertEquals(31, brentSolver0.getIterationCount());
            Assert.assertEquals(2501.15253515779, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: ");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), ((double) (-2377)), 1009.348966738121, 800.909);
        Assert.assertEquals(18, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.175828437592118E-10), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 1.0E-15, 0.06872431562286441, 0.00153269237837571);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-10.86708721155), 81.9648912753116, 1.0E-15);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve((-1833.8084496698546), 1.0E-15, (-862.8513952633799));
        Assert.assertEquals(2.5000000000000007E-16, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        brentSolver0.setAbsoluteAccuracy(Double.NaN);
        try {
            brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-10.86708721155), 81.9648912753116, 1.0E-6);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (100) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }
}

