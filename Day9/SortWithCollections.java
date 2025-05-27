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

public class SortWithCollections {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(3, "Laptop", 1200.99));
        productList.add(new Product(1, "Phone", 799.49));
        productList.add(new Product(2, "Tablet", 499.99));

        // Sort by price (ascending)
        Collections.sort(productList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Sorted by Price:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
