package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import env.DriverUtil;
import info.methods.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import pages.LoginPage;
import utils.extentreports.ExtentTestManager;
import utils.listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")
public class sampletest  extends DriverUtil implements BaseTest
{

	HomePage homePage = new HomePage(driver,wait);
	LoginPage loginPage = new LoginPage(driver,wait);
	
	@Test (priority = 0, description="Invalid Login Scenario with wrong username and password.")
	  @Severity(SeverityLevel.BLOCKER)
	  @Description("Test Description: Login test with wrong username and wrong password.")
	  @Story("Invalid username and password login test")
	  public void invalidLoginTest_InvalidUserNameInvalidPassword () throws Exception {
	      //extentreports Description
	      ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");

	      //*************PAGE INSTANTIATIONS*************
	      HomePage homePage = new HomePage(driver,wait);
	      LoginPage loginPage = new LoginPage(driver,wait);
	      

	      //*************PAGE METHODS********************
	      	      
	  	//ExtentTestManager.getTest().setDescription("Assigning the packlot");
		  homePage.goToN11();
		  inputObj.clearText("xpath",xpath.username);
	      inputObj.enterText("xpath","pkrishnamurthy",xpath.username);
	      inputObj.clearText("xpath",xpath.password);
	      inputObj.enterText("xpath","!Password@987",xpath.password);
	      inputObj.selectOptionFromDropdown("xpath","text","penumbrainc.com",xpath.domain);
	      clickObj.click("xpath",xpath.Login);               
	      System.out.println(driver.getWindowHandle());
	      clickObj.click("xpath",xpath.Eprocedure);
	      clickObj.click("xpath",xpath.picklist);  
	      driver.switchTo().window("5D4EA02282B4B1F885066400367242EC");
	    
	           
	}
	      
}
	