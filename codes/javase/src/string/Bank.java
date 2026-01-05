package string;

public class Bank {
 private double balance;
 public void setBalance(double balance) {
     if (balance < 0) {
         this.balance = 0;
         System.out.println("Balans 0-dan kiçik ola bilməz");

     } else {
         this.balance = balance;
     }
 }
 public double getBalance() {
     return balance;
 }
}
