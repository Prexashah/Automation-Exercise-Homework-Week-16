Feature: User Account Operations and Checkout

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

  Scenario: Account Creation, Checkout, and Account Deletion
    When   User clicks on SignupLogin button
    When  User enter name"maria"
    And   User enter existing email"ltester@gmail.com"
    And   clicks on signup button
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
    Then verify that " Logged in as Maria" is visible
    And  User hover over first product and clicks on add to cart
    And  User click on view cart button
    Then User should verify that "Shopping Cart" is displayed
    And  User click on proceed to checkout button
    When  User click on delete account
    Then  verify that heading "ACCOUNT DELETED"







