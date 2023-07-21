@B29G35-230
Feature: Verify  users should able to manage filters on the Vehicle Costs page.

	#{color:#de350b}*AC #1:* ** {color}Users should see 3 columns on the Vehicle Model page.
	#
	# __ Expected Column names: ** TYPE, TOTAL PRICE, DATE
  @B29G35-222

  Scenario Outline: Users should see 3 columns on the Vehicle Model page.
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
      | driver        |

	#{color:#de350b}*User Story* :  {color}As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox) 
	#
	#{color:#de350b}*AC #2:*   {color:#172b4d}U{color}{color}sers check the first checkbox to check all the Vehicle Costs  
  @B29G35-223

  Scenario Outline: Users checks first checkbox to check all the Vehicle Costs
    Given the user logged in as "<UserType>"
    When User goes to the Vehicle Costs option
    And Checks the first checkbox
    Then Users should verify that all the Vehicle costs are checked

    Examples:

      | UserType      |
      | sales manager |
      | store manager |