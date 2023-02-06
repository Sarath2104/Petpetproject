Feature: Validate the login functionality of facebook
Background:
Given User should launch the chrome and load url


@Sanity
Scenario: Validate the login functionality with Invaild username and Invalid password
When User should input the inavild uername and password in textbox
#without header --1D

|Rohit|Rohit@12|Ajay|Ajay@12|Sarath|Sarath@12|

And User should check the login button
And To print the title
Then User should navigate to invaild credential page


Scenario: Validate the login functionality with Vaild username and Invalid password
When User should input the valid uername and invaild password in textbox
#without header--2D List

|Ashwin|Ashwin@12|Kohli|Kolhi@12|Kumar|Kumar@12|
|Mohan|Mohan@12|Siva|Siva@12|Manoj|Manoj@12|
|karhi|Karthi@12|Vel|Vel@12|Inba|Inba@12|

And User should check the login button
And To print the title
Then User should navigate to invaild credential page


Scenario: Validate the login functionality with Invaild username and Vaild password
When User should input the invaild uername and vaild password in textbox
#with head--1D Map
|Person|Type|
|Color|Clear|
|Way|North|
|Day|Today|
|Time|Morning|
And User should check the login button
And To print the title
Then User should navigate to invaild credential page


Scenario: Validate the login functionality with Valid username and Vaild password
When User should input the vaild uername and vaild password in textbox
#with head--2D
|Sports|Person|State|Film|Language|name|
|Mkart|Rohit@12|TejRavi|Kolhi@12|Velkar|Kumar@12|
|willdo|willdo@12|singaram|singaram@12|Bala|Bala@12|
|loga|loga@12|Kohli|Mkarth@12|Kumar|Kumar@12|


And User should check the login button
And To print the title
Then User should check the succesful login page

					