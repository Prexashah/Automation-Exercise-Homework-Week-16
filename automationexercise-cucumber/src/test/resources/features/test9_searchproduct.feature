Feature: Search Product


  Background:
    Given Launch browser
    Then verify that homepage is visible successfully

  Scenario: Verify Product search functionality
    When   User click on product button
    Then    user should navigate to"ALL PRODUCTS" is visible
    When    user enter Product name"Jeans" in search input and click search button
    Then    verify "SEARCHED PRODUCTS" is visible
    Then    Verify all the product related to search are visible

