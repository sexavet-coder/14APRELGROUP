package saysistemi;

import java.util.Scanner;
//Scanner istifadəçidən ədəd almaq üçün

public class NumberSystems1 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     // Scanner yaradılır

     System.out.print("Onluq ədəd daxil edin: ");
     int number = sc.nextInt();
     // İstifadəçidən decimal ədəd alınır

     String binary = Integer.toBinaryString(number);
     // Decimal → Binary çevirir

     String octal = Integer.toOctalString(number);
     // Decimal → Octal çevirir

     String hex = Integer.toHexString(number);
     // Decimal → Hexadecimal çevirir

     hex = hex.toUpperCase();
     // Hex nəticəni böyük hərflə edir (A,B,C...)

     System.out.println("Binary: " + binary);
     // Binary nəticəni çap edir

     System.out.println("Octal: " + octal);
     // Octal nəticəni çap edir

     System.out.println("Hexadecimal: " + hex);
     // Hex nəticəni çap edir

     sc.close();
     // Scanner bağlanır
 }
}
