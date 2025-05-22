package Day4;

class Car {
    public String brand;        // Accessible everywhere
    private String engineNumber; // Accessible only within this class
    protected int year;         // Accessible within same package or subclasses
    String color;               // Default access (package-private)

    // Constructor
    public Car(String brand, String engineNumber, int year, String color) {
        this.brand = brand;
        this.engineNumber = engineNumber;
        this.year = year;
        this.color = color;
    }

    // Public method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Engine Number: " + engineNumber);
    }

    // Private method - can only be called inside this class
    private void startEngine() {
        System.out.println("Engine started!");
    }

    public void useStartEngine() {
        startEngine(); // Valid: private method accessed inside class
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "ENG1234", 2020, "Red");

        System.out.println(car.brand); // public 
        System.out.println(car.year);  // protected  (in same package)
        System.out.println(car.color); // default  (in same package)

        // System.out.println(car.engineNumber); //  private - compilation error

        car.displayInfo();     //  public method
        car.useStartEngine();  //  indirect access to private method
    }
}
