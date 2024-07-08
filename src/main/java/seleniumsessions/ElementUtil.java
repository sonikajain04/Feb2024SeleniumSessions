package seleniumsessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}

	public void nullCheck(String value) {
		if (value == null) {
			System.out.println("VALUE is NULL " + value);
		}
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);
	}

	public WebElement getElement(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element;
		} catch (NoSuchElementException e) {
			System.out.println("Element not present on the page... " + locator);
			e.printStackTrace();
			return null;
		}
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	public String doGetAttribute(By locator,String attrName)  {
		return getElement(locator).getAttribute(attrName);
	}
	
	public boolean doIsDisplayed(By locator) {
		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element is displayed : " + locator);
			return flag;
		} catch (NoSuchElementException e) {
			System.out.println("element with locator : " + locator+" is not displayed");
			return false;
		}
	}
	
	public boolean isElementDisplayed(By locator) {
		int elementCount = getElements(locator).size();
		if(elementCount==1) {
			System.out.println("single element is displayed : "+locator);
			return true;
		}else {
			System.out.println("single element is displayed : "+locator);
		}
		return false;
	}
	
	public boolean isElementDisplayed(By locator,int expectedCount) {
		int elementCount = getElements(locator).size();
		if(elementCount==expectedCount) {
			System.out.println("single element is displayed : "+locator);
			return true;
		}else {
			System.out.println("single element is displayed : "+locator);
		}
		return false;
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();// pc=0;size=0;

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text != null) {
				System.out.println(text);
			}
		}
		return eleTextList;
	}
	public List<String> getElementsAttributeList(By locator,String attrName) {
		List<WebElement> imageList = getElements(locator);
		List<String> attrList = new ArrayList<String>();

		for (WebElement e : imageList) {
			String attrVal=e.getAttribute(attrName);
			if (attrVal != null && attrVal.length()!=0) {
				attrList.add(attrVal);
				//System.out.println(attrVal);
			}
		}
		return attrList;
	}
	
	
	//********************Select Drop Down Utils *************************
	
	public void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}	
	
	public void doSelectByVisibleText(By locator,String visibleText) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibleText);;
	}	
	
	public void doSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);;
	}	
	
	public int getDropDownListCount(By locator){
		Select selectLocator = new Select(driver.findElement(locator));
		return selectLocator.getOptions().size();
	}
	public List<String> getDropDownOptionTextList(By locator) {
		Select select_country = new Select(driver.findElement(locator));

		List<WebElement> countryOptions=select_country.getOptions();
		List<String> optionTextList=new ArrayList<String>();
		System.out.println(countryOptions.size());
		
		for(WebElement e: countryOptions) {
			String text = e.getText();
			System.out.println(text);
		}
		return optionTextList;
	}
	
	public void selectValueFromDropDown(By locator,String optionText) {
		Select select_country = new Select(driver.findElement(locator));
		List<WebElement> countryOptions=select_country.getOptions();
		for(WebElement e: countryOptions) {
			String text = e.getText();
			if(text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}	
	}
	
	public void selectValueFromDropDownWithoutSelectClass(By locator,String optionText) {	
		List<WebElement> OptionsList=getElements(locator);
		for(WebElement e: OptionsList) {
			String text = e.getText();
			if(text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}	
	}
	public void doSearch(By searchField, String searchKey, By suggestions, String value) throws InterruptedException {
		doSendKeys(searchField,searchKey);
		
		Thread.sleep(3000);
		
		List<WebElement> suggList = getElements(suggestions);
		System.out.println(suggList.size());
		
		for(WebElement e: suggList) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
		
	}
//***************** Wait Utils ******************************
	
	public WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForElementVisible(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/*
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * 
	 * 
	 */
	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public String waitForTitleContains(int timeOut, String titleText) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
				if(wait.until(ExpectedConditions.titleContains(titleText))){
					return driver.getTitle();
			}
		}catch(TimeoutException e) {
			System.out.println("title not found");
		}
		return driver.getTitle();
	}
	public String waitForTitleToBe(int timeOut, String expectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
				if(wait.until(ExpectedConditions.titleIs(expectedTitle))){
					return driver.getTitle();
			}
		}catch(TimeoutException e) {
			System.out.println("title not found");
		}
		return driver.getTitle();
	}
	
	//wait for elements
	public List<WebElement> waitForPresenceOfElementsLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public List<WebElement> waitForVisibilityOfElementsLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	//URL 26th May
	public String waitForURLContains(int timeOut, String urlText) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
				if(wait.until(ExpectedConditions.urlContains(urlText))){
					return driver.getCurrentUrl();
			}
		}catch(TimeoutException e) {
			System.out.println("URL not found");
		}
		return driver.getCurrentUrl();
	}
	public String waitForURLToBe(int timeOut, String expectedURL) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
				if(wait.until(ExpectedConditions.urlToBe(expectedURL))){
					return driver.getCurrentUrl();
			}
		}catch(TimeoutException e) {
			System.out.println("URL not found");
		}
			return driver.getCurrentUrl();
		}
	
	//Alert Utils
	
	public Alert waitForJSAlertPresent(int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public String getAlertText(int timeOut) {
		Alert alert= waitForJSAlertPresent(5);
		String text=alert.getText();
		alert.accept();
		return text;
	}
	public void acceptAlert(int timeOut) {
		 waitForJSAlertPresent(5).accept();
	}
	public void dismissAlert(int timeOut) {
		 waitForJSAlertPresent(5).dismiss();
	}
	public void sendKeysAlert(int timeOut,String value) {
		 waitForJSAlertPresent(5).sendKeys(value);
		 Alert alert=waitForJSAlertPresent(5);
		 alert.accept();	
	}
	
	//************* Frame Util ******************
	
	public void waitForFrameByLocator(int timeOut, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public void waitForFrameByIndex(int timeOut, int frameIndex) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	public void waitForFrameByIDorName(int timeOut, String frameIDorName) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDorName));
	}
	public void waitForFrameByElement(int timeOut, WebElement frameElement) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	//******************* Browser Window *************************
	
	public Boolean waitforWindowToBe(int timeOut, int totalWindows) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));
	}

	
	
	public boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=== 'complete'")).toString();
	
		if(Boolean.parseBoolean(flag)) {
			System.out.println("page is completely loaded");
		}else {
			throw new RuntimeException("page is not loaded");
		}
		
		return Boolean.parseBoolean(flag);
	}

}






