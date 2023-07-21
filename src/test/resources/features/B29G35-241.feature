Feature: Default

	
	@B29G35-241
	Scenario Outline: Users should see the 8 filter items on the Accounts page
		Given the user is logged in as "<userType>"
		    When user selects the Accounts page under Customers dropdown
		    Then verify that there are 8 filter options
		
		    Examples:
		      | userType      |
		      | sales manager |
		      | store manager |