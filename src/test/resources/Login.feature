Feature: Verify the facebook login page

  Background: 
    Given user is on facebook login page

  Scenario: Validate the facebook login functionality
    When user enters the invalid username and invalid password
    Then user clicks on the login button

  Scenario: Validating the forgotten password
    Then user clicks on the forgotten password link
    And user enters the mobile number or email address
    And user validates the forgotten password link

  Scenario: User creates a new facebook account
    When user clicks on the Create New Account
    Then user should enter all the valid credentials
    Then user clicks on the Signup button
