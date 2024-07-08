package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//automation steps+validation/checkpoints=automation testing
		
		//open the browser
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		
		
		//enter the url
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//get the page title
		String title=driver.getTitle();
		System.out.println("Page Title : "+title);
		
		//checkpoints
		if(title.equals("Google"))
		{
			System.out.println("title is correct");
		}else
		{
			System.out.println("title is not correct");
		}
		
		//get the page url
		String url=driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		
		//checkpoints
		if(url.contains("google.com"))
		{
			System.out.println("URL is correct");
		}else
		{
			System.out.println("URL is not correct");
		}

		//close browser
		driver.quit();
	}

}
