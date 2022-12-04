package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.helper.logger.Log;
import com.training.demo.pageui.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {
    private WebDriver driver;
    public LoginPageObject(WebDriver driver) {this.driver = driver;}
    public void openRegisterPage() {
        Log.info("Click to visit link here");
        waitForElementVisible(driver, LoginPageUI.VISIT_HERE);
        clickToElement(driver,LoginPageUI.VISIT_HERE);
    }

    public void inputUserIDToLogin(String userId) {
        Log.info("Input UserId to Login");
        waitForElementVisible(driver,LoginPageUI.Email_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.Email_TEXTBOX,userId);
    }

    public void inputPasswordToLogin(String password) {
        Log.info("Input Password to Login");
        waitForElementVisible(driver,LoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX,password);
    }

    public void clickLogin() {
        Log.info("Click to login");
        waitForElementVisible(driver,LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

    }
}
