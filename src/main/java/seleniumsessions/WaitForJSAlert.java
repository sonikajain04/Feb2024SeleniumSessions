package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlert {
	static 	WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		By btnJSAlert=By.xpath("//button[.='Click for JS Alert']");
		By btnJSConfirm=By.xpath("//button[.='Click for JS Confirm']");
		By btnJSPrompt=By.xpath("//button[.='Click for JS Prompt']");
		
		ElementUtil eUtil=new ElementUtil(driver);
		//eUtil.clickWhenReady(btnJSAlert, 10);	
		//waitForJSAlertPresent(5);
		
//		eUtil.clickWhenReady(btnJSConfirm, 10);
//		String alertText =getAlertText(5);
//		System.out.println(alertText);
//		acceptAlert(10);
		
		//JS Confirm
//		eUtil.clickWhenReady(btnJSConfirm, 20);
//		getAlertText(3);
//		dismissAlert(5);
		
//		//JS Prompt
		eUtil.clickWhenReady(btnJSPrompt, 20);
		sendKeysAlert(10,"Alert Automation");
			
	}
	
	public static Alert waitForJSAlertPresent(int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeOut) {
		Alert alert= waitForJSAlertPresent(5);
		String text=alert.getText();
		alert.accept();
		return text;
	}
	public static void acceptAlert(int timeOut) {
		 waitForJSAlertPresent(5).accept();
	}
	public static void dismissAlert(int timeOut) {
		 waitForJSAlertPresent(5).dismiss();
	}
	public static void sendKeysAlert(int timeOut,String value) {
		 waitForJSAlertPresent(5).sendKeys(value);
		 Alert alert=waitForJSAlertPresent(5);
		 alert.accept();	
	}
}