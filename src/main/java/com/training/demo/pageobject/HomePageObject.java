package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.pageui.HomePageUI;
import com.training.demo.pageui.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    private WebDriver driver;
    public HomePageObject(WebDriver driver) {this.driver = driver;}
    public void inputEmailRegister(String email) {
        waitForElementVisible(driver, HomePageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver,HomePageUI.EMAIL_TEXTBOX,email);
    }

    public void submitRegister() {
        waitForElementVisible(driver, HomePageUI.SUBMIT_BUTTON);
        clickToElement(driver,HomePageUI.SUBMIT_BUTTON);
    }

    public String getUserID() {
        waitForElementVisible(driver, HomePageUI.USER_ID_LABEL);
        return getTextElement(driver,HomePageUI.USER_ID_LABEL);
    }

    public String getPassword() {
        waitForElementVisible(driver, HomePageUI.PASSWORD_LABEL);
        return getTextElement(driver,HomePageUI.PASSWORD_LABEL);
    }
}
