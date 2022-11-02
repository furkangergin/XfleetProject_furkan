Feature: Logout functionality

  Background:
    Given The user go to the login page
    When The user enters userName,password and click on the login button
    Then User should land on the Quick Launchpad page



    Scenario: The user can log out and user should land on the "Login" page after logging out
      Given User click on the log out button inside profile info
      Then User should land on the Login page
  @wip
    Scenario: The user can not go to the home page again by clicking the step back button after successfully logging out
      Given User click on the log out button inside profile info
      When User click to back button
      Then User can not go to home page
