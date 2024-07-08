package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SessionIdWithQuitClose {

	public static void main(String[] args) {
		
		//open the browser
				WebDriver driver = new ChromeDriver();
				
				//enter the url
				driver.get("https://www.google.com");
				
				//get the page title
				String title=driver.getTitle();
				System.out.println("Page Title : "+title);
				
				
				//get the page url
				String url=driver.getCurrentUrl();
				System.out.println("Current URL : "+url);

				//close browser
				//driver.quit();
				
				driver.close();
				driver=new ChromeDriver();
				
				driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
				
				//quit: NoSuchsessionException: Session ID is null. Using WebDriver after calling quit() ?
				//close: NoSuchSessionException: Invalid session ID.
				driver.quit();
	}
}
