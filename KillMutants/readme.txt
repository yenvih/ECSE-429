https://solidsoft.wordpress.com/2013/01/21/speed-up-mutation-testing-with-incremental-analysis-available-in-pit-0-29/

## JUnit in parallel
https://examples.javacodegeeks.com/core-java/junit/junit-run-tests-in-parallel/


#
mvn clean

# 
mvn test

## normal test running
mvn org.pitest:pitest-maven:mutationCoverage

## parallel test running , parallel running with surefire
## check pom.xml, there is a plugin for surefire tu run test in 4 threads
mvn -T 4 surefire:test org.pitest:pitest-maven:mutationCoverage

### also in the file
### /src/test/java/com/group17/pitest$ more TestSuiteSimple.java , there is 3 test cases running in parallel as demande as the project description

## also there is plugin in pom.xml for pitest, maven etc ...
## and in pom.xml there is :
##           <mutators>
                <mutator>ALL</mutator>
          </mutators>
### to have more test, check pitest.org for more information


### you should see this as output: 4 parallel threads .

[WARNING]
[INFO] Building with 4 threads
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building pitest-arithmetics 1.0-SNAPSHOT

