package lessontask;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Tesla");
        System.out.println("Car1 hashCode: " + car1.hashCode());
        try {
            Car car2 = (Car) car1.clone();
            System.out.println("Car2 hashCode: " + car2.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

