Feature: Complete Purchase Flow with Login, Ordering, and Account Deletion

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

    Scenario: Complete Purchase Flow with Login, Ordering, and Account Deletion
      When  User clicks on SignupLogin button
      When  User enter correct email address"ltester@gmail.com"
      And   User enter correct password"abcd123"
      And   Click on login button
      Then  verify that " Logged in as Maria" is visible
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

