@B29G35-220
Feature: As a user, I want to learn how to use the pinbar.


  @B29G35-218
  Scenario Outline: US03AC01TC01_Click and verify "Learn how to use this space" tab
    Given the user logged in as "<userType>"
    When Users click the Learn how to use this space message
    Then Users verify first message on the page
    Then Users verify second message on the page

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


  @B29G35-219
  Scenario Outline: US03AC02TC02_Verify image on pinbar page
    Given the user logged in as "<userType>"
    When Users click the Learn how to use this space message
    Then Users verify an image

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |