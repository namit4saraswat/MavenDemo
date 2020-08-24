package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class DriverManager {
	public static WebDriver getDriver(String type, String url) {
		WebDriver driver = null;

		if (type == "Chrome") {
			driver = new ChromeDriver();
		} else if (type == "firefox") {
			// WebDriver driver = new GeckoDriver();
		} else {
			Assert.assertTrue(false, "No correct type sent");
		}

		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log("Navigated to Browser"+ type + url, true);
		return driver;
	}
}
