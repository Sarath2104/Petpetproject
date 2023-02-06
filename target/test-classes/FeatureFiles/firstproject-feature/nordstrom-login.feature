Feature: Need to vaidate the login funcitionlity of nordstrom
Scenario: Login with valid username and passward to access the page
Given User should launch the chrome and load the url
When User should click the signin button
When User should enter the vaild username and passward into textbox
And User should click the login botton
Then User should get into the home page
 
