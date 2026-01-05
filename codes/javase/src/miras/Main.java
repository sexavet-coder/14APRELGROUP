package miras;

public class Main {
    public static void main(String[] args) {

        Product p = new Product("Generic Item", 100);
        p.calculateDiscount();

        Electronic e = new Electronic("Laptop", 2000);
        e.calculateDiscount();

        Clothing c = new Clothing("T-Shirt", 50);
        c.calculateDiscount();
    }
}

