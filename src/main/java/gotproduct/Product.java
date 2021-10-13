package gotproduct;

import java.util.ArrayList;

public abstract class Product implements Consumable {
    private String name;
    private double price;
    protected ExpirationDate expirationDate;
    public final double DISCOUNT_RATE = 0.10;


    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void printExpirationDate(Product daProduct){
        System.out.println("=========ExporationDate============");
        System.out.println(daProduct.getName()+ " Expires on : " + daProduct.getExpirationDate());
    }


    public  String printIngredients(String[] ingredients){
        return ingredients.toString();

    }

    public abstract double calculateDiscount(Product product );

    public static void printOrder(ArrayList<Product> idek){
        System.out.println("========PrintOrder===============");
        double total = 0;
        for(Product products : idek){
            System.out.println(products.getName() + " will cost you " + products.getPrice());
            total += products.getPrice();


        }
        System.out.println("Your total is will be " + total);


    }
    public static void printConsumptionQty(ArrayList<Product> consumables){
        System.out.println("=============ConsumptionQty============");
        for(Consumable consumable : consumables ){
            System.out.println(consumable.consume());
        }


    }


}
