package interfaceHomeWork;

public class Main {
    public static void main(String[] args) {
        // obyekt yaradib konsola cap edirik
        Toy toy1 = new Toy("Maşın", 10);
        System.out.println(toy1); // toString metodunu avtomatik cagirir

        // muqaise ucun yeni obyetkler yaradiriq
        Toy toy2 = new Toy("Gəmi", 20);
        Toy toy3 = new Toy("Gəmi", 20);

        // Müqayisenin aparilmasini edirik
        System.out.println("toy2 və toy3 eynidirmi? " + toy2.equals(toy3));
    }
}
