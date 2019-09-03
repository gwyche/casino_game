public class Casino {

    public static void main(String[] args) {

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
    }
}
