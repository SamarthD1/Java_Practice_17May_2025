package Day1_Java_Basics;

public class Operators2 {

    public static void main(String[] args) {
        
        int a= 10;
        int b= 20;

        // Arithmatic Operators

        System.out.println("a + b = "+(a+b)); //addition
        System.out.println("a - b = "+(a-b)); //subtraction
        System.out.println("a * b = "+(a*b)); //multipication
        System.out.println("a / b = "+(a/b)); //division
        System.out.println("a % b = "+(a%b)); //modulus

        // Comparison Operators
        System.out.println("a > b => "+(a>b)); //greater than
        System.out.println("a < b => "+(a<b)); //less than
        System.out.println("a == b => "+(a==b)); //equal to
        System.out.println("a != b => "+(a!=b)); //Not equal to
        System.out.println("a >= b => "+(a>=b)); //greater than equal to
        System.out.println("a <= b => "+(a<=b)); //less than equal to

        // Logical operators
        boolean result1 = (a > 5) && (b < 5);  // true if both conditions true
        boolean result2 = (a < 5) || (b < 5);  // true if any condition true
        boolean result3 = !(a == b);            // true if a != b

        System.out.println("(a > 5) && (b < 5) => " + result1);
        System.out.println("(a < 5) || (b < 5) => " + result2);
        System.out.println("!(a == b) => " + result3);

    }
    
}
