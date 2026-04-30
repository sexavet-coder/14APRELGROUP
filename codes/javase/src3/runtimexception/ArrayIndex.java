package runtimexception;

public class ArrayIndex {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally bloku ise dusdu");
        }

    }
}

