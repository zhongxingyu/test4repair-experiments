/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 00:24:33 GMT 2017
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultStatisticalCategoryDataset_ESTest extends DefaultStatisticalCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year((Date) mockDate0);
      Number number0 = defaultStatisticalCategoryDataset0.getValue((Comparable) year0, (Comparable) mockDate0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 0);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      defaultStatisticalCategoryDataset0.add((-1481.4297), (-1481.4297), (Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
      assertEquals((-1481.4297), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add(3207.1614547, 3207.1614547, (Comparable) minute0, (Comparable) minute0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) minute0, (Comparable) minute0);
      assertEquals(3207.1614547, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      MockDate mockDate0 = (MockDate)fixedMillisecond0.getEnd();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) mockDate0, (Comparable) fixedMillisecond0);
      Number number0 = defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) (byte)25, (Number) (byte)0, (Comparable) month0, (Comparable) month0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getValue((int) (byte)0, (int) (byte)0);
      assertEquals((byte)25, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add((-8.175427286221833), (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals((-8.175427286221833), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) (byte)25, (Number) (byte)0, (Comparable) month0, (Comparable) month0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) month0, (Comparable) month0);
      assertEquals((byte)0, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) (byte)25, (Number) (byte)25, (Comparable) month0, (Comparable) month0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) month0, (Comparable) month0);
      assertEquals((byte)25, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double1 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) (byte)25, (Number) (byte)7, (Comparable) month0, (Comparable) month0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals((byte)7, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(24L);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) 14, (Comparable) minute0, (Comparable) minute0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add(3207.1614547, 3207.1614547, (Comparable) minute0, (Comparable) minute0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(minute0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      XYDataItem xYDataItem0 = new XYDataItem((Number) (byte)11, (Number) 1178815570);
      defaultStatisticalCategoryDataset0.add(1.0, 1.0, (Comparable) xYDataItem0, (Comparable) fixedMillisecond0);
      defaultStatisticalCategoryDataset0.add((-1481.4297), (-1481.4297), (Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(fixedMillisecond0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      defaultStatisticalCategoryDataset0.add((-1481.4297), (-1481.4297), (Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      Double double0 = new Double((-597.366945141268));
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      double double1 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals((-597.366945141268), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      Double double0 = new Double((-597.366945141268));
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      double double1 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals((-597.366945141268), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(813.1699916116164, 813.1699916116164, (Comparable) simpleTimePeriod0, (Comparable) null);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals(813.1699916116164, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float(1121.28751);
      defaultStatisticalCategoryDataset0.add((Number) float0, (Number) float0, (Comparable) float0, (Comparable) float0);
      Float float1 = (Float)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) float0, (Comparable) float0);
      assertEquals(1121.2875F, (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Year year0 = new Year();
      defaultStatisticalCategoryDataset0.add((-601.886541), 86.3, (Comparable) year0, (Comparable) year0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) year0, (Comparable) year0);
      assertEquals((-601.886541), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 16);
      defaultStatisticalCategoryDataset0.add((Number) 16, (Number) 2, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(16, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(0, 2773, 0, 4, 2773, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), 930.291, (Comparable) fixedMillisecond0, (Comparable) mockDate0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) (byte)25, (Number) (byte)25, (Comparable) month0, (Comparable) month0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(month0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((double) (byte)25, (-2416.18), (Comparable) null, (Comparable) null);
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) (byte)25, (Number) (byte)7, (Comparable) month0, (Comparable) month0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(month0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((double) (byte)25, (-2416.18), (Comparable) null, (Comparable) null);
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      defaultStatisticalCategoryDataset0.add((-1485.9801425149697), (-1485.9801425149697), (Comparable) fixedMillisecond0, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((-1), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(1.8451291439272315, (-551.157847), (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      defaultStatisticalCategoryDataset0.add(813.1699916116164, 813.1699916116164, (Comparable) simpleTimePeriod0, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue(0, 1521);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey((-593));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue(0, (-919));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey((-1213));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-596.4443805693045), 3431.099440182342, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((Number) 4, (Number) 1129142560, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float(Double.NEGATIVE_INFINITY);
      defaultStatisticalCategoryDataset0.add((Number) float0, (Number) float0, (Comparable) float0, (Comparable) float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float(1121.28751);
      defaultStatisticalCategoryDataset0.add((-600.8), (-208.5), (Comparable) float0, (Comparable) float0);
      defaultStatisticalCategoryDataset0.add((Number) float0, (Number) float0, (Comparable) float0, (Comparable) float0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue((Comparable) null, (Comparable) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      Double double0 = new Double((-597.366945141268));
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double1 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals((-597.366945141268), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float(2224.279052734375);
      defaultStatisticalCategoryDataset1.add((Number) float0, (Number) float0, (Comparable) float0, (Comparable) float0);
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertFalse(defaultStatisticalCategoryDataset1.equals((Object)defaultStatisticalCategoryDataset0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 0);
      defaultStatisticalCategoryDataset0.add((-0.4225626999291271), (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertEquals((-0.4225626999291271), range0.getCentralValue(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = new Double((-597.366945141268));
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals((-597.366945141268), range0.getLowerBound(), 0.01);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float(1121.28751);
      defaultStatisticalCategoryDataset0.add((-600.8), Double.NaN, (Comparable) float0, (Comparable) float0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      MockDate mockDate0 = (MockDate)fixedMillisecond0.getEnd();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) mockDate0, (Comparable) fixedMillisecond0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNotNull(range0);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 0);
      defaultStatisticalCategoryDataset0.add((-0.4225626999291271), (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      assertEquals((-597.366945141268), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 0);
      defaultStatisticalCategoryDataset0.add((-0.4225626999291271), (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      Double double1 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) simpleTimePeriod0, (Comparable) double0);
      assertNull(double1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 0);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals((-597.366945141268), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) null, (Comparable) null);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 1, (long) 1);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(965L, 965L);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      defaultStatisticalCategoryDataset0.add(813.1699916116164, 813.1699916116164, (Comparable) simpleTimePeriod0, (Comparable) null);
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue(0, 1);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) null, (Comparable) null);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 1, (long) 1);
      defaultStatisticalCategoryDataset0.add(0.0, (-597.366945141268), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(1, 1);
      assertEquals(0.0, (double)double0, 0.01);
      assertNotNull(double0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getRowKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(month0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(fixedMillisecond0);
      assertEquals((-1), int0);
  }
}
