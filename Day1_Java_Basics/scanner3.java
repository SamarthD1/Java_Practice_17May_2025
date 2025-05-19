package Day1_Java_Basics;

import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // reads a full line (string)

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();       // reads an integer

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        scanner.close(); // close the scanner

    }
    
}

