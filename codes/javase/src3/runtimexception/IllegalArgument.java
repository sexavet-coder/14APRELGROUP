package runtimexception;

public class IllegalArgument {
    public static void main(String[] args) {

        try {
            Thread t = new Thread();
            t.setPriority(20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku ise dusdu");
        }

    }
}

