package set;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        String text = "hello world";

        Set<Character> set = new HashSet<>();

        for (char ch : text.toCharArray()) {

            if (Character.isLetter(ch)) {
                set.add(ch);
            }
        }

        System.out.println("Fərqli hərflər: " + set);
        System.out.println("Fərqli hərflərin sayı: " + set.size());
    }
}
