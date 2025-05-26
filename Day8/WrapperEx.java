package Day8;

public class WrapperEx {
    public static void main(String[] args) {

        // Wrapper Classes 
        int primitiveInt = 10;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Explicit wrapping
        System.out.println("Wrapped Integer: " + wrappedInt);

        //Autoboxing
        Integer autoBoxedInt = primitiveInt; // Java does this automatically
        System.out.println("Autoboxed Integer: " + autoBoxedInt);

        //Unboxing 
        int unboxedInt = wrappedInt; // Automatically converts to primitive
        System.out.println("Unboxed Integer: " + unboxedInt);

        //Type Casting (Widening and Narrowing) 
        double myDouble = 9.78;
        int castedInt = (int) myDouble; // Narrowing casting (manual)
        System.out.println("Double: " + myDouble);
        System.out.println("Casted to int: " + castedInt);

        int myInt = 100;
        double widenedDouble = myInt; // Widening casting (automatic)
        System.out.println("Int: " + myInt);
        System.out.println("Widened to double: " + widenedDouble);

        //Wrapper Classes for other primitives 
        Double wrappedDouble = 45.67; // Autoboxing
        Character wrappedChar = 'A';  // Autoboxing

        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);
    }
}

