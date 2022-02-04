Feature: Login activity
	Scenario: input username and password
		Given go to the website
		When click sign in button
		And input username and password
		Then click login button