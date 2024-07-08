package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		By pricingLink=By.linkText("Pricing");
		
		waitForElementVisibleWithFluentWait(pricingLink,10,2);
	}
	public static WebElement waitForElementVisibleWithFluentWait(By locator,int timeOut,int timeInterval) {
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(timeOut))
			.pollingEvery(Duration.ofSeconds(timeInterval))
			.ignoring(NoSuchElementException.class)
			.withMessage("====element not found=====");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement waitForPresenceWithFluentWait(By locator,int timeOut,int timeInterval) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(timeInterval))
				.ignoring(NoSuchElementException.class)
				.withMessage("====element not found=====");

			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
}
