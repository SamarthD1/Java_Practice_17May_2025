package Day3;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 1. Sum of array elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // 2. Find maximum element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element: " + max);

        // 3. Reverse the array
        System.out.print("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Sort the array
        Arrays.sort(arr);
        System.out.print("Sorted array (ascending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

    
