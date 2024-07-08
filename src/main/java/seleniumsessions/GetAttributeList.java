package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		By image=By.tagName("img");
		getElementAttributeList(image,"src");
		System.out.println("-------------");
		getElementAttributeList(image,"alt");
		System.out.println("-------------");
		getElementAttributeList(image,"style");

	}
	
	public static void getElementAttributeList(By locator, String attrName) {
		List<WebElement> imageList = getElements(locator);
		
		for(WebElement e: imageList) {
			String scrValue = e.getAttribute(attrName);
			if(attrName!=null && attrName!=null) {
				System.out.println(attrName);
			}
		}
	}

	public static List<WebElement> getElements(By image) {
		return driver.findElements(image);
	}

}
