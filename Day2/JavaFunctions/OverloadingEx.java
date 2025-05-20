package Day2.JavaFunctions;

public class OverloadingEx {

    public static int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Calling different versions of 'add'
        System.out.println("add(int, int): " + add(5, 10));
        System.out.println("add(double, double): " + add(3.5, 4.2));
        System.out.println("add(int, int, int): " + add(1, 2, 3));
    }
    
}
