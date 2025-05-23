package Day5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEX {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Adding at a specific index
        list.add(2, 25);  // Insert 25 at index 2

        //Display the list
        System.out.println("ArrayList: " + list);

        // Accessing elements
        int element = list.get(3);  // Get element at index 3
        System.out.println("Element at index 3: " + element);

        // Updating elements
        list.set(1, 50);  // Replace element at index 1 with 50
        System.out.println("After update: " + list);

        // Removing elements
        list.remove(2);  // Remove element at index 2
        System.out.println("After removal: " + list);

        // Searching for an element
        boolean contains = list.contains(30);
        System.out.println("Contains 30? " + contains);

        // Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        // Iterating over elements
        System.out.print("Iterating using loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        //  Size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + list.size());

        // Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
