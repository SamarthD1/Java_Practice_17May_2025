package Day4;

// Utility class with a static method
class Utility {
    static void printWelcome() {
        System.out.println("Welcome to the Car System!");
    }
}

// Car class with a static variable and instance method
class Car4 {
    static int numberOfWheels = 4; // Static variable shared across all cars
    String brand;

    Car4(String brand) {
        this.brand = brand;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + numberOfWheels);
        System.out.println();
    }
}

// Main class
public class StaticEx {
    public static void main(String[] args) {
        // Calling static method without creating object
        Utility.printWelcome();

        // Creating objects
        Car4 car1 = new Car4("Toyota");
        Car4 car2 = new Car4("Honda");

        // Display car details
        car1.displayInfo();
        car2.displayInfo();

        // Changing static variable using class name
        Car4.numberOfWheels = 6;

        // Checking the effect on both objects
        car1.displayInfo(); // Wheels: 6
        car2.displayInfo(); // Wheels: 6
    }
}
