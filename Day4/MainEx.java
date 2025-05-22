package Day4;

//class named Car
class Car {
    // Fields (also called attributes or properties)
    String brand;
    String color;
    int year;

    // Method (behavior of the object)
    void startEngine() {
        System.out.println(brand + " engine started.");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Main class to run the program
public class MainEx {
    public static void main(String[] args) {
        //object of the Car class
        Car car1 = new Car();

        // Set values to the object's fields
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.year = 2020;

        // Calling methods using the object
        car1.startEngine();
        car1.displayDetails();

        // Created another object
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.year = 2022;

        car2.startEngine();
        car2.displayDetails();
    }
}

    

