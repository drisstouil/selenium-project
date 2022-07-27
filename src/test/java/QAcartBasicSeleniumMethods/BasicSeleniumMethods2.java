package QAcartBasicSeleniumMethods;

import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utils;

public class BasicSeleniumMethods2 extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");

		driver.navigate().back();
		Utils.hardWait(2000);
		driver.navigate().forward();
		Utils.hardWait(2000);
		driver.navigate().refresh();
        driver.manage().window().maximize();
		driver.manage().window().fullscreen();
        System.out.println(driver.getWindowHandle());
      // driver.close();
       // driver.quit();




Utils.hardWait(6000);
		Utils.tearDown();
	
	
	
	
	}
}
