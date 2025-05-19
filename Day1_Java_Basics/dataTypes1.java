package Day1_Java_Basics;

public class dataTypes1 {

    public static void main(String[] args) {
        
        // int used for whole numbers. size: 4 bytes
        int age = 20;

        // long is used for large whole numbers. size: 8 bytes
        // always use L at the end of the number (long)
        long num1 = 987654321L;

        // double is used for decimal numbers. size: 8 bytes
        double num2 = 22.22;

        // char is used for storing single character (stores Unicode characters)
        char grade = 'A';

        // boolean is used to store boolean values like true and false. size: 1 bit.
        boolean learning = true;

        // print statements 
        System.out.println("age : "+age);
        System.out.println("long : "+num1);
        System.out.println("double : "+num2);
        System.out.println("grade : "+grade);
        System.out.println("learning : "+learning);

    }
    
}
