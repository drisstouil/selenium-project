package browserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class XPathInSelenium extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement createNewAcc = driver.findElement(By.linkText("Create new account"));
		createNewAcc.click();
		Utils.hardWait(4000);

		WebElement monthDD = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		monthDD.click();
		WebElement month = driver.findElement(By.xpath(
				"//select[@id='year']//ancestor::span//span//select//following-sibling::option[contains(text(),'Apr')]"));
		month.click();
		WebElement dayDD = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		dayDD.click();
		WebElement day = driver
				.findElement(By.xpath("//span[@data-type=\"selectors\"]//following::select//option[@value='18']"));
		day.click();
		WebElement yearDD = driver.findElement(By.xpath("//select[@id=\"year\"]"));

		yearDD.click();
		WebElement year = driver.findElement(
				By.xpath("//option[@value=\"2022\"]//following-sibling::option[starts-with(@value,'2000')]"));
		year.click();
		Utils.hardWait(6000);
		Utils.tearDown();
	}

}
