package Day3;
import java.util.Scanner;

public class ArrayStringEx {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1D Array: Storing and printing numbers
        System.out.print("Enter the size of the 1D array: ");
        int size = scanner.nextInt();
        int[] oneDArray = new int[size];

        System.out.println("Enter " + size + " elements for the 1D array:");
        for (int i = 0; i < size; i++) {
            oneDArray[i] = scanner.nextInt();
        }

        System.out.println("1D Array Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println("\n");

        // 2D Array: Matrix input and output
        System.out.print("Enter number of rows for 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for 2D array: ");
        int cols = scanner.nextInt();

        int[][] twoDArray = new int[rows][cols];
        System.out.println("Enter elements for the 2D array (matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // String operations
        scanner.nextLine(); 
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("You entered: " + inputString);
        System.out.println("Length: " + inputString.length());
        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Reversed: " + new StringBuilder(inputString).reverse());

        scanner.close();
    }
}

    

