public class Documentation {

    public static void docs(){
        //Documentation
        System.out.println("");
        System.out.println("The Casino class instantiates a player who immediately rolls 2 dice and holds those values internally. " +
                "The Casino calls the static method in the Dealer class with the player as an argument. " +
                "That method, reportLuck, extracts the dice values stored in the player and transfers them to an intance of a Hand class. " +
                "reportLuck contains an attribute designating the state of the game (whether the player has played before), 0 meaning this is the first round and 1 meaning they have played before.");
        System.out.println("");
        System.out.println("This value initializes at 0 and is passed, along with the Hand instance, into a static method within the Rulebook class, gameRules. " +
                "gameRules takes the hand and game state passed into it and determines whether the player wins, loses, or has point based upon that round. " +
                "Each of those conditions is assigned a different possible int value that is returned to the Dealer class. " +
                "The Dealer class' static method, reportLuck, receives the output of gameRules, and knows to either send a similar int signal to the Casino class to inform it that the game is over and whether the player has won or not, or to repeat the game by way of a do-while loop. ");
        System.out.println("");
        System.out.println("Before the loop resumes, a method within the Player class, newRoll, is called by reportLuck, replacing the Player's stored private ints with new random ints. When a completion signal is finally sent to the Casino class, the Casino class prints it on the command line and asks if the player wants to play again. " +
                "A do-while loop surrounds most of the code in this method and it breaks when a String attribute of Casino is either set to y, Y, n, or N. " +
                "Inside the loop, after the Casino asks the user whether they want to play again, a utility method is called that handles command line inputing and input validation. " +
                "Twelve JUnit tests were performed that confirm the successful operation of the game's core functionality.");
    }

}
