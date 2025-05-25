package Day7;

public class CommonExceptionsEx {
    public static void main(String[] args) {
        // Example 1: NullPointerException
        try {
            String str = null; // null reference
            System.out.println(str.length()); // This will throw NullPointerException
        } 
        catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } 
        finally {
            System.out.println("NullPointerException block finished.\n");
        }

        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing index 5: " + arr[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("ArrayIndexOutOfBoundsException block finished.");
        }

        System.out.println("\nProgram ended normally.");
    }
}
