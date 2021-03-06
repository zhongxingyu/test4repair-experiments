/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 22:01:07 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Locale;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.AbstractBlock;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BlockFrame;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.CenterArrangement;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.FlowArrangement;
import org.jfree.chart.block.GridArrangement;
import org.jfree.chart.block.LabelBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.DateTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Size2D;
import org.jfree.chart.util.VerticalAlignment;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractBlock_ESTest extends AbstractBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setMargin(1608.7233014, (-1785.1781489), (-1.0), (-2012.0));
      double double0 = blockContainer0.trimToContentHeight((-1785.1781489));
      assertEquals(1608.7233014, blockContainer0.getContentYOffset(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CenterArrangement centerArrangement0 = new CenterArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) centerArrangement0);
      CompositeTitle compositeTitle0 = new CompositeTitle(blockContainer0);
      compositeTitle0.setPadding(1766.314893020079, 2897.3078, (double) 1.0F, (-2786.0834));
      assertEquals(1766.314893020079, compositeTitle0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Okw+|fHg");
      double double0 = labelBlock0.trimToContentWidth(1.0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Color color0 = (Color)XYTextAnnotation.DEFAULT_PAINT;
      BasicStroke basicStroke0 = (BasicStroke)Plot.DEFAULT_OUTLINE_STROKE;
      CategoryMarker categoryMarker0 = new CategoryMarker((Comparable) Double.POSITIVE_INFINITY, (Paint) color0, (Stroke) basicStroke0);
      Font font0 = categoryMarker0.getLabelFont();
      LabelBlock labelBlock0 = new LabelBlock("The document has been closed. You can't add any Elements.", font0, (Paint) color0);
      double double0 = labelBlock0.trimToContentHeight(2092.5856126809254);
      assertEquals(2092.5856126809254, double0, 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(2.9310734464938557, 2.9310734464938557);
      emptyBlock0.setPadding(2.9310734464938557, 2.9310734464938557, 0.0, 0.0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 3290.857F, 0.0F);
      Rectangle rectangle0 = rectangle2D_Float0.getBounds();
      emptyBlock0.trimPadding(rectangle0);
      assertEquals(2, rectangle0.y);
      assertEquals(0.5, rectangle0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      JRootPane jRootPane0 = new JRootPane();
      CompoundBorder compoundBorder0 = new CompoundBorder();
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jRootPane0, (Border) compoundBorder0, (-1770), (-1770), (-1770), 194);
      blockContainer0.trimPadding(rectangle0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.005, 0.005);
      emptyBlock0.setPadding(0.005, 0.005, (-13.788466723240179), (-13.788466723240179));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 3290.857F, 0.0F);
      Rectangle rectangle0 = rectangle2D_Float0.getBounds();
      emptyBlock0.trimPadding(rectangle0);
      assertEquals(3305.0, rectangle0.getMaxX(), 0.01);
      assertEquals(0.005, emptyBlock0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      LabelBlock labelBlock0 = new LabelBlock("Michael Rauch");
      labelBlock0.trimPadding(rectangle2D_Double0);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1267.0F), 0.0F, (-1267.0F), 0.0F);
      FlowArrangement flowArrangement0 = new FlowArrangement((HorizontalAlignment) null, (VerticalAlignment) null, 3913.19, 1582.0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) flowArrangement0);
      blockContainer0.trimMargin(rectangle2D_Float0);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(24.313399947389502, 24.313399947389502);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable((TableModel) defaultTableModel0);
      Rectangle rectangle0 = jTable0.getCellRect(10647, 10647, true);
      emptyBlock0.trimMargin(rectangle0);
      assertEquals(24.313399947389502, emptyBlock0.getHeight(), 0.01);
      assertEquals(24.313399947389502, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1507.94672561492, 1507.94672561492, 2427.275381598, 2427.275381598);
      blockContainer0.trimMargin(rectangle2D_Double0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      rectangle2D_Float0.setRect(0.0F, (-2507.38F), (-1.0F), 0.0F);
      abstractBlock0.trimMargin(rectangle2D_Float0);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.025, (double) (-1267.0F), (double) 0.0F, (double) 0.0F);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      FlowArrangement flowArrangement0 = new FlowArrangement((HorizontalAlignment) null, (VerticalAlignment) null, 3913.19, 1582.0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) flowArrangement0);
      blockContainer0.trimBorder(rectangle0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(3650.2369084, 136.20822272761245);
      JToolBar.Separator jToolBar_Separator0 = new JToolBar.Separator();
      EtchedBorder etchedBorder0 = new EtchedBorder((-1984));
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jToolBar_Separator0, (Border) etchedBorder0, (-15), (-3488), 458, 0);
      emptyBlock0.trimBorder(rectangle0);
      assertEquals(136.20822272761245, emptyBlock0.getHeight(), 0.01);
      assertEquals(3650.2369084, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(2345.607012105454, 0.5235987755982988);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-2039.8406F), 0.0F, 0.0F, (-958.79F));
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)rectangle2D_Float0.getFrame();
      emptyBlock0.trimBorder(rectangle2D_Double0);
      assertEquals(0.5235987755982988, emptyBlock0.getHeight(), 0.01);
      assertEquals(2345.607012105454, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-1202.1807763240975), 124.0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      emptyBlock0.trimBorder(defaultCaret0);
      assertEquals(124.0, emptyBlock0.getHeight(), 0.01);
      assertEquals((-1202.1807763240975), emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-1202.1807763240975), 124.0);
      JToolBar.Separator jToolBar_Separator0 = new JToolBar.Separator();
      EtchedBorder etchedBorder0 = new EtchedBorder((-1984));
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jToolBar_Separator0, (Border) etchedBorder0, 0, (-3447), 458, 0);
      emptyBlock0.trimBorder(rectangle0);
      assertEquals(124.0, emptyBlock0.getHeight(), 0.01);
      assertEquals((-1202.1807763240975), emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-164.50710191015744), 0.0);
      double double0 = emptyBlock0.getWidth();
      assertEquals((-164.50710191015744), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-164.50710191015744), 0.0);
      emptyBlock0.getPadding();
      assertEquals((-164.50710191015744), emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setMargin((double) (-2507.38F), (-97.05399), (-871.0081521648), (-97.05399));
      abstractBlock0.getMargin();
      assertEquals((-97.05399), abstractBlock0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setMargin(0.0, (-97.05399), (-871.0081521648), (-97.05399));
      abstractBlock0.getMargin();
      assertEquals((-97.05399), abstractBlock0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(2345.607012105454, 0.5235987755982988);
      double double0 = emptyBlock0.getHeight();
      assertEquals(2345.607012105454, emptyBlock0.getWidth(), 0.01);
      assertEquals(0.5235987755982988, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, (-3696.387));
      double double0 = emptyBlock0.getHeight();
      assertEquals((-3696.387), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, (-3696.387));
      emptyBlock0.setPadding((-14.763600545469549), (-14.763600545469549), 2304.78, 2304.78);
      double double0 = emptyBlock0.getContentYOffset();
      assertEquals((-14.763600545469549), emptyBlock0.getContentXOffset(), 0.01);
      assertEquals((-14.763600545469549), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      double double0 = blockContainer0.getContentXOffset();
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Michael Rauch");
      labelBlock0.calculateTotalWidth(0.0);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      double double0 = abstractBlock0.calculateTotalWidth(208.8485671007);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(208.8485671007, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setMargin(0.0, (-97.05399), (-871.0081521648), (-97.05399));
      double double0 = abstractBlock0.calculateTotalWidth(0.0);
      assertEquals((-97.05399), abstractBlock0.getContentXOffset(), 0.01);
      assertEquals((-194.10798), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.calculateTotalHeight(0.0);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      double double0 = emptyBlock0.calculateTotalHeight((-2116.8216));
      assertEquals((-2116.8216), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Size2D size2D0 = abstractBlock0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Color color0 = Color.BLUE;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 0.0, 0.0);
      // Undeclared exception!
      try { 
        colorBlock0.trimPadding((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      // Undeclared exception!
      try { 
        textTitle0.trimMargin((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        blockContainer0.trimBorder((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(24.313399947389502, 24.313399947389502);
      // Undeclared exception!
      try { 
        emptyBlock0.toContentConstraint((RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      // Undeclared exception!
      try { 
        dateTitle0.arrange((Graphics2D) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("");
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      blockContainer0.setPadding(textTitle0.DEFAULT_PADDING);
      double double0 = blockContainer0.calculateTotalHeight(0.0);
      assertEquals(2.0, double0, 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("Okw+|fHg");
      BlockBorder blockBorder0 = new BlockBorder(2471.0, 1.0, 1.0E-4, 1.0);
      labelBlock0.setFrame(blockBorder0);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("`UJ;;tgSi`$ u~t{V.");
      abstractBlock0.setMargin(categoryAxis3D0.DEFAULT_TICK_LABEL_INSETS);
      abstractBlock0.getMargin();
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Color color0 = Color.BLUE;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 0.0, 0.0);
      double double0 = colorBlock0.getWidth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      compositeTitle0.setWidth(700.22272);
      double double0 = compositeTitle0.getWidth();
      assertEquals(700.22272, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      double double0 = abstractBlock0.getHeight();
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Font font0 = Font.decode("");
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      Range range0 = Range.expandToInclude((Range) null, 16384.0);
      ModuloAxis moduloAxis0 = new ModuloAxis("", range0);
      XYBubbleRenderer xYBubbleRenderer0 = new XYBubbleRenderer();
      XYPlot xYPlot0 = new XYPlot((XYDataset) xIntervalSeriesCollection0, (ValueAxis) moduloAxis0, (ValueAxis) null, (XYItemRenderer) xYBubbleRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("nonbreakingspace", font0, (Plot) xYPlot0, true);
      TextTitle textTitle0 = jFreeChart0.getTitle();
      textTitle0.setHeight(3205.77);
      assertEquals(3205.77, textTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      AbstractBlock abstractBlock1 = (AbstractBlock)abstractBlock0.clone();
      assertEquals(0.0, abstractBlock1.getHeight(), 0.01);
      assertNotSame(abstractBlock1, abstractBlock0);
      assertEquals(0.0, abstractBlock1.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(24.313399947389502, 24.313399947389502);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      boolean boolean0 = emptyBlock0.equals(defaultTableModel0);
      assertEquals(24.313399947389502, emptyBlock0.getWidth(), 0.01);
      assertEquals(24.313399947389502, emptyBlock0.getHeight(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(831, 1, (Number) Float.NaN);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("gm]oTHc;=Wh3NTNy}&", (Plot) waferMapPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 10, chartRenderingInfo0);
      assertEquals(0, bufferedImage0.getTileGridYOffset());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(831, 831, (Number) Float.NaN);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("", (Plot) waferMapPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(600, 15, (double) Float.NaN, Double.POSITIVE_INFINITY, chartRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      // Undeclared exception!
      try { 
        compositeTitle0.arrange((Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle(0);
      // Undeclared exception!
      try { 
        dateTitle0.setBounds((Rectangle2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bounds' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      abstractBlock0.setBounds(rectangle2D_Double0);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      // Undeclared exception!
      try { 
        textTitle0.setPadding((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'padding' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      DateTitle dateTitle0 = new DateTitle(0, locale0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_FONT, stackedAreaRenderer0.DEFAULT_PAINT);
      // Undeclared exception!
      try { 
        dateTitle0.setFrame((BlockFrame) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'frame' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer();
      GridArrangement gridArrangement0 = new GridArrangement(10096, 10096);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) xYLineAndShapeRenderer0, (Arrangement) gridArrangement0, (Arrangement) gridArrangement0);
      // Undeclared exception!
      try { 
        legendTitle0.setMargin((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'margin' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.005, 0.005);
      double double0 = emptyBlock0.getContentYOffset();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.005, emptyBlock0.getHeight(), 0.01);
      assertEquals(0.005, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("");
      double double0 = textTitle0.getContentXOffset();
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
      assertEquals(0.0, textTitle0.getWidth(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.005, 0.005);
      emptyBlock0.getBounds();
      assertEquals(0.005, emptyBlock0.getWidth(), 0.01);
      assertEquals(0.005, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      MeterPlot meterPlot0 = new MeterPlot((ValueDataset) defaultValueDataset0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) meterPlot0);
      legendTitle0.getID();
      assertEquals(0.0, legendTitle0.getWidth(), 0.01);
      assertEquals(0.0, legendTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement((HorizontalAlignment) null, (VerticalAlignment) null, 3913.19, 1582.0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) flowArrangement0);
      double double0 = blockContainer0.trimToContentWidth(0.0F);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.getMargin();
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = Title.DEFAULT_VERTICAL_ALIGNMENT;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, (-2901.736829816), (-2901.736829816));
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) flowArrangement0);
      SystemColor systemColor0 = SystemColor.controlDkShadow;
      BevelBorder bevelBorder0 = new BevelBorder(592, (Color) systemColor0, (Color) systemColor0);
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) null, 0, 1359, (-1496), 1771);
      blockContainer0.trimBorder(rectangle0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.005, 0.005);
      emptyBlock0.getFrame();
      assertEquals(0.005, emptyBlock0.getWidth(), 0.01);
      assertEquals(0.005, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.005, 0.005);
      emptyBlock0.setPadding(0.005, 0.005, (-13.788466723240179), (-13.788466723240179));
      double double0 = emptyBlock0.getContentYOffset();
      assertEquals(0.005, emptyBlock0.getContentXOffset(), 0.01);
      assertEquals(0.005, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setID("`UJ;;tgSi`$ u~t{V.");
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.005, 0.005);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 3290.857F, 0.0F);
      Rectangle rectangle0 = rectangle2D_Float0.getBounds();
      emptyBlock0.trimPadding(rectangle0);
      assertEquals(0.005, emptyBlock0.getHeight(), 0.01);
      assertEquals(0.005, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      textTitle0.getPadding();
      assertEquals(0.0, textTitle0.getWidth(), 0.01);
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      // Undeclared exception!
      try { 
        abstractBlock0.drawBorder((Graphics2D) null, rectangle2D_Float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      // Undeclared exception!
      try { 
        abstractBlock0.arrange((Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = Title.DEFAULT_VERTICAL_ALIGNMENT;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, (-2901.736829816), (-2901.736829816));
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) flowArrangement0);
      CompositeTitle compositeTitle0 = new CompositeTitle(blockContainer0);
      Size2D size2D0 = compositeTitle0.arrange((Graphics2D) null);
      assertEquals(2.0, size2D0.width, 0.01);
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
      assertEquals(2.0, size2D0.height, 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
  }
}
