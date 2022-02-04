Feature: Edit code activity
	Scenario: edit code
		When click button add plus2
		And input description new
		And input filename new
		And input code new
		And click create secret gist2
		And click button edit
		And edit description
		Then update secret gist