@Login
Feature: As user I want to be able to log in under different roles

  Background: Common Steps
    Given user is on the login page


  Scenario: Login as sales manager
    When users logs in
    Then user should see dash board page


  @parametrizedTest
  Scenario: Parametrized login
    Given user is on the login page
    When users log in as "driver"
    Then user should see dash board page

  @negativeLogin
  Scenario: Invalid Password
    Given user is on the login page
    When users log in as "storemanager85" username and "wrong" password
    Then user verifies that "Invalid user name or password." message is displayed.

