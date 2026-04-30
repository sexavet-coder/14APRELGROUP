package set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> group = new HashMap<>();
        group.put("Ali", 10);
        group.put("Veli", 13);
        group.put("Aysel", 12);
        group.put("Mahir", 14);

        System.out.println("Bütün uşaqlar: " + group);

        System.out.println("Yaşı 12-dən böyük uşaqlar:");

        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            if (entry.getValue() > 12) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}

