package gotproduct;

import java.util.ArrayList;

public class TestingMyCodeFoo {
    public static void main(String[] args) {
        Product coke = new CocaCola("Coke Zero", 30.0);
        Product burger = new CheeseBurger("Mc Double", 10.00);
        Product batteries = new Batteries("Duracell", 20.00);
        Product car = new Car("Tesla", 80000.00);


        ArrayList<Product> consumables = new ArrayList<>();
        consumables.add(coke);
        consumables.add(burger);
        consumables.add(batteries);



        Product.printConsumptionQty(consumables);
        Product.printOrder(consumables);

        ExpirationDate expirationDate = new ExpirationDate("October", "25", "3005");
        batteries.setExpirationDate(expirationDate);

        batteries.printExpirationDate(batteries);




    }
}