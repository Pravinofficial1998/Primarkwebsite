Feature: To test the login functionality

  Scenario: Check login is successful with valid credentials
    Given User is on the login page
    When User enters the username and password
    And Clicks on login button
    Then User is navigated to the home page
