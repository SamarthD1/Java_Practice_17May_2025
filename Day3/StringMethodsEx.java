package Day3;
import java.util.Scanner;

public class StringMethodsEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // 1. length()
        System.out.println("Length of the string: " + str.length());

        // 2. charAt()
        System.out.print("Enter index to fetch character (0 to " + (str.length() - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } else {
            System.out.println("Invalid index!");
        }

        scanner.nextLine(); // Clear input buffer

        // 3. substring()
        System.out.print("Enter starting index for substring: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending index for substring: ");
        int end = scanner.nextInt();
        if (start >= 0 && end <= str.length() && start < end) {
            String substr = str.substring(start, end);
            System.out.println("Substring from index " + start + " to " + end + ": " + substr);
        } else {
            System.out.println("Invalid range for substring.");
        }

        scanner.nextLine(); // Clear buffer

        // 4. equals()
        System.out.print("Enter another string to compare: ");
        String compareStr = scanner.nextLine();
        if (str.equals(compareStr)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // 5. split()
        System.out.println("Splitting the string by spaces:");
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }

        scanner.close();
    }
}

    
