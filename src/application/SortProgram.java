package application;

import entities.Product;

import java.util.*;

public class SortProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Smart TV", 590.00));
        products.add(new Product("Notebook", 1900.00));
        products.add(new Product("Keyboard", 140.00));
        products.add(new Product("Mouse", 80.00));
        products.add(new Product("Air Conditioning", 770.00));
        products.add(new Product("Electric Guitar", 650.00));


        System.out.println("====== BEFORE SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }

        // Lambda is implicitly passed to the compare() method of the Comparator, since it's a functional interface.
        products.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        System.out.println();
        System.out.println("====== AFTER NAME SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }

        products.sort((p1, p2) -> - p1.getPrice().compareTo(p2.getPrice()));

        System.out.println();
        System.out.println("====== AFTER DESC. PRICE SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
