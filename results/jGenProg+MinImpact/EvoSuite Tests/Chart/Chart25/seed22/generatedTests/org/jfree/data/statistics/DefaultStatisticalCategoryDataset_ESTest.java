/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 19:25:54 GMT 2017
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
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultStatisticalCategoryDataset_ESTest extends DefaultStatisticalCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 12, (Comparable) quarter0, (Comparable) quarter0);
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 4, (Comparable) quarter0, (Comparable) quarter0.LAST_QUARTER);
      assertEquals(1392409281320L, quarter0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((int) (byte)126, (-1431), 1);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      Number number0 = defaultStatisticalCategoryDataset0.getValue((Comparable) mockDate0, (Comparable) fixedMillisecond0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add((Number) 23, (Number) null, (Comparable) hour0, (Comparable) hour0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue((Comparable) hour0, (Comparable) hour0);
      assertEquals(23, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add((-1641.0), (-1641.0), (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) hour0, (Comparable) hour0);
      assertEquals((-1641.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 0, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((double) 12, 1.0, (Comparable) quarter0, (Comparable) quarter0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) quarter0, (Comparable) quarter0);
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 0, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) quarter0, (Comparable) quarter0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 12, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertNotNull(integer0);
      assertEquals(12, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 0, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 0, (Comparable) quarter0, (Comparable) quarter0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add(0.0, 4605.8, (Comparable) week0, (Comparable) week0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(week0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      Hour hour1 = (Hour)hour0.previous();
      defaultStatisticalCategoryDataset0.add(258.636931163, 258.636931163, (Comparable) hour1, (Comparable) hour1);
      defaultStatisticalCategoryDataset0.add(12.956229, (double) 23, (Comparable) hour0, (Comparable) hour1);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(hour0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float(2572.6F);
      defaultStatisticalCategoryDataset0.add((Number) float0, (Number) 0, (Comparable) float0, (Comparable) float0);
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((double) 0, (double) 0, (Comparable) "selection-previous-word", (Comparable) "selection-previous-word");
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-3131.0602243593003), (-3131.0602243593003), (Comparable) null, (Comparable) null);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals((-3131.0602243593003), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 3, (Comparable) timeSeriesDataItem0, (Comparable) week0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-3373.5), (-563.80420250448), (Comparable) (byte)47, (Comparable) (byte)86);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals((-3373.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(600.2481664, 0.0, (Comparable) null, (Comparable) null);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals(600.2481664, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 3, (Comparable) timeSeriesDataItem0, (Comparable) week0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertEquals(0.0, range0.getLength(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Day day0 = new Day();
      defaultStatisticalCategoryDataset0.add(0.0, 345.9, (Comparable) day0, (Comparable) day0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) day0, (Comparable) day0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add((-1641.0), (-1641.0), (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) hour0, (Comparable) hour0);
      assertEquals((-1641.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 3, (Comparable) timeSeriesDataItem0, (Comparable) week0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) 59, (Comparable) null, (Comparable) "");
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertEquals("", comparable0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 17, (Number) 1886545202, (Comparable) null, (Comparable) null);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex((Comparable) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((int) (byte)126, (-1431), 1);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) (byte)126, (Comparable) fixedMillisecond0, (Comparable) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 4, (Number) 0, (Comparable) mockDate0, (Comparable) "Wed Dec 31 23:59:56 GMT 1969");
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex("Wed Dec 31 23:59:56 GMT 1969");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add((-1641.0), (-1641.0), (Comparable) hour0, (Comparable) hour0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue(0, 860);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 10, (Number) (byte)121, (Comparable) null, (Comparable) null);
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
  public void test30()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((-1), 566);
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
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey((-1021));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(2135565479, 2135565479, 2135565479, 90, 2135565479);
      defaultStatisticalCategoryDataset0.add((double) 90, (-66.929710825739), (Comparable) mockDate0, (Comparable) mockDate0);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRangeBounds(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (156.929710825739) <= upper (23.070289174261006).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue(23, 1993610875);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(258.636931163, 258.636931163, (Comparable) hour0, (Comparable) hour0);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue(0, (-2075900859));
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
        defaultStatisticalCategoryDataset0.getColumnKey((-418));
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
      Integer integer0 = new Integer(0);
      defaultStatisticalCategoryDataset0.add((Number) integer0, (Number) 59, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((Number) integer0, (Number) integer0, (Comparable) null, (Comparable) "5H=@*,^8nr/'t?m4n");
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
      defaultStatisticalCategoryDataset0.add(2699.1133271422, 2699.1133271422, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((double) 12, 1.0, (Comparable) quarter0, (Comparable) quarter0);
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 12, (Comparable) quarter0, (Comparable) quarter0);
      assertEquals(1, quarter0.getQuarter());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add((-1641.0), (-1641.0), (Comparable) hour0, (Comparable) hour0);
      defaultStatisticalCategoryDataset0.add((Number) 23, (Number) null, (Comparable) hour0, (Comparable) hour0);
      assertEquals(1392409281320L, hour0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue((Comparable) (byte) (-13), (Comparable) (byte) (-55));
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float(2572.6F);
      defaultStatisticalCategoryDataset0.add((Number) float0, (Number) 0, (Comparable) float0, (Comparable) float0);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(hour0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((-1772), 0, 2146186040);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[7];
      defaultStatisticalCategoryDataset0.add((double) (-1772), 1359.0602243593, (Comparable) oHLCDataItemArray0[4], (Comparable) mockDate0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals((-1772.0), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((int) (byte)126, (-1431), 1);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) (byte)126, (Comparable) fixedMillisecond0, (Comparable) mockDate0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNotNull(range0);
      assertEquals(127.0, range0.getUpperBound(), 0.01);
      assertEquals((-125.0), range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) null, (Comparable) null);
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
  public void test51()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) null, (Comparable) null);
      Number number0 = defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 32772, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) quarter0, (Comparable) quarter0);
      assertEquals(32772, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(2135565479, 2135565479, 2135565479, 90, 2135565479);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      Number number0 = defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) fixedMillisecond0, (Comparable) mockDate0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) 32772, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(32772, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(258.636931163, 258.636931163, (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) hour0, (Comparable) hour0);
      assertNotNull(double0);
      assertEquals(258.636931163, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((int) (byte)126, 1, 1);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) (byte)126, (Comparable) fixedMillisecond0, (Comparable) mockDate0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((int) (byte)126, (-1431), 5);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 5, (Number) (byte)126, (Comparable) fixedMillisecond0, (Comparable) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 2, (Number) 13, (Comparable) "Fri Oct 05 00:00:00 GMT 1906", (Comparable) "Fri Oct 05 00:00:00 GMT 1906");
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue(1, 0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((int) (byte)126, (-1431), 1);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add(2224.0, (-988.27907), (Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) fixedMillisecond0, (Comparable) fixedMillisecond0);
      assertNotNull(double0);
      assertEquals((-988.27907), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
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
  public void test61()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey(547);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 547, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getRowKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((int) (byte)126, (-1431), 1);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((Date) mockDate0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(fixedMillisecond0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(hour0);
      assertEquals((-1), int0);
  }
}