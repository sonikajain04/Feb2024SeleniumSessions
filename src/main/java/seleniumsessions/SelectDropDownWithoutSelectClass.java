package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
		By countryOptions = By.xpath("");
		List<WebElement> countryList;

	}
	
	public static void selectValueFromDropDown(By locator,String optionText) {
		Select select = new Select(getElement(locator));
	}
	
	private static WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void selectValueFromDropDownWithoutSelectClass(By locator, String optionText) {
		
		List<WebElement> optionsList = driver.findElements(locator);
		for(WebElement e: optionsList) {
			String text=e.getText();
			if(text.equals(optionText)) {
				e.click();
			}
		}
	}

	
	
}
