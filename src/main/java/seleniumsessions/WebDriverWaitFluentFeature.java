package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitFluentFeature {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		By pricingLink=By.linkText("Pricing");
		
	//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class)
		.withMessage("====element not found====");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink)).click();
	}

}
