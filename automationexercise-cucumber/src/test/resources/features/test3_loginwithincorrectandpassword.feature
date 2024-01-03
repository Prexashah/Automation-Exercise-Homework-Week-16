Feature: Login validation


    Scenario: Login with incorrect credential
      Given Launch browser
      Then  Verify that homepage is visible successfully
      When User clicks on SignupLogin button
      Then verify that "Login to your account" is visible
      When user enters incorrect email"maria@gmail.com"
      And  user enters incorrect password"abcd123"
      And  clicks on login button
      Then user verify the error message"Your email or password is incorrect!"