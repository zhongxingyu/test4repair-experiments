/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 21:01:35 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfGraphics2D;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.Type3Font;
import com.lowagie.text.pdf.Type3Glyph;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RingPlot ringPlot0 = new RingPlot();
      Color color0 = (Color)ringPlot0.getShadowPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, (-1.0), 1.0E7);
      borderArrangement0.add(colorBlock0, (Object) null);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(1.0E7, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 5.6);
      assertEquals(5.6, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RingPlot ringPlot0 = new RingPlot();
      Color color0 = (Color)ringPlot0.getShadowPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, (-1.0), 1.0E7);
      borderArrangement0.add(colorBlock0, (Object) null);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(1.0E7, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setPadding((-243.5651241117384), (-243.5651241117384), 0.0, 0.0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals((-243.5651241117384), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
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
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle("");
      borderArrangement0.add(textTitle0, (Object) null);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 16384.0);
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
      Document document0 = new Document();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PdfWriter pdfWriter0 = PdfWriter.getInstance(document0, (OutputStream) pipedOutputStream0);
      Type3Font type3Font0 = new Type3Font(pdfWriter0, true);
      Type3Glyph type3Glyph0 = (Type3Glyph)type3Font0.defineGlyph('{', 1, 0.0F, 0.86F, 0.0F, 0.0F);
      PdfGraphics2D pdfGraphics2D0 = (PdfGraphics2D)type3Glyph0.createGraphicsShapes((-1.0F), 180.421F, true, (-1870.0F));
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, pdfGraphics2D0, (-45.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-45.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
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
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
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

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement1);
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement1.add(blockContainer0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement1.add(blockContainer0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement1);
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement1.add(blockContainer0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement1);
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      borderArrangement1.add(blockContainer0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement1.equals(borderArrangement0);
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
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Size2D size2D0 = blockContainer0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
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
  public void test20()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Range range0 = ValueAxis.DEFAULT_RANGE;
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RingPlot ringPlot0 = new RingPlot();
      Color color0 = (Color)ringPlot0.getShadowPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 1156.086665, (-243.5651241117384));
      borderArrangement0.add(colorBlock0, (Object) null);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(1156.086665, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Range range0 = new Range((double) 10, (double) 10);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }
}
