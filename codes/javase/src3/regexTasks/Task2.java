package regexTasks;
// Bu class regexTasks paketində yerləşir

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Scanner yaradılır

        System.out.print("Tarix daxil edin (dd-mm-yyyy): ");
        String date = sc.nextLine();
        // İstifadəçidən tarix alınır

        boolean isValidDate = date.matches(
                "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}"
        );
        // (0[1-9]) → 01-09 günlər
        // ([12][0-9]) → 10-29 günlər
        // (3[01]) → 30-31 günlər
        // (0[1-9]) → 01-09 aylar
        // (1[0-2]) → 10-12 aylar
        // \\d{4} → 4 rəqəmli il
        // Yəni dd-mm-yyyy formatını yoxlayır

        System.out.println(isValidDate);
        // Nəticəni çap edir

        sc.close();
        // Scanner bağlanır
    }
}