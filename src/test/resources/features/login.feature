Feature: Login functionality

  Background:
    Given The user on the login page

  Scenario Outline: Login as a "<userType>"
    Given The user logs in as a "<userType>"
    When The user put "<userName>" and "<password>"
    Then The user is on the "<pageSubTitle>" page

    Examples:
      | userType      | userName        | password    | pageSubTitle    |
      | Driver        | user1           | UserUser123 | Quick Launchpad |
      | Sales Manager | salesmanager101 | UserUser123 | Dashboard       |
      | Store Manager |storemanager51   |UserUser123  | Dashboard       |

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
  @wip
  Scenario Outline:  "Please fill out this field" message should be displayed if the password or username is empty
    Given The users try to login with "<userName>" and "<password>"
    Then "Please fill out this field." message should be displayed

    Examples:
      | userName | password    |
      |          | UserUser123 |
      | user1    |             |
      |          |             |




