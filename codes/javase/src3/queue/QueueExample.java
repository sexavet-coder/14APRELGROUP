package queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Ali");
        queue.add("Veli");
        queue.add("Aysel");

        System.out.println("Queue: " + queue);

        System.out.println("Ən üstdəki element: " + queue.peek());

        String removedElement = queue.poll();

        System.out.println("Silinən element: " + removedElement);

        System.out.println("Yeni queue: " + queue);
    }
}

