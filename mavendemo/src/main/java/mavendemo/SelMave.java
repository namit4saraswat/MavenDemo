package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Page1;

public class SelMave {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Page1 searchobj = new Page1(driver);///mavendemo/src/test/java/Pages/Page1.java
		searchobj.searchFld.sendKeys("Famous Games of the world");
		searchobj.btnK.click();
		
	}
}
