Feature: Register user with existing email
  As a user I want register with existing email and check functionality

  Scenario: User Login with existing email validation
    Given Launch browser
    Then  Verify that homepage is visible successfully
    When User clicks on SignupLogin button
    Then Verify that "New User Signup!" is visible
    When User enter name"maria"
    And  User enter existing email"ltester@gmail.com"
    And  clicks on signup button
    Then verify the text"Email Address already exist!"