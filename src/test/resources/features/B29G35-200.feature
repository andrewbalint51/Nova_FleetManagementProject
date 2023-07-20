@B29G35-240
Feature: As a user, I should be access to the Oroinc Documentation page.


  @B29G35-239
  Scenario Outline: Users access the Oronic Documentation page by clicking the question icon.
    Given the user logged in as "<userType>"
    When users clicks on question icon
    Then they access the Oronic Documentation page

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |