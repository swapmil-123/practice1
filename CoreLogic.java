package corelogic;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.netty.util.Constant;
import net.bytebuddy.asm.Advice.Return;

public class CoreLogic {

	 public class Componentoperations{

	static WebDriver driver;
//	public static WebDriverwait wait;

	public Componentoperations () {
	driver = Drivers.driver;
	}

	public static void clickxpathElement (String xPath) {
	WaitLogic.pooLForElementBoolean(xPath, 2,Constants.Wait.POOL_WAIT_TIME_MAX);
	driver. findElement (By. xpath (xPath) ) . click();
	}

	public static void clickIdElement (String id) {
	try {
	driver.findElement (By. id(id));
	}catch (Exception e) {
	e.printStackTrace();
	}
	
	public static void clickElement (String xPath) {
	WebElement element = driver.findElement (By.xpath (xPath));
	Actions action= new Actions (driver);
	action.moveToElement (element).click().build ().perform();
	}

	protected WebElement getVisibleElement (List <WebElement> elements) {
	WebDriveriwait wait = new WebDriveriwait( driver, 30);
	WebDriverWait wait = new WebDriveriait (driver, Duration.ofseconds (30) ) ;
	WebElement rE = null;

	int elementsSize = elements.size();
	for (int i = 0; i <elementsSize; i++) {
	System.out.println( "test"+ i);

	try {
		wait.until (ExpectedConditions.or(ExpectedConditions. visibilityof(elements. get(i))));
		break;
	}catch (Exception e) {
//handle exception however you 11ke
	}
}
	for (WebElement element: elements) {

	if (element. isDisplayed ()) {
	System.out.println("found and assigning to rE");
	rE = element;
	break;

	}
	}

	return rE;
	}
	public static void waitForSeconds (int seconds) {
	try {
	Thread. sleep (seconds *1000);
	}catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
	public static void refreshUntilElementClickable(String xPath) {
	wait.until (ExpectedConditions.refreshed (ExpectedConditions . elementToBeClickable (By .xpath (xPath ))));
	}

	public static void waitForStaleElementToBelocated (String xPath) {
	wait.until (ExpectedConditions. invisibilityofElementLocated ( By.xpath(xPath) ));
	}
	
	public static void waituntilElementPresenceLocated (String xPath) {
	wait.until (ExpectedConditions.presenceofElementLocated (By . xpath (xPath) ));
	}
	
	public static void waitUntilElementVisible(String xPath) {
	wait.until (ExpectedConditions . visibilityofElementLocated (By. xpath (xPath) ));
	}
	

	public static void waitUntilElementInvisible (String xPath) {
	wait.until(ExpectedConditions. invisibilityofElementLocated (By .xpath(xPath)))
	}


	public static void clearXpathElement (String xPath) {
	driver.findElement (By .xpath (xPath)).clear();
	driver.findElement (By.xpath (xPath)).sendKeys(Keys . BACK_SPACE);
	}
	
	public static void clearXpathElementText (String xPath) {
	driver.findElement (By . xpath (xPath) ).clear();
	}
	

	public static void doubleClickxpathElement (String xPath) {
	WaitLogic.pooLForELementBoolean (xPath, 2, Constants , Wait.P0OL_WAIT_TIME_MAX);
	Actions actions = new Actions (driver) ;
	actions.doubleclick (driver. findElement (By.xpath (xPath) ) ). perform();
	}
	

	public static void rightclick(String xPath) {
	WaitLogic.pooLForELementBoolean (xPath, 2, Constants.Wait.POOL_NAIT_TIMEAX);
	Actions actions new Actions (driver) ;
	actions.contextClick(driver. findElement (By. xpath (xPath))) .perforn();
	}
	

	public static void performRightClick(String xPath) {
	WebElement component =driver. findElement (By.xpath(xPath ))
	Actions actions =new Actions (driver);
	actions.contextclick(component).perform();
	}

	public static Boolean isXpathElementAvailable (String xPath) {
	return(driver. findElements (By .xpath(xPath)).isEmpty() );
	}

	public static void waitForElementLoad (String xPath) {
	WaitLogic .pooLForElementBooLean (xPath, 2, Constants. Wait.P0OL_WAIT_TIME_MAX);
	}
	
	public static void waitüntilElementclickable(String xPath) {
	wait.until (ExpectedConditions.elementToBeCLickabLe (By.xpath(xPath) ));
	}
	
	public static void insertXpathElementText (String xPath, String inputText) {
	WaitLogic.pooLForElementBoolean (xPath, 2, Constants.Wait.POOL_WAIT_TIME_MAX);
	driver. findElement (By.xpath (xPath)).clear();
	driver. findEl ement (By. xpath (xPath)).sendKeys (input Text);
	}
	

	public static void selectAndInsertXpathElementText(String xPath, String inputfext) {
	String select = Keys.chord (Keys . CONTROL, "a");
	driver.findElement (By .xpath(xPath) ) .sendkeys (select) ;
	driver.findElement (By . xpath (xPath)). sendKeys (inputText) ;
	}
	
	public static void insertXpathElementTextValue (String xPath, String inputText) {
	driver.findElement (By . xpath (xPath)).sendKeys (inputText);
	}

	public static void insertKeysXpathElementText (String xPath, Keys inputText) {
	driver. findElement (By . xpath (xPath)). clear();
	driver. findElement (By .xpath (xPath)) . sendKeys (input Text);
	}
	

	public static void findSearchTextXpathElement (String xPath, String inputText) {
	driver. findElement (By.xpath (xPath)).clear();
	driver. findElement (By.xpath (xPath)). sendkKeys (inputText);
	driver.findElement (By.xpath(xPath) ) .sendkeys (Keys.ENTER);

	driver. findElement (By . xpath (xPath)).clear();
	driver. findElement (By. xpath (XPath)).sendkeys (Keys .BACK SPACE);
	driver. findElement (By.xpath (xPath)). sendKeys (Keys .ENTER);
	
	}
	

	public static void findValueFromDropdownXpathElement (String xPath, String inputText) {

	driver. findElement (By .xpath (xPath)).clear():
	driver.findElement (By.xpath(xPath) ).sendKeys (inputText);
	driver.findElement (By .xpath (xPath)).sendkKeys (Keys .ENTER)
	}


	public static Boolean isXpathElementDisplayed (String xPath) throws Exception{
	WaitLogic .pooLForELemen tBoo lean (xPath, 2, Constants . Wait. P0OL_WAIT TIME_NAX);
	try {
	return driver . findElement (By.xpath (xPath) ) . isDisplayed () ;
	}catch (Exception e) {
	throw e;
	}
	
	public static Boolean isXpathElementVisible (String xPath) throws Exception {
	try {
	return driver. findElement (By.xpath (xPath) ).isDisplayed ();
	}catch (Exception e) {
	throw e
	}
}
	
	public static Boolean isXpathElementVisiblity(String xPath) {
	return driver. findElement (By .xpath (xPath)).isDisplayed ();
	}
	public static Boolean isXpathElementClickable(String xPath) {
	return driver. findElement (By .xpath (xPath)).isEnabled ();
	}

	public static Boolean isXpathElementEnabled(String xPath) {
	return driver. findElement (By .xpath (xPath)).isEnabled ();
	}
	
	public static boolean isElementSelected (String xpath) {
	return driver. findElement (By.xpath(xpath)). isSelected ()
	}

	public static String getElementText (String xPath){
	WaitLogic .poolForElementBoolean(xPath, 2, Constants.Wait.POOL_WAIT_TIME_MAX);
	return driver. findElement (By.xpath(xPath) ).getText ();
	}
	

	public static String getInputValue (String xPath) {
	WaitLogic.poolForElementBooLean (xPath, 2, Constants . Wait.POOL_WAIT_TIME MAX);
	return driver. findElement (By . xpath(xPath) ) .getAttribute("value");
	}

	public static String getMaxValue (String xPath) {
	return driver.findElement (By .xpath(xPath)).getAttribute("max" );
	}
	
	public static String getDisabled (String xPath) {
	return driver. findElement (By.xpath(xPath) ). getAttribute("ng-reflect-is-disabled") ;
	}

	public static String getMaxLengthValue (String xPath) {
	return driver. findElement (By.xpath (xPath) ) .getAttribute( "maxlength");
	}
	
	public static String getSelectedComponentClass (String xPath) {
	return driver. findElement (By.xpath(xPath) ).getattribute ("class ");
	}
	
	public static String getSelectedComponentCompId (String xPath) {
	return driver. findElement (By . xpath (xPath) ). getAttribute("comp-id");
	}

	public static String getTextFromElement (String xPath) {
	return driver. findElement (By . xpath (xPath)).getText ();
	}

	

	public static List<String> getMultipleElementText (String xPath){
	List<string> elementText = new ArrayList<String> ();
	WaitLogic.poolForELementBooLean (xPath, 2, Constants . Wait.PO0L_WAIT_TIME_MAX);
	List<WebElement> elements= driver. findElements (By.xpath (xPath) );
	for (WebElement element: elements ) {
	elementText. add (element.getText ());
	}
	return elementText;
	}


	public static List<String> getSelectoptions (String xPath){
	WaitLogic.poolForELementBoolean (xPath, 2, Constants . Wait.POOL_WAIT_TIME_MAX);
	List<String> result = new ArrayList<String> ();
	Select select = new Select (driver.findElement (By .xpath (xPath )));
	for (WebElement option: select.getoptions ()) {
	result.add (option.getText ());
	}
	return result;
	}	

	public static List<String> getElementsText (String xPath) {
	List<String> elementTexts = new ArrayList<String> ();
	WaitLogic.pooLForELementBoolean (xPath, 2, Constants.Wait.P0OL_WAIT_TIME_MAX);
	List<WebElement> elements= driver. findElements (By.xpath (xPath));
		
	}


