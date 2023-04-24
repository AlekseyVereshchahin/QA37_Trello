package manage;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillingLoginForm(String email, String password) {
        type(By.cssSelector("#user"), email);
       // pause(2000);
        click(By.cssSelector("#login"));
       // pause(5000);
        type(By.cssSelector("#password"), password);
    }

    public void fillingLoginForm(User user) {
        type(By.cssSelector("#user"), user.getEmail());
        // pause(2000);
        click(By.cssSelector("#login"));
        // pause(5000);
        type(By.cssSelector("#password"), user.getPassword());
    }

    public void submitLogin() {
        click(By.cssSelector("#login-submit"));
    }

    public boolean isLogged() {
        return wd.findElements(By.cssSelector("[data-testid='header-member-menu-button']")).size()>0;
    }

    public void logOut() {
        click(By.cssSelector("[data-testid='header-member-menu-button']"));
        click(By.cssSelector("[data-testid='account-menu-logout']"));
        click(By.cssSelector("#logout-submit"));
    }

    public void login(String email, String password) {
        click(By.cssSelector("[href='/login']"));
        type(By.cssSelector("#user"), email);
        click(By.cssSelector("#login"));
        pause(10000);
        type(By.cssSelector("#password"), password);
        pause(10000);
        click(By.cssSelector("#login-submit"));
    }

}
