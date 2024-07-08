package testNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	//default p is alphabatic order
	//P can be -1, 0 but its not good practise
	//P can be duplicate P, then it will execute by default P as alphabatic p
	//if few test doesn't have P then those test will have P as 0 and would be given P as first
	//negative p will execute first, non priority P =0 will execute next  and then positive
	//description can be added with p in any sequence with comma separation.
	
	
	@Test(priority=1,description ="P=1")
	public void searchTest() {
		System.out.println("Test 1 ----- Search Test");
	}
	@Test(priority=2)
	public void addToCartTest() {
		System.out.println("Test 2 ----- add to cart Test");
	}
	@Test
	public void checkOutTest() {
		System.out.println("Test 3 ----- Check out Test");
	}
	@Test(priority=0)
	public void paymentTest() {
		System.out.println("Test 2 ----- add to cart Test");
	}
	@Test(priority=3)
	public void orderTest() {
		System.out.println("Test 3 ----- Check out Test");
	}

}
