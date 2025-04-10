package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By usernameLocator = By.id("user-name");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillUserName(String userName){
        WebElement userNameElement = driver.findElement(usernameLocator);
        userNameElement.sendKeys(userName);

    }

    public void fillPassword(String password){
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton(){
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();
    }
}
