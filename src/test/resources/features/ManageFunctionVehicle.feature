
Feature: As a user, I want to manage filters on the Vehicle Costs page.

  @NC
  Scenario Outline: Verify  users should able to manage filters on the Vehicle Costs page.
    Given the user logged in as "<UserType>"
    When User goes to the Vehicle Costs option
    Then User should see three columns on the Vehicle Costs page
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Examples:
      | UserType      |
      | sales manager |
      | store manager |
     # | driver        |


  Scenario Outline: Users checks first checkbox to check all the Vehicle Costs
    Given the user logged in as "<UserType>"
    When User goes to the Vehicle Costs option
    And Checks the first checkbox
    Then Users should verify that all the Vehicle costs are checked
    Examples:

      | UserType      |
      | sales manager |
      | store manager |
      | driver        |