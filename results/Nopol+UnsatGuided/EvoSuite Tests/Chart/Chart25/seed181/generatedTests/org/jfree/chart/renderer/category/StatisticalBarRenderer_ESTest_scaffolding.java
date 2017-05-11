/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jan 25 00:17:41 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StatisticalBarRenderer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.renderer.category.StatisticalBarRenderer"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StatisticalBarRenderer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.Effect3D",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.util.PaintList",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.data.Values2D",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.data.RangeType",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.Value",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.util.PaintUtilities"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StatisticalBarRenderer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.labels.StandardXYItemLabelGenerator",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.urls.StandardXYZURLGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.data.general.Series",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.chart.text.TextBox",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.renderer.xy.VectorRenderer",
      "org.jfree.chart.plot.PieLabelRecord"
    );
  }
}