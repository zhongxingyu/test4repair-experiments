/**
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 19:38:10 GMT 2017
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

public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double double0 = UnivariateRealSolverUtils.midpoint((-157.7317), (-2024.85761));
        Assert.assertEquals((-1091.294655), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (expm1Function0)), (-2183.8078979973334), (-2183.8078979973334), (-2183.8078979973334), 0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // bad value for maximum iterations number: 0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 3998.32132276282, 0.0);
        Assert.assertEquals(1245.641487148353, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (expm1Function0)), (-658.72186), 1.0, 1.0);
        Assert.assertEquals((-0.12899902661959173), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (expm1Function0)), (-1901.0964974643177), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (quinticFunction0)), (-2186.0), (-1.0));
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double double0 = UnivariateRealSolverUtils.midpoint(3745.55545765173, 3745.55545765173);
        Assert.assertEquals(3745.55545765173, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (null)), 0.0, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function is null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (null)));
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (monitoredFunction0)), ((double) (0)), (-2184.2), 2368.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (monitoredFunction0)), (-1727.28647), (-1727.28647), 0.0, 2);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertArrayEquals(new double[]{ -1727.28647 , -1726.28647 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (expm1Function0)), 1520.541068286795, 0.5, 0.5, 1);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=0.5,  initial=1,520.541, upper bound=0.5
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (expm1Function0)), 0.0, 0.0, 0.0, 510);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (null)), (-1.0), (-1.0), (-1.0));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function is null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        try {
            UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0), (-1.0), 0.5, 812);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // number of iterations=2, maximum iterations=812, initial=-1, lower bound=-1, upper bound=0.5, final a value=-1, final b value=0.5, f(a)=0.368, f(b)=1.649
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), 1.0E-15, 1.0E-15, 2.037736787529427E15, 2);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // number of iterations=2, maximum iterations=2, initial=0, lower bound=0, upper bound=2,037,736,787,529,427, final a value=0, final b value=2, f(a)=0, f(b)=22.5
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), Double.NaN, (-2068.506662), (-3704.551));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=-2,068.507,  initial=\uFFFD, upper bound=-3,704.551
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (sinFunction0)), 0.0, 1245.641487148353, 0.0, 1505);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=1,245.641,  initial=0, upper bound=0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (expm1Function0)), 1438.467201259, (-2190.225456739), 1438.467201259, (-2121));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // bad value for maximum iterations number: -2,121
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (null)), (-848.1339927115), (-848.1339927115), 1.0, (-582));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function is null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (sinFunction0)), 0.0, 3998.32132276282, 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (expm1Function0)), (-1865.3155271199), 1438.467201259);
        Assert.assertEquals(3.855477728629883E-8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (monitoredFunction0)), Double.NaN, (-2149.4879519458054), 2.625971125758784E26);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertArrayEquals(new double[]{ Double.NaN , Double.NaN }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        {
            UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-658.72186), (-658.72186), 1.0);
        }
    }
}

