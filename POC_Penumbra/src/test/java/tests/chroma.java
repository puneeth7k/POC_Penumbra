package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import info.methods.BaseTest;
import pages.BasePage;



public class chroma extends BasePage implements BaseTest{

	String search = "//*[@id='js-site-search-input']";

	
	
	public chroma(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void login()
	{
		driver.get("https://www.croma.com/");
	    inputObj.clearText("xpath","search");
	    inputObj.enterText("xpath","LG","search");
	 }
	
}
