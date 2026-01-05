package mainmethods;

public class MainApp {
    public static void main(String[] args) {

        Methods m = new Methods();

        int kv = m.kvadrat(5);
        System.out.println("Kvadrat: " + kv);

        int max = Methods.maxNumber(15, 7);
        System.out.println("En boyuk eded: " + max);

        boolean tekdir = m.isOdd(9);
        System.out.println("Tekdir? " + tekdir);
    }
}
