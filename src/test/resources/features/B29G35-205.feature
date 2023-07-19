@B29G35-234
@Andrey
Feature:As a user, I should be able to select any vehicle from the Vehicle page(web table)

  @B29G35-233 @B29G35-235
  Scenario Outline:
  AC #1: once the users launch on the Vehicle page, all the checkboxes should be unchecked.

    Given the user logged in as "<userType>"
    When user go to vehicles
    Then All checkboxes is visible enabled and unchecked

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  @B29G35-232 @B29G35-235
  Scenario Outline:
  AC #2: user checks the first checkbox to check all the cars

    Given the user logged in as "<userType>"
    When user go to vehicles
    And User check the parent checkbox
    Then All visible checkboxes is checked

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  @B29G35-231 @B29G35-235
  Scenario Outline:
  AC #3: users can select any car

    Given the user logged in as "<userType>"
    When user go to vehicles
    Then User check and verify all checkbox


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

