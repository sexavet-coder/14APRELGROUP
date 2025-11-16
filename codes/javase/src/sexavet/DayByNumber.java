package sexavet;

import java.util.Scanner;

public class DayByNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Gün nömrəsini daxil edin (1-7): ");
			int dayNum = input.nextInt();

			switch(dayNum) {
			    case 1: System.out.println("Bazar ertəsi"); break;
			    case 2: System.out.println("Çərşənbə axşamı"); break;
			    case 3: System.out.println("Çərşənbə"); break;
			    case 4: System.out.println("Cümə axşamı"); break;
			    case 5: System.out.println("Cümə"); break;
			    case 6: System.out.println("Şənbə"); break;
			    case 7: System.out.println("Bazar"); break;
			    default: System.out.println("Yanlış gün nömrəsi");
			}
		}
    }
}