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
    public static final String INPUT_NAME = xpath("//input[@name='name']") ;
    public static final String CLICK_GENDER =  xpath("//input[@name='rad1' and @value='m']") ;
    public static final String INPUT_DATE_OF_BIRTH = xpath("//input[@type='date']");
    public static final String INPUT_ADDRESS = xpath("//textarea[@name='addr']");
    public static final String INPUT_CITY = xpath("//input[@name='city']") ;
    public static final String INPUT_STATE = xpath("//input[@name='state']") ;
    public static final String INPUT_PIN = xpath("//input[@name='pinno']");
    public static final String INPUT_PHONE = xpath("//input[@name='telephoneno']");
    public static final String INPUT_EMAIL = xpath("//input[@name='emailid']");
    public static final String INPUT_PASSWORD = xpath("//input[@name='password']");
    public static final String CLICK_SUBMIT = xpath("//input[@name='sub']") ;
}
