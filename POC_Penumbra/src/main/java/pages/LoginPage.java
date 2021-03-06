package pages;

import io.qameta.allure.Step;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

    //*********Constructor*********
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenameId = "email";
    String passwordId = "password";
    String loginButtonId = "loginButton";
    String errorMessageUsernameXpath = "//*[@id=\"loginForm\"]/div[1]/div/div";
    String errorMessagePasswordXpath = "//*[@id=\"loginForm\"]/div[2]/div/div";

    //*********Page Methods*********
    @Step("Login Step with username: {0}, password: {1}, for method: {method} step...")
    public void loginToN11 (XSSFRow row){
        //Enter Username(Email)
        writeText(By.id(usenameId),row.getCell(1).toString());
        //Enter Password
        writeText(By.id(passwordId), row.getCell(2).toString());
        //Click Login Button
        click(By.id(loginButtonId));
    }

    //Verify Username Condition
    @Step("Verify username: {0} step...")
    public void verifyLoginUserName (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedUserNameMessage);
    }

    //Verify Password Condition
    @Step("Verify verifyLoginPassword: {0} step...")
    public void verifyLoginPassword (String expectedPasswordMessage) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedPasswordMessage);
    }

}
