package ActionsAndActionClassInSelenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionInterface_launchWebPageOnNewTab extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktop.click();

		WebElement showalldesktop = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));

		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND)
		.click(showalldesktop).keyUp(Keys.CONTROL).build().perform();

//		Actions actions2 = new Actions(driver);
//
//		Action builder = actions2.keyDown(Keys.CONTROL).click(desktop).keyUp(Keys.CONTROL).build();
//
//		builder.perform();

		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
