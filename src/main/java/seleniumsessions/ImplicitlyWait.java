package seleniumsessions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//selenium 3.0
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4.0
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//Thread.sleep(5000);
		
		driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	
	}
	

}
