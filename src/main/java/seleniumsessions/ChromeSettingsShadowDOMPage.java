package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingsShadowDOMPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("chrome://settings/");
		Thread.sleep(5000);
		
		String jsScript=
		"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";

		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement ele=(WebElement)js.executeScript(jsScript);
		
		ele.sendKeys("Sync and Google services");
		
	}

}
