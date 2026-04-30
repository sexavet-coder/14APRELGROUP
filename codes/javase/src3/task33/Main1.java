package task33;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir söz daxil edin: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println("Palindrom sözdür.");
        } else {
            System.out.println("Palindrom deyil.");
        }
    }
}
