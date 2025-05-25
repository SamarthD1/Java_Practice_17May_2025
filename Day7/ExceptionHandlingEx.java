package Day7;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        
        try {
            //code that may cause an exception
            int result = numbers[5]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Number at index 5 is: " + result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e);
        } 
        finally {
            // This block always runs
            System.out.println("Finally block executed.");
        }
        
        System.out.println("Program continues after try-catch-finally block.");
    }
}
