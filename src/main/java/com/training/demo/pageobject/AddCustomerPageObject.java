package com.training.demo.pageobject;

import com.training.demo.core.BasePage;
import com.training.demo.pageui.AddCustomerPageUI;
import com.training.demo.pageui.HomePageUI;
import com.training.demo.pageui.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class AddCustomerPageObject  extends BasePage {
    private WebDriver driver;
    public AddCustomerPageObject(WebDriver driver) {this.driver = driver;}
    public void inputName(String name) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_NAME);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_NAME,name);

    }
    public void clickGender() {
        waitForElementVisible(driver, AddCustomerPageUI.CLICK_GENDER);
        clickToElement(driver, AddCustomerPageUI.CLICK_GENDER);
    }

    public void inputDateOfBirth(String dateOfBirth) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_DATE_OF_BIRTH);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_DATE_OF_BIRTH, dateOfBirth);
    }

    public void inputAddress(String address) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_ADDRESS);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_ADDRESS, address);
    }

    public void inputCity(String city) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_CITY);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_CITY, city);
    }

    public void inputState(String state) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_STATE);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_STATE, state);
    }

    public void inputPin(String pin) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_PIN);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_PIN, pin);
    }

    public void inputPhone(String phone) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_PHONE);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_PHONE, phone);
    }

    public void inputEmail(String email) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_EMAIL);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_EMAIL, email);
    }

    public void inputPassword(String password) {
        waitForElementVisible(driver, AddCustomerPageUI.INPUT_PASSWORD);
        sendKeyToElement(driver,AddCustomerPageUI.INPUT_PASSWORD, password);
    }

    public void clickSubmit() {
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
}
