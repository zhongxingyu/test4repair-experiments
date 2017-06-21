/**
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 19:44:16 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4928, ((UnivariateFunction) (monitoredFunction0)), 0.0, ((double) (4928)), allowedSolution0);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-307.941904600912), (-533.8823547704552), 734);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(734, ((UnivariateFunction) (sincFunction0)), (-533.8823547704552), (-307.941904600912), allowedSolution0);
        Assert.assertEquals(734, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-361.28315516282623), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(1, ((UnivariateFunction) (quinticFunction0)), (-2323.67898), 131.82643792, allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (1) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(1464, ((UnivariateFunction) (sincFunction0)), ((double) (1464)), ((double) (1464)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [1,464, 1,464]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0, 1.0, 1.0, 673);
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(673, ((UnivariateFunction) (null)), (-2595.0758303130565), ((double) (673)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve((-2146300880), ((UnivariateFunction) (sinFunction0)), (-1.0269104918360675E-7), 634.8688993366, 0.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (-2,146,300,880) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), ((double) (1497)), ((double) (1497)), ((double) (1497)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [1,497, 1,497]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 1628);
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve((-1105), ((UnivariateFunction) (null)), 0.5, 0.5, Double.NaN, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), (-1448.90328430518), 207.91198481891436, (-0.34748951505581405), ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-111788.10525583797), 1.0E-6, (-111788.10525583797), 2);
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2734.731344506966, Integer.MAX_VALUE);
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.doSolve();
            Assert.fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2157, ((UnivariateFunction) (xMinus5Function0)), 1.0E-6, ((double) (2157)), allowedSolution0);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(752, ((UnivariateFunction) (sincFunction0)), ((double) (752)), 1143.68);
        Assert.assertEquals(1143.5397259035738, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), (-5.04395047883692E-7), ((double) (1497)), 0.012962474445184545, allowedSolution0);
        Assert.assertEquals(1.4124952745718794E-11, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.4355295199222438), 232);
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sinFunction0)));
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(232, ((UnivariateFunction) (monitoredFunction0)), (-1.4355295199222438));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [\uFFFD, \uFFFD], values: [\uFFFD, \uFFFD]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), (-1428.5430266409353), ((double) (1497)), (-0.347489515056), allowedSolution0);
        Assert.assertEquals(873.3627576979621, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(873.3627576979621, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2054134625, ((UnivariateFunction) (sinFunction0)), (-2124.7968087933305), 2282.639, (-1448.90328430518), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1815.8405537954895), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), 0.0, ((double) (1497)), 0.012962474445184545, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (752)), (-508.9380090763223), 0.0, 1);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // 1 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(Double.NaN, Double.NaN, Double.NaN, 79);
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (null)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(1785, ((UnivariateFunction) (monitoredFunction0)), ((double) (1785)), 2550.06760389, allowedSolution0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-438.25), (-438.25), (-796));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -796 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-307.941904600912), (-533.8823547704552), 734);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(734, ((UnivariateFunction) (sincFunction0)), ((double) (734)), 1143.68);
        Assert.assertEquals(734, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(917.3450548482197, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, 0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // 0 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(1495, ((UnivariateFunction) (sinFunction0)), (-1448.90328430518), 209.201383542621, 0.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (xMinus5Function0)), 0.0853363266917313, ((double) (5)), allowedSolution0);
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (5) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), (-1448.90328430518), 207.91198481891436, (-0.34748951505581405), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        // AssertFixer: old assertion Assert.assertEquals((-267.0353759666259), double0, 0.01)
        Assert.assertEquals(-235.61944904282876, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), (-1448.90328430518), 207.97175949222128, (-0.347489515056), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        // AssertFixer: old assertion Assert.assertEquals((-298.4513016887241), double0, 0.01)
        Assert.assertEquals(-248.18581953113778, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (sinFunction0)), (-1448.90328430518), ((double) (1497)), 11.014225331207957, allowedSolution0);
        // AssertFixer: old assertion Assert.assertEquals((-285.8849314766707), double0, 0.01)
        Assert.assertEquals(-612.6105674500096, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }
}
