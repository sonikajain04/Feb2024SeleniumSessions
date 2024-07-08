package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	public static void main(String[] args) {
		//Pseudo classes:
		//::Before
		//::After
		//::
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String firstNameJS
		="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),\"::before\").getPropertyValue('content')";
		
		String firstNameColorJS
		="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),\"::before\").getPropertyValue('color')";
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		String mand_FieldText=js.executeScript(firstNameJS).toString();
		System.out.println(mand_FieldText);
		
		if(mand_FieldText.contains("*")) {
			System.out.println("Mandaroy symbol is displayed");
		}
		String mand_FieldColor=js.executeScript(firstNameColorJS).toString();
		System.out.println(mand_FieldColor); 
		
		if(mand_FieldColor.contains("rgb(255, 0, 0)")) {
			System.out.println("Red color is displayed for Mandaroy field");
		}
		
	}

}
