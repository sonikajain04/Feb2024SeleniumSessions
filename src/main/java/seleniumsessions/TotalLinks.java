package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// open the browser
		driver = new ChromeDriver();

		// enter the url
		driver.get("https://www.flipKart.com/");

//		// get all links
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//
//		System.out.println("total links : " + linksList.size());
//
//		for (int i = 0; i < linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//			if (text.length() != 0) { //to remove the links without
//				System.out.println(text);
//			}
//		}
//		// Assignment total link
//		// print count of total number of links having text and total not having text
//		
//		System.out.println("-------------------------------");
//		
//		//
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			if (text.length() != 0) {
//				System.out.println(text);
//			}
//			
//		}
	
		By links=By.tagName("a");
		By image=By.tagName("img");
		
		System.out.println("total links : "+getElementsCount(links));
		System.out.println("total links : "+getElementsCount(image));
		
		List<String> linksTextList = getElementsTextList(links);
		System.out.println(linksTextList);
		
		System.out.println(linksTextList.contains("Shopping Cart"));
	
	}	
		public static List<WebElement> getElements(By locator){
			return driver.findElements(locator);
		}
		
		public static int getElementsCount(By locator) {
			return getElements(locator).size();
		}
		
		public static List<String> getElementsTextList(By locator) {
			List<WebElement> eleList=getElements(locator);
			List<String> eleTextList= new ArrayList<String>();
			
			for(WebElement e:eleList) {
				String text=e.getText();
				if (text.length() != 0) {
					System.out.println(text);
					eleTextList.add(text);
				}
			}
			return eleTextList;
		}
		
		public List<String> getElementAttributeList(By locator,String attrName){
			List<WebElement> imageList=getElements(locator);
			List<String> attrList=new ArrayList<String>();

			for(WebElement e:imageList) {
				String attrValue=e.getAttribute(attrName);
				if(attrValue!=null &&attrValue.length()!=0) {
					attrList.add(attrValue);
					System.out.println(attrValue);
				}
			}
			
			return attrList;
		}
}
