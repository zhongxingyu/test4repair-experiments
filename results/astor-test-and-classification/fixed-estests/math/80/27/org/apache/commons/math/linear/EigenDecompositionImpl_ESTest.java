/**
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 13:25:41 GMT 2017
 */


package org.apache.commons.math.linear;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 2.1740732162002992E-8;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.1740732162002992E-8);
        try {
            eigenDecompositionImpl0.getEigenvector((-478));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -478
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -0.473987;
        doubleArray0[2] = -0.473987;
        double[] doubleArray1 = new double[2];
        doubleArray0[1] = -0.473987;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.39820268109804);
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals((-0.1064876618763158), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -0.473987;
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.39820268109804);
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -0.473987;
        doubleArray0[1] = -0.473987;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 130.39820268109804);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 4216.43685916);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -1
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.543080634815244;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        double[][] doubleArray2 = new double[9][3];
        doubleArray2[0] = doubleArray1;
        doubleArray2[1] = doubleArray0;
        array2DRowRealMatrix0.data = doubleArray2;
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-794.5362216020444));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // no entry at indices (2, 3) in a 9x5 matrix
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -794.5362216020444;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(794.5362216020444, double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -4015577.7743601436;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals((-1.543080634815244), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        eigenDecompositionImpl0.getImagEigenvalue(5);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(3, arrayRealVector0.getDimension());
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -794.5362216020444;
        doubleArray0[1] = 1.543080634815244;
        doubleArray0[2] = 10.0;
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.543080634815244;
        double[] doubleArray1 = new double[5];
        doubleArray1[4] = 489.428336843;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1.1793116383806586E16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.39820268109804);
        try {
            eigenDecompositionImpl0.getRealEigenvalue(1189);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // 1189
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((RealMatrix) (null)), 0.25);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        array2DRowRealMatrix0.data = null;
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-794.5362216020444));
            Assert.fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 0.0);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.043081283569336E-7;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -4015577.7743601436;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -794.5362216020444;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.662337662337662;
        doubleArray1[4] = 1.3929257850442914E7;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1.5634687364067257;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.5634687364067257;
        doubleArray1[1] = 1.5634687364067257;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.5634687364067257;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.5634687364067257);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -796.7279788588671;
        doubleArray0[3] = -4015577.7743601436;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.543080634815244;
        doubleArray1[1] = -4015577.7743601436;
        doubleArray1[2] = 489.428336843;
        doubleArray1[3] = -20.987220289065878;
        doubleArray1[4] = 489.428336843;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(1.2357551099556194E28, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -794.5362216020444;
        doubleArray0[1] = 1.543080634815244;
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.543080634815244;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.543080634815244;
        doubleArray1[1] = 1.543080634815244;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.662337662337662;
        doubleArray1[4] = -2180.3;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(3.2427238672629284E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.543080634815244;
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.543080634815244;
        doubleArray0[5] = 489.428336843;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        doubleArray1[2] = -794.5362216020444;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.543080634815244;
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.543080634815244;
        doubleArray0[5] = 489.428336843;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.543080634815244;
        doubleArray1[1] = 1.543080634815244;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.662337662337662;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(1.1352261200167973E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.662337662337662;
        doubleArray1[4] = 489.428336843;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -4015577.7743601436;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -4015577.7743601436;
        doubleArray1[2] = 489.428336843;
        doubleArray1[3] = -20.987220289065878;
        doubleArray1[4] = 489.428336843;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.662337662337662;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 1.543080634815244;
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.543080634815244;
        doubleArray0[5] = 489.428336843;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.543080634815244;
        doubleArray1[1] = 1.543080634815244;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(1.1142730748306627E10, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = 1.662337662337662;
        doubleArray0[4] = 489.428336843;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 489.428336843;
        doubleArray1[1] = -4015577.105762737;
        doubleArray1[2] = 1.662337662337662;
        doubleArray1[3] = -4015577.105762737;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-794.536222));
        try {
            eigenDecompositionImpl0.getEigenvector(8);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // 8
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.543080634815244;
        doubleArray0[2] = 1.543080634815244;
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.543080634815244;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // 
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -794.5362216020444;
        doubleArray0[3] = -4015577.7743601436;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.043081283569336E-7;
        doubleArray1[1] = 1.043081283569336E-7;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.662337662337662;
        doubleArray1[4] = 1.043081283569336E-7;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals(3.7746577957243886E-19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -794.5362216020444;
        doubleArray0[3] = -4015577.7743601436;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.043081283569336E-7;
        doubleArray1[1] = 1.043081283569336E-7;
        doubleArray1[2] = -794.5362216020444;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -794.5362216020444;
        doubleArray0[0] = -4015577.7743601436;
        doubleArray0[4] = -902.056705136;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -794.5362216020444;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-794.5362216020444));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // 
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.043081283569336E-7;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.043081283569336E-7;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[4] = -2180.3;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -794.5362216020444;
        doubleArray0[0] = -4015577.774;
        doubleArray0[4] = -902.056705136;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[4] = -4015577.774;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-794.5362216020444));
        Assert.assertEquals(3.247769713925654E28, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(3.2477697139251122E28, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 10.0;
        doubleArray0[4] = -902.056705136;
        doubleArray0[5] = -902.056705136;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[4] = -902.056705136;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-794.5362216020444));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = 1.543080634815244;
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[4] = 1.543080634815244;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // cannot solve degree 3 equation
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.8502);
        eigenDecompositionImpl0.getV();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        eigenDecompositionImpl0.getV();
        try {
            eigenDecompositionImpl0.getEigenvector((-2202));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -2202
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.8502);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(3, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.8502);
        eigenDecompositionImpl0.getD();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.543080634815244;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        double[][] doubleArray2 = new double[9][3];
        doubleArray2[0] = doubleArray1;
        array2DRowRealMatrix0.data = doubleArray2;
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-794.5362216020444));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // eigen decomposition of assymetric matrices not supported yet
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.8502);
        try {
            eigenDecompositionImpl0.getImagEigenvalue(176);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // 176
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 130.8502);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.5634687364067257;
        doubleArray1[1] = 1.5634687364067257;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[4] = 489.428336843;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.5634687364067257);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        // AssertFixer: old assertion Assert.assertEquals(1.90917705037766816E17, double0, 0.01)
        Assert.assertEquals(-1.9588881123157113E13, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -4015577.7743601436;
        doubleArray0[5] = -2180.3;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.543080634815244;
        doubleArray1[1] = 1.543080634815244;
        doubleArray1[2] = -794.5362216020444;
        doubleArray1[3] = 1.662337662337662;
        doubleArray1[4] = -2180.3;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4015577.7743601436));
        // AssertFixer: old assertion Assert.assertEquals((-3.7469484513984195E22), eigenDecompositionImpl0.getDeterminant(), 0.01)
        Assert.assertEquals(-8.4588368171736928E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

