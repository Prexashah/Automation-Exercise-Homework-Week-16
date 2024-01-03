Feature: Complete Purchase, Invoice Download, and Account Deletion

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

    Scenario: Complete Purchase and Account Deletion
      When  User click on product button
      And   User hover over first product and clicks on add to cart
      And   User click on view cart button
      Then  User should verify that "Shopping Cart" is displayed
      And   User click on proceed to checkout button
      And   Use clicks on register,login button
      And   User enter name "Maria" for newSignup
      And   user enter email address "ltester25@gmail.com" for newSignup
      And   clicks on Signup button.
      Then  verify that "ACCOUNT CREATED!"is visible
      And   User click on continue button
      Then  verify that " Logged in as Maria"
      And  click on Cart button
      And  Click on Proceed to chekout
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
      And click on Download invoce button
      And Verify thet

