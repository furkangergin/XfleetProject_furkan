package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LogoutPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LogoutStepDef {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("The user go to the login page")
    public void the_user_go_to_the_login_page() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/");
    }
    @When("The user enters userName,password and click on the login button")
    public void the_user_enters_user_name_password_and_click_on_the_login_button() {
        loginPage.userNameInput.sendKeys("user1" + Keys.ENTER);
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginButton.click();
    }
    @Then("User should land on the Quick Launchpad page")
    public void user_should_land_on_the_quick_launchpad_page() {
       Assert.assertTrue(loginPage.quickLaunchpad.isDisplayed());
    }
    @Given("User click on the log out button inside profile info")
    public void user_click_on_the_log_out_button_inside_profile_info() {
        loginPage.profilMenu.click();
        logoutPage.logoutButton.click();
    }
    @Then("User should land on the Login page")
    public void user_should_land_on_the_page() {
        Assert.assertTrue(loginPage.onLoginPage.isDisplayed());
    }
    @When("User click to back button")
    public void user_click_to_back_button() {
        BrowserUtils.waitFor(3);
        Driver.getDriver().navigate().back();
    }
    @Then("User can not go to home page")
    public void user_can_not_go_to_home_page() {
        String expectedTitle = Driver.getDriver().getTitle();
        Assert.assertFalse(expectedTitle.equalsIgnoreCase("Dashboard"));
    }
}
