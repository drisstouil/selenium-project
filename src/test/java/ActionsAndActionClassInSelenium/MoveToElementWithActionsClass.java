package ActionsAndActionClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class MoveToElementWithActionsClass extends Utils {

	public static void main(String[] args) {

	getBrowser("chrome","https://www.ebay.com/");
	
	WebElement electronics = driver.findElement(By.cssSelector("li[data-hover-track='p2481888.m1380.l6435']>a:first-child"));
	// first create object of Actions class .
	Actions actions = new Actions(driver);
	// we can use reference to action class object and access all the methods 
	// since we are preforming a single action here we just need to call perform method.
	actions.moveToElement(electronics).perform();
	
	
	
	
	Utils.hardWait(6000);
	
	Utils.tearDown();
	
	
	
	}

}
