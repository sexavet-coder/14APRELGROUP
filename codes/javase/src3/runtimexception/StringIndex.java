package runtimexception;

public class StringIndex {
    public static void main(String[] args) {

        String s = "Java";

        try {
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku ise dusdu");
        }

    }
}

