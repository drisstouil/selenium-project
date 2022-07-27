package handlingAlertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertPractice3 extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://www.demo.guru99.com/test/delete_customer.php");

		WebElement inputField = driver.findElement(By.cssSelector("input[name=cusid]"));
         inputField.sendKeys("4444");

		
		Utils.hardWait(2000);

		
		WebElement submitButtn = driver.findElement(By.cssSelector("input[name=submit]"));
		Utils.hardWait(2000);

		submitButtn.click();
		Utils.hardWait(2000);


		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		alert.accept();

		
		
		Utils.hardWait(2000);

		Utils.tearDown();

	}

}
