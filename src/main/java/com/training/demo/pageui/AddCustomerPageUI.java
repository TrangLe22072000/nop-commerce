package com.training.demo.pageui;

import static com.training.demo.core.Locator.name;
import static com.training.demo.core.Locator.xpath;

public class AddCustomerPageUI {
    public static final String GENGER_RESULT = xpath("//td[text()='Gender']/following-sibling::td");
    public static final String DATE_OF_BIRTH_RESULT = xpath("//td[text()='Date of Birth']/following-sibling::td") ;
    public static final String ADDRESS_RESULT = xpath("//td[text()='Address']/following-sibling::td");
    public static final String CITY_RESULT =  xpath("//td[text()='City']/following-sibling::td");
    public static final String STATE_RESULT = xpath("//td[text()='State']/following-sibling::td");
    public static final String PIN_RESULT = xpath("//td[//td[text()='PIN']/following-sibling::td") ;
    public static final String PHONE_RESULT = xpath("//td[text()='Mobile Number']/following-sibling::td") ;
    public static final String EMAIL_RESULT = xpath("//td[text()='E-mail']/following-sibling::td");
    public static final String PASSWORD_RESULT = xpath("//td[text()='Password']/following-sibling::td");
    public static final String NAME_RESULT = xpath("//td[text()='Customer Name']/following-sibling::td");
    public static final String INPUT_NAME = xpath("//td[text()='Customer Name']/following-sibling::td") ;
    public static final String CLICK_GENDER = xpath("//td[text()='Gender']/following-sibling::td") ;
    public static final String INPUT_DATE_OF_BIRTH = xpath("//td[text()='Date of Birth']/following-sibling::td");
    public static final String INPUT_ADDRESS = xpath("//td[text()='Address']/following-sibling::td");
    public static final String INPUT_CITY = xpath("//td[text()='City']/following-sibling::td") ;
    public static final String INPUT_STATE = xpath("//td[text()='State']/following-sibling::td") ;
    public static final String INPUT_PIN = xpath("//td[//td[text()='PIN']/following-sibling::td");
    public static final String INPUT_PHONE = xpath("//td[text()='Mobile Number']/following-sibling::td");
    public static final String INPUT_EMAIL = xpath("//td[text()='E-mail']/following-sibling::td");
    public static final String INPUT_PASSWORD = xpath("//td[text()='Password']/following-sibling::td");
    public static final String CLICK_SUBMIT = name("Sub") ;
}
