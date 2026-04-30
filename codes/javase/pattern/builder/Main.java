package builder;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car.CarBuilder()
                        .setBrand("Mercedes")
                        .setModel("S-Class")
                        .setYear(2024)
                        .setColor("Qara")
                        .build();

        System.out.println(myCar.toString());

        Car simpleCar = new Car.CarBuilder()
                            .setBrand("BMW")
                            .setYear(2023)
                            .build();
        
        System.out.println(simpleCar);
    }
}
