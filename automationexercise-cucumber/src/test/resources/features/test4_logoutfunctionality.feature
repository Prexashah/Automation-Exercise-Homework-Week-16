Feature: Logout functionality

  Scenario: User login and logout functionality
    Given Launch browser
    Then  Verify that homepage is visible successfully
    When User clicks on SignupLogin button
    Then verify that "Login to your account" is visible
    When  User enter correct email address"ltester@gmail.com"
    And   User enter correct password"abcd123"
    And   Click on login button
    Then  verify that " Logged in as Maria" is visible
    When  user click on logout button
    Then  verify that user is navigate to "New User Signup!"


