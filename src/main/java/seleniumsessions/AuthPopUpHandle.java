package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		String username="admin";
		String password="admin";
		//Basic Authentication popup
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
	
		//Adding username and password in basic authentication window popup
		//format - "https://username:password@the-internet.herokuapp.com/basic_auth")
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//but if username or password has "@" in between then it might not work
	
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
	}

}
