package browserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class locatorExample extends Utils {

	public static void main(String[] args) {
// launch the face-book on chrome browser
		Utils.getBrowser("chrome", "https://www.facebook.com");//

		// click on new account
		WebElement createnewAccount = driver.findElement(By.linkText("Create new account"));
		createnewAccount.click();

		// Enter first name

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Driss");

		// Enter last name

		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Touil");

		// enter email
		// WebElement enterEmail =
		// driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));

		WebElement enterEmail = driver.findElement(By.xpath("//input[@name=\'reg_email__\']"));

		enterEmail.sendKeys("Lm3alamDrioss@gmail.com");

		// confirm email
		WebElement emailConfermation = driver.findElement(By.name("reg_email_confirmation__"));
		emailConfermation.sendKeys("Lm3alamDrioss@gmail.com");

		// new password

		// WebElement newPassword = driver.findElement(By.id("password_step_input"));

		WebElement newPassword = driver.findElement(By.id("password_step_input"));

		newPassword.sendKeys("12345678");
		WebElement signUpButton = driver.findElement(By.name("websubmit"));
		signUpButton.click();

		Utils.hardWait(4000);
		Utils.tearDown();

	}
}