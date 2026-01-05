package string;

public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(-50);
        bank.setBalance(200);
        System.out.println("Cari balans: " + bank.getBalance());
    }
}

