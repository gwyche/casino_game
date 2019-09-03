import java.util.Scanner;

public class VerifyInput {

    public static String ConfirmY_N(){

        //Instantiate a Scanner
        Scanner scanner = new Scanner(System.in);

        //This variable will be passed a value from the command line using Scanner
        String unfilteredinput = scanner.nextLine();

        //Loop won't let user move on until they enter either an upper or lowercase Y or N
        while(!(unfilteredinput.equalsIgnoreCase("y")) && !(unfilteredinput.equalsIgnoreCase("n"))){
            System.out.println("Please enter a valid input");
            unfilteredinput = scanner.nextLine();
        }

        return unfilteredinput;
    }

}
