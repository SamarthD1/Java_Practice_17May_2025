package Day6;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        //add duplicate
        boolean added = numbers.add(20);  // Duplicate won't be added
        System.out.println("Trying to add duplicate '20': " + added);

        // Display the TreeSet (sorted order)
        System.out.println("TreeSet elements: " + numbers);

        // Remove an element
        numbers.remove(40);
        System.out.println("After removing 40: " + numbers);

        // Checking if a number exists
        if (numbers.contains(10)) {
            System.out.println("10 is present in the set.");
        }

        // Iterate over elements
        System.out.println("Iterating over TreeSet:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
