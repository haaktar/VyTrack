Feature: As user I want to be able to log in under different roles

  Scenario: Login as sales manager
    Given user is on the login page
    When users logs in
    Then user should see dash board page


  @parametrizedTest
  Scenario: Parametrized login
    Given user is on the login page
    When users log in as "driver"
    Then user should see dash board page
