package saysistemi;

import java.util.Scanner;

public class NumberSystems2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Scanner yaradılır

        System.out.print("Binary ədəd daxil edin: ");
        String binaryInput = sc.nextLine();
        // Binary ədəd String kimi alınır

        int decimal = Integer.parseInt(binaryInput, 2);
        // parseInt → 2 radix istifadə edir
        // Binary → Decimal çevirir

        System.out.println("Decimal qarşılığı: " + decimal);
        // Decimal nəticəni çap edir

        sc.close();
        // Scanner bağlanır
    }
}
