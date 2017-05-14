/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 21:50:28 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObjects2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedObjects2D_ESTest extends KeyedObjects2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject((Object) null, (Comparable) null, (Comparable) null);
      keyedObjects2D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject("org.jfree.data.KeyedObjects", "org.jfree.data.KeyedObjects");
      Integer integer0 = Integer.getInteger("", 2486);
      keyedObjects2D0.removeObject("org.jfree.data.KeyedObjects", integer0);
      keyedObjects2D0.removeObject("org.jfree.data.KeyedObjects", integer0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject(keyedObjects2D0, "org.jfree.data.KeyedObject", "org.jfree.data.KeyedObject");
      keyedObjects2D0.addObject(keyedObjects2D0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Object object0 = new Object();
      Integer integer0 = new Integer((-4142));
      keyedObjects2D0.addObject(object0, integer0, integer0);
      keyedObjects2D0.removeRow(0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject(keyedObjects2D0, "org.jfree.data.KeyedObject", "org.jfree.data.KeyedObject");
      keyedObjects2D0.removeColumn(0);
      assertEquals(1, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      Comparable comparable0 = keyedObjects2D0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("", "", "");
      Comparable comparable0 = keyedObjects2D0.getRowKey(0);
      assertEquals("", comparable0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("Lvx \u0003;pF", "Lvx \u0003;pF", "Lvx \u0003;pF");
      int int0 = keyedObjects2D0.getRowIndex("Lvx \u0003;pF");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(0);
      keyedObjects2D0.addObject(integer0, integer0, integer0);
      keyedObjects2D0.setObject("", "", integer0);
      int int0 = keyedObjects2D0.getRowIndex("");
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("V<'L;>ig-z}gxLlFl ", (Comparable) null, "V<'L;>ig-z}gxLlFl ");
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Object object0 = new Object();
      Integer integer0 = new Integer((-4142));
      keyedObjects2D0.addObject(object0, integer0, integer0);
      Object object1 = keyedObjects2D0.getObject((Comparable) integer0, (Comparable) integer0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("", (Comparable) null, "");
      String string0 = (String)keyedObjects2D0.getObject(0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      Comparable comparable0 = keyedObjects2D0.getColumnKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("V<'L;>ig-z}gxLlFl ", (Comparable) null, "V<'L;>ig-z}gxLlFl ");
      Comparable comparable0 = keyedObjects2D0.getColumnKey(0);
      assertEquals("V<'L;>ig-z}gxLlFl ", comparable0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("Lvx \u0003;pF", "Lvx \u0003;pF", "Lvx \u0003;pF");
      int int0 = keyedObjects2D0.getColumnIndex("Lvx \u0003;pF");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer((-1));
      keyedObjects2D0.setObject(integer0, integer0, (Comparable) null);
      Integer integer1 = new Integer(709);
      keyedObjects2D0.setObject(integer1, integer1, integer1);
      int int0 = keyedObjects2D0.getColumnIndex(integer1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject((Object) null, (Comparable) null, (Comparable) null);
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        keyedObjects2D0.setObject(integer0, (Comparable) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow((-1339));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject(keyedObjects2D0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject("LN830Hu@iKQ1gQ", "LN830Hu@iKQ1gQ");
      Integer integer0 = new Integer((-896));
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((Comparable) integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject((Object) null, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getRowKey((-1078));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject(2117, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2117, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject((-3036), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getColumnKey((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      keyedObjects2D0.removeObject((Comparable) null, "org.jfree.data.KeyedObject");
      keyedObjects2D1.addObject(keyedObjects2D0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.equals(keyedObjects2D1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects2D0.setObject(keyedObjects0, "org.jfree.data.KeyedObjects2D", (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.addObject("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", (Comparable) null);
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
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, "");
      String string0 = (String)keyedObjects2D0.getObject(0, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow(1270);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1270, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      List list0 = keyedObjects2D0.getRowKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(0);
      int int0 = keyedObjects2D0.getRowIndex(integer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getColumnKey(0);
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
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      List list0 = keyedObjects2D0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(0);
      Integer integer1 = Integer.valueOf(3393);
      keyedObjects2D0.addObject(integer0, integer1, integer0);
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      keyedObjects2D0.setObject("", "", integer1);
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject("gvO!", "gvO!");
      keyedObjects2D0.removeRow((Comparable) "gvO!");
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      keyedObjects2D0.addObject(keyedObjects2D1, (Comparable) null, (Comparable) null);
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals(";?Cu");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeColumn((Comparable) null);
      assertEquals(0, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("LN830Hu@iKQ1gQ", "", "");
      String string0 = (String)keyedObjects2D0.getObject((Comparable) "", (Comparable) "LN830Hu@iKQ1gQ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(0);
      Object object0 = keyedObjects2D0.getObject((Comparable) integer0, (Comparable) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Object object0 = new Object();
      keyedObjects2D0.addObject(object0, (Comparable) null, (Comparable) null);
      Object object1 = keyedObjects2D0.getObject(0, 0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = Integer.valueOf(3393);
      keyedObjects2D0.removeObject(integer0, integer0);
      keyedObjects2D0.setObject("", "", integer0);
      keyedObjects2D0.setObject(keyedObjects2D0, "", integer0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow((Comparable) "org.jfree.data.KeyedObjects");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(0);
      int int0 = keyedObjects2D0.getColumnIndex(integer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
