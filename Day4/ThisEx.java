package Day4;

class Car3 {
    String brand;
    String color;
    int year;

    // Constructor using 'this' to avoid name conflict
    Car3(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
        System.out.println();
    }
}

public class ThisEx {
    public static void main(String[] args) {
        Car3 car1 = new Car3("Toyota", "Red", 2020);
        car1.displayDetails();
    }
}

