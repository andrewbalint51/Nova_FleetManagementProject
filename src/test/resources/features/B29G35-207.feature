@B29G35-207
Feature: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

  @B29G35-244
  Scenario Outline: users see error messages for entering invalid integers.
    Given User is logged in using "<validUsername>" and a "<validPassword>"
    When User navigates to "Activities" and clicks "Calendar Events"
    And Clicks the "Create Calendar Event" button
    And Checks the "Repeat" checkbox
    When User enters "<number>"
    Then "<errorMessage>" is displayed

    Examples:
      | validUsername   | validPassword | number | errorMessage                           |
      | user1           | UserUser123   | 100    | The value have not to be more than 99. |
      | salesmanager101 | UserUser123   | 0      | The value have not to be less than 1.  |
      | storemanager85  | UserUser123   | -1     | The value have not to be less than 1.  |




