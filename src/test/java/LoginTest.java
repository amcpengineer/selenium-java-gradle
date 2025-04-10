import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        //Instance the chromium WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        loginPage = new LoginPage(driver);

        //Old instance
        //System.setProperties("webdriver.chrome.driver", "path/to/driver");
        //driver = new ChromeDriver();

    }

    @Test
    public void testLogin(){

        loginPage.fillPassword("Angela");
        loginPage.fillPassword("Prueba");
        loginPage.clickLoginButton();
    }

    @AfterMethod
    public void tearDown(){
        //Close and quit the browser
        if(driver != null){
            driver.quit();
        }
    }
}
