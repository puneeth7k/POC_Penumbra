package tests;

import io.qameta.allure.*;
import java.awt.Frame;
import java.util.List;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import env.DriverUtil;
import freemarker.core.DirectiveCallPlace;
import info.methods.BaseTest;
import info.methods.TestCaseFailed;
import info.stepdefinitions.PredefinedStepDefinitions;
import pages.HomePage;
import pages.LoginPage;
import utils.extentreports.ExtentTestManager;
import utils.listeners.TestListener;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

//In order to eliminate attachment problem for Allure, you should add @Listener line.
//link: https://github.com/allure-framework/allure1/issues/730
@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")
public class LoginTests  extends DriverUtil implements BaseTest{

	
	HomePage homePage = new HomePage(driver,wait);
	LoginPage loginPage = new LoginPage(driver, wait);
	
  /* @BeforeTest
  public void setupTestData () {
      //Set Test Data Excel and Sheet
      System.out.println("************Setup Test Level Data**********");
      ExcelUtil.setExcelFileSheet("LoginData");
  }*/

/*  @Test (priority = 0, description="Invalid Login Scenario with wrong username and password.")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description: Login test with wrong username and wrong password.")
  @Story("Invalid username and password login test")
  public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
      //extentreports Description
      ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");

      //*************PAGE INSTANTIATIONS*************
      HomePage homePage = new HomePage(driver,wait);
      LoginPage loginPage = new LoginPage(driver,wait);
      

      //*************PAGE METHODS********************
      //Open N11 HomePage
      homePage.goToN11();
      

      //Go to LoginPage
      homePage.goToLoginPage();

      //Login to N11 with first row of the login data
      loginPage.loginToN11(ExcelUtil.getRowData(1));
      

      //Set test row number to 1
      ExcelUtil.setRowNumber(1);

      //Set Test Status Column number to 5
      ExcelUtil.setColumnNumber(5);

      //*************ASSERTIONS***********************
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div")));
      //Verify password message by using excel's 2st row, 5th column
      //Row and Column numbers starting from 0. Thus we need to write 1 and 4, instead of 2 and 5!
      loginPage.verifyLoginPassword(ExcelUtil.getCellData(1,4));
  }

  @Test (priority = 1, description="Invalid Login Scenario with empty username and password.")
  @Severity(SeverityLevel.CRITICAL)
  @Description("Test Description: Login test with empty username and empty password.")
  @Story("Empty username and password login test")
  public void invalidLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
      //extentreports Description
      ExtentTestManager.getTest().setDescription("Invalid Login Scenario with empty username and password.");

      //*************PAGE INSTANTIATIONS*************
      HomePage homePage = new HomePage(driver,wait);
      LoginPage loginPage = new LoginPage(driver,wait);

      //*************PAGE METHODS********************
      homePage.goToN11();
      homePage.goToLoginPage();

      //Login to N11 with second row of the login data
      loginPage.loginToN11(ExcelUtil.getRowData(2));

      //Set test row number to 2
      ExcelUtil.setRowNumber(2);

      //Set Test Status column number to 5
      ExcelUtil.setColumnNumber(5);
      //*************ASSERTIONS***********************
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div")));
      //Verify by 3rd row and 4th column
      loginPage.verifyLoginUserName(ExcelUtil.getCellData(2,3));
      //Verify by 3rd row and 5th column
      loginPage.verifyLoginPassword(ExcelUtil.getCellData(2,4));
  }
  */
	@Test (priority = 0, description="Login check")
  @Severity(SeverityLevel.BLOCKER)
  public void Penumbralogin() throws Exception
  {
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
      
      
      //Picklist
      driver.switchTo().frame("tabfr_2");
      inputObj.clearText("xpath",xpath.Containerinput);
      inputObj.enterText("xpath","H178777",xpath.Containerinput);
      Actions key = new Actions(driver);
      key.sendKeys(Keys.ENTER).build().perform();
      driver.switchTo().defaultContent();
      clickObj.click("xpath",xpath.Settings);
      
      //settings
      driver.switchTo().frame("FloatingFrame_frame");
      clickObj.click("xpath",xpath.operation);
      navigationObj.scrollToElementandclick("xpath",xpath.selectoperation);
      clickObj.click("xpath",xpath.setbutton);
      
      //Assinging Packlot
      driver.switchTo().defaultContent();
      WebElement ele = driver.findElement(By.xpath(xpath.workorderdispatch));
      assertionObj.isClickable(ele, driver);
      assertionObj.isClickable(ele, driver);
      navigationObj.hoverOverElement("xpath",xpath.workorderdispatch);
      clickObj.clickForcefully("xpath",xpath.workorderdispatch);
      navigationObj.scrollToElementandclick("xpath",xpath.Assignpacklot);
      
      driver.switchTo().frame("tabfr_4");
      clickObj.click("xpath",xpath.packlottype);
      clickObj.click("xpath",xpath.selectpacklotype);
      
      navigationObj.scrollToElement("xpath",xpath.clickoption);
      navigationObj.hoverOverElement("xpath",xpath.clickoption);      
      clickObj.click("xpath",xpath.clickoption);
            
      int titlecount = navigationObj.counthOverElement("xpath",xpath.rowcount);
      navigationObj.hoverOverElementandclick("xpath",xpath.clickoption);
      System.out.println("Titlecount is :-"+ titlecount);
      
      int optionscount=navigationObj.counthOverElement("xpath",xpath.optionvalues);
      System.out.println(" options count is:- "+ optionscount);
      int flag =0;
      for(int a=0;a<=optionscount;a++)
     {	 
    	if(flag==1)
    	  {
    		  break;
    	  }
    	clickObj.click("xpath",xpath.forwardcontainerlist);
    	progressObj.wait("1");
    	List<WebElement> l = driver.findElements(By.xpath(xpath.containerslist));
    	for(int b=0;b<l.size();b++)
    	{
    		String s = l.get(b).getText();
    		System.out.println(s);
    		if(s.equals("H178777")) 
    	{
    		String containername = xpath.containerslist+"[@title="+"\""+s+"\""+"]"; 
    		System.out.println(containername);
           	WebElement container= driver.findElement(By.xpath(containername));
    		String idvalue = container.getAttribute("id");
    		System.out.println(idvalue);
    		clickObj.click("xpath",xpath.checkbox);
    		flag=1;
    		break;    		
    	 }
       	}   
    	
     }
        navigationObj.scrollToElement("xpath",xpath.Executebutton);
        assertionObj.isElementDisplayed("xpath",xpath.Executebutton);
        clickObj.click("xpath",xpath.Executebutton);
        navigationObj.switchToDefaultContent();
        navigationObj.hoverOverElement("xpath",xpath.workorderdispatch);
        clickObj.clickForcefully("xpath",xpath.workorderdispatch);
        navigationObj.scrollToElementandclick("xpath",xpath.OperationalViewWO);
        
        driver.switchTo().frame("tabfr_5");
        inputObj.clearText("xpath",xpath.containerinput2);
        inputObj.enterText("xpath","H178777",xpath.containerinput2);
        key.sendKeys(Keys.ENTER).build().perform();
        progressObj.waitForElementToDisplay("xpath",xpath.Moveimmediatebutton,"2");
        progressObj.waitForElementToClick("xpath",xpath.Moveimmediatebutton,"2");
        assertionObj.isElementDisplayed("xpath",xpath.Moveimmediatebutton);
        
        clickObj.clickForcefully("xpath",xpath.Moveimmediatebutton);
        System.out.println("done");
    }
  }  