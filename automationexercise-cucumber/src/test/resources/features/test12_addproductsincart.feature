Feature: Add products to cart and verify Cart details

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

    Scenario: Add product to cart and verify Cart details
      When   User click on product button
      And    User hover over first product and clicks on add to cart
      And    Click on continue shopping button
      And    User hover over the second product and clicks on add to cart
      And    User click on view cart button
      Then  user should verify both products are added to cart
      And   User verify their prices, quantity and total price