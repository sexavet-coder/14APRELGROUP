package factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Vehicle tipi daxil edin (car/bike): ");
        String type = sc.nextLine();

        Vehicle vehicle = VehicleFactory.createVehicle(type);

        if (vehicle != null) {

            vehicle.move();

        } 
        else {

            System.out.println("Yanlis vehicle tipi");

        }

        sc.close();
    }
}