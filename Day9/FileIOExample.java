package Day9;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // 1. Writing to file using PrintWriter
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Hello, Java!");
            writer.println("This is a line.");
            writer.println("This is another line.");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 2. Reading from file using BufferedReader
        System.out.println("\nReading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
