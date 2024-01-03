Feature: Verify Subscription in homepage

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully

  Scenario: Verify Subscription functionality on home page
    When    User scroll down to footer
    Then    User should verify the text "SUBSCRIPTION"
    When    User enters email "ltester@gmail.com"
    Then    user should see the text "You have been successfully subscribed!"
