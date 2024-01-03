Feature:Submit a review for a product

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully
    When    User click on product button
    Then    user should navigate to"ALL PRODUCTS" is visible

  Scenario: Submitting  review for product

    When    user clicks on view product of the first product
    Then    Verify that "Write Your Review" text is visible
    When     User enter details and review
    |Maria|
    |ltester21@gmail.com|
    |Product quality is very good|
    And User submit review via submit button
    Then verify The Text"Thank you For Your Review"


