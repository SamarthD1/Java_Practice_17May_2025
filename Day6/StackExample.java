package Day6;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack of Strings
        Stack<String> books = new Stack<>();

        // Pushing elements onto the stack
        books.push("Harry Potter");
        books.push("The Hobbit");
        books.push("Percy Jackson");
        books.push("Mind Games");

        // Display the stack
        System.out.println("Books stack: " + books);

        // Peek at the top element
        System.out.println("Top book (peek): " + books.peek());

        // Pop an element
        String removedBook = books.pop();
        System.out.println("Removed top book (pop): " + removedBook);

        // Display the stack after popping
        System.out.println("Books stack after pop: " + books);

        // Search for an element
        int position = books.search("The Hobbit"); // position from top (1-based)
        if (position != -1) {
            System.out.println("'The Hobbit' is at position: " + position + " from the top.");
        } else {
            System.out.println("'The Hobbit' not found.");
        }

        // Checking if stack is empty
        System.out.println("Is stack empty? " + books.isEmpty());
    }
}
