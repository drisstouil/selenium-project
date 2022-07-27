package handlingDropDownInSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.Utils;
public class SelectClassInSelenium extends Utils {
	
	public static void main(String[] args) {
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		// WebElement monthDD = driver.findElement(By.cssSelector("select#month"));
		selectMonthFromDropdown("Dec");
		selectDayFromDropdown("5");
		selectYearFromDropdown("1982");
		Utils.hardWait(6000);
		Utils.tearDown();
	}
	public static void selectMonthFromDropdown(String visibleText) {
		Select select = new Select(driver.findElement(By.cssSelector("select#month")));
		select.selectByVisibleText(visibleText);
	}
	public static void selectDayFromDropdown(String visibleText) {
		Select select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.selectByVisibleText(visibleText);
	}
	public static void selectYearFromDropdown(String visibleText) {
		Select select = new Select(driver.findElement(By.cssSelector("select#year")));
		select.selectByVisibleText(visibleText);
	}
}