public class Casino {

    public static void main(String[] args) {


        String letsPlay = "";

        do {

            //Declare Player as a participant in the game
            Player P = new Player();

            //Casino calls the dealer and waits for their final report about the player's performance
            int outcome = Dealer.reportLuck(P);

            //Non-null initial string value
            String result = "";

            //Reporting if statements
            if (outcome == 1) {
                result = "WIN";
            } else {
                result = "LOSE";
            }

            //Player's results are printed
            System.out.println(result);

            //Game invites player to play another game
            System.out.println("Would you like to play again? Press Y or N.");

            //A factory method receives the user's response and verifies the input is valid
            letsPlay = VerifyInput.ConfirmY_N();

        }while(letsPlay.equalsIgnoreCase("y"));

        System.out.println("Thanks For Playing!");
    }
}
