import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Welcome to the Brookley's Better Bakery App!" +
                "\nOur products contain: [peanuts, gluten, soy, dairy] ");
        System.out.println();
        System.out.print("To search for foods that you can eat, please enter the name of the diet restriction:" +
                "\nTo see a list of all our foods, please type \"all\". ");
        String search = in.nextLine();

    }
}
