import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Bakery {

    private ArrayList<BakedGood> bgList;

    public Bakery() {
        bgList = new ArrayList<>();
    }

    // Adds baked goods to array list
    public void addBakedGoods() {
        //String name, double price, Date expDate, String[] dietRest, int quantity
        bgList.add(new BakedGood("BANANA BREAD", 5.0, new Date(), new String [] {"gluten","peanut","soy", "dairy"} , 60));
        bgList.add(new BakedGood("CINNAMON RAISIN BREAD", 7.50,new Date(), new String[] {"gluten","peanut"}, 50 ));
        bgList.add(new BakedGood("SOFT PIZZA CRUST", 5.50,new Date(), new String[] {"gluten","peanut","soy"}, 55 ));
        bgList.add(new BakedGood("CINNAMON BREAD", 8.50,new Date(), new String[] {"peanut","soy"}, 30 ));
        bgList.add(new BakedGood("SAVORY ROLLS", 3.0,new Date(), new String[] {"soy"}, 25 ));
        bgList.add(new BakedGood("SUGAR COOKIE", 6.40,new Date(), new String[] {"gluten"}, 70 ));
        bgList.add(new BakedGood("ZEBRA DONUT", 2.50,new Date(), new String[] {"gluten","peanut","soy"}, 35 ));
        bgList.add(new BakedGood("LARGE HAMBURGER BUNS", 4.25,new Date(), new String[] {"gluten","peanut","soy"}, 62 ));
        bgList.add(new BakedGood("BLUE CITRUS BAR", 3.50,new Date(), new String[] {"gluten","soy"}, 5 ));
        bgList.add(new BakedGood("HALLOWEEN COOKIE SET", 9.50,new Date(), new String[] {"gluten","peanut","soy"}, 55 ));
        bgList.add(new BakedGood("RED VELVET EASY CAKES", 6.50,new Date(), new String[] {"peanut","soy"}, 70 ));
        bgList.add(new BakedGood("VANILLA EASY CAKES", 1.30,new Date(), new String[] {"gluten","peanut","soy"}, 35 ));
        bgList.add(new BakedGood("TUXEDO EASY CAKES", 3.50,new Date(), new String[] {"soy"}, 60 ));
        bgList.add(new BakedGood("READY MADE FROSTING", 5.50,new Date(), new String[] {"dairy"}, 53 ));
        bgList.add(new BakedGood("GINGERBREAD HOUSE KIT", 2.50,new Date(), new String[] {"gluten","peanut","soy"}, 35 ));
    }

    // Finds all goods in the array list that don't contain the allergies of the user
    // Returns all baked goods if user inputs all
    public String findBakedGoods(String input) {
        String bakedGoods = "", canEat = "";
        // Prints out all bakery goods if user inputs "all"
        if (input.equalsIgnoreCase("all")) {
            for (BakedGood bg : bgList) {
                bakedGoods += bg.getName() + "\n";
            }
            return "\n" + bakedGoods;
        } else {
            // Split user input into array using a space
            String[] inputArray = input.split(" ");
            // Outer loops through the whole list
            for (int i = 0; i < bgList.size(); i++) {
                // Inner loops through the user input array
                for (int j = 0; j < inputArray.length; j++) {
                    // Looks through each BakedGood object and gets the dietary restrictions
                    // Checks to see if the BakedGood objects contain any of the users dietary restrictions
                    if (!Arrays.asList(bgList.get(i).getDietRest()).contains(inputArray[j])) {
                        bakedGoods += bgList.get(i).getName() + ",";
                    }
                }
            }
            // Split the list of baked goods using a comma
            String canEatArray [] = bakedGoods.split(",");
            // Transform array to array list
            List<String> temp = Arrays.asList(canEatArray);
            ArrayList<String> canEatList = new ArrayList<>(temp);
            Set<String> canEatSet = new LinkedHashSet<>();
            for (int x = 0; x < canEatArray.length; x++) {
                if (Collections.frequency(canEatList, canEatArray[x]) == inputArray.length) {
                    canEatSet.add(canEatArray[x]);
                }
            }
            for (String s : canEatSet) {
                canEat += s + "\n";
            }
            // Returns a sorry message if there are no available baked goods the user can eat
            if (canEat.equals("")) {
                return "\nSorry, there are no baked goods that you can eat.";
            }
            // Otherwise return the set of baked goods the user can eat
            return "\n" + canEat;
        }
    }

}