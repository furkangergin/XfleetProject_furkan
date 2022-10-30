package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
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
    public void users_can_not_login_and_see_invalid_username_or_password() {
        String actual = loginPage.invalidCredentials.getText();
        Assert.assertEquals("Invalid user name or password.", actual);

    }
    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String string) {
        String actual = loginPage.userNameInput.getAttribute("validationMessage");
        Assert.assertEquals(string,actual);

    }
    @Then("{string} message should be displayed if password is empty")
    public void message_should_be_displayed_if_password_is_empty(String string) {
        String actual = loginPage.passwordInput.getAttribute("validationMessage");
        Assert.assertEquals(string,actual);
    }
    @Given("User click on the Forgot your password? link")
    public void user_click_on_the_forgot_your_password_link() {
        loginPage.forgotLink.click();
    }
    @Then("User land on the ‘Forgot Password’ page")
    public void user_land_on_the_forgot_password_page() {
        Assert.assertTrue(loginPage.forgotPage.isDisplayed());
    }

    @Given("User can see Remember Me link")
    public void user_can_see_remember_me_link() {
        Assert.assertTrue(loginPage.rememberMe.isDisplayed());
    }
    @Then("It is clickable")
    public void it_is_clickable() {
        loginPage.rememberMe.click();
        Assert.assertTrue(loginPage.rememberMe.isEnabled());
    }
    @Given("User types UserUser123 into the password field")
    public void user_types_user_user123_into_the_password_field() {
        loginPage.passwordInput.sendKeys("UserUser123");

    }
    @Then("User see bullet signs into the password field")
    public void user_see_bullet_signs_into_the_password_field() {
        String actual = loginPage.passwordInput.getAttribute("type");
        Assert.assertEquals("password", actual);
    }

    @Given("User as a Driver enters the username-password and press the Enter")
    public void user_as_a_driver_enters_the_username_password_and_press_the_enter() {
        loginPage.userNameInput.sendKeys("user1" + Keys.ENTER);
        loginPage.passwordInput.sendKeys("UserUser123" + Keys.ENTER);
    }
    @Then("The user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {
       Assert.assertTrue( loginPage.dashboard.isDisplayed());
    }
    @Then("The users should see their {string} in the profile menu")
    public void the_users_should_see_their_in_the_profile_menu(String string) {
        Assert.assertEquals(string,loginPage.profilMenu.getText());

    }


}










