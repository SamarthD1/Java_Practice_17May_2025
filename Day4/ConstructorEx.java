package Day4;

// class named Car
class Car {
    // Fields (attributes)
    String brand;
    String color;
    int year;

    // Constructor to initialize the fields
    Car(String b, String c, int y) {
        brand = b;
        color = c;
        year = y;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

// Main class to run the program
public class ConstructorEx {
    public static void main(String[] args) {
        // Create objects using the constructor
        Car car1 = new Car("Toyota", "Red", 2020);
        Car car2 = new Car("Honda", "Blue", 2022);

        // Display details
        car1.displayDetails();
        car2.displayDetails();
    }
}
