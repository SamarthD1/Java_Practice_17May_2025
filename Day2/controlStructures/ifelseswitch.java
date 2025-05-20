package Day2.controlStructures;
import java.util.Scanner;

public class ifelseswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
        
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
            return;
        }

        // switch block to give message based on grade
        switch (grade) {
            case 'A':
                System.out.println("Excellent! You got an A.");
                break;
            case 'B':
                System.out.println("Good job! You got a B.");
                break;
            case 'C':
                System.out.println("You passed with a C.");
                break;
            case 'D':
                System.out.println("You got a D. Try to improve.");
                break;
            case 'F':
                System.out.println("Unfortunately, you failed. Keep working hard!");
                break;
            default:
                System.out.println("Something went wrong.");
        }

        scanner.close();
    }
}

    
