The information about the original patch generated by jGenProg for each of the 27 buggy versions is obtained from the paper
"Automatic Repair of Real Bugs in Java: A Large-Scale Experiment on the Defects4J Dataset" (Matias Martinez, Thomas Durieux, 
Romain Sommerard, Jifeng Xuan and Martin Monperrus). Accordingly, for table 2 of our paper, the results in the Correctness
column and Time column under the jGenProg column are extracted from the same paper. We use the results in that paper as the 
baseline to compare with the results obtained by combining jGenProg with MinImpact.

For combining jGenProg with MinImpact, the EvoSuite test generation process is invoked only when jGenProg generates some 
test-adequate patches within the given time budget (the time budget is 2 hours in our experiment). For some seeds, jGenProg
generates no patches within the time budget, so the EvoSuite test generation process is not invoked.

Note: We discovered a minor bug in the script for computing the overall result table (table 2 in the paper) for combining 
jGenProg with MinImpact. Consequently, the results presented here are sometimes different from the ones of the paper. But 
the general observations and conclusions related with combining jGenProg with MinImpact in the paper will not be affected.
For sake of open and sound science, we prefer to present here the most up-to-date experimental results.