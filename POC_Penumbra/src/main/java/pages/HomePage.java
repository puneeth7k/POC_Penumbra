package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import info.methods.*;
import env.DriverUtil;

public class HomePage extends BasePage implements BaseTest {

	protected WebDriver driver = DriverUtil.getDefaultDriver();
	String search = "//*[@id='js-site-search-input']";
		
    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    //*********Page Variables*********
    String baseURL = "http://172.17.99.209/camstarportal/Main.aspx";
    String loginurl = "http://172.17.99.209/camstarportal/Main.aspx";
    String baseURL2 = "https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/";
    String baseURL3 = "https://www.javatpoint.com/python-tutorial";
    
    //*********Web Elements*********
    String signInButtonClass = "btnSignIn";

    //*********Page Methods*********

    //Go to Homepage
    @Step("Open N11 Step...")
    public void goToN11 ()
    {
       driver.get(loginurl);
     }

    //Go to LoginPage
    @Step("Go to Login Page Step...")
    public void goToLoginPage ()
    {
        click(By.className(signInButtonClass));
    }
     
}
