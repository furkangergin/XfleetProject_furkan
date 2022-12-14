package com.xfleet.pages;

import com.xfleet.utilities.Driver;
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

    @FindBy(css = "h2.title")
    public WebElement onLoginPage;

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

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotLink;

    @FindBy(xpath = "//h2[.='Forgot Password']")
    public WebElement forgotPage;

    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMe;

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement profilMenu;



}
