package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShodowDOMElementHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		String jsScript=
		"return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		Thread.sleep(5000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement pizza=((WebElement)js.executeScript(jsScript));
		pizza.sendKeys("Veg Pizza");
	
	}

}
