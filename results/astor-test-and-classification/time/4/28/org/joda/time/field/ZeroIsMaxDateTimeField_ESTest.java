/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 08:26:14 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.MockZone;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZeroIsMaxDateTimeField_ESTest extends ZeroIsMaxDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(2227L);
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((-1993L), 60);
      assertEquals((-3553L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(1499L);
      assertEquals(1500L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor((-2160L));
      assertEquals((-2160L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven((-2145L));
      assertEquals((-2160L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(30L);
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling((-383L));
      assertEquals((-360L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(86400);
      assertEquals(86000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(1);
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling((-2071L));
      assertEquals((-1980L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(0L, 1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong((-5132L), (-1758L));
      assertEquals((-3374L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference((-1974), (-1974));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference((-1974), 42474480000L);
      assertEquals((-42474481), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      MonthDay monthDay0 = new MonthDay();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      int[] intArray1 = zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) monthDay0, 0, intArray0, 0);
      assertArrayEquals(new int[] {1, 1}, intArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((long) (-1974), (-1974));
      assertEquals((-1975974L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((long) 3510, (-699L));
      assertEquals((-695490L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((long) 1, 1);
      assertEquals(43200001L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((-1L), (-4448));
      assertEquals((-266881L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.set(41000L, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for yearOfEra must be in the range [1,60]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) null, 1, intArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue();
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((long) 0, 60);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(0L);
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get((-622L));
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1876L, (-1974), 5062500);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(1);
      assertEquals((-26L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(0L, 0L);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      YearMonth yearMonth0 = new YearMonth();
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) yearMonth0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      YearMonth yearMonth0 = new YearMonth();
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) yearMonth0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      boolean boolean0 = zeroIsMaxDateTimeField0.isLeap(60);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.seconds();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField(dateTimeFieldType0, durationField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[1];
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) null, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((long) 0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue(526L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((long) 30, 30);
      assertEquals(1830L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven((-120L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getLeapAmount((-2000L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      DurationField durationField0 = zeroIsMaxDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set(123L, 1);
      assertEquals(1123L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(0L, 1L);
      assertEquals(30L, long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(526L, (long) 1);
      assertEquals(1526L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.getDefault();
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      int[] intArray0 = new int[3];
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) localDate0, intArray0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      YearMonth yearMonth0 = new YearMonth();
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) yearMonth0, (-133), intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -133
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}