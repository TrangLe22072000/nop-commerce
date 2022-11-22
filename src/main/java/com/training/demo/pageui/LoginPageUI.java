package com.training.demo.pageui;

import static com.training.demo.core.Locator.xpath;

public class LoginPageUI {
    public static final String VISIT_HERE = xpath("//a[text()='here']");
    public static final String PASSWORD_TEXTBOX = xpath("//input[@name='password']")  ;
    public static final String LOGIN_BUTTON = xpath("//input[@name='btnLogin']");
    public static String Email_TEXTBOX= xpath("//input[@name='uid']") ;
}
