package task10;

public class Calculator {

    public void calculateCircleLength(Circle c) {
        double result = 2 * Math.PI * c.radius;
        c.length = result;
    }
}
