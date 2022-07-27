package handlingAlertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertSendText2 extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		WebElement iFrame = driver.findElement(By.id("iframeResult"));

		driver.switchTo().frame(iFrame);
		WebElement tryit = driver.findElement(By.xpath("//button[text()= 'Try it']"));
		tryit.click();

		hardWait(1000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello Driss");
		alert.accept();
		// alert.dismiss();

		Utils.hardWait(6000);

		Utils.tearDown();

	}

}
