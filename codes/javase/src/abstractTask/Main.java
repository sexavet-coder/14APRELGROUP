package abstractTask;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal lion = new Lion();

        cat.makeNoise();
        dog.makeNoise();
        lion.makeNoise();
    }
}
