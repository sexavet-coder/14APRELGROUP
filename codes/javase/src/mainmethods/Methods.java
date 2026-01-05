package mainmethods;

public class Methods {

    public int kvadrat(int a) {
        return a * a;
    }

    public static int maxNumber(int a, int b) {
        if (a > b) {
            return a;
        } 
        return b;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
