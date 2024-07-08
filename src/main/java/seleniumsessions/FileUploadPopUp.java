package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type=file
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\User\\Documents\\Sonika\\Selenium Training\\fileUploadTest.txt");
	
		//if type not file then we can use before option:
		//1. AutoIT ; win based will not work with docker/cloud/MAC or Linux/jenkins/headless
		//2. Sikuli ; resolution/image based specific to machines
		//3. Robot class ; ; win based will not work with docker/cloud/MAC or Linux/jenkins/headless
	
	}
}
