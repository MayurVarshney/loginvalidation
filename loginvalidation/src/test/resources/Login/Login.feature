Feature: Login application validation

Background: 
Given User should be on login page

Scenario Outline: to test login with valid credentials

    When user enters valid username "<name>"
    And User enters valid password "<pwd>"
    And User clicks on button submit
    Then User should see username as "<loginName>"
        
  Examples:
  
  |name |pwd     |loginName|
  |Admin|admin123|Welcome  |
  |Admin|admin123|Welcome  |
  
 Scenario: to test login with valid credentials
 
  When user enters invalid username "Mayur"
  And User enters invalid password "Mayur"
  And User clicks on button submit
  Then User should see message "Invalid credentials"
 
  

 