/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 10:09:07 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.time.DateRange;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      RectangleInsets rectangleInsets0 = Axis.DEFAULT_AXIS_LABEL_INSETS;
      blockContainer0.setPadding(rectangleInsets0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, dateRange0, dateRange0, (Graphics2D) null);
      assertEquals(6.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) logAxis0);
      blockContainer0.setMargin(combinedDomainXYPlot0.DEFAULT_INSETS);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(16.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setPadding(1.0E-5, 1.0E-5, 0.0, (-1527.0));
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals((-1526.99999), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setPadding(0.0, 76.08641959756525, (-1.0), 76.08641959756525);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals((-1.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, (Range) null, (Range) null, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 3064.016067761107);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, (-967.765638379));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-967.765638379).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, dateRange0, dateRange0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 18.173021);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.add(blockContainer0, blockContainer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.block.BlockContainer cannot be cast to org.jfree.chart.util.RectangleEdge
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }
}
