package sexavet;

import java.util.Scanner;

public class StoreProducts {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Məhsul seçin:");
			System.out.println("1. Alma - 1.5 AZN");
			System.out.println("2. Portağal - 2.0 AZN");
			System.out.println("3. Banan - 1.8 AZN");
			System.out.println("4. Üzüm - 3.0 AZN");

			System.out.print("Seçiminizi daxil edin (1-4): ");
			int choice = input.nextInt();

			switch(choice) {
			    case 1: System.out.println("Alma - 1.5 AZN"); break;
			    case 2: System.out.println("Portağal - 2.0 AZN"); break;
			    case 3: System.out.println("Banan - 1.8 AZN"); break;
			    case 4: System.out.println("Üzüm - 3.0 AZN"); break;
			    default: System.out.println("Yanlış məhsul seçimi");
			}
		}
    }
}
