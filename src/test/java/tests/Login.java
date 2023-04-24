package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @BeforeMethod
    public void preCondition(){
        if(app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }

    @Test
    public void login1() {
        User user = User.builder().email("amaverik281@gmail.com").password("^94NqXC,5fxvUQ=").build();
        logger.info("Test login positive 1--"+user.getEmail()+ " "+user.getPassword());

        app.getUser().initLogin();
        app.getUser().pause(2000);

        app.getUser().fillingLoginForm(user);
        app.getUser().pause(5000);

        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());
        logger.info("Logged--");

    }
}
