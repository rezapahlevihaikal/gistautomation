Feature: Create gist activity
	Scenario: input code
		When click button add plus
		And input gist description
		And input filename
		And input code
		Then click create secret gist