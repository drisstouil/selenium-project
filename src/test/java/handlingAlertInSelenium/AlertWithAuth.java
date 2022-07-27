package handlingAlertInSelenium;

import utilities.Utils;

public class AlertWithAuth extends Utils {

	public static void main(String[] args) {
/*authentication alert
 * pass the user name and password in the Url
 *http://userName:password.....
 * */ 
		getBrowser("chrome", "https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//Alert alert = driver.switchTo().alert();

		
		
		
		Utils.hardWait(4000);
		Utils.tearDown();

	}

}
