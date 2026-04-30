package collaps;

public class main {

    public static void main(String[] args) {
        long number = 913191319131445569L;
        long n = number;
        int steps = 0;

        while (n != 1) {

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }

        System.out.println("Başlanğıc ədəd: " + number);
        System.out.println("1-ə çatmaq üçün addımlar sayı: " + steps);
    }
}
