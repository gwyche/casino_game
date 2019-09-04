# CASINO GAME

Download the [JAR file](https://github.com/gwyche/casino_game/blob/master/out/artifacts/DiceGameV1_jar2/DiceGameV1.jar)

This is a Java implementation of the game [Craps](https://en.wikipedia.org/wiki/Craps).

This game has simple rules. 

A player rolls a pair of dice. 

The first roll, if the player rolls a 7 or an 11, they win the game.

If they roll a 2, 3, or 12, on the other hand, they lose the game.

If the player doesn't roll any of those values, the player now has what's known as Point and the game continues.

If the player has Point, they have to keep rolling until they get either a 7, in which case they lose the game, or a 4, 5, 6, 8, 9, or 10, in which case they win the game.

### Design

#### Components:

Casino class with a main method

Player class with a no-arg constructor (Constructor generates 2 random ints (1-6) and assigns them to private attributes).

Hand class with no-arg constructor (Capable of storing 2 private ints).

Dealer class with a factory method (Calls the Rulebook class and interprets its response. Detects when player has played before).

Rulebook class with a factory method (Contains main logic for single-round player win-lose-point decision).

### Operation

1) The Casino class instantiates a player who immediately rolls 2 dice and holds those values internally.

2) The Casino calls the factory method in the Dealer class with the player as an argument.

3) That method, reportLuck, extracts the dice values stored in the player and transfers them to an intance of a Hand class.

4) reportLuck contains an attribute designating the state of the game (whether the player has played before), 0 meaning this is the first round and 1 meaning they have played before. This value initializes at 0 and is passed, along with the Hand instance, into a factory method within the Rulebook class, gameRules.

5) gameRules takes the hand and game state passed into it and determines whether the player wins, loses, or has point based upon that round. Each of those conditions is assigned a different possible int value that is returned to the Dealer class. The Dealer class' factory method, reportLuck, recieves the output of gameRules, and knows to either send a similar int signal to the Casino class to inform it that the game is over and whether the player has won or not, or to repeat the game by way of a do-while loop. Before the loop resumes, a method within the Player class, newRoll, is called by reportLuck, replacing the Player's stored private ints with new random ints.

6) When a completion signal is finally sent to the Casino class, the Casino class prints it on the command line and asks if the player wants to play again. A do-while loop surrounds most of the code in this method and it breaks when a String attribute of Casino is either set to y, Y, n, or N. Inside the loop, after the Casino asks the user whether they want to play again, a utility method is called that handles command line inputing and input validation.

### Testing

Twelve JUnit tests were performed that confirm the successful operation of the game's core functionality.

