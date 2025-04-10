import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPageHeritage;


public class LoginTestHeritage {

    private WebDriver driver;
    private LoginPageHeritage loginPageHeritage;

    @BeforeMethod
    public void browserSetUp(){
       loginPageHeritage = new LoginPageHeritage();
    }

    @Test
    public void loginTest(){
        loginPageHeritage.fillUserName("Angela");
        loginPageHeritage.fillPassword("Angela");
        loginPageHeritage.clickLoginButton();
    }

    @AfterMethod
    public void afterTest(){
        if(driver!=null){
            driver.quit();
        }
    }

}
