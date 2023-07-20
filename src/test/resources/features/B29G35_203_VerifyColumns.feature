@B29G35-227
Feature: As a user, I want to view columns on the Vehicle models page.

	
	@B29G35-226
	Scenario: Drivers should not able to access the Vehicle Model page, users should see “You do not have permission to perform this action.” 
		Given the user logged in as "Driver"
		And user clicked on the Vehicle Models page
		Then the user should see “You do not have permission to perform this action.”	

	
	@B29G35-224 @wip-AndrewB
	Scenario: The store manager should see 10 columns on the Vehicle Model page.
		Given the user logged in as "Store Manager"
		And user clicked on the Vehicle Models page
		Then the user should see 10 columns on the Vehicle Models page

	
	@B29G35-225 @wip-AndrewB
	Scenario: The sales manager should see 10 columns on the Vehicle Model page.
		Given the user logged in as "Sales Manager"
		And user clicked on the Vehicle Models page
		Then the user should see 10 columns on the Vehicle Models page