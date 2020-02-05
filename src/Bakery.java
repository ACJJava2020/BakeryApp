import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Bakery {

    private ArrayList<BakedGood> bgList;

    public Bakery() {
        bgList = new ArrayList<>();
    }

    // Adds baked good to array list
    public void addBakedGoods() {
        //String name, double price, Date expDate, String[] dietRest, int quantity
        bgList.add(new BakedGood("BANANA BREAD", 5.0, new Date(), new String [] {"gluten","peanut","soy", "dairy"} , 60));
        bgList.add(new BakedGood("CINNAMON RAISIN BREAD", 7.50,new Date(), new String[] {"gluten","peanut"}, 50 ));
        bgList.add(new BakedGood("SOFT PIZZA CRUST", 5.50,new Date(), new String[] {"gluten","peanut","soy"}, 55 ) );
        bgList.add(new BakedGood("CINNAMON BREAD", 8.50,new Date(), new String[] {"peanut","soy"}, 30 ) );
        bgList.add(new BakedGood("SAVORY ROLLS", 3.0,new Date(), new String[] {"soy"}, 25 ) );
        bgList.add(new BakedGood("SUGAR COOKIE", 6.40,new Date(), new String[] {"gluten"}, 70 ) );
        bgList.add(new BakedGood("ZEBRA DONUT", 2.50,new Date(), new String[] {"gluten","peanut","soy"}, 35 ) );
        bgList.add(new BakedGood("LARGE HAMBURGER BUNS", 4.25,new Date(), new String[] {"gluten","peanut","soy"}, 62 ) );
        bgList.add(new BakedGood("BLUE CITRUS BAR", 3.50,new Date(), new String[] {"gluten","soy"}, 5 ) );
        bgList.add(new BakedGood("HALLOWEEN COOKIE SET", 9.50,new Date(), new String[] {"gluten","peanut","soy"}, 55 ) );
        bgList.add(new BakedGood("RED VELVET EASY CAKES", 6.50,new Date(), new String[] {"peanut","soy"}, 70 ) );
        bgList.add(new BakedGood("VANILLA EASY CAKES", 1.30,new Date(), new String[] {"gluten","peanut","soy"}, 35 ) );
        bgList.add(new BakedGood("TUXEDO EASY CAKES", 3.50,new Date(), new String[] {"soy"}, 60 ) );
        bgList.add(new BakedGood("READY MADE FROSTING", 5.50,new Date(), new String[] {"dairy"}, 53 ) );
        bgList.add(new BakedGood("GINGERBREAD HOUSE KIT", 2.50,new Date(), new String[] {"gluten","peanut","soy"}, 35 ) );
    }


    // Fins all goods in the array list that don't contain the allergies of the user
    public void findBakedGoods(String input) {

    // Finds all goods in the array list that don't contain the allergies of the user
    // Returns all baked goods if user inputs all
    public String findBakedGoods(String input) {
        String bakedGoods = "";

        if (input.equalsIgnoreCase("all")) {
            for (BakedGood bg : bgList) {
                bakedGoods += bg.getName() + "\n";
            }
        } else {
            String[] inputArray = input.split(" ");
            int smallerArray;

            for (int i = 0; i < bgList.size(); i++) {
                if (inputArray.length < bgList.get(i).getDietRest().length) {
                    smallerArray = inputArray.length;
                } else {
                    smallerArray = bgList.get(i).getDietRest().length;
                }
                for (int j = 0; j < smallerArray; j++) {
                    if (!Arrays.asList(bgList.get(i).getDietRest()).contains(inputArray[j])) {
                        bakedGoods += bgList.get(i).getName() + "\n";
                    }
                }
            }


        }

    }
}
