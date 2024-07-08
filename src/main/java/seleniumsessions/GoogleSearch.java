package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		
		ElementUtil eleUtil=new ElementUtil();
		driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
		
		By searchField=By.name("q");
		//By suggestions = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		By suggestions = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		//driver.findElement(By.name("q")).sendKeys("Naveen Automation labs");
		
		eleUtil.doSearch(searchField,"macbook",suggestions," pro m3");
	}
}
