package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// 1. JS Alert - we can't have 2 textbox on JS alert, can't inspect anything and has 1 ok buttom
		// 2. Confirmation Alert - Cancel/ok button
		// 3. prompt - Textbox with ok
		
		//other popups - authentication,fileUpload, Ads popups/promotion popup, cookies popup
		//	Alert = interface
		
		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		//driver.switchTo().alert();//noAlertpresentException - no such alert present
		
//		1. Alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		String text=alert.getText();
//		System.out.println(text);	
//		alert.accept();
	

		//2. confirmation
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		String text=alert.getText();
//		System.out.println(text);
//		alert.accept();
//	alert.sendKeys("Testing"); if there is no input on alert - eleNotInteractableException
//		String text=alert.getText()//
//		System.out.println(text);
//		//alert.dismiss();		

		//3. prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		
		alert.sendKeys("Testing");
		
		//alert.accept();
		alert.dismiss();		
	}
}