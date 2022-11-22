package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.pageui.LoginPageUI;
import com.training.demo.pageui.ManagerHomePageUI;
import org.openqa.selenium.WebDriver;

public class ManagerHomePageObject extends BasePage {
    private WebDriver driver;
    public ManagerHomePageObject(WebDriver driver) {this.driver = driver;}
    public String getTextHeading() {
        waitForElementVisible(driver, ManagerHomePageUI.HEADING_LABEL);
        return getTextElement(driver, ManagerHomePageUI.HEADING_LABEL);

    }

    public void clickNewCustomer() {
        waitForElementVisible(driver, ManagerHomePageUI.NEW_CUSTOMER);
        clickToElement(driver, ManagerHomePageUI.NEW_CUSTOMER);
    }
}
