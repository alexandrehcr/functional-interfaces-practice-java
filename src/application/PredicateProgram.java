package Application;

import entities.Product;
import util.ProdPredicate;

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

        // the ProdPredicate test() method returns true if the prod. price is >= 600.00;
        products.removeIf(new ProdPredicate());

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
