package task33;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Ali", 20));
        list.add(new Person("Veli", 18));
        list.add(new Person("Aysel", 25));
        list.add(new Person("Murad", 22));

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age; 
            }
        };

        Collections.sort(list, ageComparator);

        for (Person p : list) {
            System.out.println(p);
        }
    }
}

