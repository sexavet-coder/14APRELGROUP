package sexavet;

class Person {
    int id;
    String name;
    String surname;
    int age;
    String phone;
}

public class ClassAndObjectHome {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.id = 11;
        p1.name = "Sahil";
        p1.surname = "Hasanov";
        p1.age = 20;
        p1.phone = "0501112233";

        Person p2 = new Person();
        p2.id = 12;
        p2.name = "Leman";
        p2.surname = "Qurbanova";
        p2.age = 19;
        p2.phone = "0559998877";

        System.out.println("Person 1: " + p1.id + " " + p1.name + " " + p1.surname + " " + p1.age + " " + p1.phone);
        System.out.println("Person 2: " + p2.id + " " + p2.name + " " + p2.surname + " " + p2.age + " " + p2.phone);
    }
}