package sause_demo.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains all variables and methods for the home page
 */
public class HomePage {

    public static By burgerMenuBtn = By.xpath("//*[@id='react-burger-menu-btn']");
    public static By logoutBtn = By.xpath("//*[@id='logout_sidebar_link']");


    public void checkSuccessfulLogin() {
        $(burgerMenuBtn).click();
        $(logoutBtn).shouldHave(Condition.enabled);
    }


}
