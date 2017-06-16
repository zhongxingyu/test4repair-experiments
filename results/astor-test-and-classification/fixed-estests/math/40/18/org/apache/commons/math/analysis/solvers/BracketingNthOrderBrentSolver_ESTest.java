/**
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 23:17:21 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(289, ((UnivariateFunction) (sincFunction0)), (-343.494948663488), (-3.5392250480081715E-9), ((double) (-161)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-160.22122533307953), double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(Double.NaN, Double.NaN, 0.5, 2);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(0, ((UnivariateFunction) (xMinus5Function0)), 0.0, 0.0625, allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 373.437245109979, 0.0, 4);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (sinFunction0)), 0.0, 0.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3.544454505759402E-4, 179);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(179, ((UnivariateFunction) (sinFunction0)), 3.544454505759402E-4, ((double) (179)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [0, 179], values: [0, 0.071]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(7562, ((UnivariateFunction) (sincFunction0)), ((double) (538)), 1068.1, 1035.4605000000001, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [538, 1,068.1], values: [-0.001, -0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-0.0625), (-0.0625), (-0.0625), 2);
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
    public void test06() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 0.0, 5);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (xMinus5Function0)), 0.0, 361.29, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(977.5039968952651, 9.423976538577447E138, 8664);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(8664, ((UnivariateFunction) (expm1Function0)), (-3295.324167567), 9.423976538577447E138, ((double) (8664)), allowedSolution0);
        Assert.assertEquals(8664.0, double0, 0.01);
        Assert.assertEquals(8664, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(538, ((UnivariateFunction) (sincFunction0)), (-1878.9674), 1035.4605000000001, allowedSolution0);
        Assert.assertEquals(738.2742735936013, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3.544454505759402E-4, 179);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(815, ((UnivariateFunction) (sinFunction0)), 431.09869947, ((double) (815)), allowedSolution0);
        Assert.assertEquals(571.7698624388956, double0, 0.01);
        Assert.assertEquals(179, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 927.3487666430678, 5);
        SincFunction sincFunction0 = new SincFunction();
        bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (sincFunction0)), 0.0, ((double) (5)));
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
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1079.88), 2643.2106, (-1079.88), 140);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        bracketingNthOrderBrentSolver0.setup(1351, univariateFunction0, 0.5, 2643.2106, 140);
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [0.5, 2,643.211], values: [-0.163, -0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 928.0668980662253, 5);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (-1709.472656008811), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.7454306955949023E94, 822.90305, 822.90305, 1376);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1376, ((UnivariateFunction) (sinFunction0)), ((double) (1376)), 1.7454306955949023E94, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1376.0, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(1376.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 0.0, 5);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 0.0, ((double) (5)));
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 927.8084912530232, 5);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (-522.0), 778.086836472849, 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-864.71975639), ((double) (-1880)), ((double) (-1880)), (-1880));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -1,880 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1531.0, 1531.0, (-1967));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -1,967 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2108.94360991419, 1.0E-12, 2058);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(0, ((UnivariateFunction) (quinticFunction0)), 1.0E-12, 1215.98, 3.3295791581622325E-6, allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (-38)), (-38));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -38 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 928.0668980662253, 5);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (sincFunction0)), 0.0, ((double) (5)), (-3259.5), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, -3,259.5]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(538, ((UnivariateFunction) (sincFunction0)), 0.567397952079773, 1035.4605000000001, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.7454306955949023E94, 822.90305, 822.90305, 1376);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(1376, int0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(368, ((UnivariateFunction) (sinFunction0)), (-2435.35392894), 8.778184761057927, allowedSolution0);
        // AssertFixer: old assertion Assert.assertEquals((-2434.7343065320797), double0, 0.01)
        Assert.assertEquals(-2371.9024527743086, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(2351, ((UnivariateFunction) (sincFunction0)), (-47.44985022), ((double) (2351)), 573.9717657);
        // AssertFixer: old assertion Assert.assertEquals(43.98229714686233, double0, 0.01)
        Assert.assertEquals(-3.141592651117585, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(7562, univariateFunction0, ((double) (538)), ((double) (7562)), 1035.4605000000001, allowedSolution0);
        // AssertFixer: old assertion Assert.assertEquals(978.6050899825423, double0, 0.01)
        Assert.assertEquals(972.321897820417, double0, 0.01);
    }
}

