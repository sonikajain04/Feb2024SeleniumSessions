package testNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class OpenCartLoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

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
		Assert.assertTrue(flag,"********** Logo not Matched *******");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
