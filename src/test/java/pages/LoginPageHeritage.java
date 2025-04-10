package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageHeritage extends BasePage{

    private String usernameLocator = "user-name";
    private String passwordLocator = "password";
    private String loginButtonLocator = "login-button";

    public LoginPageHeritage(){
        super(driver);
    }

    public void navigateToFreeRangeTesters(){
        navigateTo("https://freerangetesters.com/");
    }

    public void fillUserName(String userName){
        sendKeysToElement(usernameLocator,userName);

    }

    public void fillPassword(String password){
        sendKeysToElement(passwordLocator,password);
    }

    public void clickLoginButton(){
        clickElement(loginButtonLocator);
    }
}
