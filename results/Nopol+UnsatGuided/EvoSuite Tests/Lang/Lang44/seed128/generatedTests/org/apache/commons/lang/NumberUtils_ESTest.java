/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 16:43:36 GMT 2017
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xdJV.Lw/@Df@@h-]J8H");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0bP/[(5XN=G|0}x4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("*;xP 'BIS,Id%U7cc{");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 1794, 0);
      assertEquals(1794, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      long long0 = NumberUtils.maximum(2973L, 2973L, (-1L));
      assertEquals(2973L, long0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      long long0 = NumberUtils.maximum(2338L, 0L, 2501L);
      assertEquals(2501L, long0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      long long0 = NumberUtils.minimum((-1637L), (-1637L), 0L);
      assertEquals((-1637L), long0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0bP/[(5XN=G|0}x4");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"bP/[(5\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null, (-2799));
      assertEquals((-2799), int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("4");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      long long0 = NumberUtils.minimum((long) 0, (long) 0, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = NumberUtils.minimum(1L, 1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = NumberUtils.minimum(1665, 1665, 1665);
      assertEquals(1665, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = NumberUtils.maximum((-2359), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Long long0 = NumberUtils.createLong("-0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Long long0 = NumberUtils.createLong("1");
      assertEquals(1L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("17");
      assertEquals(17, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("4");
      assertEquals(4.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-6");
      assertEquals((-6.0F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("17");
      assertEquals(17.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("7");
      assertEquals(7, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-6");
      assertEquals(-6, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createLong("^[i$rG7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"^[i$rG7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length string
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat("-0x2f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("LsN\"'d9Euv23oPQR");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("h");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"h\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("Strings must not be null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("4");
      assertEquals(4, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null, 102);
      assertEquals(102, int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-0");
      assertEquals(-0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("H");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6+-$3)#,2%9rgU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("eBwMe7S]Ls2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2E-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0x`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xE-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0zQZ#.mw@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x2f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int int0 = NumberUtils.compare(5765.706F, (float) 1665);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = NumberUtils.compare((-1754.596F), 1.0F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int int0 = NumberUtils.compare((-1624.6288F), (-1624.6288F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = NumberUtils.compare(1892.6, 1892.6);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = NumberUtils.compare((-1854.6391494805), 0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = NumberUtils.compare(1298.51153, (-862.2142929699878));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NumberUtils.maximum(1371, 48, 1494);
      assertEquals(1494, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = NumberUtils.maximum((-2359), (-2359), (-2359));
      assertEquals((-2359), int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      long long0 = NumberUtils.maximum((-330L), 0L, 231L);
      assertEquals(231L, long0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      long long0 = NumberUtils.maximum((-2834L), 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long long0 = NumberUtils.maximum((-17L), (-17L), (-17L));
      assertEquals((-17L), long0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = NumberUtils.minimum(898, 1, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, (-1566), (-863));
      assertEquals((-1566), int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = NumberUtils.minimum((-303), 410, (-303));
      assertEquals((-303), int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      long long0 = NumberUtils.minimum(1362L, (long) 0, (-4L));
      assertEquals((-4L), long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = NumberUtils.minimum((long) (-2359), 0L, (long) (-2359));
      assertEquals((-2359L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      try { 
        NumberUtils.createNumber(";p`3B\"};!.t`9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Float float0 = (Float)NumberUtils.createNumber("2f");
      assertEquals(2.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      try { 
        NumberUtils.createNumber("O`o5]d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // O`o5]d is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      try { 
        NumberUtils.createNumber("HauF]ta%TcL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // HauF]ta%TcL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      try { 
        NumberUtils.createNumber("OGoNjm`dF");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // OGoNjm`dF is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      try { 
        NumberUtils.createNumber("lBAD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // lBAD is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      try { 
        NumberUtils.createNumber("E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // E is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("l");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings mu.t not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings mu.t not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is ot a vaid numbe.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is ot a vaid numbe. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0.x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -0.x is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0x2f");
      assertEquals((-47), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x`");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"`\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--%2");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
      assertEquals(0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Long long0 = NumberUtils.createLong("-6");
      assertEquals((-6L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-6");
      assertEquals((-6), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("0h@:wo>BAE>");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      try { 
        NumberUtils.createNumber("*{qZoQE2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-0");
      assertEquals(-0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}