package Day8;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        //Widening (Implicit)
        int myInt = 100;
        double myDouble = myInt;  // int to double
        System.out.println("Widening Casting:");
        System.out.println("Original int: " + myInt);
        System.out.println("Converted to double: " + myDouble);

        // Narrowing (Explicit)
        double anotherDouble = 99.99;
        int castedInt = (int) anotherDouble;  // double to int
        System.out.println("\nNarrowing Casting:");
        System.out.println("Original double: " + anotherDouble);
        System.out.println("Converted to int (truncated): " + castedInt);

        // More Examples
        long myLong = 100000L;
        float myFloat = myLong;  // widening
        System.out.println("\nLong to Float: " + myFloat);

        float bigFloat = 123.456f;
        short myShort = (short) bigFloat;  // narrowing
        System.out.println("Float to Short (narrowing): " + myShort);

        char myChar = 'A'; // 65
        int charToInt = myChar;  // widening
        System.out.println("\nChar to Int: " + charToInt);

        int intToChar = 66;
        char newChar = (char) intToChar; // narrowing (int to char)
        System.out.println("Int to Char: " + newChar);
    }
}

