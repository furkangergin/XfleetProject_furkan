@FLTAP-769
Feature: Login functionality

  Background:
    Given The user on the login page

  @FLTAP-746
  Scenario Outline: Login as a "<userType>"
    When The user logs in as a "<userType>"
    And The user put "<userName>" and "<password>"
    Then The user is on the "<pageSubTitle>" page

    Examples:
      | userType      | userName        | password    | pageSubTitle    |
      | Driver        | user1           | UserUser123 | Quick Launchpad |
      | Sales Manager | salesmanager101 | UserUser123 | Dashboard       |
      | Store Manager |storemanager51   |UserUser123  | Dashboard       |

  @FLTAP-759
  Scenario Outline: Can not login with invalid crendials (valid username-invalid password and invalid username-valid password)
    Given The users try to login with "<userName>" and "<password>"
    Then Users can not login and see Invalid username or password.

    Examples:
      | userName        | password    |
      | user1           | asdfg       |
      | Suser1111       | UserUser123 |
      | salesmanager101 | awer        |
      | dfrt            | UserUser123 |
      | storemanager51  | uyyy        |
      | cccc            | UserUser123 |

    @FLTAP-761
    Scenario Outline:  "Please fill out this field" message should be displayed into username field if the username or both password and username are empty
    Given The users try to login with "<userName>" and "<password>"
    Then "Please fill out this field." message should be displayed

    Examples:
      | userName | password    |
      |          | UserUser123 |
      |          |             |

    @FLTAP-763
    Scenario: "Please fill out this field" message should be displayed if the password is empty
      Given The users try to login with "user1" and ""
      Then "Please fill out this field." message should be displayed if password is empty

    @FLTAP-764
    Scenario: User land on the Forgot Password page after clicking on the "Forgot your password?" link
      Given User click on the Forgot your password? link
      Then User land on the ‘Forgot Password’ page

    @FLTAP-766
    Scenario: User can see "Remember Me" link exists and is clickable on the login page
      Given User can see Remember Me link
      Then It is clickable

    @FLTAP-814
    Scenario: User should see the password in bullet signs by default (like ****)
      Given User types UserUser123 into the password field
      Then User see bullet signs into the password field

    @FLTAP-815
    Scenario: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
      Given User as a Driver enters the username-password and press the Enter
      Then The user is on the Dashboard page

    @FLTAP-830
  Scenario Outline: All users can see their own usernames in the profile menu
    Given The user logs in as a "<userType>"
    When The user put "<userName>" and "<password>"
    Then The users should see their "<own usernames>" in the profile menu

    Examples:
      | userType      | userName        | password    | own usernames   |
      | Driver        | user1           | UserUser123 | user1           |
      | Sales Manager | salesmanager101 | UserUser123 | salesmanager101 |
      | Store Manager | storemanager51  | UserUser123 | storemanager51  |





