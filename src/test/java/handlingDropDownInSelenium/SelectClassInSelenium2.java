package handlingDropDownInSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Utils;

public class SelectClassInSelenium2 extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
	WebElement monthDD = driver.findElement(By.cssSelector("select#month"));
	Select select = new Select(monthDD);
		 select.selectByIndex(6);
		// select.selectByValue("8");
		select.selectByVisibleText("Aug");
	WebElement dayDD = driver.findElement(By.cssSelector("select#day"));
	Select select1 = new Select(dayDD);
	// select1.selectByIndex(5);
	// select1.selectByValue("6");
	select1.selectByVisibleText("6");

	WebElement yearDD = driver.findElement(By.cssSelector("select#year"));
	Select select2 = new Select(yearDD);
	// select2.selectByIndex(0);
		select2.selectByValue("1982");
		// select2.selectByVisibleText("1982");

	
		
		

		Utils.hardWait(6000);
		Utils.tearDown();
	
	}
}