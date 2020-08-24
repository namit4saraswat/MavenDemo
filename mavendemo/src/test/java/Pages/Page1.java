package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Page1 {

	WebDriver driver;
	public Page1(WebDriver driver)
	{
	this.driver = driver;
	}
	
	@FindBy(name = "q")
	private WebElement searchFld;
	
	
	//Methods
	public void enterText(String text)
	{
		searchFld.sendKeys(text);
		Reporter.log("Prodcut entered in search box" + text,true);
	}
	
	
	public void searchText()
	{
		searchFld.sendKeys(Keys.ENTER);
		Reporter.log("Search button clicked" ,true);
	}
	
	public void searchedtext()
	{
	String actual = driver.getTitle();
	String expected = "top games in the world - Google Search";
	Assert.assertEquals(actual, expected,"It didn't worked");	
	Reporter.log("Able to search product successfully", true);
	}
	
}

