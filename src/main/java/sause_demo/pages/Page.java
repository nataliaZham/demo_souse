package sause_demo.pages;

import com.github.javafaker.Faker;

/**
 * This class contains urls, test credentials and data
 */
public class Page {

    //necessary variables for tests
    public LoginPage loginPage;
    public HomePage homePage;
    static Faker faker = new Faker();

    //urls
    public static String LOGIN_URL = "https://www.saucedemo.com/";

    //test credentials
    public static String USER_NAME = "standard_user";
    public static String USER_PASS = "secret_sauce";
    public static String WRONG_USER_NAME = faker.internet().emailAddress();
    public static String WRONG_USER_PASS = faker.internet().password();

    //test data
    public static String ERROR_MESSAGE = "Epic sadface: Username and password do not match any user in this service";


}
