package testNGSessions;

import org.testng.annotations.Test;

public class DependsOnConcept {
	
//if main test is failed, then all dependent test will be skipped
	//its not good practice to create dependency; create issue in parallel execution
	//it shd never be use, antipattern, tests shd always be execute individually
	
	// AAA pattern in testng in unit testing - Arrange, Act, Assert
	
	@Test()
	public void loginTest() {
		System.out.println("Test 2 ----- login Test");
	}
	
	@Test
	public void searchTest(dependsOnMethods="loginTest") {
		System.out.println("Test 1 ----- Search Test");
	}
}