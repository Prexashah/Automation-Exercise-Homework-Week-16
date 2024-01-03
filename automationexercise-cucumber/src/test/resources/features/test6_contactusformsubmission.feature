Feature: Contact us form submission
  As a user I want to fill the contact us form and check the functionality.

  Scenario: User submit contact us form
    Given Launch browser
    Then  Verify that homepage is visible successfully
    When  User click on contact us button
    Then  verify that "GET IN TOUCH" text is visible
    When  user enters name,email,subject and message
      | Maria                                         |
      | ltester@gmail.com                             |
      | Delivery Option                               |
      | please deliver my order via next day delivery |
    And User upload a file from "C:\Users\prexa\Desktop\xyzfile.txt"
    And User clicks on submit button
    And User should see alert and click on ok button
    Then verify the message"Success! Your details have been submitted successfully."
    And click on home button
    Then Verify that user is on the homepage

