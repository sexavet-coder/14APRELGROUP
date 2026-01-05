package task12;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("10 tam eded daxil edin:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Massiv: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Artan sirada sort olunmus massiv: " + Arrays.toString(arr));

        int[] newArr = Arrays.copyOf(arr, 5);
        System.out.println("Ilk 5 elementden yaranan yeni massiv: " + Arrays.toString(newArr));

        Arrays.fill(newArr, 7);
        System.out.println("7 ile doldurulmus yeni massiv: " + Arrays.toString(newArr));

        boolean equal = Arrays.equals(arr, newArr);
        System.out.println("Iki massiv beraberdir? " + equal);

        System.out.print("Axtarmaq istediyiniz elementi daxil edin: ");
        int target = scanner.nextInt();

        int index = Arrays.binarySearch(arr, target);
        if (index >= 0) {
            System.out.println("Bu element massivde var");
        } else {
            System.out.println("Bu element massivde yoxdur");
        }

        scanner.close();
    }
}
