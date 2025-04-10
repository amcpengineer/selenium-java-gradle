package screenplay;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginScreenPlayTest {

    @Managed
    WebDriver driver;

    @Steps
    Actor actor;

    //@Test
    public void testLogin(){
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.url("https://www.saucedemo.com/v1/"));
        actor.attemptsTo(LoginTask.withCredentials("Angela", "Angela"));

      //Here comes the assertions
    }

}
