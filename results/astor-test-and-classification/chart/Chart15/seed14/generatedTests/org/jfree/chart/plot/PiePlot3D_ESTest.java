/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 03:23:34 GMT 2017
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PiePlot3D_ESTest extends PiePlot3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset((CategoryDataset) null, tableOrder0, (-1727));
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) categoryToPieDataset0);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      arc2D_Double0.extent = (double) 1.0F;
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Area area0 = new Area(piePlot3D0.DEFAULT_LEGEND_ITEM_BOX);
      Color color0 = (Color)LineRenderer3D.DEFAULT_WALL_PAINT;
      BasicStroke basicStroke0 = new BasicStroke();
      // Undeclared exception!
      try { 
        piePlot3D0.drawSide((Graphics2D) null, rectangle2D_Double0, arc2D_Double0, area0, area0, color0, color0, basicStroke0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PiePlot3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart("z/m", (Plot) piePlot3D0);
      RectangleInsets rectangleInsets0 = jFreeChart0.getPadding();
      piePlot3D0.setInsets(rectangleInsets0, false);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 1467);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.data.general.DatasetUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      assertFalse(piePlot3D0.getDarkerSides());
      
      piePlot3D0.setDarkerSides(true);
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PiePlot3D piePlot3D1 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertEquals(0.12, piePlot3D1.getDepthFactor(), 0.01);
      assertFalse(piePlot3D1.isCircular());
      assertTrue(boolean0);
      assertFalse(piePlot3D1.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) null);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      boolean boolean0 = piePlot3D0.equals(mockMinguoDate0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
      assertFalse(boolean0);
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D0);
      assertFalse(piePlot3D0.getDarkerSides());
      assertFalse(piePlot3D0.isCircular());
      assertTrue(boolean0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      piePlot3D0.setDataset(defaultPieDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((Plot) piePlot3D0);
      jFreeChart0.createBufferedImage(10, 10);
      assertFalse(piePlot3D0.getDarkerSides());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.setCircular(true);
      JFreeChart jFreeChart0 = new JFreeChart((Plot) piePlot3D0);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 1451);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.data.general.DatasetUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.setLabelGenerator((PieSectionLabelGenerator) null);
      JFreeChart jFreeChart0 = new JFreeChart((Plot) piePlot3D0);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.data.general.DatasetUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      
      piePlot3D0.setDepthFactor(0.0);
      assertEquals(0.0, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) null);
      piePlot3D0.getPlotType();
      assertFalse(piePlot3D0.isCircular());
      assertFalse(piePlot3D0.getDarkerSides());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.setDarkerSides(true);
      PiePlot3D piePlot3D1 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertFalse(boolean0);
      assertTrue(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      double double0 = piePlot3D0.getDepthFactor();
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, double0, 0.01);
      assertFalse(piePlot3D0.getDarkerSides());
  }
}
