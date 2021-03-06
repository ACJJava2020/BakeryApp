import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        Bakery bakery = new Bakery();

        System.out.println("Welcome to the ACJ Better Bakery App!" +
                "\nOur products contain: [peanut, gluten, soy, dairy] ");
        System.out.println();
        System.out.print("To search for foods that you can eat, please enter the name of the dietary restriction:" +
                "\nEnter a space between each dietary restriction.\nTo see a list of all our foods, please type \"all\". ");
        String search = in.nextLine();

        bakery.addBakedGoods();
        System.out.println(bakery.findBakedGoods(search));

        in.close();
    }

}