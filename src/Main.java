import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
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

        Collections.sort(products); // sort using Product's implementation of Comparable

        System.out.println();
        System.out.println("====== AFTER DESC. PRICE SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
