Feature: Navigate Through Brands

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully


  Scenario: Navigate to brands and verify products
    When    User click on product button
    Then    Products Brand are visible as "BRANDS" on left side of bar
    And     click on any brand name
    Then    User should see the brand text "BRAND - POLO PRODUCTS"
    And     verify that all products are displayed

    Scenario: Navigate to another brand page
      When    User click on brand link from the left side bar
      Then    User should verify text "BRAND - BIBA PRODUCTS"
      And     User can see all the products on the page




