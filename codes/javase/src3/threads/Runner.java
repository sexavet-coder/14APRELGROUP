package threads;

public class Runner {
    public static void main(String[] args) {
        CounterThread countTask = new CounterThread();
        AlphabetThread alphaTask = new AlphabetThread();

        countTask.start();
        alphaTask.start();
    }
}
