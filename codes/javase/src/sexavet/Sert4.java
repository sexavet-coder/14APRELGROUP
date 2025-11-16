package sexavet;

import java.util.Scanner;

public class Sert4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Həftənin gününü daxil edin: ");
			String day = input.nextLine();

			if (day.equalsIgnoreCase("Şənbə") || day.equalsIgnoreCase("Bazar")) {
			    System.out.println("Həftə sonu");
			} else if (day.equalsIgnoreCase("Bazar ertəsi") || day.equalsIgnoreCase("Cümə")) {
			    System.out.println("Həfətnin başlanğıcı və ya sonu");
			} else {
			    System.out.println("Həftə içi");
			}
		}
    }
}
