package browserPractice;

import utilities.Utils;

public class LaunchBrowserMethods extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.amazon.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// this methods rarely used
		System.out.println(driver.getPageSource());
		// navigate to another URL
		driver.navigate().to("https://www.google.com/");
		Utils.hardWait(2000);
		// navigate to previous web
		driver.navigate().back();
		// this method will take to the next URL
		driver.navigate().forward();
		driver.navigate().refresh();
		Utils.hardWait(6000);
		Utils.tearDown();

	}
}
