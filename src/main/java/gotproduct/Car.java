package gotproduct;

public class Car extends Product{

    public Car(String name, double price) {
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
