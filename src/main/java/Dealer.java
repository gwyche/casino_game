public class Dealer {

    //This static method within Dealer class asks the assigned player what
    //dice values they rolled and depending on what those values are
    //either awards victory, loss, or has the player re-roll for another round
    public static int reportLuck(Player player){

        //Instantiate a dice roll recording object (Hand)
        Hand hand = new Hand();

        //Assign the values of the Player's initial dice roll (dice are rolled when Player instantiates)
        //to the Hand instance
        hand.setD1(player.getDice1());
        hand.setD2(player.getDice2());

        //Declare and initialize an int that serves to tell the Casino whether the player won or lost the hand
        //-------------------
        //Initialize it at -2
        //0 means game keeps playing
        //-1 means lose
        //1 means win
        //-------------------
        int win_loss = -2;

        //The experienceChip signals whether this is the first round or not
        //Default is 0
        //1 means this is not the first hand
        int experienceChip = 0;

        //Begin judging hands
        do {
            //Print dice values
            System.out.println("Dice 1: "+hand.getD1());
            System.out.println("Dice 2: "+hand.getD2());

            if(win_loss == -2){
                experienceChip = 0;  //First round
            }else{
                experienceChip = 1;  //Not the first round
            }

            //Get results for the player's current hand
            win_loss = Rulebook.gameRules(hand, experienceChip);

            //Detect and report point condition initiation
            if(win_loss == 0 && experienceChip == 0){
                System.out.println("Point");
            }

            //Have the player roll a new pair of die and update their respective attributes in the Hand instance
            //just in case the game isn't over after checking the gameRules in the Rulebook
            player.newRoll();
            hand.setD1(player.getDice1());
            hand.setD2(player.getDice2());
        }
        while(win_loss == 0); //Keep playing until the player wins or loses

        //Return the result to the Casino
        return win_loss;
    }

}
