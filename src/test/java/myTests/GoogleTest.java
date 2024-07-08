package myTests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class GoogleTest extends BaseTest{

	@Test(description = "checking title of login page")
	public void loginPageTitleTest() {
		String title=driver.getTitle();
		System.out.println("Page title : "+title);
		Assert.assertEquals(title,"Google","********** Title not Matched *******");
	}
	@Test(description = "checking url of login page")
	public void loginPageURLTest() {
		String url=driver.getCurrentUrl();
		System.out.println("Page URL : "+url);
		Assert.assertTrue(url.contains("google.com"),"********** URL not Matched *******");
	}
}
