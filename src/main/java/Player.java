public class Player {

    //Attributes
    private int dice1;
    private int dice2;


    //No-Arg Constructor
    public Player() {

        //Assign random ints to 2 private variables
        this.dice1 = ((int) (Math.random() * 6) + 1);
        this.dice2 = ((int) (Math.random() * 6) + 1);
    }

    //Getters
    public int getDice1() { return dice1; }

    public int getDice2() { return dice2; }

    //Setters  TESTING USE ONLY
    public void setDice1(int input){ this.dice1 = input; }

    public void setDice2(int input){ this.dice2 = input; }

    //Sets attributes to new random numbers
    public void newRoll(){
        this.dice1 = ((int) (Math.random() * 6) + 1);
        this.dice2 = ((int) (Math.random() * 6) + 1);
    }
}
