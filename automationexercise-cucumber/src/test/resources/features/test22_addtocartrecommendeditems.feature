Feature: Add Recommended Product to Cart

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

  Scenario: Add Recommended Product to Cart
    When    User scroll down to footer
    Then   verify that "RECOMMENDED ITEMS" text is there
    And    click on add to cart button
    And    user clicks on view product of the first product




