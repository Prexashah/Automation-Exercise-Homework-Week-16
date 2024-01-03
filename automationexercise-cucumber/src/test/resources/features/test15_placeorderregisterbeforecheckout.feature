Feature: Register before checkout

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

  Scenario: Complete purchase flow with account creation and deletion
    When    User clicks on SignupLogin button
    When  User enter"Maria"in name field
    And   User enter"ltester21@gmail.com" in the emailField
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
      | 2,Chapel lane |
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
    And  User hover over first product and clicks on add to cart
    And  User click on view cart button
    Then User should verify that "Shopping Cart" is displayed
    And  User click on proceed to checkout button
    And  verify "Address Detail"
    And  verify text "Review Your Order"
    And  Enter description"Please do next day delivery"
    And  Click on placeOrder
    When User fill below detail
      | Maria Roshan         |
      | 4856 88 55 8899 2246 |
      | 369                  |
      | 05                   |
      | 2028                 |
    And User clicks on pay and confirm order
    Then User should verify the text "Your order has been placed successfully!"
    And  click on delete account button
    Then verify that "ACCOUNT DELETED!"heading






