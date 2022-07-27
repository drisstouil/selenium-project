package handlingAlertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertOkAndCancel extends Utils {

	public static void main(String[] args) {
		// confirmation alert

		getBrowser("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3");

		WebElement iFrame = driver.findElement(By.id("iframeResult"));

		driver.switchTo().frame(iFrame);
		WebElement tryit = driver.findElement(By.xpath("//button[text()= 'Try it']"));
		tryit.click();

		
		Alert alert = driver.switchTo().alert();

		alert.accept();
		alert.dismiss();

		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
