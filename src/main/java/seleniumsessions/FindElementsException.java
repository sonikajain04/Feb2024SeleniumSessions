package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementsException {

	public static void main(String[] args) {
WebDriver driver = new EdgeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.xpath("input-email")).sendKeys("test@gmail.com");
		
		List<WebElement> rightLinksList= driver.findElements(By.xpath("//a[@class='list-group-item111']"));
		System.out.println(rightLinksList.size());
	}

}
