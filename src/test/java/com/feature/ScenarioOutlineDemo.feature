Feature: Checking the login functionality of the adactin hotel application 

Scenario Outline: User checking the login page using valid username and password 
	Given User launch the application url 
	When User enter the valid "<username>" in the username field 
	And User enter the valid "<password>" in the password field 
	Then User clicks on the login button 
	And User can view the search hotel page
	Examples: 
		|username   | password    |
		|ramshkumr|ramesh2126|
		|ramesh   |   rs2126  |
		|rs   |  rs9799   |
		|sara |   rs212611  |
		|ramshkumr|ramesh2126|