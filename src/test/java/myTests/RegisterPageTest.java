package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"Kavi","selenium","Kavi1100@gmail.com.com","9812374567","Kavi@12345"},
			{"Kavi","selenium","KaviData1@gmail.com.com","9812374567","Kavi@12345"},
			{"Kavi","selenium","KaviData2@gmail.com.com","9812374567","Kavi@12345"},
		};
	}
	
	@Test(dataProvider="getRegTestData")
	public void registerTest(String firstName, String lastName, String emailID, String telephone, String password) throws InterruptedException {
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(emailID);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		
		driver.findElement(By.name("agree")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		
		String header=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		Thread.sleep(5000);
		Assert.assertEquals(header, "Your Account Has Been Created!	");
	}
}
