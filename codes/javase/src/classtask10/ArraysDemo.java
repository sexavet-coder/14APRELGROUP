package classtask10;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 18;

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        System.out.println("Massivin elementlərinin cəmi: " + sum);
    }
}}

