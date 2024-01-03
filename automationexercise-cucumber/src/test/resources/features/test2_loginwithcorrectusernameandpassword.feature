Feature: Login User with correct Username and Password
  As a user, I want to check the functionally with valid username and password

  Scenario: Login,verify user and delete account
    Given Launch browser
    Then  Verify that homepage is visible successfully
    When  User clicks on SignupLogin button
    Then  verify that "Login to your account" is visible
    When  User enter correct email address"ltester@gmail.com"
    And   User enter correct password"abcd123"
    And   Click on login button
    Then  verify that " Logged in as Maria" is visible
    When  User click on delete account
    Then  verify that heading "ACCOUNT DELETED"



