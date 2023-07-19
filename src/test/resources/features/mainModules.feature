@B29G35-221
Feature: As a user, I should be accessing all the main modules of hte app

  Background: User is already in the log in page
    Given the user is on the login page

  @B29G35-228
  Scenario: Verify that driver should see view 4 models name
    When user logged in as "driver"
    Then user should be able to see following modules
		#Expected module names:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  @B29G35-216
  Scenario: Verify that store manager should see 8 module names
   When user logged in as "store manager"
    Then user should be able to see following modules
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
    When user logged in as "sales manager"
    Then user should be able to see following modules

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


