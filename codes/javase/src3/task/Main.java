package task;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();

        try {
            example.bolme(10, 0);
        } catch (CustomException e) {
            System.out.println("Tutulan xəta: " + e.getMessage());
        } finally {
            System.out.println("Əməliyyat başa çatdı.");
        }
    }
}