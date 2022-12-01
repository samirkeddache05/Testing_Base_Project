@wip
Feature: Registration of Book Time
  User Story: As user, I want to register a book time with the sale representative

  Scenario: User should book time with the sale representative
    Given user is in the schedule a demo page
    When user enter all the required fields
    And user click on submit and pick up time
    Then user should see "Thank you for your interest in Zego™!"

  Scenario: User leave empty fields
    Given user is in the schedule a demo page
    When user leave all the fields empty
    And user click on submit and pick up time
    Then user should see "This field is required." error

  Scenario: User should subscribe for newsletter
    Given user is in the schedule a demo page
    When user enter the email
    And user click on subscribe button
    Then user should see "Thank You for Subscribing to The Elevator!" success


