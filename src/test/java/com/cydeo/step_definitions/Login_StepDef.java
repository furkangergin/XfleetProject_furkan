/*
package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDef {
    LoginPage loginPage = new LoginPage();

   */
/* @Given("The user on the login page")
    public void the_user_on_the_login_page() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/");
    }*//*

    @Given("The user logs in as a driver")
    public void the_user_logs_in_as_a_driver() {
        loginPage.userNameInput.sendKeys("user1" + Keys.ENTER);
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginButton.click();
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
       // wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));
        //BrowserUtils.waitFor(20);

    }
    @Then("The user is on the Quick Launchpad page")
    public void the_user_is_on_the_quick_launchpad_page() {
        //loginPage.quickLaunchpad.isDisplayed();
        String expectedPage = "Quick Launcklhpad";
        String actualPage = loginPage.quickLaunchpad.getText();
        Assert.assertEquals("Not Equal", expectedPage,actualPage);
    }

    @Given("The user logs in as a sales manager")
    public void the_user_logs_in_as_a_sales_manager() {

        BrowserUtils.waitForClickablility(loginPage.profileInfo, 10);
        loginPage.profileInfo.click();
        loginPage.logOut.click();
        //Driver.getDriver().navigate().back();
        loginPage.userNameInput.sendKeys("salesmanager101" + Keys.ENTER);
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginButton.click();

    }
    @Then("The user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {

    }
    @Given("The user logs in as a store manager")
    public void the_user_logs_in_as_a_store_manager() {
        Driver.getDriver().navigate().back();
        loginPage.userNameInput.sendKeys("storemanager51" + Keys.ENTER);
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginButton.click();

    }

}
*/
