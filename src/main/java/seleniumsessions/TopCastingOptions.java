package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1. Valid and recommended
		// WebDriver driver = new ChromeDriver();
		// 2. Valid but not recommended
		// SearchContext driver = new ChromeDriver();

		// 3. Valid but recommended
		// RemoteWebDriver driver = new ChromeDriver();

		// 4. Valid and recommended for remote execution (AWS,cloud, server MC)
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

		// 5. Valid but not recommended
		// SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);


		// 6. Valid but not recommended (only for 2 browsers: Edge, chrome)
		// ChromiumDriver driver = new ChromeDriver();
		//driver.new EdgeDriver();

		
		//7. not valid
		RemoteWebDriver driver;
	}

}
