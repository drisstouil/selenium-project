package ActionsAndActionClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class MoveToElementWithActionsClass2 extends Utils {

	public static void main(String[] args) {

	getBrowser("chrome","http://tek-school.com/retail/");
	WebElement electronics = driver.findElement(By.xpath("//a[text()='Desktops']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(electronics).perform();
	
	
	
	
	Utils.hardWait(6000);
	
	Utils.tearDown();
	
	
	
	}

}
