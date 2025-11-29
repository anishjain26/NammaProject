Feature: To verify Login Functionality
@Smoke
Scenario: To verify Login Functionality By entering valid credentials
Given User launches the browser and Application  
When User enters validd emailid
And User enter Password  
And User clicks on login button 
Then user will be redirected to homepage

