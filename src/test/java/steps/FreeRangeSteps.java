package steps;

import io.cucumber.java.en.Given;
import pages.LoginPageHeritage;

public class FreeRangeSteps {

    LoginPageHeritage landingPage = new LoginPageHeritage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
}
