package sause_demo;

import org.junit.Before;
import org.junit.Test;
import sause_demo.pages.LoginPage;
import sause_demo.pages.Page;

import static com.codeborne.selenide.Selenide.open;

/**
 * This class contains all tests for the login page
 */
public class LoginTest extends Page {


    //this is the method that opens the login page
    @Before
    public void openLoginPage() {
        loginPage = open(LOGIN_URL, LoginPage.class);
    }


    //this is a test where the user logs in with the correct data
    @Test
    public void loginWithCorrUD() {
        homePage = loginPage.loginWithCorrectUserData();
        homePage.checkSuccessfulLogin();

    }


    //this is a test where the user logs in with incorrect data
    @Test
    public void loginWithIncorrUD() {
        loginPage.loginWithWrongUserData();
        loginPage.checkLoginError();
    }


}


