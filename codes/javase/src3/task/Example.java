package task;

public class Example {
    public void bolme(int a, int b) {
        if (b == 0) {
            throw new CustomException("Xəta: Sıfıra bölmək olmaz!");
        }
        System.out.println("Nəticə: " + (a / b));
    }
}