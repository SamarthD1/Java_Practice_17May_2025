package Day6;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");

        //adding a duplicate element
        boolean isAdded = fruits.add("Apple");  // Will not be added again
        System.out.println("Trying to add duplicate 'Apple': " + isAdded);

        // Display the HashSet
        System.out.println("Fruits in HashSet: " + fruits);

        // Checking if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        // Remove an element
        fruits.remove("Mango");
        System.out.println("After removing 'Mango': " + fruits);

        // Iterate through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

