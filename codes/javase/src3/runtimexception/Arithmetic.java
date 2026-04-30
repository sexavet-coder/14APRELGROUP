package runtimexception;

public class Arithmetic {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku ise dusdu");
        }

    }
}
