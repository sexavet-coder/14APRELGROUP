package sexavet;

class Computer {
    Integer id;
    String brand;
    String model;
    String color;

    Computer() {
        System.out.println("Default constructor çağırıldı");
    }

    Computer(String model) {
        System.out.println("Model constructor çağırıldı: " + model);
        this.model = model;
    }

    Computer(String model, String color) {
        System.out.println("Model və rəng constructor çağırıldı: " + model + ", " + color);
        this.model = model;
        this.color = color;
    }
}

public class ClassAndObjectAndConstructors {
    public static void main(String[] args) {

        Computer c1 = new Computer();

        Computer c2 = new Computer("Acer Aspire 7");

        Computer c3 = new Computer("Asus TUF", "Black");

        System.out.println("\nComputer 1 -> model: " + c1.model + ", color: " + c1.color);
        System.out.println("Computer 2 -> model: " + c2.model + ", color: " + c2.color);
        System.out.println("Computer 3 -> model: " + c3.model + ", color: " + c3.color);
    }
}