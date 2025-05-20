package Day2.controlStructures;

import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

    
        System.out.println("Choose an option:");
        System.out.println("1. Print numbers 1 to 10 using for loop");
        System.out.println("2. Print even numbers up to 20 using while loop");
        System.out.println("3. Countdown from 5 using do-while loop");
        System.out.print("Enter your choice (1-3): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Using for loop:");
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                }
                break;

            case 2:
                System.out.println("Using while loop:");
                int num = 2;
                while (num <= 20) {
                    System.out.print(num + " ");
                    num += 2;
                }
                break;

            case 3:
                System.out.println("Using do-while loop:");
                int count = 5;
                do {
                    System.out.println("Countdown: " + count);
                    count--;
                } while (count > 0);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

    

