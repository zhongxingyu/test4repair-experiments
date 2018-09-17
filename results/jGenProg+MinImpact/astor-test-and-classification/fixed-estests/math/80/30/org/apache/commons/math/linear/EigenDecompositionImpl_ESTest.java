/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 10:22:43 GMT 2017
 */


package org.apache.commons.math.linear;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = -0.9899924966004454;
        double[] doubleArray1 = new double[2];
        doubleArray0[0] = -0.9899924966004454;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1334.5312819432486));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 2.0;
        doubleArray0[1] = 117.07891658;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.1411200080598672);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 9.0);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -1
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -2847.071693681728;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1362.0));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(2847.071693681728, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -2847.071693681728;
        doubleArray0[1] = -0.9899924966004454;
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1334.5312819432486));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals((-0.9899924966005074), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -2847.071693681728;
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = -2847.071693681728;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(2.3077842786740334E10, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 3.626860407847019;
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 3.626860407847019;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-47.70814403668455), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        try {
            eigenDecompositionImpl0.getRealEigenvalue(16);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // 16
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        try {
            eigenDecompositionImpl0.getImagEigenvalue(8034639);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // 8034639
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), (-3392.0));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((RealMatrix) (null)), (-1311.0));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 1.414213562373095;
        doubleArray1[3] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals((-1.782533746251396E-15), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[4] = 510.57148866281307;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 1.414213562373095;
        doubleArray1[3] = 1.414213562373095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals(2042.285954651254, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        doubleArray0[1] = 512.270962610794;
        doubleArray0[2] = 512.270962610794;
        doubleArray0[3] = -6.044830337;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -6.044830337;
        doubleArray1[1] = 512.270962610794;
        doubleArray1[2] = -6.044830337;
        doubleArray1[3] = 512.270962610794;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals(4.91210282356396E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.4;
        doubleArray1[1] = 512.270962610794;
        doubleArray1[2] = 1.4;
        doubleArray0[2] = 512.270962610794;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        doubleArray0[3] = 1.414213562373095;
        doubleArray0[4] = 12.566370614359172;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 1.414213562373095;
        doubleArray1[3] = 1.414213562373095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals((-5.728595574231879), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -13.65469995513191;
        doubleArray1[1] = 0.4957649282603583;
        doubleArray1[2] = -13.65469995513191;
        doubleArray1[3] = 5.304645611658998E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3451.55;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.19718130178263849;
        doubleArray1[1] = 569.66968910497;
        doubleArray1[2] = 0.19718130178263849;
        doubleArray1[3] = 3451.55;
        doubleArray1[4] = 0.19718130178263849;
        doubleArray1[5] = 3451.55;
        doubleArray1[6] = 0.19718130178263849;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6.318593225083861E-26);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 0.08325;
        doubleArray0[2] = 0.08325;
        doubleArray0[3] = 512.270962610794;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 0.08325;
        doubleArray0[0] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // 
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        doubleArray0[1] = 0.08325;
        doubleArray0[2] = 0.08325;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 1.414213562373095;
        doubleArray1[3] = 12.566370614359172;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals(2.4077170496708213E-11, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = -20.359000244106596;
        doubleArray0[2] = -20.359000244106596;
        doubleArray0[3] = -20.359000244106596;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = -20.359000244106596;
        doubleArray1[2] = 1.414213562373095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = 512.270962610794;
        doubleArray0[3] = 512.270962610794;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 0.08325;
        doubleArray1[3] = 512.270962610794;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals(2.6886186892417955E8, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 1.414213562373095;
        doubleArray1[3] = 512.270962610794;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        doubleArray0[4] = 512.270962610794;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 1.414213562373095;
        doubleArray1[3] = 1.414213562373095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals(2056.1845022899697, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 1.414213562373095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        Assert.assertEquals(8.943339957490076E-16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        doubleArray0[1] = 0.4957649282603583;
        doubleArray0[2] = 11.871815721437736;
        double[] doubleArray1 = new double[4];
        doubleArray0[3] = 5.304645611658998E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1320.7916121484393));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = -2847.071693681728;
        doubleArray0[2] = -0.9899924966004454;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -2847.071693681728;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1362.0));
        Assert.assertEquals(8024698.235486457, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = 0.4957649282603583;
        doubleArray0[3] = 1.1102230246251565E-16;
        double[] doubleArray1 = new double[4];
        doubleArray0[4] = 0.4957649282603583;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // cannot solve degree 3 equation
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 0.4957649282603583;
        doubleArray0[4] = 11.871815721437736;
        double[] doubleArray1 = new double[4];
        doubleArray0[2] = 1.4142135624;
        doubleArray0[3] = 5.304645611658998E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1320.7916121484393));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 0.4957649282603583;
        doubleArray0[3] = 1.4142135624;
        doubleArray0[4] = 11.871815721437736;
        double[] doubleArray1 = new double[4];
        doubleArray0[2] = 1.4142135624;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1320.7916121484393));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // 
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1334.5312819432486));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1939.35);
        eigenDecompositionImpl1.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1362.0));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        eigenDecompositionImpl0.getVT();
        try {
            eigenDecompositionImpl0.getEigenvector((-5010));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -5010
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1334.5312819432486));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(3, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 412.303);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1334.5312819432486));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1939.35);
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 412.303;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 412.303);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-2174.80618396391));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // eigen decomposition of assymetric matrices not supported yet
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1320.7916121484393));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1334.5312819432486));
        eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1362.0));
        eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1320.7916121484393));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        doubleArray0[1] = 512.270962610794;
        doubleArray0[2] = 512.270962610794;
        doubleArray0[3] = 512.270962610794;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 1.414213562373095;
        doubleArray1[3] = 512.270962610794;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        // AssertFixer: old assertion Assert.assertEquals((-5.7083440245597164E13), eigenDecompositionImpl0.getDeterminant(), 0.01)
        Assert.assertEquals(-7.001560468854417E13, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3451.55;
        doubleArray0[3] = 0.19718130178263849;
        doubleArray0[4] = 569.66968910497;
        doubleArray0[5] = 0.19718130178263849;
        doubleArray0[6] = 0.19718130178263849;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.19718130178263849;
        doubleArray1[1] = 569.66968910497;
        doubleArray1[2] = 0.19718130178263849;
        doubleArray1[3] = 3451.55;
        doubleArray1[4] = 0.19718130178263849;
        doubleArray1[5] = 3451.55;
        doubleArray1[6] = 0.19718130178263849;
        doubleArray1[7] = 569.66968910497;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6.318593225083861E-26);
        // AssertFixer: old assertion Assert.assertEquals(2.860161170977122E30, eigenDecompositionImpl0.getDeterminant(), 0.01)
        Assert.assertEquals(5.15892480510072E28, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 512.270962610794;
        doubleArray0[2] = 1.0658569614325604;
        doubleArray0[3] = 1.414213562373095;
        doubleArray0[4] = 12.566370614359172;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.414213562373095;
        doubleArray1[1] = 1.414213562373095;
        doubleArray1[3] = 512.270962610794;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1321.9450959));
        // AssertFixer: old assertion Assert.assertEquals(8.923400081778607E12, eigenDecompositionImpl0.getDeterminant(), 0.01)
        Assert.assertEquals(2.694030310096254E8, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}
