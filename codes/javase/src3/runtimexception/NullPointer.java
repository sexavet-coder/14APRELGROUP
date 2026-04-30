package runtimexception;

public class NullPointer {
    public static void main(String[] args) {

        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku işe düşdü");
        }

    }
}
