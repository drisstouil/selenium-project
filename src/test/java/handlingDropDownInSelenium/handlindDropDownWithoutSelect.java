package handlingDropDownInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utils;

public class handlindDropDownWithoutSelect extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();

		List<WebElement> month = driver.findElements(By.cssSelector("select#month>option"));

		for (int i = 0; i <= month.size(); i++) {
			if (month.get(i).getText().equals("Dec")) {
				month.get(i).click();
				break;
			}
		}

		Utils.hardWait(6000);
		Utils.tearDown();
	}
}
