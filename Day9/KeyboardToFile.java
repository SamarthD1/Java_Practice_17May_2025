package Day9;

import java.io.*;
import java.util.Scanner;

public class KeyboardToFile {
    public static void main(String[] args) {
        String fileName = "user_input.txt";

        try (
            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(new FileWriter(fileName))
        ) {
            System.out.println("Enter lines of text (type 'exit' to stop):");

            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;  // stop input loop
                }
                writer.println(line); // write line to file
            }
            
            System.out.println("Your input has been saved to " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

