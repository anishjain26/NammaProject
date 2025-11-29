Feature: To verify Search Functionality
@Smoke
Scenario:To verify search functionality by entering products name
 Given User should be Logged in to account
 When User logsin to account   
 When  User should search the product  
 And User should click on the login button  
 Then Product page appears in the screen
 
