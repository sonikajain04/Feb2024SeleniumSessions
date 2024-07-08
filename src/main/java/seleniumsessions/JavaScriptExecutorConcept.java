package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 
		 driver.get("");
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 String title=js.executeScript("return document.title").toString();
//		 System.out.println(title);
		 
		 JavaScriptUtil jsUtil = JavaScriptUtil(driver);
		 String title=jsUtil.getTitleByJs();
		 System.out.println(title);
		 
		 String url=jsUtil.getURLByJs();
		 System.out.println(url);
		 
		 jsUtil.generateJSAlert("login page");
		 
		 String pageText=jsUtil.getPageInnerText();
		 System.out.println(pageText);
		 
		 System.out.println(pageText.contains("Deal Pipeline"));
		 
		 jsUtil.scrollPageDown();
		 
		 WebElement ele=driver.findElement(By.xpath("//h3[text()='Deal & Sales']"));
		 jsUtil.scrollIntoView(ele);
		 
		 jsUtil.drawBorder(ele);
		 
		 
		 
	}

}
