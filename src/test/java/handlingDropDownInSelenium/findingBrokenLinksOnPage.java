package handlingDropDownInSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class findingBrokenLinksOnPage extends Utils {

	public static void main(String[] args) {
		Utils.getBrowser("chrome", "http://tek-school.com/retail/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("----------->Printing number of links on the page" + "\n");
		System.out.println("number  of links on the web pageis:" + links.size() + "\n");
		System.out.println("-------->Printing all the link add" + "\n");

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println(url + "is Empty");
				continue;
			}
			try {
				HttpURLConnection connectToServer = (HttpURLConnection) (new URL(url).openConnection());
				connectToServer.connect();
				if (connectToServer.getResponseCode() >= 400) {
					System.err.println(url + "is broken");
				} else {
					System.out.println(url + "is valid");
				}
			
			}catch (MalformedURLException e) {
			e.printStackTrace();
			
			
			
			
			} catch (IOException e) {
               e.printStackTrace();
			}
		}
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
