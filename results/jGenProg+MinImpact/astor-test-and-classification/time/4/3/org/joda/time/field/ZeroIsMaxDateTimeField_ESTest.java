/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 22:40:01 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MockZone;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.StrictDateTimeField;
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
      MockZone mockZone0 = new MockZone(0L, 65, 65);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((-1L), 60);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) copticChronology0, (DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-2477));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) skipDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 65, 65);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor((-4529L));
      assertEquals((-65L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(600000L);
      assertEquals(600000L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(2345L);
      assertEquals(2345L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor((-2548L));
      assertEquals((-2520L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(60);
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling((-2102L));
      assertEquals((-2000L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder((-1416L));
      assertEquals(24L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      StrictDateTimeField strictDateTimeField0 = new StrictDateTimeField(dateTimeField0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) strictDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(1, 538L);
      assertEquals((-537L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(16L, 1);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(0L, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      Locale locale0 = Locale.JAPANESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(mockGregorianCalendar0);
      int[] intArray0 = new int[6];
      int[] intArray1 = zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) localDateTime0, 0, intArray0, 2615625);
      assertArrayEquals(new int[] {45, 1, 1, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField(0L, 60);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((-3018L), (-1874));
      assertEquals((-3018L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((-240L), (long) 1);
      assertEquals((-180L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(1L, (-2520));
      assertEquals((-2519L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.set(0L, 2603);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2603 for dayOfWeek must be in the range [1,60]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      int[] intArray0 = new int[6];
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) null, 0, intArray0, 51);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue();
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((-2242L), 1);
      assertEquals(1001L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(1L);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get((-3523L));
      assertEquals((-58), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = null;
      try {
        zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrapped field's minumum value must be zero
         //
         verifyException("org.joda.time.field.ZeroIsMaxDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference((-507L), (-507L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      Locale locale0 = Locale.JAPANESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(mockGregorianCalendar0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      boolean boolean0 = zeroIsMaxDateTimeField0.isLeap((-507L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder((-5992L));
      assertEquals((-52L), long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      LocalDate localDate0 = LocalDate.now();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      int[] intArray0 = ethiopicChronology0.get((ReadablePeriod) mutablePeriod0, (long) 89, (long) 1);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) localDateTime0, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((-240L));
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((long) 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField(4370L, (-690));
      assertEquals(1042L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven((-483L));
      assertEquals((-480L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getLeapAmount((-1415L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(292L);
      assertEquals(300L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      DurationField durationField0 = zeroIsMaxDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling((-2171L));
      assertEquals((-2160L), long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set(0L, 60);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(2345L, 0L);
      assertEquals(2345L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((long) 1, 89);
      assertEquals(5341L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((-240L), 644L);
      assertEquals(38400L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      Locale locale0 = Locale.KOREA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      LocalTime localTime0 = LocalTime.fromCalendarFields(mockGregorianCalendar0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) localTime0, (int[]) null);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      LocalDate localDate0 = LocalDate.now();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      int[] intArray0 = ethiopicChronology0.get((ReadablePeriod) mutablePeriod0, (long) 89, (long) 1);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) localDateTime0, 86400, intArray0, 620);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 86400
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}