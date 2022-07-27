package QAcartBasicSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class locatorsWithQAcart extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");

	WebElement fbemail = driver.findElement(By.id("email"));
	fbemail.sendKeys("Patrixdriss@gmail.com");
	WebElement fbpass = driver.findElement(By.id("pass"));
	fbpass.sendKeys("123456");
		WebElement fblogin = driver.findElement(By.name("login"));
      fblogin.click();
		
		
		
		
		
		
		
		
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
