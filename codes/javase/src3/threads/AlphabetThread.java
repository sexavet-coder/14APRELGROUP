package threads;

public class AlphabetThread extends Thread {
    @Override
    public void run() {
        for (char ch = 'a'; ch <= 'e'; ch++) {
            System.out.println("Hərf: " + ch);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}