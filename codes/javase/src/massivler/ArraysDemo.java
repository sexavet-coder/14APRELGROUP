package massivler;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 7, 20, 3};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Cem: " + sum);

        double average = (double) sum / numbers.length;
        System.out.println("Ededi ortasi: " + average);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("En kicik element: " + min);

        System.out.print("Tek elementler: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}

