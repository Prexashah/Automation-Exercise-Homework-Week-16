Feature: Remove product from the cart

Background:
Given Launch browser
Then  Verify that homepage is visible successfully

  Scenario: Remove product from the cart
    When  User hover over first product and clicks on add to cart
    And  User click on view cart button
    Then User should verify that "Shopping Cart" is displayed
    When User click on X button
    Then verify that Product is removed from the cart"Cart is empty! Click here to buy products."
