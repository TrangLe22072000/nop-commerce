package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.helper.logger.Log;
import com.training.demo.pageui.AddCustomerPageUI;
import com.training.demo.pageui.EditCustomerPageUI;
import org.openqa.selenium.WebDriver;

public class EditCustomerPageObject extends BasePage {
    WebDriver driver;
    public EditCustomerPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputCustomerID(String userId) {
        Log.info("Input CustomerID: " + userId);
        waitForElementVisible(driver, EditCustomerPageUI.CUSTOMER_TEXTBOX);
        sendKeyToElement(driver, EditCustomerPageUI.CUSTOMER_TEXTBOX, userId);
    }

    public void clickToSubmitButton() {
        Log.info("Click to Submit button");
        waitForElementClickable(driver, EditCustomerPageUI.SUBMIT_BUTTON);
        clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON);
    }

    public void inputToAddressToEdit(String addressEdit) {
        Log.info("Input addressEdit");
        waitForElementVisible(driver, EditCustomerPageUI.ADDRESS_TEXTAREA);
        sendKeyToElement(driver, EditCustomerPageUI.ADDRESS_TEXTAREA, addressEdit);
    }


    public void inputPhoneToEdit(String phoneEdit) {
        Log.info("Input phoneEdit");
        waitForElementVisible(driver, EditCustomerPageUI.PHONE_TEXTBOX);
        sendKeyToElement(driver, EditCustomerPageUI.PHONE_TEXTBOX, phoneEdit);
    }

    public void clickToSubmitEditButton() {
        Log.info("click To SubmitEdit Button");
        waitForElementClickable(driver, EditCustomerPageUI.SUBMIT_EDIT_BUTTON);
        clickToElement(driver, EditCustomerPageUI.SUBMIT_EDIT_BUTTON);
    }

    public void clickToAcceptAlert() {
        Log.info("Click To Accept Alert");
        waitAlertPresence(driver);
        acceptAlert(driver);
    }

    public void inputToCustomerId(String customerID) {
    }

    public String getTextAddressLabel() {
        Log.info("getTextAddressLabel so sanh edit customer");
        waitForElementVisible(driver, EditCustomerPageUI.ADDRESS_LABEL);
        return getAttributeElement(driver, EditCustomerPageUI.ADDRESS_LABEL, "value");
    }

    public String getTextCityLabel() {
        waitForElementVisible(driver, EditCustomerPageUI.CITY_LABEL);
        return getAttributeElement(driver, EditCustomerPageUI.CITY_LABEL, "value");
    }

    public String getTextStateLabel() {
        waitForElementVisible(driver, EditCustomerPageUI.STATE_LABEL);
        return getAttributeElement(driver, EditCustomerPageUI.STATE_LABEL, "value");
    }

    public String getTextPhoneLabel() {
        waitForElementVisible(driver, EditCustomerPageUI.PHONE_LABEL);
        return getAttributeElement(driver, EditCustomerPageUI.PHONE_LABEL, "value");
    }
}