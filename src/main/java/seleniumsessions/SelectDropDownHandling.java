package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// htmltag=select tag
		//Select 
		
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		By country=By.id("Form_getForm_Country");
		By employee=By.id("Form_getForm_NoOfEmployees");
		
		Select select_country = new Select(driver.findElement(country));
		
		//select_country.selectByIndex(0);//when we are sure on the size will not change - e.g. month list 
		//select_country.selectByIndex(10) 
		
		//select_country.selectByVisibleText("Belgium");// mostly used, if element not found than exception is thrown
		
		//select_country.selectByValue("Algeria");//give the value attribute value
		
		//Select select_emp = new Select(driver.findElement(employee));
		//select_emp.selectByVisibleText("76 - 100 ");
		
		doSelectByVisibleText(country,"India");
		doSelectByVisibleText(employee,"201 - 250");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}	
	
	public static void doSelectByVisibleText(By locator,String visibleText) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibleText);;
	}	
	
	public static void doSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);;
	}	
}
