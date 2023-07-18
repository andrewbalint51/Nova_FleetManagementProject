@B29G35-215
Feature: Filters on the Marketing page.

	#User Story 14: As a user, I want to manage filters on the Marketing page.
	#
	# 
	#
	#AC#2: any amount of boxes should be unchecked.(can check only 1, or multiple)
	@B29G35-214
	Scenario: US14AC01TC01_Verify Manage Filters on the Marketing Page
		Given Users are on the homepage
		When User click the Campaigns under the Marketing
		And User click the Manager filters button
		And User uncheck one or more filter options
		Then User verify one or more options are unchecked	

	#User Story 14: As a user, I want to manage filters on the Marketing page.
	#
	#AC#1: Store and sales managers should se all 5 filters options are checked by default.
	#
	# 
	@B29G35-213
	Scenario: US14AC01TC01_Verify filters on Marketing Page
		Given Users are on the homepage
		When User click the Campaigns under the Marketing
		And User click the Manage filters button
		Then User verify 5 options are checked by default