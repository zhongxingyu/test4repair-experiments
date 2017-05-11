# issta17

## What is this repository?
This repository contains the the experimental materials and results related to our submission (Test Case Generation for 
Program Repair: A Study of Feasibility and Effectiveness) to ISSTA 2017. Test-suite based automated program repair 
techniques are promising  yet suffer from the overfitting issue. We investigate the feasibility and effectiveness of 
test case generation in alleviating the overfitting issue, and have proposed two approaches for using test case generation
to improve test suite based repair. The effectiveness of the proposed approaches is evaluated on 224 bugs of the Defects4J 
repository. We use state-of-art test generation tool EvoSuite in this study. This repository contains the source code used 
to run the experiment, test cases generated by EvoSuite, patches generated by our approaches, and our analysis of the 
correctness of the generated patches.

## Strcuture of this repository

The src folder contains the source code used to run the experiment. Among which, the folder Nopol+UnsatGuided contains the code used to run the experiment of combining Nopol with UnsatGuided (the proposed approach for using test case generation
to improve synthesis-based based repair techniques), and the folder jGenProg+MinImpact contains the code used to run the experiment of combining jGenProg with MinImpact (the proposed approach for using test case generation to improve generate and validate repair techniques).

The results folder contains the experimental results. Similarly, the folder Nopol+UnsatGuided and jGenProg+MinImpact contain the results for combing Nopol with UnsatGuided and combining jGenProg with MinImpact respectively. Under the directory of either Nopol+UnsatGuided or jGenProg+MinImpact, there exist two directories named EvoSuite Tests and Patches and Analysis. The EvoSuite Tests directory contain the automatically generated tests of all seeds for each buggy version under study. The Patches and Analysis directory contain the patches generated using the two proposed approaches. For each buggy version, we first list the patch(es) generated for each seed and then provide a summary of the patches generated for all seeds and our manual analysis of the correctness of the generated patches.

## EvoSuite use
The test generation tool used in this study is EvoSuite, and the EvoSuite version used corresponds to the commit ID 7a694a3aa2c5d4025c1ba0e1e9ef454398001a8b.

In particular, our experiment runs EvoSuite with the following setting:

" -Dassertion_timeout=1800 -Dminimization_timeout=1800 -Djunit_check_timeout=1800 -Dwrite_junit_timeout=300 
-Dinitialization_timeout=300 -Dglobal_timeout=18000 -Dsearch_budget=100000 -Dstopping_condition=MaxStatements 
-Dno_runtime_dependency=true -Dsandbox=false -Dp_reflection_on_private=0.0 -Dreflection_start_percent=1.0   
-Dp_functional_mocking=0.0 -Dfunctional_mocking_percent=1.0 -mem 2000 "

We run EvoSuite 30 times with different seeds to account for the randomness of EvoSuite.