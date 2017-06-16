/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Tue Jan 17 20:47:08 GMT 2017
 */


package org.jfree.data.xy;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.junit.BeforeClass;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.GuiSupport;
import org.evosuite.runtime.classhandling.JDKClassResetter;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import org.evosuite.runtime.thread.ThreadStopper;
import org.junit.Rule;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.RuntimeSettings;

@EvoSuiteClassExclude
public class XYSeries_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.jfree.data.xy.XYSeries";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        XYSeries_ESTest_scaffolding.setSystemProperties();
        XYSeries_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(XYSeries_ESTest_scaffolding.class.getClassLoader(), "org.jfree.data.time.Quarter", "org.jfree.data.category.IntervalCategoryDataset", "org.jfree.data.time.Year", "org.jfree.data.time.SerialDate", "org.jfree.data.DomainOrder", "org.jfree.data.resources.DataPackageResources", "org.jfree.data.time.Minute", "org.jfree.chart.util.SortOrder", "org.jfree.data.DomainInfo", "org.jfree.data.general.DatasetChangeListener", "org.jfree.data.statistics.MultiValueCategoryDataset", "org.jfree.data.general.AbstractDataset", "org.jfree.data.general.AbstractSeriesDataset", "org.jfree.data.RangeInfo", "org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.xy.AbstractIntervalXYDataset", "org.jfree.data.xy.XYDataItem", "org.jfree.data.general.DatasetGroup", "org.jfree.data.time.SpreadsheetDate", "org.jfree.data.time.Millisecond", "org.jfree.data.xy.AbstractXYDataset", "org.jfree.data.time.Day", "org.jfree.data.general.SeriesDataset", "org.jfree.data.xy.XYDataset", "org.jfree.data.Values2D", "org.jfree.data.general.SeriesChangeEvent", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.time.TimeSeriesDataItem", "org.jfree.data.UnknownKeyException", "org.jfree.data.general.DatasetChangeEvent", "org.jfree.data.time.Month", "org.jfree.data.time.TimePeriod", "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.time.TimeSeriesCollection", "org.jfree.data.category.DefaultCategoryDataset", "org.jfree.data.general.Dataset", "org.jfree.data.general.KeyedValuesDataset", "org.jfree.data.time.Week", "org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.TimePeriodFormatException", "org.jfree.data.general.DefaultKeyedValuesDataset", "org.jfree.data.time.Hour", "org.jfree.data.statistics.BoxAndWhiskerItem", "org.jfree.data.time.TimeSeries", "org.jfree.data.general.Series", "org.jfree.data.DefaultKeyedValues", "org.jfree.data.general.PieDataset", "org.jfree.data.xy.XYSeriesCollection", "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset", "org.jfree.data.time.FixedMillisecond", "org.jfree.data.xy.IntervalXYDataset", "org.jfree.data.general.DefaultPieDataset", "org.jfree.data.DataUtilities", "org.jfree.chart.util.ObjectUtilities", "org.jfree.chart.util.PublicCloneable", "org.jfree.data.general.KeyedValues2DDataset", "org.jfree.data.time.TimePeriodAnchor", "org.jfree.data.xy.IntervalXYDelegate", "org.jfree.data.time.Second", "org.jfree.data.time.SimpleTimePeriod", "org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.time.MonthConstants", "org.jfree.data.KeyedValues2D", "org.jfree.data.Values", "org.jfree.data.KeyedObjects2D", "org.jfree.data.category.CategoryDataset", "org.jfree.data.xy.XYSeries", "org.jfree.data.Range", "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "org.jfree.data.KeyedValues", "org.jfree.data.general.SeriesException", "org.jfree.data.general.DefaultKeyedValues2DDataset");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(XYSeries_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.jfree.data.general.Series", "org.jfree.data.xy.XYSeries", "org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.Month", "org.jfree.data.time.Day", "org.jfree.data.time.SerialDate", "org.jfree.data.time.SpreadsheetDate", "org.jfree.data.time.Second", "org.jfree.data.xy.XYDataItem", "org.jfree.data.general.SeriesChangeEvent", "org.jfree.data.general.AbstractDataset", "org.jfree.data.category.DefaultCategoryDataset", "org.jfree.data.jdbc.JDBCCategoryDataset", "org.jfree.data.general.DatasetGroup", "org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.general.AbstractSeriesDataset", "org.jfree.data.xy.AbstractXYDataset", "org.jfree.data.xy.AbstractIntervalXYDataset", "org.jfree.data.xy.DefaultTableXYDataset", "org.jfree.data.xy.IntervalXYDelegate", "org.jfree.data.time.DynamicTimeSeriesCollection", "org.jfree.data.time.Millisecond", "org.jfree.data.time.Minute", "org.jfree.data.time.Hour", "org.jfree.data.xy.CategoryTableXYDataset", "org.jfree.data.time.Week", "org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.Year", "org.jfree.data.time.TimePeriodFormatException", "org.jfree.data.time.Quarter", "org.jfree.data.general.DefaultKeyedValues2DDataset", "org.jfree.data.statistics.HistogramDataset", "org.jfree.data.statistics.HistogramType", "org.jfree.data.xy.VectorSeriesCollection", "org.jfree.data.gantt.TaskSeriesCollection", "org.jfree.data.xy.DefaultWindDataset", "org.jfree.data.xy.MatrixSeries", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.KeyedObjects2D", "org.jfree.data.general.DefaultPieDataset", "org.jfree.data.general.DefaultKeyedValuesDataset", "org.jfree.data.DefaultKeyedValues", "org.jfree.data.jdbc.JDBCPieDataset", "org.jfree.data.general.DatasetChangeEvent", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.category.SlidingCategoryDataset", "org.jfree.data.time.TimeSeriesDataItem", "org.jfree.data.statistics.SimpleHistogramBin", "org.jfree.data.general.CombinedDataset", "org.jfree.data.xy.DefaultXYDataset", "org.jfree.data.time.SimpleTimePeriod", "org.jfree.data.xy.AbstractXYZDataset", "org.jfree.data.xy.DefaultXYZDataset", "org.jfree.data.gantt.SlidingGanttCategoryDataset", "org.jfree.data.time.FixedMillisecond", "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "org.jfree.data.Range", "org.jfree.data.general.DefaultKeyedValueDataset", "org.jfree.data.DefaultKeyedValue", "org.jfree.data.xy.XYBarDataset", "org.jfree.data.jdbc.JDBCXYDataset", "org.jfree.data.xy.XYIntervalSeriesCollection", "org.jfree.data.time.TimeSeriesCollection", "org.jfree.data.time.TimePeriodAnchor", "org.jfree.chart.util.ObjectUtilities", "org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.resources.DataPackageResources", "org.jfree.data.general.SeriesException", "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset", "org.jfree.data.general.SubSeriesDataset", "org.jfree.data.time.TimePeriodValuesCollection", "org.jfree.chart.util.TableOrder", "org.jfree.data.category.CategoryToPieDataset", "org.jfree.data.statistics.SimpleHistogramDataset", "org.jfree.chart.util.SortOrder", "org.jfree.data.ComparableObjectSeries", "org.jfree.data.xy.VectorSeries", "org.jfree.data.xy.XIntervalSeriesCollection", "org.jfree.data.KeyedValueComparatorType", "org.jfree.data.UnknownKeyException", "org.jfree.data.xy.OHLCDataItem", "org.jfree.data.xy.XYIntervalSeries", "org.jfree.data.xy.DefaultHighLowDataset", "org.jfree.data.xy.DefaultOHLCDataset", "org.jfree.data.gantt.XYTaskDataset", "org.jfree.data.time.TimeTableXYDataset", "org.jfree.data.xy.YIntervalSeriesCollection", "org.jfree.data.ComparableObjectItem", "org.jfree.data.xy.VectorDataItem", "org.jfree.data.xy.XYCoordinate", "org.jfree.data.xy.Vector", "org.jfree.data.xy.DefaultIntervalXYDataset", "org.jfree.data.xy.MatrixSeriesCollection", "org.jfree.data.xy.XYSeriesCollection", "org.jfree.data.general.junit.DefaultPieDatasetTests", "org.jfree.data.general.WaferMapDataset", "org.jfree.data.xy.YIntervalSeries", "org.jfree.data.statistics.HistogramBin", "org.jfree.data.xy.XIntervalSeries");
    }
}

