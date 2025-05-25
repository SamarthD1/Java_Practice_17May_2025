package Day7;

public class ThrowEx {
    public static void main(String[] args) 
    {
        int age = 15;
        try {
            checkAge(age); // call method that may throw exception
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static void checkAge(int age) 
    {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } 
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
