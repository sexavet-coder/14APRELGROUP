package runtimexception;


public class Number {
    public static void main(String[] args) {

        String s = "123a";

        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku ise dusdu");
        }

    }
}