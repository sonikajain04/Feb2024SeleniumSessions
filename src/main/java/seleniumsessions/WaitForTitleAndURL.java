package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		By pricingLink=By.linkText("Pricing");
		ElementUtil eUtil=new ElementUtil(driver);
		eUtil.clickWhenReady(pricingLink, 10);	
		
		String expTitle=waitForTitleContains(10, "PRICING");
		System.out.println(expTitle);
		System.out.println(expTitle.contains("PRICING"));
		
		
		String title=waitForTitleToBe(10, "Free CRM Pro PRICING");
		System.out.println(title);
		System.out.println(title.contains("PRICING"));
		
		String pageURL=waitForURLToBe(10, "pricing.html");
		System.out.println(pageURL);
		System.out.println(pageURL.contains("PRICING"));
	}
public static String waitForTitleContains(int timeOut, String titleText) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	try {
			if(wait.until(ExpectedConditions.titleContains(titleText))){
				return driver.getTitle();
		}
	}catch(TimeoutException e) {
		System.out.println("title not found");
	}
	return driver.getTitle();
}
public static String waitForTitleToBe(int timeOut, String expectedTitle) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	try {
			if(wait.until(ExpectedConditions.titleIs(expectedTitle))){
				return driver.getTitle();
		}
	}catch(TimeoutException e) {
		System.out.println("title not found");
	}
	return driver.getTitle();
}

//URL

public static String waitForURLContains(int timeOut, String urlText) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	try {
			if(wait.until(ExpectedConditions.urlContains(urlText))){
				return driver.getCurrentUrl();
		}
	}catch(TimeoutException e) {
		System.out.println("URL not found");
	}
	return driver.getCurrentUrl();
}
public static String waitForURLToBe(int timeOut, String expectedURL) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	try {
			if(wait.until(ExpectedConditions.urlToBe(expectedURL))){
				return driver.getCurrentUrl();
		}
	}catch(TimeoutException e) {
		System.out.println("URL not found");
	}
		return driver.getCurrentUrl();
	}
}
