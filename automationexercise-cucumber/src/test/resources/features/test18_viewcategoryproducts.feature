Feature: Navigate Through Categories

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

  Scenario: Navigate to Women categories and SubCategories
    Then    Verify that "CATEGORY" are visible on left side of bar
    And     Click on women category
    And     User click on the link under the women category
    Then    verify the text "WOMEN - DRESS PRODUCTS"
    And     User click on MEN from category list
    When    User clicks on subcategory of MEN
    Then    Verify the text "MEN - JEANS PRODUCTS" is visible




