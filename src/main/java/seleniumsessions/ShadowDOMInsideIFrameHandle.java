package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMInsideIFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		//Browser > Page > iframe > ShadowDom > Element

		
		Thread.sleep(8000);
		
		driver.switchTo().frame("pact");
		
		Thread.sleep(5000);
		
		String jsScript="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement ele=(WebElement)js.executeScript(jsScript);
		ele.sendKeys("masala tea");
	}

}
