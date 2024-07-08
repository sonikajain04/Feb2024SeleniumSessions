package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropDown {

	public static void main(String[] args) {

		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//enter the url
		driver.get("https://html.com/attributes/select-multiple/");
		Select select =new Select(driver.findElement(By.xpath("//*[@id=\'post-291\']//div//div[2]//select")));
		
		////*[@id='post-291']//div//div[2]//select
		System.out.println(select.isMultiple());
		
		if(select.isMultiple()){
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
		}
		
		select.deselectAll();
		if(select.isMultiple()){
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
		}
		
		select.deselectByVisibleText("Chilean flamingo");		
		//assignment = create utility for de-select
	}

}
