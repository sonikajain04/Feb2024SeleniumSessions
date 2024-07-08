package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		// driver.get("https://www.google.com/");
		driver.get("https://www.google.com/");
		List<WebElement> rightLinksList= driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
				System.out.println(rightLinksList.size());
				
				for(WebElement e:rightLinksList) {
					String text=e.getText();
					System.out.println(text);
				}
				
//assignment 1:
		
	}

}
