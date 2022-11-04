@FLTAP-902
Feature: Logout functionality

  Background:
    Given The user go to the login page
    When The user enters userName,password and click on the login button
    Then User should land on the Quick Launchpad page


    @FLTAP-898
    Scenario: The user can log out and should land on the "Login" page after logging out
      Given User click on the log out button inside profile info
      Then User should land on the Login page

    @FLTAP-899
    Scenario: The user can not go to the home page again by clicking the step back button after successfully logging out
      Given User click on the log out button inside profile info
      When User click to back button
      Then User can not go to home page

    @FLTAP-900
    Scenario:  The user must be logged out if the user closes the open tab
    Given Close the open tab
    When Go to the login page
    Then User must be logged out

    @FLTAP-901
    Scenario: The user must be logged out if the user is away from the keyboard for 3 minutes
      Given The user does not do any mouse or keyboard action for three minutes
      Then User must be logged out


