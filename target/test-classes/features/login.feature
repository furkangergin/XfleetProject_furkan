Feature: Login functionality

  Background:
    Given The user on the login page

    Scenario: Login as a driver
      Given The user logs in as a driver
      Then The user is on the Quick Launchpad page

  Scenario: Login as a sales manager
    Given The user logs in as a sales manager
    Then The user is on the Dashboard page

  Scenario: Login as a store manager
    Given The user logs in as a store manager
    Then The user is on the Dashboard page


