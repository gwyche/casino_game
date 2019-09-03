public class Rulebook {

    public static int gameRules(Hand hand, int experienceChip){

        //0 is a neutral state and signals you will keep playing
        //1 signifies you have won
        //-1 signifies you have lost
        //-2 is the starting condition
        int fate = -2;
        int sum = hand.getD1() + hand.getD2();

        //First roll
        if(experienceChip == 0) {

            if (sum == 7 || sum == 11) {
                fate= 1;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                fate = -1;
            } else {
                fate = 0;
            }
        }

        //Not first roll
        if(experienceChip == 1){
            if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
                fate = 1;
            }
        }else if(sum == 7){
            fate = -1;
        }else{
            fate = 0;
        }

        //If fate = 0 is returned, the Dealer can automatically deduce that a round has been played
        //They will take that knowledge and give the player an experienceChip value of 1 for the next round
        return fate;
    }
}
