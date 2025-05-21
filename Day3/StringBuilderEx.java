package Day3;
import java.util.Scanner;

public class StringBuilderEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a StringBuilder from the input
        StringBuilder sb = new StringBuilder(input);

        // 1. Append text
        sb.append(" is learning Java.");
        System.out.println("After append: " + sb);

        // 2. Insert text at a specific index
        sb.insert(0, "Hello, ");
        System.out.println("After insert: " + sb);

        // 3. Replace a portion of text
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // 4. Delete part of the text
        sb.delete(0, 3);
        System.out.println("After delete: " + sb);

        // 5. Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        scanner.close();
    }
}

    

