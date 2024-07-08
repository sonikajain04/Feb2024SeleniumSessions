package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RightPanellinks {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> rightLinksList= driver.findElements(By.xpath("//a[@class='list-group-item']"));
		
		System.out.println(rightLinksList.size());
		
		for(WebElement e:rightLinksList) {
			String text=e.getText();
			System.out.println(text);
		}
		//assignment = get text of all the footer

	}

}
