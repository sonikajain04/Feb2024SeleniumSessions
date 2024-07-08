package testNGSessions;

import org.testng.annotations.Test;

public class InnvoationCountConcept {
	
	//to run or to monitor the performance; test data creation
	//sequencial execution
	
	@Test(invocationCount =3)
	public void loginTest() {
		System.out.println("Test 2 ----- login Test");
	}
	
}
