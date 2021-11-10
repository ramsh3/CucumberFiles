Feature: Checking the booking functionality of the adactin hotel application 

Scenario: User checking the login page using valid username and password 
	Given User launch the application url 
	When User enter the valid username in the username field 
	And User enter the valid password in the password field 
	Then User clicks on the login button
	
Scenario: In search hotel page user to fill as required field 
	Given User verify the current page title 
	When User select the location for corresponding location dropdown 
	And User select the hotel name for corresponding dropdown 
	And User select the room type for corresponding dropdown 
	And User select the no of rooms for corresponding dropdown 
	And User enter the check in date for corresponding field 
	And User enter the check out date for corresponding field 
	And User select the adults per room for corresponding dropdown 
	And User wish to select or not the children per room for coresponding dropdown 
	Then User completed all input fields then click the search button 
	
Scenario: User checking the hotel details and select the hotel 
	Given User verify the current select hotel page title 
	When User check the given input as correct then user select radio button 
	Then User clicks the continue button 
	
Scenario: User fill the requried fields to complete book a hotel 
	Given User verify the current book hotel page title 
	When User enter the first name in first name field 
	And User enter the last name in last name field 
	And User enter the address in billing address field 
	And User enter the dummy card number in credit card number field 
	And User select the card type in card type dropdown 
	And User select the month and year in expiry date dropdown 
	And User enter the ccv in ccv field 
	And User click the book button 
	Then User quit the browser 
	
	