package com.training.demo.factory.environment;

import com.training.demo.factory.browser.ChromeDriverManager;
import com.training.demo.factory.browser.ChromeHeadlessDriverManager;
import com.training.demo.factory.browser.FirefoxDriverManager;
import com.training.demo.factory.browser.FirefoxHeadlessDriverManager;
import com.training.demo.helper.enumeration.BROWSER;
import org.openqa.selenium.WebDriver;

public class LocalFactory {

    private WebDriver driver;
    private String browserName;
    public LocalFactory(String browserName) {
        this.browserName = browserName;
    }

    public WebDriver createDriver() {
        BROWSER browser= BROWSER.valueOf(browserName.toUpperCase());
        switch (browser) {
            case H_CHROME:
                driver = new ChromeHeadlessDriverManager().getBrowserDriver();
                break;

            case H_FIREFOX:
                driver =new FirefoxHeadlessDriverManager().getBrowserDriver();
                break;

            case FIREFOX:
                driver = new FirefoxDriverManager().getBrowserDriver();
                break;

            case CHROME:
                driver = new ChromeDriverManager().getBrowserDriver();
                break;
            default:
                break;
        }
        return driver;
    }
}
