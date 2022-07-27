import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class labPractice1 extends Utils {

	public static void main(String[] args) {

	Utils.getBrowser("chrome", "http://tek-school.com/retail/");
	
	WebElement text =driver.findElement(By.linkText("TEST ENVIRONMENT"));
	String strtext = text.getText();
	Utils.hardWait(6000);

	driver.navigate().to("https://www.amazon.com/");
	Utils.hardWait(6000);

	WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
	Utils.hardWait(6000);

	searchField.sendKeys(strtext);
	Utils.hardWait(6000);

	WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	
	
	searchButton.click();
	Utils.hardWait(6000);
	Utils.tearDown();
	}

}
