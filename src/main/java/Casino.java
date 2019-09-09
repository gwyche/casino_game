public class Casino {

    public static void main(String[] args) {

        //Call method that prints greeting text
        System.out.println("");
        Greetings.greet();

        System.out.println("Shall we play? Y or N.");

        //Static method that handles command line input and validates the input before passing it to the calling method
        String begin = VerifyInput.ConfirmY_N();
        System.out.println("");

        //If the user enters Y, a game commences
        if(begin.equalsIgnoreCase("Y")) {

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
                    result = "Sweet. WIN";
                } else {
                    result = "Oh, too bad. LOSE";
                }

                //Player's results are printed
                System.out.println(result);

                //Game invites player to play another game
                System.out.println("");
                System.out.println("Would you like to play again? Press Y or N.");

                //A static method receives the user's response and verifies the input is valid
                letsPlay = VerifyInput.ConfirmY_N();
                System.out.println("");

            } while (letsPlay.equalsIgnoreCase("y"));

            System.out.println("Thanks For Playing!");
        }else{
            System.out.println("Maybe another time.");
        }

        //Prompt offers to display the Documentation
        System.out.println("Would you like to read the Documentation for this game? Y or N");

        //A static method receives the user's response and verifies the input is valid
        String explanation = VerifyInput.ConfirmY_N();

        //Call method that prints Documentation
        if(explanation.equalsIgnoreCase("Y")){
            Documentation.docs();
        }else{
            System.out.println("");
            System.out.println("No problem! Maybe next time.");
        }

    }
}
