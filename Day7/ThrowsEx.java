package Day7;

import java.io.*;

public class ThrowsEx {
    public static void main(String[] args) {
        try 
        {
            readFile("nonexistent.txt");
        } 
        catch (IOException e) 
        {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // Method declares it might throw IOException
    static void readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName); // May throw FileNotFoundException
        System.out.println("File opened successfully.");
    }
}

