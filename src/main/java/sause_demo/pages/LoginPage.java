package sause_demo.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * This class contains all variables and methods for the login page
 */
public class LoginPage extends Page {


    public static By userNameField = By.xpath("//*[@id='user-name']");
    public static By userPassField = By.xpath("//*[@id='password']");
    public static By loginBtn = By.xpath("//*[@id='login-button']");
    public static By errorMessage = By.xpath("//*[@data-test='error']");

    public HomePage loginWithCorrectUserData() {
        $(userNameField).setValue(USER_NAME);
        $(userPassField).setValue(USER_PASS);
        $(loginBtn).click();
        return page(HomePage.class);
    }

    public void loginWithWrongUserData() {
        $(userNameField).setValue(WRONG_USER_NAME);
        $(userPassField).setValue(WRONG_USER_PASS);
        $(loginBtn).click();
    }

    public void checkLoginError() {
        $(errorMessage).shouldHave(Condition.text(ERROR_MESSAGE));

    }


}
