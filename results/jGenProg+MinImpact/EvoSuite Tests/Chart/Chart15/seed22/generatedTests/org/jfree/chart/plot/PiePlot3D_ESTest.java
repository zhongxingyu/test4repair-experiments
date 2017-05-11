/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 20:08:19 GMT 2017
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PiePlot3D_ESTest extends PiePlot3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PiePlot3D piePlot3D1 = new PiePlot3D();
      piePlot3D1.setDarkerSides(true);
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertFalse(boolean0);
      assertTrue(piePlot3D1.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)Plot.DEFAULT_LEGEND_ITEM_BOX;
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      PlotState plotState0 = new PlotState();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        piePlot3D0.draw((Graphics2D) null, rectangle2D_Double0, point2D_Double0, plotState0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertFalse(boolean0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PiePlot3D piePlot3D1 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertEquals(0.12, piePlot3D1.getDepthFactor(), 0.01);
      assertTrue(boolean0);
      assertFalse(piePlot3D1.getDarkerSides());
      assertFalse(piePlot3D1.isCircular());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.getDarkerSides());
      assertTrue(boolean0);
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PiePlot3D piePlot3D1 = new PiePlot3D();
      piePlot3D0.setDarkerSides(true);
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertFalse(boolean0);
      assertTrue(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) defaultKeyedValuesDataset0);
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double((-180.0), 0.1, (double) 500, (double) 1.0F, (-1133.18807), 29.0, 0);
      Area area0 = new Area();
      BasicStroke basicStroke0 = (BasicStroke)Plot.DEFAULT_OUTLINE_STROKE;
      // Undeclared exception!
      try { 
        piePlot3D0.drawSide((Graphics2D) null, rectangle2D_Double0, arc2D_Double0, area0, area0, numberAxis0.DEFAULT_TICK_LABEL_PAINT, numberAxis0.DEFAULT_TICK_LABEL_PAINT, basicStroke0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PiePlot3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Number[][] numberArray0 = new Number[0][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset((CategoryDataset) defaultIntervalCategoryDataset0, tableOrder0, 10);
      piePlot3D0.setDataset(categoryToPieDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, piePlot3D0.DEFAULT_LABEL_FONT, (Plot) piePlot3D0, false);
      jFreeChart0.createBufferedImage(10, 10);
      assertFalse(piePlot3D0.isCircular());
      assertFalse(piePlot3D0.getDarkerSides());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) defaultKeyedValuesDataset0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      
      piePlot3D0.setDepthFactor(0.0);
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.getPlotType();
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      double double0 = piePlot3D0.getDepthFactor();
      assertEquals(0.12, double0, 0.01);
      assertFalse(piePlot3D0.isCircular());
      assertFalse(piePlot3D0.getDarkerSides());
  }
}