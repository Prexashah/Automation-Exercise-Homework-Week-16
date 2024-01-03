Feature: verify Subscription Process
  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully
Scenario: verify Subscription functionality on Cartpage
  When    User click on cart button
  And     User scroll down to footer
  Then    User should verify the text "SUBSCRIPTION"
  When    User enters email "ltester@gmail.com"
  Then    user should see the text "You have been successfully subscribed!"
