package miras;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateDiscount() {
        double newPrice = price - (price * 0.10);
        System.out.println("Product discounted price: " + newPrice);
        return newPrice;
    }
}
