package saysistemleri;

import java.util.Scanner;

public class SaySistemleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Onluq sistemdə bir ədəd daxil edin: ");
        int deyer = scanner.nextInt();

        String binary = Integer.toBinaryString(deyer);
        String octal = Integer.toOctalString(deyer);
        String hexadecimal = Integer.toHexString(deyer);

        System.out.println("\nNəticələr:");
        System.out.println("Binary (2-lik): " + binary);
        System.out.println("Octal (8-lik): " + octal);
        System.out.println("Hexadecimal (16-lıq): " + hexadecimal.toUpperCase());

        scanner.close();
    }
}
