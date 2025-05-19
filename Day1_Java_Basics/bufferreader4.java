package Day1_Java_Basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferreader4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();  // reads a line (string)

        System.out.print("Enter your age: ");
        String ageInput = reader.readLine(); // reads input as String
        int age = Integer.parseInt(ageInput); // convert String to int

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
    
}
