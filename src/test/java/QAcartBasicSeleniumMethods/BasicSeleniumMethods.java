package QAcartBasicSeleniumMethods;

import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utils;

public class BasicSeleniumMethods extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.google.com/");

		// WebDriver driver = new ChromeDriver();
//	    driver.get("https://www.google.com/");
//	

		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.contentEquals("https://www.google.com/"))

		{
			System.out.println("pass");

		} else {
			System.out.println("Fail");
		}

		String ActualTittle = driver.getTitle();

		if (ActualTittle.contentEquals("Google"))

		{
			System.out.println("pass");

		} else {
			System.out.println("Fail");
		}

		System.out.println(driver.getPageSource());

		Utils.hardWait(6000);
		Utils.tearDown();
	}
}
