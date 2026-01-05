package task10;

public class MainClass {
    public static void main(String[] args) {

        // Circle obyektini yaratmaq
        Circle circle = new Circle();
        circle.radius = 5;

        // Calculator obyektini yaratmaq
        Calculator calculator = new Calculator();

        // metodu çagirib circle obyektini gondermek
        calculator.calculateCircleLength(circle);

        // neticei cap etmek
        System.out.println("Dairənin uzunluğu: " + circle.length);
    }
}
