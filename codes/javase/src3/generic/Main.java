package generic;

public class Main {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Box: " + intBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Salam");
        System.out.println("String Box: " + stringBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(15.75);
        System.out.println("Double Box: " + doubleBox.getValue());

        intBox.printType(50);
        stringBox.printType("Java Generics");
        doubleBox.printType(3.14);
    }
}

