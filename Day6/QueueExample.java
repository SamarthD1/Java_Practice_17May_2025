package Day6;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue of strings
        Queue<String> customers = new LinkedList<>();

        // Adding elements to the queue
        customers.add("Raj");
        customers.add("Ram");
        customers.add("Rohan");
        customers.add("Ravi");

        // Display the queue
        System.out.println("Customer queue: " + customers);

        // Peek at the front of the queue
        System.out.println("First customer (peek): " + customers.peek());

        // Remove an element (serve the first customer)
        String served = customers.poll();
        System.out.println("Served customer (poll): " + served);

        // Display the queue after removing
        System.out.println("Queue after serving one: " + customers);

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + customers.isEmpty());
    }
}
