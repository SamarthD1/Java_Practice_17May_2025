package Day6;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque of integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements at the front and rear
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);

        // deque
        System.out.println("Deque elements: " + deque);

        // Peek at both ends
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());

        // Remove from both ends
        deque.removeFirst();  // removes 5
        deque.removeLast();   // removes 25

        // deque after removals
        System.out.println("Deque after removals: " + deque);

        // Check if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}

