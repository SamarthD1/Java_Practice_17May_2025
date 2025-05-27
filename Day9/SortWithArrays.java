package Day9;

import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}


public class SortWithArrays {
    public static void main(String[] args) {
        Product[] productArray = {
            new Product(3, "Laptop", 1200.99),
            new Product(1, "Phone", 799.49),
            new Product(2, "Tablet", 499.99)
        };

        // Sort by name (alphabetically)
        Arrays.sort(productArray, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.name.compareTo(p2.name);
            }
        });

        System.out.println("Sorted by Name:");
        for (Product p : productArray) {
            System.out.println(p);
        }
    }
}

