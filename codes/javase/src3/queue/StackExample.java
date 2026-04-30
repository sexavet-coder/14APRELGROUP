package queue;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Ali");
        stack.push("Veli");
        stack.push("Aysel");

        System.out.println("Stack: " + stack);

        System.out.println("Ən son əlavə edilən element: " + stack.peek());
    }
}

