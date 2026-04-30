package saysistemleri;

import java.util.Scanner;

public class SaySistemleriCevirme {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Binary (2-lik) bir ədəd daxil edin: ");
        
        String binaryInput = scanner.nextLine();
        
        try {
            int decimalFromBinary = Integer.parseInt(binaryInput, 2);
            
            System.out.println("Onluq qarşılığı: " + decimalFromBinary);
            
        } catch (NumberFormatException e) {
        	
            System.out.println("Xəta: Yanlış binary formatı!");
            
        }

        System.out.println("---");

        System.out.print("Hexadecimal (16-lıq) bir ədəd daxil edin: ");
        
        String hexInput = scanner.nextLine();
        
        try {
            int decimalFromHex = Integer.parseInt(hexInput, 16);
            
            System.out.println("Onluq qarşılığı: " + decimalFromHex);
            
        } catch (NumberFormatException e) {
        	
            System.out.println("Xəta: Yanlış hexadecimal formatı!");
        }

        scanner.close();
    }
}
