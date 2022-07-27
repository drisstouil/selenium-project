import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class naouarPractice extends Utils{


	
	public static void main(String[] args) {
	//Launching the Site.
	Utils.getBrowser("chrome", "http://demo.guru99.com/V4/");
	WebElement UserId =driver.findElement(By.xpath("//input[@name='uid']"));
	UserId.sendKeys("wrat");
	driver.findElement(By.name("password")).sendKeys("12345");
	WebElement button =driver.findElement(By.xpath("//input[@name='btnLogin']"));
	//Perform Click on LOGIN button using JavascriptExecutor
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", button);
	Utils.hardWait(2000);
	//To generate Alert window using JavascriptExecutor. Display the alert message
	js.executeScript("alert('Welcome to Guru99');");
	Utils.hardWait(6000);
	Utils.tearDown();

	}

}
