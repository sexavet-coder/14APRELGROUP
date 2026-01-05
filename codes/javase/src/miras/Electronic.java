package miras;

public class Electronic extends Product {

    public Electronic(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        double newPrice = price - (price * 0.20);
        System.out.println("Electronic discounted price: " + newPrice);
        return newPrice;
    }
}
