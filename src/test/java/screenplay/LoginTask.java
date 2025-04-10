package screenplay;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;

public class LoginTask implements Task {
    private final String username;
    private final String password;

    public LoginTask(String username,String password){
        this.username = username;
        this.password = password;
    }

    public static LoginTask withCredentials(String username, String password){
       return new LoginTask(username,password);
    }

        @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(username).into(By.id("user-nam")),
            Enter.theValue(password).into(By.id("password")),
            Click.on(By.id("login-button"))
        );
    }
}
