package gotproduct;

public abstract class Drink extends Product implements Consumable{

    public Drink(String name, double price) {
        super(name, price);
    }
}
