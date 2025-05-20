package Day2.JavaFunctions;

public class FunctionEx {

        // Method with parameter and return value (boolean)
        public static boolean isEven(int number) {
            return number % 2 == 0;
        }
    
        // Method with parameter and return value (String)
        public static String describeNumber(int number) {
            if (isEven(number)) {
                return number + " is Even.";
            } else {
                return number + " is Odd.";
            }
        }
    
        public static void main(String[] args) {
            int num = 7;
    
            // Calling method and printing result
            String result = describeNumber(num);
            System.out.println(result);
        }
    }
    
    

