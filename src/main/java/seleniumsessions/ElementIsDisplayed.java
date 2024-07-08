package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> rightLinksList = driver.findElements(By.xpath("//a[@class='list-group-item']"));

		// boolean flag=driver.findElement(By.id("input-email11")).isDisplayed();
		// System.out.println(flag);

		By emailId = By.id("input-email");
		By logo = By.className("img-responsive");

//		if (doIsDisplayed(emailId)) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//		}
		
//		List<WebElement> emailIDList=driver.findElements(emailId);
//		if(emailIDList.size()==1) {
//			System.out.println("email ID is present on the page");
//		}else {
//			System.out.println("email ID is present two or more times");
//		}
		
		System.out.println(isElementDisplayed(logo));
		
		By forgotPwdLink = By.linkText("Forgotten Password");
		System.out.println(isElementDisplayed(forgotPwdLink,2));
		
	}
	
	public static boolean doIsDisplayed(By locator) {
		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element id displayed : " + locator);
			return flag;
		} catch (Exception e) {
			System.out.println("element id displayed : " + locator);
			e.printStackTrace();
		}
		return false;
	}

	public static WebElement getElement(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element;
		} catch (NoSuchElementException e) {
			System.out.println("Element not present on the page... " + locator);
			e.printStackTrace();
			return null;
		}
	}
	public static boolean isElementDisplayed(By locator) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount==1) {
			System.out.println("single element is displayed : "+locator);
			return true;
		}else {
			System.out.println("single element is displayed : "+locator);
		}
		return false;
	}
	
	public static boolean isElementDisplayed(By locator,int expectedCount) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount==expectedCount) {
			System.out.println("single element is displayed : "+locator);
			return true;
		}else {
			System.out.println("single element is displayed : "+locator);
		}
		return false;
	}
}
