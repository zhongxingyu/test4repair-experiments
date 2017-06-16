/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Thu Jan 12 20:09:36 GMT 2017
 */


package org.apache.commons.math.linear;

import org.evosuite.runtime.classhandling.JDKClassResetter;
import org.junit.BeforeClass;
import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
import org.evosuite.runtime.GuiSupport;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import org.junit.Rule;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.thread.ThreadStopper;
import org.evosuite.runtime.RuntimeSettings;

@EvoSuiteClassExclude
public class EigenDecompositionImpl_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.apache.commons.math.linear.EigenDecompositionImpl";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        EigenDecompositionImpl_ESTest_scaffolding.setSystemProperties();
        EigenDecompositionImpl_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(EigenDecompositionImpl_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.math.linear.BlockFieldMatrix", "org.apache.commons.math.MathException", "org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.DecompositionSolver", "org.apache.commons.math.linear.RealVectorFormat", "org.apache.commons.math.linear.TriDiagonalTransformer", "org.apache.commons.math.ConvergenceException", "org.apache.commons.math.linear.AbstractRealMatrix$5", "org.apache.commons.math.linear.SingularMatrixException", "org.apache.commons.math.linear.MatrixUtils", "org.apache.commons.math.linear.AnyMatrix", "org.apache.commons.math.linear.FieldMatrixChangingVisitor", "org.apache.commons.math.linear.RealMatrix", "org.apache.commons.math.MaxIterationsExceededException", "org.apache.commons.math.linear.Array2DRowRealMatrix", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "org.apache.commons.math.linear.EigenDecomposition", "org.apache.commons.math.linear.FieldMatrixPreservingVisitor", "org.apache.commons.math.linear.NonSquareMatrixException", "org.apache.commons.math.linear.MatrixVisitorException", "org.apache.commons.math.linear.MatrixIndexException", "org.apache.commons.math.linear.AbstractRealMatrix", "org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor", "org.apache.commons.math.util.CompositeFormat", "org.apache.commons.math.linear.AbstractFieldMatrix", "org.apache.commons.math.linear.BigMatrix", "org.apache.commons.math.linear.FieldVector", "org.apache.commons.math.linear.Array2DRowFieldMatrix", "org.apache.commons.math.linear.BlockRealMatrix", "org.apache.commons.math.linear.EigenDecompositionImpl$Solver", "org.apache.commons.math.MathRuntimeException", "org.apache.commons.math.linear.InvalidMatrixException", "org.apache.commons.math.linear.RealVector", "org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.MathRuntimeException$1", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "org.apache.commons.math.MathRuntimeException$2", "org.apache.commons.math.linear.FieldMatrix", "org.apache.commons.math.MathRuntimeException$3", "org.apache.commons.math.MathRuntimeException$4", "org.apache.commons.math.MathRuntimeException$5", "org.apache.commons.math.MathRuntimeException$6", "org.apache.commons.math.MathRuntimeException$7", "org.apache.commons.math.MathRuntimeException$8", "org.apache.commons.math.MathRuntimeException$10", "org.apache.commons.math.MathRuntimeException$9", "org.apache.commons.math.linear.EigenDecompositionImpl$1");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(EigenDecompositionImpl_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.ArrayRealVectorTest$RealVectorTestImpl", "org.apache.commons.math.linear.SparseRealVectorTest$SparseRealVectorTestImpl", "org.apache.commons.math.util.CompositeFormat", "org.apache.commons.math.linear.RealVectorFormat", "org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.Array2DRowRealMatrix", "org.apache.commons.math.MathRuntimeException", "org.apache.commons.math.linear.InvalidMatrixException", "org.apache.commons.math.MathException", "org.apache.commons.math.ConvergenceException", "org.apache.commons.math.MaxIterationsExceededException", "org.apache.commons.math.linear.MatrixIndexException", "org.apache.commons.math.MathRuntimeException$4");
    }
}

