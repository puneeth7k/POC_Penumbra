package tests;

import io.qameta.allure.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import env.DriverUtil;
import info.methods.BaseTest;
import info.methods.TestCaseFailed;
import pages.HomePage;
import pages.LoginPage;
import utils.listeners.TestListener;


//In order to eliminate attachment problem for Allure, you should add @Listener line.
//link: https://github.com/allure-framework/allure1/issues/730
@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")
public class LoginTests  extends DriverUtil implements BaseTest{

	
	HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
	
/*    @BeforeTest
    public void setupTestData () {
        //Set Test Data Excel and Sheet
        System.out.println("************Setup Test Level Data**********");
        ExcelUtil.setExcelFileSheet("LoginData");
    }

    @Test (priority = 0, description="Invalid Login Scenario with wrong username and password.")
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
    public void Penumbralogin() throws InterruptedException, TestCaseFailed
    {
        homePage.goToN11();
        inputObj.clearText("xpath",xpath.username);
        inputObj.enterText("xpath","Operator10",xpath.username);
        inputObj.clearText("xpath",xpath.password);
        inputObj.enterText("xpath","Tester1!",xpath.password);
        inputObj.selectOptionFromDropdown("xpath","text","localhost",xpath.domain);
        clickObj.click("xpath",xpath.Login);               
        clickObj.click("xpath",xpath.edhr);
        clickObj.click("xpath",xpath.Eprocedure);
        System.out.println("Eproc is clicked");
        
        driver.switchTo().frame("tabfr_2");
        clickObj.click("xpath",xpath.containerdropdown);
        navigationObj.counthOverElement("xpath",xpath.containersearch);
        	
        clickObj.click("xpath",xpath.containerdropdown);
        System.out.println("clicked");
        
        inputObj.enterText("xpath","MAX 088 Pre-Kitting",xpath.resourcedropdown);
        WebElement ele2 = driver.findElement(By.xpath(xpath.resourcedropdown));
        if(assertionObj.isClickable(ele2, driver))
        {
        	System.out.println("clickable");
        	clickObj.clickForcefully("xpath",xpath.resourcedropdown);
        	clickObj.click("xpath",xpath.Movein);
        }
    }
}

