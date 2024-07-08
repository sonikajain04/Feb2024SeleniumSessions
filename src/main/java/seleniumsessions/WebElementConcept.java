package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		

		//approach 1
		//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//approach 2 : hitting server everytime
//		WebElement email=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");
		
		//approach 3 - By locator : OR
		//this is not hitting the server, only creating element
//		By emailId =By.id("input-email"); 
//		By pwdId=By.id("input-password");
//		
//		WebElement emailId_ele=driver.findElement(emailId);
//		WebElement pwdId_ele=driver.findElement(pwdId);
//		
//		emailId_ele.sendKeys("naveen@gmail.com");
//		pwdId_ele.sendKeys("test@123");
		
		//approach 4 - By locator + Generic function for webElement
//		By emailId =By.id("input-email"); 
//		By pwdId=By.id("input-password");
		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(pwdId).sendKeys("test@123");
		
		//approach 5 - By locator + Generic function for webElement and sendKeys
//		By emailId =By.id("input-email"); 
//		By pwdId=By.id("input-password");
//		
//		doSendKeys(emailId,"naveen@gmail.com");
//		doSendKeys(pwdId,"test@123");
		
		//approach 6 - By locator + Generic function for webElement and sendKeys: ElementUtil class
//		By emailId =By.id("input-email"); 
//		By pwdId=By.id("input-password");
//
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId,"naveen@gmail.com");
//		eleUtil.doSendKeys(pwdId,"test@123");
		
		//approach 7 - By locator + BrowserUtil class + ElementUtil class
		
		
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
