package miras;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        double newPrice = price - (price * 0.15);
        System.out.println("Clothing discounted price: " + newPrice);
        return newPrice;
    }
}

