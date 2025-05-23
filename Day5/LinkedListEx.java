package Day5;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        // 1. Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2. Adding elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // 3. Adding elements at the beginning and end
        list.addFirst("Start");
        list.addLast("End");

        // 4. Display the list
        System.out.println("LinkedList: " + list);

        // 5. Accessing elements
        String first = list.getFirst();
        String last = list.getLast();
        String atIndex2 = list.get(2);
        System.out.println("First: " + first + ", Last: " + last + ", Index 2: " + atIndex2);

        // 6. Updating an element
        list.set(2, "Z");
        System.out.println("After update at index 2: " + list);

        // 7. Removing elements
        list.removeFirst(); // removes "Start"
        list.removeLast();  // removes "End"
        list.remove(2);     // removes element at index 2
        System.out.println("After removals: " + list);

        // 8. Checking if list contains an element
        boolean containsB = list.contains("B");
        System.out.println("Contains 'B'? " + containsB);

        // 9. Iterating through the list
        System.out.print("Iterating using loop: ");
        for (String item : list) {
            System.out.print(item + " ");
        }

        // 10. Size and clearing
        System.out.println("\nSize of the LinkedList: " + list.size());
        list.clear();
        System.out.println("LinkedList after clearing: " + list);
    }
}
