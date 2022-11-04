package com.xfleet.step_definitions;

import com.xfleet.pages.LoginPage;
import com.xfleet.pages.LogoutPage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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
       BrowserUtils.sleep(3);
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
    @Given("Close the open tab")
    public void close_the_open_tab() {
        Driver.closeDriver();
    }
    @When("Go to the login page")
    public void go_to_the_login_page() {
        BrowserUtils.sleep(2);
        Driver.getDriver().get("http://qa.xfleetsolutions.com/");
        BrowserUtils.sleep(3);
    }
    @Then("User must be logged out")
    public void user_must_be_logged_out() {
       //Assert.assertFalse(loginPage.quickLaunchpad.isDisplayed());
       String expectedTitle = "Login";
       String actualTitle = Driver.getDriver().getTitle();
       Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("The user does not do any mouse or keyboard action for three minutes")
    public void the_user_wait_three_minutes() {
        BrowserUtils.sleep(180);

    }
}
