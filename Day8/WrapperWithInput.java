package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User Input and Type Casting
        System.out.print("Enter a decimal number (e.g., 12.34): ");
        double userDouble = scanner.nextDouble();

        // Narrowing casting (manual)
        int castedInt = (int) userDouble;
        System.out.println("Casted to int: " + castedInt);

        // Widening casting (automatic)
        double widenedAgain = castedInt;
        System.out.println("Widened again to double: " + widenedAgain);

        //Wrapper Array
        System.out.print("\nEnter 3 integers: ");
        Integer[] intArray = new Integer[3];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();  // Autoboxing here
        }

        System.out.println("Wrapper Integer Array:");
        for (Integer num : intArray) {
            System.out.println("Unboxed int: " + num);  // Unboxing here
        }

        // Using Wrapper classes in ArrayList
        ArrayList<Double> doubleList = new ArrayList<>();

        System.out.print("\nEnter 3 decimal numbers: ");
        for (int i = 0; i < 3; i++) {
            doubleList.add(scanner.nextDouble());  // Autoboxing
        }

        System.out.println("Unboxed values from ArrayList:");
        for (Double val : doubleList) {
            double primitiveVal = val;  // Unboxing
            System.out.println(primitiveVal);
        }

        scanner.close();
    }
}
