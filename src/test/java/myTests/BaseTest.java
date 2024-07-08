package myTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumsessions.BrowserException;

public class BaseTest {
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void setup(String browserName,String url) {
		
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("plz pass the right browser :"+browserName);
			throw new BrowserException("WRONG BROWSER PASSED");
		}
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Parameters({"browser","url"})
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
