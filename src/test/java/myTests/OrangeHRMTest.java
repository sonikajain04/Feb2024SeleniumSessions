package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{

	@Test
	public void loginPageTitleTest() {
		String title=driver.getTitle();
		System.out.println("Page title : "+title);
		Assert.assertEquals(title, "Human Resources Management Software | OrangeHRM","********** Title not Matched *******");
	}
	@Test
	public void loginPageURLTest() {
		String url=driver.getCurrentUrl();
		System.out.println("Page URL : "+url);
		Assert.assertTrue(url.contains("orangehrm.com"),"********** URL not Matched *******");
	}
	
	
}
