package testNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	//if we knew in advance that exception might be shown then we can add it in the Test
	//then test will be passed
	//this is not exception handling just we are instructing to consider the exception
	//type of exception is exception.class
	//use case - negative cases
	//we will not have use it offen as it will not give any exception
	//we can have more then 1 execption
	
	String name;
	
	@Test(priority=1,description ="Search Test",expectedExceptions=ArithematicException.class, null pointer exception)
	public void searchTest() {
		System.out.println("Test 1 ----- Search Test");
		int i=9/0;
		System.out.println("hello");
		ExpectedExceptionConcept obj;
		System.out.println(obj.name);
	}
}
