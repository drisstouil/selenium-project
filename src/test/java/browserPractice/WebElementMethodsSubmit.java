package browserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class WebElementMethodsSubmit extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Driss");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Touil");
		WebElement emailAdress = driver.findElement(By.name("reg_email__"));
		emailAdress.sendKeys("DrissTouil@gmail.com");
		WebElement newPassord = driver.findElement(By.id("password_step_input"));
		newPassord.sendKeys("12345678");
		WebElement drissGender = driver.findElement(By
				.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]"));
		drissGender.click();
		WebElement signUpButton = driver.findElement(By.name("websubmit"));
		signUpButton.click();
		Utils.hardWait(4000);
		Utils.tearDown();

	}
}
