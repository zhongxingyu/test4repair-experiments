/**
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 23:53:38 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = illinoisSolver0.solve(1257, univariateRealFunction0, (-828.31518966), 0.0, 0.0);
        Assert.assertEquals((-828.31518966), double0, 0.01);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-128.9961), 0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = illinoisSolver0.solve(6, univariateRealFunction0, 0.0, ((double) (6)));
        Assert.assertEquals(6.0, illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-56.5839675), (-1175.2810388), (-220.907942148295));
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(Integer.MAX_VALUE, univariateRealFunction0, 1.0E-6, (-2998.48313549738), (-3643.01), allowedSolution0);
        Assert.assertEquals((-3643.01), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2998.48313549738), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(6346, ((UnivariateRealFunction) (quinticFunction0)), 0.1538461446762085, 0.0, (-8.0E298));
        Assert.assertEquals(0.1538461446762085, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-440.0), (-440.0), (-2015.0));
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            illinoisSolver0.solve(0, ((UnivariateRealFunction) (xMinus5Function0)), (-440.0), ((double) (0)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(2268, ((UnivariateRealFunction) (sincFunction0)), ((double) (2268)), 0.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [2,268, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-4120.897500982776));
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(0, ((UnivariateRealFunction) (null)), (-1194.4210008907), 0.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, 17.300189677288635);
        SincFunction sincFunction0 = new SincFunction();
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(1227, ((UnivariateRealFunction) (sincFunction0)), (-2507.221154331), 17.300189677288635, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-515.1398005336), 1531.25);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(0, ((UnivariateRealFunction) (xMinus5Function0)), ((double) (0)), (-364.40889859), 0.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 1056.43524337);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(90, ((UnivariateRealFunction) (sinFunction0)), (-3534.25605184397), (-3534.25605184397), 617.121, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-3,534.256, -3,534.256]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        // Undeclared exception!
        try {
            illinoisSolver0.solve(833, ((UnivariateRealFunction) (sincFunction0)), ((double) (833)), 2291.0, 2291.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [833, 2,291], values: [-0.001, -0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-2039.22563), 0.0, (-2039.22563));
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            pegasusSolver0.solve(1, ((UnivariateRealFunction) (expm1Function0)), 0.5, ((double) (1)), (-2039.22563));
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (1) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        // Undeclared exception!
        try {
            illinoisSolver0.solve(3, ((UnivariateRealFunction) (xMinus5Function0)), 1035.799355347, 0.0, (-470.2));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [1,035.799, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.08713622391223907, 0.08713622391223907);
        // Undeclared exception!
        try {
            pegasusSolver0.solve((-2037), ((UnivariateRealFunction) (null)), 0.0, 0.0, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.0);
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (null)));
        // Undeclared exception!
        try {
            pegasusSolver0.solve(1416, ((UnivariateRealFunction) (monitoredFunction0)), (-306.9481800782146), 0.0, 780.193209);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(3.1647279523180805E13, 3.1647279523180805E13);
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        illinoisSolver0.setup(2747, monitoredFunction0, (-4.999986759274532), 1248.0, 1.3070082041895);
        // Undeclared exception!
        try {
            illinoisSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (2,747) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5);
        // Undeclared exception!
        try {
            regulaFalsiSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(3185.192335368614, (-1846.1006109257985), 0.0);
        SinFunction sinFunction0 = new SinFunction();
        pegasusSolver0.setup(2014, sinFunction0, 3185.192335368614, 2014, 0.0);
        // Undeclared exception!
        try {
            pegasusSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [3,185.192, 2,014]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        UnivariateRealFunction univariateRealFunction0 = xMinus5Function0.derivative();
        illinoisSolver0.setup(1851, univariateRealFunction0, (-2109.82119955676), 1851, (-1.0E-6));
        // Undeclared exception!
        try {
            illinoisSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [-2,109.821, 1,851], values: [1, 1]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, (-379.0));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, ((UnivariateRealFunction) (sincFunction0)), 9.0, 17.300189677288635, (-2171.9450865243625), allowedSolution0);
        Assert.assertEquals((-2171.9450865243625), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(12.669353720274671, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, (-379.0));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, univariateRealFunction0, (-1279.2317), 9.0, allowedSolution0);
        Assert.assertEquals((-635.11585), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1257.4038215200733), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(3.1647279523180805E13, 3.1647279523180805E13);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(180, univariateRealFunction0, (-3605.567174789104), 369.2696507461441, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals((-1618.1487620214798), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(369.2696507461441, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, (-379.0));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, univariateRealFunction0, (-2507.221154331), 17.300189677288635, allowedSolution0);
        Assert.assertEquals((-2507.221154331), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals((-2418.7054847202508), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, (-379.0));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, ((UnivariateRealFunction) (sincFunction0)), (-2507.221154331), 17.300189677288635, allowedSolution0);
        Assert.assertEquals(17.300189677288635, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-2503.251547736162), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, 17.300189677288635);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, ((UnivariateRealFunction) (sincFunction0)), 9.0, 17.300189677288635, (-2173.6426708), allowedSolution0);
        Assert.assertEquals((-2173.6426708), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(12.669353720274671, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, 17.300189677288635);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(680661812, ((UnivariateRealFunction) (sincFunction0)), 4.782976478933542E-8, 17.300189677288635, (-1279.2317), allowedSolution0);
        Assert.assertEquals((-1279.2317), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(16.355039131577453, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, 17.300189677288635);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, univariateRealFunction0, (-2507.221154331), 17.300189677288635, allowedSolution0);
        Assert.assertEquals((-2507.221154331), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals((-2456.124422508514), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, 17.300189677288635);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, ((UnivariateRealFunction) (sincFunction0)), 7.66326877510437E-8, 17.300189677288635, (-2173.6426708), allowedSolution0);
        Assert.assertEquals((-2173.6426708), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(7.66326877510437E-8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-379.0), 17.300189677288635, 17.300189677288635);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(2374, ((UnivariateRealFunction) (sincFunction0)), 9.0, 17.300189677288635, ((double) (2374)), allowedSolution0);
        Assert.assertEquals(2374.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(17.300189677288635, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(213, univariateRealFunction0, (-3604.63), 361.54521331249083, allowedSolution0);
        Assert.assertEquals((-1621.5423933437546), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3469.8887976962606), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
            SinFunction sinFunction0 = new SinFunction();
            double double0 = regulaFalsiSolver0.solve(903, ((UnivariateRealFunction) (sinFunction0)), 1.0, ((double) (903)), ((double) (903)));
            Assert.assertEquals(903.0, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(235.61944901923448, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-128.9961), 0.0);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = illinoisSolver0.solve(6, ((UnivariateRealFunction) (sincFunction0)), (-128.9961), 0.0, 2127.9909249);
        Assert.assertEquals(2127.9909249, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-128.80529879718154), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.324072546818198E-5, 1.324072546818198E-5);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = pegasusSolver0.solve(452, ((UnivariateRealFunction) (xMinus5Function0)), (-4595.440251), ((double) (452)), (-4595.440251));
        Assert.assertEquals((-4595.440251), pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(3592, univariateRealFunction0, 0.0, 0.0, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(3.1647279523180805E13, 3.1647279523180805E13);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(180, univariateRealFunction0, (-3604.63), 361.54521331249083, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(361.54521331249083, illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals((-3469.137059499858), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1625.85999, 1625.85999, 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        regulaFalsiSolver0.solve(186, ((UnivariateRealFunction) (monitoredFunction0)), (-481.0), 0.0, allowedSolution0);
        regulaFalsiSolver0.doSolve();
    }
}

