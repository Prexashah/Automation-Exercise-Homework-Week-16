Feature:

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

  Scenario: Search, Add to Cart, Login, and Verify Products in Cart
    When    User click on product button
    Then    user should navigate to"ALL PRODUCTS" is visible
    When    user enter Product name"Jeans" in search input and click search button
    Then    verify "SEARCHED PRODUCTS" is visible
    And     Verify all the product related to search are visible
    And     User add all the product to the cart
    And     click on Cart button
    Then    Verify all the product related to search are visible
    And     User clicks on SignupLogin button
    When   User enter correct email address"ltester@gmail.com"
    And    User enter correct password"abcd123"
    And    Click on login button
    And    User click on cart button
    Then   verify All the Products are visible in the cart






