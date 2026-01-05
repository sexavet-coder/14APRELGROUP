package accesModifiers;

public class ModifiersDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Ali", 20);
        Person p3 = new Person("Veli", 25, "Baku");

        Person.staticCounter = 3;

        p1.publicName = "Default Person";
        p1.defaultCity = "Ganja";

        p1.publicMethod();
        p1.defaultMethod();
        p1.protectedMethod();

        p1.methodWithFinalParam("Salam, ");

        System.out.println("Static counter: " + Person.staticCounter);
    }
}

class Person {
    public String publicName;
    private int privateAge;
    protected double protectedSalary;
    String defaultCity;

    public static int staticCounter = 0;

    public Person() {
        this.publicName = "No name";
        this.privateAge = 0;
        this.protectedSalary = 0.0;
        this.defaultCity = "Unknown";
    }

    private Person(int age) {
        this.publicName = "Only age";
        this.privateAge = age;
        this.protectedSalary = 0.0;
        this.defaultCity = "Unknown";
    }

    protected Person(String name, int age) {
        this.publicName = name;
        this.privateAge = age;
        this.protectedSalary = 500.0;
        this.defaultCity = "Unknown";
    }

    Person(String name, int age, String city) {
        this.publicName = name;
        this.privateAge = age;
        this.protectedSalary = 800.0;
        this.defaultCity = city;
    }

    public void publicMethod() {
        System.out.println("Public method: " + publicName);
    }

    private void privateMethod() {
        System.out.println("Private method: age = " + privateAge);
    }

    protected void protectedMethod() {
        System.out.println("Protected method: salary = " + protectedSalary);
    }

    void defaultMethod() {
        System.out.println("Default method: city = " + defaultCity);
    }

    public void methodWithFinalParam(final String prefix) {
        System.out.println(prefix + publicName);
    }
};
