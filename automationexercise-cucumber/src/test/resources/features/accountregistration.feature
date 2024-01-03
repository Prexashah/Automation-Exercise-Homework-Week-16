Feature: Account creation and Deletion

  Scenario: Creating and Deleting an Account
    Given Launch browser
    Then  verify that homepage is visible successfully
    When  User clicks on Signup/Login button
    Then  verify "New User Signup!"is visible
    When  User enter"Maria"in name field
    And   User enter"ltester@gmail.com" in the emailField
    And   User clicks on Signup button
    Then Verify "ENTER ACCOUNT INFORMATION" is visible
    When fill the details
      | Mrs     |
      | abcd123 |
      | 1       |
      | May     |
      | 1970    |
    And select checkbox signUP for news letter box
    And select checkbox receive special offers from our partner!
    When User fill below details
      | Maria         |
      | Roshan        |
      | xyz Ltd       |
      | 1,Chapel lane |
      | HaleBarns     |
      | India         |
      | Gujarat       |
      | Ahemdabad     |
      | 380013        |
      | 9188556633    |
    And User clicks on Create Account button
    Then verify that "ACCOUNT CREATED!"is visible
    And  User click on continue button
    Then verify that " Logged in as Maria"
    When click on delete account button
    Then verify that "ACCOUNT DELETED!"heading
    And  Clcik on continueButton




