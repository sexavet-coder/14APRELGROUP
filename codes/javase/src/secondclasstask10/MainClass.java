package secondclasstask10;

public class MainClass {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int result1 = f.calculateFactorial(5);
        System.out.println("5! = " + result1);
        int result2 = f.calculateFactorial(7);
        System.out.println("7! = " + result2);
    }
}

