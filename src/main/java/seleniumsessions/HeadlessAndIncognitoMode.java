package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessAndIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
	//	co.addArguments("--headless");
		co.addArguments("--incognito");
		
//		EdgeOptions edgeOptions = new EdgeOptions();
//		edgeOptions.addArguments("--headless");
//		edgeOptions.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new EdgeDriver(edgeOptions);
		 
        System.out.println("Executing Driver in Headless mode..");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
