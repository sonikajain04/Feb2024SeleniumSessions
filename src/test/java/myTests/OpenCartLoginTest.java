package myTests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class OpenCartLoginTest extends BaseTest{
	@Test
	public void loginPageTitleTest() {
		String title=driver.getTitle();
		System.out.println("Page title : "+title);
		Assert.assertEquals(title, "Account Login","********** Title not Matched *******");
	}
	@Test
	public void loginPageURLTest() {
		String url=driver.getCurrentUrl();
		System.out.println("Page URL : "+url);
		Assert.assertTrue(url.contains("route=account/login"),"********** URL not Matched *******");
	}
	@Test
	public void loginPageLogoTest() {
		boolean flag=driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertTrue(flag,"********** Logo not Missing *******");
	}
}
