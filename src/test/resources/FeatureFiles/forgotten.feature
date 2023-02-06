@Regression
Feature: Validate the forgotten password functionality of facebook
Scenario: Validate the forgotten password functionality with invaild phone number
When User should click the forgotten password functionality
And User should enter the invaild mobile number in textbox
And User should click the search button
And To print the title
Then User should navigate to reset password page