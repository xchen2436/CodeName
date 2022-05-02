# CodeName
CODENAME Application was made by Java Swing

1.Player click running button, the application will start at HomePage.
	# Player can start the game or Exit the application.
2.player click "Click to start game" button, it will display TeamPage, player can enter their username then click "Add" button.
	# Left side is red team, right side is blue team.
	# Default red team is the starting team.
	# Player can decide who is spymaster.
	# Minimum players requirment is 4.
	# Cannot one team has more than two more players than the other team.
3.User clicks "CONTINUE" button,everything will be set and the game will start
	# Player can change background color.
	# System will display which team's turn righ now.
	GAME FLOW:
		(1)Spymaster can click "Change To Spymaster" button to spymaster-page.
		(2)In spymaster-page, spymaster can see all the words with color. 
	  	(3)Spymaster can enter the clue and number of clue, then click "Submit Clue" button.
		(4)The operatives will see the clue from spymaster.
		(5)The operatives can click one button in the wordboard,then system will display result.
			*Correct agent => Current team can select one more word, then change turn.
			*Bystander/Incorrect agent => Change turn.
			*Assassin => Game over.
	# Repeat "GAME FLOW" until one team selects all their cards or one team selects the Assassin card.
	# System will display winner team and asks the player if they want to play the game again.
		*If YES, the game will reset, players can reselect their team/spymaster/username.
		*If NO, the game will close automatically.
