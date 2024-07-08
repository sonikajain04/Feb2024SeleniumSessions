package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		
		System.out.println("");
		System.out.println("");
		
		By emailId =By.id("input-email"); 
		By pwdId=By.id("input-password");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(emailId,"naveen@gmail.com");
		eleUtil.doSendKeys(pwdId,"test@123");
		
		driver.close();

	}

}
