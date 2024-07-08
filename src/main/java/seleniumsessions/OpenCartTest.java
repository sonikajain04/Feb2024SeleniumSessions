package seleniumsessions;

import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		String browser = "chrome";

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/");
		String actTitle=brUtil.getPageTitle();
		
		if(actTitle.equals("Your Store"))
		{
			System.out.println("title is correct");
		}else
		{
			System.out.println("title is not correct");
		}
		String appURL = brUtil.getPageCurrentURL();
		if(appURL.contains("opencart"))
		{
			System.out.println("URL is correct");
		}else
		{
			System.out.println("URL is not correct");
		}
		brUtil.quitBrowser();
	}

}
