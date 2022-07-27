package ActionsAndActionClassInSelenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class WithActionsClass4 extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://jqueryui.com/selectable/");
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
		//Utils.hardWait(2000);

		WebElement item1 = driver.findElement(By.xpath("//li [text() ='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li [text() ='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li [text() ='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li [text() ='Item 4']"));

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.COMMAND)
		.click(item1)
		.click(item2)
		.click(item3)
		.click(item4)
	    .keyUp(Keys.CONTROL)
		.build()
		.perform();

		
			
		
		Utils.hardWait(6000);

		Utils.tearDown();

	}

}
