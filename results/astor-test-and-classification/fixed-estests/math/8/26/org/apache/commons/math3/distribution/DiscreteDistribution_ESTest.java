/**
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 21:25:26 GMT 2017
 */


package org.apache.commons.math3.distribution;

import org.apache.commons.math3.random.RandomAdaptor;
import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.util.Pair;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;

public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Well44497a well44497a0 = new Well44497a();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(((double) (1L)));
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497a0)), ((List<Pair<Object, Double>>) (linkedList0)));
        try {
            discreteDistribution0.sample((-1));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // number of samples (-1)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        DiscreteDistribution<String> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<String>(((List<Pair<String, Double>>) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(((double) (1L)));
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (null)), ((List<Pair<Object, Double>>) (linkedList0)));
        // Undeclared exception!
        try {
            discreteDistribution0.reseedRandomGenerator(1L);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Well19937a well19937a0 = new Well19937a();
        RandomAdaptor randomAdaptor0 = new RandomAdaptor(((RandomGenerator) (well19937a0)));
        LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
        DiscreteDistribution<Float> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Float>(((RandomGenerator) (randomAdaptor0)), ((List<Pair<Float, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            // 
            // array sums to zero
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.util.MathArrays", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Short short0 = new Short(((short) (0)));
        Pair<Short, Double> pair0 = new Pair<Short, Double>(short0, ((Double) (null)));
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (null)), ((List<Pair<Object, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
        Byte byte0 = new Byte(((byte) (-18)));
        Double double0 = new Double(2614.782);
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        linkedList0.push(pair0);
        linkedList0.add(pair0);
        DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>(((List<Pair<Byte, Double>>) (linkedList0)));
        Byte byte1 = discreteDistribution0.sample();
        Assert.assertEquals(((byte) (-18)), ((byte) (byte1)));
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Well512a well512a0 = new Well512a(((long) (345)));
        LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
        Double double0 = new Double(((double) (345)));
        Pair<Double, Double> pair0 = new Pair<Double, Double>(((Double) (null)), double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(((RandomGenerator) (well512a0)), ((List<Pair<Double, Double>>) (linkedList0)));
        Double double1 = discreteDistribution0.sample();
        Assert.assertNull(double1);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Well44497a well44497a0 = new Well44497a((-1));
        LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
        Byte byte0 = new Byte(((byte) (-13)));
        Double double0 = new Double(((double) (-1)));
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        linkedList0.offerFirst(pair0);
        DiscreteDistribution<Byte> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Byte>(((RandomGenerator) (well44497a0)), ((List<Pair<Byte, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -1 is smaller than the minimum (0)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
        Byte byte0 = new Byte(((byte) (-18)));
        Double double0 = new Double(2614.782);
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>(((List<Pair<Byte, Double>>) (linkedList0)));
        try {
            discreteDistribution0.sample(0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // number of samples (0)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Well44497a well44497a0 = new Well44497a();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(((double) (1L)));
        Byte byte0 = new Byte(((byte) (0)));
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497a0)), ((List<Pair<Object, Double>>) (linkedList0)));
        Object[] objectArray0 = discreteDistribution0.sample(1941);
        Assert.assertNotNull(objectArray0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Well44497a well44497a0 = new Well44497a();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(((double) (1L)));
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497a0)), ((List<Pair<Object, Double>>) (linkedList0)));
        discreteDistribution0.sample(1934);
        discreteDistribution0.sample(1941);
        // Undeclared exception!
        discreteDistribution0.sample(1941);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Well44497a well44497a0 = new Well44497a();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(((double) (1L)));
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497a0)), ((List<Pair<Object, Double>>) (linkedList0)));
        List<Pair<Object, Double>> list0 = discreteDistribution0.getSamples();
        Assert.assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
        Byte byte0 = new Byte(((byte) (-7)));
        Double double0 = new Double(2614.782);
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>(((List<Pair<Byte, Double>>) (linkedList0)));
        Byte byte1 = new Byte(((byte) (-1)));
        double double1 = discreteDistribution0.probability(byte1);
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
        Double double0 = new Double(0.618153497153229);
        Pair<Double, Double> pair0 = new Pair<Double, Double>(((Double) (null)), double0);
        linkedList0.offerFirst(pair0);
        DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(((List<Pair<Double, Double>>) (linkedList0)));
        double double1 = discreteDistribution0.probability(((Double) (null)));
        Assert.assertEquals(1.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
        Byte byte0 = new Byte(((byte) (-18)));
        Double double0 = new Double(2615.4948258541835);
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>(((List<Pair<Byte, Double>>) (linkedList0)));
        double double1 = discreteDistribution0.probability(byte0);
        Assert.assertEquals(1.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
        Double double0 = new Double(0.618153497153229);
        Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(((List<Pair<Double, Double>>) (linkedList0)));
        double double1 = discreteDistribution0.probability(((Double) (null)));
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
        Byte byte0 = new Byte(((byte) (-18)));
        Double double0 = new Double(((double) ((byte) (-18))));
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Byte> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Byte>(((List<Pair<Byte, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -18 is smaller than the minimum (0)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Well44497a well44497a0 = new Well44497a();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(((double) (1L)));
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497a0)), ((List<Pair<Object, Double>>) (linkedList0)));
        discreteDistribution0.reseedRandomGenerator(1L);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
        DiscreteDistribution<Byte> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Byte>(((List<Pair<Byte, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            // 
            // array sums to zero
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.util.MathArrays", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Well512a well512a0 = new Well512a(((long) (345)));
        LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
        Double double0 = new Double(((double) (345)));
        Pair<Double, Double> pair0 = new Pair<Double, Double>(((Double) (null)), double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(((RandomGenerator) (well512a0)), ((List<Pair<Double, Double>>) (linkedList0)));
        {
            discreteDistribution0.sample(1272);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Well44497a well44497a0 = new Well44497a();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(((double) (1L)));
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        Byte byte0 = new Byte(((byte) (0)));
        Pair<Byte, Double> pair1 = new Pair<Byte, Double>(byte0, double0);
        Pair<Object, Double> pair2 = new Pair<Object, Double>(pair1);
        linkedList0.add(pair2);
        Pair<Object, Double> pair3 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair3);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497a0)), ((List<Pair<Object, Double>>) (linkedList0)));
        {
            discreteDistribution0.sample(1941);
        }
    }
}

