Feature: Test cases page verification

  Scenario: Navigate to TestCase page
    Given Launch browser
    Then Verify that homepage is visible successfully
    When click on Testcase button
    Then verify that user is on test case page and text is"TEST CASES" visible