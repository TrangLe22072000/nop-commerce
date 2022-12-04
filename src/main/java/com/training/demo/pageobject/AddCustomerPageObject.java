package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.helper.logger.Log;
import com.training.demo.pageui.AddCustomerPageUI;
import com.training.demo.pageui.HomePageUI;
import com.training.demo.pageui.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class AddCustomerPageObject  extends BasePage {
    private WebDriver driver;
    public AddCustomerPageObject(WebDriver driver) {this.driver = driver;}
    public void inputName(String name) {
        Log.info("Input name");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_NAME);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_NAME,name);

    }
    public void clickGender() {
        Log.info("Chose gender");
        waitForElementVisible(driver, AddCustomerPageUI.CLICK_GENDER);
        clickToElement(driver, AddCustomerPageUI.CLICK_GENDER);
    }

    public void inputDateOfBirth(String dateOfBirth) {
        Log.info("Input Date of birth");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_DATE_OF_BIRTH);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_DATE_OF_BIRTH, dateOfBirth);
    }

    public void inputAddress(String address) {
        Log.info("Input address");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_ADDRESS);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_ADDRESS, address);
    }

    public void inputCity(String city) {
        Log.info("Input city");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_CITY);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_CITY, city);
    }

    public void inputState(String state) {
        Log.info("Input state");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_STATE);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_STATE, state);
    }

    public void inputPin(String pin) {
        Log.info("Input pin");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_PIN);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_PIN, pin);
    }

    public void inputPhone(String phone) {
        Log.info("Input phone");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_PHONE);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_PHONE, phone);
    }

    public void inputEmail(String email) {
        Log.info("Input email");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_EMAIL);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_EMAIL, email);
    }

    public void inputPassword(String password) {
        Log.info("Input pass");
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_PASSWORD);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_PASSWORD, password);
    }

    public void clickSubmit() {
        Log.info("Click submit to create new customer");
        waitForElementVisible(driver, AddCustomerPageUI.CLICK_SUBMIT);
        clickToElement(driver, AddCustomerPageUI.CLICK_SUBMIT);
    }

    public String getName() {
        waitForElementVisible(driver, AddCustomerPageUI.NAME_RESULT);
        return getTextElement(driver, AddCustomerPageUI.NAME_RESULT);
    }


    public String  getGender() {
        waitForElementVisible(driver, AddCustomerPageUI.GENGER_RESULT);
        return getTextElement(driver, AddCustomerPageUI.GENGER_RESULT);
    }

    public String  getDateOfBirth() {
        waitForElementVisible(driver, AddCustomerPageUI.DATE_OF_BIRTH_RESULT);
        return getTextElement(driver, AddCustomerPageUI.DATE_OF_BIRTH_RESULT);
    }

    public String  getAddress() {
        waitForElementVisible(driver, AddCustomerPageUI.ADDRESS_RESULT);
        return getTextElement(driver, AddCustomerPageUI.ADDRESS_RESULT);
    }

    public String  getCity() {
        waitForElementVisible(driver, AddCustomerPageUI.CITY_RESULT);
        return getTextElement(driver, AddCustomerPageUI.CITY_RESULT);
    }

    public String  getSate() {
        waitForElementVisible(driver, AddCustomerPageUI.STATE_RESULT);
        return getTextElement(driver, AddCustomerPageUI.STATE_RESULT);
    }

    public String  getPin() {
        waitForElementVisible(driver, AddCustomerPageUI.PIN_RESULT);
        return getTextElement(driver, AddCustomerPageUI.PIN_RESULT);
    }

    public String  getPhone() {
        waitForElementVisible(driver, AddCustomerPageUI.PHONE_RESULT);
        return getTextElement(driver, AddCustomerPageUI.PHONE_RESULT);
    }

    public String  getEmail() {
        waitForElementVisible(driver, AddCustomerPageUI.EMAIL_RESULT);
        return getTextElement(driver, AddCustomerPageUI.EMAIL_RESULT);
    }

    public String  getPassword() {
        waitForElementVisible(driver, AddCustomerPageUI.PASSWORD_RESULT);
        return getTextElement(driver, AddCustomerPageUI.PASSWORD_RESULT);
    }

    public String getTextCustomerID() {
        Log.info("Get Customer ID");
        waitForElementVisible(driver, AddCustomerPageUI.CUSTOMER_ID_LABEL);
        return getTextElement(driver, AddCustomerPageUI.CUSTOMER_ID_LABEL);
    }
}
