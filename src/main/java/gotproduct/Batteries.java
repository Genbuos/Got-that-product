package gotproduct;

public class Batteries extends Product implements Consumable {
    public Batteries(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount(Product product) {
        return 0;
    }

    @Override
    public int consume() {
        return 0;
    }
}
