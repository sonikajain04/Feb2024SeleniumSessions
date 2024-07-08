package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetOptionsWithoutSelectClass {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		//1. Select a value from drop down without using select class methods: 
		//by index, by value, by visibleText

		//2. Select a value from drop down without using select class itself
	
	
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		By country=By.id("Form_getForm_Country");
		By employee=By.id("Form_getForm_NoOfEmployees");
		
		//selectValueFromDropDown(country,"India");
		
		By countryOption = By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> countryList=driver.findElements(countryOption);
		System.out.println(countryList.size());
		
		for(WebElement e:countryList) {
			String text=e.getText();
			if(text.equals("India")) {
				e.click();
				break;
			}
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectValueFromDropDown(By locator,String optionText) {
		Select select_country = new Select(driver.findElement(locator));
		List<WebElement> countryOptions=select_country.getOptions();
		for(WebElement e: countryOptions) {
			String text = e.getText();
			if(text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}	
	}
	
	public static void selectValueFromDropDownWithoutSelectClass(By locator,String optionText) {	
		List<WebElement> OptionsList=driver.findElements(locator);
		for(WebElement e: OptionsList) {
			String text = e.getText();
			if(text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}	
	}
}