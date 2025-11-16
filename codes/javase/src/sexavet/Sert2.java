package sexavet;

import java.util.Scanner;

public class Sert2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Birinci ədədi daxil edin: ");
			int num1 = input.nextInt();

			System.out.print("İkinci ədədi daxil edin: ");
			int num2 = input.nextInt();

			if (num1 > num2) {
			    System.out.println("Birinci ədəd böyükdür");
			} else if (num1 == num2) {
			    System.out.println("İki ədəd bərabərdir");
			} else {
			    System.out.println("İkinci ədəd böyükdür");
			}
		}
    }
}