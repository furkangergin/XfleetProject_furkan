package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("The user on the login page")
    public void the_user_on_the_login_page() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/");
    }

    @Given("The user logs in as a {string}")
    public void the_user_logs_in_as_a(String string) {
        System.out.println(string);
    }

    @When("The user put {string} and {string}")
    public void the_user_put_and(String username, String password) {
        loginPage.userNameInput.sendKeys(username + Keys.ENTER);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("The user is on the {string} page")
    public void the_user_is_on_the_page(String pageSubTitle) {
        if (pageSubTitle.equals("Quick Launchpad")) {
            String actual = loginPage.quickLaunchpad.getText();
            Assert.assertEquals("not equal", pageSubTitle, actual);
        } else {
            String actual = loginPage.dashboard.getText();
            Assert.assertEquals("not equal", pageSubTitle, actual);
        }

    }

    @Given("The users try to login with {string} and {string}")
    public void the_users_try_to_login_with_and(String username, String password) {
        loginPage.userNameInput.sendKeys(username + Keys.ENTER);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("Users can not login and see Invalid username or password.")
    public void users_can_not_login_and_see_ınvalid_username_or_password() {
        String actual = loginPage.invalidCredentials.getText();
        Assert.assertEquals("Invalid user name or password.", actual);

    }
    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String string) {
        String actual = loginPage.userNameInput.getAttribute("validationMessage");
        System.out.println(actual);
    }


}










