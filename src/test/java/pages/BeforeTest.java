package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeTest
{
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //Instance the chromium WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navigateToPage(){
        driver.get("https://www.saucedemo.com/v1/");
    }

    @AfterMethod
    public void tearDown(){
        //Close and quit the browser
        if(driver != null){
            driver.quit();
        }
    }
}
