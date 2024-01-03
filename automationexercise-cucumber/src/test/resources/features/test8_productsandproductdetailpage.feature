Feature: Products Details Verification

  Background:
    Given Launch browser
    Then verify that homepage is visible successfully

    Scenario: View product details
      When    User click on product button
      Then    user should navigate to"ALL PRODUCTS" is visible
      When    user clicks on view product of the first product
      Then    user should verify the products name,category,price,availability,condition,brand
      |Blue Top|
      |Category: Women > Tops|
      |Rs. 500               |
      |Availability: In Stock|
      |Condition: New        |
      |Brand: Polo           |

