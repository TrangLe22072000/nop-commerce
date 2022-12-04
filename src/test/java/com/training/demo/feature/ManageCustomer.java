package com.training.demo.feature;

import com.training.demo.core.BaseTest;
import com.training.demo.pageobject.*;
import com.training.demo.utils.DataUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ManageCustomer extends BaseTest {
    private WebDriver driver;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private ManagerHomePageObject managerHomePage;
    private AddCustomerPageObject addCustomerPage;
    private EditCustomerPageObject editCustomerPage;
    private DeleteCustomerPageObject deleteCustomerPage;
    private String name, dateOfBirth, address, city, state, pin, phone, email, gender,phoneEdit,addressEdit,customerID;
    private String userId, password;


    @Parameters("browser")
    @BeforeTest
    public void setUp(@Optional("chrome") String browser) {
        name = DataUtils.getFirtName();
        dateOfBirth = "05-07-2000";
        address = "Vinh loc";
        city = "Thanh hoa";
        state = "ny";
        pin = "123456";
        phone = "0389569963";
        email = "Trang123@gmail.com";
        gender = "Male";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPageObject(driver);
        homePage = new HomePageObject(driver);
        managerHomePage = new ManagerHomePageObject(driver);
        addCustomerPage = new AddCustomerPageObject(driver);
        editCustomerPage = new EditCustomerPageObject(driver);
        deleteCustomerPage = new DeleteCustomerPageObject(driver);
        DataUtils.getData();
        addressEdit = DataUtils.getFirstNameAddress();
        phoneEdit = DataUtils.getPhoneNumber();
    }

    @Test (priority =  0)
    public void TC01_Register() {

        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        loginPage.openRegisterPage();
        homePage.inputEmailRegister(DataUtils.getEmailAddress());
        homePage.submitRegister();
        userId = homePage.getUserID();
        password = homePage.getPassword();

    }
    @Test (priority = 1)
    public void TC02_Login() {

        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        loginPage.inputUserIDToLogin(userId);
        loginPage.inputPasswordToLogin(password);
        loginPage.clickLogin();

        Assert.assertEquals(managerHomePage.getTextHeading(), "Welcome To Manager's Page of Guru99 Bank");
    }
    @Test
    public void TC03_NewCustomer() {

        managerHomePage.clickNewCustomer();
        addCustomerPage.inputName(name);
        addCustomerPage.clickGender();
        addCustomerPage.inputDateOfBirth(dateOfBirth);
        addCustomerPage.inputAddress(DataUtils.getFirstNameAddress());
        addCustomerPage.inputCity(DataUtils.getCity());
        addCustomerPage.inputState(state);
        addCustomerPage.inputPin(DataUtils.getPin());
        addCustomerPage.inputPhone(DataUtils.getPhoneNumber());
        addCustomerPage.inputEmail(DataUtils.getEmailAddress());
        addCustomerPage.inputPassword(DataUtils.getPassword());
        addCustomerPage.clickSubmit();
        customerID = addCustomerPage.getTextCustomerID();

    }
//    @Test
//    public void TC04_VerifyCustomerCreated() {
//        Assert.assertEquals(addCustomerPage.getName(),name);
//        Assert.assertEquals(addCustomerPage.getGender(), gender);
//        Assert.assertEquals(addCustomerPage.getDateOfBirth(), DataUtils.getRandomDOB());
//        Assert.assertEquals(addCustomerPage.getAddress(), DataUtils.getEmailAddress());
//        Assert.assertEquals(addCustomerPage.getCity(), DataUtils.getCity());
//        Assert.assertEquals(addCustomerPage.getSate(), state);
//        Assert.assertEquals(addCustomerPage.getPin(), DataUtils.getPin());
//        Assert.assertEquals(addCustomerPage.getPhone(), DataUtils.getPhoneNumber());
//        Assert.assertEquals(addCustomerPage.getEmail(), DataUtils.getEmailAddress());
//        Assert.assertEquals(addCustomerPage.getPassword(), DataUtils.getPassword());


 //   }

    @Test
    public void TC04_EditCustomer() {
        managerHomePage.clickEditCustomer();
        editCustomerPage.inputCustomerID(customerID);
        editCustomerPage.clickToSubmitButton();

        editCustomerPage.inputToAddressToEdit(addressEdit);
        editCustomerPage.inputPhoneToEdit(phoneEdit);

        editCustomerPage.clickToSubmitEditButton();
        editCustomerPage.clickToAcceptAlert();

        editCustomerPage.inputCustomerID(customerID);
        editCustomerPage.clickToSubmitButton();

        Assert.assertEquals(editCustomerPage.getTextAddressLabel(), addressEdit);
        Assert.assertEquals(editCustomerPage.getTextPhoneLabel(), phoneEdit);

    }

    @Test
    public void TC05_DeleteCustomer() {
        managerHomePage.clickToDeleteCustomer();
        deleteCustomerPage.inputCustomerIdToDelete(customerID);
        deleteCustomerPage.clickToSubmitButton();
        deleteCustomerPage.clickToAcceptAlert();
        Assert.assertEquals(deleteCustomerPage.getTextDeleteSuccess(), "Customer does not Exist!!!");
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}