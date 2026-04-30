package saysistemi;

import java.util.Scanner;
//Scanner istifadəçidən məlumat almaq üçün

public class BitwiseOperations {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     // Scanner yaradılır

     System.out.print("Birinci tam ədəd daxil edin: ");
     int a = sc.nextInt();
     // Birinci ədəd alınır

     System.out.print("İkinci tam ədəd daxil edin: ");
     int b = sc.nextInt();
     // İkinci ədəd alınır

     int andResult = a & b;
     // AND (&) əməliyyatı
     // Hər iki bit 1 olduqda nəticə 1 olur

     int orResult = a | b;
     // OR (|) əməliyyatı
     // Bitlərdən biri 1 olarsa nəticə 1 olur

     int xorResult = a ^ b;
     // XOR (^) əməliyyatı
     // Bitlər fərqli olarsa nəticə 1 olur

     System.out.println("AND (&): " + andResult);
     // AND nəticəsi çap edilir

     System.out.println("OR (|): " + orResult);
     // OR nəticəsi çap edilir

     System.out.println("XOR (^): " + xorResult);
     // XOR nəticəsi çap edilir



     System.out.print("\nBir ədəd daxil edin (n): ");
     int n = sc.nextInt();
     // Shift üçün əsas ədəd alınır

     System.out.print("Shift miqdarı daxil edin (m): ");
     int m = sc.nextInt();
     // Neçə dəfə shift ediləcəyi alınır

     int leftShift = n << m;
     // Sol shift (<<)
     // Ədədi sola sürüşdürür (2^m ilə vurmağa bərabər)

     int rightShift = n >> m;
     // Sağ shift (>>)
     // Ədədi sağa sürüşdürür (2^m ilə bölməyə bərabər)

     System.out.println("n << m (Sol shift): " + leftShift);
     // Sol shift nəticəsi

     System.out.println("n >> m (Sağ shift): " + rightShift);
     // Sağ shift nəticəsi

     sc.close();
     // Scanner bağlanır
 }
}
