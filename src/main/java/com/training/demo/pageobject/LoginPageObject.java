package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.pageui.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {
    private WebDriver driver;
    public LoginPageObject(WebDriver driver) {this.driver = driver;}
    public void openRegisterPage() {
        waitForElementVisible(driver, LoginPageUI.VISIT_HERE);
        clickToElement(driver,LoginPageUI.VISIT_HERE);
    }

    public void inputUserIDToLogin(String userId) {
        waitForElementVisible(driver,LoginPageUI.Email_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.Email_TEXTBOX,userId);
    }

    public void inputPasswordToLogin(String password) {
        waitForElementVisible(driver,LoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX,password);
    }

    public void clickLogin() {
        waitForElementVisible(driver,LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

    }
}
