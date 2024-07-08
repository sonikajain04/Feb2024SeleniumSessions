package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrowDownAllOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
		// mac - Commmand + shift +2 - shortcut for suggestion
		// win - cont+Shf+2

//		Select select_country = new Select(driver.findElement(country));
//
//		List<WebElement> countryOptions=select_country.getOptions();
//		System.out.println(countryOptions.size());
//		
//		for(WebElement e: countryOptions) {
//			String text = e.getText();
//			System.out.println(text);
//		}	
		
		List<String> countryList=getDropDownOptionTextList(country);
		System.out.println(countryList);
	
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		List<String> empList=getDropDownOptionTextList(country);
		System.out.println(empList);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(getDropDownListCount(country));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(getDropDownListCount(employee));
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static int getDropDownListCount(By locator){
		Select selectLocator = new Select(driver.findElement(locator));
		return selectLocator.getOptions().size();
	}
	public static List<String> getDropDownOptionTextList(By locator) {
		Select select_country = new Select(driver.findElement(locator));

		List<WebElement> countryOptions=select_country.getOptions();
		List<String> optionTextList=new ArrayList<String>();
		System.out.println(countryOptions.size());
		
		for(WebElement e: countryOptions) {
			String text = e.getText();
			System.out.println(text);
		}
		return optionTextList;
	}
}
