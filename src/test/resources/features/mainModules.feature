@B29G35-221
Feature: Default


  @B29G35-216
  Scenario: Verify that store manager should see 8 module names
    Given the user logged in as "store manager"
   # When User enters valid credentials
   # And User clicks Login button
    Then Verify the users see module names
		#Expected module names:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @B29G35-217
  Scenario: Verify that sales manager should see 8 module names
    Given the user logged in as "sales manager"
    # When User enters valid credentials
   # And User clicks Login button
    Then Verify the users see module names
		#Expected module names:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @B29G35-228
  Scenario: Verify that driver should see view 4 models name
    Given the user logged in as "driver"
   # When User enters valid credentials
    # And User clicks Login button
    Then user should see main module names
		#Expected module names:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |