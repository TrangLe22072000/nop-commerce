package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.helper.logger.Log;
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
        Log.info("Click to add customer");
        waitForElementVisible(driver, ManagerHomePageUI.NEW_CUSTOMER);
        clickToElement(driver, ManagerHomePageUI.NEW_CUSTOMER);
    }

    public void clickEditCustomer() {
        Log.info("Click to edit customer");
        waitForElementVisible(driver, ManagerHomePageUI.EDIT_CUSTOMER);
        clickToElement(driver, ManagerHomePageUI.EDIT_CUSTOMER);
    }

    public void clickToDeleteCustomer() {
        Log.info("Click to delete customer");
        waitForElementVisible(driver, ManagerHomePageUI.DELETE_CUSTOMER);
        clickToElement(driver, ManagerHomePageUI.DELETE_CUSTOMER);
    }
}
