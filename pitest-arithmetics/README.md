You need to run mvn test first, after you will run mvn org.pitest:pitest-maven:mutationCoverage

Mutant Simulation Software: https://pitest.org/

Src location: /pitest-arithmetics/src/main/java/com/group17/pitest
pitest location: /pitest-arithmetics/src/test/java/com/group17/pitest

Summary: 
Mutant Simulation Software for sum, difference, product and quotient.

1. Install Maven.
2. Navigate to the pitest-arithmetics folder where the pom.xml file is located.
3. Run the following commands:
	mvn clean
	mvn test
	mvn org.pitest:pitest-maven:mutationCoverage
