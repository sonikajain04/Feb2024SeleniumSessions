package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickWithWait {
	 	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		By signLink = By.linkText("Sign Up");
		ElementUtil eUtil=new ElementUtil(driver);
		eUtil.clickWhenReady(signLink, 10);

	}

}
