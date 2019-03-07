Feature: OpenWeatherMap
	Description: To test functionality basic of https://openweathermap.org/

Scenario: To verify presence of important labels 

	Given User navigates to "https://openweathermap.org/" 
	Then "Weather" weather label should be present 
	Then "Maps" map label should be present 
	Then "Price" price label should be present 
	Then "Station" station label should be present 
	Then User close the URL 
	
Scenario Outline: To verify when incorrect city is entered 

	Given User navigates to "https://openweathermap.org/" 
	When User enters invalid city "<City>" in search box 
	And click on Search button 
	Then Not found message should be displayed 
	Then User close the URL 
	
	Examples: 
		|City|
		|InvalidCity|
		
Scenario Outline: To verify when correct city is entered 

	Given User navigates to "https://openweathermap.org/" 
	When User enters valid city name "<City>" in search box 
	And click on Search button 
	Then Weather details should be displayed 
	Then User close the URL 
	
	Examples: 	
		|City|
		|Mumbai,IN|
		
Scenario: To verify user is not able to Sign In with invalid credentials 

	Given User navigates to "https://openweathermap.org/" 
	And User clicks on Sign In 
	When User enters invalid username as "Kasturi@gmail.com" 
	And User enters invalid password as "password" 
	Then User should not be able to login 
	Then User close the URL 
