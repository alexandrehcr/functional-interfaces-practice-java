package Application;

import entities.Product;
import util.ProdPriceUpdateConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConsumerProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Smart TV", 590.00));
        products.add(new Product("Notebook", 1900.00));
        products.add(new Product("Keyboard", 140.00));
        products.add(new Product("Mouse", 80.00));
        products.add(new Product("Air Conditioning", 770.00));
        products.add(new Product("Electric Guitar", 650.00));

        // Updates each Product price to 1.1x using a static method reference
        products.forEach(Product::staticPriceUpdateConsumer);

        // Print the list with forEach() instead of enhanced for.
        products.forEach(System.out::println);
    }
}
