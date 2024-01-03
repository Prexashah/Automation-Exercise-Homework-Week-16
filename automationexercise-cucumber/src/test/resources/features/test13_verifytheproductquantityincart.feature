Feature: Add Product to Cart and Verify Quantity in Cart Page

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully



  Scenario: Add Product to Cart and Verify Quantity in Cart Page
    When  Click on view products from any product on homepage
    And   User increases the quantity to "4"
    And   User clicks on add to cart button
    Then  User should verify that the product is displayed with quantity"4"


