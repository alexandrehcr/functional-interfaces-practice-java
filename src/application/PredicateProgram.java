package Application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PredicateProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Smart TV", 590.00));
        products.add(new Product("Notebook", 1900.00));
        products.add(new Product("Keyboard", 140.00));
        products.add(new Product("Mouse", 80.00));
        products.add(new Product("Air Conditioning", 770.00));
        products.add(new Product("Electric Guitar", 650.00));

        double valueThreshold = 600.0;

        // Predicate as lambda expression
        products.removeIf(p -> p.getPrice() <= valueThreshold);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
