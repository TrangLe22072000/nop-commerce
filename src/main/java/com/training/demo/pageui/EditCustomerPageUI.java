package com.training.demo.pageui;

import static com.training.demo.core.Locator.xpath;

public class EditCustomerPageUI {
    public static final String CUSTOMER_TEXTBOX = xpath("//input[@name='cusid']");
    public static final String SUBMIT_BUTTON = xpath("//input[@name='AccSubmit']");
    public static final String ADDRESS_TEXTAREA=xpath("//textarea[@name='addr']");
    public static final String PHONE_TEXTBOX=xpath("//input[@name='telephoneno']");
    public static final String CITY_TEXTBOX=xpath("//input[@name='city']");
    public static final String STATE_TEXTBOX=xpath("//input[@name='state']");
    public static final String SUBMIT_EDIT_BUTTON=xpath("//input[@name='sub']");
    public static final String ADDRESS_LABEL = xpath("//td[text()='Address']/following-sibling::td/textarea");
    public static final String CITY_LABEL = xpath("//td[text()='City']/following-sibling::td/input");
    public static final String STATE_LABEL = xpath("//td[text()='State']/following-sibling::td/input");
    public static final String PHONE_LABEL = xpath("//td[text()='Mobile Number']/following-sibling::td/input");
}