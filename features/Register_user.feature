Feature: Allow user to register on the site
  As a user of the registration page of the demo website, when I provide valid unique credentials
  An account is created for me

  @register
  Scenario: valid credentials
    Given I register a new account
     When I provide an unique email with all mandatory fields
      And I submit the form
     Then a new account created

  @register
  Scenario: Invalid credentials
  Given I register a new account
   When I provide an email that has already been used in the system
    And I submit the form
   Then I see an appropriate error message

  @login
  Scenario: Log into my account
    Given I am login from the home page
    When I login with valid credential
    Then I am logged in with my new account
