package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.helper.logger.Log;
import com.training.demo.pageui.DeleteCustomerPageUI;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerPageObject extends BasePage {
    WebDriver driver;
    public DeleteCustomerPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputCustomerIdToDelete(String customerID) {
        Log.info("Input CustomerID To Delete: " + customerID);
        waitForElementVisible(driver, DeleteCustomerPageUI.CUSTOMER_ID_TEXTBOX);
        sendKeyToElement(driver, DeleteCustomerPageUI.CUSTOMER_ID_TEXTBOX, customerID);
    }

    public void clickToSubmitButton() {
        Log.info("click To Submit Button");
        waitForElementClickable(driver, DeleteCustomerPageUI.SUBMIT_BUTTON);
        clickToElement(driver, DeleteCustomerPageUI.SUBMIT_BUTTON);
    }

    public void clickToAcceptAlert() {
        Log.info("click To AcceptAlert");
        waitAlertPresence(driver);
        acceptAlert(driver);
    }

    public String getTextDeleteSuccess() {
        waitAlertPresence(driver);
        return getTextAlert(driver);
    }
}