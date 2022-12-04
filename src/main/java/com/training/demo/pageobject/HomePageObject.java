package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.helper.logger.Log;
import com.training.demo.pageui.HomePageUI;
import com.training.demo.pageui.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    private WebDriver driver;
    public HomePageObject(WebDriver driver) {this.driver = driver;}
    public void inputEmailRegister(String email) {
        Log.info("Sendkey value to email textbox" + email);
        waitForElementVisible(driver, HomePageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver,HomePageUI.EMAIL_TEXTBOX,email);
    }

    public void submitRegister() {
        Log.info("Click to submit");
        waitForElementVisible(driver, HomePageUI.SUBMIT_BUTTON);
        clickToElement(driver,HomePageUI.SUBMIT_BUTTON);
    }

    public String getUserID() {
        Log.info("Get UserID");
        waitForElementVisible(driver, HomePageUI.USER_ID_LABEL);
        return getTextElement(driver,HomePageUI.USER_ID_LABEL);
    }

    public String getPassword() {
        Log.info("Get Password");
        waitForElementVisible(driver, HomePageUI.PASSWORD_LABEL);
        return getTextElement(driver,HomePageUI.PASSWORD_LABEL);
    }
}
