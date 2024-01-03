Feature: Scroll upward verification

  Background:
    Given Launch browser
    Then  Verify that homepage is visible successfully


  Scenario:Verify Scroll Upward Functionality
    When    User scroll down to footer
    Then    User should verify the text "SUBSCRIPTION"
    And    User click on arrow at bottom right and move upward
    Then   verify that"Full-Fledged practice website for Automation Engineers" is visible