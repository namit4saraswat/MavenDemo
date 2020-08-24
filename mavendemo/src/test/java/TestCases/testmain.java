package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Page1;
import util.DriverManager;

public class testmain {
	String url = "";
	@Test
	@Parameters({"browser","url"})
	public void search_item(String browser, String url) {
		WebDriver driver = DriverManager.getDriver(browser, url);
		Page1 obj = PageFactory.initElements (driver, Page1.class);
		obj.enterText("top games in the world");
		obj.searchText();
		
	}

}
