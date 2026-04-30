package lambda;

public class Main {

    public static void main(String[] args) {

        Square square = (number) -> number * number;

        int result = square.calculate(5);

        System.out.println("Kvadrat: " + result);

    }
}