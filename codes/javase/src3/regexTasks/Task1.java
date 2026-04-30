package regexTasks;
// Bu class regexTasks paketində yerləşir

import java.util.Scanner;
// Scanner istifadəçidən məlumat almaq üçün

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // İstifadəçidən məlumat almaq üçün Scanner yaradılır

        System.out.print("String daxil edin: ");
        String input = sc.nextLine();
        // İstifadəçidən string alınır

        boolean onlyDigits = input.matches("\\d+");
        // matches() → regex uyğunluğunu yoxlayır
        // \\d → rəqəm (0-9)
        // + → ən azı 1 və ya daha çox rəqəm
        // Yəni string yalnız rəqəmlərdən ibarət olmalıdır

        System.out.println(onlyDigits);
        // Nəticəni çap edir (true və ya false)

        sc.close();
        // Scanner bağlanır
    }
}