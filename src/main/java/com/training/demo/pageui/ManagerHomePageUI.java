package com.training.demo.pageui;

import static com.training.demo.core.Locator.xpath;

public class ManagerHomePageUI {
    public static final String HEADING_LABEL = xpath("//marquee[@class='heading3']") ;
    public static final String NEW_CUSTOMER = xpath("//a[text()='New Customer']");
    public static final String EDIT_CUSTOMER = xpath("//a[text()='Edit Customer']");

    public static final String DELETE_CUSTOMER = xpath("//a[text()='Delete Customer']");
}
