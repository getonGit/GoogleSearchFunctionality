Relayr QA Tasks

Task1:
Task1_Relayr pdf documents the QS process related to task1

Task2 Alternative:

Pre-requisites: Eclipse IDE installation is required along with related jar files and system properties


2 set of automation tests are written
Method1 to run the 'GoogleSearchUI' project using cucumber/JUnit
Download the 'GoogleSearchUI' project from this repository https://github.com/getonGit and import to eclipse
In the src folder of the project there are 3 main components
1. feature folder, containing the feature/scenarios to be tested. It is written in Gherkin format
2. googleSearch package, which has the TestRun class
3. stepdef package, which has the steps definitions to the scenarios written in the feature file

How to run : Right click the 'TestRun' file and run as JUnit test.

Several of the search functionality scenarios are written in Task2 Alt_test scenarios

Method2 to run 'SearchBarGoogle2' 
Download the 'GoogleSearchUI' project from the repository https://github.com/getonGit/GoogleSearch2 and import to eclipse
In the src folder, test cases related to 2 scenarios have been tested
1. GoogleSearch : This scenario logs into google and searches for a string given and quits
2. ClearSearch : This scenario tests entering first string and clears it out and then enters new string, and test results related to new string are displayed by clearing the old results related to first string.
How to run: Right click the searchSuite.xml file and run as TestNGSuite
Reports are also generated
