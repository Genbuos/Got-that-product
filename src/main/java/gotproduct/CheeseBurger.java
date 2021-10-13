package gotproduct;

public class CheeseBurger extends Food{
    public CheeseBurger(String name, double price) {
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

    @Override
    public boolean isEdible() {
        return true;
    }
}
