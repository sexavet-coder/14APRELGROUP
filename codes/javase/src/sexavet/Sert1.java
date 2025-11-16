package sexavet;

import java.util.Scanner;

public class Sert1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Yaşınızı daxil edin: ");
			int age = input.nextInt();

			if (age >= 18) {
			    System.out.println("Yetişkinsən");
			} else {
			    System.out.println("Uşaqsan");
			}
		}
    }
}
