package runtimexception;

public class NegativeArray {
    public static void main(String[] args) {

        try {
            int[] arr = new int[-4];
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku ise dusdu");
        }

    }
}

