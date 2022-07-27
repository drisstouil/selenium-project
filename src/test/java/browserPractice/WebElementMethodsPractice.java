package browserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class WebElementMethodsPractice extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		// sendKeys()
		// click()
		// clear method will clear the text in input field for us

		WebElement phoneEmail = driver.findElement(By.id("email"));
		Utils.hardWait(2000);
		phoneEmail.clear();
		phoneEmail.sendKeys("patrixdriss@gmail.com");

		// get text();
		// get tag name just get the tag name of that element

		WebElement createNewAcc = driver.findElement(By.linkText("Create new account"));

		System.out.println("Tag Name:" + createNewAcc.getTagName());
		
		//get css value
		
		System.out.println(createNewAcc.getCssValue("background-color"));
		// get attribute
		System.out.println(createNewAcc.getAttribute("role"));
		System.out.println(createNewAcc.getAttribute("data-testid"));
        // get size ()
		System.out.println(createNewAcc.getSize());
		System.out.println(createNewAcc.getLocation());
		
		// get location()
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
