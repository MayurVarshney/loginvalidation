Feature: Login application validation

Scenario: to test login with valid credentials


    
    Given User should be on login page
    When user enters valid username  "Admin"
    And User enters valid password "admin123"
    And User clicks on button submit
    Then User should see username as "Welcome Paul"

 