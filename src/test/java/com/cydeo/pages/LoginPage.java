package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userNameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    @FindBy(id="_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement quickLaunchpad;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboard;

    @FindBy(xpath = "//h3[.='Loading...']")
    public WebElement loadingBar;

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[1]")
    public WebElement profileInfo;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidCredentials;


}
