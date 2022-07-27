package browserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class DisplayedEnabeldSelected extends Utils {

	public static void main(String[] args) {
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement createNewAcc = driver.findElement(By.linkText("Create new account"));
		/*
		 * is displayed is selected ( only radio button, check boxes) is enabled
		 */
//		boolean IsDisplayed = createNewAcc.isDisplayed();
//		System.out.println("isDisplayed: " + IsDisplayed);
//		boolean isEnabled = createNewAcc.isEnabled();
//		System.out.println("isEnabled: " + isEnabled);
//		// is selected
		createNewAcc.click();
//
		WebElement gender = driver.findElement(By.xpath("//input[@name ='sex'and@ value ='1']"));
//
//		boolean isSelected = gender.isSelected();
//		
//		System.out.println("isSelected :" + isSelected);

//		gender.click();
		System.out.println(checkstateOnRadioButton(gender));

		clickOnRadioButton(gender);

		Utils.hardWait(6000);
		Utils.tearDown();

	}

// this methods used instead of using whole lines of codes for is displayed-enabled-selected.
	public static void clickOnRadioButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {

				element.click();
			} else {

				System.out.println("one of the elemnt didnt return expected value!!!");
			}
		} catch (Exception e) {
		}

	}

	public static boolean checkstateOnRadioButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {

				System.out.println("radio is displayed enabled and not selected");
			} else {
				// return false;

				System.out.println("check statues of raadio button faild");
			}
		} catch (Exception e) {

		}
		return true;
	}
}