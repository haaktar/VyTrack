Feature: As user, I want to be able to create new cars

  @addCar
  Scenario: 1. Add Some Cars
    Given user is on the login page
    And users log in as "store manager"
    And users navigates to "Fleet" and "Vehicles"
    And users click on crat car button
    When users add new vehicle infomation

      | Licence Plate | SDET |
      | Model Year    | 2021 |
