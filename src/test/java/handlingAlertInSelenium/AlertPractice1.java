package handlingAlertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertPractice1 extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		// iframe in selenium
		// printing run text before switching to frame 
//		WebElement button = driver.findElement(By.xpath("//button[@id='runbtn']"));
//		System.out.println(button.getText());
		
		WebElement iFrame = driver.findElement(By.id("iframeResult"));
	// switch to frame
		driver.switchTo().frame(iFrame);
		WebElement tryit = driver.findElement(By.xpath("//button[text()= 'Try it']"));
		tryit.click();
		// Alert alert
		Utils.hardWait(2000);
		Alert alert = driver.switchTo().alert();
        //alert.dismiss();
		alert.accept();
        // if we want to print run text now we have to switch back to default content
         driver.switchTo().defaultContent();
         WebElement button = driver.findElement(By.xpath("//button[@id='runbtn']"));
 		System.out.println(button.getText());
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
