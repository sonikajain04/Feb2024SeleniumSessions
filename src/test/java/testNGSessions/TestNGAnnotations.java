package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//global pre conditions
	//pre conditions
	//test steps + exp vs act result
	//after steps
	//global after steps
	
	@BeforeSuite
	public void connectDB() {
		System.out.println("BS ---- Connect DB");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT ---- Create User");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC ---- Launch Browser");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM ---- Login to app");
	}
	@Test
	public void searchTest() {
		System.out.println("Test 1 ----- Search Test");
	}
	@Test
	public void addToCartTest() {
		System.out.println("Test 2 ----- add to cart Test");
	}
	@Test
	public void checkOtTest() {
		System.out.println("Test 3 ----- Check out Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM ---- logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC ---- close browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT ---- delete User");
	}

	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS ----  disconnect with DB");
	}
}
