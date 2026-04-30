package runtimexception;

public class ClassCast {
    public static void main(String[] args) {

        Object o = "Java";

        try {
            Integer i = (Integer) o;
            System.out.println(i);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku ise dusdu");
        }

    }
}
