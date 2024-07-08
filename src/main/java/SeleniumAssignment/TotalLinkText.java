package SeleniumAssignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkText {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://www.flipKart.com/");
		
		By links=By.tagName("a");
		System.out.println("total link's Count : "+getElementsCount(links));
		
		System.out.println("Count of Links with text : "+getElementsTextCount(links));
		System.out.println("------------------------------------");
		System.out.println("Count of Links with blank text : "+getElementsBlankTxtCount(links));
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getElementsCount(By locator) { 
		return getElements(locator).size();
	}
	
	public static int getElementsTextCount(By locator){
		List<WebElement> eleList=getElements(locator);
		int nonBlankCount=0;
		for(WebElement e: eleList) {
			String linkText=e.getText();
			if(!(linkText.equals(""))) {
				nonBlankCount++;
			}	
		}
		return nonBlankCount;	
	}
	
	public static int getElementsBlankTxtCount(By locator){
		List<WebElement> eleList=getElements(locator);
		int blankCount=0;
		for(WebElement e: eleList) {
			String linkText=e.getText();
			if(linkText.isBlank()|| linkText.isEmpty()) {
				blankCount++;
			}
		}
		return blankCount;	
	}
}