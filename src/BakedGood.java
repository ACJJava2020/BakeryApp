import java.util.ArrayList;
import java.util.Date;

public class BakedGood {
    private String name;
    private double price;
    private Date expDate;
    private String[] dietRest;
    private int quantity;

    private ArrayList<String> allergies;

    public BakedGood() {

    }
    public BakedGood(String name, double price, Date expDate, String[] dietRest, int quantity){
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.dietRest = dietRest;
        this.quantity = quantity;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public Date getExpDate(){
        return this.expDate;
    }
    public void setExpDate(Date expDate){
        this.expDate = expDate;
    }
    public String[] getDietRest(){
        return this.dietRest;
    }
    public void setDietRest(String[] dietRest){
        this.dietRest = dietRest;
    }
}

