package com.training.demo.feature;

import com.training.demo.pageobject.AddCustomerPageObject;
import com.training.demo.pageobject.HomePageObject;
import com.training.demo.pageobject.LoginPageObject;
import com.training.demo.pageobject.ManagerHomePageObject;
import com.training.demo.utils.DataUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageCustomer {
    private WebDriver driver;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private ManagerHomePageObject managerHomePage;
    private AddCustomerPageObject addCustomerPage;
    private String name, dateOfBirth, address, city, state, pin, phone, email, gender;
    private String userId, password;
    By dateOfBirthTextBox = By.name("dob");

    @BeforeMethod
    public void setUp() {
        name = "Trang";
        dateOfBirth = "05-07-2000";
        address = "Vinh loc";
        city = "Thanh hoa";
        state = "sate";
        pin = "123456";
        phone = "0389569963";
        email = "Trang123@gmail.com";
        password = "1234567";
        gender = "Male";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPageObject(driver);
        homePage = new HomePageObject(driver);
        managerHomePage = new ManagerHomePageObject(driver);
        addCustomerPage = new AddCustomerPageObject(driver);
    }

    @Test
    public void TC01() {

        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        loginPage.openRegisterPage();
        homePage.inputEmailRegister(DataUtils.getEmailAddress());
        homePage.submitRegister();
        userId = homePage.getUserID();
        password = homePage.getPassword();

        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        loginPage.inputUserIDToLogin(userId);
        loginPage.inputPasswordToLogin(password);
        loginPage.clickLogin();

        Assert.assertEquals(managerHomePage.getTextHeading(), "Welcome To Manager's Page of Guru99 Bank");

        managerHomePage.clickNewCustomer();
        addCustomerPage.inputName(DataUtils.getFirtName());
        addCustomerPage.clickGender();
        addCustomerPage.inputDateOfBirth(DataUtils.getRandomDOB());
        addCustomerPage.inputAddress(DataUtils.getFirstNameAddress());
        addCustomerPage.inputCity(DataUtils.getCity());
        addCustomerPage.inputState(state);
        addCustomerPage.inputPin(DataUtils.getPin());
        addCustomerPage.inputPhone(DataUtils.getPhoneNumber());
        addCustomerPage.inputEmail(DataUtils.getEmailAddress());
        addCustomerPage.inputPassword(DataUtils.getPassword());
        addCustomerPage.clickSubmit();

        Assert.assertEquals(addCustomerPage.getName(), DataUtils.getFirtName());
        Assert.assertEquals(addCustomerPage.getGender(), gender);
        Assert.assertEquals(addCustomerPage.getDateOfBirth(), DataUtils.getRandomDOB());
        Assert.assertEquals(addCustomerPage.getAddress(), DataUtils.getEmailAddress());
        Assert.assertEquals(addCustomerPage.getCity(), DataUtils.getCity());
        Assert.assertEquals(addCustomerPage.getSate(), state);
        Assert.assertEquals(addCustomerPage.getPin(), DataUtils.getPin());
        Assert.assertEquals(addCustomerPage.getPhone(), DataUtils.getPhoneNumber());
        Assert.assertEquals(addCustomerPage.getEmail(), DataUtils.getEmailAddress();
        Assert.assertEquals(addCustomerPage.getPassword(), DataUtils.getPassword());


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}