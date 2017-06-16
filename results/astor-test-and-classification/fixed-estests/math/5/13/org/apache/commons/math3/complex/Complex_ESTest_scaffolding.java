/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Sun Jan 15 17:07:22 GMT 2017
 */


package org.apache.commons.math3.complex;

import org.evosuite.runtime.classhandling.ClassStateSupport;
import org.junit.BeforeClass;
import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.GuiSupport;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.classhandling.JDKClassResetter;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.evosuite.runtime.thread.ThreadStopper;
import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import org.junit.Rule;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.RuntimeSettings;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;

@EvoSuiteClassExclude
public class Complex_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.apache.commons.math3.complex.Complex";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        Complex_ESTest_scaffolding.setSystemProperties();
        Complex_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(Complex_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.math3.util.Precision", "org.apache.commons.math3.exception.util.ExceptionContextProvider", "org.apache.commons.math3.exception.util.ArgUtils", "org.apache.commons.math3.exception.MathArithmeticException", "org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.exception.NumberIsTooSmallException", "org.apache.commons.math3.util.FastMath$ExpIntTable", "org.apache.commons.math3.util.FastMath$lnMant", "org.apache.commons.math3.exception.NotPositiveException", "org.apache.commons.math3.util.FastMath$ExpFracTable", "org.apache.commons.math3.exception.MathIllegalArgumentException", "org.apache.commons.math3.util.FastMath$CodyWaite", "org.apache.commons.math3.complex.ComplexField", "org.apache.commons.math3.util.MathUtils", "org.apache.commons.math3.exception.MathIllegalNumberException", "org.apache.commons.math3.exception.util.LocalizedFormats", "org.apache.commons.math3.complex.ComplexField$LazyHolder", "org.apache.commons.math3.util.FastMath", "org.apache.commons.math3.FieldElement", "org.apache.commons.math3.exception.util.Localizable", "org.apache.commons.math3.exception.util.ExceptionContext", "org.apache.commons.math3.exception.NullArgumentException", "org.apache.commons.math3.Field", "org.apache.commons.math3.exception.NotFiniteNumberException", "org.apache.commons.math3.util.FastMathLiteralArrays");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(Complex_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.util.FastMath", "org.apache.commons.math3.util.FastMathLiteralArrays", "org.apache.commons.math3.util.FastMath$ExpIntTable", "org.apache.commons.math3.util.FastMath$ExpFracTable", "org.apache.commons.math3.util.FastMath$lnMant", "org.apache.commons.math3.util.Precision", "org.apache.commons.math3.exception.util.LocalizedFormats", "org.apache.commons.math3.complex.ComplexField", "org.apache.commons.math3.complex.ComplexField$LazyHolder", "org.apache.commons.math3.util.MathUtils", "org.apache.commons.math3.exception.MathIllegalArgumentException", "org.apache.commons.math3.exception.MathIllegalNumberException", "org.apache.commons.math3.exception.NumberIsTooSmallException", "org.apache.commons.math3.exception.NotPositiveException", "org.apache.commons.math3.exception.util.ExceptionContext", "org.apache.commons.math3.exception.NullArgumentException");
    }
}

