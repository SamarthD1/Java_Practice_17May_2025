package Day4;

class Car2 {
    String brand;
    String color;
    int year;

    // Default constructor
    Car2() {
        brand = "Unknown";
        color = "Not specified";
        year = 0;
    }

    // Constructor with 1 parameter
    Car2(String b) {
        brand = b;
        color = "Not specified";
        year = 0;
    }

    // Constructor with 2 parameters
    Car2(String b, String c) {
        brand = b;
        color = c;
        year = 0;
    }

    // Constructor with 3 parameters
    Car2(String b, String c, int y) {
        brand = b;
        color = c;
        year = y;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

public class ConstructorEx2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2(); // Default
        Car2 car2 = new Car2("Toyota"); // 1 param
        Car2 car3 = new Car2("Honda", "Blue"); // 2 params
        Car2 car4 = new Car2("Ford", "Black", 2023); // 3 params

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
        car4.displayDetails();
    }
}

