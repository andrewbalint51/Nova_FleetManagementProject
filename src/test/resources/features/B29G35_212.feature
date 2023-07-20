@B29G35-215

Feature: Filters on the Marketing page.
	#User Story 14: As a user, I want to manage filters on the Marketing page.

	#AC#1: Store and sales managers should se all 5 filters options are checked by default.


	@B29G35-213
	Scenario Outline: US14AC01TC01_Verify filters on Marketing Page
		Given the user logged in as "<UserType>"
		Given Users are on the homepage
		When User click the Campaigns under the Marketing
		When User click the filters button
		And User click the Manage filters button
		Then User verify five options are checked by default
	Examples:
		|UserType|
		|sales manager|
		|store manager|


	#AC#2: any amount of boxes should be unchecked.(can check only 1, or multiple)
	@B29G35-214
	Scenario Outline: US14AC01TC01_Verify Manage Filters on the Marketing Page
		Given the user logged in as "<UserType>"
		Given Users are on the homepage
		When User click the Campaigns under the Marketing
		When User click the filters button
		And User click the Manage filters button
		And User uncheck one or more filter options
		Then User verify one or more options are unchecked
	Examples:
			|UserType|
			|sales manager|
			|store manager|



