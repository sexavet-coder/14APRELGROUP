package sexavet;

import java.util.Scanner;

public class Sert3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Riyaziyyat balını daxil edin: ");
        int math = input.nextInt();

        System.out.print("Fizika balını daxil edin: ");
        int physics = input.nextInt();

        if (math >= 60 && physics >= 70) {
            System.out.println("Hər iki dərsdən keçdiniz");
        } else if (math < 60 && physics < 70) {
            System.out.println("Hər iki dərsdən kəsildiniz");
        } else {
            System.out.println("Bir fənndən uğurla keçdiniz, digər fənndən isə kəsildiniz");
        }
    }
}